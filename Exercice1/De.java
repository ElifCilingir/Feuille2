package Exercice1;

import java.util.ArrayList;
import java.util.Random;

public class De {
    int value;
    ArrayList<Integer> valueDe = new ArrayList<Integer>();

    public De(){
        this.value = 1; // valeur par défaut à la création du dé
    }

    public void lancer(){
        setValue(1 + (int)(Math.random() * ((6 - 1) + 1)));
        printValue();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        De de = (De) o;
        return Double.compare(de.value, value) == 0;
    }

    public void printValue(){
        System.out.println(getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
