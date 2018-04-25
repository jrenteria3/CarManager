import java.util.*;
import java.io.*;


public class CarManager {

	public Scanner x;
	 
	public static LinkedList<String> Class_ll = new LinkedList<String>();
	public static LinkedList<String> Make_ll = new LinkedList<String>();
	public static LinkedList<String> Model_ll = new LinkedList<String>();
	public static LinkedList<Integer> City_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Highway_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CMB_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> AFC_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Year_ll = new LinkedList<Integer>();
	
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
	
	public static ArrayList<String> Class_arr = new ArrayList<String>();
	public static ArrayList<String> Make_arr = new ArrayList<String>();
	public static ArrayList<String> Model_arr = new ArrayList<String>();
	public static ArrayList<String> Trans_arr = new ArrayList<String>();
	public static ArrayList<String> Drive_arr = new ArrayList<String>();
	public static ArrayList<Integer> City_arr = new ArrayList<Integer>();
	public static ArrayList<Integer> Highway_arr = new ArrayList<Integer>();
	public static ArrayList<Integer> Cmb_arr = new ArrayList<Integer>();
	public static ArrayList<Integer> AFC_arr = new ArrayList<Integer>();
	public static ArrayList<Integer> Year_arr = new ArrayList<Integer>();
	
	public static LinkedList<String> RangeCity_ll = new LinkedList<String>();
	public static LinkedList<String> RangeCMB_ll = new LinkedList<String>();
	public static LinkedList<String> RangeHwy_ll = new LinkedList<String>();
	
	public static LinkedList<String> Customer_ll = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		CarManager x = new CarManager(); 
		
		x.openFileBasic(2010);
		x.readFile();
		x.closeFile();
		
		x.printTest();
		
		
		
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
	System.out.println("HWY-MPG: " + Highway_ll);
	System.out.println("CMB-MPG: " + CMB_ll);
	System.out.println("AFC: " + AFC_ll);
	
	System.out.println();
	
	int First = 0;
	int Last = 0;
	
	First = Class_ll.indexOf("MINIVAN");
	Last = Class_ll.lastIndexOf("MINIVAN");
	
	for(int i = First; i < Last; i++) {
		
		System.out.println(" | " + i + ": |Class: " + 
				Class_ll.get(i) + " |Make: " +
				Make_ll.get(i) + " |Model: " +
				Model_ll.get(i) + " |CityMPG:: " +
				City_ll.get(i) + " |HwyMPG: " +
				Highway_ll.get(i) + " |CmbMPG: " +
				CMB_ll.get(i) + " |AFC: " +
				AFC_ll.get(i) + " |Year: " +
				Year_ll.get(i) + " | " 
				);
		
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
	
	//Collection.sort(Customer_ll);	
	
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
			+ " " + Model_ll.get(i));
			numMake++;	
		}
 
	System.out.println("Num of Cars: " + x + "s " + numMake);
	
	}

	public void findCars(String x, String y, String z) {
	
	int FirstIndex;
	int LastIndex; 
	int c =0;
	int numCars = 0;
	
	printTest();
	FirstIndex = Class_ll.indexOf(x)+1;
	LastIndex = Class_ll.lastIndexOf(x)+1;
	
	for(int i = 1; i < Class_ll.size(); i++) {
		
		if(Class_ll.get(i).toUpperCase().contains(z)) {
			System.out.println("FOUND");
		}
	}
	/*
		if(Class_ll.contains(x) && Make_ll.contains(y)) {
			for(int i=classFirst; i<classLast; i++) {
				
				if( Make_ll.get(i).contains(y) 
						&& Trans_ll.get(i).toLowerCase().contains(z) ) {
			c++;
			System.out.println(c + ": " + Class_ll.get(i) + " " 
			+ Make_ll.get(i) + " " + Trans_ll.get(i) +  " Index:" +i);
			numCars++;	
			
					}
			
				}
		
		System.out.println("Number of Cars: " + numCars);
			}	
	*/	
	}

	public void filterMPG(String x, String y, String z, String a) {
	
	int classFirst;
	int classLast; 
	int c =0;
	int numCars = 0;
	int range;
	
	classFirst = Class_ll.indexOf(x);
	classLast = Class_ll.lastIndexOf(x)+1;
	
	if(Class_ll.contains(x) && Make_ll.contains(y)) {
	
		for(int i=classFirst; i<classLast; i++) {
		
			if( Make_ll.get(i).contains(y) && RangeCMB_ll.get(i).contains(a)) {
			c++;
			System.out.println(c + ": " + Class_ll.get(i) + " " + Make_ll.get(i) + " " 
			+ " " + Model_ll.get(i)+ " "
					+ RangeCMB_ll.get(i) + " " + "Index:" +i);
			numCars++;	
			
				}
			
			}
		
		System.out.println("Number of Cars: " + numCars);
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

/*
 *  END RANGE METHODS
 */
	
	
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
			
			findCars(cs, ms , ts);
			
			
			
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
	
	


/*
 * 
 * 
 * 	FILE METHODS
 * 
 * 
 */

	public void openFileBasic(int year){
		
		if(year == 2000) {
			try{
				x = new Scanner(new File("cardata"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}else if(year == 2010) {
			try{
				x = new Scanner(new File("2010CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2011) {
			try{
				x = new Scanner(new File("2011CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2012) {
			try{
				x = new Scanner(new File("2012CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2013) {
			try{
				x = new Scanner(new File("2013CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2014) {
			try{
				x = new Scanner(new File("2014CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2015) {
			try{
				x = new Scanner(new File("2015CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2016) {
			try{
				x = new Scanner(new File("2016CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2017) {
			try{
				x = new Scanner(new File("2016CarData"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}
		
	}
	
	
public void openFileAdvanced(int year){
		
		if(year == 2000) {
			try{
				x = new Scanner(new File("cardata"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2010) {
			try{
				x = new Scanner(new File("2010CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2011) {
			try{
				x = new Scanner(new File("2011CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2012) {
			try{
				x = new Scanner(new File("2012CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2013) {
			try{
				x = new Scanner(new File("2013CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2014) {
			try{
				x = new Scanner(new File("2014CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2015) {
			try{
				x = new Scanner(new File("2015CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2016) {
			try{
				x = new Scanner(new File("2016CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}if(year == 2017) {
			try{
				x = new Scanner(new File("2016CarData2"));
			
		}	catch(Exception e){
				System.out.println("Could not find File");
			}	
		}
		
		
		
		
	}
	
	
	public void readFile(){
		
		while(x.hasNext()){						
			
			String a = x.next();		
			Class_ll.add(a);											
			
			String b = x.next();
			Make_ll.add(b);
			
			String c = x.next();
			Model_ll.add(c);
			
			String d = x.next();
			int city = 0;
			city = Integer.parseInt(d);
			City_ll.add(city);
			
			String e = x.next();
			int highway = 0;
			highway = Integer.parseInt(e);
			Highway_ll.add(highway);
			
			String f = x.next();
			int CMB = 0;
			CMB = Integer.parseInt(f);
			CMB_ll.add(CMB);
			
			String g = x.next();
			int AFC = 0;
			AFC = Integer.parseInt(g);
			AFC_ll.add(AFC);
			
			String h = x.next();
			int YEAR = 0;
			YEAR = Integer.parseInt(h);
			Year_ll.add(YEAR);
			}	
		
	}
	
	public void closeFile(){
		x.close();
	}

}