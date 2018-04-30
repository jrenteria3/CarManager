import java.util.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class CarManager extends JFrame {

	private static final long serialVersionUID = 1L;

	public Scanner Scanner;
	 
	public static LinkedList<String> Class_ll = new LinkedList<String>();
	public static LinkedList<String> Make_ll = new LinkedList<String>();
	public static LinkedList<String> Model_ll = new LinkedList<String>();
	public static LinkedList<Integer> City_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Highway_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CMB_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> AFC_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Year_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Index_ll = new LinkedList<Integer>();
	public static LinkedList<String> RangeCity_ll = new LinkedList<String>();
	public static LinkedList<String> RangeCMB_ll = new LinkedList<String>();
	public static LinkedList<String> RangeHwy_ll = new LinkedList<String>();
	
	public static LinkedList<String> Year = new LinkedList<String>();
	public static LinkedList<String> Make = new LinkedList<String>();
	public static LinkedList<String> Model = new LinkedList<String>();
	public static LinkedList<String> Displacement = new LinkedList<String>();
	public static LinkedList<String> Cylinders = new LinkedList<String>();
	public static LinkedList<String> Transmission = new LinkedList<String>();
	public static LinkedList<Integer> CityMPG = new LinkedList<Integer>();
	public static LinkedList<Integer> HighwayMPG = new LinkedList<Integer>();
	public static LinkedList<Integer> CombinedMPG = new LinkedList<Integer>();
	public static LinkedList<String> Aspiration = new LinkedList<String>();
	public static LinkedList<String> TransmissionDesc = new LinkedList<String>();
	public static LinkedList<String> Gears = new LinkedList<String>();
	public static LinkedList<String> Drive = new LinkedList<String>();
	public static LinkedList<String> MaxEthanol = new LinkedList<String>();
	public static LinkedList<String> AFC = new LinkedList<String>();
	public static LinkedList<String> Class = new LinkedList<String>();
	public static LinkedList<String> ReleaseDate = new LinkedList<String>();
	public static LinkedList<String> Oil = new LinkedList<String>();
	public static LinkedList<String> YearCost5 = new LinkedList<String>();
	
	public static LinkedList<String> YearCC = new LinkedList<String>();
	public static LinkedList<String> MakeCC = new LinkedList<String>();
	public static LinkedList<String> ModelCC = new LinkedList<String>();
	public static LinkedList<String> DisplacementCC = new LinkedList<String>();
	public static LinkedList<String> CylindersCC = new LinkedList<String>();
	public static LinkedList<String> TransmissionCC = new LinkedList<String>();
	public static LinkedList<String> CityMPGCC = new LinkedList<String>();
	public static LinkedList<String> HighwayMPGCC = new LinkedList<String>();
	public static LinkedList<String> CombinedMPGCC = new LinkedList<String>();
	public static LinkedList<String> AspirationCC = new LinkedList<String>();
	public static LinkedList<String> TransmissionDescCC = new LinkedList<String>();
	public static LinkedList<String> GearsCC = new LinkedList<String>();
	public static LinkedList<String> DriveCC = new LinkedList<String>();
	public static LinkedList<String> MaxEthanolCC = new LinkedList<String>();
	public static LinkedList<String> Fuel = new LinkedList<String>();
	public static LinkedList<String> AFCCC = new LinkedList<String>();
	public static LinkedList<String> ClassCC = new LinkedList<String>();
	public static LinkedList<String> ReleaseDateCC = new LinkedList<String>();
	public static LinkedList<String> OilCC = new LinkedList<String>();
	public static LinkedList<String> YearCost5CC = new LinkedList<String>();
	
	public static LinkedList<String> CustomerClass_ll = new LinkedList<String>();
	public static LinkedList<String> CustomerMake_ll = new LinkedList<String>();
	public static LinkedList<String> CustomerModel_ll = new LinkedList<String>();
	public static LinkedList<Integer> CustomerCity_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CustomerHwy_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CustomerYear_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CustomerCMB_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CustomerAFC_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CustomerIndex_ll = new LinkedList<Integer>();
		
	
	public static void main(String[] args) {
		
		CarManager data = new CarManager(); 
		
		data.openFile(2017);
		data.readDataFile();
		data.closeFile();
		
		data.printTest();
		
		data.findRangeCity();
		data.findRangeCMB();
		data.findRangeHwy();
		data.addIndex();
		
		try {
			new GUI();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}	 
	
/*
 * 	Test Methods
 */
	
	public void printTestAll() {
	
		print("Class: " + Class_ll.get(1));
		print("Make: " + Make_ll.get(1));
		print("Model: " + Model_ll.get(1));
		print("City-MPG: " + City_ll.get(1));
		print("HWY-MPG: " + Highway_ll.get(1));
		print("CMB-MPG: " + CMB_ll.get(1));
		print("AFC: " + AFC_ll.get(1));
		print("Year: " + Year_ll.get(1));
			
	}

	public void printTest() {
	
		for(int i = 0; i<5; i++) {
				print("----------------------------------------------");
				print("1: Year: " + Year.get(i));
				print("2: Class: " + Class.get(i));
				print("3: Make: " + Make.get(i));
				print("4: Model: " + Model.get(i));
				print("5: Trans: " + Transmission.get(i));
				print("6: TransDesc: " + TransmissionDesc.get(i));
				print("7: Fuel: " + Fuel.get(i));
				print("8: CityMPG: " + CityMPG.get(i));
				print("9: HighwayMPG: " + HighwayMPG.get(i));
				print("10: CombinedMPG: " + CombinedMPG.get(i));
				print("11: AFC: " + AFC.get(i));
				print("12: 5 Year Cost: " + YearCost5.get(i));
				print("13: Oil: " + Oil.get(i));
				print("14: Drive: " + Drive.get(i));
				print("15: # Gears: " + Gears.get(i));
				print("16: Displacment: " + Displacement.get(i));
				print("17: Cylinders: " + Cylinders.get(i));
				print("18: Aspiration Method: " + Aspiration.get(i));
				print("19: Max % Ethanol: " + MaxEthanol.get(i));
				print("20: Release Date: " + ReleaseDate.get(i));
				print("----------------------------------------------");
				}
		}

	public void printCustomerList() {
		
		print("Customer List of Cars: ");
			
		for(int i = 0; i<CustomerClass_ll.size(); i++ ) {	
			System.out.println(i + ": " + 
					CustomerIndex_ll.get(i) + " " + 
					CustomerClass_ll.get(i)+ " " +
					CustomerMake_ll.get(i) + " " + 
					CustomerModel_ll.get(i) + " " + 
					CustomerYear_ll.get(i));
		}
		print("To remove cars type in Index # :^) ");	
	}

/*
 *  END TEST METHODS 
 */
	

/*
 *  Search and Sort
 */

/*
 *  Sorting Method: Merge Sort
 *  	We used the built in Collection Merge Sort to save space
 */
	public void collectionsSort() {
	
		Collections.sort(Class);	
	
	}

/*
 *  Search for Cars
 */
	//STEP ONE SEARCH
	public void findClass(String x) {
	
		int a;
		int b;
		int c= 0;

		a = Class_ll.indexOf(x); 
		b = Class_ll.lastIndexOf(x)+1;
	
		int numMake = 0;
				
		for(int i=a; i<b; i++) {
			c++;
			System.out.println(c + ": "+ Class_ll.get(i)+ " " + Make_ll.get(i) 
			+ " " + Model_ll.get(i) + " " + Year_ll.get(i));
			numMake++;	
			}
 
		System.out.println("Num of Cars: " + x + "s " + numMake);
	
	}

	//STEP TWO SEARCH
	public void findClassMake(String x, String y) {
	
		/*	String x = CLASS
		*	String y = MAKE
		*/
		
		int FirstIndex;
		int LastIndex; 
		int c =0;
		int numCars = 0;
	
		FirstIndex = Class_ll.indexOf(x);
		LastIndex = Class_ll.lastIndexOf(x)+1;
	
		if(Class_ll.contains(x) && Make_ll.contains(y)) { //Checks if conditions are true
			for(int i=FirstIndex; i<LastIndex; i++) { //Loops through index's based off CLASS 
				if( Make_ll.get(i).contains(y)) { // If index of CLASS and index of MAKE match then ->
					c++;
					addToCustomerList(i);
					System.out.println(c + 
							":  Class: " + Class_ll.get(i) + 
							" | Make: " + Make_ll.get(i) + 
							" | Model: " + Model_ll.get(i) + 
							" | Year: "+ Year_ll.get(i) + 
							" | Index: " +i);
					numCars++;	
						}
				}
		
			System.out.println("Number of Cars: " + numCars + "\n");
			printCustomerList();
			}
			if(numCars == 0) System.out.println("NO CARS FOUND!!!");
	}
	
	//STEP THREE SEARCH
	public void findClassMakeMPG(String x, String y, String a) {
	
	/*	x = CLASS
	 * 	y = MAKE
	 * 	z = MPG
	 */
		
		int classFirst;
		int classLast; 
		int c =0;
		int numCars = 0;
	
		classFirst = Class_ll.indexOf(x);
		classLast = Class_ll.lastIndexOf(x)+1;
	
		if(Class_ll.contains(x) && Make_ll.contains(y)) {//CHECK TRUE
	
			for(int i=classFirst; i<classLast; i++) {//LOOP 
		
				if( Make_ll.get(i).contains(y) && RangeCMB_ll.get(i).contains(a)) {//CHECK 
					c++;
					addToCustomerList(i);
					System.out.println(c + ": " + 
					Class_ll.get(i) + " " + 
					Make_ll.get(i) + " " + 
					Model_ll.get(i) + " " + 
					RangeCMB_ll.get(i) + " " + 
					"Index:" +i);
					numCars++;	
					}
				}
		
			System.out.println("Number of Cars: " + numCars);
			printCustomerList();
			}	
		}
/*
 *  END Search Methods
 */
	
/*
 * 
 * Set Range List for City, Hwy, CMB
 * 
 */

	public void findRangeCity() {
	
		for(int n : CityMPG) {
			if(n < 20) {
				RangeCity_ll.add("LOW");
			} else if(n >= 20 && n <30) {
				RangeCity_ll.add("MID");
			} else if(n >= 30) {
				RangeCity_ll.add("HIGH");
			}
		}
	}

	public void findRangeCMB() {
	
		for(int n : CombinedMPG) {
			if(n < 20) {
				RangeCMB_ll.add("LOW");
			} else if(n >= 20 && n <30) {
				RangeCMB_ll.add("MID");
			} else if(n >= 30) {
				RangeCMB_ll.add("HIGH");
			}
		}
	}

	public void findRangeHwy() {
	
		for(int n : HighwayMPG) {
			if(n < 20) {
				RangeHwy_ll.add("LOW");
			} else if(n >= 20 && n <30) {
				RangeHwy_ll.add("MID");
			} else if(n >= 30) {
				RangeHwy_ll.add("HIGH");
			}
		}
	}

	public void addIndex() {
		
		for(int n = 0; n < Year_ll.size(); n++) {
			Index_ll.add(n);
		}	
	}
	
/*
 *  END RANGE METHODS
 */
	
	
	public void addToCustomerList(int i) {
		
		CustomerMake_ll.add(Make_ll.get(i));
		CustomerModel_ll.add(Model_ll.get(i));
		CustomerYear_ll.add(Year_ll.get(i));
		CustomerCMB_ll.add(CMB_ll.get(i));
		CustomerCity_ll.add(City_ll.get(i));
		CustomerHwy_ll.add(Highway_ll.get(i));
		CustomerAFC_ll.add(AFC_ll.get(i));
		CustomerClass_ll.add(Class_ll.get(i));
		CustomerIndex_ll.add(Index_ll.get(i));

	}
		
	public void print(Object s) {
		
		System.out.println(s);
		
	}
	
	public void removeFromCustomerList(String x) {
		
		
		
	}

/*
 * 
 * 
 * 	FILE METHODS
 * 
 * 
 */

	public void openFile(int year){
		
		if(year == 0000) {
			try{
				Scanner = new Scanner(new File("AllData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}else if(year == 2017) {
			try{
				Scanner = new Scanner(new File("CarData2017"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}
		
	}
	
	public void readFile(){
		
		while(Scanner.hasNext()){						
			
			String a = Scanner.next();		
			Class_ll.add(a);											
			
			String b = Scanner.next();
			Make_ll.add(b);
			
			String c = Scanner.next();
			Model_ll.add(c);
			
			String d = Scanner.next();
			int city = 0;
			city = Integer.parseInt(d);
			City_ll.add(city);
			
			String e = Scanner.next();
			int highway = 0;
			highway = Integer.parseInt(e);
			Highway_ll.add(highway);
			
			String f = Scanner.next();
			int CMB = 0;
			CMB = Integer.parseInt(f);
			CMB_ll.add(CMB);
			
			String g = Scanner.next();
			int AFC = 0;
			AFC = Integer.parseInt(g);
			AFC_ll.add(AFC);
			
			String h = Scanner.next();
			int YEAR = 0;
			YEAR = Integer.parseInt(h);
			Year_ll.add(YEAR);
			}	
		
	}
	
public void readDataFile(){
		
		while(Scanner.hasNext()){						
			
			String a = Scanner.next();		
			Year.add(a);											
			
			String b = Scanner.next();
			Make.add(b);
			
			String c = Scanner.next();
			Model.add(c);
			
			String d = Scanner.next();
			Displacement.add(d);
			
			String e = Scanner.next();
			Cylinders.add(e);
			
			String f = Scanner.next();
			Transmission.add(f);
			
			String g = Scanner.next();
			int city = Integer.parseInt(g);
			CityMPG.add(city);
			
			String h = Scanner.next();
			int hwy = Integer.parseInt(h);
			HighwayMPG.add(hwy);
			
			String i = Scanner.next();
			int cmb = Integer.parseInt(i);
			CombinedMPG.add(cmb);
			
			String j = Scanner.next();		
			Aspiration.add(j);
			
			String k = Scanner.next();		
			TransmissionDesc.add(k);
			
			String l = Scanner.next();		
			Gears.add(l);
			
			String m = Scanner.next();		
			Drive.add(m);
			
			String n = Scanner.next();		
			MaxEthanol.add(n);
			
			String o = Scanner.next();
			Fuel.add(o);
			
			String p = Scanner.next();		
			AFC.add(p);
			
			String q = Scanner.next();		
			Class.add(q);
			
			String r = Scanner.next();		
			ReleaseDate.add(r);
			
			String s = Scanner.next();		
			Oil.add(s);
			
			String t = Scanner.next();		
			YearCost5.add(t);
			}	
		
	}
	
	public void closeFile(){
		Scanner.close();
	}

}
