import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Server extends ImplExemple{
    public Server(){}
    public static void main(String[] args) {
        try {
            ImplExemple obj = new ImplExemple();
            
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj,0);
            
            Registry registry = LocateRegistry.getRegistry();
           
            registry.bind("Hello",stub);
            System.err.println("server ready");
        } catch (Exception e) {
            System.err.println("server exception: "+e.toString());
            e.printStackTrace();
        }
    }
}
