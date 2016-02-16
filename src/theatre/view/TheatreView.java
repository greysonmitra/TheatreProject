package theatre.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TheatreView 
{
	private String popupMessage;
	private ImageIcon ticketIcon;

	
	public TheatreView()
	{
		popupMessage = "Hello, would you like to reserve some seats in the Theatre ";
		ticketIcon = new ImageIcon(getClass().getResource("Images/10.jpg"));
	}
	
	
	public void showResponse(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText);
	}
	
	
	public String grabText(String displayText)
	{
		String returnedText = "";
		
		returnedText = JOptionPane.showInputDialog(null, displayText, popupMessage, JOptionPane.PLAIN_MESSAGE, ticketIcon, null, "Answer here") + ""; ;
		
		return returnedText;
	}
	
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText, popupMessage, JOptionPane.INFORMATION_MESSAGE, ticketIcon);
	}
}
