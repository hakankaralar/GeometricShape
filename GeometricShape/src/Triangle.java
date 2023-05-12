
public class Triangle extends Shape{
    private int edge1 ;
    private int edge2 ;
    private int edge3 ;
    
    public Triangle(String name, int edge1, int edge2, int edge3){
        super(name);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        
    }
    public void printArea(){
        
        double u = (edge1 + edge2 + edge3) / 2.0;
        
        double area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));
        System.out.println(getName() + "'s area is: " + area );
    }
    public void printSurround(){
        
        int surround = edge1 + edge2 + edge3;
        System.out.println(getName() + "'s surround is: " + surround );

    }
    
    
    
}
