public class StringMethods3 {
    public static void main(String[] args) {

        // Extraction / transformation
        String s1 = new String("Aditya");
        System.out.println(s1.substring(1,4 )); // dit
        System.out.println(s1.substring(1)); // ditya

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        
        System.out.println(s1.replace("Ad","Gk"));
        System.out.println(s1.replace("i", "o"));
        System.out.println(s1.replaceAll("Ad","ab"));

        String s2 = new String("    Gaurav    ");
        System.out.println(s2.trim()); // removes spaces 

        String s3 = new String ("    Gau   rav    ");
        System.out.println(s3.trim()); // don not trim middle spaces between words 

        System.out.println(s2.repeat(3)); 

       
        
    }
    
}
