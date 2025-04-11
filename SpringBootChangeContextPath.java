// 2025 04 11 

// https://www.baeldung.com/spring-boot-context-path

// Last updated May 11, 2024

// Written by: baeldung
// Reviewed by: Predrag Marić


// 1. Overview

// Spring Boot, by default, serves content on the root context path ("/").

// While it's usually a good idea to prefer convention over configuration,
// there are cases when we do want to have a custom path.

// In this quick tutorial, we'll cover the different ways of configuring it.


// 2. Setting the Property

// Just like many other configuration options,
// the context path in Spring Boot can be changed by setting a property,
// server.servlet.context-path.

// Note that this works for Spring Boot 2.x. For Boot 1.x, the property is server.conext-path.

// There are multiple ways of setting this property, so let's look at them one by one.


// 2.1. Using application.properties / yml

// The most straightforward way of changing the context path
// is to set the property in the application.properties/yml file:

server.servlet.context-path=/baeldung

// Instead of putting properties file in src/main/resources,
// we can also keep it in the current working directory (outside of the classpath).


