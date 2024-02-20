plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.lombok") version "1.8.10"
    id("io.freefair.lombok") version "8.4"
    application
}

group = "com.code-catalyst"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.14.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}