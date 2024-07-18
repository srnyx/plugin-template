package xyz.srnyx.name;

import xyz.srnyx.annoyingapi.AnnoyingPlugin;
import xyz.srnyx.annoyingapi.PluginPlatform;


public class Name extends AnnoyingPlugin {
    public Name() {
        options
                .pluginOptions(pluginOptions -> pluginOptions.updatePlatforms(new PluginPlatform.Multi(
                        PluginPlatform.modrinth("IDENTIFIER"), // Replace IDENTIFIER with the Modrinth identifier
                        PluginPlatform.hangar(this),
                        PluginPlatform.spigot("######")))) // Replace ###### with the Spigot resource ID
                .bStatsOptions(bStatsOptions -> bStatsOptions.id(10000)) // Replace 10000 with the bStats ID
                .dataOptions(dataOptions -> dataOptions
                        .enabled(true) // Set to false if you don't want to use data (you can just remove all data options if false)
                        .entityDataColumns( // Replace COLUMN1, COLUMN2, COLUMN3 with the column names
                                "COLUMN1",
                                "COLUMN2",
                                "COLUMN3"))
                .registrationOptions
                .papiExpansionToRegister(() -> null) // Replace null with the placeholder expansion class
                .automaticRegistration.packages("PACKAGE"); // Replace PACKAGE with the package name
    }
}
