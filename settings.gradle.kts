pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PbtServer-v4-Latest"
include("Pufferfish-API", "Pufferfish-Server")