import java.util.*;
import java.io.*;


public class CarManager {

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
	
	public static LinkedList<String> ClassA_ll = new LinkedList<String>();
	public static LinkedList<String> MakeA_ll = new LinkedList<String>();
	public static LinkedList<String> ModelA_ll = new LinkedList<String>();
	public static LinkedList<String> TransA_ll = new LinkedList<String>();
	public static LinkedList<String> DriveA_ll = new LinkedList<String>();
	public static LinkedList<Integer> CityA_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> HighwayA_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CMBA_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> AFCA_ll = new LinkedList<Integer>();
	public static LinkedList<String> FuelA_ll = new LinkedList<String>();
	public static LinkedList<Integer> YearA_ll = new LinkedList<Integer>();
	
	public static LinkedList<String> RangeCity_ll = new LinkedList<String>();
	public static LinkedList<String> RangeCMB_ll = new LinkedList<String>();
	public static LinkedList<String> RangeHwy_ll = new LinkedList<String>();
	
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
		
		CarManager x = new CarManager(); 
		
		x.openFileBasic(0000);
		x.readFile();
		x.closeFile();
		
		x.findRangeCity();
		x.findRangeCMB();
		x.findRangeHwy();
		x.addIndex();
		
	
		
		x.findClass("SEDAN");
		x.findClassMake("SEDAN", "TOYOTA");
		
		
	}	 
	
/*
 * 
 * 
 * 	Test Methods
 * 
 * 
 */
	
public void printTest() {
	System.out.println("Class: " + Class_ll);
	System.out.println("Make: " + Make_ll);
	System.out.println("Model: " + Model_ll);
	System.out.println("City-MPG: " + City_ll);
	System.out.println("City-Range: " + RangeCity_ll);
	System.out.println("HWY-MPG: " + Highway_ll);
	System.out.println("HWY-Range: " + RangeHwy_ll);
	System.out.println("CMB-MPG: " + CMB_ll);
	System.out.println("CMB-Range: " + RangeCMB_ll);
	System.out.println("AFC: " + AFC_ll);
	System.out.println("Year: " + Year_ll);
	
	for(int i = 0; i< 100; i++) {
		
		
		
	}

	
	
}
	
public void getIndexPrint(int x) {
	
	System.out.println(Class_ll.get(x));
	System.out.println(Make_ll.get(x));
	System.out.println(Model_ll.get(x));
	System.out.println(City_ll.get(x));
	System.out.println(Highway_ll.get(x));
	System.out.println(CMB_ll.get(x));
	
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
		print("To remove cars type in ");
		
	}

/*
 *  END TEST METHODS 
 */
	

/*
 * 
 * 
 *  Search and Sort
 * 
 * 
 */



/*
 *  Sorting Method: Merge Sort
 *  	We used the built in Collection Merge Sort to save space
 */
	public void collectionsSort() {
	
	//Collection.sort(Class_ll);	
	
	}

/*
 *  Search for Cars
 *  - Class
 *  - Make
 *  - Model
 *  - Trans
 *  - MPG
 *  
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
	int range;
	
	classFirst = Class_ll.indexOf(x);
	classLast = Class_ll.lastIndexOf(x)+1;
	
	if(Class_ll.contains(x) && Make_ll.contains(y)) {//CHECK TRUE
	
		for(int i=classFirst; i<classLast; i++) {//LOOP 
		
			if( Make_ll.get(i).contains(y) && RangeCMB_ll.get(i).contains(a)) {//CHECK 
			c++;
			
			addToCustomerList(i);

			System.out.println(c + ": " + Class_ll.get(i) + " " + Make_ll.get(i) + " " 
			+ " " + Model_ll.get(i)+ " "
					+ RangeCMB_ll.get(i) + " " + "Index:" +i);
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
	
	for(int n : City_ll) {
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
	
	for(int n : CMB_ll) {
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
	
	for(int n : Highway_ll) {
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
	
	
	public void Run() {
		
		Scanner reader = new Scanner(System.in);  
		System.out.println("Pick a Year from 00-18: ");
		int y = reader.nextInt(); 
			
		if(y == 10 || y == 2010) {
			openFileBasic(2010);
			readFile();
			closeFile();
			
			System.out.println("Pick a car Class: ");
			System.out.println("1: Coupe\n2: Compact\n3: Sedan\n4: Station Wagon\n5: Truck\n6: Minivan\n7: SUV");
			int c = reader.nextInt();
			String cs = "";
			if(c == 1) cs = "COUPE"; 
			if(c == 2) cs = "COMPACT-CAR";
			if(c == 3) cs = "SEDAN";
			if(c == 4) cs = "STATION-WAGON";
			if(c == 5) cs = "TRUCK";
			if(c == 6) cs = "MINIVAN";
			if(c == 7) cs = "SUV";
			System.out.println("Pick a car Make: ");
			int m = reader.nextInt();
			String ms = "";
			if(m == 1) ms = "HONDA";
			if(m == 2) ms = "TOYOTA";
			if(m == 3) ms = "FOMOCO";
			if(m == 4) ms = "BMW";
			if(m == 5) ms = "MERCEDES";
			if(m == 6) ms = "FERRARI";
			if(m == 7) ms = "AUDI";
			if(m == 8) ms = "BENTLEY";
			if(m == 9) ms = "BUGATTI";
			System.out.println("Pick a car Transmission: ");
			int t = reader.nextInt();
			String ts = "";
			if(t == 1) ts = "auto";
			if(t == 2) ts = "manual";
			
			//findCars(cs, ms , ts);
			
			
			
		}if(y == 11 || y == 2011) {
			
			
		}if(y == 12 || y == 2012) {
			
			
		}if(y == 13 || y == 2013) {
			
			
		}if(y == 14 || y == 2014) {
			
			
		}if(y == 15 || y == 2015) {
			
			
		}if(y == 16 || y == 2016) {
			
			
		}if(y == 17 || y == 2017) {
			
			
		}

		reader.close();	
		
	}
	
	
	public void print(String e) {
		
		System.out.println(e);
		
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

	public void openFileBasic(int year){
		
		if(year == 0000) {
			try{
				Scanner = new Scanner(new File("AllData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}
		
	}
	
	
public void openFileAdvanced(int year){
		
		if(year == 0000) {
			try{
				Scanner = new Scanner(new File("AllAdvancedData"));
			
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
	
	public void closeFile(){
		Scanner.close();
	}

}