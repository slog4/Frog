package com.company;

import java.io.Console;

import static jdk.internal.org.jline.utils.AttributedStyle.GREEN;

public class Main {

    public static final String TEXT_COLOR_GREEN = "\033[0;32m";
    public static final String TEXT_COLOR_RESET = "\033[0m";
       public static void main(String[] args) {
	// write your code here
        char space = ' ';
        String first = "@..@";
        String secondLine = "(----)";
        String thirdLine="( >____< )";
        String fourthLine = "^^ ~~ ^^";
        System.out.println(TEXT_COLOR_GREEN+space+""+space+""+space+first);
        System.out.println(space+""+space+secondLine);
        System.out.println(thirdLine );
        System.out.println(space+""+fourthLine+TEXT_COLOR_RESET);
    }
}
