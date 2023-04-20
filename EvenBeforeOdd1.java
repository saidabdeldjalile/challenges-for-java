package defis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenBeforeOdd1 {
	   public static void  EvenBeforeOdd(List<Integer> array, List<Integer> arrayPair, List<Integer> arrayImp){
	        for(Integer i : array){
	            if(i%2 == 0)
	                arrayPair.add(i);
	            else
	                arrayImp.add(i);
	        }
	  
	        array.clear();
	    }
	     
	public static void main(String[] args) {
		 List<Integer> array = new ArrayList<Integer>();
		    Scanner sc = new Scanner(System.in);
		    System.out.print( "donner la taille ");  
		    int taille=sc.nextInt();
		    System.out.print( " donner les nombres "
		    		+ "");for(int i=0;i<taille ;i++){
		    array.add(sc.nextInt());
		}
		             
		            List<Integer> arrayPair = new ArrayList<Integer>();
		            List<Integer> arrayImp = new ArrayList<Integer>();
		             
		            EvenBeforeOdd test;
		            EvenBeforeOdd1.EvenBeforeOdd(array, arrayPair, arrayImp);
		             
		            for(Integer i : arrayPair)
		                System.out.print(i + " ");
		             
		            for(Integer i : arrayImp)
		                System.out.print(i + " ");

		    }


}
