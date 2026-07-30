public class StringMethods1 {
    public static void main(String[] args) {
        // Character access

        String s1 = new String("Aditya");
        System.out.println(s1.charAt(2));

        char[] arr = s1.toCharArray(); // --> {'A','d','i','t','y','a'}
        System.out.println(arr);  // Aditya 

        // comparison

        String s3 = new String("Aditya");
        String s4 = new String("Aditya");

        System.out.println(s3.equals(s4)); // true
        
        String s5 = new String("gaurav");
        String s6 = new String("GAURAV");

        System.out.println(s5.equals(s6)); // false
        System.out.println(s5.equalsIgnoreCase(s6)); // true 

        // lexicographical comparison --> dictionary
        // compare to --> +ve , 0 , -ve 
        String s7 = new String("abc");
        String s8 = new String("abd");

        System.out.println(s7.compareTo(s8)); // -1
    }
    
}
