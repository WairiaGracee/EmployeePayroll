package employee;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;

public class payroll {

	private JFrame frmEmployeepayroll;
	private JTextField Name;
	private JTextField hourlySalary;
	private JTable table;
	private JTextField firstMon;
	private JTextField firstTue;
	private JTextField firstWed;
	private JTextField firstThur;
	private JTextField firstFri;
	private JTextField firstSat;
	private JTextField firstSun;
	private JTextField secondMon;
	private JTextField secondTue;
	private JTextField secondWed;
	private JTextField secondThur;
	private JTextField secondFri;
	private JTextField secondSat;
	private JTextField secondSun;
	private JTextField Reghour;
	private JTextField Overtimehour;
	private JTextField regAmount;
	private JTextField overAmount;
	private JTextField netPay;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll window = new payroll();
					window.frmEmployeepayroll.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeepayroll = new JFrame();
		frmEmployeepayroll.setBackground(new Color(0, 0, 255));
		frmEmployeepayroll.setForeground(new Color(255, 255, 255));
		frmEmployeepayroll.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmEmployeepayroll.setBounds(100, 100, 755, 539);
		frmEmployeepayroll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeepayroll.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Identification");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(63, 28, 139, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel);
		
		JLabel txtName = new JLabel("Employee Name:");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(85, 61, 114, 28);
		frmEmployeepayroll.getContentPane().add(txtName);
		
		Name = new JTextField();
		Name.setBounds(192, 67, 249, 19);
		frmEmployeepayroll.getContentPane().add(Name);
		Name.setColumns(10);
		
		JLabel txtHourly = new JLabel("Hourly Salary:");
		txtHourly.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHourly.setBounds(461, 66, 99, 19);
		frmEmployeepayroll.getContentPane().add(txtHourly);
		
		hourlySalary = new JTextField();
		hourlySalary.setBounds(554, 71, 96, 19);
		frmEmployeepayroll.getContentPane().add(hourlySalary);
		hourlySalary.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Time Sheet");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(63, 130, 125, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setBounds(63, 284, 601, -107);
		frmEmployeepayroll.getContentPane().add(table);
		
		JLabel txtFirst = new JLabel("First Week:");
		txtFirst.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFirst.setBounds(85, 202, 79, 23);
		frmEmployeepayroll.getContentPane().add(txtFirst);
		
		JLabel txtsecond = new JLabel("Second Week:");
		txtsecond.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtsecond.setBounds(85, 248, 79, 26);
		frmEmployeepayroll.getContentPane().add(txtsecond);
		
		firstMon = new JTextField();
		firstMon.setBounds(174, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstMon);
		firstMon.setColumns(10);
		
		firstTue = new JTextField();
		firstTue.setBounds(251, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstTue);
		firstTue.setColumns(10);
		
		firstWed = new JTextField();
		firstWed.setBounds(328, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstWed);
		firstWed.setColumns(10);
		
		firstThur = new JTextField();
		firstThur.setBounds(405, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstThur);
		firstThur.setColumns(10);
		
		firstFri = new JTextField();
		firstFri.setBounds(482, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstFri);
		firstFri.setColumns(10);
		
		firstSat = new JTextField();
		firstSat.setBounds(559, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstSat);
		firstSat.setColumns(10);
		
		firstSun = new JTextField();
		firstSun.setBounds(635, 205, 67, 19);
		frmEmployeepayroll.getContentPane().add(firstSun);
		firstSun.setColumns(10);
		
		secondMon = new JTextField();
		secondMon.setBounds(174, 253, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondMon);
		secondMon.setColumns(10);
		
		secondTue = new JTextField();
		secondTue.setBounds(247, 253, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondTue);
		secondTue.setColumns(10);
		
		secondWed = new JTextField();
		secondWed.setBounds(328, 255, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondWed);
		secondWed.setColumns(10);
		
		secondThur = new JTextField();
		secondThur.setBounds(405, 255, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondThur);
		secondThur.setColumns(10);
		
		secondFri = new JTextField();
		secondFri.setBounds(482, 255, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondFri);
		secondFri.setColumns(10);
		
		secondSat = new JTextField();
		secondSat.setBounds(559, 253, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondSat);
		secondSat.setColumns(10);
		
		secondSun = new JTextField();
		secondSun.setBounds(635, 255, 67, 19);
		frmEmployeepayroll.getContentPane().add(secondSun);
		secondSun.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Monday");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(174, 172, 66, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tuesday");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(251, 172, 76, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Wednesday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(328, 172, 67, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Thursday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(405, 172, 67, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Friday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(482, 172, 67, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Saturday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(554, 172, 72, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Sunday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(635, 172, 67, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Payroll Processing");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(50, 319, 114, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(47, 363, 99, 88);
		frmEmployeepayroll.getContentPane().add(btnNewButton);
		
		 btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	Name.getText();
					float salary=Float.valueOf(hourlySalary.getText());
					float mon=Float.valueOf(firstMon.getText());
					float tue=Float.valueOf(firstTue.getText());
					float wed=Float.valueOf(firstWed.getText());
					float thur=Float.valueOf(firstThur.getText());
					float fri=Float.valueOf(firstFri.getText());
					float sat=Float.valueOf(firstSat.getText());
					float sun=Float.valueOf(firstSun.getText());
					float mon2=Float.valueOf(secondMon.getText());
					float tue2=Float.valueOf(secondTue.getText());
					float wed2=Float.valueOf(secondWed.getText());
					float thur2=Float.valueOf(secondThur.getText());
					float fri2=Float.valueOf(secondFri.getText());
					float sat2=Float.valueOf(secondSat.getText());
					float sun2=Float.valueOf(secondSun.getText());
					float arr1[]= {mon,tue,wed,thur,fri,sat,sun,mon2,tue2,wed2,thur2,fri2,sat2,sun2};
					float overtime,regular,over;
					overtime=0;
					regular=0;
					for(int i=0;i<14;i++)
					{
						if (arr1[i]>8)
						{
							over=arr1[i]-8;
							overtime=overtime+over;
							regular=regular+8;
						}
						else
						{
							regular=regular+arr1[i];
						}
						
					}
					
					float Weekovertime=overtime;
					float Weekregular=regular;
		
					Reghour.setText(String.valueOf(Weekregular));
					Overtimehour.setText(String.valueOf(Weekovertime));
				float regularamnt = Weekregular*salary;
				float overtimeamnt = Weekovertime*salary;	
				String formattedRegularAmount = String.format("%.2f", regularamnt);
				String formattedOvertimeAmount = String.format("%.2f", overtimeamnt);

				regAmount.setText(formattedRegularAmount);
				overAmount.setText(formattedOvertimeAmount);
				float netpay= overtimeamnt+regularamnt;
				
				String formattednetpay = String.format("%.2f", netpay);
				netPay.setText(String.valueOf(formattednetpay));
					
					
				}
			});
		
		JLabel lblNewLabel_10 = new JLabel("Regular:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(174, 378, 79, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Overtime:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(174, 411, 66, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_11);
		
		Reghour = new JTextField();
		Reghour.setBounds(251, 381, 67, 19);
		frmEmployeepayroll.getContentPane().add(Reghour);
		Reghour.setColumns(10);
		
		Overtimehour = new JTextField();
		Overtimehour.setBounds(251, 414, 67, 19);
		frmEmployeepayroll.getContentPane().add(Overtimehour);
		Overtimehour.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Hours");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(260, 347, 58, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_12);
		
		regAmount = new JTextField();
		regAmount.setBounds(329, 381, 67, 19);
		frmEmployeepayroll.getContentPane().add(regAmount);
		regAmount.setColumns(10);
		
		overAmount = new JTextField();
		overAmount.setBounds(328, 414, 67, 19);
		frmEmployeepayroll.getContentPane().add(overAmount);
		overAmount.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Amount");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(328, 347, 67, 19);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Net Pay");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(429, 396, 67, 23);
		frmEmployeepayroll.getContentPane().add(lblNewLabel_14);
		
		netPay = new JTextField();
		netPay.setBounds(483, 399, 96, 19);
		frmEmployeepayroll.getContentPane().add(netPay);
		netPay.setColumns(10);
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(603, 363, 99, 88);
		frmEmployeepayroll.getContentPane().add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 System.exit(0);
			}
	});
	}
}
