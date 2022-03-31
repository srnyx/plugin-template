group = "PATH"
version = "0.0.1"
description = "NAME"

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
//    maven("LINK")
}

dependencies {
//    compileOnly("PATH:NAME:VERSION")
}

tasks {
    shadowJar {
        dependencies {
//            exclude(dependency("org.spigotmc:spigot-api(:1.18.2-R0.1-SNAPSHOT"))
        }
    }

    jar {
        dependsOn("shadowJar")
        isEnabled = false
    }

    // Set UTF-8 as the encoding
    compileJava {
        options.encoding = "UTF-8"
    }

    // Process Placeholders for the plugin.yml
    processResources {
        filesMatching("**/plugin.yml") {
            expand(rootProject.project.properties)
        }
        // Always re-run this task
        outputs.upToDateWhen { false }
    }

    compileJava {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
    }
}