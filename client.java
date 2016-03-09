 
import java.net.*;
import java.net.DatagramSocket;
import java.io.*;
import java.io.IOException;

public class client{

	private InetAddress client;
	private int port;
	private DatagramPacket p;
	private DatagramSocket s;
	
public client(int port, String adress)throws  UnknownHostException{

this.client = InetAddress.getByName(adress);
this.s = new DatagramSocket();
this.port = port;
}
public void envoieMsg(String msg)throws IOException{
byte[] b = msg.getBytes();
this.p = new DatagramPacket(b,b.length,this.client,this.port);
 this.s.send(p);
}

}
