import xyz.srnyx.gradlegalaxy.utility.setupAnnoyingAPI
import xyz.srnyx.gradlegalaxy.utility.spigotAPI


plugins {
    java
    id("xyz.srnyx.gradle-galaxy") version "1.2.2"
    id("io.github.goooler.shadow") version "8.1.8"
}

setupAnnoyingAPI("44b9fff69a", "xyz.srnyx", "0.0.1", "DESCRIPTION")
spigotAPI("1.8.8")
