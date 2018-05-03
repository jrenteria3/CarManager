import java.awt.Dimension;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


// Extends JFrame so it can create frames

public class GUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	CarManager CM = new CarManager();
	
	public JButton BACH, START;
	public JButton COMPACT, COUPE, SEDAN, MINIVAN, VAN, STATION, SUV, SMALLSUV, TRUCK;
	// COUPES
	public JButton ACURA, AUDI, CHEVROLET, CHRYSLER, DODGE, FORD, MAZDA, MERCEDES, MINI, NISSAN, SUBARU, TOYOTA;  
	// COMPACTS
	public JButton ACURA2, AUDI2, BMW2, BUICK2, CADILLAC2, CHEVROLET2, FORD2, HONDA2, HYUNDAI2, INFINITI2, KIA2, LEXUS2, MAZDA2, MERCEDES2, MITSUBISHI2, NISSAN2, SUBARU2, TOYOTA2, VOLKSWAGEN2, VOLVO2;
	// SEDANS
	public JButton AUDI3, BMW3, BUICK3, CADILLAC3, CHEVROLET3, CHRYSLER3, DODGE3, FORD3, HONDA3, HYUNDAI3, INFINITI3, KIA3, LEXUS3, LINCOLN3, MAZDA3, MERCEDES3, MINI3, NISSAN3, SUBARU3, TOYOTA3, VOLKSWAGEN3, VOLVO3;
	// STATION WAGONS
	public JButton AUDI4, CHEVROLET4, HONDA4, INFINITI4, KIA4, MERCEDES4, NISSAN4, SUBARU4, VOLKSWAGEN4, VOLVO4;
	// SMALL SUVS
	public JButton ACURA5, AUDI5, BMW5, BUICK5, CADILLAC5, CHEVROLET5, DODGE5, FORD5, GMC5, HONDA5, HYUNDAI5, INFINITI5, JEEP5, KIA5, LANDROVER5, LEXUS5, LINCOLN5, MAZDA5, MERCEDES5, MITSUBISHI5, NISSAN5, SUBARU5, VOLKSWAGEN5, VOLVO5;
	// SUV
	public JButton AUDI6, BMW6, BUICK6, CADILLAC6, CHEVROLET6, DODGE6, FORD6, GMC6, INFINITI6, JEEP6, LANDROVER6, LEXUS6, LINCOLN6, MERCEDES6, NISSAN6, TOYOTA6, VOLKSWAGEN6, VOLVO6;
	// MINIVANS
	public JButton CHRYSLER7, DODGE7, HONDA7, KIA7, NISSAN7, TOYOTA7;
	// VANS
	public JButton CHEVROLET8, FORD8;
	// TRUCKS
	public JButton CHEVROLET9, DODGE9, FORD9, GMC9, HONDA9, NISSAN9, TOYOTA9;
	// COUPE CARS
	public JButton NSX;
	
	//public static final int BOLD;
	
	public JTextField textField1;
	public JTextArea textArea1, textArea2;
	public int buttonClicked;
	public static JLabel label1, LABEL;
	
	public static final int WIDTH = 815;
	public static final int HEIGHT = 720;
	
	
	public static void main(String[] args){
	
		
		
		
		
	}
	
	public GUI() throws IOException{
		
		// Define the size of the frame
		this.setSize(WIDTH, HEIGHT);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
				
		Dimension dim = tk.getScreenSize();
				
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		this.setTitle("Car Finder");
				
		JPanel thePanel = new JPanel();
		
		ListenForButton lForButton = new ListenForButton();
		
		BufferedImage STARTICON = ImageIO.read(new File("START-LOGO.png"));
		START = new JButton(new ImageIcon(STARTICON));
		START.setBorder(BorderFactory.createEmptyBorder());
		START.setContentAreaFilled(true);
		START.addActionListener(lForButton);
		START.setToolTipText("Press to Begin");
		thePanel.add(START);
		
		BufferedImage BACHICON = ImageIO.read(new File("LOGOS/BACH-BUTTON.png"));
		BACH = new JButton(new ImageIcon(BACHICON));
		BACH.setVisible(false);
		BACH.setBorder(BorderFactory.createEmptyBorder());
		BACH.setContentAreaFilled(true);
		BACH.addActionListener(lForButton);
		BACH.setToolTipText("Press tp go Bach");
		thePanel.add(BACH);
		
		BufferedImage COUPEICON = ImageIO.read(new File("CORVETTE-COUPE-ICON.png"));
		COUPE = new JButton(new ImageIcon(COUPEICON));
		COUPE.setVisible(false);
		COUPE.setBorder(BorderFactory.createEmptyBorder());
		COUPE.setContentAreaFilled(false);
		COUPE.addActionListener(lForButton);
		COUPE.setBounds(30, 200, 50, 50);
		thePanel.add(COUPE);
		
		BufferedImage COMPACTICON = ImageIO.read(new File("ACURA-COMPACT-ICON.png"));
		COMPACT = new JButton(new ImageIcon(COMPACTICON));
		COMPACT.setVisible(false);
		COMPACT.setBorder(BorderFactory.createEmptyBorder());
		COMPACT.setContentAreaFilled(false);
		COMPACT.addActionListener(lForButton);
		COMPACT.setBounds(30, 200, 50, 50);
		thePanel.add(COMPACT);
		
		BufferedImage SEDANICON = ImageIO.read(new File("BMW-SEDAN-ICON.png"));
		SEDAN = new JButton(new ImageIcon(SEDANICON));
		SEDAN.setVisible(false);
		SEDAN.setBorder(BorderFactory.createEmptyBorder());
		SEDAN.setContentAreaFilled(false);
		SEDAN.addActionListener(lForButton);
		SEDAN.setBounds(30, 200, 500, 500);
		thePanel.add(SEDAN);
		
		BufferedImage STATIONICON = ImageIO.read(new File("MERCEDES-WAGON-ICON.png"));
		STATION = new JButton(new ImageIcon(STATIONICON));
		STATION.setVisible(false);
		STATION.setBorder(BorderFactory.createEmptyBorder());
		STATION.setContentAreaFilled(false);
		STATION.addActionListener(lForButton);
		STATION.setBounds(30, 200, 50, 50);
		thePanel.add(STATION);
		
		BufferedImage SMALLSUVICON = ImageIO.read(new File("KIA-SMALLSUV-ICON.png"));
		SMALLSUV = new JButton(new ImageIcon(SMALLSUVICON));
		SMALLSUV.setVisible(false);
		SMALLSUV.setBorder(BorderFactory.createEmptyBorder());
		SMALLSUV.setContentAreaFilled(false);
		SMALLSUV.addActionListener(lForButton);
		SMALLSUV.setBounds(30, 200, 50, 50);
		thePanel.add(SMALLSUV);
		
		BufferedImage SUVICON = ImageIO.read(new File("FORD-SUV-ICON.png"));
		SUV = new JButton(new ImageIcon(SUVICON));
		SUV.setVisible(false);
		SUV.setBorder(BorderFactory.createEmptyBorder());
		SUV.setContentAreaFilled(false);
		SUV.addActionListener(lForButton);
		SUV.setBounds(30, 200, 50, 50);
		thePanel.add(SUV);
		
		BufferedImage VANICON = ImageIO.read(new File("CHEVROLET-VAN-ICON.png"));
		VAN = new JButton(new ImageIcon(VANICON));
		VAN.setVisible(false);
		VAN.setBorder(BorderFactory.createEmptyBorder());
		VAN.setContentAreaFilled(false);
		VAN.addActionListener(lForButton);
		VAN.setBounds(30, 200, 50, 50);
		thePanel.add(VAN);
		
		BufferedImage MINIVANICON = ImageIO.read(new File("HONDA-MINIVAN-ICON.png"));
		MINIVAN = new JButton(new ImageIcon(MINIVANICON));
		MINIVAN.setVisible(false);
		MINIVAN.setBorder(BorderFactory.createEmptyBorder());
		MINIVAN.setContentAreaFilled(false);
		MINIVAN.addActionListener(lForButton);
		MINIVAN.setBounds(30, 200, 50, 50);
		thePanel.add(MINIVAN);
		
		BufferedImage TRUCKICON = ImageIO.read(new File("GMC-TRUCK-ICON.png"));
		TRUCK = new JButton(new ImageIcon(TRUCKICON));
		TRUCK.setVisible(false);
		TRUCK.setBorder(BorderFactory.createEmptyBorder());
		TRUCK.setContentAreaFilled(false);
		TRUCK.addActionListener(lForButton);
		TRUCK.setBounds(30, 200, 50, 50);
		thePanel.add(TRUCK);
		
		BufferedImage ACURAICON = ImageIO.read(new File("LOGOS/ACURA-LOGO.png"));
		BufferedImage AUDIICON = ImageIO.read(new File("LOGOS/AUDI-LOGO.png"));
		BufferedImage BMWICON = ImageIO.read(new File("LOGOS/BMW-LOGO.png"));
		BufferedImage BUICKICON = ImageIO.read(new File("LOGOS/BUICK-LOGO.png"));
		BufferedImage CADILLACICON = ImageIO.read(new File("LOGOS/CADILLAC-LOGO.png"));
		BufferedImage CHEVROLETICON = ImageIO.read(new File("LOGOS/CHEVROLET-LOGO.png"));
		BufferedImage CHRYSLERICON = ImageIO.read(new File("LOGOS/CHRYSLER-LOGO.png"));
		BufferedImage DODGEICON = ImageIO.read(new File("LOGOS/DODGE-LOGO.png"));
		BufferedImage FORDICON = ImageIO.read(new File("LOGOS/FORD-LOGO.png"));
		BufferedImage GMCICON = ImageIO.read(new File("LOGOS/GMC-LOGO.png"));
		BufferedImage HONDAICON = ImageIO.read(new File("LOGOS/HONDA-LOGO.png"));
		BufferedImage HYUNDAIICON = ImageIO.read(new File("LOGOS/HYUNDAI-LOGO.png"));
		BufferedImage INFINITIICON = ImageIO.read(new File("LOGOS/INFINITI-LOGO.png"));
		BufferedImage JEEPICON = ImageIO.read(new File("LOGOS/JEEP-LOGO.png"));
		BufferedImage KIAICON = ImageIO.read(new File("LOGOS/KIA-LOGO.png"));
		BufferedImage LANDROVERICON = ImageIO.read(new File("LOGOS/LANDROVER-LOGO.png"));
		BufferedImage LEXUSICON = ImageIO.read(new File("LOGOS/LEXUS-LOGO.png"));
		BufferedImage LINCOLNICON = ImageIO.read(new File("LOGOS/LINCOLN-LOGO.png"));
		BufferedImage MAZDAICON = ImageIO.read(new File("LOGOS/MAZDA-LOGO.png"));
		BufferedImage MERCEDESICON = ImageIO.read(new File("LOGOS/MERCEDES-LOGO.png"));
		BufferedImage MINIICON = ImageIO.read(new File("LOGOS/MINI-LOGO.png"));
		BufferedImage MITSUBISHIICON = ImageIO.read(new File("LOGOS/MITSUBISHI-LOGO.png"));
		BufferedImage NISSANICON = ImageIO.read(new File("LOGOS/NISSAN-LOGO.png"));
		BufferedImage SUBARUICON = ImageIO.read(new File("LOGOS/SUBARU-LOGO.png"));
		BufferedImage TOYOTAICON = ImageIO.read(new File("LOGOS/TOYOTA-LOGO.png"));
		BufferedImage VOLKSWAGENICON = ImageIO.read(new File("LOGOS/VOLKSWAGEN-LOGO.png"));
		BufferedImage VOLVOICON = ImageIO.read(new File("LOGOS/VOLVO-LOGO.png"));
		
		BufferedImage NSXICON = ImageIO.read(new File("LOGOS/NSX-LOGO.png"));
		
		ACURA = new JButton(new ImageIcon(ACURAICON));
		ACURA.setVisible(false);
		ACURA.setBorder(BorderFactory.createEmptyBorder());
		ACURA.setContentAreaFilled(false);
		ACURA.addActionListener(lForButton);
		ACURA.setBounds(30, 200, 50, 50);
		thePanel.add(ACURA);
		
		ACURA2 = new JButton(new ImageIcon(ACURAICON));
		ACURA2.setVisible(false);
		ACURA2.setBorder(BorderFactory.createEmptyBorder());
		ACURA2.setContentAreaFilled(false);
		ACURA2.addActionListener(lForButton);
		ACURA2.setBounds(30, 200, 50, 50);
		thePanel.add(ACURA2);
		
		ACURA5 = new JButton(new ImageIcon(ACURAICON));
		ACURA5.setVisible(false);
		ACURA5.setBorder(BorderFactory.createEmptyBorder());
		ACURA5.setContentAreaFilled(false);
		ACURA5.addActionListener(lForButton);
		ACURA5.setBounds(30, 200, 50, 50);
		thePanel.add(ACURA5);

		AUDI = new JButton(new ImageIcon(AUDIICON));
		AUDI.setVisible(false);
		AUDI.setBorder(BorderFactory.createEmptyBorder());
		AUDI.setContentAreaFilled(false);
		AUDI.addActionListener(lForButton);
		AUDI.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI);
		
		AUDI2 = new JButton(new ImageIcon(AUDIICON));
		AUDI2.setVisible(false);
		AUDI2.setBorder(BorderFactory.createEmptyBorder());
		AUDI2.setContentAreaFilled(false);
		AUDI2.addActionListener(lForButton);
		AUDI2.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI2);
		
		AUDI3 = new JButton(new ImageIcon(AUDIICON));
		AUDI3.setVisible(false);
		AUDI3.setBorder(BorderFactory.createEmptyBorder());
		AUDI3.setContentAreaFilled(false);
		AUDI3.addActionListener(lForButton);
		AUDI3.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI3);
		
		AUDI4 = new JButton(new ImageIcon(AUDIICON));
		AUDI4.setVisible(false);
		AUDI4.setBorder(BorderFactory.createEmptyBorder());
		AUDI4.setContentAreaFilled(false);
		AUDI4.addActionListener(lForButton);
		AUDI4.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI4);
		
		AUDI5 = new JButton(new ImageIcon(AUDIICON));
		AUDI5.setVisible(false);
		AUDI5.setBorder(BorderFactory.createEmptyBorder());
		AUDI5.setContentAreaFilled(false);
		AUDI5.addActionListener(lForButton);
		AUDI5.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI5);
		
		AUDI6 = new JButton(new ImageIcon(AUDIICON));
		AUDI6.setVisible(false);
		AUDI6.setBorder(BorderFactory.createEmptyBorder());
		AUDI6.setContentAreaFilled(false);
		AUDI6.addActionListener(lForButton);
		AUDI6.setBounds(30, 200, 50, 50);
		thePanel.add(AUDI6);
		
		BMW2 = new JButton(new ImageIcon(BMWICON));
		BMW2.setVisible(false);
		BMW2.setBorder(BorderFactory.createEmptyBorder());
		BMW2.setContentAreaFilled(false);
		BMW2.addActionListener(lForButton);
		BMW2.setBounds(30, 200, 50, 50);
		thePanel.add(BMW2);
		
		BMW3 = new JButton(new ImageIcon(BMWICON));
		BMW3.setVisible(false);
		BMW3.setBorder(BorderFactory.createEmptyBorder());
		BMW3.setContentAreaFilled(false);
		BMW3.addActionListener(lForButton);
		BMW3.setBounds(30, 200, 50, 50);
		thePanel.add(BMW3);
		
		BMW5 = new JButton(new ImageIcon(BMWICON));
		BMW5.setVisible(false);
		BMW5.setBorder(BorderFactory.createEmptyBorder());
		BMW5.setContentAreaFilled(false);
		BMW5.addActionListener(lForButton);
		BMW5.setBounds(30, 200, 50, 50);
		thePanel.add(BMW5);
		
		BMW6 = new JButton(new ImageIcon(BMWICON));
		BMW6.setVisible(false);
		BMW6.setBorder(BorderFactory.createEmptyBorder());
		BMW6.setContentAreaFilled(false);
		BMW6.addActionListener(lForButton);
		BMW6.setBounds(30, 200, 50, 50);
		thePanel.add(BMW6);
		
		BUICK2 = new JButton(new ImageIcon(BUICKICON));
		BUICK2.setVisible(false);
		BUICK2.setBorder(BorderFactory.createEmptyBorder());
		BUICK2.setContentAreaFilled(false);
		BUICK2.addActionListener(lForButton);
		BUICK2.setBounds(30, 200, 50, 50);
		thePanel.add(BUICK2);
		
		BUICK3 = new JButton(new ImageIcon(BUICKICON));
		BUICK3.setVisible(false);
		BUICK3.setBorder(BorderFactory.createEmptyBorder());
		BUICK3.setContentAreaFilled(false);
		BUICK3.addActionListener(lForButton);
		BUICK3.setBounds(30, 200, 50, 50);
		thePanel.add(BUICK3);
		
		BUICK5 = new JButton(new ImageIcon(BUICKICON));
		BUICK5.setVisible(false);
		BUICK5.setBorder(BorderFactory.createEmptyBorder());
		BUICK5.setContentAreaFilled(false);
		BUICK5.addActionListener(lForButton);
		BUICK5.setBounds(30, 200, 50, 50);
		thePanel.add(BUICK5);
		
		BUICK6 = new JButton(new ImageIcon(BUICKICON));
		BUICK6.setVisible(false);
		BUICK6.setBorder(BorderFactory.createEmptyBorder());
		BUICK6.setContentAreaFilled(false);
		BUICK6.addActionListener(lForButton);
		BUICK6.setBounds(30, 200, 50, 50);
		thePanel.add(BUICK6);
		
		CADILLAC2 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC2.setVisible(false);
		CADILLAC2.setBorder(BorderFactory.createEmptyBorder());
		CADILLAC2.setContentAreaFilled(false);
		CADILLAC2.addActionListener(lForButton);
		CADILLAC2.setBounds(30, 200, 50, 50);
		thePanel.add(CADILLAC2);
		
		CADILLAC3 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC3.setVisible(false);
		CADILLAC3.setBorder(BorderFactory.createEmptyBorder());
		CADILLAC3.setContentAreaFilled(false);
		CADILLAC3.addActionListener(lForButton);
		CADILLAC3.setBounds(30, 200, 50, 50);
		thePanel.add(CADILLAC3);
		
		CADILLAC5 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC5.setVisible(false);
		CADILLAC5.setBorder(BorderFactory.createEmptyBorder());
		CADILLAC5.setContentAreaFilled(false);
		CADILLAC5.addActionListener(lForButton);
		CADILLAC5.setBounds(30, 200, 50, 50);
		thePanel.add(CADILLAC5);
		
		CADILLAC6 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC6.setVisible(false);
		CADILLAC6.setBorder(BorderFactory.createEmptyBorder());
		CADILLAC6.setContentAreaFilled(false);
		CADILLAC6.addActionListener(lForButton);
		CADILLAC6.setBounds(30, 200, 50, 50);
		thePanel.add(CADILLAC6);
		
		CHEVROLET = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET.setVisible(false);
		CHEVROLET.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET.setContentAreaFilled(false);
		CHEVROLET.addActionListener(lForButton);
		CHEVROLET.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET);
		
		CHEVROLET2 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET2.setVisible(false);
		CHEVROLET2.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET2.setContentAreaFilled(false);
		CHEVROLET2.addActionListener(lForButton);
		CHEVROLET2.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET2);
		
		CHEVROLET3 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET3.setVisible(false);
		CHEVROLET3.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET3.setContentAreaFilled(false);
		CHEVROLET3.addActionListener(lForButton);
		CHEVROLET3.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET3);
		
		CHEVROLET4 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET4.setVisible(false);
		CHEVROLET4.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET4.setContentAreaFilled(false);
		CHEVROLET4.addActionListener(lForButton);
		CHEVROLET4.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET4);
		
		CHEVROLET5 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET5.setVisible(false);
		CHEVROLET5.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET5.setContentAreaFilled(false);
		CHEVROLET5.addActionListener(lForButton);
		CHEVROLET5.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET5);
		
		CHEVROLET6 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET6.setVisible(false);
		CHEVROLET6.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET6.setContentAreaFilled(false);
		CHEVROLET6.addActionListener(lForButton);
		CHEVROLET6.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET6);
		
		CHEVROLET8 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET8.setVisible(false);
		CHEVROLET8.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET8.setContentAreaFilled(false);
		CHEVROLET8.addActionListener(lForButton);
		CHEVROLET8.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET8);
		
		CHEVROLET9 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET9.setVisible(false);
		CHEVROLET9.setBorder(BorderFactory.createEmptyBorder());
		CHEVROLET9.setContentAreaFilled(false);
		CHEVROLET9.addActionListener(lForButton);
		CHEVROLET9.setBounds(30, 200, 50, 50);
		thePanel.add(CHEVROLET9);
		
		
		CHRYSLER = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER.setVisible(false);
		CHRYSLER.setBorder(BorderFactory.createEmptyBorder());
		CHRYSLER.setContentAreaFilled(false);
		CHRYSLER.addActionListener(lForButton);
		CHRYSLER.setBounds(30, 200, 50, 50);
		thePanel.add(CHRYSLER);
		
		CHRYSLER3 = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER3.setVisible(false);
		CHRYSLER3.setBorder(BorderFactory.createEmptyBorder());
		CHRYSLER3.setContentAreaFilled(false);
		CHRYSLER3.addActionListener(lForButton);
		CHRYSLER3.setBounds(30, 200, 50, 50);
		thePanel.add(CHRYSLER3);
		
		CHRYSLER7 = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER7.setVisible(false);
		CHRYSLER7.setBorder(BorderFactory.createEmptyBorder());
		CHRYSLER7.setContentAreaFilled(false);
		CHRYSLER7.addActionListener(lForButton);
		CHRYSLER7.setBounds(30, 200, 50, 50);
		thePanel.add(CHRYSLER7);
		
		DODGE = new JButton(new ImageIcon(DODGEICON));
		DODGE.setVisible(false);
		DODGE.setBorder(BorderFactory.createEmptyBorder());
		DODGE.setContentAreaFilled(false);
		DODGE.addActionListener(lForButton);
		DODGE.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE);
		
		DODGE3 = new JButton(new ImageIcon(DODGEICON));
		DODGE3.setVisible(false);
		DODGE3.setBorder(BorderFactory.createEmptyBorder());
		DODGE3.setContentAreaFilled(false);
		DODGE3.addActionListener(lForButton);
		DODGE3.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE3);
		
		DODGE5 = new JButton(new ImageIcon(DODGEICON));
		DODGE5.setVisible(false);
		DODGE5.setBorder(BorderFactory.createEmptyBorder());
		DODGE5.setContentAreaFilled(false);
		DODGE5.addActionListener(lForButton);
		DODGE5.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE5);
		
		DODGE6 = new JButton(new ImageIcon(DODGEICON));
		DODGE6.setVisible(false);
		DODGE6.setBorder(BorderFactory.createEmptyBorder());
		DODGE6.setContentAreaFilled(false);
		DODGE6.addActionListener(lForButton);
		DODGE6.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE6);
		
		DODGE7 = new JButton(new ImageIcon(DODGEICON));
		DODGE7.setVisible(false);
		DODGE7.setBorder(BorderFactory.createEmptyBorder());
		DODGE7.setContentAreaFilled(false);
		DODGE7.addActionListener(lForButton);
		DODGE7.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE7);
		
		DODGE9 = new JButton(new ImageIcon(DODGEICON));
		DODGE9.setVisible(false);
		DODGE9.setBorder(BorderFactory.createEmptyBorder());
		DODGE9.setContentAreaFilled(false);
		DODGE9.addActionListener(lForButton);
		DODGE9.setBounds(30, 200, 50, 50);
		thePanel.add(DODGE9);
		
		FORD = new JButton(new ImageIcon(FORDICON));
		FORD.setVisible(false);
		FORD.setBorder(BorderFactory.createEmptyBorder());
		FORD.setContentAreaFilled(false);
		FORD.addActionListener(lForButton);
		FORD.setBounds(30, 200, 50, 50);
		thePanel.add(FORD);
		
		FORD2 = new JButton(new ImageIcon(FORDICON));
		FORD2.setVisible(false);
		FORD2.setBorder(BorderFactory.createEmptyBorder());
		FORD2.setContentAreaFilled(false);
		FORD2.addActionListener(lForButton);
		FORD2.setBounds(30, 200, 50, 50);
		thePanel.add(FORD2);
		
		FORD3 = new JButton(new ImageIcon(FORDICON));
		FORD3.setVisible(false);
		FORD3.setBorder(BorderFactory.createEmptyBorder());
		FORD3.setContentAreaFilled(false);
		FORD3.addActionListener(lForButton);
		FORD3.setBounds(30, 200, 50, 50);
		thePanel.add(FORD3);
		
		FORD5 = new JButton(new ImageIcon(FORDICON));
		FORD5.setVisible(false);
		FORD5.setBorder(BorderFactory.createEmptyBorder());
		FORD5.setContentAreaFilled(false);
		FORD5.addActionListener(lForButton);
		FORD5.setBounds(30, 200, 50, 50);
		thePanel.add(FORD5);
		
		FORD6 = new JButton(new ImageIcon(FORDICON));
		FORD6.setVisible(false);
		FORD6.setBorder(BorderFactory.createEmptyBorder());
		FORD6.setContentAreaFilled(false);
		FORD6.addActionListener(lForButton);
		FORD6.setBounds(30, 200, 50, 50);
		thePanel.add(FORD6);
		
		FORD8 = new JButton(new ImageIcon(FORDICON));
		FORD8.setVisible(false);
		FORD8.setBorder(BorderFactory.createEmptyBorder());
		FORD8.setContentAreaFilled(false);
		FORD8.addActionListener(lForButton);
		FORD8.setBounds(30, 200, 50, 50);
		thePanel.add(FORD8);
		
		FORD9 = new JButton(new ImageIcon(FORDICON));
		FORD9.setVisible(false);
		FORD9.setBorder(BorderFactory.createEmptyBorder());
		FORD9.setContentAreaFilled(false);
		FORD9.addActionListener(lForButton);
		FORD9.setBounds(30, 200, 50, 50);
		thePanel.add(FORD9);
		
		GMC5 = new JButton(new ImageIcon(GMCICON));
		GMC5.setVisible(false);
		GMC5.setBorder(BorderFactory.createEmptyBorder());
		GMC5.setContentAreaFilled(false);
		GMC5.addActionListener(lForButton);
		GMC5.setBounds(30, 200, 50, 50);
		thePanel.add(GMC5);
		
		GMC6 = new JButton(new ImageIcon(GMCICON));
		GMC6.setVisible(false);
		GMC6.setBorder(BorderFactory.createEmptyBorder());
		GMC6.setContentAreaFilled(false);
		GMC6.addActionListener(lForButton);
		GMC6.setBounds(30, 200, 50, 50);
		thePanel.add(GMC6);
		
		GMC9 = new JButton(new ImageIcon(GMCICON));
		GMC9.setVisible(false);
		GMC9.setBorder(BorderFactory.createEmptyBorder());
		GMC9.setContentAreaFilled(false);
		GMC9.addActionListener(lForButton);
		GMC9.setBounds(30, 200, 50, 50);
		thePanel.add(GMC9);
		
		HONDA2 = new JButton(new ImageIcon(HONDAICON));
		HONDA2.setVisible(false);
		HONDA2.setBorder(BorderFactory.createEmptyBorder());
		HONDA2.setContentAreaFilled(false);
		HONDA2.addActionListener(lForButton);
		HONDA2.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA2);
		
		HONDA3 = new JButton(new ImageIcon(HONDAICON));
		HONDA3.setVisible(false);
		HONDA3.setBorder(BorderFactory.createEmptyBorder());
		HONDA3.setContentAreaFilled(false);
		HONDA3.addActionListener(lForButton);
		HONDA3.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA3);
		
		HONDA4 = new JButton(new ImageIcon(HONDAICON));
		HONDA4.setVisible(false);
		HONDA4.setBorder(BorderFactory.createEmptyBorder());
		HONDA4.setContentAreaFilled(false);
		HONDA4.addActionListener(lForButton);
		HONDA4.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA4);
		
		HONDA5 = new JButton(new ImageIcon(HONDAICON));
		HONDA5.setVisible(false);
		HONDA5.setBorder(BorderFactory.createEmptyBorder());
		HONDA5.setContentAreaFilled(false);
		HONDA5.addActionListener(lForButton);
		HONDA5.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA5);
		
		HONDA7 = new JButton(new ImageIcon(HONDAICON));
		HONDA7.setVisible(false);
		HONDA7.setBorder(BorderFactory.createEmptyBorder());
		HONDA7.setContentAreaFilled(false);
		HONDA7.addActionListener(lForButton);
		HONDA7.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA7);
		
		HONDA9 = new JButton(new ImageIcon(HONDAICON));
		HONDA9.setVisible(false);
		HONDA9.setBorder(BorderFactory.createEmptyBorder());
		HONDA9.setContentAreaFilled(false);
		HONDA9.addActionListener(lForButton);
		HONDA9.setBounds(30, 200, 50, 50);
		thePanel.add(HONDA9);
		
		HYUNDAI2 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI2.setVisible(false);
		HYUNDAI2.setBorder(BorderFactory.createEmptyBorder());
		HYUNDAI2.setContentAreaFilled(false);
		HYUNDAI2.addActionListener(lForButton);
		HYUNDAI2.setBounds(30, 200, 50, 50);
		thePanel.add(HYUNDAI2);
		
		HYUNDAI3 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI3.setVisible(false);
		HYUNDAI3.setBorder(BorderFactory.createEmptyBorder());
		HYUNDAI3.setContentAreaFilled(false);
		HYUNDAI3.addActionListener(lForButton);
		HYUNDAI3.setBounds(30, 200, 50, 50);
		thePanel.add(HYUNDAI3);
		
		HYUNDAI5 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI5.setVisible(false);
		HYUNDAI5.setBorder(BorderFactory.createEmptyBorder());
		HYUNDAI5.setContentAreaFilled(false);
		HYUNDAI5.addActionListener(lForButton);
		HYUNDAI5.setBounds(30, 200, 50, 50);
		thePanel.add(HYUNDAI5);
		
		INFINITI2 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI2.setVisible(false);
		INFINITI2.setBorder(BorderFactory.createEmptyBorder());
		INFINITI2.setContentAreaFilled(false);
		INFINITI2.addActionListener(lForButton);
		INFINITI2.setBounds(30, 200, 50, 50);
		thePanel.add(INFINITI2);
		
		INFINITI3 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI3.setVisible(false);
		INFINITI3.setBorder(BorderFactory.createEmptyBorder());
		INFINITI3.setContentAreaFilled(false);
		INFINITI3.addActionListener(lForButton);
		INFINITI3.setBounds(30, 200, 50, 50);
		thePanel.add(INFINITI3);
		
		INFINITI4 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI4.setVisible(false);
		INFINITI4.setBorder(BorderFactory.createEmptyBorder());
		INFINITI4.setContentAreaFilled(false);
		INFINITI4.addActionListener(lForButton);
		INFINITI4.setBounds(30, 200, 50, 50);
		thePanel.add(INFINITI4);
		
		INFINITI5 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI5.setVisible(false);
		INFINITI5.setBorder(BorderFactory.createEmptyBorder());
		INFINITI5.setContentAreaFilled(false);
		INFINITI5.addActionListener(lForButton);
		INFINITI5.setBounds(30, 200, 50, 50);
		thePanel.add(INFINITI5);
		
		INFINITI6 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI6.setVisible(false);
		INFINITI6.setBorder(BorderFactory.createEmptyBorder());
		INFINITI6.setContentAreaFilled(false);
		INFINITI6.addActionListener(lForButton);
		INFINITI6.setBounds(30, 200, 50, 50);
		thePanel.add(INFINITI6);
		
		JEEP5 = new JButton(new ImageIcon(JEEPICON));
		JEEP5.setVisible(false);
		JEEP5.setBorder(BorderFactory.createEmptyBorder());
		JEEP5.setContentAreaFilled(false);
		JEEP5.addActionListener(lForButton);
		JEEP5.setBounds(30, 200, 50, 50);
		thePanel.add(JEEP5);
		
		JEEP6 = new JButton(new ImageIcon(JEEPICON));
		JEEP6.setVisible(false);
		JEEP6.setBorder(BorderFactory.createEmptyBorder());
		JEEP6.setContentAreaFilled(false);
		JEEP6.addActionListener(lForButton);
		JEEP6.setBounds(30, 200, 50, 50);
		thePanel.add(JEEP6);
		
		KIA2 = new JButton(new ImageIcon(KIAICON));
		KIA2.setVisible(false);
		KIA2.setBorder(BorderFactory.createEmptyBorder());
		KIA2.setContentAreaFilled(false);
		KIA2.addActionListener(lForButton);
		KIA2.setBounds(30, 200, 50, 50);
		thePanel.add(KIA2);
		
		KIA3 = new JButton(new ImageIcon(KIAICON));
		KIA3.setVisible(false);
		KIA3.setBorder(BorderFactory.createEmptyBorder());
		KIA3.setContentAreaFilled(false);
		KIA3.addActionListener(lForButton);
		KIA3.setBounds(30, 200, 50, 50);
		thePanel.add(KIA3);
		
		KIA4 = new JButton(new ImageIcon(KIAICON));
		KIA4.setVisible(false);
		KIA4.setBorder(BorderFactory.createEmptyBorder());
		KIA4.setContentAreaFilled(false);
		KIA4.addActionListener(lForButton);
		KIA4.setBounds(30, 200, 50, 50);
		thePanel.add(KIA4);
		
		KIA5 = new JButton(new ImageIcon(KIAICON));
		KIA5.setVisible(false);
		KIA5.setBorder(BorderFactory.createEmptyBorder());
		KIA5.setContentAreaFilled(false);
		KIA5.addActionListener(lForButton);
		KIA5.setBounds(30, 200, 50, 50);
		thePanel.add(KIA5);
		
		KIA7 = new JButton(new ImageIcon(KIAICON));
		KIA7.setVisible(false);
		KIA7.setBorder(BorderFactory.createEmptyBorder());
		KIA7.setContentAreaFilled(false);
		KIA7.addActionListener(lForButton);
		KIA7.setBounds(30, 200, 50, 50);
		thePanel.add(KIA7);
		
		LANDROVER5 = new JButton(new ImageIcon(LANDROVERICON));
		LANDROVER5.setVisible(false);
		LANDROVER5.setBorder(BorderFactory.createEmptyBorder());
		LANDROVER5.setContentAreaFilled(false);
		LANDROVER5.addActionListener(lForButton);
		LANDROVER5.setBounds(30, 200, 50, 50);
		thePanel.add(LANDROVER5);
		
		LANDROVER6 = new JButton(new ImageIcon(LANDROVERICON));
		LANDROVER6.setVisible(false);
		LANDROVER6.setBorder(BorderFactory.createEmptyBorder());
		LANDROVER6.setContentAreaFilled(false);
		LANDROVER6.addActionListener(lForButton);
		LANDROVER6.setBounds(30, 200, 50, 50);
		thePanel.add(LANDROVER6);
		
		LEXUS2 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS2.setVisible(false);
		LEXUS2.setBorder(BorderFactory.createEmptyBorder());
		LEXUS2.setContentAreaFilled(false);
		LEXUS2.addActionListener(lForButton);
		LEXUS2.setBounds(30, 200, 50, 50);
		thePanel.add(LEXUS2);
		
		LEXUS3 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS3.setVisible(false);
		LEXUS3.setBorder(BorderFactory.createEmptyBorder());
		LEXUS3.setContentAreaFilled(false);
		LEXUS3.addActionListener(lForButton);
		LEXUS3.setBounds(30, 200, 50, 50);
		thePanel.add(LEXUS3);
		
		LEXUS5 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS5.setVisible(false);
		LEXUS5.setBorder(BorderFactory.createEmptyBorder());
		LEXUS5.setContentAreaFilled(false);
		LEXUS5.addActionListener(lForButton);
		LEXUS5.setBounds(30, 200, 50, 50);
		thePanel.add(LEXUS5);
		
		LEXUS6 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS6.setVisible(false);
		LEXUS6.setBorder(BorderFactory.createEmptyBorder());
		LEXUS6.setContentAreaFilled(false);
		LEXUS6.addActionListener(lForButton);
		LEXUS6.setBounds(30, 200, 50, 50);
		thePanel.add(LEXUS6);
		
		LINCOLN3 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN3.setVisible(false);
		LINCOLN3.setBorder(BorderFactory.createEmptyBorder());
		LINCOLN3.setContentAreaFilled(false);
		LINCOLN3.addActionListener(lForButton);
		LINCOLN3.setBounds(30, 200, 50, 50);
		thePanel.add(LINCOLN3);
		
		LINCOLN5 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN5.setVisible(false);
		LINCOLN5.setBorder(BorderFactory.createEmptyBorder());
		LINCOLN5.setContentAreaFilled(false);
		LINCOLN5.addActionListener(lForButton);
		LINCOLN5.setBounds(30, 200, 50, 50);
		thePanel.add(LINCOLN5);
		
		LINCOLN6 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN6.setVisible(false);
		LINCOLN6.setBorder(BorderFactory.createEmptyBorder());
		LINCOLN6.setContentAreaFilled(false);
		LINCOLN6.addActionListener(lForButton);
		LINCOLN6.setBounds(30, 200, 50, 50);
		thePanel.add(LINCOLN6);
		
		MAZDA = new JButton(new ImageIcon(MAZDAICON));
		MAZDA.setVisible(false);
		MAZDA.setBorder(BorderFactory.createEmptyBorder());
		MAZDA.setContentAreaFilled(false);
		MAZDA.addActionListener(lForButton);
		MAZDA.setBounds(30, 200, 50, 50);
		thePanel.add(MAZDA);
		
		MAZDA2 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA2.setVisible(false);
		MAZDA2.setBorder(BorderFactory.createEmptyBorder());
		MAZDA2.setContentAreaFilled(false);
		MAZDA2.addActionListener(lForButton);
		MAZDA2.setBounds(30, 200, 50, 50);
		thePanel.add(MAZDA2);
		
		MAZDA3 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA3.setVisible(false);
		MAZDA3.setBorder(BorderFactory.createEmptyBorder());
		MAZDA3.setContentAreaFilled(false);
		MAZDA3.addActionListener(lForButton);
		MAZDA3.setBounds(30, 200, 50, 50);
		thePanel.add(MAZDA3);
		
		MAZDA5 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA5.setVisible(false);
		MAZDA5.setBorder(BorderFactory.createEmptyBorder());
		MAZDA5.setContentAreaFilled(false);
		MAZDA5.addActionListener(lForButton);
		MAZDA5.setBounds(30, 200, 50, 50);
		thePanel.add(MAZDA5);
		
		MERCEDES = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES.setVisible(false);
		MERCEDES.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES.setContentAreaFilled(false);
		MERCEDES.addActionListener(lForButton);
		MERCEDES.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES);
		
		MERCEDES2 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES2.setVisible(false);
		MERCEDES2.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES2.setContentAreaFilled(false);
		MERCEDES2.addActionListener(lForButton);
		MERCEDES2.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES2);
		
		MERCEDES3 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES3.setVisible(false);
		MERCEDES3.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES3.setContentAreaFilled(false);
		MERCEDES3.addActionListener(lForButton);
		MERCEDES3.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES3);
		
		MERCEDES4 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES4.setVisible(false);
		MERCEDES4.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES4.setContentAreaFilled(false);
		MERCEDES4.addActionListener(lForButton);
		MERCEDES4.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES4);
		
		MERCEDES5 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES5.setVisible(false);
		MERCEDES5.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES5.setContentAreaFilled(false);
		MERCEDES5.addActionListener(lForButton);
		MERCEDES5.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES5);
		
		MERCEDES6 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES6.setVisible(false);
		MERCEDES6.setBorder(BorderFactory.createEmptyBorder());
		MERCEDES6.setContentAreaFilled(false);
		MERCEDES6.addActionListener(lForButton);
		MERCEDES6.setBounds(30, 200, 50, 50);
		thePanel.add(MERCEDES6);
		
		MINI = new JButton(new ImageIcon(MINIICON));
		MINI.setVisible(false);
		MINI.setBorder(BorderFactory.createEmptyBorder());
		MINI.setContentAreaFilled(false);
		MINI.addActionListener(lForButton);
		MINI.setBounds(30, 200, 50, 50);
		thePanel.add(MINI);

		MINI3 = new JButton(new ImageIcon(MINIICON));
		MINI3.setVisible(false);
		MINI3.setBorder(BorderFactory.createEmptyBorder());
		MINI3.setContentAreaFilled(false);
		MINI3.addActionListener(lForButton);
		MINI3.setBounds(30, 200, 50, 50);
		thePanel.add(MINI3);
		
		MITSUBISHI2 = new JButton(new ImageIcon(MITSUBISHIICON));
		MITSUBISHI2.setVisible(false);
		MITSUBISHI2.setBorder(BorderFactory.createEmptyBorder());
		MITSUBISHI2.setContentAreaFilled(false);
		MITSUBISHI2.addActionListener(lForButton);
		thePanel.add(MITSUBISHI2);
		
		MITSUBISHI5 = new JButton(new ImageIcon(MITSUBISHIICON));
		MITSUBISHI5.setVisible(false);
		MITSUBISHI5.setBorder(BorderFactory.createEmptyBorder());
		MITSUBISHI5.setContentAreaFilled(false);
		MITSUBISHI5.addActionListener(lForButton);
		thePanel.add(MITSUBISHI5);
		
		NISSAN = new JButton(new ImageIcon(NISSANICON));
		NISSAN.setVisible(false);
		NISSAN.setBorder(BorderFactory.createEmptyBorder());
		NISSAN.setContentAreaFilled(false);
		NISSAN.addActionListener(lForButton);
		thePanel.add(NISSAN);
		
		NISSAN2 = new JButton(new ImageIcon(NISSANICON));
		NISSAN2.setVisible(false);
		NISSAN2.setBorder(BorderFactory.createEmptyBorder());
		NISSAN2.setContentAreaFilled(false);
		NISSAN2.addActionListener(lForButton);
		thePanel.add(NISSAN2);
		
		NISSAN3 = new JButton(new ImageIcon(NISSANICON));
		NISSAN3.setVisible(false);
		NISSAN3.setBorder(BorderFactory.createEmptyBorder());
		NISSAN3.setContentAreaFilled(false);
		NISSAN3.addActionListener(lForButton);
		thePanel.add(NISSAN3);
		
		NISSAN4 = new JButton(new ImageIcon(NISSANICON));
		NISSAN4.setVisible(false);
		NISSAN4.setBorder(BorderFactory.createEmptyBorder());
		NISSAN4.setContentAreaFilled(false);
		NISSAN4.addActionListener(lForButton);
		thePanel.add(NISSAN4);
		
		NISSAN5 = new JButton(new ImageIcon(NISSANICON));
		NISSAN5.setVisible(false);
		NISSAN5.setBorder(BorderFactory.createEmptyBorder());
		NISSAN5.setContentAreaFilled(false);
		NISSAN5.addActionListener(lForButton);
		thePanel.add(NISSAN5);
		
		NISSAN6 = new JButton(new ImageIcon(NISSANICON));
		NISSAN6.setVisible(false);
		NISSAN6.setBorder(BorderFactory.createEmptyBorder());
		NISSAN6.setContentAreaFilled(false);
		NISSAN6.addActionListener(lForButton);
		thePanel.add(NISSAN6);
		
		NISSAN7 = new JButton(new ImageIcon(NISSANICON));
		NISSAN7.setVisible(false);
		NISSAN7.setBorder(BorderFactory.createEmptyBorder());
		NISSAN7.setContentAreaFilled(false);
		NISSAN7.addActionListener(lForButton);
		thePanel.add(NISSAN7);
		
		NISSAN9 = new JButton(new ImageIcon(NISSANICON));
		NISSAN9.setVisible(false);
		NISSAN9.setBorder(BorderFactory.createEmptyBorder());
		NISSAN9.setContentAreaFilled(false);
		NISSAN9.addActionListener(lForButton);
		thePanel.add(NISSAN9);

		SUBARU = new JButton(new ImageIcon(SUBARUICON));
		SUBARU.setVisible(false);
		SUBARU.setBorder(BorderFactory.createEmptyBorder());
		SUBARU.setContentAreaFilled(false);
		SUBARU.addActionListener(lForButton);
		thePanel.add(SUBARU);

		SUBARU2 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU2.setVisible(false);
		SUBARU2.setBorder(BorderFactory.createEmptyBorder());
		SUBARU2.setContentAreaFilled(false);
		SUBARU2.addActionListener(lForButton);
		thePanel.add(SUBARU2);
		
		SUBARU3 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU3.setVisible(false);
		SUBARU3.setBorder(BorderFactory.createEmptyBorder());
		SUBARU3.setContentAreaFilled(false);
		SUBARU3.addActionListener(lForButton);
		thePanel.add(SUBARU3);
		
		SUBARU4 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU4.setVisible(false);
		SUBARU4.setBorder(BorderFactory.createEmptyBorder());
		SUBARU4.setContentAreaFilled(false);
		SUBARU4.addActionListener(lForButton);
		thePanel.add(SUBARU4);
		
		SUBARU5 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU5.setVisible(false);
		SUBARU5.setBorder(BorderFactory.createEmptyBorder());
		SUBARU5.setContentAreaFilled(false);
		SUBARU5.addActionListener(lForButton);
		thePanel.add(SUBARU5);
		
		TOYOTA = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA.setVisible(false);
		TOYOTA.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA.setContentAreaFilled(false);
		TOYOTA.addActionListener(lForButton);
		thePanel.add(TOYOTA);
		
		TOYOTA2 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA2.setVisible(false);
		TOYOTA2.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA2.setContentAreaFilled(false);
		TOYOTA2.addActionListener(lForButton);
		thePanel.add(TOYOTA2);
		
		TOYOTA3 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA3.setVisible(false);
		TOYOTA3.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA3.setContentAreaFilled(false);
		TOYOTA3.addActionListener(lForButton);
		thePanel.add(TOYOTA3);
		
		TOYOTA6 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA6.setVisible(false);
		TOYOTA6.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA6.setContentAreaFilled(false);
		TOYOTA6.addActionListener(lForButton);
		thePanel.add(TOYOTA6);
		
		TOYOTA7 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA7.setVisible(false);
		TOYOTA7.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA7.setContentAreaFilled(false);
		TOYOTA7.addActionListener(lForButton);
		thePanel.add(TOYOTA7);
		
		TOYOTA9 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA9.setVisible(false);
		TOYOTA9.setBorder(BorderFactory.createEmptyBorder());
		TOYOTA9.setContentAreaFilled(false);
		TOYOTA9.addActionListener(lForButton);
		thePanel.add(TOYOTA9);
		
		VOLKSWAGEN2 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN2.setVisible(false);
		VOLKSWAGEN2.setBorder(BorderFactory.createEmptyBorder());
		VOLKSWAGEN2.setContentAreaFilled(false);
		VOLKSWAGEN2.addActionListener(lForButton);
		thePanel.add(VOLKSWAGEN2);
		
		VOLKSWAGEN3 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN3.setVisible(false);
		VOLKSWAGEN3.setBorder(BorderFactory.createEmptyBorder());
		VOLKSWAGEN3.setContentAreaFilled(false);
		VOLKSWAGEN3.addActionListener(lForButton);
		thePanel.add(VOLKSWAGEN3);
		
		VOLKSWAGEN4 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN4.setVisible(false);
		VOLKSWAGEN4.setBorder(BorderFactory.createEmptyBorder());
		VOLKSWAGEN4.setContentAreaFilled(false);
		VOLKSWAGEN4.addActionListener(lForButton);
		thePanel.add(VOLKSWAGEN4);
		
		VOLKSWAGEN5 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN5.setVisible(false);
		VOLKSWAGEN5.setBorder(BorderFactory.createEmptyBorder());
		VOLKSWAGEN5.setContentAreaFilled(false);
		VOLKSWAGEN5.addActionListener(lForButton);
		thePanel.add(VOLKSWAGEN5);
		
		VOLKSWAGEN6 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN6.setVisible(false);
		VOLKSWAGEN6.setBorder(BorderFactory.createEmptyBorder());
		VOLKSWAGEN6.setContentAreaFilled(false);
		VOLKSWAGEN6.addActionListener(lForButton);
		thePanel.add(VOLKSWAGEN6);
		
		VOLVO2 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO2.setVisible(false);
		VOLVO2.setBorder(BorderFactory.createEmptyBorder());
		VOLVO2.setContentAreaFilled(false);
		VOLVO2.addActionListener(lForButton);
		thePanel.add(VOLVO2);
		
		VOLVO3 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO3.setVisible(false);
		VOLVO3.setBorder(BorderFactory.createEmptyBorder());
		VOLVO3.setContentAreaFilled(false);
		VOLVO3.addActionListener(lForButton);
		thePanel.add(VOLVO3);
		
		VOLVO4 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO4.setVisible(false);
		VOLVO4.setBorder(BorderFactory.createEmptyBorder());
		VOLVO4.setContentAreaFilled(false);
		VOLVO4.addActionListener(lForButton);
		thePanel.add(VOLVO4);
		
		VOLVO5 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO5.setVisible(false);
		VOLVO5.setBorder(BorderFactory.createEmptyBorder());
		VOLVO5.setContentAreaFilled(false);
		VOLVO5.addActionListener(lForButton);
		thePanel.add(VOLVO5);
		
		VOLVO6 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO6.setVisible(false);
		VOLVO6.setBorder(BorderFactory.createEmptyBorder());
		VOLVO6.setContentAreaFilled(false);
		VOLVO6.addActionListener(lForButton);
		thePanel.add(VOLVO6);
		
		
		// How to add a text field ----------------------
	
		
		textField1 = new JTextField("Type Here", 15);
		
		ListenForKeys lForKeys = new ListenForKeys();
		
		textField1.addKeyListener(lForKeys);
		//thePanel.add(textField1);
		
		
		textArea1 = new JTextArea(10, 67);		
		textArea1.setText("Press START to Begin the program.\n You will be able to find cars by the following order\n 1: Class\n 2: Make\n 3: MPG");
		textArea1.setLineWrap(true);
		textArea1.setVisible(true);		
		textArea1.setWrapStyleWord(true);
		textArea1.setEditable(false);
		textArea1.addKeyListener(lForKeys);
		thePanel.add(textArea1);
		
		LABEL = new JLabel("TEST");
		/**
		LABEL.setFont();
		LABEL.setVerticalAlignment();
		*/
		LABEL.setLocation(WIDTH/2,HEIGHT/2);
		//LABEL.setVisible(true);
		//LABEL.setText("");
		thePanel.add(LABEL);
		
		NSX = new JButton(new ImageIcon(NSXICON));
		NSX.setVisible(false);
		NSX.setBorder(BorderFactory.createEmptyBorder());
		NSX.setContentAreaFilled(false);
		NSX.addActionListener(lForButton);
		thePanel.add(NSX);
		
		
		// Adds scroll bars to the text area ----------
				
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				
		// Other options: VERTICAL_SCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER
				
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		this.addKeyListener(lForKeys);
		
		this.setVisible(true);
		
		// Track the mouse if it is inside of the panel
		
		ListenForMouse lForMouse = new ListenForMouse();
		
		thePanel.addMouseListener(lForMouse);
		
		
		
		
		
	}
	
	public void ClassMakePrint(String n, String m) {				
		
		int i1 = CarManager.Class.indexOf(n);
		int i2 = CarManager.Class.lastIndexOf(n)+1;
		int cars = 0;
		
		if(CarManager.Class.contains(n) && CarManager.Make.contains(m)) {
			for(int i = i1; i < i2; i++) {
				if(CarManager.Make.get(i).contains(m)) {
					cars++;
					textArea1.append("\n" +  cars + "  Year: " + CarManager.Year.get(i) + " " + "Make: " + CarManager.Make.get(i) + " " + "Model: " + CarManager.Model.get(i)
					+ " Transmission: " +  CarManager.Transmission.get(i) + " Drive: " + CarManager.Drive.get(i)
					+ "\n  CityMPG: " + CarManager.CityMPG.get(i) + " HwyMPG: " + CarManager.HighwayMPG.get(i) + " CombinedMPG: " + CarManager.CombinedMPG.get(i) 
					+ "	 City: " + CarManager.RangeCity.get(i) + " Highway: " + CarManager.RangeHwy.get(i) + " Combined: " + CarManager.RangeCMB.get(i) + "\n" );
					AddCustomer(i);
				}
				LABEL.setText("Number of Cars: " + cars);
				}
		
		} else textArea1.append("NO CARS FOUND!");
		
	}
	
	public void AddCustomer(int i) {
		
		CarManager.Year_C.add(CarManager.Model.get(i));
		
		
	}
	
	// Implements ActionListener so it can react to events on components
	
	public class ListenForButton implements ActionListener{
	
		// This method is called when an event occurs
		public void printGUI() {
			
			int i1 = CarManager.Class_ll.indexOf("MINIVAN");
			int i2 = CarManager.Class_ll.lastIndexOf("MINIVAN");
		
			for(int i = i1; i<i2; i++) {	
				label1.setText(CarManager.Class_ll.get(i) + " " + CarManager.Model_ll.get(i));
				textArea1.append(CarManager.Class_ll.get(i) + " " + CarManager.Model_ll.get(i) + "\n");
					}
				}
	
	public void actionPerformed(ActionEvent e){
		
		// Check if the source of the event was the button
		
		
		if(e.getSource()==BACH) {
			
			
			textArea1.setRows(10);
			textArea1.setText("Press START to Begin the program.\n You will be able to find cars by the following order\n 1: Class\n 2: Make\n 3: MPG"); 
			BACH.setVisible(false);
			SEDAN.setVisible(true);
			TRUCK.setVisible(true);
			SUV.setVisible(true);
			SMALLSUV.setVisible(true);
			COMPACT.setVisible(true);
			COUPE.setVisible(true);
			MINIVAN.setVisible(true);
			VAN.setVisible(true);
			STATION.setVisible(true);
			
			ACURA.setVisible(false);
			ACURA2.setVisible(false);
			ACURA5.setVisible(false);
									
			AUDI.setVisible(false);
			AUDI2.setVisible(false);
			AUDI3.setVisible(false);
			AUDI4.setVisible(false);
			AUDI5.setVisible(false);
			AUDI6.setVisible(false);
			
			BMW2.setVisible(false);
			BMW3.setVisible(false);
			BMW5.setVisible(false);
			BMW6.setVisible(false);
			
			BUICK2.setVisible(false);
			BUICK3.setVisible(false);
			BUICK5.setVisible(false);
			BUICK6.setVisible(false);
			
			CADILLAC2.setVisible(false);
			CADILLAC3.setVisible(false);
			CADILLAC5.setVisible(false);
			CADILLAC6.setVisible(false);
			
			CHEVROLET.setVisible(false);
			CHEVROLET2.setVisible(false);
			CHEVROLET3.setVisible(false);
			CHEVROLET4.setVisible(false);
			CHEVROLET5.setVisible(false);
			CHEVROLET6.setVisible(false);
			CHEVROLET8.setVisible(false);
			CHEVROLET9.setVisible(false);
			
			CHRYSLER.setVisible(false);
			CHRYSLER3.setVisible(false);
			CHRYSLER7.setVisible(false);
			
			DODGE.setVisible(false);
			DODGE3.setVisible(false);
			DODGE5.setVisible(false);
			DODGE6.setVisible(false);
			DODGE7.setVisible(false);
			DODGE9.setVisible(false);
			
			FORD.setVisible(false);
			FORD2.setVisible(false);
			FORD3.setVisible(false);
			FORD5.setVisible(false);
			FORD6.setVisible(false);
			FORD8.setVisible(false);
			FORD9.setVisible(false);
			
			GMC5.setVisible(false);
			GMC6.setVisible(false);
			GMC9.setVisible(false);
			
			HONDA2.setVisible(false);
			HONDA3.setVisible(false);
			HONDA4.setVisible(false);
			HONDA5.setVisible(false);
			HONDA7.setVisible(false);
			HONDA9.setVisible(false);
			
			HYUNDAI2.setVisible(false);
			HYUNDAI3.setVisible(false);
			HYUNDAI5.setVisible(false);
			
			INFINITI2.setVisible(false);
			INFINITI3.setVisible(false);
			INFINITI4.setVisible(false);
			INFINITI5.setVisible(false);
			INFINITI6.setVisible(false);
			
			JEEP5.setVisible(false);
			JEEP6.setVisible(false);
			
			KIA2.setVisible(false);
			KIA3.setVisible(false);
			KIA4.setVisible(false);
			KIA5.setVisible(false);
			KIA7.setVisible(false);
			
			LANDROVER5.setVisible(false);
			LANDROVER6.setVisible(false);
			
			LEXUS2.setVisible(false);
			LEXUS3.setVisible(false);
			LEXUS5.setVisible(false);
			LEXUS6.setVisible(false);
			
			LINCOLN3.setVisible(false);
			LINCOLN5.setVisible(false);
			LINCOLN6.setVisible(false);
			
			MAZDA.setVisible(false);
			MAZDA2.setVisible(false);
			MAZDA3.setVisible(false);
			MAZDA5.setVisible(false);
			
			MERCEDES.setVisible(false);
			MERCEDES2.setVisible(false);
			MERCEDES3.setVisible(false);
			MERCEDES4.setVisible(false);
			MERCEDES5.setVisible(false);
			MERCEDES6.setVisible(false);
			
			MINI.setVisible(false);
			MINI3.setVisible(false);
			
			MITSUBISHI2.setVisible(false);
			MITSUBISHI5.setVisible(false);
			
			NISSAN.setVisible(false);
			NISSAN2.setVisible(false);
			NISSAN3.setVisible(false);
			NISSAN4.setVisible(false);
			NISSAN5.setVisible(false);
			NISSAN6.setVisible(false);
			NISSAN7.setVisible(false);
			NISSAN9.setVisible(false);
			
			SUBARU.setVisible(false);
			SUBARU2.setVisible(false);
			SUBARU3.setVisible(false);
			SUBARU4.setVisible(false);
			SUBARU5.setVisible(false);
			
			TOYOTA.setVisible(false);
			TOYOTA2.setVisible(false);
			TOYOTA3.setVisible(false);
			TOYOTA6.setVisible(false);
			TOYOTA7.setVisible(false);
			TOYOTA9.setVisible(false);
			
			VOLKSWAGEN2.setVisible(false);
			VOLKSWAGEN3.setVisible(false);
			VOLKSWAGEN4.setVisible(false);
			VOLKSWAGEN5.setVisible(false);
			VOLKSWAGEN6.setVisible(false);
			
			VOLVO2.setVisible(false);
			VOLVO3.setVisible(false);
			VOLVO4.setVisible(false);
			VOLVO5.setVisible(false);
			VOLVO6.setVisible(false);
	
				
		}  if(e.getSource() == START) {
			textArea1.setRows(10);
			textArea1.setText("Press START to Begin the program.\n You will be able to find cars by the following order\n 1: Class\n 2: Make\n 3: MPG"); 
			BACH.setVisible(false);
			START.setVisible(false);
			SEDAN.setVisible(true);
			TRUCK.setVisible(true);
			SUV.setVisible(true);
			SMALLSUV.setVisible(true);
			COMPACT.setVisible(true);
			COUPE.setVisible(true);
			MINIVAN.setVisible(true);
			VAN.setVisible(true);
			STATION.setVisible(true);
			
			ACURA.setVisible(false);
			ACURA2.setVisible(false);
			ACURA5.setVisible(false);
									
			AUDI.setVisible(false);
			AUDI2.setVisible(false);
			AUDI3.setVisible(false);
			AUDI4.setVisible(false);
			AUDI5.setVisible(false);
			AUDI6.setVisible(false);
			
			BMW2.setVisible(false);
			BMW3.setVisible(false);
			BMW5.setVisible(false);
			BMW6.setVisible(false);
			
			BUICK2.setVisible(false);
			BUICK3.setVisible(false);
			BUICK5.setVisible(false);
			BUICK6.setVisible(false);
			
			CADILLAC2.setVisible(false);
			CADILLAC3.setVisible(false);
			CADILLAC5.setVisible(false);
			CADILLAC6.setVisible(false);
			
			CHEVROLET.setVisible(false);
			CHEVROLET2.setVisible(false);
			CHEVROLET3.setVisible(false);
			CHEVROLET4.setVisible(false);
			CHEVROLET5.setVisible(false);
			CHEVROLET6.setVisible(false);
			CHEVROLET8.setVisible(false);
			CHEVROLET9.setVisible(false);
			
			CHRYSLER.setVisible(false);
			CHRYSLER3.setVisible(false);
			CHRYSLER7.setVisible(false);
			
			DODGE.setVisible(false);
			DODGE3.setVisible(false);
			DODGE5.setVisible(false);
			DODGE6.setVisible(false);
			DODGE7.setVisible(false);
			DODGE9.setVisible(false);
			
			FORD.setVisible(false);
			FORD2.setVisible(false);
			FORD3.setVisible(false);
			FORD5.setVisible(false);
			FORD6.setVisible(false);
			FORD8.setVisible(false);
			FORD9.setVisible(false);
			
			GMC5.setVisible(false);
			GMC6.setVisible(false);
			GMC9.setVisible(false);
			
			HONDA2.setVisible(false);
			HONDA3.setVisible(false);
			HONDA4.setVisible(false);
			HONDA5.setVisible(false);
			HONDA7.setVisible(false);
			HONDA9.setVisible(false);
			
			HYUNDAI2.setVisible(false);
			HYUNDAI3.setVisible(false);
			HYUNDAI5.setVisible(false);
			
			INFINITI2.setVisible(false);
			INFINITI3.setVisible(false);
			INFINITI4.setVisible(false);
			INFINITI5.setVisible(false);
			INFINITI6.setVisible(false);
			
			JEEP5.setVisible(false);
			JEEP6.setVisible(false);
			
			KIA2.setVisible(false);
			KIA3.setVisible(false);
			KIA4.setVisible(false);
			KIA5.setVisible(false);
			KIA7.setVisible(false);
			
			LANDROVER5.setVisible(false);
			LANDROVER6.setVisible(false);
			
			LEXUS2.setVisible(false);
			LEXUS3.setVisible(false);
			LEXUS5.setVisible(false);
			LEXUS6.setVisible(false);
			
			LINCOLN3.setVisible(false);
			LINCOLN5.setVisible(false);
			LINCOLN6.setVisible(false);
			
			MAZDA.setVisible(false);
			MAZDA2.setVisible(false);
			MAZDA3.setVisible(false);
			MAZDA5.setVisible(false);
			
			MERCEDES.setVisible(false);
			MERCEDES2.setVisible(false);
			MERCEDES3.setVisible(false);
			MERCEDES4.setVisible(false);
			MERCEDES5.setVisible(false);
			MERCEDES6.setVisible(false);
			
			MINI.setVisible(false);
			MINI3.setVisible(false);
			
			MITSUBISHI2.setVisible(false);
			MITSUBISHI5.setVisible(false);
			
			NISSAN.setVisible(false);
			NISSAN2.setVisible(false);
			NISSAN3.setVisible(false);
			NISSAN4.setVisible(false);
			NISSAN5.setVisible(false);
			NISSAN6.setVisible(false);
			NISSAN7.setVisible(false);
			NISSAN9.setVisible(false);
			
			SUBARU.setVisible(false);
			SUBARU2.setVisible(false);
			SUBARU3.setVisible(false);
			SUBARU4.setVisible(false);
			SUBARU5.setVisible(false);
			
			TOYOTA.setVisible(false);
			TOYOTA2.setVisible(false);
			TOYOTA3.setVisible(false);
			TOYOTA6.setVisible(false);
			TOYOTA7.setVisible(false);
			TOYOTA9.setVisible(false);
			
			VOLKSWAGEN2.setVisible(false);
			VOLKSWAGEN3.setVisible(false);
			VOLKSWAGEN4.setVisible(false);
			VOLKSWAGEN5.setVisible(false);
			VOLKSWAGEN6.setVisible(false);
			
			VOLVO2.setVisible(false);
			VOLVO3.setVisible(false);
			VOLVO4.setVisible(false);
			VOLVO5.setVisible(false);
			VOLVO6.setVisible(false);
	
		}  
			/*
			 * 
			 * 	BEGIN COUPE BUTTONS -----------------------------------------------
			 * 
			 */
			if(e.getSource() == COUPE) {
			textArea1.setText("			List of Cars in the Coupe Class:\n");
			textArea1.setVisible(true);
			START.setVisible(false);
			SEDAN.setVisible(false);
			TRUCK.setVisible(false);
			SUV.setVisible(false);
			SMALLSUV.setVisible(false);
			COMPACT.setVisible(false);
			COUPE.setVisible(false);
			MINIVAN.setVisible(false);
			VAN.setVisible(false);
			STATION.setVisible(false);
			
			AUDI.setVisible(true);
			ACURA.setVisible(true);
			CHEVROLET.setVisible(true);
			CHRYSLER.setVisible(true);
			DODGE.setVisible(true);
			FORD.setVisible(true);
			MAZDA.setVisible(true);
			MERCEDES.setVisible(true);
			NISSAN.setVisible(true);
			MINI.setVisible(true);
			SUBARU.setVisible(true);
			TOYOTA.setVisible(true);	
		}	
		if(e.getSource() == AUDI) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(true);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "AUDI");
		}
		if(e.getSource() == ACURA) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(true);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			NSX.setVisible(true);
			ClassMakePrint("COUPE", "ACURA");
			textArea1.append(("\nYEAR_C: "+CarManager.Year_C));
		}
		
		if(e.getSource() == CHEVROLET) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(true);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "CHEVROLET");
		}
		if(e.getSource() == CHRYSLER) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(true);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "CHRYSLER");
		}
		if(e.getSource() == DODGE) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(true);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "DODGE");
		}
		if(e.getSource() == FORD) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(true);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "FORD");
		}
		if(e.getSource() == MAZDA) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(true);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "MAZDA");
		}
		if(e.getSource() == MINI) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(true);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "MINI");
		}
		if(e.getSource() == MERCEDES) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(true);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "MERCEDES-BENZ");
		}
		if(e.getSource() == NISSAN) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(true);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "NISSAN");
		}
		if(e.getSource() == SUBARU) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(true);
			TOYOTA.setVisible(false);
			ClassMakePrint("COUPE", "SUBARU");
			}
		if(e.getSource() == TOYOTA) {
			START.setVisible(false);
			BACH.setVisible(true);
			textArea1.setVisible(true);
			AUDI.setVisible(false);
			ACURA.setVisible(false);
			CHEVROLET.setVisible(false);
			CHRYSLER.setVisible(false);
			DODGE.setVisible(false);
			FORD.setVisible(false);
			MAZDA.setVisible(false);
			MERCEDES.setVisible(false);
			NISSAN.setVisible(false);
			MINI.setVisible(false);
			SUBARU.setVisible(false);
			TOYOTA.setVisible(true);
			ClassMakePrint("COUPE", "TOYOTA");
			}
		/*
		 * 
		 * 	BEGIN COMPACT BUTTONS -------------------------------------------
		 * 
		 */
		
		if(e.getSource() == COMPACT) {
			textArea1.setText("			List of Cars in the Compact Class:\n");
			textArea1.setVisible(true);
			START.setVisible(false);
			BACH.setVisible(false);
			SEDAN.setVisible(false);
			TRUCK.setVisible(false);
			SUV.setVisible(false);
			SMALLSUV.setVisible(false);
			COMPACT.setVisible(false);
			COUPE.setVisible(false);
			MINIVAN.setVisible(false);
			VAN.setVisible(false);
			STATION.setVisible(false);
			
			ACURA2.setVisible(true);
			AUDI2.setVisible(true);
			BMW2.setVisible(true);
			BUICK2.setVisible(true);
			CADILLAC2.setVisible(true);
			CHEVROLET2.setVisible(true);
			FORD2.setVisible(true);
			HONDA2.setVisible(true);
			HYUNDAI2.setVisible(true);
			INFINITI2.setVisible(true);
			KIA2.setVisible(true);
			LEXUS2.setVisible(true);
			MAZDA2.setVisible(true);
			MERCEDES2.setVisible(true);
			MITSUBISHI2.setVisible(true);
			NISSAN2.setVisible(true);
			SUBARU2.setVisible(true);
			TOYOTA2.setVisible(true);
			VOLKSWAGEN2.setVisible(true);			
			VOLVO2.setVisible(true);
			
			
			/*
			ACURA.setVisible(true);
			AUDI.setVisible(true);
			BMW.setVisible(true);
			BUICK.setVisible(true);
			CADILLAC.setVisible(true);
			CHEVROLET.setVisible(true);
			CHRYSLER.setVisible(true);
			DODGE.setVisible(true);
			FORD.setVisible(true);
			GMC.setVisible(true);
			HONDA.setVisible(true);
			HYUNDAI.setVisible(true);
			INFINITI.setVisible(true);
			JEEP.setVisible(true);
			KIA.setVisible(true);
			LANDROVER.setVisible(true);
			LEXUS.setVisible(true);
			LINCOLN.setVisible(true);
			MAZDA.setVisible(true);
			MERCEDES.setVisible(true);
			MINI.setVisible(true);
			MITSUBISHI.setVisible(true);
			NISSAN.setVisible(true);
			SUBARU.setVisible(true);
			TOYOTA.setVisible(true);
			VOLKSWAGEN.setVisible(true);			
			VOLVO.setVisible(true);	
			*/
		}
		
		if(e.getSource() == ACURA2) {
			START.setVisible(true);
			textArea1.setVisible(true);
			
			
			
			
			}
		
		
		/*
		 * 
		 * 	BEGIN SEDAN BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == SEDAN) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				AUDI3.setVisible(true);
				BMW3.setVisible(true);
				BUICK3.setVisible(true);
				CADILLAC3.setVisible(true);
				CHEVROLET3.setVisible(true);
				CHRYSLER3.setVisible(true);
				DODGE3.setVisible(true);
				FORD3.setVisible(true);
				HONDA3.setVisible(true);
				HYUNDAI3.setVisible(true);
				INFINITI3.setVisible(true);
				KIA3.setVisible(true);
				LEXUS3.setVisible(true);
				LINCOLN3.setVisible(true);
				MAZDA3.setVisible(true);
				MERCEDES3.setVisible(true);
				MINI3.setVisible(true);
				NISSAN3.setVisible(true);
				SUBARU3.setVisible(true);
				TOYOTA3.setVisible(true);
				VOLKSWAGEN3.setVisible(true);			
				VOLVO3.setVisible(true);
			
			}
		
		
		/*
		 * 
		 * 	BEGIN WAGON BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == STATION) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				AUDI4.setVisible(true);
				CHEVROLET4.setVisible(true);
				HONDA4.setVisible(true);
				INFINITI4.setVisible(true);
				KIA4.setVisible(true);
				MERCEDES4.setVisible(true);
				NISSAN4.setVisible(true);
				SUBARU4.setVisible(true);
				VOLKSWAGEN4.setVisible(true);			
				VOLVO4.setVisible(true);
			
			}
		
		/*
		 * 
		 * 	BEGIN SMALL SUV BUTTONS -------------------------------------------
		 * 
		 */
			
			if(e.getSource() == SMALLSUV) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				ACURA5.setVisible(true);
				AUDI5.setVisible(true);
				BMW5.setVisible(true);
				BUICK5.setVisible(true);
				CADILLAC5.setVisible(true);
				CHEVROLET5.setVisible(true);
				DODGE5.setVisible(true);
				FORD5.setVisible(true);
				GMC5.setVisible(true);
				HONDA5.setVisible(true);
				HYUNDAI5.setVisible(true);
				INFINITI5.setVisible(true);
				JEEP5.setVisible(true);
				KIA5.setVisible(true);
				LANDROVER5.setVisible(true);
				LEXUS5.setVisible(true);
				LINCOLN5.setVisible(true);
				MAZDA5.setVisible(true);
				MERCEDES5.setVisible(true);
				MITSUBISHI5.setVisible(true);
				NISSAN5.setVisible(true);
				SUBARU5.setVisible(true);
				VOLKSWAGEN5.setVisible(true);			
				VOLVO5.setVisible(true);
				
			}
		
		
		/*
		 * 
		 * 	BEGIN SUV BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == SUV) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				AUDI6.setVisible(true);
				BMW6.setVisible(true);
				BUICK6.setVisible(true);
				CADILLAC6.setVisible(true);
				CHEVROLET6.setVisible(true);
				DODGE6.setVisible(true);
				FORD6.setVisible(true);
				GMC6.setVisible(true);
				INFINITI6.setVisible(true);
				JEEP6.setVisible(true);
				LANDROVER6.setVisible(true);
				LEXUS6.setVisible(true);
				LINCOLN6.setVisible(true);
				MERCEDES6.setVisible(true);
				NISSAN6.setVisible(true);
				TOYOTA6.setVisible(true);
				VOLKSWAGEN6.setVisible(true);			
				VOLVO6.setVisible(true);
				
			}
		
		
		/*
		 * 
		 * 	BEGIN MINIVAN BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == MINIVAN) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				CHRYSLER7.setVisible(true);
				DODGE7.setVisible(true);
				HONDA7.setVisible(true);
				NISSAN7.setVisible(true);
				TOYOTA7.setVisible(true);

				
			}
		
		
		/*
		 * 
		 * 	BEGIN VAN BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == VAN) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				CHEVROLET8.setVisible(true);
				FORD8.setVisible(true);
				
				
			}
		
		/*
		 * 
		 * 	BEGIN TRUCK BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == TRUCK) {
				textArea1.setText("			List of Cars in the Compact Class:\n");
				textArea1.setVisible(true);
				START.setVisible(false);
				BACH.setVisible(false);
				SEDAN.setVisible(false);
				TRUCK.setVisible(false);
				SUV.setVisible(false);
				SMALLSUV.setVisible(false);
				COMPACT.setVisible(false);
				COUPE.setVisible(false);
				MINIVAN.setVisible(false);
				VAN.setVisible(false);
				STATION.setVisible(false);
				
				CHEVROLET9.setVisible(true);
				DODGE9.setVisible(true);
				FORD9.setVisible(true);
				GMC9.setVisible(true);
				HONDA9.setVisible(true);
				NISSAN9.setVisible(true);
				TOYOTA9.setVisible(true);
				
			}
		
		}
	
	}
	// By using KeyListener you can track keys on the keyboard
	
	private class ListenForKeys implements KeyListener{
		
		// Handle the key typed event from the text field.
	    public void keyTyped(KeyEvent e) {
	    	textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
	    }

	    // Handle the key-pressed event from the text field.
	    public void keyPressed(KeyEvent e) {
	    	int key = e.getKeyCode();
	    	textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
	    	if(key == KeyEvent.VK_ENTER) {
	    		
	    		textArea1.setRows(10);
				textArea1.setText("Press START to Begin the program.\n You will be able to find cars by the following order\n 1: Class\n 2: Make\n 3: MPG"); 
				START.setVisible(false);
				SEDAN.setVisible(true);
				TRUCK.setVisible(true);
				SUV.setVisible(true);
				SMALLSUV.setVisible(true);
				COMPACT.setVisible(true);
				COUPE.setVisible(true);
				MINIVAN.setVisible(true);
				VAN.setVisible(true);
				STATION.setVisible(true);
				
				ACURA.setVisible(false);
				ACURA2.setVisible(false);
				ACURA5.setVisible(false);
										
				AUDI.setVisible(false);
				AUDI2.setVisible(false);
				AUDI3.setVisible(false);
				AUDI4.setVisible(false);
				AUDI5.setVisible(false);
				AUDI6.setVisible(false);
				
				BMW2.setVisible(false);
				BMW3.setVisible(false);
				BMW5.setVisible(false);
				BMW6.setVisible(false);
				
				BUICK2.setVisible(false);
				BUICK3.setVisible(false);
				BUICK5.setVisible(false);
				BUICK6.setVisible(false);
				
				CADILLAC2.setVisible(false);
				CADILLAC3.setVisible(false);
				CADILLAC5.setVisible(false);
				CADILLAC6.setVisible(false);
				
				CHEVROLET.setVisible(false);
				CHEVROLET2.setVisible(false);
				CHEVROLET3.setVisible(false);
				CHEVROLET4.setVisible(false);
				CHEVROLET5.setVisible(false);
				CHEVROLET6.setVisible(false);
				CHEVROLET8.setVisible(false);
				CHEVROLET9.setVisible(false);
				
				CHRYSLER.setVisible(false);
				CHRYSLER3.setVisible(false);
				CHRYSLER7.setVisible(false);
				
				DODGE.setVisible(false);
				DODGE3.setVisible(false);
				DODGE5.setVisible(false);
				DODGE6.setVisible(false);
				DODGE7.setVisible(false);
				DODGE9.setVisible(false);
				
				FORD.setVisible(false);
				FORD2.setVisible(false);
				FORD3.setVisible(false);
				FORD5.setVisible(false);
				FORD6.setVisible(false);
				FORD8.setVisible(false);
				FORD9.setVisible(false);
				
				GMC5.setVisible(false);
				GMC6.setVisible(false);
				GMC9.setVisible(false);
				
				HONDA2.setVisible(false);
				HONDA3.setVisible(false);
				HONDA4.setVisible(false);
				HONDA5.setVisible(false);
				HONDA7.setVisible(false);
				HONDA9.setVisible(false);
				
				HYUNDAI2.setVisible(false);
				HYUNDAI3.setVisible(false);
				HYUNDAI5.setVisible(false);
				
				INFINITI2.setVisible(false);
				INFINITI3.setVisible(false);
				INFINITI4.setVisible(false);
				INFINITI5.setVisible(false);
				INFINITI6.setVisible(false);
				
				JEEP5.setVisible(false);
				JEEP6.setVisible(false);
				
				KIA2.setVisible(false);
				KIA3.setVisible(false);
				KIA4.setVisible(false);
				KIA5.setVisible(false);
				KIA7.setVisible(false);
				
				LANDROVER5.setVisible(false);
				LANDROVER6.setVisible(false);
				
				LEXUS2.setVisible(false);
				LEXUS3.setVisible(false);
				LEXUS5.setVisible(false);
				LEXUS6.setVisible(false);
				
				LINCOLN3.setVisible(false);
				LINCOLN5.setVisible(false);
				LINCOLN6.setVisible(false);
				
				MAZDA.setVisible(false);
				MAZDA2.setVisible(false);
				MAZDA3.setVisible(false);
				MAZDA5.setVisible(false);
				
				MERCEDES.setVisible(false);
				MERCEDES2.setVisible(false);
				MERCEDES3.setVisible(false);
				MERCEDES4.setVisible(false);
				MERCEDES5.setVisible(false);
				MERCEDES6.setVisible(false);
				
				MINI.setVisible(false);
				MINI3.setVisible(false);
				
				MITSUBISHI2.setVisible(false);
				MITSUBISHI5.setVisible(false);
				
				NISSAN.setVisible(false);
				NISSAN2.setVisible(false);
				NISSAN3.setVisible(false);
				NISSAN4.setVisible(false);
				NISSAN5.setVisible(false);
				NISSAN6.setVisible(false);
				NISSAN7.setVisible(false);
				NISSAN9.setVisible(false);
				
				SUBARU.setVisible(false);
				SUBARU2.setVisible(false);
				SUBARU3.setVisible(false);
				SUBARU4.setVisible(false);
				SUBARU5.setVisible(false);
				
				TOYOTA.setVisible(false);
				TOYOTA2.setVisible(false);
				TOYOTA3.setVisible(false);
				TOYOTA6.setVisible(false);
				TOYOTA7.setVisible(false);
				TOYOTA9.setVisible(false);
				
				VOLKSWAGEN2.setVisible(false);
				VOLKSWAGEN3.setVisible(false);
				VOLKSWAGEN4.setVisible(false);
				VOLKSWAGEN5.setVisible(false);
				VOLKSWAGEN6.setVisible(false);
				
				VOLVO2.setVisible(false);
				VOLVO3.setVisible(false);
				VOLVO4.setVisible(false);
				VOLVO5.setVisible(false);
				VOLVO6.setVisible(false);
	    	
	    }
	    	
	    }

	    // Handle the key-released event from the text field.
	    public void keyReleased(KeyEvent e) {
	    	textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
	    }
		
	}
	
	private class ListenForMouse implements MouseListener{

		// Called when a mouse button is clicked
		
		public void mouseClicked(MouseEvent e) {
			
			/**
			textArea1.append("Mouse Panel Pos: " + e.getX() + " " + e.getY() + "\n");
			textArea1.append("Mouse Screen Pos: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n"); 
			textArea1.append("Mouse Button: " + e.getButton()  + "\n"); 
			textArea1.append("Mouse Clicks: " + e.getClickCount()  + "\n");
			*/
		}

		// Called when the mouse enters the component assigned
		// the MouseListener
		
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when the mouse leaves the component assigned
		// the MouseListener
		
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Mouse button pressed
		
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Mouse button released
		
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ListenForWindow implements WindowListener{

		// Called when window is the active window
		
		public void windowActivated(WindowEvent e) {
			//textArea1.append("Window Activated\n");
			
		}

		// Called when window is closed using dispose
		// this.dispose(); can be used to close a window
		
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when the window is closed from the menu
		
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		// Called when a window is no longer the active window
		
		public void windowDeactivated(WindowEvent e) {
			//textArea1.append("Window Activated\n");
			
		}

		// Called when the window goes from minimized to a normal state
		
		public void windowDeiconified(WindowEvent arg0) {
			textArea1.append("Window in Normal State\n");
			
		}

		// Called when the window goes from normal to a minimized state
		
		public void windowIconified(WindowEvent arg0) {
			textArea1.append("Window Minimized\n");
			
		}

		// Called when the window is first created
		
		public void windowOpened(WindowEvent arg0) {
			//textArea1.append("Window Created\n");
			
		}
		
	}
	
}