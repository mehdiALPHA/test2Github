/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listrevision;


public class Listrevision {

  
    public static void main(String[] args) {
        
        Etudiant e1=new Etudiant(5,"nehdi","mhedhbi");
         Etudiant e2=new Etudiant(4,"amine","temani");
          Etudiant e3=new Etudiant(2,"achraf","khemir");
         Etudiant e4=new Etudiant(10,"wael","rjabb");
          Etudiant e5=new Etudiant(1,"fatma","mhedhbi");
         
       //  System.out.println(e1.equals(e2));
       // System.out.println(e1.toString());
        // System.out.println(e1.getId());
        // e1.setId(10);
        // System.out.println(e1.getId());
         EspritArrayList l1 = new  EspritArrayList();
         l1.ajouterEtudiant(e1);
         l1.ajouterEtudiant(e2);
         l1.ajouterEtudiant(e3);
         l1.ajouterEtudiant(e4);
         
       //  System.out.println(l1.rechercherEtudiant(e4));
         
         // System.out.println(l1.rechercherEtudiant("nehdi"));
      //  l1.supprimerEtudiant(e3);

         l1.displayEtudiants();
        l1.trierEtudiantsParId();
       //  l1.displayEtudiants();
      //  l1.trierEtudiantsParNom();
         l1.displayEtudiants();
         
    }
    
}
