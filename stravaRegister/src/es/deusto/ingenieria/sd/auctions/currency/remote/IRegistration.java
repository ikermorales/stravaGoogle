package es.deusto.ingenieria.sd.auctions.currency.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRegistration extends Remote {
	public float getUSDRate() throws RemoteException;
	public float getGBPRate() throws RemoteException;
}
