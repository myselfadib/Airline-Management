package SwingGui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CovidReport extends JFrame implements ActionListener {
    Container container=getContentPane();
    String path=("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\covidreport.txt");
    String path1=("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\tempcovid.txt");
	
	//label
    JLabel notice=new JLabel("Notice :");
    JLabel instruction=new JLabel("As per the government rule, you have to provide your COVID-19 report to continue this journey.");
	JLabel in1=new JLabel("Step 1: Scan your COVID-19 report. ");
	JLabel in2=new JLabel("Step 2: Upload it to your google drive.");
	JLabel in3=new JLabel("Step 3: Share the link with us.");
	JLabel note=new JLabel("Note: If you are boooking for multiple tickets, bring their covid report along with them in the airport on the arrival day.");
	JLabel name=new JLabel("Username / Email :");
	JLabel report=new JLabel("COVID-19 report    :");
	
	 JLabel bg=new JLabel(new ImageIcon("C:/Users/Rishan/Documents/workspace2/Airline/src/SwingGui/covid19.png"));
	
	//text 
	JTextField nm=new JTextField();
	JTextField rpt=new JTextField();
	
	//button
	JButton submit=new JButton("Submit");
	
	CovidReport(){
		this.setTitle("COVID-19 REPORT");
		this.setBounds(320,100,800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\airplaneicon.png"));
		this.setResizable(false);
		Initialize();
		 addActionEvent();
	}
	public void Initialize() {
		container.setLayout(null);
		//container.setBackground(Color.cyan);
		//set labels
		
		notice.setBounds(1, 0, 80, 30);
		notice.setForeground(Color.red);
		notice.setFont(new Font("San Francisco",Font.BOLD,20));
		notice.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(notice);
		
		instruction.setBounds(2, 6, 630, 70);
		instruction.setForeground(Color.BLACK);
		instruction.setFont(new Font("San Francisco",Font.PLAIN,14));
		instruction.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(instruction);
		
		in1.setBounds(2, 6, 270, 105);
		in1.setForeground(Color.BLACK);
		in1.setFont(new Font("San Francisco",Font.BOLD,14));
		in1.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(in1);
		
		in2.setBounds(11, 6, 270, 140);
		in2.setForeground(Color.BLACK);
		in2.setFont(new Font("San Francisco",Font.BOLD,14));
		in2.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(in2);
		
		in3.setBounds(0, 6, 235, 176);
		in3.setForeground(Color.BLACK);
		in3.setFont(new Font("San Francisco",Font.BOLD,14));
		in3.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(in3);
		
		note.setBounds(1, 6, 790, 246);
		note.setForeground(Color.BLACK);
		note.setFont(new Font("San Francisco",Font.BOLD,13));
		note.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(note);
		
		name.setBounds(30, 130, 240, 106);
		name.setForeground(Color.BLACK);
		name.setFont(new Font("San Francisco",Font.BOLD,18));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(name);
		
		report.setBounds(29, 190, 240, 106);
		report.setForeground(Color.BLACK);
		report.setFont(new Font("San Francisco",Font.BOLD,18));
		report.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(report);
		
		//text
		
		nm.setBounds(255, 173, 220, 24);
        nm.setToolTipText("Enter your username or email");
        nm.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(nm);
	    
	    rpt.setBounds(255, 233, 220, 24);
        rpt.setToolTipText("Enter your covid report link");
        rpt.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(rpt);
	    
	    //button
	    
	    submit.setBounds(320, 270, 90, 40);
		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
	    submit.setFont(new Font("san Francisco",Font.PLAIN,18));
	    submit.setBackground(Color.GREEN);
        container.add(submit);
		
		 //backgroung image
        bg.setBounds(0, 0, 800, 600);
		bg.setHorizontalAlignment(SwingConstants.CENTER);
		bg.setOpaque(true);
		container.add(bg);
		
		
		
		
	}
	
	
	

	public void addActionEvent() {
		submit.addActionListener(this);
	
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String line;
			int u=0;
			boolean isfound=false;
			
			try {
				FileWriter pw = new FileWriter(path,true);
				pw.write(nm.getText()+" "+rpt.getText()+"\n");
				pw.close();
				FileWriter tw = new FileWriter(path1);
				tw.write(nm.getText()+" "+rpt.getText()+"\n");
				tw.close();
				
				FileReader fr = new FileReader(path1);
	            BufferedReader br = new BufferedReader(fr);
	            
	            while((br.readLine()) != null) {
	            	// if(line != null) {
	 	            	//JOptionPane.showMessageDialog(null, "Successfully submited", "Confirm!!", JOptionPane.WARNING_MESSAGE);
	 	            	isfound=true;
	 	           // }
	 	           // else {
	 	            	//JOptionPane.showMessageDialog(null, "Available", "Found!!", JOptionPane.WARNING_MESSAGE);
	 	            	//u++;
	 	           // }
	            	
	            }
	            
	           
	            if(isfound) {
	            	JOptionPane.showMessageDialog(null, "Successfully submited.Ready to get your ticket!Thank you ", "Confirm!!", JOptionPane.WARNING_MESSAGE);
	            	CovidReport ce=new CovidReport();
	            	ce.setVisible(false);
	            }
	            else {
	            	JOptionPane.showMessageDialog(null, "Available", "Found!!", JOptionPane.WARNING_MESSAGE);
	            }
	            
	            this.setVisible(false);
	            SearchFlight ss=new SearchFlight();
	            ss.setVisible(true);
	            
	            fr.close();
				
				
				
			}
			catch(Exception k) {
				k.getStackTrace();
			}
			
		}
		
		
	}
	

}
