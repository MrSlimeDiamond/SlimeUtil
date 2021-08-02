# SlimeUtil
Utilities for Java
## Usage
### DateUtil.formatDuration
Consider this example code:
```java
String formatted = DateUtil.formatDuration(Duration.ofMillis(3948534));
System.out.println(formatted);
```
Expected output:
```
1 hours, 5 minutes, 48 seconds
```
## Add as dependency
### Gradle
Step 1: Add the repository
```groovy
    maven {
        url "https://repo.zenoc.net/repository"
    }
```
Step 2: Add to dependencies
```groovy
dependencies {
  implementation 'io.github.mrslimediamond:slimeutil:1.0-SNAPSHOT'
}
```
