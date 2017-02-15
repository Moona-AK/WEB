/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2ACSI.WEB.Projet.entity;

import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Mouna
 */
public class Demande {
    @Id
    @GeneratedValue
        int idDemande;
    
        String nom;
        String prenom;
        String adresse; //ou Adresse ad
        ArrayList<Etat> etats = new ArrayList<Etat>();
        ArrayList<EvolutionDemande> evolution = new ArrayList<EvolutionDemande>();
    
        public Demande(String n, String p, String ad){
            nom = n;
            prenom = p;
            adresse = ad;
            etats.add(Etat.Debut); 
        }
}