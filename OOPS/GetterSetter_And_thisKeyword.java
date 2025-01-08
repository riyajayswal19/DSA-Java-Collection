package OOPS;

class pp {
    private String color;
    private int tip;
    
    String getColor() {
        return this.color;
    }
    
    void setColor(String newColor) {
        this.color = newColor;
    }
    
    void setTip(int newTip) {
        this.tip = newTip;
    }
}


public class GetterSetter_And_thisKeyword {
    public static void main(String[] args) {
        pp p1 = new pp();
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}


