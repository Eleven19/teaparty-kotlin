
plugins {
    alias(libs.plugins.kotlin.multiplatform).apply(true)
}

kotlin {

    jvm()
    jvmToolchain(21)
    js(IR) {
        browser{
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        nodejs()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test.common)
                implementation(libs.kotlin.test.annotations.common)
                implementation(libs.kotlinx.coroutines.test)
            }
        }
        val jvmMain by getting {}
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
