
public class Square extends Shape{
    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
        
    }
    public void printArea(){
        
        int area = edge * edge;
        System.out.println(getName() + "'s area is: " + area );
        
    }
    public void printSurround(){
        
        int surround = 4 * edge;
        System.out.println(surround);
        System.out.println(getName() + "'s surround is: " + surround );

    }
    
    
}
