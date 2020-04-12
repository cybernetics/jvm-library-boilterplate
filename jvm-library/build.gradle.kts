import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    with(BuildPlugins) {
        id(kotlinJVM)
        id(testLogger)
    }
}

dependencies {
    implementation(Dependencies.kotlinStdLib)
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.assertj)
}

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions.jvmTarget = Definitions.targetJDK
    }
}