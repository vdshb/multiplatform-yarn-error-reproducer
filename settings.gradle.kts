rootProject.name = "reproducer"

include(
    "core",
)

pluginManagement {
    repositories {
        mavenCentral()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
