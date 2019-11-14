/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 Tennisman est une classe mère caractérisé par :
 * <p>
 * -nomNaissance, nomCourant,prenom, surnom, dateNaissance,lieuNaissance,dateDeces,nationalite, genre, taille, poids
 * @author ISEN
 */
abstract class Tennisman extends Personne {
    
    /**
     * La main préférée est droite ou gauche
     * @see Joueur#getMain() Sous forme de String
     * @see Joueur#Joueur(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private final String main;
    /**
     * Le joueur possède un sponsor sous forme de String
     * @see Joueur#getSponsor() 
     * @see Joueur#Joueur(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private String sponsor;
    /**
     * Le joueur a un classement en int
     * @see Joueur#getClassement() 
     * @see Joueur#Joueur(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private int classement;
    /**
     * Le joueur a un entraineur sous forme de string
     * @see Joueur#getEntraineur() 
     * @see Joueur#Joueur(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private String entraineur;
    
    /**
     * Construteur du tennisman
     * @param main sous forme de String
     * @param sponsor sous forme de String
     * @param classement sous forme de int
     * @param entraineur sous forme de String
     * @param nomNaissance sous forme de String
     * @param prenom sous forme de String
     * @param surnom sous forme de String
     * @param dateNaissance sous forme de String
     * @param lieuNaissance sous forme de String
     * @param dateDeces sous forme de String
     * @param nationalite sous forme de String
     * @param genre sous forme de String
     * @param taille sous forme de int
     * @param poids  sous forme de float
     */
    public Tennisman(String main, String sponsor, int classement, String entraineur, String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids) {
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.main = main;
        this.sponsor = sponsor;
        this.classement = classement;
        this.entraineur = entraineur;
        
    }
    /**
    * Retourne la main préférée du tennisman
    * @return sous forme de String
    */
    public String getMain() {
        return main;
    }
    /**
     * Retourne le sponsor du tennisman
     * @return sous forme de String
     */
    public String getSponsor() {
        return sponsor;
    }
    /**
     * Retourne le classement du tennisman
     * @return sous forme de int 
     */
    public int getClassement() {
        return classement;
    }
    /**
     * Retourne l'entraineur du tennisman
     * @return sous forme de String 
     */
    public String getEntraineur(){
        return entraineur;
    }
    /**
     * Définit le classement du tennisman
     * @param classement sous forme de int
     */
    public void setClassement(int rang){
        this.classement = rang;
    }
    /**
     * Définit l'entraineur du tennisman
     * @param entraineur sous forme de String 
     */
    public void setEntraineur(String trainer){
        this.entraineur = trainer;
    }
    /**
     * Définit le sponsor du tennisman
     * @param sponsor sous forme de String 
     */
    public void setSponsor(String marque){
        this.sponsor = marque;
    }
}
