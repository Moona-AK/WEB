/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2ACSI.WEB.Projet.entity;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Mouna
 */
public class Action {
    @Id
    @GeneratedValue
    int id;
    
    ActionType nom;
    String personneEncharge; //faire classe avec heritage personne et entreprise pr gérer l'action.
    EtatAction etat;
    Date dateDexecution;
    
}
