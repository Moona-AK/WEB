/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2ACSI.WEB.Projet.entity;
/**
 *
 * @author Mouna
 */
public class Professionnel {
    String nom;
    String prenom;
    
    public Professionnel(String n, String p, Adresse a){
        nom=n;
        prenom=p;
    }
    
    
    public void changerEtatDemande(Demande d, Action a){
        
        
        /*
        Un changement d’état de la demande est eﬀectué par une personne, 
        qui doit préciser les informations suivantes: • id de l’action 
        • nom de l’action (étude, approbation, refus, création d’une commande de réparation,…)
        • personne en charge de l’action et/ou entreprise chargée de la réparation
        • état de l'action (en cours/terminée) • date d'exécution de l'action
        */
    }
}