public class PayRoll {
    float payRate; // camel case
    float workHours;

    PayRoll(float pr, float wh) {
        payRate = pr;
        workHours = wh;
    }

    public void displayGrossPayAndNetPay() {
        float grossPay = payRate * workHours;
        float netPay = grossPay - (grossPay * 0.15f);
        System.out.printf("Gross pay is %20.2f \n net pay is %20.2f", grossPay, netPay);
    }

    public static void main(String[] args) {
        PayRoll payRoll = new PayRoll(20,8);
        payRoll.displayGrossPayAndNetPay();
    }

}
