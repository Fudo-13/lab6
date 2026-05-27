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
    providedCompile("jakarta.servlet:jakarta.servlet-api:6.1.0")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}