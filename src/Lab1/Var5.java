package Lab1;

public class Var5 {
    private int num;
    public Var5() {
    }

    public Var5(int num) {
        this.num = num;
    }

    public String output(){
        String tempS = "Factorial of !" + num + " is: ";
        int tempI = 1;
        for (int i = 1; i <= num; i++){
            tempI *= i;
        }
        tempS += tempI;
        return tempS;
    }
}
