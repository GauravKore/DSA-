public class Encapsulation5 {
    public static void main(String[] args) {

        employee e = new employee();
        e.setname("Gaurav");
        e.setsalary(15000.0);
        e.incrementsalary(25000);


        System.out.println(e.getname());
        System.out.println(e.getsalary());
        
    }
    
}

class employee{
    private String name ;
    private double salary ;


    public String getname(){
        return name ;
    }

    public void  setname(String name){
        this.name = name ;
    }


    public double getsalary(){
        return salary;
    }

    public void setsalary(double salary){
        if(salary < 0){
            System.out.println("Salary cannot be negative ");
        }
        else{
            this.salary = salary;
        }
    }


    public void incrementsalary(int amount ){
        if(amount > 0){
            salary += amount;
        }
        else{
            System.out.println("amount is invalid ");
        }
    }
}
