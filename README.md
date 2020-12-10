# 1. Example of JUnit Jupiter

## 1.1. Table of contents

- [1. Example of JUnit Jupiter](#1-example-of-junit-jupiter)
  - [1.1. Table of contents](#11-table-of-contents)
  - [1.2. Requirements](#12-requirements)
  - [1.3. Dependencies](#13-dependencies)
    - [1.3.1. JUnit Jupiter Platform](#131-junit-jupiter-platform)
    - [1.3.2. JUnit Jupiter API](#132-junit-jupiter-api)
    - [1.3.3. JUnit Jupiter Vintage](#133-junit-jupiter-vintage)
  - [1.4. Build plugins](#14-build-plugins)
  - [1.5. Project classes](#15-project-classes)
    - [1.5.1. Number](#151-number)
      - [1.5.1.1. Methods](#1511-methods)
        - [1.5.1.1.1. Add](#15111-add)
        - [1.5.1.1.2. Subtract](#15112-subtract)
        - [1.5.1.1.3. Multiply](#15113-multiply)
        - [1.5.1.1.4. Divide](#15114-divide)
  - [1.6. Tests](#16-tests)
    - [1.6.1. Assertions methods](#161-assertions-methods)
      - [1.6.1.1. assertEquals](#1611-assertequals)
      - [1.6.1.2. assertTrue and assertFalse](#1612-asserttrue-and-assertfalse)
      - [1.6.1.3. assertNull and assertNotNull](#1613-assertnull-and-assertnotnull)
      - [1.6.1.4. assertThrows](#1614-assertthrows)
    - [1.6.2. Annotations](#162-annotations)
      - [1.6.2.1. Test](#1621-test)
      - [1.6.2.2. BeforeAll](#1622-beforeall)
      - [1.6.2.3. BeforeEach](#1623-beforeeach)
      - [1.6.2.4. AfterAll](#1624-afterall)
      - [1.6.2.5. AfterEach](#1625-aftereach)
  - [1.7. External resources](#17-external-resources)

This project is a project which helps me to pratice globally JUnit5 Jupiter.  
In this project, I will develop some small classes like Number with some functions.

The aim of this project is to use JUnit5 in different cases.

Here, I will use maven. So, let see the dependencies we need.

---

## 1.2. Requirements

To use JUnit5, you must use a Java version **equals or geater** than 8.

---

## 1.3. Dependencies

In the next dependencies, you will note that I restricted its scope to the test one.  
That is because JUnit will just be used in the test one. So, we do not need to keep the dependency on the production scope.

I use 2 JUnit dependencies:

### 1.3.1. JUnit Jupiter Platform

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

### 1.3.2. JUnit Jupiter API

JUnit Jupiter API is the one which import methods and annotations to use in and on the test classes (@Test, assertions methods, ...).

```plaintext
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
```

### 1.3.3. JUnit Jupiter Vintage

I did not use this dependency, but I want to mention it.  
Jupiter is the 5*th* version of JUnit. But, you can "mix" the 3*rd* and 4*th* versions with the 5*th*. Jupiter Vintage import olds versions methods. That is usefull if you upgrade your JUnit version in some times.

---

## 1.4. Build plugins

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

## 1.5. Project classes

### 1.5.1. Number

This class represents an integer. I implemented the four basic operators (+, -, * and /).  
I set up the getters and setters too, a toString method and, finally, the equals method (which I will not test).

#### 1.5.1.1. Methods

This is the Number's methods with their behaviour:

##### 1.5.1.1.1. Add

Add a given Number to the current Number.

The argument `toAdd` is the number to add. It must be not null.  
If toAdd.number is null, the function will add 0 to the current one.  
If this.number is null, the function will set it to toAdd.number.

Add() returns the current instance after the addition.

The method can throw an IllegalArgumentException exception if toAdd is null.

##### 1.5.1.1.2. Subtract

Subtract a given Number to the current Number.

The argument `toSubtract` is the number to subtract. It must be not null.  
If toSubtract.number is null, the function will subtract 0 to the current one.  
If this.number is null, the function will set it to -(toSubtract.number).

The method returns the current instance after the subtraction.

It can throw an IllegalArgumentException exception if toSubtract is null.

##### 1.5.1.1.3. Multiply

Multiply a given Number to the current Number.

The argument `toMultiply` is the Number to multiply.  
If toMultiply.number is null, the function will multiply this.number by 1.  
If this.number is null, the function will set it to toMultiply.number

Multiply() returns the current instance after the multiplication.

The method will throw an IllegalArgumentException exception if toMultiply is null.

##### 1.5.1.1.4. Divide

Divide the current Number by the given one.

The argument `divider` is the Number to use to divide the current one.  
If divider.number is null, the function will divide this.number by 1.  
If this.number is null, the function will set it to 1.

The method returns the current instance after the division.

Divide() can throw an IllegalArgumentException exception if divider is null or if divier.number is equals to 0 (impossible case).

---

## 1.6. Tests

This section will describes the JUnit5 tools (methods and annotations mainly) which I used in this project.

### 1.6.1. Assertions methods

Assertions methods are, with the [Test annotation](#1521-test-todo), the main tools we use in tests. That is why I begin with them.

Assertions are a gather of methods which will return a test state in your test methods.  
If an assertion fail, the method will stop itself and return a fail statement.  
If an assert success, the method will continue normally. If the process go to the end of a test method without fail any assertion, then the method will return a success statement.

There is a lot of assertions methods, you can find them in the class `org.junit.jupiter.api.Assertions`. It can be usefull to import these methods with a static import like this:  

`import static org.junit.jupiter.api.Assertions.*;`

In most of he following methods can take, optionnally, a last argument. This argument is a message which will be prompted if the assertion fails.

The main assertions methods I use daily are the following one:

#### 1.6.1.1. assertEquals

This assertion need two arguments. The first one is the result you expect. The second one is the result that you want to test.

This is an example from NumberTest#testAddWhichHasToSuccess():

```java
assertEquals(expect, origin.add(second));
```

This method will do `expect.equals(toTest)`. If this equals method is not implemented on the object you give, assertEquals will use the double equals operator (`==`) on the object references.

#### 1.6.1.2. assertTrue and assertFalse

This two methods need only one argument. This argument must be a boolean condition to test. The assertion will success if the condition is true for the first method, or if it is false for the second one.

```java
assertTrue(5 + 3 == 8);  // Success
assertFalse(5 + 5 == 8); // Success
assertTrue(5 + 5 == 8);  // Fail
assertFalse(5 + 3 == 8); // Fail
```

#### 1.6.1.3. assertNull and assertNotNull

AssertNull and assertNotNull need one argument which is the variable or a method result to test.  
The first one will success if the argument is null, the second one will success if the arguement is not null.

```java
assertNull(null);     // Success
assertNotNull(5);     // Success
assertNull(5);        // Fail
assertNotNull(null);  // Fail
```

#### 1.6.1.4. assertThrows

AssertThrows, as assertEquals, needs two arguments.  
The first argument is the exception class you attempt to throw.  
The second argument is a lambda expression which should throw the exception.

Example from NumberTest#testAddWithNullArgument():

```java
assertThrows(IllegalArgumentException.class,
             () -> origin.add(null));
```

Naturally, this method will success if the exception is thrown. It will fail in another case.

### 1.6.2. Annotations

#### 1.6.2.1. Test

This annotation is the most common. Placed on a function, it marks it as a test function.  
When you run tests, JUnit5 will search all methods which have this annotation and run them.

*Note*: A Test method sould not return anything. Assertions in the methods will do the job.

Example:

```java
@Test
void testAddWithNullArgument() {
    assertThrows(IllegalArgumentException.class,
                () -> origin.add(null));
}
```

#### 1.6.2.2. BeforeAll

BeforeAll must be placed on a method. The marked method will be run once before all other tests method in the current class.

It is a usefull annotation to prepare a global context for your tests.

*Note*: A BeforeAll method sould be static and without return.

```java
@BeforeAll
static void init() {
    origin = new Number();
    second = new Number();
    expect = new Number();
}
```

#### 1.6.2.3. BeforeEach

As BeforeAll, this annotation will mark a method as being executed before tests in the current class. But here, the BeforeEach method will be run before each new test.

It can be usefull to reinitialize a context before a new test.

*Note*: A BeforeEach method sould be static and without return.

```java
@BeforeEach
void setup() {
    origin.setNumber(6);
    second.setNumber(2);
}
```

#### 1.6.2.4. AfterAll

The AfterAll annotation is the opposite from the BeforeAll one. It will be run after all tests in the current class.

It is used mostly to clean up your environnement or your test database.

```java
@AfterAll
static void shutdown() {
    if (file != null)
        file.close();
}
```

#### 1.6.2.5. AfterEach

The AfterEach annotation is the opposite from the BeforeEach one. It will be run after each test in the current class.

It is used mostly to clean up your environnement or your test database after one test or to reinitialize it.

```java
@AfterEach
static void clean() {
    created.delete();
}
```

---

## 1.7. External resources

- [JUnit5 User Guide](https://junit.org/junit5/docs/5.3.0-M1/user-guide/index.html)
- [Baeldungs tutorials](https://www.baeldung.com/junit)