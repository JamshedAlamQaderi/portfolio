import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js(IR) {
        moduleName = "jamshedalamqaderi-portfolio"
        browser{
            commonWebpackConfig(Action{
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).copy(

                )
            })
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
                implementation(project(":web-router"))
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
