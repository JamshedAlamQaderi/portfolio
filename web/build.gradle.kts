import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

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
    @Suppress("OPT_IN_USAGE")
    wasm {
        moduleName = "jamshedalamqaderi-portfolio"
        browser {
            commonWebpackConfig(Action {
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).copy(
//                    open = mapOf(
//                        "app" to mapOf(
//                            "name" to "google chrome canary",
//                            "arguments" to listOf("--js-flags=--experimental-wasm-gc ")
//                        )
//                    ),
                    static = (devServer?.static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(project.rootDir.path)
                        add(project.rootDir.path + "/common/")
                        add(project.rootDir.path + "/web/")
                    },
                )
            })
        }
        binaries.executable()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    val composeVersion = project.property("compose.wasm.version") as String
    kotlinCompilerPlugin.set(composeVersion)
    val kotlinVersion = project.property("kotlin.version") as String
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=$kotlinVersion")
}

tasks.register<Copy>("copyMjsFile") {
    mustRunAfter("wasmBrowserDistribution")
    from("$buildDir/compileSync/wasm/main/productionExecutable/kotlin/jamshedalamqaderi-portfolio.uninstantiated.mjs")
    into("$buildDir/dist/wasm/productionExecutable")
}

tasks.register("bundlePortfolio") {
    dependsOn("wasmBrowserDistribution", "copyMjsFile")
}