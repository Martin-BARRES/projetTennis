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
public class Joueuse extends Tennisman{
    private String couleurJupe;
    
    public Joueuse(String main, String sponsor, int classement, String entraineur, String couleurJupe, String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids){
        
        super(main, sponsor, classement, entraineur, nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.couleurJupe = couleurJupe;
    }
    
    public String getCouleurJupe(){
        return this.couleurJupe;
    }
    
    public void setCouleurJupe(String couleur){
        this.couleurJupe = couleur;
    }
}
