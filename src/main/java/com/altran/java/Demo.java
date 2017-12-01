package com.altran.java;

/**
 * = Demo
 * This is a Test project to demonstrate th benefits for using AsciiDoc in
 * comments.
 *
 *[plantuml, alt="Class diagram"]
 * ....
 * class Demo
 * ....
 *
 *  Sample for asciidoc javadoc
 */
public class Demo {

    //private static final System.Logger LOGGER = System.getLogger(Demo.class.getName());

    private final String name;

    /**
     * Constructor for class Demo.
     * @param name test
     */
    public Demo(final String name){
        this.name = name;
    }

    /**
     * Just say Hello
     */
    public void sayHello() {

       // LOGGER.log(System.Logger.Level.INFO,"Hi {}", name);

    }
}
