version = "0.0.1"
group = "xyz.srnyx"

plugins {
    java
    id("com.github.johnrengelman.shadow") version "VERSION" // 7.1.2
}

repositories {
    mavenCentral() // org.spigotmc:spigot-api
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots") // org.spigotmc:spigot-api
    maven("https://jitpack.io") // xyz.srnyx:annoying-api
}

dependencies {
    compileOnly("org.spigotmc", "spigot-api", "1.19.3-R0.1-SNAPSHOT")
	implementation("xyz.srnyx", "annoying-api", "VERSION") // https://srnyx.xyz/api
    compileOnly("org.jetbrains:annotations:23.1.0")
}

tasks {
    // Make 'gradle build' run 'gradle shadowJar'
    build {
        dependsOn("shadowJar")
    }

    // Remove '-all' from the JAR file name and relocate the AnnoyingAPI package
    shadowJar {
        archiveClassifier.set("")
        relocate("xyz.srnyx.annoyingapi", "xyz.srnyx.PACKAGE.annoyingapi")
    }

    // Text encoding
    compileJava {
        options.encoding = "UTF-8"
    }

    // Replace '${name}' and '${version}'
    processResources {
        filesMatching("**/plugin.yml") {
            expand("name" to project.name, "version" to project.version)
        }
    }
}