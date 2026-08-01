public class Encapsulation4 {
    public static void main(String[] args) {
        passwordManager p = new passwordManager();

        p.setpassword("Java@123");

        System.out.println(p.checkpassword("Java@123"));
        System.out.println(p.checkpassword("Hello123"));
        
    }
    
}

class passwordManager{ 
    private String  password ;

    public String  getpassword(){
        return "********" ;
    }

    public void setpassword(String password ){
        if(password.length() >= 8){
            this.password = password;
        }
        else{
            System.out.println("please enter password with minimum 8 letters");
        }
    }

    public boolean checkpassword(String input){
            if(this.password.equals(input)){
                return true;
            }
            else{
                return false ;
            }
    }

}
