package RMI.Practice;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote,Serializable
{
	
	public String hello() throws RemoteException;
	
}

