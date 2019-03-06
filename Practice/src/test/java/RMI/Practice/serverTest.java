package RMI.Practice;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class serverTest 
{

	@BeforeAll
	static void setUpBeforeClass() 
	{
		Registry registry;
		try
		{
			registry = LocateRegistry.createRegistry(1099);
			Server server = new RealServer();
			Server stub = (Server)UnicastRemoteObject.exportObject(server, 0);
			registry.rebind("server",stub);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	void test() 
	{
		
		try
		{
			Registry registry;
			registry = LocateRegistry.getRegistry(1099);
			Server server ;
			
			server = (Server)registry.lookup("server");
			server.hello();
			assertEquals("Hello from server!", server.hello());
			assertEquals("Hello from server!", "a");
			
		
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
