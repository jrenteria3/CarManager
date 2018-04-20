import java.util.*;
import java.io.*;


public class CarManager {

	public Scanner x;
	 
	public static LinkedList<String> Class_ll = new LinkedList<String>();
	public static LinkedList<String> Make_ll = new LinkedList<String>();
	public static LinkedList<String> Model_ll = new LinkedList<String>();
	public static LinkedList<Integer> Cyl_ll = new LinkedList<Integer>();
	public static LinkedList<String> Trans_ll = new LinkedList<String>();
	public static LinkedList<String> Drive_ll = new LinkedList<String>();
	public static LinkedList<Integer> City_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Highway_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> CMB_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Fcost_ll = new LinkedList<Integer>();
	public static LinkedList<Integer> Type_ll = new LinkedList<Integer>();
	public static LinkedList<String> Range_ll = new LinkedList<String>();
	public static void main(String[] args) {
		
		CarManager x = new CarManager(); 
		
		x.openFile();
		x.readFile();
		x.closeFile();
		
		x.collectionsSort();
		
		//x.printTest();
		//x.getIndexPrint(56);
		
		//x.findClass("SEDAN");
		
		x.findCars("COMPACT-CAR", "HONDA", "AUTO");
		
		x.filterMPG("COMPACT-CAR", "HONDA", "AUTO", 19);
		
		x.findRange();
		
	}
	
	 
	
/*
 * 
 * 
 * 	Test Methods
 * 
 * 
 * 
 */
	
public void printTest() {
	System.out.println(Class_ll);
	System.out.println(Make_ll);
	System.out.println(Model_ll);
	System.out.println(Cyl_ll);
	System.out.println(Trans_ll);
	System.out.println(Drive_ll);
	System.out.println(City_ll);
	System.out.println(Highway_ll);
	System.out.println(CMB_ll);
	System.out.println(Fcost_ll);
	System.out.println(Type_ll);
}
	
public void getIndexPrint(int x) {
	
	System.out.println(Class_ll.get(x));
	System.out.println(Make_ll.get(x));
	System.out.println(Model_ll.get(x));
	System.out.println(Cyl_ll.get(x));
	System.out.println(Trans_ll.get(x));
	System.out.println(Drive_ll.get(x));
	System.out.println(City_ll.get(x));
	System.out.println(Highway_ll.get(x));
	System.out.println(CMB_ll.get(x));
	System.out.println(Fcost_ll.get(x));
	System.out.println(Type_ll.get(x));
	
	
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
	
	Collections.sort(Type_ll);
	
}

/*
 *  Search for Class
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
			System.out.println(c + ": " + Make_ll.get(i) + " " + Model_ll.get(i) + " " + Trans_ll.get(i));
			numMake++;	
		}
 
	System.out.println("Num of Cars: " + x + "s " + numMake);
	
}
/*
 *  Search Tier 1 
 */
public void findCars(String x, String y, String z) {
	
	int classFirst;
	int classLast; 
	int c =0;
	int numCars = 0;
	
	classFirst = Class_ll.indexOf(x);
	classLast = Class_ll.lastIndexOf(x)+1;
	
	if(Class_ll.contains(x) && Make_ll.contains(y)) {
	
		for(int i=classFirst; i<classLast; i++) {
		
			if( Make_ll.get(i).contains(y) && Trans_ll.get(i).contains(z) ) {
			c++;
			System.out.println(c + ": " + Class_ll.get(i) + " " + Make_ll.get(i) + " " + Trans_ll.get(i) +  " Index:" +i);
			numCars++;	
			
				}
			
			}
		
		System.out.println("Number of Cars: " + numCars);
		}	
	
	}

public void filterMPG(String x, String y, String z, int a) {
	
	int classFirst;
	int classLast; 
	int c =0;
	int numCars = 0;
	int range;
	
	classFirst = Class_ll.indexOf(x);
	classLast = Class_ll.lastIndexOf(x)+1;
	
	/*if (a == "LOW") {
		 
	} else if (a == "MID") {
		
	} else if (a == "HIGH") {
		
	}
	*/
	if(Class_ll.contains(x) && Make_ll.contains(y)) {
	
		for(int i=classFirst; i<classLast; i++) {
		
			if( Make_ll.get(i).contains(y) && Trans_ll.get(i).contains(z) && CMB_ll.get(i) >= 30) {
			c++;
			System.out.println(c + ": " + Class_ll.get(i) + " " + Make_ll.get(i) + " " 
			+ Trans_ll.get(i) +" " + Model_ll.get(i)+ " "+ CMB_ll.get(i) + " " + "Index:" +i);
			numCars++;	
			
				}
			
			}
		
		System.out.println("Number of Cars: " + numCars);
		}	
	
	}
	
public void findRange() {
	
	
	
	for(int n : CMB_ll) {
		if(n <= 20) {
			Range_ll.add("LOW");
		} else if(n > 20 && n <=30) {
			Range_ll.add("MID");
		} else if(n > 30) {
			Range_ll.add("HIGH");
		}
	}
	
	
	for(int i : CMB_ll)
	System.out.println(CMB_ll.get(i)+ " " + Range_ll.get(i));
	
}




/*
 * 
 * 
 * 	FILE METHODS
 * 
 * 
 */




public void openFile(){
		
		try{
			x = new Scanner(new File("cardata"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	
public void readFile(){
		
		while(x.hasNext()){						
			
			//
			String a = x.next();		
			Class_ll.add(a);											
			
			//
			String b = x.next();
			Make_ll.add(b);
			
			//
			String c = x.next();
			Model_ll.add(c);
			
			//
			String d = x.next();
			int cyl = 0;
			cyl = Integer.parseInt(d);
			Cyl_ll.add(cyl);
			
			//
			String e = x.next();
			Trans_ll.add(e);
			
			//
			String f = x.next();
			Drive_ll.add(f);
			
			//
			String g = x.next();
			int city = 0;
			city = Integer.parseInt(g);
			City_ll.add(city);
			
			//
			String h = x.next();
			int highway = 0;
			highway = Integer.parseInt(h);
			Highway_ll.add(highway);
			
			//
			String i = x.next();
			int CMB = 0;
			CMB = Integer.parseInt(i);
			CMB_ll.add(CMB);
			
			//
			String j = x.next();
			int Fcost = 0;
			Fcost = Integer.parseInt(j);
			Fcost_ll.add(Fcost);
			
			String k = x.next();
			int type = 0;
			type = Integer.parseInt(k);
			Type_ll.add(type);
		}	
		
	}
	
	public void closeFile(){
		x.close();
	}

}