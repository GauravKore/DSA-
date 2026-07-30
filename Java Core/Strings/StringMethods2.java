public class StringMethods2 {
    public static void main(String[] args) {
        // searching 
        String s1 = new String("Gaurav");

        System.out.println(s1.contains("rav")); // true 
        System.out.println(s1.contains("ga")); // false (case sensitive)

        System.out.println(s1.indexOf("ura")); // 2 --> starting index 

        String s2 = new String("Gauravurav");
        System.out.println(s2.lastIndexOf("ura")); // 6 

        System.out.println(s2.startsWith("Ga")); // true 
        System.out.println(s2.startsWith("ga")); // false 

        System.out.println(s2.endsWith("AV")); // false 
    }
    
}
