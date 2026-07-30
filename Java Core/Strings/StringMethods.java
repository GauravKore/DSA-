public class StringMethods {
    public static void main(String[] args) {

        // Length / emptiness
        String s1 = new String("Aditya");

        System.out.println(s1.length()); // 6
        System.out.println(s1.isEmpty()); // false 
        System.out.println(s1.isBlank()); // false

         String s2 = new String("     ");

        System.out.println(s2.length()); // 5
        System.out.println(s2.isEmpty()); // false --> include spaces
        System.out.println(s2.isBlank()); // true 


    }
    
}
