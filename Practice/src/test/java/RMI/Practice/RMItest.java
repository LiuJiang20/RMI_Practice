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

class RMItest extends TestCase
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
		System.out.println("Hello");
		Registry registry = LocateRegistry.createRegistry(1099);
		Server server = new Server();
		Server stub = (Server)UnicastRemoteObject.exportObject(server, 1099);
		registry.rebind("server",stub );
	}

	@Test
	void test() throws RemoteException, NotBoundException
	{
		Registry registry = LocateRegistry.getRegistry(1099);
		Server server ;
			
		server = (Server)registry.lookup("HelloServer");
		server.hello();
		assertEquals("Hello from server!", server.hello());
	
		
	}
	

}
