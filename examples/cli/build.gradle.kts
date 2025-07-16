import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi


plugins {
    kotlin("multiplatform")
}

kotlin {
    jvmToolchain(21)
    jvm {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        binaries {
            executable {
                mainClass.set("example.cli.MainKt")
            }
        }
//        compilations.all {
//            compilerOptions {
//                jvmTarget.set("1.8")
//            }
//        }
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
                implementation(libs.clikt)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test.common)
                implementation(libs.kotlin.test.annotations.common)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(libs.kotlin.test.junit5)
            }
        }
        val jsMain by getting {}
        val jsTest by getting {
            dependencies {
                implementation(libs.kotlin.test.js)
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
