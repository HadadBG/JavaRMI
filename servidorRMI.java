import java.rmi.Naming;
import java.rmi.Remote;

public class servidorRMI {
    public static void main(String[] args) throws Exception{
        String url = "rmi://localhost/prueba";
        ClaseRMI obj = new ClaseRMI();
        Naming.rebind(url,(Remote)obj);
    }    

}
