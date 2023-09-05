package Day4Assignment;

public class UC5 {
    public static void main(String[] args) {
        int empcheck = 1;
        int empHr = 20;
        int fulltime = 8;
        int empWage;
        int totalhrwage;
        double mathval = Math.floor(Math.random()*10% 2);
        System.out.println(mathval);
        if(empcheck==mathval){
            System.out.println("Employee is Present");
            empWage=fulltime * empHr;
            System.out.println("Wage of employee is " +empWage);
            totalhrwage=empWage * 20;
            System.out.println("The Total of 20 Working Day per Month is " +totalhrwage);
        }
        else{
            System.out.println("Absent");
        }
    }
}


