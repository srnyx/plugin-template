import me.dkim19375.dkimgradle.enums.Repository
import me.dkim19375.dkimgradle.enums.maven
import me.dkim19375.dkimgradle.util.spigotAPI

version = "0.0.1"
group = "xyz.srnyx"

plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("io.github.dkim19375.dkim-gradle") version "1.2.0"
}

repositories {
    mavenCentral() // org.spigotmc:spigot-api
    maven(Repository.SPIGOT) // org.spigotmc:spigot-api
    maven(Repository.JITPACK) // xyz.srnyx:annoying-api
}

dependencies {
	compileOnly(spigotAPI("1.8.8"))
	implementation("xyz.srnyx", "annoying-api", "3.0.1")
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
        inputs.property("name", project.name)
        inputs.property("version", version)
        filesMatching("**/plugin.yml") {
            expand("name" to project.name, "version" to version)
        }
    }
}
