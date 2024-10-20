import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CircleAreaServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start the RMI registry on port 1099
            CircleAreaImpl areaObj = new CircleAreaImpl();
            Naming.rebind("rmi://localhost:1099/CircleAreaService", areaObj); // Bind the object to the RMI registry
            System.out.println("Circle Area Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
