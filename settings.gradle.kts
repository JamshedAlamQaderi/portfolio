pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        val composeVersion = extra["compose.version"] as String
        val ktlintVersion = extra["ktlintVersion"] as String
        val buildKonfigVersion = extra["buildKonfigVersion"] as String

        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.serialization").version(kotlinVersion)
        id("org.jetbrains.compose").version(composeVersion)
        id("org.jlleitschuh.gradle.ktlint").version(ktlintVersion)
        id("com.codingfeline.buildkonfig").version(buildKonfigVersion)
    }
}
rootProject.name = "portfolio"
include(":web")
