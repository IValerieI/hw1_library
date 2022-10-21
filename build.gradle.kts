plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.intellij:annotations:12.0")

    implementation(project(":controller"))

    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {
    mainClass.set("Application")
}

tasks.register<JavaExec>("startMainClass") {
    group = "special"
    args = listOf("Arthur Conan Doyle")
    mainClass.set("Application")
    classpath = sourceSets["main"].runtimeClasspath
}