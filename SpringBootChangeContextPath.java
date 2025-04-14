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


// 2.2. Java System Property

// We can also set the context path as a Java system property before the context is even initialized:

public static void main(String[] args) {
    System.setProperty("server.servlet.context-path", "/baeldung");
    SpringApplication.run(Application.class, args);
}


// 2.3. OS Environment Variable

// Spring Boot can also rely on OS environment variables. On Unix based systems we can write:

$ export SERVER_SERVLET_CONTEXT_PATH=/baeldung

// On Windows, the command to set an environment variable is:

> set SERVER_SERVLET_CONTEXT_PATH=/baeldung

// The above environment variable is for Spring Boot 2.x.x.
// If we have 1.x.x., the variable is SERVER_CONTEXT_PATH.


// 2.4. Command Line Arguments

// We can set the properties dynamically via commnd line arguments as well:

$ java -jar app.jar --server.servlet.context-path=/baeldung


// 3. Using Java Config

// Now let's set the context path by populating the bean factory with a configuration bean.

// With Spring Boot 2, we can use WebServerFactoryCustomizer.

@Bean
public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
        webServerFactoryCustomizer() {
                return factory -> factory.setContextPath("/baeldung");            
        }

// With Spring Boot 1, we can create an instance of EmbeddedServletContainerCustomizer.

@Bean
public EmbeddedServletContainerCustomizer
        embeddedServletContainerCustomizer() {
                return container -> container.setContextPath("/baeldung");
        }





