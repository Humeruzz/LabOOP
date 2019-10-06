package Lab1;

import java.text.DecimalFormat;

public class Var3 {
    private String format = "#0.000";
    public Var3() {
    }

    public Var3(String format) {
        this.format = format;
    }

    public String output(int num){
        String tempS = "Harmonic series: ";
        for (double i = 1; i <= num; i++) {
            if (i != num) {
                tempS += (new DecimalFormat(this.format).format((double) (1 / i)) + " ");
            } else {
                tempS += (new DecimalFormat(this.format).format((double) (1 / i)) + ";");
            }
        }
        return tempS;
    }
}
