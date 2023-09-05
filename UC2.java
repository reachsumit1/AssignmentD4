package Day4Assignment;

public class UC2 {
    public static void main(String[] args) {
        int empcheck = 1;
        int empHr = 20;
        int fulltime = 8;
        int empWage;
        double mathval = Math.floor(Math.random()*10% 2);
        System.out.println(mathval);
        if(empcheck==mathval){
            System.out.println("Employee is Present");
            empWage=fulltime * empHr;
            System.out.println("Wage of employee is " +empWage);
        }
        else{
            System.out.println("Absent");
        }
    }
}

