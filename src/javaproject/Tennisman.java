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
abstract class Tennisman extends Personne {
    private final String main;
    private String sponsor;
    private int classement;
    private String entraineur;
    
    
    public Tennisman(String main, String sponsor, int classement, String entraineur, String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids) {
        super(nomNaissance, nomCourant, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.main = main;
        this.sponsor = sponsor;
        this.classement = classement;
        this.entraineur = entraineur;
        
    }
    
    public String getMain() {
        return main;
    }
    
    public String getSponsor() {
        return sponsor;
    }
    
    public int getClassement() {
        return classement;
    }
    
    public String getEntraineur(){
        return entraineur;
    }
    
    public void setClassement(int rang){
        this.classement = rang;
    }
    
    public void setEntraineur(String trainer){
        this.entraineur = trainer;
    }
    
    public void setSponsor(String marque){
        this.sponsor = marque;
    }
}
