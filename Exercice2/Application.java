package Exercice2;

import java.util.ArrayList;

public class Application implements Cloneable{
    ArrayList<ArrayList<Mark>> listEtudiant = new ArrayList();
    ArrayList<Mark> listMark = new ArrayList();

    public Application() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Application) super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void print(){
        for(ArrayList etud: listEtudiant)
        {
            for(int i=0;i<etud.size();i++)
                System.out.println("["+listEtudiant.indexOf(etud)+"]"+"["+ etud.indexOf(etud.get(i))+"]  ="+etud.get(i) );

        }
    }

    public float average(int position){
        float result = 0;
        int cpt = 0;
        for(int i = 0; i < listEtudiant.size(); i++){
            if(i == position){
                for(int j = 0; j < listEtudiant.get(i).size(); j++){
                    result = result + listMark.get(j).getValue();
                    cpt++;
                }
            }
        }

        result = result / cpt;
        return result;
    }

    public void add(int position, String subject, float value){
        Mark m = new Mark(value, subject);
        for(int i = 0; i < listEtudiant.size(); i++){
            if(i == position){
                listMark.add(m);
            }
        }
    }

    public int compute(){
        int max;
        for(int i = 0; i < listEtudiant.size(); i++){

        }
        return 0;
    }



}
