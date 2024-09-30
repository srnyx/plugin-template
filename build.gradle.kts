import xyz.srnyx.gradlegalaxy.utility.setupAnnoyingAPI
import xyz.srnyx.gradlegalaxy.utility.spigotAPI


plugins {
    java
    id("xyz.srnyx.gradle-galaxy") version "1.3.1"
    id("com.gradleup.shadow") version "8.3.2"
}

setupAnnoyingAPI("656aefa756", "com.srnyx", "0.0.1", "DESCRIPTION")
spigotAPI("1.8.8")
