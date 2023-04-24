package seedu.tojava.util;

/*
To create a package, you put a package statement at the very top of every source file in that package. The package statement must be the first line in the source file and there can be no more than one package statement in each source file. Furthermore, the package of a type should match the folder path of the source file. Similarly, the compiler will put the .class files in a folder structure that matches the package names.
*/

/*
The Formatter class below (in <source folder>/seedu/tojava/util/Formatter.java file) is in the package seedu.tojava.util. When it is compiled, the Formatter.class file will be in the location <compiler output folder>/seedu/tojava/util:
8?

public class Formatter {
    public static final String PREFIX = ">>";

    public static String format(String s){
        return PREFIX + s;
    }
}
