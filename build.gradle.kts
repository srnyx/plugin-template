import xyz.srnyx.gradlegalaxy.utility.paper
import xyz.srnyx.gradlegalaxy.utility.setupAnnoyingAPI


plugins {
    java
    id("xyz.srnyx.gradle-galaxy") version "2.0.0"
    id("com.gradleup.shadow") version "8.3.8"
}

paper("1.8.8")
setupAnnoyingAPI("5.1.5", "com.srnyx", "0.0.1", "DESCRIPTION")
