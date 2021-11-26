package es.deusto.ingenieria.sd.auctions.currency.remote;

import java.rmi.Remote; 
import java.rmi.RemoteException;


public interface IRegistrationGoogle extends Remote {

	public boolean checkUsuarioGoogle(String email, String contrasenya);
}
