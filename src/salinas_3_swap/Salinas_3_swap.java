/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salinas_3_swap;

/**
 *
 * @author HUC
 */
public class Salinas_3_swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i < 501;i ++){
            //div by 2,3,5
            if(isDavis(i) && isClaughton(i) && isVidal(i)){
                //take our i from the system.out after completing, TEST
                System.out.println(i + " Team Building");
                //div by 3,5
            }else if(isClaughton(i) && isVidal(i)){
                System.out.println(i + " Old School");
                //div by 2,3
            }else if(isDavis(i) && isClaughton(i)){
                System.out.println(i +" chisme");
                //div by 2
            }else if(isDavis(i)){
               //div by 22
                if(isdiv22(i)){
               System.out.println(i +" Ninja");
               //only div by 2, not 22
                }else{
                    System.out.println( i +" Davis");
                }
            }else if(isClaughton(i)){
                //div by 33
                if(isdiv33(i)){
                    System.out.println(i +" Herr Direktor");
                    //only div by 3,not 33
                }else {
                    System.out.println(i +" Claughton");
                }
                //div by 5
            }else if(isVidal(i)){
                //div by 55
                if(isdiv55(i)){
                    System.out.println(i +" Animate this!");
                //only div by 5,not 55
                }else{
                    System.out.println(i +" Vidal");
                }
                //number cant be divided by any of this
            }else{
                System.out.println(i +" not divisible by any");
            }
        }
        
    }
    //all my methods
    static boolean isDavis(int input){
        return (input % 2 == 0);   
}
    static boolean isClaughton(int input){
        return (input % 3 == 0);
        
    }
    static boolean isVidal(int input){
        return (input % 5 == 0);
    }
    static boolean isdiv22(int input){
        return (input % 22 == 0);
    }
    static boolean isdiv33(int input){
        return (input % 33 == 0);
    }
    static boolean isdiv55(int input){
        return (input % 55 == 0);
    }
    
    
    
}
