package Lab2.Human;

public class Human {
    private int height;
    private Arm arm;
    private Leg leg;
    private Head head;

    public Human(String temp) {
        String[] str = temp.trim().split(" ");
        if ((str.length == 4)&&(isNum(str))) {
            this.height = Integer.parseInt(str[0]);
            this.arm = new Arm(Integer.parseInt(str[1]));
            this.leg = new Leg(Integer.parseInt(str[2]));
            this.head = new Head(str[3]);
        }
    }

    public String output() {
        return "Human:\n" +
                "height=" + height +
                "\narm=" + arm.getLength() +
                "\nleg=" + leg.getLength()+
                "\nhead=" + head.getHairColor();
    }

    private boolean isNum(String [] str){
        if ((( '0' <= str[0].charAt(0)) && (str[0].charAt(0) <= '9')) && (( '0' <= str[1].charAt(0)) && (str[1].charAt(0) <= '9')) && (( '0' <= str[2].charAt(0)) && (str[2].charAt(0) <= '9'))){
            return true;
        } else {
            return false;
        }
    }
}
