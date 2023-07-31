plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    js(IR) {
        moduleName = "jamshedalamqaderi-portfolio"
        browser()
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
            }
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    val kotlinVersion = project.property("kotlin.version") as String
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=$kotlinVersion")
}

tasks.register<Copy>("copyJsFile") {
    mustRunAfter("jsBrowserDistribution")
    from("$buildDir/compileSync/js/main/productionExecutable/kotlin/")
    into("$buildDir/dist/js/productionExecutable")
}

tasks.register("bundleWebApp") {
    dependsOn("jsBrowserDistribution", "copyJsFile")
}
