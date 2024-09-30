
package hello.threelargestnumber;

import java.util.*;
public class ThreeLargestNumber {

    static int biggestOfThree(int x,int y,int z){
    
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        int largest=biggestOfThree(a,b,c);
        
        System.out.print("Largest Number: "+largest);
        
    }
}
