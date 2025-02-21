plugins {
    id("com.gradle.develocity") version "3.19.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "gradle-build-scan-quickstart"

develocity {
    buildScan {
        tag(if (System.getenv("CI").isNullOrEmpty()) "Local" else "frontend-engineer")
        tag(System.getProperty("os.name"))
    }
}