package Server;

import java.net.Socket;

import net.sf.lipermi.net.IServerListener;

public class ServerListner implements IServerListener
{
	public static int SERVER_PORT = 12345;
	@Override
	public void clientConnected(Socket socket) 
	{
		System.out.println("Client connected: " + socket.getInetAddress());
	}

	@Override
	public void clientDisconnected(Socket socket) 
	{
		System.out.println("Client disconnected: " + socket.getInetAddress());	
	}
}
