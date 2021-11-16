package SwingGui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BookingProcess extends JFrame implements ActionListener {
	String path="C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\FlightDetails.txt";
	String path1="C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\PassengerDetail.txt";
Container container=getContentPane();
	
	//Application label
	JLabel applabel=new JLabel("Airline Booking Process");
	JLabel flightDetail=new JLabel("Flight Detail");
	JLabel journeyDate=new JLabel("Journey Date");
	JLabel departureTime=new JLabel("Departure Time");
//	JLabel flightno=new JLabel("Flight No.");
	JLabel from=new JLabel("From");
	JLabel to=new JLabel("To");
	JLabel Class=new JLabel("Class");
	//JLabel change=new JLabel("Charge");
	JLabel instruction=new JLabel("Instructions");
	JLabel instruction1=new JLabel("1. Booking is alowed for maximum 6(six) passengers including children per Ticket.");
	JLabel instruction2=new JLabel("2. Full charges will be applicable for children more than 2 years age. ");
	JLabel instruction3=new JLabel("3. Present the age proof for children less or equal to 2 years age.");
	
	JLabel pd=new JLabel("Passenger Detail");
	JLabel nod=new JLabel("No. of Adult");
	JLabel noc=new JLabel("No. of Child");
	JLabel meal=new JLabel("Meal");
	JLabel veg=new JLabel("Veg");
	JLabel nonveg=new JLabel("Non veg");
	JLabel fn=new JLabel("First Name");
	JLabel ln=new JLabel("Last Name");
	JLabel age=new JLabel("Age");
	JLabel gender=new JLabel("Gender");
	//Text field
	JTextField journey=new JTextField();
	JTextField departure=new JTextField();
//	JTextField =new JTextField();
	JTextField From=new JTextField();
	JTextField To=new JTextField();
	JTextField Classs=new JTextField();
//	JTextField Change=new JTextField();
	JTextField nodd=new JTextField();
	JTextField nocc=new JTextField();
	
	JTextField fn1=new JTextField();
	JTextField fn2=new JTextField();
	JTextField fn3=new JTextField();
	JTextField fn4=new JTextField();
	JTextField fn5=new JTextField();
	JTextField fn6=new JTextField();
	JTextField ln1=new JTextField();
	JTextField ln2=new JTextField();
	JTextField ln3=new JTextField();
	JTextField ln4=new JTextField();
	JTextField ln5=new JTextField();
	JTextField ln6=new JTextField();
	JTextField a1=new JTextField();
	JTextField a2=new JTextField();
	JTextField a3=new JTextField();
	JTextField a4=new JTextField();
	JTextField a5=new JTextField();
	JTextField a6=new JTextField();
	JTextField g1=new JTextField();
	JTextField g2=new JTextField();
	JTextField g3=new JTextField();
	JTextField g4=new JTextField();
	JTextField g5=new JTextField();
	JTextField g6=new JTextField();
	
	
	JPasswordField passfield=new JPasswordField();
	
	JCheckBox v=new JCheckBox("Vegeterian");
	JCheckBox nv=new JCheckBox("Non vegeterian");
	
	//Button
	//JButton ChangeButton=new JButton("Change");
	JButton ConfirmButton=new JButton("Confirm");
	//JButton reset=new JButton("Reset");
	JButton proceed=new JButton("Proceed");
	JButton back=new JButton("Back");
	
	BookingProcess(){
		this.setTitle("Booking Process");
		this.setBounds(20,20,1300,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rishan\\Documents\\workspace2\\Airline\\src\\SwingGui\\airplaneicon.png"));
		Initialize();
		addActionEvent();
		
	}
	
	public void Initialize() {
		container.setLayout(null);
		container.setBackground(Color.white);
		
		//set labels
		applabel.setBounds(400, 0, 500, 50);
		applabel.setForeground(Color.red);
		applabel.setFont(new Font("San Francisco",Font.BOLD,26));
		applabel.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(applabel);
		
		flightDetail.setBounds(10, 0, 500, 120);
		flightDetail.setForeground(Color.RED);
		flightDetail.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(flightDetail);
		
		journeyDate.setBounds(20, 0, 500, 190);
		journeyDate.setForeground(Color.black);
		journeyDate.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(journeyDate);
		
		departureTime.setBounds(20, 0, 500, 283);
		departureTime.setForeground(Color.black);
		departureTime.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(departureTime);
		
     /*	flightno.setBounds(20, 0, 500, 330);
     	flightno.setForeground(Color.black);
     	flightno.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
	//	container.add( flightno);*/
		
		from.setBounds(20, 0, 500, 370);
		from.setForeground(Color.black);
		from.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(from);
		
		to.setBounds(20, 0, 500, 470);
		to.setForeground(Color.black);
		to.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(to);
		
		Class.setBounds(20, 0, 500, 540);
		Class.setForeground(Color.black);
		Class.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(Class);
		
	/*	change.setBounds(20, 0, 500, 610);
		change.setForeground(Color.black);
		change.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		//container.add(change);*/
		
	    instruction.setBounds(10, 0, 500, 820);
	    instruction.setForeground(Color.RED);
	    instruction.setFont(new Font("San Francisco",Font.BOLD,20));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
		container.add( instruction);
		
		 instruction1.setBounds(70, 0, 700, 900);
		 instruction1.setForeground(Color.black);
		 instruction1.setFont(new Font("San Francisco",Font.PLAIN,17));
	   //flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
	     container.add( instruction1);
			
	     instruction2.setBounds(70, 0, 800, 950);
   	     instruction2.setForeground(Color.black);
   	     instruction2.setFont(new Font("San Francisco",Font.PLAIN,17));
		//flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
   	     container.add( instruction2);
				
		 instruction3.setBounds(70, 0, 800, 1000);
		 instruction3.setForeground(Color.BLACK);
		 instruction3.setFont(new Font("San Francisco",Font.PLAIN,17));
	     //flightDetail.setHorizontalAlignment(SwingConstants.CENTER);
         container.add( instruction3);
         
        pd.setBounds(300, 0, 500, 120);
 		pd.setForeground(Color.red);
 		pd.setFont(new Font("San Francisco",Font.BOLD,20));
 		pd.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(pd);
 		
 		nod.setBounds(305, 0, 450, 180);
 		nod.setForeground(Color.red);
 		nod.setFont(new Font("San Francisco",Font.PLAIN,20));
 		nod.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(nod);
 		
 		noc.setBounds(500, 0, 450, 180);
 		noc.setForeground(Color.red);
 		noc.setFont(new Font("San Francisco",Font.PLAIN,20));
 		noc.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(noc);
 		
 		meal.setBounds(675, 0, 450, 180);
 		meal.setForeground(Color.red);
 		meal.setFont(new Font("San Francisco",Font.PLAIN,20));
 		meal.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(meal);
 		
 		veg.setBounds(755, 0, 450, 180);
 		veg.setForeground(Color.red);
 		veg.setFont(new Font("San Francisco",Font.PLAIN,20));
 		veg.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(veg);
 		
 		nonveg.setBounds(845, 0, 450, 180);
 		nonveg.setForeground(Color.red);
 		nonveg.setFont(new Font("San Francisco",Font.PLAIN,20));
 		nonveg.setHorizontalAlignment(SwingConstants.CENTER);
 		container.add(nonveg);
 		
 		fn.setBounds(300, 0, 500, 240);
  		fn.setForeground(Color.red);
  		fn.setFont(new Font("San Francisco",Font.PLAIN,20));
  		fn.setHorizontalAlignment(SwingConstants.CENTER);
  		container.add(fn);
  		
  		ln.setBounds(490, 0, 500, 240);
  		ln.setForeground(Color.red);
  		ln.setFont(new Font("San Francisco",Font.PLAIN,20));
  		ln.setHorizontalAlignment(SwingConstants.CENTER);
  		container.add(ln);
  		
  		age.setBounds(660, 0, 500, 240);
  		age.setForeground(Color.red);
  		age.setFont(new Font("San Francisco",Font.PLAIN,20));
  		age.setHorizontalAlignment(SwingConstants.CENTER);
  		container.add(age);
  		
  		gender.setBounds(780, 0, 500, 240);
  		gender.setForeground(Color.red);
  		gender.setFont(new Font("San Francisco",Font.PLAIN,20));
  		gender.setHorizontalAlignment(SwingConstants.CENTER);
  		container.add(gender);
  		
         
         
         //text field
         journey.setBounds(180, 83, 150, 24);
         journey.setToolTipText("Enter Date");
         journey.setFont(new Font("san Francisco",Font.PLAIN,15));
 		 container.add(journey);
 		 
 		 departure.setBounds(180, 130, 150, 24);
 		 //departure.setToolTipText("Enter Date");
 		 departure.setFont(new Font("san Francisco",Font.PLAIN,15));
		 container.add(departure);
		 
	/*	 flight.setBounds(180, 154, 150, 24);
 		 //departure.setToolTipText("Enter Date");
		 flight.setFont(new Font("san Francisco",Font.PLAIN,15));
		// container.add(flight);*/
		 
		 From.setBounds(180, 170, 150, 24);
 		 //departure.setToolTipText("Enter Date");
		 From.setFont(new Font("san Francisco",Font.PLAIN,15));
		 container.add(From);
		
		 To.setBounds(180, 219, 150, 24);
 		 //departure.setToolTipText("Enter Date");
		 To.setFont(new Font("san Francisco",Font.PLAIN,15));
		 container.add(To); 
		 
		 Classs.setBounds(180, 259, 150, 24);
 		 //departure.setToolTipText("Enter Date");
		 Classs.setFont(new Font("san Francisco",Font.PLAIN,15));
		 container.add(Classs); 
		 
	/*	 Change.setBounds(180, 299, 150, 24);
 		 //departure.setToolTipText("Enter Date");
		 Change.setFont(new Font("san Francisco",Font.PLAIN,15));
		// container.add(Change); */
		 
		 nodd.setBounds(600, 81, 60, 24);
         nodd.setToolTipText("Number of adults");
         nodd.setFont(new Font("san Francisco",Font.PLAIN,15));
 		 container.add(nodd);
 		 
 		nocc.setBounds(790, 81, 60, 24);
        nocc.setToolTipText("Number of childs");
        nocc.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(nocc);
		
		fn1.setBounds(500, 133, 150, 24);
        fn1.setToolTipText("Enter first name");
        fn1.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(fn1);
		 
		fn2.setBounds(500, 163, 150, 24);
	    fn2.setToolTipText("Enter first name");
	    fn2.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(fn2);
	    
	    fn3.setBounds(500, 193, 150, 24);
	    fn3.setToolTipText("Enter first name");
	    fn3.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(fn3);
	    
	    fn4.setBounds(500, 223, 150, 24);
	    fn4.setToolTipText("Enter first name");
	    fn4.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(fn4);
	    
	    fn5.setBounds(500, 253, 150, 24);
	    fn5.setToolTipText("Enter first name");
	    fn5.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(fn5);
	    
	    fn6.setBounds(500, 283, 150, 24);
	    fn6.setToolTipText("Enter first name");
	    fn6.setFont(new Font("san Francisco",Font.PLAIN,15));
	    container.add(fn6);
	    
	    ln1.setBounds(690, 133, 150, 24);
        ln1.setToolTipText("Enter last name");
        ln1.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln1);
		
		ln2.setBounds(690, 163, 150, 24);
        ln2.setToolTipText("Enter last name");
        ln2.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln2);
		
		ln3.setBounds(690, 193, 150, 24);
        ln3.setToolTipText("Enter last name");
        ln3.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln3);
		
		ln4.setBounds(690, 223, 150, 24);
        ln4.setToolTipText("Enter last name");
        ln4.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln4);
		
		ln5.setBounds(690, 253, 150, 24);
        ln5.setToolTipText("Enter last name");
        ln5.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln5);
		
		ln6.setBounds(690, 283, 150, 24);
        ln6.setToolTipText("Enter last name");
        ln6.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(ln6);
		
		a1.setBounds(890, 133, 66, 24);
        a1.setToolTipText("Enter age");
        a1.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a1);
		
		a2.setBounds(890, 163, 66, 24);
        a2.setToolTipText("Enter age");
        a2.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a2);
		
		a3.setBounds(890, 193, 66, 24);
        a3.setToolTipText("Enter age");
        a3.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a3);
		
		a4.setBounds(890, 223, 66, 24);
        a4.setToolTipText("Enter age");
        a4.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a4);
		
		a5.setBounds(890, 253, 66, 24);
        a5.setToolTipText("Enter age");
        a5.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a5);
		
		a6.setBounds(890, 283, 66, 24);
        a6.setToolTipText("Enter age");
        a6.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(a6);
		
		g1.setBounds(1000, 133, 66, 24);
        g1.setToolTipText("Enter age");
        g1.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g1);
		
		g2.setBounds(1000, 163, 66, 24);
        g2.setToolTipText("Enter age");
        g2.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g2);
		
		g3.setBounds(1000, 193, 66, 24);
        g3.setToolTipText("Enter age");
        g3.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g3);
		
		g4.setBounds(1000, 223, 66, 24);
        g4.setToolTipText("Enter age");
        g4.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g4);
		
		g5.setBounds(1000, 253, 66, 24);
        g5.setToolTipText("Enter age");
        g5.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g5);
		
		g6.setBounds(1000, 283, 66, 24);
        g6.setToolTipText("Enter age");
        g6.setFont(new Font("san Francisco",Font.PLAIN,15));
		container.add(g6);
		 
		 //button 
		 
		/* ChangeButton.setBounds(130, 350, 90, 20);
		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
		 ChangeButton.setFont(new Font("san Francisco",Font.BOLD,15));
		 ChangeButton.setBackground(Color.white);
        // container.add(ChangeButton);*/
         
         ConfirmButton.setBounds(240, 350, 90, 20);
 		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
         ConfirmButton.setFont(new Font("san Francisco",Font.BOLD,15));
         ConfirmButton.setBackground(Color.WHITE);
         container.add(ConfirmButton);
 		 
      /*   reset.setBounds(870, 350, 90, 20);
 		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
 		 reset.setFont(new Font("san Francisco",Font.BOLD,15));
 		 reset.setBackground(Color.white);
         // container.add(reset);*/
          

          proceed.setBounds(970, 350, 100, 20);
  		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
  		 proceed.setFont(new Font("san Francisco",Font.BOLD,15));
  		 proceed.setBackground(Color.white);
           container.add(proceed);
           

           back.setBounds(970, 600, 100, 20);
   		// ChangeButton.setHorizontalTextPosition(SwingConstants.CENTER);
   		 back.setFont(new Font("san Francisco",Font.BOLD,15));
   		 back.setBackground(Color.white);
            container.add(back);
         
         //check box
        v.setBounds(935, 82, 20, 20);
 		v.setFont(new Font("san Francisco",Font.PLAIN,30));
 		container.add(v);
 		
 		nv.setBounds(1007, 82, 20, 20);
  		nv.setFont(new Font("san Francisco",Font.PLAIN,30));
  		container.add(nv);
		 
	}
	
	 public void addActionEvent() {
	       // ChangeButton.addActionListener(this);
	        ConfirmButton.addActionListener(this);
	      //  reset.addActionListener(this);
	        proceed.addActionListener(this);
	        back.addActionListener(this);
	    }

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ConfirmButton) {
			try {
				
				FileWriter mw = new FileWriter(path,true);
				mw.write("\n"+journey.getText()+" "+departure.getText()+" "+From.getText()+" "+To.getText()+" "+Classs.getText()+"\n");
				mw.close();
				
				JOptionPane.showMessageDialog(null, "Flight Details Confirmed Now Give Passenger Details ","Confirmation", JOptionPane.WARNING_MESSAGE);
					
			}
			catch(Exception k) {
				k.getStackTrace();
				
			}
			
		}
		
		if(e.getSource()==proceed) {
			try {
				 FileWriter p1 = new FileWriter(path1,true);
				/* FileWriter p2 = new FileWriter(path1,true);
				 FileWriter p3 = new FileWriter(path1,true);
				 FileWriter p4 = new FileWriter(path1,true);
				 FileWriter p5 = new FileWriter(path1,true);
				 FileWriter p6 = new FileWriter(path1,true);
				 FileWriter ac = new FileWriter(path1,true);*/
				 
			    // ac.write(nodd.getText()+" "+nocc.getText()+"\n");
				 p1.write(fn1.getText()+" "+ln1.getText()+" "+a1.getText()+" "+g1.getText()+"\n"+fn2.getText()+" "+ln2.getText()+" "+a2.getText()+" "+g2.getText()+"\n"+fn3.getText()+" "+ln3.getText()+" "+a3.getText()+" "+g3.getText()+"\n"+fn4.getText()+" "+ln4.getText()+" "+a4.getText()+" "+g4.getText()+"\n"+fn5.getText()+" "+ln5.getText()+" "+a5.getText()+" "+g5.getText()+"\n"+fn6.getText()+" "+ln6.getText()+" "+a6.getText()+" "+g6.getText()+"\n\n");
				/* p2.write(fn2.getText()+" "+ln2.getText()+" "+a2.getText()+" "+g2.getText()+"\n");
				 p3.write(fn3.getText()+" "+ln3.getText()+" "+a3.getText()+" "+g3.getText()+"\n");
				 p4.write(fn4.getText()+" "+ln4.getText()+" "+a4.getText()+" "+g4.getText()+"\n");
				 p5.write(fn5.getText()+" "+ln5.getText()+" "+a5.getText()+" "+g5.getText()+"\n");
				 p6.write(fn6.getText()+" "+ln6.getText()+" "+a6.getText()+" "+g6.getText()+"\n\n");
				*/
				 p1.close();
				 
				 JOptionPane.showMessageDialog(null, "Passenger Details Confirmed!Now give your COVID-19 report ","Confirmation", JOptionPane.WARNING_MESSAGE);
				 CovidReport cc=new CovidReport();
				 this.setVisible(false);
				 cc.setVisible(true);
				
			}
			catch(Exception r) {
				r.getStackTrace();
			}
			
		}
		
		if(e.getSource()==back) {
			this.setVisible(false);
			SearchFlight ss=new SearchFlight();
			ss.setVisible(true);
			
		}
		
	}

}
