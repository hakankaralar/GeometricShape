
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to shape programme");
        String shape = "1. Square \n"
                     + "2. Circle \n"
                     + "3. Triangle \n"
                     + "Press q for quit...\n";
        
        String process2 = "1.Calculate the area \n"
                       + "2.Calculate the surround \n"
                       + "Press 'q' the quit \n";
        
        while(true){
            System.out.println("********************");
            System.out.println(shape);
            System.out.println("Which shape do you want to choose? ");
            String choose = input.nextLine();
            
            if(choose.equals("q")){
                System.out.println("Exiting the programme...");
                break;
            }
            else if(choose.equals("1")){
                Square square = new Square("square", 5);
                System.out.println("What do you want to calculate? ");
                System.out.println(process2);
                
                while (true) {
                    System.out.print("Select the choose...");
                    String select2 = input.nextLine();
                    
                    if(select2.equals("q")){
                        System.out.println("Exit this shape");
                        break;
                    }
                    else if(select2.equals("1")){
                        square.printArea();
                    }
                    else if(select2.equals("2")){   
                        square.printSurround();
                    }
                    else{
                        System.out.println("Invalid operaiton");
                    }
                }
            }
            else if(choose.equals("2")){
                Circle circle = new Circle("circle", 3);
                System.out.println("What do you want to calculate? ");
                System.out.println(process2);
                
                while (true) {
                    System.out.print("Select the choose : ");
                    String select2 = input.nextLine();
                    
                    if(select2.equals("q")){
                        System.out.println("Exit this shape");
                        break;
                    }
                    else if(select2.equals("1")){
                        circle.printArea();
                    }
                    else if(select2.equals("2")){
                        circle.printSurround();
                    }
                    else{
                        System.out.println("Invalid operaiton");
                    }
                }
            }
            else if(choose.equals("3")){
                Triangle triangle = new Triangle("triangle", 10, 20, 30);
                System.out.println("What do you want to calculate? ");
                System.out.println(process2);
                while (true) { 
                    System.out.print("Select the choose : ");
                    String select2 = input.nextLine();
                    
                    if(select2.equals("q")){
                        System.out.println("Exit this shape");
                        break;
                    }
                    else if(select2.equals("1")){
                        triangle.printArea();
                    }
                    else if(select2.equals("2")){
                        triangle.printSurround();
                    }
                    else{
                        System.out.println("Invalid operaiton");
                    }
                }
            }
            else{
                System.out.println("Invalid operaiton");
            }
        }
    }
}