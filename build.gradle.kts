
plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.2.0" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.0" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
