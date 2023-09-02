plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.google.code.gson:gson:2.9.1")
	implementation("org.springframework:spring-tx:6.0.11")
	implementation("org.springframework.boot:spring-boot-starter-data-rest:3.1.2")
	implementation("org.springframework.boot:spring-boot-starter-jdbc:3.1.2")
	implementation("org.hibernate:hibernate-core:6.1.7.Final")
	implementation("org.hibernate.orm:hibernate-community-dialects:6.1.7.Final")
	implementation("org.json:json:20230227")


	compileOnly("org.projectlombok:lombok:1.18.26")
	implementation("org.postgresql:postgresql:42.2.4")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.1")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
