plugins {
    java
}

group = "net.slimediamond"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    implementation("org.apache.httpcomponents:httpclient:4.5")
    implementation("org.json:json:20230618")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}