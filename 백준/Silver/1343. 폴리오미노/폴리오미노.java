import java.util.*;
public class Main {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		boolean bo = false;
		
		String N = sc.nextLine();
		
		int nowPoint = 0;
		String reslut = "";
		
    	int Xcnt = 0;
    	
    		for(int i=0;i<N.length() ;i++) {
    		    if(String.valueOf(N.charAt(i)).equals(".")){
    		        for(int j = nowPoint; j<i; j++){
    		            if(String.valueOf(N.charAt(j)).equals("X")){
    		               Xcnt++;
    		            }
    		        }   
		            if( Xcnt % 2 == 0 || Xcnt % 4 == 0){
		                while(Xcnt > 0){
		                    if(Xcnt - 4 >= 0){
		                        reslut += "AAAA";
		                       Xcnt = Xcnt - 4;
		                    }else{
		                        if(Xcnt - 2 >= 0){
    		                        reslut += "BB";
    		                        Xcnt = Xcnt - 2;
		                        }
		                    }
		                }
		                nowPoint = i;
		                reslut +=".";
    		       }else{
	                    bo = true;
	                    break;
	                }
    		    }
    		        if(bo){
        	            break;
        	        }  
        	}
        	
            for(int j = nowPoint; j<N.length(); j++){
                if(String.valueOf(N.charAt(j)).equals("X")){
                   Xcnt++;
                }
            }
            if(Xcnt % 2 == 0 || Xcnt % 4 == 0){
                while(Xcnt > 0){
                    if(Xcnt - 4 >= 0){
                        reslut += "AAAA";
                       Xcnt = Xcnt - 4;
                    }else{
                        if(Xcnt - 2 >= 0){
	                        reslut += "BB";
	                        Xcnt = Xcnt - 2;
                        }
                    }
                }
           }else{
                bo = true;
           }   
	    
	    
	    if(bo){
            System.out.println(-1);
        }else{
	        System.out.println(reslut);
        }
	}

}