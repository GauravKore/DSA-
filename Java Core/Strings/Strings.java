public class Strings{
    public static void main(String[] args) {
        String s1 = "ja" + "va"; // java(compile time constants)
        String s2 = "java";

        System.out.println(s1 == s2); // true 

        String s3 = "hello";
        String s4 = s3 + " world"; // (run time constants)
        String s5 = "hello world";

        // string pool --> "hello","world","hello world"
        // heap --> "hello world"
        System.out.println(s3 == s4 ); //false 
        System.out.println(s4 == s5); // false


        String s6 = "Gaurav";
        String s7 = s6 ; // references 
        System.out.println(s6 == s7 ); // true 


        String s8 = "hello";
        s8 = "world";

        System.out.println(s8); // world

        String s9 = new String("hello");
        String s10 = "hello";

        System.out.println(s9 == s10);

        // string pool --> "hello"
        // heap --> "hello"

    }
} 