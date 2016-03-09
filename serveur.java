 
import java.net.*;
import java.io.*;
import java.io.IOException;

public class serveur{

	private InetAddress client;
	private int port;
	private DatagramPacket p;
	private DatagramSocket s;
try{	
	public serveur(int port)throws  IOExeption{
	this.s = new DatagramSocket(port);
	this.port = port;
	}
	public String recevoirMsg(String msg){
	byte[] b = new byte[11];
	this.p = new DatagramPacket(b,b.length);
	this.s.receive(p);
	return new String(b);
	}
}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Avez-vous donne le nom de la machine destinatrice et le numero de port du client ?");
		}
		catch(UnknownHostException exc) {
			System.out.println("Destinataire inconnu");
		}
		catch(SocketException exc) {
			System.out.println("Probleme d'ouverture de la socket");
		}
		catch(IOException exc) {
			System.out.println("Probleme sur la reception ou l'envoi du message");
		}
		catch(NumberFormatException exc) {
			System.out.println("Le second argument doit etre un entier");
		}
}
