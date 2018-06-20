package LoginHere;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Restaurant {

	private JFrame frame;
	
	private JTextField textSubTotal;
	private JTextField textTotalCost;
	private JTextField textTax;
	private JTextField textAppetizers;
	private JTextField textSandwiches;
	private JTextField textSalads;
	private JTextField textSelections;
	private JTextField textSteaks;
	private JTextField textKidsMeal;
	private JTextField textLunch;
	private JTextField textSidesExtras;
	private JTextField textSoups;
	private JTextField textDesserts;
	private JTextField textBeverages;

	
	private JTextField textPrice1;
	private JTextField textPrice2;
	private JTextField textPrice3;
	private JTextField textPrice4;
	private JTextField textPrice5;
	private JTextField textPrice6;
	private JTextField textPrice7;
	private JTextField textPrice8;
	private JTextField textPrice9;
	private JTextField textPrice10;
	private JTextField textPrice11;
	
	private static final double TAX_RATE = 7.98/100;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(0, 0, 1025, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(49, 56, 494, 326);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAppetizers = new JLabel("Appetizers");
		lblAppetizers.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAppetizers.setBounds(31, 18, 102, 24);
		panel.add(lblAppetizers);
		
		JLabel lblSandwiches = new JLabel("Sandwiches");
		lblSandwiches.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSandwiches.setBounds(31, 46, 102, 24);
		panel.add(lblSandwiches);
		
		JLabel lblSalads = new JLabel("Salads");
		lblSalads.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSalads.setBounds(31, 70, 102, 24);
		panel.add(lblSalads);
		
		JLabel lblSelections = new JLabel("Selections");
		lblSelections.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSelections.setBounds(31, 95, 102, 24);
		panel.add(lblSelections);
		
		JLabel lblSteaks = new JLabel("Steaks");
		lblSteaks.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSteaks.setBounds(31, 122, 102, 24);
		panel.add(lblSteaks);
		
		JLabel lblKidsMeal = new JLabel("Kid's Meal");
		lblKidsMeal.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblKidsMeal.setBounds(31, 147, 102, 24);
		panel.add(lblKidsMeal);
		
		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblLunch.setBounds(31, 170, 102, 24);
		panel.add(lblLunch);
		
		JLabel lblSidesExtras = new JLabel("Sides & Extras");
		lblSidesExtras.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSidesExtras.setBounds(31, 193, 102, 24);
		panel.add(lblSidesExtras);
		
		JLabel lblSoups = new JLabel("Soups");
		lblSoups.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSoups.setBounds(31, 217, 89, 24);
		panel.add(lblSoups);
		
		JLabel lblDesserts = new JLabel("Desserts");
		lblDesserts.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDesserts.setBounds(31, 243, 102, 24);
		panel.add(lblDesserts);
		
		JLabel lblBeverages = new JLabel("Beverages");
		lblBeverages.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblBeverages.setBounds(31, 267, 102, 24);
		panel.add(lblBeverages);
		
		JComboBox comboAppetizers = new JComboBox();
		comboAppetizers.setModel(new DefaultComboBoxModel(new String[] {"Select", "Chicken Wings"}));
		comboAppetizers.setBounds(152, 19, 119, 27);
		panel.add(comboAppetizers);
		
		JComboBox comboSandwiches = new JComboBox();
		comboSandwiches.setModel(new DefaultComboBoxModel(new String[] {"Select", "Cheeseburger", "Chicken Sandwich", "Ribeye Steak Sandwich"}));
		comboSandwiches.setBounds(152, 47, 119, 27);
		panel.add(comboSandwiches);
		
		JComboBox comboSalads = new JComboBox();
		comboSalads.setModel(new DefaultComboBoxModel(new String[] {"Select", "Club Salad", "Grilled Shrimp Chef Salad", "Grilled Chicken Chef Salad", "Grilled Ham Chef Salad", "Grilled Beef Tips Salad", "Grilled Salmon Salad", "Side Salad"}));
		comboSalads.setBounds(152, 71, 119, 27);
		panel.add(comboSalads);
		
		JComboBox comboSelections = new JComboBox();
		comboSelections.setModel(new DefaultComboBoxModel(new String[] {"Select", "Grilled Shrimp", "Grilled Chicken Breast Filet", "Center Cut Pork Chops", "Salmon Filet"}));
		comboSelections.setBounds(152, 96, 119, 27);
		panel.add(comboSelections);
		
		JComboBox comboSteaks = new JComboBox();
		comboSteaks.setModel(new DefaultComboBoxModel(new String[] {"Select", "Beef Tips - Regular", "Beef Tips - Large", "Beef Tips - Extra Large", "Ribeye Steak", "Filet Mignon", "T-Bone Steak", "Sirloin Steak", "Chopped Steaks"}));
		comboSteaks.setBounds(152, 123, 119, 27);
		panel.add(comboSteaks);
		
		JComboBox comboKidsMeal = new JComboBox();
		comboKidsMeal.setModel(new DefaultComboBoxModel(new String[] {"Select", "Mini Corn Dogs", "Chicken Fries"}));
		comboKidsMeal.setBounds(152, 148, 119, 27);
		panel.add(comboKidsMeal);
		
		JComboBox comboLunch = new JComboBox();
		comboLunch.setModel(new DefaultComboBoxModel(new String[] {"Select", "Beef Tips", "Grilled Chicken Breast Filet", "Chopped Steak", "Center Cut Pork Chops", "Grilled Shrip"}));
		comboLunch.setBounds(152, 171, 119, 27);
		panel.add(comboLunch);
		
		JComboBox comboSides = new JComboBox();
		comboSides.setModel(new DefaultComboBoxModel(new String[] {"Select", "Super Stuffed Baked Potato", "Loaded Baked Potato", "Side Salad", "Baked Potato(Butter & Sour Cream)", "Green Beens", "Garlic Mashed Potatoes", "Macaroni & Cheese", "Baked Beans", "Cinnamon Apples", "10 pc. Grilled Shrimp", "Grilled Chicen or Ham Cup", "Grilled Onions or Mushrooms", "Cheedar Cheese Cup", "Real Bacon Pieces Cup", "Lay's Classic Potato Chips", "Fresh Baked Dinner Roll", "Half-Dozen Dinner Rolls", "Salad Dressing, or Cocktail Sauce"}));
		comboSides.setBounds(152, 194, 119, 27);
		panel.add(comboSides);
		
		JComboBox comboSoups = new JComboBox();
		comboSoups.setModel(new DefaultComboBoxModel(new String[] {"Select", "Papa's Chilli", "Broccoli & Cheese", "Loaded Potato Soup"}));
		comboSoups.setBounds(152, 218, 119, 27);
		panel.add(comboSoups);
		
		JComboBox comboDesserts = new JComboBox();
		comboDesserts.setModel(new DefaultComboBoxModel(new String[] {"Select", "Chocolate Chip Cookie", "Chocolate Mousse Cake", "New York Style Cheesecake", "Granny Caramel Apple Pie", "Ultimate Chocolate Cake"}));
		comboDesserts.setBounds(152, 244, 119, 27);
		panel.add(comboDesserts);
		
		JComboBox comboBeverages = new JComboBox();
		comboBeverages.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fresh Brewed Iced TEa", "Coke", "Diet Coke", "Dr. Pepper", "Diet Dr. Pepper", "Sprite", "Lemonade", "Bottled Spring Water"}));
		comboBeverages.setBounds(152, 268, 119, 27);
		panel.add(comboBeverages);
		
		textAppetizers = new JTextField();
		textAppetizers.setBounds(299, 18, 70, 26);
		panel.add(textAppetizers);
		textAppetizers.setColumns(10);
		
		textSandwiches = new JTextField();
		textSandwiches.setColumns(10);
		textSandwiches.setBounds(299, 48, 70, 26);
		panel.add(textSandwiches);
		
		textSalads = new JTextField();
		textSalads.setColumns(10);
		textSalads.setBounds(299, 72, 70, 26);
		panel.add(textSalads);
		
		textSelections = new JTextField();
		textSelections.setColumns(10);
		textSelections.setBounds(299, 95, 70, 26);
		panel.add(textSelections);
		
		textSteaks = new JTextField();
		textSteaks.setColumns(10);
		textSteaks.setBounds(299, 122, 70, 26);
		panel.add(textSteaks);
		
		textKidsMeal = new JTextField();
		textKidsMeal.setColumns(10);
		textKidsMeal.setBounds(299, 147, 70, 26);
		panel.add(textKidsMeal);
		
		textLunch = new JTextField();
		textLunch.setColumns(10);
		textLunch.setBounds(299, 170, 70, 26);
		panel.add(textLunch);
		
		textSidesExtras = new JTextField();
		textSidesExtras.setColumns(10);
		textSidesExtras.setBounds(299, 193, 70, 26);
		panel.add(textSidesExtras);
		
		textSoups = new JTextField();
		textSoups.setColumns(10);
		textSoups.setBounds(299, 217, 70, 26);
		panel.add(textSoups);
		
		textDesserts = new JTextField();
		textDesserts.setColumns(10);
		textDesserts.setBounds(299, 243, 70, 26);
		panel.add(textDesserts);
		
		textBeverages = new JTextField();
		textBeverages.setColumns(10);
		textBeverages.setBounds(299, 267, 70, 26);
		panel.add(textBeverages);
		
		textPrice1 = new JTextField();
		textPrice1.setBounds(381, 18, 95, 26);
		panel.add(textPrice1);
		textPrice1.setColumns(10);
		
		textPrice2 = new JTextField();
		textPrice2.setColumns(10);
		textPrice2.setBounds(381, 48, 95, 26);
		panel.add(textPrice2);
		
		textPrice3 = new JTextField();
		textPrice3.setColumns(10);
		textPrice3.setBounds(381, 70, 95, 26);
		panel.add(textPrice3);
		
		textPrice4 = new JTextField();
		textPrice4.setColumns(10);
		textPrice4.setBounds(381, 95, 95, 26);
		panel.add(textPrice4);
		
		textPrice5 = new JTextField();
		textPrice5.setColumns(10);
		textPrice5.setBounds(381, 122, 95, 26);
		panel.add(textPrice5);
		
		textPrice6 = new JTextField();
		textPrice6.setColumns(10);
		textPrice6.setBounds(381, 147, 95, 26);
		panel.add(textPrice6);
		
		textPrice7 = new JTextField();
		textPrice7.setColumns(10);
		textPrice7.setBounds(381, 170, 95, 26);
		panel.add(textPrice7);
		
		textPrice8 = new JTextField();
		textPrice8.setColumns(10);
		textPrice8.setBounds(381, 193, 95, 26);
		panel.add(textPrice8);
		
		textPrice9 = new JTextField();
		textPrice9.setColumns(10);
		textPrice9.setBounds(381, 217, 95, 26);
		panel.add(textPrice9);
		
		textPrice10 = new JTextField();
		textPrice10.setColumns(10);
		textPrice10.setBounds(381, 245, 95, 26);
		panel.add(textPrice10);
		
		textPrice11 = new JTextField();
		textPrice11.setColumns(10);
		textPrice11.setBounds(381, 267, 95, 26);
		panel.add(textPrice11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(49, 382, 494, 164);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSubTotal.setBounds(34, 33, 117, 25);
		panel_1.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTax.setBounds(34, 70, 117, 25);
		panel_1.add(lblTax);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTotalCost.setBounds(34, 112, 117, 25);
		panel_1.add(lblTotalCost);
		
		textSubTotal = new JTextField();
		textSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textSubTotal.setBounds(156, 33, 130, 26);
		panel_1.add(textSubTotal);
		textSubTotal.setColumns(10);
		
		textTotalCost = new JTextField();
		textTotalCost.setHorizontalAlignment(SwingConstants.RIGHT);
		textTotalCost.setColumns(10);
		textTotalCost.setBounds(156, 112, 130, 26);
		panel_1.add(textTotalCost);
		
		textTax = new JTextField();
		textTax.setHorizontalAlignment(SwingConstants.RIGHT);
		textTax.setColumns(10);
		textTax.setBounds(156, 70, 130, 26);
		panel_1.add(textTax);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(555, 56, 439, 490);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textAreaReceit = new JTextArea();
		textAreaReceit.setBounds(6, 6, 427, 478);
		panel_2.add(textAreaReceit);
		textAreaReceit.setLineWrap(true);
		textAreaReceit.setWrapStyleWord(true);
		
		JButton btnReciet = new JButton("Reciet");
		btnReciet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String str = "               \tPADMAJA RESTAURANTS:\n\n\n";
				str += "******************************WELCOME******************************\n\n";
				
				if(comboAppetizers.getSelectedItem()!="Select"){
					str += "\n"+comboAppetizers.getSelectedItem()+"\t\t\t"+Double.parseDouble(textPrice1.getText());
				}
				if(comboSandwiches.getSelectedItem()!="Select"){
					str += "\n"+comboSandwiches.getSelectedItem()+"\t\t\t"+Double.parseDouble(textPrice2.getText());
				}
				if(comboSalads.getSelectedItem()!="Select"){
					str += "\n"+comboSalads.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice3.getText());
				}
				if(comboSelections.getSelectedItem()!="Select"){
					str += "\n"+comboSelections.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice4.getText());
				}
				if(comboSteaks.getSelectedItem()!="Select")	{
					str += "\n"+comboSteaks.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice5.getText());
				}
				if(comboSteaks.getSelectedItem()!="Select"){
					str += "\n" +comboKidsMeal.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice6.getText());
				}
				if(comboLunch.getSelectedItem()!="Select"){
					str += "\n"+comboLunch.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice7.getText());
				}
				if(comboSides.getSelectedItem()!="Select"){
					str += "\n" +comboSides.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice8.getText());
				}
				if(comboSoups.getSelectedItem()!="Select"){
					str += "\n"+comboSoups.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice9.getText());
				}
				if(comboDesserts.getSelectedItem()!="Select"){
					str += "\n"+comboDesserts.getSelectedItem()+"\t\t"+Double.parseDouble(textPrice10.getText());
				}
				if(comboBeverages.getSelectedItem()!="Select"){
					str += "\n"+comboBeverages.getSelectedItem()+"\t\t\t"+Double.parseDouble(textPrice11.getText());
				}
				
				str += "\n\n\n"+"Sub Total: \t\t"+textSubTotal.getText();
				str += "\n\n\n"+"Tax   : \t\t"+textTax.getText();
				str += "\n\n\n"+"Total Cost: \t\t"+textTotalCost.getText();
				str += "\n\n\n*****************************THANKYOU******************************";
				textAreaReceit.append(str);
				 
					 
			}
			
		});
		btnReciet.setBounds(348, 70, 117, 29);
		panel_1.add(btnReciet);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double total = 0;
			
				textSubTotal.setText(String.format("%.2f", total));
				
				textAppetizers.setText("");
				textSandwiches.setText("");
				textSalads.setText("");
				textSelections.setText("");
				textSteaks.setText("");
				textKidsMeal.setText("");
				textLunch.setText("");
				textSidesExtras.setText("");
				textSoups.setText("");
				textDesserts.setText("");
				textBeverages.setText("");
				textSubTotal.setText("");
				textTax.setText("");
				textTotalCost.setText("");
				textSubTotal.setText("");
				textTotalCost.setText("");
				textTax.setText("");
				textPrice1.setText("");
				textPrice2.setText("");
				textPrice3.setText("");
				textPrice4.setText("");
				textPrice5.setText("");
				textPrice6.setText("");
				textPrice7.setText("");
				textPrice8.setText("");
				textPrice9.setText("");
				textPrice10.setText("");
				textPrice11.setText("");
				
				comboAppetizers.setSelectedItem("Select");
				comboSandwiches.setSelectedItem("Select");
				comboSalads.setSelectedItem("Select");
				comboSelections.setSelectedItem("Select");
				comboSteaks.setSelectedItem("Select");
				comboKidsMeal.setSelectedItem("Select");
				comboLunch.setSelectedItem("Select");
				comboSides.setSelectedItem("Select");
				comboSoups.setSelectedItem("Select");
				comboDesserts.setSelectedItem("Select");
				comboBeverages.setSelectedItem("Select");
				
				
			}
		});
		btnReset.setBounds(348, 112, 117, 29);
		panel_1.add(btnReset);
		
		textAppetizers.setText("");
		textSandwiches.setText("");
		textSalads.setText("");
		textSelections.setText("");
		textSteaks.setText("");
		textKidsMeal.setText("");
		textLunch.setText("");
		textSidesExtras.setText("");
		textSoups.setText("");
		textDesserts.setText("");
		textBeverages.setText("");
		textSubTotal.setText("");
		textTax.setText("");
		textTotalCost.setText("");
		textSubTotal.setText("");
		textTotalCost.setText("");
		textTax.setText("");
		textPrice1.setText("");
		textPrice2.setText("");
		textPrice3.setText("");
		textPrice4.setText("");
		textPrice5.setText("");
		textPrice6.setText("");
		textPrice7.setText("");
		textPrice8.setText("");
		textPrice9.setText("");
		textPrice10.setText("");
		textPrice11.setText("");
		textAreaReceit.setText("");
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			     double total = 0;
			     textSubTotal.setText(String.format("%.2f", total));
				
				//List of Appetizers
				double appetizers = Double.parseDouble(textAppetizers.getText());
				double chickenWings = 8.49*appetizers;
				double price1 = 0;
				
				if(comboAppetizers.getSelectedItem().equals("Chicken Wings")){
					price1 += chickenWings;
					textPrice1.setText(String.format("%.2f", price1));
				}
				if(comboAppetizers.getSelectedItem().equals("Select")){
					price1 += 0;
					textAppetizers.setText("0");
					textPrice1.setText(String.format("%.2f", price1));
				}
				
				//List of Sandwiches
				double sandwiches = Double.parseDouble(textSandwiches.getText());
				double cheeseBurger = 8.99*sandwiches;
				double chickenSandwich = 6.99*sandwiches;
				double RibeyeSteakSandwich = 7.99*sandwiches;
				double price2 = 0;
				
				if(comboSandwiches.getSelectedItem().equals("Cheeseburger")){
					price2 += cheeseBurger;
					textPrice2.setText(String.format("%.2f", price2));
				}
				if(comboSandwiches.getSelectedItem().equals("Chicken Sandwich")){
					price2 += chickenSandwich;
					textPrice2.setText(String.format("%.2f", price2));
				}
				if(comboSandwiches.getSelectedItem().equals("Ribeye Steak Sandwich")){
					price2 += RibeyeSteakSandwich;
					textPrice2.setText(String.format("%.2f", price2));
				}
				if(comboSandwiches.getSelectedItem().equals("Select")){
					price2 += 0;
					textSandwiches.setText("0");
					textPrice2.setText(String.format("%.2f", price2));
				}
				
				//List of Salads
				double salads = Double.parseDouble(textSalads.getText());
				double clubSalad = 7.99*salads;
				double grilledShrimpChefSalad = 7.99*salads;
				double grilledChickenChefSalad = 7.79*salads;
				double grilledHamChefSalad = 7.79*salads;
				double grilledBeefTipsSalad = 7.79*salads;
				double grilledSalmonSalad = 7.79*salads;
				double sideSalad = 7.79*salads;
				double price3 = 0;
				
				
				if(comboSalads.getSelectedItem().equals("Club Salad")){
					price3 += clubSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Grilled Shrimp Chef Salad")){
					price3 += grilledShrimpChefSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Grilled Chicken Chef Salad")){
					price3 += grilledChickenChefSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Grilled Ham Chef Salad")){
					price3 += grilledHamChefSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Grilled Beef Tips Salad")){
					price3 += grilledBeefTipsSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Grilled Salmon Salad")){
					price3 += grilledSalmonSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Side Salad")){
					price3 += sideSalad;
					textPrice3.setText(String.format("%.2f", price3));
				}
				if(comboSalads.getSelectedItem().equals("Select")){
					price3 += 0;
					textSalads.setText("0");
					textPrice3.setText(String.format("%.2f", price3));
				}
				
				//List of Selections
				double selections = Double.parseDouble(textSelections.getText());
				double grilledShrimp = 13.79*selections;
				double grilledChickenBreast = 10.99*selections;
				double centerCutPorkChops = 14.99*selections;
				double salmonFilet = 11.99*selections;
				double price4 = 0;
				
				if(comboSelections.getSelectedItem().equals("Grilled Shrimp")){
					price4 += grilledShrimp;
					textPrice4.setText(String.format("%.2f", price4));
				}
				if(comboSelections.getSelectedItem().equals("Grilled Chicken Breast Filet")){
					price4 += grilledChickenBreast;
					textPrice4.setText(String.format("%.2f", price4));
				}
				if(comboSelections.getSelectedItem().equals("Center Cut Pork Chops")){
					price4 += centerCutPorkChops;
					textPrice4.setText(String.format("%.2f", price4));
				}
				if(comboSelections.getSelectedItem().equals("Salmon Filet")){
					price4 += salmonFilet;
					textPrice4.setText(String.format("%.2f", price4));
				}
				if(comboSelections.getSelectedItem().equals("Select")){
					price4 += 0;
					textSelections.setText("0");
					textPrice4.setText(String.format("%.2f", price4));
				}
				
				//List of Steaks
				double steaks = Double.parseDouble(textSteaks.getText());
				double beefTipsRegular = 10.99*steaks;
				double beefTipsLarge = 12.99*steaks;
				double beefTipsExtraLarge = 15.99*steaks;
				double ribeyeSteak = 15.99*steaks;
				double filetMignon = 16.99*steaks;
				double tBoneSteak = 16.99*steaks;
				double sirloinSteak = 11.99*steaks;
				double choppedSteaks = 10.99*steaks;
				double price5 = 0;
				
				if(comboSteaks.getSelectedItem().equals("Beef Tips - Regular")){
					price5 += beefTipsRegular;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Beef Tips - Large")){
					price5 += beefTipsLarge;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Beef Tips - Extra Large")){
					price5 += beefTipsExtraLarge;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Ribeye Steak")){
					price5 += ribeyeSteak;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Filet Mignon")){
					price5 += filetMignon;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("T-Bone Steak")){
					price5 += tBoneSteak;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Sirloin Steak")){
					price5 += sirloinSteak;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Chopped Steaks")){
					price5 += choppedSteaks;
					textPrice5.setText(String.format("%.2f", price5));
				}
				if(comboSteaks.getSelectedItem().equals("Select")){
					price5 += 0;
					textSteaks.setText("0");
					textPrice5.setText(String.format("%.2f", price5));
				}
				
				//List of Kids meal
				double kidsMeal = Double.parseDouble(textKidsMeal.getText());
				double miniCornDogs = 4.99*kidsMeal;
				double chickenFries = 4.99*kidsMeal;
				double price6 = 0;
				
				if(comboKidsMeal.getSelectedItem().equals("Mini Corn Dogs")){
					price6 += miniCornDogs;
					textPrice6.setText(String.format("%.2f", price6));
				}
				if(comboKidsMeal.getSelectedItem().equals("Chicken Fries")){
					price6 += chickenFries;
					textPrice6.setText(String.format("%.2f", price6));
				}
				if(comboKidsMeal.getSelectedItem().equals("Select")){
					price6 += 0;
					textKidsMeal.setText("0");
					textPrice6.setText(String.format("%.2f", price6));
				}
				
				//List of Lunch
				double lunch = Double.parseDouble(textLunch.getText());
				double beefTips = 7.99*lunch;
				double grilledChickenBreastFillet = 7.99*lunch;
				double choppedSteak = 7.99*lunch;
				double centerCutPorkChop = 7.99*lunch;
				double grilledShrimpInLunch = 7.99*lunch;
				double price7 = 0;
				
				if(comboLunch.getSelectedItem().equals("Beef Tips")){
					price7 += beefTips;
					textPrice7.setText(String.format("%.2f", price7));
				}
				if(comboLunch.getSelectedItem().equals("Grilled Chicken Breast Filet")){
					price7 += grilledChickenBreastFillet;
					textPrice7.setText(String.format("%.2f", price7));
				}
				if(comboLunch.getSelectedItem().equals("Chopped Steak")){
					price7 += choppedSteak;
					textPrice7.setText(String.format("%.2f", price7));
				}
				if(comboLunch.getSelectedItem().equals("Center Cut Pork Chops")){
					price7 += centerCutPorkChop;
					textPrice7.setText(String.format("%.2f", price7));
				}
				if(comboLunch.getSelectedItem().equals("Grilled Shrip")){
					price7 += grilledShrimpInLunch;
					textPrice7.setText(String.format("%.2f", price7));
				}
				if(comboLunch.getSelectedItem().equals("Select")){
					price7 += 0;
					textLunch.setText("0");
					textPrice7.setText(String.format("%.2f", price7));
				}
				
				//List of Sides and Extras
				double sidesExtras = Double.parseDouble(textSidesExtras.getText());
				double superStuffedBakedPotato = 5.99*sidesExtras;
				double loadedBakedPotato = 3.99*sidesExtras;
				double sideSaladInExtras = 2.49*sidesExtras;
				double bakedPotato = 2.49*sidesExtras;
				double greenBeans = 2.49*sidesExtras;
				double garlicMashedPotatoes = 2.49*sidesExtras;
				double macaroniAndCheese = 2.49*sidesExtras;
				double bakedBeans = 2.49*sidesExtras;
				double cinnamonApples = 2.49*sidesExtras;
				double grilledShrimpInExtras = 5.79*sidesExtras;
				double grilledChickenOrHamCup = 4.29*sidesExtras;
				double grilledOnionsOrMashrooms = 0.99*sidesExtras;
				double cheddarCheeseCup = 0.99*sidesExtras;
				double realBaconPiecesCup = 0.99*sidesExtras;
				double laysClassicPotatoChips = 0.89*sidesExtras;
				double freshBakedDinnerRoll = 0.49*sidesExtras;
				double halfDozenDinnerRoll = 2.59*sidesExtras;
				double saladDressingOrCocktailSauce = 0.39*sidesExtras;
				double price8 = 0;
				
				
				if(comboSides.getSelectedItem().equals("Super Stuffed Baked Potato")){
					price8 += superStuffedBakedPotato;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Loaded Baked Potato")){
					price8 += loadedBakedPotato;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Side Salad")){
					price8 += sideSaladInExtras;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Baked Potato(Butter & Sour Cream)")){
					price8 += bakedPotato;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Green Beens")){
					price8 += greenBeans;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Garlic Mashed Potatoes")){
					price8 += garlicMashedPotatoes;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Macaroni & Cheese")){
					price8 += macaroniAndCheese;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Baked Beans")){
					price8 += bakedBeans;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Cinnamon Apples")){
					price8 += cinnamonApples;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("10 pc. Grilled Shrimp")){
					price8 += grilledShrimpInExtras;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Grilled Chicen or Ham Cup")){
					price8 += grilledChickenOrHamCup;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Grilled Onions or Mushrooms")){
					price8 += grilledOnionsOrMashrooms;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Cheedar Cheese Cup")){
					price8 += cheddarCheeseCup;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Real Bacon Pieces Cup")){
					price8 += realBaconPiecesCup;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Lay's Classic Potato Chips")){
					price8 += laysClassicPotatoChips;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Fresh Baked Dinner Roll")){
					price8 += freshBakedDinnerRoll;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Half-Dozen Dinner Rolls")){
					price8 += halfDozenDinnerRoll;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Salad Dressing, or Cocktail Sauce")){
					price8 += saladDressingOrCocktailSauce;
					textPrice8.setText(String.format("%.2f", price8));
				}
				if(comboSides.getSelectedItem().equals("Select")){
					price8 += 0;
					textSidesExtras.setText("0");
					textPrice8.setText(String.format("%.2f", price8));
				}
				
				//List of Soups
				double soups = Double.parseDouble(textSoups.getText());
				double papasChilli = 3.99*soups;
				double broccoliAndCheese = 3.99*soups;
				double loadedPotatoSoup = 3.99*soups;
				double price9 = 0;
				
				 if(comboSoups.getSelectedItem().equals("Papa's Chilli")){
						price9 += papasChilli;
						textPrice9.setText(String.format("%.2f", price9));
					}
				 if(comboSoups.getSelectedItem().equals("Broccoli & Cheese")){
					 price9 += broccoliAndCheese;
						textPrice9.setText(String.format("%.2f", price9));
					}
				 if(comboSoups.getSelectedItem().equals("Loaded Potato Soup")){
					 price9 += loadedPotatoSoup;
						textPrice9.setText(String.format("%.2f", price9));
					}
				 if(comboSoups.getSelectedItem().equals("Select")){
					 price9 += 0;
					 textSoups.setText("0");
					 textPrice9.setText(String.format("%.2f", price9));
					}
				
				//List of Desserts
				double desserts = Double.parseDouble(textDesserts.getText());
				double chocolateChipCookie = 1.09*desserts;
				double chocolateMousseCake = 3.49*desserts;
				double newYorkStyleCheeseCake = 3.49*desserts;
				double grannyCaramelApplePie = 3.49*desserts;
				double ultimateChocolateCake = 3.49*desserts;
				double price10 = 0;
				
				
				if(comboDesserts.getSelectedItem().equals("Chocolate Chip Cookie")){
						price10 += chocolateChipCookie;
						textPrice10.setText(String.format("%.2f", price10));
				}
				if(comboDesserts.getSelectedItem().equals("Chocolate Mousse Cake")){
					price10 += chocolateMousseCake;
					textPrice10.setText(String.format("%.2f", price10));
				}
				if(comboDesserts.getSelectedItem().equals("New York Style Cheesecake")){
					price10 += newYorkStyleCheeseCake;
					textPrice10.setText(String.format("%.2f", price10));
				}
				if(comboDesserts.getSelectedItem().equals("Granny Caramel Apple Pie")){
					price10 += grannyCaramelApplePie;
					textPrice10.setText(String.format("%.2f", price10));
				}
				if(comboDesserts.getSelectedItem().equals("Ultimate Chocolate Cake")){
					price10 += ultimateChocolateCake;
					textPrice10.setText(String.format("%.2f", price10));
				}
				if(comboDesserts.getSelectedItem().equals("Select")){
					price10 += 0;
					textDesserts.setText("0");
					textPrice10.setText(String.format("%.2f", price10));
					}
				
				//List of Beverages
				double beverages = Double.parseDouble(textBeverages.getText());
				double freshBrewedIcedTea = 2.09*beverages;
				double coke = 2.09*beverages;
				double dietCoke = 2.09*beverages;
				double drPepper = 2.09*beverages;
				double dietDrPepper = 2.09*beverages;
				double sprite = 2.09*beverages;
				double lemonade = 2.09*beverages;
				double bottledSpringWater = 1.49*beverages;
				double price11 = 0;
				
				
				if(comboBeverages.getSelectedItem().equals("Fresh Brewed Iced TEa")){
					price11 += freshBrewedIcedTea;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Coke")){
					price11 += coke;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Diet Coke")){
					price11 += dietCoke;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Dr. Pepper")){
					price11 += drPepper;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Diet Dr. Pepper")){
					price11 += dietDrPepper;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Sprite")){
					price11 += sprite;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Lemonade")){
					price11 += lemonade;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Bottled Spring Water")){
					price11 += bottledSpringWater;
					textPrice11.setText(String.format("%.2f", price11));
					}
				if(comboBeverages.getSelectedItem().equals("Select")){
					price11 += 0;
					textBeverages.setText("0");
					textPrice11.setText(String.format("%.2f", price11));
					}
				
				else{
					textSubTotal.setText(null);
				}
				
				total = Double.parseDouble(textPrice1.getText()) + 
						Double.parseDouble(textPrice2.getText())+
						Double.parseDouble(textPrice3.getText())+
						Double.parseDouble(textPrice4.getText())+
						Double.parseDouble(textPrice5.getText())+
						Double.parseDouble(textPrice6.getText())+
						Double.parseDouble(textPrice7.getText())+
						Double.parseDouble(textPrice8.getText())+
						Double.parseDouble(textPrice9.getText())+
						Double.parseDouble(textPrice10.getText())+
						Double.parseDouble(textPrice11.getText());
				
				String subTotal = textSubTotal.getText();
				subTotal = String.format("%.2f",total);
				textSubTotal.setText(subTotal);
				
				double tax = 0;
				tax = total*(TAX_RATE);
				textTax.setText(String.format("%.2f", tax));
				
				double totalCost = 0;
				totalCost = total+tax;
				textTotalCost.setText(String.format("%.2f", totalCost));
				
				
			}
		});
		btnNewButton.setBounds(348, 33, 117, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Padmaja Restaurants");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setBounds(211, 6, 550, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(6, -31, 150, 65);
		frame.getContentPane().add(internalFrame);
		internalFrame.setVisible(true);
	}
}
