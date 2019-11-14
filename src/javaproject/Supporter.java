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
abstract class Supporter extends Personne {
    
    private int numeroPlace;
    private float prixPlace;
    private String tribune;
    
    public Supporter(float prix, String tribune, int num_place, String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, int poids){
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
        this.prixPlace = prix;
        this.tribune = tribune;
        this.numeroPlace = num_place;
    }
    
    public int getPlace(){
        return this.numeroPlace;
    }
    
    public float getPrixPlace(){
        return this.prixPlace;
    }
    
    public String getTribune(){
        return this.tribune;
    }
    
    public void setPlace(int num_place) {
        this.numeroPlace = num_place;
    }
    
    public void setPrixPlace(float prix){
        this.prixPlace = prix;
    }
    
    public void setTribune(String tribune){
        this.tribune = tribune;
    }
}
