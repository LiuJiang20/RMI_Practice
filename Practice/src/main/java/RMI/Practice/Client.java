package RMI.Practice;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Registry registry = LocateRegistry.getRegistry("127.0.0.1");
			Server server = (Server)registry.lookup("HelloServer");
			server.hello();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
