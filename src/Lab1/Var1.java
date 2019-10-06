package Lab1;

import java.lang.Math;
import java.util.Arrays;

public class Var1 {
    static final int num = 10;
    private int mass[];

    public Var1() {
        this.mass = new int[num];
        for (int i = 0; i < num; i++) {
            this.mass[i] = (int) (Math.random()*10);
        }
    }

    public String For(){
        String tempS = "For: \nMass:{";
        for (int i = 0; i < num; i++){
            if (i != num-1) {
                tempS += (this.mass[i] + ", ");
            } else{
                tempS += (this.mass[i] + "}\n");
            }
        }
        return tempS;
    }

    public String While(){
        String tempS = "While: \nMass:{";
        int i = 0;
        while (i < num){
            if (i != num-1) {
                tempS += (this.mass[i] + ", ");
            } else{
                tempS += (this.mass[i] + "}\n");
            }
            i++;
        }
        return tempS;
    }

    public String DoWhile(){
        String tempS = "Do while: \nMass:{";
        int i = 0;
        do{
            if (i != num-1) {
                tempS += (this.mass[i] + ", ");
            } else{
                tempS += (this.mass[i] + "}\n");
            }
            i++;
        }
        while (i < num);
        return tempS;
    }

    public String output(){
        String tempS = this.For() + this.While() + this.DoWhile();
        return tempS;
    }

    @Override
    public String toString() {
        return "Var1{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
