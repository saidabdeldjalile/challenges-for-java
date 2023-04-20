package projettp;

import java.util.ArrayList;
import java.util.List;

public class parseAndClean {

    public static void parseAndClean(List<Integer> array, List<Integer> arrayPair, List<Integer> arrayImp){
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
		 List<Integer> []= {1,5,13,9,12,69,48,37,96,25,11,28,112,36,53,47,85,62,32,7,4,158,32,65,91,19,37,73,54,83} array.add(i);
	         
	        List<Integer> arrayPair = new ArrayList<Integer>();
	        List<Integer> arrayImp = new ArrayList<Integer>();
	         
	        parseAndClean test;
			parseAndClean.parseAndClean(array, arrayPair, arrayImp);
	         
	        for(Integer i : arrayPair)
	            System.out.print(i + " ");
	         
	        for(Integer i : arrayImp)
	            System.out.print(i + " ");
}
