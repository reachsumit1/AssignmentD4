package Day4Assignment;

public class UC1 {
    public static void main(String[] args) {
        int empcheck = 1;
        double mathval = Math.floor(Math.random()* 10% 2);
        if(empcheck==mathval){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}