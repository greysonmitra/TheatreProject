package theatre.model;

import theatre.view.*;
import javax.swing.JOptionPane;

public class Theatre 
{
	private String buyerName;
	private String orderContents;
	private int numberOfSeats;
	
	public Theatre()
	{
		
	}
	
	public String processOrder(String currentOrder)
	{
		String nextQuestion = "What row do you want to sit in";
		
		return nextQuestion;
	}
	
	public int getSeatNumbers(int position)
	{
	
	return position;
	}
}

/* my checklist: need listeners to submit info, someway to name and retrieve info for processing, need something
to process that info, and display that info. InputCheckers & detailed info are low priority. */