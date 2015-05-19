package main;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CalcGUI{

	public JFrame frame;
	public JTextField grossInc;
	public JTextField totDbt;
	public JTextField intRte;
	public JTextField dwnPymt;
	public JTextField afrdAble;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public CalcGUI() {
		initialize();
	}
	
	

	private void initialize() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel TotalGrossIncome = new JLabel("Total Gross Income");
		TotalGrossIncome.setBounds(10, 25, 135, 14);
		frame.getContentPane().add(TotalGrossIncome);
		
		JLabel MonthlyDebt = new JLabel("Total Monthly Debt");
		MonthlyDebt.setBounds(10, 55, 135, 14);
		frame.getContentPane().add(MonthlyDebt);
		
		JLabel InterestRate = new JLabel("Interest Rate");
		InterestRate.setBounds(10, 85, 135, 25);
		frame.getContentPane().add(InterestRate);
		
		grossInc = new JTextField();
		grossInc.setBounds(215, 25, 111, 25);
		frame.getContentPane().add(grossInc);
		grossInc.setColumns(2);
		
		totDbt = new JTextField();
		totDbt.setBounds(215, 55, 111, 25);
		frame.getContentPane().add(totDbt);
		totDbt.setColumns(2);
		
		JLabel Term = new JLabel("Term");
		Term.setBounds(121, 137, 61, 16);
		frame.getContentPane().add(Term);
		
		JLabel DownPaymentoptional = new JLabel("Down Payment (Optional)");
		DownPaymentoptional.setBounds(6, 178, 176, 16);
		frame.getContentPane().add(DownPaymentoptional);
		
	}
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String grosIncome = grossInc.getText();
			String monthDebt = totDbt.getText();
			String intRte1 = intRte.getText();
			Integer grossIncome = Integer.parseInt(grosIncome);
			Integer monthlyDebt = Integer.parseInt(monthDebt);
			Double intr = Double.parseDouble(intRte1);
			String downPmt;
			Integer dwnPmt = Integer.parseInt(downPmt);
			double eighteen_percent = calculator.housePayment(grossIncome);
			double thirtysix = calculator.debts(grossIncome, monthlyDebt);
	        double pmtAllowed = calculator.maxSpend(eighteen_percent, thirtysix);
	        Double mortgage = calculator.mortgagePermitted(pmtAllowed, dwnPmt,intr, dwnPmt);
	        DecimalFormat format = new DecimalFormat("0");
	        String mrg = format.format(mortgage);
	        afrdAble.setText(mrg);
		
		}
		
		
		JLabel affordableHousePrice = new JLabel("Affordable House Price");
		affordableHousePrice.setBounds(10, 145, 155, 25);
	}

		
		
		
	}
