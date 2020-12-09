# 1. Example of JUnit Jupiter

## 1.1. Table of contents

- [1. Example of JUnit Jupiter](#1-example-of-junit-jupiter)
  - [1.1. Table of contents](#11-table-of-contents)
  - [1.2. Dependencies](#12-dependencies)
    - [1.2.1. JUnit Jupiter Platform](#121-junit-jupiter-platform)
    - [1.2.2. JUnit Jupiter API](#122-junit-jupiter-api)
    - [1.2.3. JUnit Jupiter Vintage](#123-junit-jupiter-vintage)
  - [1.3. Build plugins](#13-build-plugins)
  - [1.4. Project classes](#14-project-classes)
    - [1.4.1. Number](#141-number)
  - [1.5. Tests](#15-tests)
  - [1.6. External resources](#16-external-resources)

This project is a project which helps me to pratice globally JUnit5 Jupiter.  
In this project, I will develop some small classes like Number with some functions.

The aim of this project is to use JUnit5 in different cases.

Here, I will use maven. So, let see the dependencies we need.

---

## 1.2. Dependencies

In the next dependencies, you will note that I restricted its scope to the test one.  
That is because JUnit will just be used in the test one. So, we do not need to keep the dependency on the production scope.

I use 2 JUnit dependencies:

### 1.2.1. JUnit Jupiter Platform

JUnit Jupiter Platform, which is used thanks the junit-jupiter-engine dependency, allows tests running.  
It give the TestEngine API to. This API is used to create new test frameworks. These frameworks can be imported into the app and run by JUnit Jupiter Platform.

```plaintext
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
```

### 1.2.2. JUnit Jupiter API

JUnit Jupiter API is the one which import methods and annotations to use in and on the test classes (@Test, assertions methods, ...).

```plaintext
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
```

### 1.2.3. JUnit Jupiter Vintage

I did not use this dependency, but I want to mention it.  
Jupiter is the 5*th* version of JUnit. But, you can "mix" the 3*rd* and 4*th* versions with the 5*th*. Jupiter Vintage import olds versions methods. That is usefull if you upgrade your JUnit version in some times.

---

## 1.3. Build plugins

The following build plugins allows us to launch tests from maven.  
We need them because surfire does not support JUnit5 natively.

```plaintext
<build>
    <plugins>
        <plugin>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
        </plugin>
        <plugin>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.2</version>
        </plugin>
    </plugins>
</build>
```

With this plugin, you can run the written tests with the command `mvn test`.

---

## 1.4. Project classes

### 1.4.1. Number

This class represents an integer. I implemented the four basic operators (+, -, * and /).  
I set up the getters and setters too, a toString method and, finally, the equals method (which I will not test).

---

## 1.5. Tests

---

## 1.6. External resources

- [JUnit5 User Guide](https://junit.org/junit5/docs/5.3.0-M1/user-guide/index.html)
- [Baeldungs tutorials](https://www.baeldung.com/junit)