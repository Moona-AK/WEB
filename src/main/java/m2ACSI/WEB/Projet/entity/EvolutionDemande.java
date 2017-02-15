/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2ACSI.WEB.Projet.entity;

import java.util.Date;




/**
 *
 * @author Mouna
 */
public class EvolutionDemande {
    int id;
    Professionnel p;
    Demande d;
    Action a;
    Date date;

    public EvolutionDemande(Professionnel p, Demande d, Action a, Date date) {
        this.p = p;
        this.d = d;
        this.a = a;
        this.date = date;
    }
  
}
