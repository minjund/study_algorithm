import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        String[][] c = new String[][]{{"black","0","1"},
                                            {"brown",	"1",	"10"},
                                            {"red",	"2",	"100"},
                                            {"orange",	"3",	"1000"},
                                            {"yellow",	"4",	"10000"},
                                            {"green",	"5",	"100000"},
                                            {"blue",	"6",	"1000000"},
                                            {"violet",	"7",	"10000000"},
                                            {"grey",	"8",	"100000000"},
                                            {"white",	"9",	"1000000000"}
                                        }; 
     
    long multi = 0;
    String result = "";
     for(int i =0; i < 3; i++){
         String input = sc.nextLine();
         for(int j =0; j < c.length; j++){
            if(c[j][0].equals(input)){
                if(i == 2){
                   multi = Integer.parseInt(c[j][2]);
                }else{
                    result += c[j][1];
                }
                
            }
             
         }
         
     }
      System.out.println(Long.parseLong(result)*multi);
    }
}