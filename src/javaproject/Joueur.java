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
public class Joueur extends Tennisman{
    private String couleurShort;
    
    public Joueur(String main, String sponsor, int classement, String entraineur, String couleurShort, String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids) {
        super(main, sponsor, classement, entraineur, nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.couleurShort = couleurShort;
    }
    
    public String getCouleurShort(){
        return couleurShort;
    }
    
    public void setCouleurShort(String couleur){
        this.couleurShort = couleur;
    }
}
