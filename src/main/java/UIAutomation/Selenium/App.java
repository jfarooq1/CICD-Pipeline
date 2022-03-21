package UIAutomation.Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ArrayList<Integer> names=new ArrayList<>(Arrays.asList(1,2,3,4,5));
	
		for(Integer i: names) {
			System.out.println(i);
		}        
		
		LinkedList<Integer> n=new LinkedList<>(Arrays.asList(1,2,3,4,5));
		
		for(Integer i: n) {
			System.out.println(i);
		}

		
	}

}
