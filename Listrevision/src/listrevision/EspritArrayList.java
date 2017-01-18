/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listrevision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mehdi
 */
public class EspritArrayList implements University {
    
    List <Etudiant> l1;

    public EspritArrayList() {
        this.l1=new ArrayList<Etudiant>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        
         if (e!=null)
         {
        if (l1.add(e))
            System.out.println("le ajout est fait ");
        else 
            System.out.println("l ajout nest pas fait");
            
      
       }
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        
        return l1.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        
      boolean  test=false ;
        for (int i=0 ;i<l1.size();i++)   
        {
            if(l1.get(i).getNom().equals(nom))
                test=true;
        }
        return test ;

    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        
        if (l1.remove(e))
            System.out.println("remove ids done ");
        else 
         System.out.println("remove is not done  ");
           
    }

    @Override
    public void displayEtudiants() {
        
     String t="";
     
       for(Object o: l1)
       { 
           t+="\n"+((Etudiant)o).toString(); // a chaque  fois je prend une case et je le met dans un object o
       }
        System.out.println(t);
    }

    @Override
    public void trierEtudiantsParId() {
        
        Collections.sort(l1);
      
    }

    @Override
    public void trierEtudiantsParNom() {
       Collections.sort(l1,new Mahdi());
    }
}

    

   