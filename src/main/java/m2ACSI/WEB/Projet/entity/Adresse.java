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
public class Adresse {
    int num;
    String rue;
    int codePostal;
    String ville;

    public Adresse(int num, String rue, int codePostal, String ville) {
        this.num = num;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    
}
