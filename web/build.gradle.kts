import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

val decomposeVersion: String by project
val koinComposeVersion: String by project
val koinVersion: String by project
val mokoMvvmVersion: String by project

kotlin {
    js(IR) {
        moduleName = "jamshedalamqaderi-portfolio"
        browser {
            commonWebpackConfig(
                Action {
                    devServer = (devServer ?: KotlinWebpackConfig.DevServer()).copy(
                        static = (devServer?.static ?: mutableListOf()).apply {
                            // Serve sources to debug inside browser
                            add(project.rootDir.path)
                            add(project.rootDir.path + "/web/")
                        },
                    )
                }
            )
        }
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.material3)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)

                implementation("com.arkivanov.decompose:decompose:$decomposeVersion")
                implementation("com.arkivanov.decompose:extensions-compose-jetbrains:$decomposeVersion")

                implementation("io.insert-koin:koin-core:$koinVersion")
                implementation("io.insert-koin:koin-compose:$koinComposeVersion")

                implementation("dev.icerock.moko:mvvm-core:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-compose:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-flow:$mokoMvvmVersion")
                implementation("dev.icerock.moko:mvvm-flow-compose:$mokoMvvmVersion")
            }
        }
    }
}

compose.experimental {
    web.application {}
}

tasks.register<Copy>("copyJsFile") {
    mustRunAfter("jsBrowserDistribution")
    from("$buildDir/compileSync/js/main/productionExecutable/kotlin/")
    into("$buildDir/dist/js/productionExecutable")
}

tasks.register("bundleWebApp") {
    dependsOn("jsBrowserDistribution", "copyJsFile")
}
