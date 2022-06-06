description = "NAME"
version = "0.0.1"
group = "PATH"

repositories {
//    maven("LINK")
}

dependencies {
//    compileOnly("PATH:NAME:VERSION")
}

plugins {
    java
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    processResources {
        filesMatching("**/plugin.yml") {
            expand(rootProject.project.properties)
        }
    }
}