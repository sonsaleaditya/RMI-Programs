import java.rmi.Naming;
import java.util.Scanner;

public class CircleAreaClient {
    public static void main(String[] args) {
        try {
            // Look up the remote object in the RMI registry
            CircleAreaInterface areaObj = (CircleAreaInterface) Naming.lookup("rmi://localhost:1099/CircleAreaService");
            
            // Get radius input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            
            // Call the remote method to calculate the area
            double area = areaObj.calculateArea(radius);
            System.out.println("The area of the circle is: " + area);
            
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
