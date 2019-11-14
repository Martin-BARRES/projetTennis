/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *Arbitre est une classe il annonce ses prises de décisions
 * Il a de nombreuses caractéristiques
 * @author ISEN
 */
public class Arbitre extends Personne {
    
    /**
     * Constructeur de l'Arbitre
     * @param nomNaissance sous forme de string
     * @param prenom sous forme de string
     * @param surnom sous forme de string
     * @param dateNaissance sous forme de string
     * @param lieuNaissance sous forme de string
     * @param dateDeces sous forme de string
     * @param nationalite sous forme de string
     * @param genre sous forme de string
     * @param taille sous forme de int
     * @param poids  sous forme de int
     */
    public Arbitre(String nomNaissance, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids) {
        super(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids);
    }
    
    
    
    /**
     * Permet d'annoncer un message de l'arbitre
     * @param message sous forme de string
     */
    public void annoncer(String message) {
        System.out.println("Arbitre : " + message);
    }
    
    /**
     * Permet d'annoncer un message de l'arbitre
     * @param message  sous forme de int
     */
    public void annoncer(int message) {
        System.out.println("Arbitre : " + message);
    }
}
