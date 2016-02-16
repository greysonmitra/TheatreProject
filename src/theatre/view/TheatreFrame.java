package theatre.view;

import javax.swing.*;
import theatre.controller.TheatreController;

public class TheatreFrame extends JFrame
{
	private TheatreController baseController;
	private TheatrePanel basePanel;
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(600,600); 			
		this.setTitle("The Theatre");
		this.setResizable(false);       
		this.setVisible(true);
	}
	
	public TheatreFrame(TheatreController baseController)
	{
		this.baseController = baseController;
		basePanel = new TheatrePanel(baseController);
		setupFrame();
	}
	
	public TheatreController getBaseController()
	{
		return baseController;
	}
}
