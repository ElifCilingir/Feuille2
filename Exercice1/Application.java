package Exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        De d1 = new De();
        De d2 = new De();
        boolean winner = false;
        int nbLancer;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nombre de lancer : ");
        try{
            nbLancer = sc.nextInt();
            for(int i = 0; i < nbLancer; i++){
                System.out.println("de 1 :");
                d1.lancer();
                System.out.println("de 2 :");
                d2.lancer();

                if(d1.equals(d2)){
                    System.out.println("Gagner");
                }else{
                    System.out.println("Perdu");
                }
            }

        }catch (InputMismatchException e) {
            System.out.println("La valeur saisie n'est pas un entier");
        }


    }



}
