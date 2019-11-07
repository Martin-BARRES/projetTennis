/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Random;
import java.util.Scanner;

/**
 *Echange est une classe représentant le service puis l'échange d'un point entre 2 joueurs de tennis
 * <p>
 * Un échange est caractérisé par les informations suivantes :
 * deux joueurs qui ne changeront pas lors du match
 * un serveur qui changera pas dans l'échange et sera soit le joueur1 soit le joueur2
 * un arbitre qui ne changera pas lors du match
 * le nombre de service qui est susceptible de changer
 * le gagnant de l'échange qui est susceptible de changer correspondant soit au joueur1 ou au joueur2
 * 
 * 
 * 
 * @author ISEN
 */
public class Echange {
    
    /**
    * Le serveur est un joueur, il sera modifiable en y entrant joueur1 ou joueur2
    * 
    * @see Echange#Echange(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
    * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
    * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean) 
    * @see Echange#getServeur() 
    * @see Echange#setServeur()
    */
    private Joueur serveur;
    
    /**
     * Le gagnant de l'echange de l'Echange est modifiable, joueur1 ou joueur2
     * 
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean) 
     * @see Echange#setGagnantEchange()
     * @see Echange#getGagnantEchange()
     * @see Echange#contestation(tennis.Joueur, tennis.Joueur, boolean) 
     */
    private Joueur gagnantEchange;
    
    /**
     * Les joueurs de tennis jouant ne sont pas modifiables
     * 
     * @see Echange#Echange(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre)
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean)
     * @see Echange#getJoueur1()
     * @see Echange#contestation(tennis.Joueur, tennis.Joueur, boolean) 
     */
    private Joueur joueur1 = null;
    
    /**
     * Les joueurs de tennis jouant ne sont pas modifiables
     * 
     * @see Echange#Echange(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean) 
     * @see Echange#getJoueur2()
     * @see Echange#contestation(tennis.Joueur, tennis.Joueur, boolean) 
     */
    private Joueur joueur2 = null;
    
    /**
    * Le serveur est une joueuse, il sera modifiable en y entrant joueuse1 ou joueuse2
    * 
    * @see Echange#Echange(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
    * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
    * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean)  
    * @see Echange#getServeuse()  
    * @see Echange#setServeuse(tennis.Joueuse) 
    */
    private Joueuse serveuse;
    
    /**
     * Le gagnant de l'echange de l'Echange est modifiable, joueuse1 ou joueuse2
     * 
     * @see Echange#Echange(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean) 
     * @see Echange#setGagnanteEchange(tennis.Joueuse) 
     * @see Echange#getGagnanteEchange() 
     */
    private Joueuse gagnanteEchange;
    
    /**
     * Les joueuses de tennis jouant ne sont pas modifiables
     * 
     * @see Echange#Echange(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean)  
     * @see Echange#getJoueuse1() 
     * @see Echange#contestation(tennis.Joueuse, tennis.Joueuse, boolean) 
     */
    private Joueuse joueuse1 = null;
    
    /**
     * Les joueuses de tennis jouant ne sont pas modifiables
     * 
     * @see Echange#Echange(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean)  
     * @see Echange#getJoueuse2() 
     * @see Echange#contestation(tennis.Joueuse, tennis.Joueuse, boolean) 
     */
    private Joueuse joueuse2 = null;
    
    /**
     * On compte avec numeroService le nombre de service, il est modifiable
     */
    private int numeroService = 1;
    
    /**
     * Arbitre est une arbitre
     * 
     * @see Echange#Echange(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     */
    private Arbitre arbitre;
    
    /**
     * Constructeur de l'échange
     * @param joueur1
     *          joueur1 est un joueur
     * @param joueur2
     *          joueur2 est un joueur
     * @param serveur
     *          serveur est joueur
     * @param arbitre 
     *          arbitre est une arbitre
     */
    public Echange(Joueur joueur1, Joueur joueur2, Joueur serveur, Arbitre arbitre) {
        this.serveur = serveur;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur des joueuses
     * @param joueuse1
     *          joueuse1 est une joueuse
     * @param joueuse2
     *          joueuse2 est une joueuse
     * @param serveuse
     *          serveuse est une joueuse
     * @param arbitre 
     *          arbitre est une arbitre
     */
    public Echange(Joueuse joueuse1, Joueuse joueuse2, Joueuse serveuse, Arbitre arbitre) {
        this.serveuse = serveuse;
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.arbitre = arbitre;
    }
    
    /**
     * Retourne le serveur
     * @return le serveur sous forme de joueur
     */    
    public Joueur getServeur() {
        return serveur;
    }
    
    /**
     * Retourne la serveuse
     * @return la serveuse sous forme de joueuse
     */
    public Joueuse getServeuse() {
        return serveuse;
    }
    
    /**
     * Retourne le gagnant de l'échange
     * @return le gagnant de l'échange sous forme de joueur
     */
    public Joueur getGagnantEchange() {
        return gagnantEchange;
    }
    
    /**
     * Retourne le gagnant de l'échange
     * @return  sous forme de joueuse
     */
    public Joueuse getGagnanteEchange() {
        return gagnanteEchange;
    }
    
    /**
     * Retourne le joueur1
     * @return sous forme de joueur
     */
    public Joueur getJoueur1() {
        return joueur1;
    }
    
    /**
     * Retourne le joueur2
     * @return sous forme de joueur
     */
    public Joueur getJoueur2() {
        return joueur2;
    }
    
    /**
     * retourne la joueuse1
     * @return souse forme de joueur
     */
    public Joueuse getJoueuse1() {
        return joueuse1;
    }
    
    /**
     * retourne la joueuse 2
     * @return sous forme de joueuse
     */
    public Joueuse getJoueuse2() {
        return joueuse2;
    }
    
    /**
     * Définit le gagnant de l'échange 
     * @param gagnantEchange sous forme de joueur
     */
    public void setGagnantEchange(Joueur gagnantEchange) {
        this.gagnantEchange = gagnantEchange;
    }
    
    /**
     * Définit la gagnante de l'échange
     * @param gagnanteEchange sous de joueuse
     */
    public void setGagnanteEchange(Joueuse gagnanteEchange) {
        this.gagnanteEchange = gagnanteEchange;
    }
    
    /**
     * Définit le serveur
     * @param serveur sous forme de joueur
     */
    public void setServeur(Joueur serveur){
        this.serveur = serveur;
    }
    
    /**
     * Définit la  serveuse
     * @param serveuse sous forme de joueuse
     */
    public void setServeuse(Joueuse serveuse){
        this.serveuse = serveuse;
    }
    
    public void jouerAuto(Joueur joueur1, Joueur joueur2){
        int randomResult;
        
        System.out.println("Service de " + this.serveur.getPrenom() + " " + this.serveur.getNomNaissance());
        
        Random r = new Random();
        randomResult = 1 + r.nextInt(4 - 1);
        
        switch(randomResult) {
                case 1:
                    if(numeroService == 2) {
                        if(this.serveur == this.joueur1) {
                            this.gagnantEchange = this.joueur2;
                        } else {
                            this.gagnantEchange = this.joueur1;
                        }
                        
                        numeroService = 1;
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance() );
                        
                        
                        return;
                    } 
                    else {
                        numeroService++;
                    }
                    break;

                case 2:
                    //nbLet++;
                    break;
                
                case 3:

                    System.out.println("Joueur gagnant de l'échange ? :");
                    System.out.println("1 - " + this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + "\n" + "2 - " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + "\n");
                    
                    
                    int saisie;
                    
                    saisie = 1 + r.nextInt(3 - 1);
                    //saisie = 2;

                    System.out.println(saisie);
                    
                    
                    if(saisie == 1) {
                        this.gagnantEchange = this.joueur1;
                        
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        
                        return;
                    } else {
                        this.gagnantEchange = this.joueur2;
                        
                        
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        
                        return;
                    }
            }
    }
}