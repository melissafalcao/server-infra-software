import java.rmi.RemoteException;
public class ImplExemple  implements Hello{
    public ImplExemple(){}
    public void printMsg() throws RemoteException{
        System.out.println("oi");
    }
}