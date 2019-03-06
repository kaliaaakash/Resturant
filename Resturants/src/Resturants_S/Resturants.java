package Resturants_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class Resturants {
	
	
	private JFrame frame;
	private JTextField textField_CheeseBurger;
	private JTextField textField_ChickenBurgerMeal;
	private JTextField textField_Qty;
	private JTextField textField_ChickenBurger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturants window = new Resturants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resturants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(37, 60, 510, 315);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCostD = new JLabel("Chicken Burger");
		lblCostD.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostD.setBounds(32, 23, 180, 38);
		panel.add(lblCostD);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurgerMeal.setBounds(32, 72, 227, 38);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheeseBurger.setBounds(32, 121, 166, 38);
		panel.add(lblCheeseBurger);
		
		textField_CheeseBurger = new JTextField();
		textField_CheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_CheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_CheeseBurger.setColumns(10);
		textField_CheeseBurger.setBounds(269, 127, 191, 32);
		panel.add(textField_CheeseBurger);
		
		textField_ChickenBurgerMeal = new JTextField();
		textField_ChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_ChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ChickenBurgerMeal.setColumns(10);
		textField_ChickenBurgerMeal.setBounds(269, 78, 191, 32);
		panel.add(textField_ChickenBurgerMeal);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrinks.setBounds(32, 187, 74, 38);
		panel.add(lblDrinks);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQty.setBounds(269, 187, 50, 38);
		panel.add(lblQty);
		
		JCheckBox chckbx_HomeDelivery = new JCheckBox("Home Delivery");
		chckbx_HomeDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbx_HomeDelivery.setBounds(32, 272, 163, 23);
		panel.add(chckbx_HomeDelivery);
		
		textField_Qty = new JTextField();
		textField_Qty.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Qty.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Qty.setColumns(10);
		textField_Qty.setBounds(269, 236, 191, 32);
		panel.add(textField_Qty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Tea", "Cola", "Coke", "Ice Tea", "Ice Coffee", "Orange Juice"}));
		comboBox.setBounds(32, 236, 180, 29);
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 170, 428, 6);
		panel.add(separator);
		
		textField_ChickenBurger = new JTextField();
		textField_ChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_ChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ChickenBurger.setColumns(10);
		textField_ChickenBurger.setBounds(269, 29, 191, 32);
		panel.add(textField_ChickenBurger);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(37, 386, 510, 208);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblChickenBurger_1 = new JLabel("Cost of Drinks");
		lblChickenBurger_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurger_1.setBounds(37, 23, 180, 38);
		panel_1.add(lblChickenBurger_1);
		
		JLabel lblCostM = new JLabel("Cost of Meal");
		lblCostM.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostM.setBounds(37, 73, 227, 38);
		panel_1.add(lblCostM);
		
		JLabel lblCost_Del = new JLabel("Cost of Delivery");
		lblCost_Del.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCost_Del.setBounds(37, 122, 176, 39);
		panel_1.add(lblCost_Del);
		
		JLabel labelCOfDrinks = new JLabel("");
		labelCOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelCOfDrinks.setBounds(269, 31, 206, 30);
		labelCOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(labelCOfDrinks);
		
		JLabel labelCOfMeal = new JLabel("");
		labelCOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelCOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCOfMeal.setBounds(269, 73, 206, 30);
		panel_1.add(labelCOfMeal);
		
		JLabel labelCOfDelivery = new JLabel("");
		labelCOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelCOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		labelCOfDelivery.setBounds(269, 122, 206, 30);
		panel_1.add(labelCOfDelivery);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(37, 634, 516, 116);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChickenBurger = Double.parseDouble(textField_ChickenBurger.getText());
				double iChickenBurger = 2.39;
				double Burger;
				Burger = (ChickenBurger * iChickenBurger);
				String pMeal = String.format("%.2f",Burger);
				labelCOfMeal.setText(pMeal);
			
				
				double ChickenBurgerMeal = Double.parseDouble(textField_ChickenBurgerMeal.getText());
				double iChickenBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChickenBurgerMeal * iChickenBurgerMeal);				
				String cbMeal = String.format("%.2f",BurgerMeal + Burger);
				labelCOfMeal.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(textField_CheeseBurger.getText());
				double iCheeseBurgerPrice = 3.30;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * iCheeseBurgerPrice);				
				String cheese = String.format("%.2f",CheeseBurgerMeal + BurgerMeal + Burger);
				labelCOfMeal.setText(cheese);
				
				//------------------------------Home Delivery----------------
				
				
				double iDelivery = 3.39;
				if(chckbx_HomeDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f",iDelivery);
					labelCOfDelivery.setText(pDelivery);
					}
				else
				{
					labelCOfDelivery.setText("0");
				}
				
				
				//-----------------------------Drinks---------------------------+
				
						 
				double Drinks = Double.parseDouble(textField_Qty.getText());
				double Tea = 1.20 * Drinks;
				double Ice_Tea = 0.90 * Drinks;
				double Coffee = 2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola = 2.10 * Drinks;
				double Coke = 1.60 * Drinks;
				double Orange_Juice = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				
				if(comboBox.getSelectedItem().equals("Apple Juice"));
				{
					String cApple_Juice = String.format("%.2f",Apple_Juice);
					labelCOfDrinks.setText(cApple_Juice);
					
				}
				
				if(comboBox.getSelectedItem().equals("Tea"));
				{
					String cTea = String.format("%.2f", Tea);
					labelCOfDrinks.setText(cTea);
					
				}
				
				if(comboBox.getSelectedItem().equals("Ice Tea"));
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					labelCOfDrinks.setText(cIce_Tea);
					
				}
				
				if(comboBox.getSelectedItem().equals("Coffee"));
				{
					String cCoffee= String.format("%.2f", Coffee);
					labelCOfDrinks.setText(cCoffee);
					
				}
				
				if(comboBox.getSelectedItem().equals("Ice_Coffee"));
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					labelCOfDrinks.setText(cIce_Coffee);
					
				}
				
				
				if(comboBox.getSelectedItem().equals("Cola"));
				{
					String cCola = String.format("%.2f", Cola);
					labelCOfDrinks.setText(cCola);
					
				}
				
				if(comboBox.getSelectedItem().equals("Coke"));
				{
					String cCoke = String.format("%.2f", Coke);
					labelCOfDrinks.setText(cCoke);
					
				}
				
				
				if(comboBox.getSelectedItem().equals("Orange_Juice"));
				{
					String cOrange_Juice = String.format("%.2f", Orange_Juice);
					labelCOfDrinks.setText(cOrange_Juice);
					
				}
				
				/* if (comboBox.getSelectedItem().equals("Select a Drink"));
				 
				{
					labelCOfDrinks.setText("0");
					
				}*/
				
				
				// =======================All Total==================================
				
				/*
				double cTotal1 = Double.parseDouble(labelCOfDrinks.getText());
				double cTotal2 = Double.parseDouble(labelCOfMeal.getText());
				double cTotal3 = Double.parseDouble(labelCOfDelivery.getText());
				double allTotal = (cTotal1 + cTotal2 + cTotal3 );
				String iTotal = String.format("%.2f", allTotal);
				label.setText(iTotal);
				*/
				
							
									
				
			}
			
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTotal.setBounds(41, 39, 101, 48);
		panel_5.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_ChickenBurger.setText(null);
				textField_ChickenBurgerMeal.setText(null);
				textField_CheeseBurger.setText(null);
				textField_Qty.setText(null);
				labelCOfDrinks.setText(null);
				labelCOfMeal.setText(null);
				labelCOfDelivery.setText(null);
				comboBox.setSelectedItem("Select a Drink");
				//label.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(213, 40, 101, 47);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(368, 40, 95, 47);
		panel_5.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Resturant Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(110, 0, 384, 53);
		frame.getContentPane().add(lblNewLabel);
	}
}
