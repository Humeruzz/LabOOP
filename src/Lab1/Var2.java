package Lab1;

import java.io.UnsupportedEncodingException;

public class Var2 {
    private String str;

    public Var2(String str) {
        this.str = str.trim();
    }

    public String output(){
        String[] tempS = str.split(" ");
        int[] tempI = new int[tempS.length];
        String outS = "You've entered: ";
        for (int i = 0; i < tempI.length; i++) {
            try {
                tempI[i] = Integer.parseInt(tempS[i]);
                if (i != tempI.length) {
                    outS += (tempI[i] + " ");
                }
                else{
                    outS += (tempI[i] + ";");
                }
            } catch (NumberFormatException e) {
                return ("Wrong format of TextField");
            }

        }

        return outS;
    }
}
