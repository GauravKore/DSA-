public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Gaurav");
        sb.append("Kore");

        System.out.println(sb);

        // insert 
        sb.insert(2,"o");
        System.out.println(sb);
        // delete 
        sb.delete(0, 2); // substring delete 
        System.out.println(sb); 

        sb.deleteCharAt(5); // character delete

        sb.replace(0, 3, "raj");
        sb.reverse();

        sb.charAt(0); //G
        sb.setCharAt(3,'y');

        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 16
        sb.ensureCapacity(100);
        System.out.println(sb.capacity()); // 100

        sb.trimToSize();
        System.out.println(sb.capacity()); // 10


    }
    
}
