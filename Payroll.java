package payroll;

import java.util.Scanner;

public class Payroll {
public static final double PROF_TAX_PERCENTAGE = 0.2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("EMP.NO: ");
	    int employeeNumber = scanner.nextInt();

	    System.out.println("Enter the employee name: ");
	     String employeeName = scanner.next();

	      System.out.println("Enter the designation: ");
	      String designation = scanner.next();

	      System.out.println("Enter the days worked: ");
	     int daysWorked = scanner.nextInt();

	        System.out.println("Enter the pay rate: ");
	        double payRate = scanner.nextDouble();

	        System.out.println("Enter the generation date: ");
	        String generationDate = scanner.next();
	        double basicPay = daysWorked * payRate;

	        // Compute the PF
	        double pf = basicPay / 10;

	        // Compute the PROF TAX
	        double profTax = basicPay * PROF_TAX_PERCENTAGE;

	        // Compute the net pay
	        double netPay = basicPay - pf - profTax;

	        // Display the salary pay slip
			System.out.println("                   SHREE  KRISHNA  CHEMISTS  AND  DRUGGIST");
	        System.out.println("                            SALARY MONTH 9 2013");
	        System.out.println(" ");
	        System.out.print("EMP.NO.: " + employeeNumber);
	        System.out.print("                  EMP.NAME: " + employeeName);
	        System.out.println("           DESIGNATION: " + designation);
	        System.out.println("");
	        System.out.print("DAYS WORKED:" +daysWorked);
	        System.out.print("              PAY RATE:" +payRate);
	        System.out.println("             GENERATION DATE: " + generationDate);
	        System.out.println("______________________________________________________________________________________");
	        System.out.print("EARNINGS");
	        System.out.print("           AMOUNT(RS.)");
	        System.out.print("            DEDUCTIONS");
	        System.out.println("          AMOUNT(RS.)");
	        System.out.println("______________________________________________________________________________________");
	        System.out.print("BASIC PAY           " );
	        System.out.print(basicPay);
	        System.out.print("               P.F.                ");
	        System.out.println(pf);
	        System.out.print("                                          PROF.TAX            ");
	        System.out.println(profTax);
	        System.out.println("");
	        System.out.println("______________________________________________________________________________________");
	        System.out.print("GROSS EARN          ");
	        System.out.print(basicPay);
	        System.out.print("               TOTAL DEDUCT.       ");
	        System.out.println(pf+profTax);
	        System.out.print("                                          NET PAY             ");
	        System.out.println(netPay);
	        System.out.println("______________________________________________________________________________________");	        
	}

}
