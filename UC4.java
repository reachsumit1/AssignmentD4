package Day4Assignment;

import java.util.Scanner;

public class UC4 {
    public static void main(String[] args) {
        int emp;
        System.out.println("If Employee is Present Press 1 or if Absent Press 0 Please enter :");
        Scanner sc = new Scanner(System.in);
        emp = sc.nextInt();
        switch (emp) {
            case 1:
                emp = 1;
            {
                System.out.println("Present");
            }
            break;
            default:
                System.out.println("Absent");

        }
    }}


