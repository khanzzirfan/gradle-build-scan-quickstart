plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

develocity {
    buildScan {
        tag(if (System.getenv("CI").isNullOrEmpty()) "Local" else "frontend-engineer")
        tag(System.getProperty("os.name"))
    }
}