import java.rmi.Remote;
import java.rmi.RemoteException;
public interface remote extends Remote{
    void printMsg() throws RemoteException;
}