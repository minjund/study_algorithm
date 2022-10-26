import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        
             int num = Integer.parseInt(sc.nextLine());
             
             ArrayList<String> stuName = new ArrayList<String>(); 
         while(true){
             if(num == 0){
                  break;   
             }
             
             ArrayList<String> str = new ArrayList<String>(); 
             int j =0;
             int rsult = 0;
            int cnt = 0;
             String[] stu = new String[num];
              for(int i =0; i < stu.length; i++){
                stu[i] = sc.nextLine();
             }
             
            while(true){
                int a = sc.nextInt();
                String b = sc.nextLine();
                 if(b == ""){
                     num = a;
                     break;
                 }else{
                    str.add(String.valueOf(a));
                    j++;
                 }
                 
             }
             
            List<String> distinctLi = str.stream()
                            .distinct()
                            .collect(Collectors.toList());
            List<String> ad = distinctLi;
            
            for (String distinctElement : distinctLi) {
                str.remove(distinctElement);
            }
            
            for (String distinctElement : str) {
              ad.remove(distinctElement);
            }
            int stuNum = Integer.parseInt(ad.get(0));
            
            stuName.add(stu[stuNum-1]);
            
            
            
         }
         for(int i = 0; i < stuName.size(); i++){
                System.out.println((i+1)+" "+stuName.get(i));
            }
    }
}