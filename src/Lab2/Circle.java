package Lab2;

public class Circle {
    private int radius;
    private int x,y;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(String tempS) {
        String[] str = tempS.trim().split(" ");
        if ((str.length == 3) && isNum(str)) {
            this.radius = Integer.parseInt(str[0]);
            this.x = Integer.parseInt(str[1]);
            this.y = Integer.parseInt(str[2]);
        }
    }

    public Circle() {
        this.radius = 0;
        this.x = 0;
        this.y = 0;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private boolean isNum(String [] str){
        if ((( '0' <= str[0].charAt(0)) && (str[0].charAt(0) <= '9')) && (( '0' <= str[1].charAt(0)) && (str[1].charAt(0) <= '9')) && (( '0' <= str[2].charAt(0)) && (str[2].charAt(0) <= '9'))){
            return true;
        } else {
            return false;
        }
    }
}
