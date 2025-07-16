

plugins {
    kotlin("multiplatform")
}

kotlin {

    jvm {
        binaries {
            executable {
                entryPoint = "example.cli.MainKt"
            }
        }
        compilations.all {
            compilerOptions {
                jvmTarget.set("1.8")
            }
        }
    }
    js(IR) {
        nodejs()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":teaparty-core"))
                implementation(libs.kotlinx.coroutines.core)
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("com.github.ajalt.clikt:clikt:4.2.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit5"))
            }
        }
        val jsMain by getting {}
        val jsTest by getting {}
    }
}

    // JVM executable entry point handled above in the jvm target
