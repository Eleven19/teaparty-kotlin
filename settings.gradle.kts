
rootProject.name = "teaparty-kotlin"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        google()
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.2.0" apply false
}

//TODO add maven central repository to dependencyManagement
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        google()
    }
}


include(":teaparty-core")
include(":examples:cli")