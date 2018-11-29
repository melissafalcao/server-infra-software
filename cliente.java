import java.rmi.*;
public class client{
    private client(){}
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry(null);

            remote stub = (remote)registry.lookup("remote");

            stub.printMsg();
        } catch (Exception e) {
            System.err.println("client exception");
            e.printStackTrace();
        }
    }
}