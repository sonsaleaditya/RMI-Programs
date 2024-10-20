import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CircleAreaImpl extends UnicastRemoteObject implements CircleAreaInterface {
    
    public CircleAreaImpl() throws RemoteException {
        super();
    }
    
    @Override
    public double calculateArea(double radius) throws RemoteException {
        return Math.PI * radius * radius;
    }
}
