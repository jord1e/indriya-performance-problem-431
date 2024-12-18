plugins {
    application
}

group = "nl.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("nl.example.App")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

extra["jsr385Version"] = "2.1"

dependencies {
    implementation("tech.units:indriya:${property("jsr385Version")}")
    implementation("tech.uom.lib:uom-lib-common:${property("jsr385Version")}")
    implementation("tech.uom.lib:uom-lib-jackson:${property("jsr385Version")}")
}
