package Week1;

class PayRoll {
    float payRate; // camel case
    float workHours;

    PayRoll(float pr, float wh) {
        payRate = pr;
        workHours = wh;
    }

    public float[] displayGrossPayAndNetPay() {
        float[] pays = new float[2];
        pays[0] = payRate * workHours;
        pays[1] = pays[0] - (pays[0] * 0.15f);
        //float grossPay = payRate * workHours;
        //float netPay = grossPay - (grossPay * 0.15f);
        //System.out.printf("Gross pay is %20.2f \n net pay is %20.2f", grossPay, netPay);
        return pays;
    }

    public static void main(String[] args) {
        PayRoll payRoll = new PayRoll(20,8);
        float[] pays = payRoll.displayGrossPayAndNetPay();
        //System.out.println("return value grossPay in amin " + gPay);
        System.out.printf("Return value grossPay %10.1f and net pay %10.1f" + pays[0], pays[1]);
    }

}
