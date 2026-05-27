plugins {
    java
    war
}

group = "ru.bsuedu.cad"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-webmvc:6.2.2")
    implementation("org.thymeleaf:thymeleaf-spring6:3.1.3.RELEASE")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")

    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}