package theatre.view;

import javax.swing.*;

import java.awt.Color;
import java.awt.color.*;
import java.awt.event.*;
import theatre.controller.TheatreController;

public class TheatrePanel extends JPanel
{
	private TheatreController baseController;
	private JButton orderButton;
	private JTextField orderField;
	private SpringLayout baseLayout;
	private JLabel orderLabel;
	private JTextArea purchaseArea;
	private ImageIcon seatIcon;
	
	public TheatrePanel(TheatreController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		purchaseArea = new JTextArea(10,40);
		baseLayout.putConstraint(SpringLayout.WEST, purchaseArea, 123, SpringLayout.WEST, this);
		orderButton = new JButton("Submit order");
		baseLayout.putConstraint(SpringLayout.NORTH, orderButton, 318, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, purchaseArea, -34, SpringLayout.NORTH, orderButton);
		orderField = new JTextField(20);
		baseLayout.putConstraint(SpringLayout.WEST, orderButton, 63, SpringLayout.EAST, orderField);
		baseLayout.putConstraint(SpringLayout.NORTH, orderField, 1, SpringLayout.NORTH, orderButton);
		baseLayout.putConstraint(SpringLayout.WEST, orderField, 0, SpringLayout.WEST, purchaseArea);
		orderLabel = new JLabel("Order Here");
		baseLayout.putConstraint(SpringLayout.NORTH, orderLabel, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, orderLabel, 265, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(purchaseArea);
		this.add(orderButton);
		this.add(orderField);
		this.add(orderLabel);
		orderField.setToolTipText("Type here to enter your order");
		purchaseArea.setEnabled(false);
		purchaseArea.setWrapStyleWord(true);
		purchaseArea.setLineWrap(true); 
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		orderButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				
				String userText = orderField.getText(); 
				purchaseArea.setText(userText); 
				orderField.setText(""); 
				String response = baseController.userToRegister(userText); 
				purchaseArea.append(response); //display the response
			}	
		});
	}
	
}
