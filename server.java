import java.rmi.*;
public class server extends implementacao{
    public server(){}
    public static void main(String[] args) {
        try {
            implementacao obj = new implementacao();
            
            remote stub = (remote) UnicastRemoteObject.exportObject(obj,0);
            
            Registry registry = LocateRegistry.getRegistry();
           
            registry.bind("remote",stub);
            System.err.println("server ready");
        } catch (Exception e) {
            System.err.println("server exception: "+e.toString());
            e.printStackTrace();
        }
    }
}
