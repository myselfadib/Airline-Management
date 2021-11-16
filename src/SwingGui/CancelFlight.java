package SwingGui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CancelFlight extends JFrame implements ActionListener{
Container container=getContentPane();
	
	//label
	JLabel applabel=new JLabel("Airline Reservation System");
	JLabel origin=new JLabel("Origin");
	JLabel journeyDate=new JLabel("Journey Date");
	JLabel destination=new JLabel("Destination");
	JLabel classs=new JLabel("Class");
	JLabel date=new JLabel("Date");
	//JLabel flightname=new JLabel("Flight Name");
	//JLabel departuretime=new JLabel("Departure Time");
	JLabel arrow=new JLabel(" >");
	JLabel l=new JLabel("--------");
	JLabel applabel2=new JLabel("Insert flight informations properply for a successful cancellation.");
	
	
	JTextField ori=new JTextField();
	JTextField des=new JTextField();
	JTextField jd=new JTextField();
	JTextField cs=new JTextField();
	
	JButton cancelflight=new JButton("Cancel Flight");
	JButton back=new JButton("Back");
	
	CancelFlight(){
		this.setTitle("Cancel Flight");
		this.setBounds(20,20,1300,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\airplaneicon.png"));
		Initialize();
		 addActionEvent();
	}
	
	public void Initialize() {
		container.setLayout(null);
		container.setBackground(Color.cyan);
		
		//set labels
		applabel.setBounds(400, 0, 500, 50);
		applabel.setForeground(Color.red);
		applabel.setFont(new Font("San Francisco",Font.BOLD,26));
		applabel.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(applabel);
		
		origin.setBounds(70, 50, 500, 50);
		origin.setForeground(Color.BLACK);
		origin.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(origin);
		
		destination.setBounds(400, 50, 500, 50);
		destination.setForeground(Color.black);
		destination.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(destination);
		
		journeyDate.setBounds(700, 50, 500, 50);
		journeyDate.setForeground(Color.BLACK);
		journeyDate.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(journeyDate);
		
		classs.setBounds(1050, 50, 500, 50);
		classs.setForeground(Color.black);
		classs.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(classs);
		
		arrow.setBounds(330, 39, 500, 50);
		arrow.setForeground(Color.red);
		arrow.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(arrow);
		
		l.setBounds(270, 32, 500, 60);
		l.setForeground(Color.red);
		l.setFont(new Font("San Francisco",Font.PLAIN,26));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(l);
		
		applabel2.setBounds(320, 150, 1000, 50);
		applabel2.setForeground(Color.BLACK);
		applabel2.setFont(new Font("San Francisco",Font.BOLD,22));
		//origin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(applabel2);
		
		//text
		
		ori.setBounds(25, 94, 220, 24);
        ori.setToolTipText("Enter your location");
        ori.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(ori);
	    
	    des.setBounds(375, 94, 220, 24);
        des.setToolTipText("Where to?");
        des.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(des);
	    
	    
	    jd.setBounds(675, 94, 220, 24);
        jd.setToolTipText("Enter Date");
        jd.setFont(new Font("san Francisco",Font.PLAIN,15));
	   container.add(jd);
	    
	    cs.setBounds(1035, 94, 220, 24);
        cs.setToolTipText("Enter Class");
        cs.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(cs);
	    
	    //button
	    cancelflight.setBounds(540, 250, 190, 50);
		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
	    cancelflight.setFont(new Font("san Francisco",Font.BOLD,18));
		 cancelflight.setBackground(Color.white);
        container.add(cancelflight);
        back.setBounds(970, 600, 100, 20);
   		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
   		 back.setFont(new Font("san Francisco",Font.BOLD,15));
   		 back.setBackground(Color.white);
            container.add(back);
		
	}
	
	
	public void addActionEvent() {
		 cancelflight.addActionListener(this);
		 back.addActionListener(this);
		
	}
	
	public void remove(String filepath,String removeterm,int positionterm,String delemiter) {
		int position = positionterm-1;
		String tempfile=("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\temp.txt");
		
		File oldf=new File(filepath);
		File newf=new File(tempfile);
		String currentline;
		String[] data;
		//boolean isremove=false;
		try {
			FileWriter fw=new FileWriter(tempfile,true);
			BufferedWriter bw =new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			
			FileReader fr=new FileReader(filepath);
			BufferedReader br=new BufferedReader(fr);
			
			while((currentline=br.readLine()) !=null) {
				data=currentline.split(" ");
				if(!data[position].equalsIgnoreCase(removeterm)) {
					pw.print(currentline);
				}
				
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();
			
			
			oldf.delete();
			File dump=new File(filepath);
			newf.renameTo(dump);
			
			
			
		}
		catch(Exception e) {
			
		}
	}
	

    @Override
	public void actionPerformed(ActionEvent e) {
    	int u=0;
    	if(e.getSource()== cancelflight) {
    		String date;
    		date=jd.getText();
    		String path="C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\FlightDetails.txt";
    		remove(path,date,1," ");
    		
    		u++;
    		if(u>0) {
        		JOptionPane.showMessageDialog(null, "Flight Successfully Cancelled!","Confirmation", JOptionPane.WARNING_MESSAGE);
        		SearchFlight bb=new SearchFlight();
        		this.setVisible(false);
        		bb.setVisible(true);
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "error!","Confirmation", JOptionPane.WARNING_MESSAGE);
        	}
    		
    		 
    	
    	}
    	
    	
    	if(e.getSource()==back) {
			this.setVisible(false);
			SearchFlight ss=new SearchFlight();
			ss.setVisible(true);
			
		}
    	
	
    	
		
	}
	

}
