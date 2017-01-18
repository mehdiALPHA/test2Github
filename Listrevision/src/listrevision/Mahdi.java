/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listrevision;

import java.util.Comparator;

/**
 *
 * @author Mehdi
 */
public class Mahdi implements Comparator <Object>
{

    @Override
    public int compare(Object o1, Object o2) {
      
        return ((Etudiant)o1).getNom().compareTo(((Etudiant)o2).getNom());
  
}
    
}
