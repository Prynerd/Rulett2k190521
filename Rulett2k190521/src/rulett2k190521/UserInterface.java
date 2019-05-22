/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rulett2k190521;

import java.util.*;

/**
 *
 * @author imaginifer
 */
public class UserInterface {
    
    private Casino cs;
    
    public UserInterface(){
        cs=new Casino();
        
    }
    
    public void mainMenu(){
        do {
            String[] mainM={};
            int path=choosePath(mainM,"a főmenüből?");
            switch(path){
                default:
                    break;
            }
            if(exit("a programból")){
                System.out.println("Köszönjük a játékot!");
                break;
            }
        } while (true);
    }
    private int choosePath(String[] choices, String menu){
        boolean correct=false;
        int k=0;
        
        do {            
            for (int i = 0; i < choices.length; i++) {
            System.out.printf("   %-7d%s%n",(i+1),choices[i]);
            }
            System.out.printf("   %-7s%s%n","Más","Kilép");
            Scanner sc = new Scanner(System.in);
            try {
                String s=sc.nextLine();
                k=Integer.parseInt(s);
                if(k<0 && k>=choices.length){
                    correct=true;
                }else{
                    correct=exit(menu);
                    k=0;
                }
            } catch (NumberFormatException e) {
                correct=exit(menu);
                k=0;
            }
        } while (!correct);
        return k;
    }
    
    private boolean exit(String loc){
        Scanner scn=new Scanner(System.in);
        System.out.printf("Kilép %s?  i/n%n",loc);
        String s=scn.nextLine();
        return s.toUpperCase().equals("I");
    }
    
    private void livePlayerMenu(){
        
    }
    
    
}
