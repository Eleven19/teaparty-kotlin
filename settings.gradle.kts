
plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.2.0" apply false
}

rootProject.name = "teaparty-kotlin"

include(":teaparty-core")
include(":examples:cli")