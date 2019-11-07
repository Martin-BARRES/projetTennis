/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author ISEN
 */
public class Spectateur extends Supporter {
    private String couleurChemise;
    
    public Spectateur(float prix, String tribune, int num_place, String nomCourant, String couleur, String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, int poids){
        super( prix, tribune, num_place, nomCourant, nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.couleurChemise = couleur;
    }
    
    public String getCouleurChemise(){
        return couleurChemise;
    }
    
    public void setCouleurChemise(String couleur){
        this.couleurChemise = couleur;
    }
}
