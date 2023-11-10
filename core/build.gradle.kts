import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

group = "com.example"

kotlin {
    jvm ()
    js {
        binaries.library()
        browser()
        nodejs()
    }
//    @Suppress("OPT_IN_USAGE")
//    wasmJs {
//        binaries.library()
//        browser()
//        nodejs()
//    }

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonMain by getting
        val commonTest by getting
    }
}

////See: https://github.com/Kotlin/kotlin-wasm-examples/blob/main/nodejs-example/build.gradle.kts
//rootProject.the<NodeJsRootExtension>().apply {
//    nodeVersion = "21.0.0-v8-canary202309143a48826a08"
//    nodeDownloadBaseUrl = "https://nodejs.org/download/v8-canary"
//}
//
//tasks.withType<KotlinNpmInstallTask>().configureEach {
//    args.add("--ignore-engines")
//}
