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
            String[] mainM={"Játék","Szimuláció"};
            int path=choosePath(mainM,"a főmenüből?");
            switch(path){
                case 2:
                    
                case 1:
                    livePlayerMain();
                    break;
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
            System.out.printf("   %-20d%s%n",(i+1),choices[i]);
            }
            System.out.printf("   %-20s%s%n","Más","Kilép");
            Scanner sc = new Scanner(System.in);
            try {
                String s=sc.nextLine();
                k=Integer.parseInt(s);
                if(k>0 && k<=choices.length){
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
    
    private void livePlayerMain(){
        boolean enough = false;
        do {            
            String[] liveMain={};
            int path=choosePath(liveMain, "a tétek menüjéből");
            switch(path){
                default:
                    break;
            }
        } while (!enough);
        
    }
    
    private int askSimpleNumber(){
        int k=-1;
        boolean enough=false;
        do {
            System.out.println("Melyik számra tesz? Nem szereplő értékkel kiléphet.");
            Scanner sc = new Scanner(System.in);
            try{
                String s=sc.nextLine();
                k=Integer.parseInt(s);
                if(k>=0 && k<=36){
                    enough=true;
                }else{
                    enough=exit("a számra tételből");
                    k=-1;
                }
                
            }catch(NumberFormatException e){
                enough=exit("a számra tételből");
                k=-1;
            }
        } while (!enough);
        return k;
    }
    private int askStakes(){
        int k=0;
        boolean correct=false;
        do {            
            System.out.println("Mekkora téttel játszik?");
            Scanner sc = new Scanner(System.in);
            try{
                String s=sc.nextLine();
                k=Integer.parseInt(s);
                if(k>0){
                    correct=true;
                }else{
                    System.out.println("Sajnos ekkora téttel nem játszhat!");
                    correct=false;
                }
                
            }catch(NumberFormatException e){
                System.out.println("Sajnos mindenképpen meg kell adnia egy tétet!");
                correct=false;
            } 
        } while (!correct);
        return k;
    }
    
    private int[] askDetails(){
        int minStake=0;
        int maxStake=0;
        int rounds=0;
        int playerStrat=0;
        minStake=askNr("a legkisebb tétet");
        do {            
            maxStake=askNr("a legnagyobb tétet");
            if(minStake>maxStake){
                System.out.println("A lehető legnagyobb nem lehet kisebb a legkisebbnél!");
            }
        } while (minStake>maxStake);
        do{
            rounds=askNr("a játékkörök számát");
            if(rounds<1){
                System.out.println("Legalább egy kört meg kell adnia!");
            }
        }while(rounds<1);
        String[] playerTypes = {};
        playerStrat=choosePath(playerTypes,"");
        int[] data={playerStrat,minStake,maxStake, rounds};
        return data;
    }
    
    private int askNr(String nm){
        int minStake=0;
        boolean correct=false;
        do {
            System.out.printf("Kérem, adja meg %s:%n",nm);
            Scanner sc =new Scanner(System.in);
            try {
                String s = sc.nextLine();
                minStake=Integer.parseInt(s);
                if(minStake<0){
                    minStake=0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy számot!");
                correct=false;
            }
        } while (!correct);
        return minStake;
    }
    
}
