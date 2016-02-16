package theatre.controller;

import theatre.view.*;
import theatre.model.*;
import javax.swing.*;

public class TheatreController 
{
	private TheatreController baseController;
	private int[][] myTheatre;
	private TheatreFrame baseFrame;
	private Theatre theatre;
	private String seatChecked;
	private TheatreView myDisplay;
	private JTextArea purchaseArea;
	
	public TheatreController()
	{
		myDisplay = new TheatreView();
		myTheatre = new int[10][26];
		baseFrame = new TheatreFrame(this);
		theatre = new Theatre();
		purchaseArea = new JTextArea();
	}
	
	public void start()
	{
		myDisplay.showResponse("Hello, please place your order in the text box to the left.");
		
	}
	
	private void shutDown()
	{
		
	}
	
	public String processOrder(String currentOrder)
	{
		
		
		 
		
		return seatChecked;
	}
	
	public int[][] getTheatre2D()
	 {
	   int number = (int) Math.random();
	   int letter = (int) Math.random();
	   int[][] myTheatre = new int[number][letter];
	   int A1 = myTheatre[0][0];
	   
	   for (int row = 0; row < myTheatre.length; row++)
	   {
		   for (int col = 0; col < myTheatre[0].length; col++) 
		   {
			   if(myTheatre[row][col] == A1)
			   {
				   purchaseArea.setText("Seat A1 is open.");
			   }
				
		   }
	   }
	   // 	 myTheatre[row][col] = new int(this,col,row);
	    
	   return myTheatre;
	 }
	
	public String userToRegister(String userText)
	{
		String response = "";
		
		response = theatre.processOrder(userText);
		
		return response;
	}
	
	
	public TheatreView getTheatreView()
	{
		return myDisplay;
	}
	
	public TheatreFrame getBaseFrame()
	{
		return baseFrame;
	}
}
