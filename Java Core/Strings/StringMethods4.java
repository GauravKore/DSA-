public class StringMethods4 {
    public static void main(String[] args) {
        String s1 = "Gaurav,Varad,Rohan";
        String arr[] = s1.split(","); // ,--> delimiter 
        for(String s : arr){
            System.out.println(s); // Gaurav Varad Rohan
        }
            System.out.println(String.join("-","a","b","c")); // a-b-c

            // conversion 

            String s2 =  new String(String.valueOf(10));
            System.out.println(s2); //10 

            byte[] array = s1.getBytes();
            for(byte i : array){
                System.out.println(i + " ");
            } 

            // Advance methods --> intern() , format()
            String s3 = new String("hello");
            String s4 = s3.intern();
            // String pool --> "hello" <--s4
            // heap --> s3--> "hello"
            System.out.println(s3 == s4);


            String name = "Varad";
            int age = 28;

            System.out.println("Hello"+ " " + name + " , "+ "your age is "+ " "+age);
            System.out.println(String.format("hello %s , Your age is %s",name,age));

        
    }
    
}
