import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


// Extends JFrame so it can create frames

public class GUI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	CarManager CM = new CarManager();
	
	public JButton BACH, START, CLEAR, SAVED;
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
	public JButton NSX, R8, TT;
	
	public JTextField textField1;
	public JTextArea textArea1, textArea2, text;
	public int buttonClicked;
	public static JLabel label1, LABEL;
	
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 768;
	public static final int MAX_HEIGHT = 192;
	
	public static final int XPOS1 = 10;
	public static final int XPOS2 = 138;
	public static final int XPOS3 = 266;
	public static final int XPOS4 = 394;
	public static final int XPOS5 = 522;
	public static final int XPOS6 = 650;
	
	public static final int YPOS1 = 50;
	public static final int YPOS2 = 178;
	public static final int YPOS3 = 306;
	public static final int YPOS4 = 434;
	public static final int YPOS5 = 562;
	public static final int YPOS6 = 690;
	public static final int ypos7 = 818;
	
	public static final int EXS = 80;
	public static final int SMALL = 128; 
	public static final int MED = 256;
	public static final int LARGE = 384;
	
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
		thePanel.setLayout(null);
		ListenForButton lForButton = new ListenForButton();
		
		BufferedImage STARTICON = ImageIO.read(new File("carmbridge.png"));
		BufferedImage BACHICON = ImageIO.read(new File("LOGOS/BACH-BUTTON.gif"));
		BufferedImage CLEARI = ImageIO.read(new File("CLEAR.png"));
		BufferedImage SAVEDI = ImageIO.read(new File("SAVED.png"));
		
		BufferedImage COUPEI = ImageIO.read(new File("MENUICONS/NEWCOUPE.png"));
		BufferedImage COMPACTI = ImageIO.read(new File("MENUICONS/NEWCOMPACT.png"));
		BufferedImage SEDANI = ImageIO.read(new File("MENUICONS/NEWSEDAN.png"));
		BufferedImage WAGONI = ImageIO.read(new File("MENUICONS/NEWWAGON.png"));
		BufferedImage TRUCKI = ImageIO.read(new File("MENUICONS/NEWTRUCK.png"));
		BufferedImage SUVI = ImageIO.read(new File("MENUICONS/NEWSUV.png"));
		BufferedImage SMALLSUVI = ImageIO.read(new File("MENUICONS/NEWSMALLSUV.png"));
		BufferedImage VANI = ImageIO.read(new File("MENUICONS/NEWVAN.png"));
		BufferedImage MINIVANI = ImageIO.read(new File("MENUICONS/NEWMINIVAN.png"));
		
		BufferedImage ACURAICON = ImageIO.read(new File("CARLOGO/ACURA.png"));
		BufferedImage AUDIICON = ImageIO.read(new File("CARLOGO/AUDI.png"));
		BufferedImage BMWICON = ImageIO.read(new File("CARLOGO/BMW.png"));
		BufferedImage BUICKICON = ImageIO.read(new File("CARLOGO/BUICK.png"));
		BufferedImage CADILLACICON = ImageIO.read(new File("CARLOGO/CADILLAC.png"));
		BufferedImage CHEVROLETICON = ImageIO.read(new File("CARLOGO/CHEVROLET.png"));
		BufferedImage CHRYSLERICON = ImageIO.read(new File("CARLOGO/CHRYSLER.png"));
		BufferedImage DODGEICON = ImageIO.read(new File("CARLOGO/DODGE.png"));
		BufferedImage FORDICON = ImageIO.read(new File("CARLOGO/FORD.png"));
		BufferedImage GMCICON = ImageIO.read(new File("CARLOGO/GMC.png"));
		BufferedImage HONDAICON = ImageIO.read(new File("CARLOGO/HONDA.png"));
		BufferedImage HYUNDAIICON = ImageIO.read(new File("CARLOGO/HYUNDAI.png"));
		BufferedImage INFINITIICON = ImageIO.read(new File("CARLOGO/INFINITI.png"));
		BufferedImage JEEPICON = ImageIO.read(new File("CARLOGO/JEEP.png"));
		BufferedImage KIAICON = ImageIO.read(new File("CARLOGO/KIA.png"));
		BufferedImage LANDROVERICON = ImageIO.read(new File("CARLOGO/LANDROVER.png"));
		BufferedImage LEXUSICON = ImageIO.read(new File("CARLOGO/LEXUS.png"));
		BufferedImage LINCOLNICON = ImageIO.read(new File("CARLOGO/LINCOLN.png"));
		BufferedImage MAZDAICON = ImageIO.read(new File("CARLOGO/MAZDA.png"));
		BufferedImage MERCEDESICON = ImageIO.read(new File("CARLOGO/MERCEDES.png"));
		BufferedImage MINIICON = ImageIO.read(new File("CARLOGO/MINI.png"));
		BufferedImage MITSUBISHIICON = ImageIO.read(new File("CARLOGO/MITSUBISHI.png"));
		BufferedImage NISSANICON = ImageIO.read(new File("CARLOGO/NISSAN.png"));
		BufferedImage SUBARUICON = ImageIO.read(new File("CARLOGO/SUBARU.png"));
		BufferedImage TOYOTAICON = ImageIO.read(new File("CARLOGO/TOYOTA.png"));
		BufferedImage VOLKSWAGENICON = ImageIO.read(new File("CARLOGO/VOLKSWAGEN.png"));
		BufferedImage VOLVOICON = ImageIO.read(new File("CARLOGO/VOLVO.png"));
		
		BufferedImage NSXI = ImageIO.read(new File("CARS/NSX-CAR.png"));
		BufferedImage R8I = ImageIO.read(new File("CARS/R8-CAR.png"));
		BufferedImage TTI = ImageIO.read(new File("CARS/TT-CAR.png"));
		
		START = new JButton(new ImageIcon(STARTICON));
		START.setBorder(BorderFactory.createEmptyBorder());
		START.setContentAreaFilled(true);
		START.setVisible(true);
		START.setBounds(450, 200, STARTICON.getWidth(), STARTICON.getHeight());
		START.addActionListener(lForButton);
		START.setToolTipText("Press to Begin");
		thePanel.add(START);
		
		BACH = new JButton(new ImageIcon(BACHICON));
		BACH.setVisible(false);
		BACH.setBorder(BorderFactory.createEmptyBorder());
		BACH.setContentAreaFilled(true);
		BACH.addActionListener(lForButton);
		BACH.setBounds(0, 0, 35, 37);
		BACH.setToolTipText("Press tp go Bach");
		thePanel.add(BACH);
		
		CLEAR = new JButton(new ImageIcon(CLEARI));
		CLEAR.setVisible(false);
		CLEAR.setBorder(BorderFactory.createEmptyBorder());
		CLEAR.setContentAreaFilled(true);
		CLEAR.addActionListener(lForButton);
		CLEAR.setBounds(WIDTH-100, 10, 80, 26);
		CLEAR.setToolTipText("Press tp go Bach");
		thePanel.add(CLEAR);
		
		SAVED = new JButton(new ImageIcon(SAVEDI));
		SAVED.setVisible(false);
		SAVED.setBorder(BorderFactory.createEmptyBorder());
		SAVED.setContentAreaFilled(true);
		SAVED.addActionListener(lForButton);
		SAVED.setBounds(WIDTH-180, 10, 80, 26);
		SAVED.setToolTipText("Press tp go Bach");
		thePanel.add(SAVED);
		
		COUPE = new JButton(new ImageIcon(COUPEI));
		COUPE.setVisible(false);
		//.setBorder(BorderFactory.createEmptyBorder());
		COUPE.setContentAreaFilled(true);
		COUPE.addActionListener(lForButton);
		COUPE.setBounds(16, 0, 256, 250);
		thePanel.add(COUPE);
		
		
		COMPACT = new JButton(new ImageIcon(COMPACTI));
		COMPACT.setVisible(false);
		//COMPACT.setBorder(BorderFactory.createEmptyBorder());
		COMPACT.setContentAreaFilled(true);
		COMPACT.addActionListener(lForButton);
		COMPACT.setBounds(256+16, 0, MED, 250);
		thePanel.add(COMPACT);
			
		SEDAN = new JButton(new ImageIcon(SEDANI));
		SEDAN.setVisible(false);
		//SEDAN.setBorder(BorderFactory.createEmptyBorder());
		SEDAN.setContentAreaFilled(true);
		SEDAN.addActionListener(lForButton);
		SEDAN.setBounds(512+16, 0, MED, 250);
		thePanel.add(SEDAN);
			
		STATION = new JButton(new ImageIcon(WAGONI));
		STATION.setVisible(false);
		//STATION.setBorder(BorderFactory.createEmptyBorder());
		STATION.setContentAreaFilled(true);
		STATION.addActionListener(lForButton);
		STATION.setBounds(16, 246, MED, 250);
		thePanel.add(STATION);
			
		SMALLSUV = new JButton(new ImageIcon(SMALLSUVI));
		SMALLSUV.setVisible(false);
		//SMALLSUV.setBorder(BorderFactory.createEmptyBorder());
		SMALLSUV.setContentAreaFilled(true);
		SMALLSUV.addActionListener(lForButton);
		SMALLSUV.setBounds(256+16, 246, MED, 250);
		thePanel.add(SMALLSUV);
			
		SUV = new JButton(new ImageIcon(SUVI));
		SUV.setVisible(false);
		//SUV.setBorder(BorderFactory.createEmptyBorder());
		SUV.setContentAreaFilled(true);
		SUV.addActionListener(lForButton);
		SUV.setBounds(512+16, 246, 256, 250);
		thePanel.add(SUV);
			
		VAN = new JButton(new ImageIcon(VANI));
		VAN.setVisible(false);
		//VAN.setBorder(BorderFactory.createEmptyBorder());
		VAN.setContentAreaFilled(true);
		VAN.addActionListener(lForButton);
		VAN.setBounds(16, 492, 256, 250);
		thePanel.add(VAN);
		
		MINIVAN = new JButton(new ImageIcon(MINIVANI));
		MINIVAN.setVisible(false);
		//MINIVAN.setBorder(BorderFactory.createEmptyBorder());
		MINIVAN.setContentAreaFilled(true);
		MINIVAN.addActionListener(lForButton);
		MINIVAN.setBounds(256+16, 492, 256, 250);
		thePanel.add(MINIVAN);
		
		TRUCK = new JButton(new ImageIcon(TRUCKI));
		TRUCK.setVisible(false);
		TRUCK.getBorder();
		TRUCK.setContentAreaFilled(false);
		TRUCK.addActionListener(lForButton);
		TRUCK.setBounds(512+16, 492, 256, 250);
		thePanel.add(TRUCK);		
		
		ACURA = new JButton(new ImageIcon(ACURAICON));
		ACURA.setVisible(false);
		//ACURA.getBorder();
		ACURA.setContentAreaFilled(false);
		ACURA.addActionListener(lForButton);
		ACURA.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(ACURA);
		
		ACURA2 = new JButton(new ImageIcon(ACURAICON));
		ACURA2.setVisible(false);
		//ACURA2.getBorder();
		ACURA2.setContentAreaFilled(false);
		ACURA2.addActionListener(lForButton);
		ACURA2.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(ACURA2);
		
		ACURA5 = new JButton(new ImageIcon(ACURAICON));
		ACURA5.setVisible(false);
		//ACURA5.getBorder();
		ACURA5.setContentAreaFilled(false);
		ACURA5.addActionListener(lForButton);
		ACURA5.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(ACURA5);

		AUDI = new JButton(new ImageIcon(AUDIICON));
		AUDI.setVisible(false);
		//AUDI.getBorder();
		AUDI.setContentAreaFilled(false);
		AUDI.addActionListener(lForButton);
		AUDI.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI);
		
		AUDI2 = new JButton(new ImageIcon(AUDIICON));
		AUDI2.setVisible(false);
		//AUDI2.getBorder();
		AUDI2.setContentAreaFilled(false);
		AUDI2.addActionListener(lForButton);
		AUDI2.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI2);
		
		AUDI3 = new JButton(new ImageIcon(AUDIICON));
		AUDI3.setVisible(false);
		//AUDI3.getBorder();
		AUDI3.setContentAreaFilled(false);
		AUDI3.addActionListener(lForButton);
		AUDI3.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI3);
		
		AUDI4 = new JButton(new ImageIcon(AUDIICON));
		AUDI4.setVisible(false);
		//AUDI4.getBorder();
		AUDI4.setContentAreaFilled(false);
		AUDI4.addActionListener(lForButton);
		AUDI4.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI4);
		
		AUDI5 = new JButton(new ImageIcon(AUDIICON));
		AUDI5.setVisible(false);
		//AUDI5.getBorder();
		AUDI5.setContentAreaFilled(false);
		AUDI5.addActionListener(lForButton);
		AUDI5.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI5);
		
		AUDI6 = new JButton(new ImageIcon(AUDIICON));
		AUDI6.setVisible(false);
		//AUDI6.getBorder();
		AUDI6.setContentAreaFilled(false);
		AUDI6.addActionListener(lForButton);
		AUDI6.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(AUDI6);
		
		BMW2 = new JButton(new ImageIcon(BMWICON));
		BMW2.setVisible(false);
		//BMW2.getBorder();
		BMW2.setContentAreaFilled(false);
		BMW2.addActionListener(lForButton);
		BMW2.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(BMW2);
		
		BMW3 = new JButton(new ImageIcon(BMWICON));
		BMW3.setVisible(false);
		//BMW3.getBorder();
		BMW3.setContentAreaFilled(false);
		BMW3.addActionListener(lForButton);
		BMW3.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(BMW3);
		
		BMW5 = new JButton(new ImageIcon(BMWICON));
		BMW5.setVisible(false);
		//BMW5.getBorder();
		BMW5.setContentAreaFilled(false);
		BMW5.addActionListener(lForButton);
		BMW5.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(BMW5);
		
		BMW6 = new JButton(new ImageIcon(BMWICON));
		BMW6.setVisible(false);
		//BMW6.getBorder();
		BMW6.setContentAreaFilled(false);
		BMW6.addActionListener(lForButton);
		BMW6.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(BMW6);
		
		BUICK2 = new JButton(new ImageIcon(BUICKICON));
		BUICK2.setVisible(false);
		//BUICK2.getBorder();
		BUICK2.setContentAreaFilled(false);
		BUICK2.addActionListener(lForButton);
		BUICK2.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(BUICK2);
		
		BUICK3 = new JButton(new ImageIcon(BUICKICON));
		BUICK3.setVisible(false);
		//BUICK3.getBorder();
		BUICK3.setContentAreaFilled(false);
		BUICK3.addActionListener(lForButton);
		BUICK3.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(BUICK3);
		
		BUICK5 = new JButton(new ImageIcon(BUICKICON));
		BUICK5.setVisible(false);
		//BUICK5.getBorder();
		BUICK5.setContentAreaFilled(false);
		BUICK5.addActionListener(lForButton);
		BUICK5.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(BUICK5);
		
		BUICK6 = new JButton(new ImageIcon(BUICKICON));
		BUICK6.setVisible(false);
		//BUICK6.getBorder();
		BUICK6.setContentAreaFilled(false);
		BUICK6.addActionListener(lForButton);
		BUICK6.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(BUICK6);
		
		CADILLAC2 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC2.setVisible(false);
		//CADILLAC2.getBorder();
		CADILLAC2.setContentAreaFilled(false);
		CADILLAC2.addActionListener(lForButton);
		CADILLAC2.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(CADILLAC2);
		
		CADILLAC3 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC3.setVisible(false);
		//CADILLAC3.getBorder();
		CADILLAC3.setContentAreaFilled(false);
		CADILLAC3.addActionListener(lForButton);
		CADILLAC3.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(CADILLAC3);
		
		CADILLAC5 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC5.setVisible(false);
		//CADILLAC5.getBorder();
		CADILLAC5.setContentAreaFilled(false);
		CADILLAC5.addActionListener(lForButton);
		CADILLAC5.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(CADILLAC5);
		
		CADILLAC6 = new JButton(new ImageIcon(CADILLACICON));
		CADILLAC6.setVisible(false);
		//CADILLAC6.getBorder();
		CADILLAC6.setContentAreaFilled(false);
		CADILLAC6.addActionListener(lForButton);
		CADILLAC6.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(CADILLAC6);
		
		CHEVROLET = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET.setVisible(false);
		//CHEVROLET.getBorder();
		CHEVROLET.setContentAreaFilled(false);
		CHEVROLET.addActionListener(lForButton);
		CHEVROLET.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET);
		
		CHEVROLET2 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET2.setVisible(false);
		//CHEVROLET2.getBorder();
		CHEVROLET2.setContentAreaFilled(false);
		CHEVROLET2.addActionListener(lForButton);
		CHEVROLET2.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET2);
		
		CHEVROLET3 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET3.setVisible(false);
		//CHEVROLET3.getBorder();
		CHEVROLET3.setContentAreaFilled(false);
		CHEVROLET3.addActionListener(lForButton);
		CHEVROLET3.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET3);
		
		CHEVROLET4 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET4.setVisible(false);
		//CHEVROLET4.getBorder();
		CHEVROLET4.setContentAreaFilled(false);
		CHEVROLET4.addActionListener(lForButton);
		CHEVROLET4.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET4);
		
		CHEVROLET5 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET5.setVisible(false);
		//CHEVROLET5.getBorder();
		CHEVROLET5.setContentAreaFilled(false);
		CHEVROLET5.addActionListener(lForButton);
		CHEVROLET5.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET5);
		
		CHEVROLET6 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET6.setVisible(false);
		//CHEVROLET6.getBorder();
		CHEVROLET6.setContentAreaFilled(false);
		CHEVROLET6.addActionListener(lForButton);
		CHEVROLET6.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET6);
		
		CHEVROLET8 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET8.setVisible(false);
		CHEVROLET8.getBorder();
		CHEVROLET8.setContentAreaFilled(false);
		CHEVROLET8.addActionListener(lForButton);
		CHEVROLET8.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET8);
		
		CHEVROLET9 = new JButton(new ImageIcon(CHEVROLETICON));
		CHEVROLET9.setVisible(false);
		CHEVROLET9.getBorder();
		CHEVROLET9.setContentAreaFilled(false);
		CHEVROLET9.addActionListener(lForButton);
		CHEVROLET9.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(CHEVROLET9);
		
		
		CHRYSLER = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER.setVisible(false);
		//CHRYSLER.getBorder();
		CHRYSLER.setContentAreaFilled(false);
		CHRYSLER.addActionListener(lForButton);
		CHRYSLER.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(CHRYSLER);
		
		CHRYSLER3 = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER3.setVisible(false);
		CHRYSLER3.getBorder();
		CHRYSLER3.setContentAreaFilled(false);
		CHRYSLER3.addActionListener(lForButton);
		CHRYSLER3.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(CHRYSLER3);
		
		CHRYSLER7 = new JButton(new ImageIcon(CHRYSLERICON));
		CHRYSLER7.setVisible(false);
		CHRYSLER7.getBorder();
		CHRYSLER7.setContentAreaFilled(false);
		CHRYSLER7.addActionListener(lForButton);
		CHRYSLER7.setBounds(XPOS1, YPOS1, SMALL, SMALL);
		thePanel.add(CHRYSLER7);
		
		DODGE = new JButton(new ImageIcon(DODGEICON));
		DODGE.setVisible(false);
		//DODGE.getBorder();
		DODGE.setContentAreaFilled(true);
		DODGE.addActionListener(lForButton);
		DODGE.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(DODGE);
		
		DODGE3 = new JButton(new ImageIcon(DODGEICON));
		DODGE3.setVisible(false);
		DODGE3.getBorder();
		DODGE3.setContentAreaFilled(false);
		DODGE3.addActionListener(lForButton);
		DODGE3.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(DODGE3);
		
		DODGE5 = new JButton(new ImageIcon(DODGEICON));
		DODGE5.setVisible(false);
		DODGE5.getBorder();
		DODGE5.setContentAreaFilled(false);
		DODGE5.addActionListener(lForButton);
		DODGE5.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(DODGE5);
		
		DODGE6 = new JButton(new ImageIcon(DODGEICON));
		DODGE6.setVisible(false);
		DODGE6.getBorder();
		DODGE6.setContentAreaFilled(false);
		DODGE6.addActionListener(lForButton);
		DODGE6.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(DODGE6);
		
		DODGE7 = new JButton(new ImageIcon(DODGEICON));
		DODGE7.setVisible(false);
		DODGE7.getBorder();
		DODGE7.setContentAreaFilled(false);
		DODGE7.addActionListener(lForButton);
		DODGE7.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(DODGE7);
		
		DODGE9 = new JButton(new ImageIcon(DODGEICON));
		DODGE9.setVisible(false);
		DODGE9.getBorder();
		DODGE9.setContentAreaFilled(false);
		DODGE9.addActionListener(lForButton);
		DODGE9.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(DODGE9);
		
		FORD = new JButton(new ImageIcon(FORDICON));
		FORD.setVisible(false);
		//FORD.getBorder();
		FORD.setContentAreaFilled(false);
		FORD.addActionListener(lForButton);
		FORD.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(FORD);
		
		FORD2 = new JButton(new ImageIcon(FORDICON));
		FORD2.setVisible(false);
		FORD2.getBorder();
		FORD2.setContentAreaFilled(false);
		FORD2.addActionListener(lForButton);
		FORD2.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(FORD2);
		
		FORD3 = new JButton(new ImageIcon(FORDICON));
		FORD3.setVisible(false);
		FORD3.getBorder();
		FORD3.setContentAreaFilled(false);
		FORD3.addActionListener(lForButton);
		FORD3.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(FORD3);
		
		FORD5 = new JButton(new ImageIcon(FORDICON));
		FORD5.setVisible(false);
		FORD5.getBorder();
		FORD5.setContentAreaFilled(false);
		FORD5.addActionListener(lForButton);
		FORD5.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(FORD5);
		
		FORD6 = new JButton(new ImageIcon(FORDICON));
		FORD6.setVisible(false);
		FORD6.getBorder();
		FORD6.setContentAreaFilled(false);
		FORD6.addActionListener(lForButton);
		FORD6.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(FORD6);
		
		FORD8 = new JButton(new ImageIcon(FORDICON));
		FORD8.setVisible(false);
		FORD8.getBorder();
		FORD8.setContentAreaFilled(false);
		FORD8.addActionListener(lForButton);
		FORD8.setBounds(XPOS2, YPOS1, SMALL, SMALL);
		thePanel.add(FORD8);
		
		FORD9 = new JButton(new ImageIcon(FORDICON));
		FORD9.setVisible(false);
		FORD9.getBorder();
		FORD9.setContentAreaFilled(false);
		FORD9.addActionListener(lForButton);
		FORD9.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(FORD9);
		
		GMC5 = new JButton(new ImageIcon(GMCICON));
		GMC5.setVisible(false);
		GMC5.getBorder();
		GMC5.setContentAreaFilled(false);
		GMC5.addActionListener(lForButton);
		GMC5.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(GMC5);
		
		GMC6 = new JButton(new ImageIcon(GMCICON));
		GMC6.setVisible(false);
		GMC6.getBorder();
		GMC6.setContentAreaFilled(false);
		GMC6.addActionListener(lForButton);
		GMC6.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(GMC6);
		
		GMC9 = new JButton(new ImageIcon(GMCICON));
		GMC9.setVisible(false);
		GMC9.getBorder();
		GMC9.setContentAreaFilled(false);
		GMC9.addActionListener(lForButton);
		GMC9.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(GMC9);
		
		HONDA2 = new JButton(new ImageIcon(HONDAICON));
		HONDA2.setVisible(false);
		HONDA2.getBorder();
		HONDA2.setContentAreaFilled(false);
		HONDA2.addActionListener(lForButton);
		HONDA2.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(HONDA2);
		
		HONDA3 = new JButton(new ImageIcon(HONDAICON));
		HONDA3.setVisible(false);
		HONDA3.getBorder();
		HONDA3.setContentAreaFilled(false);
		HONDA3.addActionListener(lForButton);
		HONDA3.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(HONDA3);
		
		HONDA4 = new JButton(new ImageIcon(HONDAICON));
		HONDA4.setVisible(false);
		HONDA4.getBorder();
		HONDA4.setContentAreaFilled(false);
		HONDA4.addActionListener(lForButton);
		HONDA4.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(HONDA4);
		
		HONDA5 = new JButton(new ImageIcon(HONDAICON));
		HONDA5.setVisible(false);
		HONDA5.getBorder();
		HONDA5.setContentAreaFilled(false);
		HONDA5.addActionListener(lForButton);
		HONDA5.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(HONDA5);
		
		HONDA7 = new JButton(new ImageIcon(HONDAICON));
		HONDA7.setVisible(false);
		HONDA7.getBorder();
		HONDA7.setContentAreaFilled(false);
		HONDA7.addActionListener(lForButton);
		HONDA7.setBounds(XPOS3, YPOS1, SMALL, SMALL);
		thePanel.add(HONDA7);
		
		HONDA9 = new JButton(new ImageIcon(HONDAICON));
		HONDA9.setVisible(false);
		HONDA9.getBorder();
		HONDA9.setContentAreaFilled(false);
		HONDA9.addActionListener(lForButton);
		HONDA9.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(HONDA9);
		
		HYUNDAI2 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI2.setVisible(false);
		HYUNDAI2.getBorder();
		HYUNDAI2.setContentAreaFilled(false);
		HYUNDAI2.addActionListener(lForButton);
		HYUNDAI2.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(HYUNDAI2);
		
		HYUNDAI3 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI3.setVisible(false);
		HYUNDAI3.getBorder();
		HYUNDAI3.setContentAreaFilled(false);
		HYUNDAI3.addActionListener(lForButton);
		HYUNDAI3.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(HYUNDAI3);
		
		HYUNDAI5 = new JButton(new ImageIcon(HYUNDAIICON));
		HYUNDAI5.setVisible(false);
		HYUNDAI5.getBorder();
		HYUNDAI5.setContentAreaFilled(false);
		HYUNDAI5.addActionListener(lForButton);
		HYUNDAI5.setBounds(XPOS5, YPOS2, SMALL, SMALL);
		thePanel.add(HYUNDAI5);
		
		INFINITI2 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI2.setVisible(false);
		INFINITI2.getBorder();
		INFINITI2.setContentAreaFilled(false);
		INFINITI2.addActionListener(lForButton);
		INFINITI2.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(INFINITI2);
		
		INFINITI3 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI3.setVisible(false);
		INFINITI3.getBorder();
		INFINITI3.setContentAreaFilled(false);
		INFINITI3.addActionListener(lForButton);
		INFINITI3.setBounds(XPOS5, YPOS2, SMALL, SMALL);
		thePanel.add(INFINITI3);
		
		INFINITI4 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI4.setVisible(false);
		INFINITI4.getBorder();
		INFINITI4.setContentAreaFilled(false);
		INFINITI4.addActionListener(lForButton);
		INFINITI4.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(INFINITI4);
		
		INFINITI5 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI5.setVisible(false);
		INFINITI5.getBorder();
		INFINITI5.setContentAreaFilled(false);
		INFINITI5.addActionListener(lForButton);
		INFINITI5.setBounds(XPOS6, YPOS2, SMALL, SMALL);
		thePanel.add(INFINITI5);
		
		INFINITI6 = new JButton(new ImageIcon(INFINITIICON));
		INFINITI6.setVisible(false);
		INFINITI6.getBorder();
		INFINITI6.setContentAreaFilled(false);
		INFINITI6.addActionListener(lForButton);
		INFINITI6.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(INFINITI6);
		
		JEEP5 = new JButton(new ImageIcon(JEEPICON));
		JEEP5.setVisible(false);
		JEEP5.getBorder();
		JEEP5.setContentAreaFilled(false);
		JEEP5.addActionListener(lForButton);
		JEEP5.setBounds(XPOS1, YPOS3, SMALL, SMALL);
		thePanel.add(JEEP5);
		
		JEEP6 = new JButton(new ImageIcon(JEEPICON));
		JEEP6.setVisible(false);
		JEEP6.getBorder();
		JEEP6.setContentAreaFilled(false);
		JEEP6.addActionListener(lForButton);
		JEEP6.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(JEEP6);
		
		KIA2 = new JButton(new ImageIcon(KIAICON));
		KIA2.setVisible(false);
		KIA2.getBorder();
		KIA2.setContentAreaFilled(false);
		KIA2.addActionListener(lForButton);
		KIA2.setBounds(XPOS5, YPOS2, SMALL, SMALL);
		thePanel.add(KIA2);
		
		KIA3 = new JButton(new ImageIcon(KIAICON));
		KIA3.setVisible(false);
		KIA3.getBorder();
		KIA3.setContentAreaFilled(false);
		KIA3.addActionListener(lForButton);
		KIA3.setBounds(XPOS6, YPOS2, SMALL, SMALL);
		thePanel.add(KIA3);
		
		KIA4 = new JButton(new ImageIcon(KIAICON));
		KIA4.setVisible(false);
		KIA4.getBorder();
		KIA4.setContentAreaFilled(false);
		KIA4.addActionListener(lForButton);
		KIA4.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(KIA4);
		
		KIA5 = new JButton(new ImageIcon(KIAICON));
		KIA5.setVisible(false);
		KIA5.getBorder();
		KIA5.setContentAreaFilled(false);
		KIA5.addActionListener(lForButton);
		KIA5.setBounds(XPOS2, YPOS3, SMALL, SMALL);
		thePanel.add(KIA5);
		
		KIA7 = new JButton(new ImageIcon(KIAICON));
		KIA7.setVisible(false);
		KIA7.getBorder();
		KIA7.setContentAreaFilled(false);
		KIA7.addActionListener(lForButton);
		KIA7.setBounds(XPOS4, YPOS1, SMALL, SMALL);
		thePanel.add(KIA7);
		
		LANDROVER5 = new JButton(new ImageIcon(LANDROVERICON));
		LANDROVER5.setVisible(false);
		LANDROVER5.getBorder();
		LANDROVER5.setContentAreaFilled(false);
		LANDROVER5.addActionListener(lForButton);
		LANDROVER5.setBounds(XPOS3, YPOS3, SMALL, SMALL);
		thePanel.add(LANDROVER5);
		
		LANDROVER6 = new JButton(new ImageIcon(LANDROVERICON));
		LANDROVER6.setVisible(false);
		LANDROVER6.getBorder();
		LANDROVER6.setContentAreaFilled(false);
		LANDROVER6.addActionListener(lForButton);
		LANDROVER6.setBounds(XPOS5, YPOS2, SMALL, SMALL);
		thePanel.add(LANDROVER6);
		
		LEXUS2 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS2.setVisible(false);
		LEXUS2.getBorder();
		LEXUS2.setContentAreaFilled(false);
		LEXUS2.addActionListener(lForButton);
		LEXUS2.setBounds(XPOS6, YPOS2, SMALL, SMALL);
		thePanel.add(LEXUS2);
		
		LEXUS3 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS3.setVisible(false);
		LEXUS3.getBorder();
		LEXUS3.setContentAreaFilled(false);
		LEXUS3.addActionListener(lForButton);
		LEXUS3.setBounds(XPOS1, YPOS3, SMALL, SMALL);
		thePanel.add(LEXUS3);
		
		LEXUS5 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS5.setVisible(false);
		LEXUS5.getBorder();
		LEXUS5.setContentAreaFilled(false);
		LEXUS5.addActionListener(lForButton);
		LEXUS5.setBounds(XPOS4, YPOS3, SMALL, SMALL);
		thePanel.add(LEXUS5);
		
		LEXUS6 = new JButton(new ImageIcon(LEXUSICON));
		LEXUS6.setVisible(false);
		LEXUS6.getBorder();
		LEXUS6.setContentAreaFilled(false);
		LEXUS6.addActionListener(lForButton);
		LEXUS6.setBounds(XPOS6, YPOS2, SMALL, SMALL);
		thePanel.add(LEXUS6);
		
		LINCOLN3 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN3.setVisible(false);
		LINCOLN3.getBorder();
		LINCOLN3.setContentAreaFilled(false);
		LINCOLN3.addActionListener(lForButton);
		LINCOLN3.setBounds(XPOS2, YPOS3, SMALL, SMALL);
		thePanel.add(LINCOLN3);
		
		LINCOLN5 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN5.setVisible(false);
		LINCOLN5.getBorder();
		LINCOLN5.setContentAreaFilled(false);
		LINCOLN5.addActionListener(lForButton);
		LINCOLN5.setBounds(XPOS5, YPOS3, SMALL, SMALL);
		thePanel.add(LINCOLN5);
		
		LINCOLN6 = new JButton(new ImageIcon(LINCOLNICON));
		LINCOLN6.setVisible(false);
		LINCOLN6.getBorder();
		LINCOLN6.setContentAreaFilled(false);
		LINCOLN6.addActionListener(lForButton);
		LINCOLN6.setBounds(XPOS1, YPOS3, SMALL, SMALL);
		thePanel.add(LINCOLN6);
		
		MAZDA = new JButton(new ImageIcon(MAZDAICON));
		MAZDA.setVisible(false);
		//MAZDA.getBorder();
		MAZDA.setContentAreaFilled(true);
		MAZDA.addActionListener(lForButton);
		MAZDA.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(MAZDA);
		
		MAZDA2 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA2.setVisible(false);
		MAZDA2.getBorder();
		MAZDA2.setContentAreaFilled(false);
		MAZDA2.addActionListener(lForButton);
		MAZDA2.setBounds(XPOS1, YPOS3, SMALL, SMALL);
		thePanel.add(MAZDA2);
		
		MAZDA3 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA3.setVisible(false);
		MAZDA3.getBorder();
		MAZDA3.setContentAreaFilled(false);
		MAZDA3.addActionListener(lForButton);
		MAZDA3.setBounds(XPOS3, YPOS3, SMALL, SMALL);
		thePanel.add(MAZDA3);
		
		MAZDA5 = new JButton(new ImageIcon(MAZDAICON));
		MAZDA5.setVisible(false);
		MAZDA5.getBorder();
		MAZDA5.setContentAreaFilled(false);
		MAZDA5.addActionListener(lForButton);
		MAZDA5.setBounds(XPOS6, YPOS3, SMALL, SMALL);
		thePanel.add(MAZDA5);
		
		MERCEDES = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES.setVisible(false);
		//MERCEDES.getBorder();
		MERCEDES.setContentAreaFilled(false);
		MERCEDES.addActionListener(lForButton);
		MERCEDES.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(MERCEDES);
		
		MERCEDES2 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES2.setVisible(false);
		MERCEDES2.getBorder();
		MERCEDES2.setContentAreaFilled(false);
		MERCEDES2.addActionListener(lForButton);
		MERCEDES2.setBounds(XPOS2, YPOS3, SMALL, SMALL);
		thePanel.add(MERCEDES2);
		
		MERCEDES3 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES3.setVisible(false);
		MERCEDES3.getBorder();
		MERCEDES3.setContentAreaFilled(false);
		MERCEDES3.addActionListener(lForButton);
		MERCEDES3.setBounds(XPOS4, YPOS3, SMALL, SMALL);
		thePanel.add(MERCEDES3);
		
		MERCEDES4 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES4.setVisible(false);
		MERCEDES4.getBorder();
		MERCEDES4.setContentAreaFilled(false);
		MERCEDES4.addActionListener(lForButton);
		MERCEDES4.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(MERCEDES4);
		
		MERCEDES5 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES5.setVisible(false);
		MERCEDES5.getBorder();
		MERCEDES5.setContentAreaFilled(false);
		MERCEDES5.addActionListener(lForButton);
		MERCEDES5.setBounds(XPOS1, YPOS4, SMALL, SMALL);
		thePanel.add(MERCEDES5);
		
		MERCEDES6 = new JButton(new ImageIcon(MERCEDESICON));
		MERCEDES6.setVisible(false);
		MERCEDES6.getBorder();
		MERCEDES6.setContentAreaFilled(false);
		MERCEDES6.addActionListener(lForButton);
		MERCEDES6.setBounds(XPOS2, YPOS3, SMALL, SMALL);
		thePanel.add(MERCEDES6);
		
		MINI = new JButton(new ImageIcon(MINIICON));
		MINI.setVisible(false);
		//MINI.getBorder();
		MINI.setContentAreaFilled(false);
		MINI.addActionListener(lForButton);
		MINI.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(MINI);

		MINI3 = new JButton(new ImageIcon(MINIICON));
		MINI3.setVisible(false);
		MINI3.getBorder();
		MINI3.setContentAreaFilled(false);
		MINI3.addActionListener(lForButton);
		MINI3.setBounds(XPOS5, YPOS3, SMALL, SMALL);
		thePanel.add(MINI3);
		
		MITSUBISHI2 = new JButton(new ImageIcon(MITSUBISHIICON));
		MITSUBISHI2.setVisible(false);
		MITSUBISHI2.getBorder();
		MITSUBISHI2.setContentAreaFilled(false);
		MITSUBISHI2.addActionListener(lForButton);
		MITSUBISHI2.setBounds(XPOS3, YPOS3, SMALL, SMALL);
		thePanel.add(MITSUBISHI2);
		
		MITSUBISHI5 = new JButton(new ImageIcon(MITSUBISHIICON));
		MITSUBISHI5.setVisible(false);
		MITSUBISHI5.getBorder();
		MITSUBISHI5.setContentAreaFilled(false);
		MITSUBISHI5.addActionListener(lForButton);
		MITSUBISHI5.setBounds(XPOS2, YPOS4, SMALL, SMALL);
		thePanel.add(MITSUBISHI5);
		
		NISSAN = new JButton(new ImageIcon(NISSANICON));
		NISSAN.setVisible(false);
		//NISSAN.getBorder();
		NISSAN.setContentAreaFilled(false);
		NISSAN.addActionListener(lForButton);
		NISSAN.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(NISSAN);
		
		NISSAN2 = new JButton(new ImageIcon(NISSANICON));
		NISSAN2.setVisible(false);
		NISSAN2.getBorder();
		NISSAN2.setContentAreaFilled(false);
		NISSAN2.addActionListener(lForButton);
		NISSAN2.setBounds(XPOS4, YPOS3, SMALL, SMALL);
		thePanel.add(NISSAN2);
		
		NISSAN3 = new JButton(new ImageIcon(NISSANICON));
		NISSAN3.setVisible(false);
		NISSAN3.getBorder();
		NISSAN3.setContentAreaFilled(false);
		NISSAN3.addActionListener(lForButton);
		NISSAN3.setBounds(XPOS6, YPOS3, SMALL, SMALL);
		thePanel.add(NISSAN3);
		
		NISSAN4 = new JButton(new ImageIcon(NISSANICON));
		NISSAN4.setVisible(false);
		NISSAN4.getBorder();
		NISSAN4.setContentAreaFilled(false);
		NISSAN4.addActionListener(lForButton);
		NISSAN4.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(NISSAN4);
		
		NISSAN5 = new JButton(new ImageIcon(NISSANICON));
		NISSAN5.setVisible(false);
		NISSAN5.getBorder();
		NISSAN5.setContentAreaFilled(false);
		NISSAN5.addActionListener(lForButton);
		NISSAN5.setBounds(XPOS3, YPOS4, SMALL, SMALL);
		thePanel.add(NISSAN5);
		
		NISSAN6 = new JButton(new ImageIcon(NISSANICON));
		NISSAN6.setVisible(false);
		NISSAN6.getBorder();
		NISSAN6.setContentAreaFilled(false);
		NISSAN6.addActionListener(lForButton);
		NISSAN6.setBounds(XPOS3, YPOS3, SMALL, SMALL);
		thePanel.add(NISSAN6);
		
		NISSAN7 = new JButton(new ImageIcon(NISSANICON));
		NISSAN7.setVisible(false);
		NISSAN7.getBorder();
		NISSAN7.setContentAreaFilled(false);
		NISSAN7.addActionListener(lForButton);
		NISSAN7.setBounds(XPOS5, YPOS1, SMALL, SMALL);
		thePanel.add(NISSAN7);
		
		NISSAN9 = new JButton(new ImageIcon(NISSANICON));
		NISSAN9.setVisible(false);
		NISSAN9.getBorder();
		NISSAN9.setContentAreaFilled(false);
		NISSAN9.addActionListener(lForButton);
		NISSAN9.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(NISSAN9);

		SUBARU = new JButton(new ImageIcon(SUBARUICON));
		SUBARU.setVisible(false);
		//SUBARU.getBorder();
		SUBARU.setContentAreaFilled(false);
		SUBARU.addActionListener(lForButton);
		SUBARU.setBounds(XPOS5, YPOS2, SMALL, SMALL);
		thePanel.add(SUBARU);

		SUBARU2 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU2.setVisible(false);
		SUBARU2.getBorder();
		SUBARU2.setContentAreaFilled(false);
		SUBARU2.addActionListener(lForButton);
		SUBARU2.setBounds(XPOS5, YPOS3, SMALL, SMALL);
		thePanel.add(SUBARU2);
		
		SUBARU3 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU3.setVisible(false);
		SUBARU3.getBorder();
		SUBARU3.setContentAreaFilled(false);
		SUBARU3.addActionListener(lForButton);
		SUBARU3.setBounds(XPOS1, YPOS4, SMALL, SMALL);
		thePanel.add(SUBARU3);
		
		SUBARU4 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU4.setVisible(false);
		SUBARU4.getBorder();
		SUBARU4.setContentAreaFilled(false);
		SUBARU4.addActionListener(lForButton);
		SUBARU4.setBounds(XPOS2, YPOS2, SMALL, SMALL);
		thePanel.add(SUBARU4);
		
		SUBARU5 = new JButton(new ImageIcon(SUBARUICON));
		SUBARU5.setVisible(false);
		SUBARU5.getBorder();
		SUBARU5.setContentAreaFilled(false);
		SUBARU5.addActionListener(lForButton);
		SUBARU5.setBounds(XPOS4, YPOS4, SMALL, SMALL);
		thePanel.add(SUBARU5);
		
		TOYOTA = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA.setVisible(false);
		//TOYOTA.getBorder();
		TOYOTA.setContentAreaFilled(false);
		TOYOTA.addActionListener(lForButton);
		TOYOTA.setBounds(XPOS6, YPOS2, SMALL, SMALL);
		thePanel.add(TOYOTA);
		
		TOYOTA2 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA2.setVisible(false);
		//TOYOTA2.getBorder();
		TOYOTA2.setContentAreaFilled(false);
		TOYOTA2.addActionListener(lForButton);
		TOYOTA2.setBounds(XPOS6, YPOS3, SMALL, SMALL);
		thePanel.add(TOYOTA2);
		
		TOYOTA3 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA3.setVisible(false);
		//TOYOTA3.getBorder();
		TOYOTA3.setContentAreaFilled(false);
		TOYOTA3.addActionListener(lForButton);
		TOYOTA3.setBounds(XPOS2, YPOS4, SMALL, SMALL);
		thePanel.add(TOYOTA3);
		
		TOYOTA6 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA6.setVisible(false);
		TOYOTA6.getBorder();
		TOYOTA6.setContentAreaFilled(false);
		TOYOTA6.addActionListener(lForButton);
		TOYOTA6.setBounds(XPOS4, YPOS3, SMALL, SMALL);
		thePanel.add(TOYOTA6);
		
		TOYOTA7 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA7.setVisible(false);
		TOYOTA7.getBorder();
		TOYOTA7.setContentAreaFilled(false);
		TOYOTA7.addActionListener(lForButton);
		TOYOTA7.setBounds(XPOS6, YPOS1, SMALL, SMALL);
		thePanel.add(TOYOTA7);
		
		TOYOTA9 = new JButton(new ImageIcon(TOYOTAICON));
		TOYOTA9.setVisible(false);
		TOYOTA9.getBorder();
		TOYOTA9.setContentAreaFilled(false);
		TOYOTA9.addActionListener(lForButton);
		TOYOTA9.setBounds(XPOS1, YPOS2, SMALL, SMALL);
		thePanel.add(TOYOTA9);
		
		VOLKSWAGEN2 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN2.setVisible(false);
		VOLKSWAGEN2.getBorder();
		VOLKSWAGEN2.setContentAreaFilled(false);
		VOLKSWAGEN2.addActionListener(lForButton);
		VOLKSWAGEN2.setBounds(XPOS1, YPOS4, SMALL, SMALL);
		thePanel.add(VOLKSWAGEN2);
		
		VOLKSWAGEN3 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN3.setVisible(false);
		VOLKSWAGEN3.getBorder();
		VOLKSWAGEN3.setContentAreaFilled(false);
		VOLKSWAGEN3.addActionListener(lForButton);
		VOLKSWAGEN3.setBounds(XPOS3, YPOS4, SMALL, SMALL);
		thePanel.add(VOLKSWAGEN3);
		
		VOLKSWAGEN4 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN4.setVisible(false);
		VOLKSWAGEN4.getBorder();
		VOLKSWAGEN4.setContentAreaFilled(false);
		VOLKSWAGEN4.addActionListener(lForButton);
		VOLKSWAGEN4.setBounds(XPOS3, YPOS2, SMALL, SMALL);
		thePanel.add(VOLKSWAGEN4);
		
		VOLKSWAGEN5 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN5.setVisible(false);
		VOLKSWAGEN5.getBorder();
		VOLKSWAGEN5.setContentAreaFilled(false);
		VOLKSWAGEN5.addActionListener(lForButton);
		VOLKSWAGEN5.setBounds(XPOS5, YPOS4, SMALL, SMALL);
		thePanel.add(VOLKSWAGEN5);
		
		VOLKSWAGEN6 = new JButton(new ImageIcon(VOLKSWAGENICON));
		VOLKSWAGEN6.setVisible(false);
		VOLKSWAGEN6.getBorder();
		VOLKSWAGEN6.setContentAreaFilled(false);
		VOLKSWAGEN6.addActionListener(lForButton);
		VOLKSWAGEN6.setBounds(XPOS5, YPOS3, SMALL, SMALL);
		thePanel.add(VOLKSWAGEN6);
		
		VOLVO2 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO2.setVisible(false);
		VOLVO2.getBorder();
		VOLVO2.setContentAreaFilled(false);
		VOLVO2.addActionListener(lForButton);
		VOLVO2.setBounds(XPOS2, YPOS4, SMALL, SMALL);
		thePanel.add(VOLVO2);
		
		VOLVO3 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO3.setVisible(false);
		VOLVO3.getBorder();
		VOLVO3.setContentAreaFilled(false);
		VOLVO3.addActionListener(lForButton);
		VOLVO3.setBounds(XPOS4, YPOS4, SMALL, SMALL);
		thePanel.add(VOLVO3);
		
		VOLVO4 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO4.setVisible(false);
		VOLVO4.getBorder();
		VOLVO4.setContentAreaFilled(false);
		VOLVO4.addActionListener(lForButton);
		VOLVO4.setBounds(XPOS4, YPOS2, SMALL, SMALL);
		thePanel.add(VOLVO4);
		
		VOLVO5 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO5.setVisible(false);
		VOLVO5.getBorder();
		VOLVO5.setContentAreaFilled(false);
		VOLVO5.addActionListener(lForButton);
		VOLVO5.setBounds(XPOS6, YPOS4, SMALL, SMALL);
		thePanel.add(VOLVO5);
		
		VOLVO6 = new JButton(new ImageIcon(VOLVOICON));
		VOLVO6.setVisible(false);
		VOLVO6.getBorder();
		VOLVO6.setContentAreaFilled(false);
		VOLVO6.addActionListener(lForButton);
		VOLVO6.setBounds(XPOS6, YPOS3, SMALL, SMALL);
		thePanel.add(VOLVO6);
		
		
		NSX = new JButton(new ImageIcon(NSXI));
		NSX.setVisible(false);
		//NSX.setBorder(BorderFactory.createEmptyBorder());
		NSX.setContentAreaFilled(false);
		NSX.addActionListener(lForButton);
		NSX.setBounds(XPOS1,YPOS5,SMALL,SMALL);
		thePanel.add(NSX);
		
		R8 = new JButton(new ImageIcon(R8I));
		R8.setVisible(false);
		//NSX.setBorder(BorderFactory.createEmptyBorder());
		R8.setContentAreaFilled(false);
		R8.addActionListener(lForButton);
		R8.setBounds(XPOS1,YPOS5,SMALL,SMALL);
		thePanel.add(R8);
		
		TT = new JButton(new ImageIcon(TTI));
		TT.setVisible(false);
		//NSX.setBorder(BorderFactory.createEmptyBorder());
		TT.setContentAreaFilled(false);
		TT.addActionListener(lForButton);
		TT.setBounds(XPOS2,YPOS5,SMALL,SMALL);
		thePanel.add(TT);
		
		// How to add a text field ----------------------
		
		textField1 = new JTextField("", 15);
		
		ListenForKeys lForKeys = new ListenForKeys();
		textField1.setVisible(false);
		textField1.addKeyListener(lForKeys);
		textField1.setBounds(800, 5, 200, 40);
		thePanel.add(textField1);
		
		
		textArea1 = new JTextArea(10,10);
		textArea1.setText("Press START to Begin the program.\n You will be able to find cars by the following order\n 1: Class\n 2: Make\n 3: MPG");
		textArea1.setLineWrap(true);
		textArea1.setVisible(true);		
		textArea1.setWrapStyleWord(true);
		textArea1.setEditable(false);
		textArea1.addKeyListener(lForKeys);
		thePanel.add(textArea1);
		
		text = new JTextArea("",10,10);
		text.setVisible(false);
		text.setFont(new Font("monospaced", Font.PLAIN, 18));
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(false);
		text.addKeyListener(lForKeys);
		text.setBounds(800,50,380,650);
		thePanel.add(text);
		
		
		
		LABEL = new JLabel("TEST");
		LABEL.setLocation(300,600);
		LABEL.setVisible(true);
		LABEL.setText("HELLO WORLD");
		thePanel.add(LABEL);
		
		
		
		
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
	
	
	public void findModel(String m, String n, String o ) {
		
		int i1 = CarManager.Class.indexOf(m);
		int i2 = CarManager.Class.lastIndexOf(m)+1;
		text.setText("");
		
		if(CarManager.Class.contains(m) && CarManager.Make.contains(n)) {
			for(int i = i1; i < i2; i++) {
				if(CarManager.Make.get(i).contains(n) && CarManager.Model.get(i).contains(o)) {
					text.append( 
							"\n01: Year: ------------ " + CarManager.Year.get(i) + " " +
							"\n02: ReleaseDate: ----- "	+ CarManager.ReleaseDate.get(i) +	
							"\n03: Class: ----------- " + CarManager.Class.get(i) +
							"\n04: Make: ------------ " + CarManager.Make.get(i) + " " + 
							"\n05: Model: ----------- " + CarManager.Model.get(i) + 
							"\n06: Transmission: ---- " +  CarManager.Transmission.get(i) +
							"\n07: TransDesc: ------- " + CarManager.TransmissionDesc.get(i) +
							"\n08: Drive: ----------- " + CarManager.Drive.get(i) + 
							"\n09: CityMPG: --------- " + CarManager.CityMPG.get(i) + " " + CarManager.RangeCity.get(i) + 
							"\n10: HwyMPG: ---------- " + CarManager.HighwayMPG.get(i) + " " + CarManager.RangeHwy.get(i) +
							"\n11: CombinedMPG: ----- " + CarManager.CombinedMPG.get(i) + " " + CarManager.RangeCMB.get(i) + 
							"\n12: Displacement: ---- " + CarManager.Displacement.get(i) + 
							"\n13: Cylinders: ------- " + CarManager.Cylinders.get(i) + 
							"\n14: Aspiration: ------ " + CarManager.Aspiration.get(i) + ""+ 		
							"\n15: Gears: ----------- " + CarManager.Gears.get(i) + 
							"\n16: MaxEthanol: ------ " + CarManager.MaxEthanol.get(i) + 
							"\n17: Fuel: ------------ " + CarManager.Fuel.get(i) +
							"\n18: Oil: ------------- " + CarManager.Oil.get(i) +
							"\n19: AFC: ------------- " + CarManager.AFC.get(i) +
							"\n20: 5YearCost: ------- " + CarManager.YearCost5.get(i)  );
					
				}
				//LABEL.setText("Number of Cars: " + cars);
				}
		
		} else text.append("NO CARS FOUND!");
		
		
	}
	
	public void Clear() {
		
		while(!CarManager.SavedCar.isEmpty()) {
			
			for(int i = 0; i<CarManager.SavedCar.size(); i++) {
				
				//CarManager.SavedCar.set(i, null);
				CarManager.SavedCar.remove(i);
				
			}			
		}

		
		
		text.setText("You have Cleared ALL the cars!");	
		
	}
	
	public void Reset() {
		
		text.setVisible(true);
		text.setText("To use the App click your choices.\n"
				+ "\nThe first layer contains the CLASS section.\n"
				+ "\nThe second layer contains the MAKE section.\n"
				+ "\nThe third layer contains the MODEL section.\n"
				+ "\nTo save a car into your list press the MODEL image.\n"
				+ "\nYou can then access a list of your saved vehicles by clicking the SAVED button in the upper right hand corner.\n"
				+ "\nYou can remove vehicles by typing the Index of the car in the text box.\n"
				+ "\nYou can clear your entire list by clicking CLEAR.\n"
				+ "\nUse the BACH button when ever you want to return back to the main page.\n");
		textField1.setVisible(true);
		BACH.setVisible(false);
		CLEAR.setVisible(true);
		SAVED.setVisible(true);
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
		
		NSX.setVisible(false);
		R8.setVisible(false);
		TT.setVisible(false);
		
		
	}
	
	public void Bach() {
		
		text.setVisible(true);
		text.setText("To use the App click your choices.\n"
				+ "\nThe first layer contains the CLASS section.\n"
				+ "\nThe second layer contains the MAKE section.\n"
				+ "\nThe third layer contains the MODEL section.\n"
				+ "\nTo save a car into your list press the MODEL image.\n"
				+ "\nYou can then access a list of your saved vehicles by clicking the SAVED button in the upper right hand corner.\n"
				+ "\nYou can remove vehicles by typing the Index of the car in the text box.\n"
				+ "\nYou can clear your entire list by clicking CLEAR.\n"
				+ "\nUse the BACH button when ever you want to return back to the main page.\n");
		textField1.setVisible(true);
		BACH.setVisible(false);
		CLEAR.setVisible(true);
		SAVED.setVisible(true);
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
		
		NSX.setVisible(false);
		R8.setVisible(false);
		TT.setVisible(false);
		
		
	}
	
	public void SelectedClass() {
	
		text.setVisible(true);
		START.setVisible(false);
		BACH.setVisible(true);
		SAVED.setVisible(true);
		CLEAR.setVisible(true);
		SEDAN.setVisible(false);
		TRUCK.setVisible(false);
		SUV.setVisible(false);
		SMALLSUV.setVisible(false);
		COMPACT.setVisible(false);
		COUPE.setVisible(false);
		MINIVAN.setVisible(false);
		VAN.setVisible(false);
		STATION.setVisible(false);
		
	}
	
	public void SetInvis() {
		
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
		
		NSX.setVisible(false);
		R8.setVisible(false);
		TT.setVisible(false);
		
	}
	
	public void MakeSelected() {
		
		START.setVisible(false);
		BACH.setVisible(true);
		CLEAR.setVisible(true);
		SAVED.setVisible(true);
		text.setVisible(true);
		
	}
	
	public void ClassMakePrint(String n, String m) {				
		
		int i1 = CarManager.Class.indexOf(n);
		int i2 = CarManager.Class.lastIndexOf(n)+1;
		int cars = 0;
		
		text.setText(null);
		
		if(CarManager.Class.contains(n) && CarManager.Make.contains(m)) {
			for(int i = i1; i < i2; i++) {
				if(CarManager.Make.get(i).contains(m)) {
					cars++;
					text.append("\n" +  cars + " Year: " + CarManager.Year.get(i) + " " + "Make: " + CarManager.Make.get(i) + " " + "Model: " + CarManager.Model.get(i)
					+ " Transmission: " +  CarManager.Transmission.get(i) + " |Drive: " + CarManager.Drive.get(i)
					+ "\n CityMPG: " + CarManager.CityMPG.get(i) + " HwyMPG: " + CarManager.HighwayMPG.get(i) + " CombinedMPG: " + CarManager.CombinedMPG.get(i) 
					+ " City: " + CarManager.RangeCity.get(i) + " Highway: " + CarManager.RangeHwy.get(i) + " Combined: " + CarManager.RangeCMB.get(i) + "\n" );
					
				}
				//LABEL.setText("Number of Cars: " + cars);
				}
		
		} else textArea1.append("NO CARS FOUND!");
		
	}
	
	public void AddCustomer(String Car) {
		
		CarManager.SavedCar.add(Car);
		
		
	}
	
	public void Saved() {
		
		if(CarManager.SavedCar.isEmpty()==true) {
			text.setText("No Saved Cars!");
		} else {
			text.setText("");
		int i = 0;
		
		for(String n : CarManager.SavedCar) {
			i++;
			text.append("Car " + i + ": " + n + "\n");
			
			}
		}
		
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
		
		if(e.getSource() == START) {
			Reset();
	
		}
		if(e.getSource()==BACH) {
			
			Bach();
			
				
		}  if(e.getSource()==CLEAR) {
			
			Clear();	
			
		}	
		
		 if(e.getSource()==SAVED) {
				
				Saved();	
				
		}
			/*
			 * 
			 * 	BEGIN COUPE BUTTONS -----------------------------------------------
			 * 
			 */
			if(e.getSource() == COUPE) {
			
				SelectedClass();
			
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
			
			MakeSelected();
			
			SetInvis();
			
			AUDI.setVisible(true);
			R8.setVisible(true);
			TT.setVisible(true);
			ClassMakePrint("COUPE", "AUDI");
		}if(e.getSource() == R8) {
			
			findModel("COUPE", "AUDI", "R8");
			AddCustomer("AUDI-R8");			
			R8.setVisible(true);
			TT.setVisible(false);
			
		}if(e.getSource() == TT) {
			
			findModel("COUPE", "AUDI", "TT");
			AddCustomer("AUDI-TT");			
			R8.setVisible(false);
			TT.setVisible(true);
			
		}
		
		if(e.getSource() == ACURA) {
			
			MakeSelected();
			
			SetInvis();
			
			ACURA.setVisible(true);
			NSX.setVisible(true);
	
			ClassMakePrint("COUPE", "ACURA");
			
		}if(e.getSource() == NSX) {
			
			findModel("COUPE", "ACURA", "NSX");
			AddCustomer("ACURA-NSX");			
			NSX.setVisible(true);
			 try {
		         // Open an audio input stream.           
		          File soundFile = new File("dejavuclip.wav"); //you could also get the sound file with an URL
		          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
		         // Get a sound clip resource.
		         Clip clip = AudioSystem.getClip();
		         // Open audio clip and load samples from the audio input stream.
		         clip.open(audioIn);
		         clip.start();
		      } catch (UnsupportedAudioFileException e1) {
		         e1.printStackTrace();
		      } catch (IOException e1) {
		         e1.printStackTrace();
		      } catch (LineUnavailableException e1) {
		         (e1).printStackTrace();
		      }
		   }
			
		
		
		if(e.getSource() == CHEVROLET) {
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			MakeSelected();
			
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
			SelectedClass();
			text.setText("Here are the makes avaialbe in the class section of COMPACT. Choose a brand to continue your search, or the bach button to return to the class selection page.");
			
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
			text.setVisible(true);
			CLEAR.setVisible(true);
			
			
			
			
			}
		
		
		/*
		 * 
		 * 	BEGIN SEDAN BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == SEDAN) {
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of SEDAN. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
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
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of STATION-WAGON. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
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
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of SMALL-SUV. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
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
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of SUV. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
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
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of MINIVAN. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
				CHRYSLER7.setVisible(true);
				DODGE7.setVisible(true);
				HONDA7.setVisible(true);
				KIA7.setVisible(true);
				NISSAN7.setVisible(true);
				TOYOTA7.setVisible(true);

				
			}
		
		
		/*
		 * 
		 * 	BEGIN VAN BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == VAN) {
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of PASSENGER VAN. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
				
				CHEVROLET8.setVisible(true);
				FORD8.setVisible(true);
				
				
			}
		
		/*
		 * 
		 * 	BEGIN TRUCK BUTTONS -------------------------------------------
		 * 
		 */
		
			if(e.getSource() == TRUCK) {
				SelectedClass();
				text.setText("Here are the makes avaialbe in the class section of TRUCK. Choose a brand to continue your search, or the bach button to return to the class selection page.");
				
	
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
	    	
	    	
	    	
	    }

	    // Handle the key-pressed event from the text field.
	    public void keyPressed(KeyEvent e) {
	    	int key = e.getKeyCode();
	    	
	    	
	    	if(key == KeyEvent.VK_ENTER) {
	    		if(textField1.getText().contentEquals("1") || textField1.getText().contentEquals("one")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(0);
	    			text.append("You have removed car 1");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("2")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(1);
	    			text.append("You have removed car 2");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("3")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(2);
	    			text.append("You have removed car 3");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("4")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(3);
	    			text.append("You have removed car 4");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("5")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(4);
	    			text.append("You have removed car 5");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("6")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(5);
	    			text.append("You have removed car 6");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("7")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(6);
	    			text.append("You have removed car 7");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("8")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(7);
	    			text.append("You have removed car 8");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("9")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(8);
	    			text.append("You have removed car 9");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("10")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(9);
	    			text.append("You have removed car 10");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("11")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(10);
	    			text.append("You have removed car 11");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("12")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(11);
	    			text.append("You have removed car 12");
	    			}
	    		}  
	    		if(textField1.getText().contentEquals("13")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(12);
	    			text.append("You have removed car 13");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("14")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(13);
	    			text.append("You have removed car 14");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("15")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(14);
	    			text.append("You have removed car 15");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("16")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(15);
	    			text.append("You have removed car 16");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("17")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(16);
	    			text.append("You have removed car 17");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("18")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(17);
	    			text.append("You have removed car 18");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("19")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(18);
	    			text.append("You have removed car 19");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("20")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(19);
	    			text.append("You have removed car 20");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("21")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(20);
	    			text.append("You have removed car 21");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("22")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(21);
	    			text.append("You have removed car 22");
	    			}
	    		} 
	    		if(textField1.getText().contentEquals("23")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(22);
	    			text.append("You have removed car 23");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("24")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(23);
	    			text.append("You have removed car 24");
	    			}
	    		}
	    		if(textField1.getText().contentEquals("25")) {
	    			if(CarManager.SavedCar.isEmpty()) {
	    				text.setText("No cars in selected list");
	    			} else {
	    			CarManager.SavedCar.remove(24);
	    			text.append("You have removed car 25");
	    			}
	    		}
	    	
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