package currencyConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class Currencyconverter {

	private JFrame frame;
	private JTextField txtamt;
	private JComboBox txtfrom;
	private JComboBox txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currencyconverter window = new Currencyconverter();
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
	public Currencyconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 6, 167, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount: ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(92, 77, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(92, 130, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("To:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(79, 181, 61, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtamt = new JTextField();
		txtamt.setBounds(192, 72, 130, 28);
		frame.getContentPane().add(txtamt);
		txtamt.setColumns(10);
		
		JButton convert = new JButton("Convert");
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("#.##");
				Double convert;
				Double amount = Double.parseDouble(txtamt.getText());
				
				
				Object selectedFrom = txtfrom.getSelectedItem();
				Object selectedTo = txtTo.getSelectedItem();

				if (selectedFrom != null && selectedTo != null) {
				    String fromCurrency = selectedFrom.toString();
				    String toCurrency = selectedTo.toString();

				    if (fromCurrency.equals("USD") && toCurrency.equals("CAD")) {
				        convert = amount * 1.38;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("CNY")) {
				        convert = amount * 7.24;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + convert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
				        convert = amount * 0.80;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("NGN")) {
				        convert = amount * 1194.37;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
				        convert = amount * 0.94;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("BTC")) {
				        convert = amount * 0.000014;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
				        convert = amount * 152.95;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("USD") && toCurrency.equals("USD")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("CAD")) {
				        convert = amount * 1.46;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("CNY")) {
				        convert = amount * 7.70;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
				        convert = amount * 0.85;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("NGN")) {
				        convert = amount * 1271.17;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("BTC")) {
				        convert = amount * 0.000015;
				        String formattedConvert = df.format(convert); 
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("JPY")) {
				        convert = amount * 162.95;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
				        convert = amount * 1.06;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("EUR") && toCurrency.equals("EUR")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("CAD")) {
				        convert = amount * 1.71;
				        String formattedConvert = df.format(convert); 
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("CNY")) {
				        convert = amount * 8.84;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
				        convert = amount * 1.17;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("NGN")) {
				        convert = amount * 1487.50;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("BTC")) {
				        convert = amount * 0.000018;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("JPY")) {
				        convert = amount * 190.68;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
				        convert = amount * 1.25;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("GBP") && toCurrency.equals("GBP")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("CAD")) {
				        convert = amount * 0.0090;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("CNY")) {
				        convert = amount * 0.047;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("GBP")) {
				        convert = amount * 0.0052;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("NGN")) {
				        convert = amount * 7.80;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("BTC")) {
				        convert = amount * 0.00;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("EUR")) {
				        convert = amount * 0.0061;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
				        convert = amount * 0.0065;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("JPY") && toCurrency.equals("JPY")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("CAD")) {
				        convert = amount * 0.0011;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("CNY")) {
				        convert = amount * 0.0060;
				        String formattedConvert = df.format(convert); 
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("GBP")) {
				        convert = amount * 0.00067;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("JPY")) {
				        convert = amount * 0.13;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("BTC")) {
				        convert = amount * 0.00;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("EUR")) {
				        convert = amount * 0.00078;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("USD")) {
				        convert = amount * 0.00083;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("NGN") && toCurrency.equals("NGN")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("CAD")) {
				        convert = amount * 0.19;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("JPY")) {
				        convert = amount * 21.16;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("GBP")) {
				        convert = amount * 0.11;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("NGN")) {
				        convert = amount * 166.15;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("BTC")) {
				        convert = amount * 0.0000020;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("EUR")) {
				        convert = amount * 0.13;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("USD")) {
				        convert = amount * 0.14;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("CNY") && toCurrency.equals("CNY")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("CNY")) {
				        convert = amount * 5.26;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("JPY")) {
				        convert = amount * 111.19;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("GBP")) {
				        convert = amount * 0.58;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("NGN")) {
				        convert = amount * 872.95;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("BTC")) {
				        convert = amount * 0.000011;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " BTC");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("EUR")) {
				        convert = amount * 0.68;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("USD")) {
				        convert = amount * 0.73;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("CAD") && toCurrency.equals("CAD")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("CAD")) {
				        convert = amount * 94552.11;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Canadian Dollar");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("JPY")) {
				        convert = amount * 10509150.21;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Japanese Yen");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("GBP")) {
				        convert = amount * 55161.38;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Pound sterling");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("NGN")) {
				        convert = amount * 10509150.21;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Nigerian Naira");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("CNY")) {
				        convert = amount * 496833.39;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Chinese Yuan");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("EUR")) {
				        convert = amount * 64639.70;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " Euro");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("USD")) {
				        convert = amount * 68768.20;
				        String formattedConvert = df.format(convert);
				        JOptionPane.showMessageDialog(null,  "The amount is: " + formattedConvert + " United States Dollar");
				    }
				    else if (fromCurrency.equals("BTC") && toCurrency.equals("BTC")) {
				    	JOptionPane.showMessageDialog(null, "Error","Input Error", JOptionPane.ERROR_MESSAGE);
				    }
				    

				}
			}
		});
		convert.setBackground(Color.WHITE);
		convert.setForeground(Color.ORANGE);
		convert.setFont(new Font("Helvetica", Font.PLAIN, 14));
		convert.setBounds(35, 249, 117, 34);
		frame.getContentPane().add(convert);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btnExit, "Confirm if you want to exit", "Currency Converter",
					JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(1);
				}
			}
		});
		btnExit.setFont(new Font("Helvetica", Font.PLAIN, 14));
		btnExit.setBounds(294, 252, 117, 34);
		frame.getContentPane().add(btnExit);
		
		txtfrom = new JComboBox();
		txtfrom.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "GBP", "JPY", "NGN", "CNY", "CAD", "BTC"}));
		txtfrom.setSelectedIndex(0);
		txtfrom.setBounds(191, 126, 131, 28);
		frame.getContentPane().add(txtfrom);
		
		txtTo = new JComboBox();
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"CAD", "CNY", "GBP", "NGN", "JPY", "EUR", "USD", "BTC"}));
		txtTo.setSelectedIndex(0);
		txtTo.setBounds(191, 177, 131, 28);
		frame.getContentPane().add(txtTo);
	}
}
