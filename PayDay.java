
/**
 * Write a description of class PayDay here.
 *
 * @author Bobbi Zupon
 * @version 06252021
 */
public class PayDay
{
    // instance variables - replace the example below with your own
    private String name;
    private double hourlyRate;
    private double hoursWorked;
    private double deductionRate;


    /**
     * Constructor for objects of class PayDay
     */
    public PayDay()
    {
        // initialise instance variables
        String name;
        double hourlyRate;
        double hoursWorked;
        double deductionRate;
        
    }

    /**
     * 
     *
     * 
     */
    public String pay(String name, double hourlyRate, double hoursWorked, double deductionRate)
    {
        // put your code here
        double grossPay; double deduction; double netPay;
        String result;
        
        grossPay = hourlyRate * hoursWorked;
        deduction = grossPay * deductionRate;
        netPay = grossPay - deduction;
        result = String.format("%s %.2f %.2f %.2f", name, grossPay, deduction, netPay);
        return result;
    }
}
