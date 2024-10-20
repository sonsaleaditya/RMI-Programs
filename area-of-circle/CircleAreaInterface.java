import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CircleAreaInterface extends Remote {
    double calculateArea(double radius) throws RemoteException;
}
