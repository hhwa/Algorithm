package basic;

import java.util.*;
import java.util.stream.*;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] info = {"java backend junior pizza 150"
				,"python frontend senior chicken 210"
				,"python frontend senior chicken 150"
				,"cpp backend senior pizza 260"
				,"java backend junior chicken 80"
				,"python backend senior chicken 50"};
		
		String[] query = {"java and backend and junior and pizza 100"
				,"python and frontend and senior and chicken 200"
				,"cpp and - and senior and pizza 250"
				,"- and backend and senior and - 150"
				,"- and - and - and chicken 100"
				,"- and - and - and - 150"};
		
		List<String> infoList = Arrays.asList(info);
		
		List<String[]> infoListStream = 
	            infoList.stream().map(list -> list.split(" ")).collect(Collectors.toList());
		
		List<String> queryList = Arrays.asList(query);
	        
	        List<String[]> queryListStream = 
	            Arrays.asList(query).stream().map(str -> str.replace(" and ", " ")).map(list -> list.split(" ")).collect(Collectors.toList());
	        
	        int[] answer = new int[queryListStream.size()];
        	int arrnum = 0;
	        for( String[] querystr : queryListStream) {
	        	int count = 0;
        		for( String[] infostr : infoListStream) {
        			for(int i=0; i<infostr.length; i++) {
        				if(i == infostr.length-1) {
        					if(Integer.parseInt(querystr[i]) <= Integer.parseInt(infostr[i])) {
        						count++;
        					}
        				}else {
        					if(querystr[i].equals(infostr[i]) || querystr[i].equals("-")) {
    	        				continue;
    	        			}else {
    	        				break;
    	        			}
        				}
        			}
	        	}
        		answer[arrnum++] = count;
	        }
	        
		
		//System.out.println(queryListStream.size());
		for(int i =0; i<answer.length; i++) {
			
			//System.out.println(queryListStream.get(i).length);
			//System.out.println(queryListStream.get(i)[0]);
		}


	}

}
