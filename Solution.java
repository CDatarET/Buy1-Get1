import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++){
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    String s = scan.next();
		    
		    for(int i = 0; i < s.length(); i++){
		        if(map.get(s.charAt(i)) == null){
		            map.put(s.charAt(i), 1);
		        }
		        else{
		            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		        }
		    }
		    
		    int cost = 0;
		    for (int count : map.values()){
                if(count % 2 == 1){
                    cost = cost + count / 2 + 1;
                }
                else{
                    cost = cost + count / 2;
                }
            }
            
            System.out.println(cost);
		}
	}
}
