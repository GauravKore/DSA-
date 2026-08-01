public class Encapsulation2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname("Gaurav");
        s1.setage(21);

        System.out.println(s1.getname());
        System.out.println(s1.getage());
        
    }
    
}

class Student {
    private String name ; 
    private int age ;

    public String getname(){
        return name ;
    }
     
    public void setname(String name ){
        if(name != null){
            this.name = name ;
        }
        else{
            System.out.println("invalid name ");
        }
    }

    public int getage() {
        return age ;
    }

    public void  setage(int age ){
        if(age >= 0){
        this.age = age;
        }
        else{
            System.out.println("invalid age ");
        }

    }
}
