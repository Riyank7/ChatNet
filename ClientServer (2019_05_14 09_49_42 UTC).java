
import javax.swing.*;

//Class to precise who is connected : Client or Server
public class ClientServer {

	
	public static void main(String [] args){
		
		Object[] selectioValues = { "Server","Client"};
		String initialSection = "Server";
		
		Object selection = JOptionPane.showInputDialog(null, "Login as : ", "MyChatApp", JOptionPane.QUESTION_MESSAGE, null, selectioValues, initialSection);
		if(selection.equals("Server"))
		{
			
                   String[] arguments = new String[] {};
                   
                   int portno1=Integer.parseInt(JOptionPane.showInputDialog("Enter the port number"));
                   
                   new MultiThreadChatServerSync().main(arguments,portno1);
		}
		
		
		
		else if(selection.equals("Client"))
		{
				String IPServer = JOptionPane.showInputDialog("Enter the Server ip adress");
                        
				String[] arguments = new String[] {IPServer};
                        
				int portno=Integer.parseInt(JOptionPane.showInputDialog("Enter the port number"));
                        
				new ChatClient().main(arguments,portno);
		}
		
	}

}
