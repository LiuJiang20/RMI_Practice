package RMI.Practice;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RealServer implements Server
{

	public RealServer()
	{
		// TODO Auto-generated constructor stub
	}

	public String hello() throws RemoteException
	{
		
		return "Hello from server!";
	}
	
	
//	public static void main(String[] args) throws RemoteException
//	{
//		Server rServer = new Server();
//		Server stub = (Server)UnicastRemoteObject.exportObject(rServer, 0);
//		Registry registry = LocateRegistry.getRegistry();
//		try
//		{
//			registry.bind("HelloServer", stub);
//		} catch (AlreadyBoundException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Wrong!");
//		}
//		
//	}
}
