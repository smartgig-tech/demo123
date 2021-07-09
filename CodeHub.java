package practiceclass;

import java.util.Scanner;

class  CodeHub {
  
   public  static String thousandSeparator(int n, String ch)
    {
        int l = (int)Math.floor(Math.log10(n)) + 1;
        StringBuffer str = new StringBuffer("");
        
        int count = 0;
        int r = 0;
        
        if (l > 3) {
  
              for (int i = l - 1; i >= 0; i--) {
  
                 r = n % 10;
                        n = n / 10;
                    count++;
                    
                if (((count % 3) == 0) && (i != 0)) {
  
                    str.append(String.valueOf(r));
                    str.append(ch);
                }
                else
                    str.append(String.valueOf(r));
            }
            str.reverse();
        }
  
        
        else
            str.append(String.valueOf(n));
  
        return str.toString();
    }
  
    
 
	public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        int n =sc.nextInt() ;
        String ch = ".";
        System.out.println(thousandSeparator(n, ch));
    }
}