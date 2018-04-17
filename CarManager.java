//CarManager
import java.util.*;
import java.io.*;


public class CarManager {

	public Scanner x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public void openFile(){
		
		try{
			x = new Scanner(new File("cardata.txt"));
			
		}catch(Exception e){
			System.out.println("Could not find File");
		}	
	}
	
	
public void readFile(){
		
		while(x.hasNext()){						
			
			//
			String a = x.next();
			
			//
			String b = x.next();

			//
			String c = x.next();

			//
			String d = x.next();

			//
			String e = x.next();

			//
			String f = x.next();

			//
			String g = x.next();

			//
			String h = x.next();;
			
		}	
	}
	
	public void closeFile(){
		x.close();
	}

}