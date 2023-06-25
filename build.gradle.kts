import xyz.srnyx.gradlegalaxy.utility.setupAnnoyingAPI
import xyz.srnyx.gradlegalaxy.utility.spigotAPI


plugins {
    java
    id("xyz.srnyx.gradle-galaxy") version "1.0.1"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

setupAnnoyingAPI("994c10aef2", "xyz.srnyx", "0.0.1", "DESCRIPTION")
spigotAPI("1.8.8")
