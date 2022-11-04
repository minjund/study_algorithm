import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int yCnt =  0;
        int mCnt = 0;
        for(int i=0; i < a; i++){
            int callTime = sc.nextInt();
            if(30 <= callTime){
                for(int j =0; j < callTime/30+1; j++){
                    yCnt += 10;
                }
            }else{
                 yCnt += 10;
            }
            if(60 <= callTime){
                for(int j =0; j < callTime/60+1; j++){
                    mCnt += 15;
                }
            }else{
                 mCnt += 15;
            }
        }
        if(mCnt == yCnt){
             System.out.print("Y M "+mCnt);
        }else if(mCnt < yCnt){
            System.out.print("M "+mCnt);
        }else{
            System.out.print("Y "+yCnt);
        }
        
    }
}