
public class Circle extends Shape{
    private double radius;
    
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        
    }
    public void printArea(){
        
        double area = radius * radius * Math.PI;
        System.out.println(getName() + "'s area is: " + area );
    }
    public void printSurround(){
        
        double surround = 2 * radius * Math.PI;
        System.out.println(getName() + "'s surround is: " + surround );
    }
    
    
}
