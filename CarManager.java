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
	
	public static void main(String[] args) {
		
		CarManager x = new CarManager(); 
		
		x.openFile();
		x.readFile();
		x.closeFile();
		
		x.collectionsSort();
		
		x.printTest();
		x.getIndexPrint(56);
		
		x.findClass("COMPACT-CARS");
		/*
		System.out.println(Class_ll.indexOf("COMPACT-CARS"));
		System.out.println(Class_ll.indexOf("MIDSIZE-CARS"));
		
		int a;
		int b;
		int c;
		
		a = Class_ll.indexOf("COMPACT-CARS")+1;
		b = Class_ll.indexOf("MIDSIZE-CARS");
		c = b-a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for(int i = a; i<b;i++) {
			System.out.println(Make_ll.get(i) + " " + Model_ll.get(i) + " " + Trans_ll.get(i));
			
			
		}
		*/
		
		
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




public void collectionsSort() {
	
	Collections.sort(Type_ll);
	//System.out.println(Type_ll);
	
}


public void findClass(String x) {
	
	int a;
	int b;
	int c;
	//a = Class_ll.indexOf("COMPACT-CARS")+1;
	//b = Class_ll.indexOf("MIDSIZE-CARS");
	//c = b-a;
	int numMake = 0;
	
		for(String mclass : Class_ll) {
			if(mclass.contains(x)) {
				a = Class_ll.indexOf(x)+1; 
				b = Class_ll.indexOf("MIDSIZE-CARS");
				//CHANGE TO TYPE-LL FOR +1 
				System.out.println(mclass + mclass.indexOf(x));
				
				//for(int i = a; i<b;i++) {
				//	System.out.println(Make_ll.get(i) + " " + Model_ll.get(i) + " " + Trans_ll.get(i));
					
					
				//}
				numMake++;
			} 
		} 
	System.out.println("Num of Cars: " + numMake);
	
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