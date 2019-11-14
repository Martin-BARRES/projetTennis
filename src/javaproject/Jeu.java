/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *Jeu est une classe qui joue le jeu entre 2 joueurs ou joueuses
 * <p>
 * Un jeu est caractérisé par :
 * Des joueurs et joueuses qui ne changeront pas dans le jeu
 * Un serveur/ serveuse qui ne changeront pas dans le jeu
 * Le nombre de points des Joueurs/ Joueuses
 * Le gagnant du jeu qui sera modifié
 * Les points du tiebreaks qui seront susceptible d'être modifié
 * Un arbitre qui ne changera pas lors du jeu
 * @see Set#jouerSet(tennis.Joueur, tennis.Joueur, boolean, boolean) 
 * @see Set#jouerSet(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
 * @author ISEN
 */
public class Jeu {
    /**
     * Un arbitre est un arbitre
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private final Arbitre arbitre;
    
    /**
     * joueur1 sous forme de Joueur
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#getJoueur1() 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueur, tennis.Joueur) 
     */
    private Joueur joueur1 = null;
    
    /**
     * joueur2 sous forme de Joueur
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#getJoueur2() 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueur, tennis.Joueur) 
     */
    private Joueur joueur2 = null;
    
    /**
     * serveur sous forme de Joueur
     * @see Jeu#Jeu(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#getServeur() 
     * @see Jeu#setServeur(tennis.Joueur) 
     */
    private Joueur serveur;
    
    /**
     * pointsJoueur1 en integer
     * @see Jeu#getJeuxJoueur1() 
     * @see Jeu#incrementerScore(tennis.Joueur, tennis.Joueur, int, boolean) 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueur, tennis.Joueur) 
     */
    private int pointsJoueur1 = 0;
    
    /**
     * pointsJoueur2 en integer
     * @see Jeu#incrementerScore(tennis.Joueur, tennis.Joueur, int, boolean) 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueur, tennis.Joueur) 
     * @see Jeu#getJeuxJoueur2() 
     */
    private int pointsJoueur2 = 0;
    
    /**
     * Donne le gagnant du jeu sous forme de joueur
     * @see Jeu#getGagnantJeu() 
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     */
    private Joueur gagnantJeu;
    
    /**
     * Joueuse1 sous forme de Joueuse
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean)
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#getJoueuse1()
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private Joueuse joueuse1 = null;
    
    /**
     * joueuse2 sous forme de Joueuse
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Jeu#Jeu(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private Joueuse joueuse2 = null;
    
    /**
     * serveuse sous forme de Joueuse
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#getServeuse() 
     * @see Jeu#setServeuse(tennis.Joueuse) 
     */
    private Joueuse serveuse;
    
    /**
     * pointsJoueuse1 en integer
     * @see Jeu#incrementerScore(tennis.Joueuse, tennis.Joueuse, int, boolean)  
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueuse, tennis.Joueuse) 
     * @see Jeu#getJeuxJoueuse1() 
     */
    private int pointsJoueuse1 = 0;
    
    /**
     * * pointsJoueuse2 en integer
     * @see Jeu#incrementerScore(tennis.Joueuse, tennis.Joueuse, int, boolean) 
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#printJeu(tennis.Joueuse, tennis.Joueuse) 
     * @see Jeu#getJeuxJoueuse2() 
     */
    private int pointsJoueuse2 = 0;
    
    /**
     * Donne la gagnante jeu sous forme de joueur
     * @see Jeu#getGagnanteJeu() 
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     */
    private Joueuse gagnanteJeu;
    
    /**
     * Donne le nombre de points du tieBreak
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean)
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     */
    private int ptsTieBreakJ1 = 0;
    
    /**
     * Donne le nombre de points du tieBreak
     * @see Jeu#jouerJeu(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerJeu(tennis.Joueuse, tennis.Joueuse, boolean, boolean)
     * @see Jeu#jouerTieBreak(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Jeu#jouerTieBreak(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     */
    private int ptsTieBreakJ2 = 0;
    
    /**
     * Constructeur du jeu
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sour forme de Joueur
     * @param serveur sous forme de Joueur
     * @param arbitre sous forme d'Arbitre
     */
    public Jeu(Joueur joueur1, Joueur joueur2, Joueur serveur, Arbitre arbitre) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.serveur = serveur;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur du jeu
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param arbitre sous forme d'arbitre
     */
    public Jeu(Joueur joueur1, Joueur joueur2, Arbitre arbitre) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur du jeu
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param serveuse sous forme de Joueuse
     * @param arbitre sous forme d'abitre
     */
    public Jeu(Joueuse joueuse1, Joueuse joueuse2, Joueuse serveuse, Arbitre arbitre) {
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.serveuse = serveuse;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur du jeu
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param arbitre sous forme d'arbitre
     */
    public Jeu(Joueuse joueuse1, Joueuse joueuse2, Arbitre arbitre) {
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.arbitre = arbitre;
    }
    
    /**
     * Définit le serveur 
     * @param serveur sous forme de Joueur
     */
    public void setServeur(Joueur serveur) {
        this.serveur = serveur;
    }
    
    /**
     * définit la serveuse
     * @param serveuse sous forme de Joueuse
     */
    public void setServeuse(Joueuse serveuse) {
        this.serveuse = serveuse;
    }
    
    /**
     * Retourne le joueur1
     * @return sous forme de Joueur
     */
    public Joueur getJoueur1() {
        return joueur1;
    }
    
    /**
     * Retourne la joueuse1
     * @return sous forme de Joueuse
     */
    public Joueuse getJoueuse1() {
        return joueuse1;
    }
    
    /**
     * Retourne le joueur2
     * @return sous forme de Joueur
     */
    public Joueur getJoueur2() {
        return joueur2;
    }
    
    /**
     * Retourne la joueuse2
     * @return sous forme de Joueuse
     */
    public Joueuse getJoueuse2() {
        return joueuse2;
    }
    
    /**
     * Retourne le serveur
     * @return sous forme de Joueur
     */
    public Joueur getServeur() {
        return serveur;
    }
    
    /**
     * Retourne la serveuse
     * @return sous forme de Joueuse
     */
    public Joueuse getServeuse() {
        return serveuse;
    }
    
    /**
     * Retourne le nombre de points du joueur1
     * @return sous forme d'integer
     */
    public int getJeuxJoueur1() {
        return pointsJoueur1;
    }
    
    /**
     * Retourne le nombre de points de la joueuse2
     * @return sous forme d'integer
     */
    public int getJeuxJoueuse1() {
        return pointsJoueuse1;
    }
    
    /**
     * Retourne le nombre de points du joueur2
     * @return sous forme d'integer
     */
    public int getJeuxJoueur2() {
        return pointsJoueur2;
    }
    
    /**
     * Retourne le nombre de points de la joueuse2
     * @return sous forme d'integer
     */
    public int getJeuxJoueuse2() {
        return pointsJoueuse2;
    }
    
    /**
     * Retourne le gagnant du jeu
     * @return sous forme de Joueur
     */
    public Joueur getGagnantJeu() {
        return gagnantJeu;
    }
    
    /**
     * retourne la gagnante du jeu
     * @return sous forme de Joueuse
     */
    public Joueuse getGagnanteJeu() {
        return gagnanteJeu;
    }
    
    /**
     * Convertit le score de [0-5] en point tennis [0 15 30 40 AV]
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param numeroJoueur sous forme d'integer
     * @param afficherDetails sous forme de boolean
     */
    public void incrementerScore(Joueur joueur1, Joueur joueur2, int numeroJoueur, boolean afficherDetails) {
        /* Points :
            0   -> 0
            15  -> 1
            30  -> 2
            40  -> 3
            AV  -> 4
            Jeu -> 5
        */
        
        if(numeroJoueur == 1) {
            //avantage
            if(this.pointsJoueur1 == 3 && this.pointsJoueur2 == 3) {
                this.pointsJoueur1 = 4;
            }

            else if(this.pointsJoueur1 == 3 && this.pointsJoueur2 == 4) {
                this.pointsJoueur1 = 3;
                this.pointsJoueur2 = 3;
            }
            //normal
            else if(this.pointsJoueur1 == 3 && this.pointsJoueur2 < 3) {
                this.pointsJoueur1 = 5;
            }
            
            else {
                this.pointsJoueur1++;
            }
            
        } else {
            //avantage
            if(this.pointsJoueur2 == 3 && this.pointsJoueur1 == 3) {
                this.pointsJoueur2 = 4;
            }

            else if(this.pointsJoueur2 == 3 && this.pointsJoueur1 == 4) {
                this.pointsJoueur2 = 3;
                pointsJoueur1 = 3;
            }
            //normal
            else if(this.pointsJoueur2 == 3 && this.pointsJoueur1 < 3) {
                this.pointsJoueur2 = 5;
            }
            
            else {
                this.pointsJoueur2++;
            }
        }
        
        if(this.pointsJoueur1 < 5 && this.pointsJoueur2 < 5) {
            if(afficherDetails == true) {
                printJeu(joueur1, joueur2);
            }
        } else { 
            return;
            /*this.pointsJoueur1 = 0;
            this.pointsJoueur2 = 0;*/
        }
    }
    
    /**
     * Permet d'augmenter les scores des deux joueurs de [0-5]
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param numeroJoueuse sous forme d'integer
     * @param afficherDetails sous forme de boolean
     */
    public void incrementerScore(Joueuse joueuse1, Joueuse joueuse2, int numeroJoueuse, boolean afficherDetails) {
        /* Points :
            0   -> 0
            15  -> 1
            30  -> 2
            40  -> 3
            AV  -> 4
            Jeu -> 5
        */
        
        if(numeroJoueuse == 1) {
            //avantage
            if(this.pointsJoueuse1 == 3 && this.pointsJoueuse2 == 3) {
                this.pointsJoueuse1 = 4;
            }

            else if(this.pointsJoueuse1 == 3 && this.pointsJoueuse2 == 4) {
                this.pointsJoueuse1 = 3;
                this.pointsJoueuse2 = 3;
            }
            //normal
            else if(this.pointsJoueuse1 == 3 && this.pointsJoueuse2 < 3) {
                this.pointsJoueuse1 = 5;
            }
            
            else {
                this.pointsJoueuse1++;
            }
            
        } else {
            //avantage
            if(this.pointsJoueuse2 == 3 && this.pointsJoueuse1 == 3) {
                this.pointsJoueuse2 = 4;
            }

            else if(this.pointsJoueuse2 == 3 && this.pointsJoueuse1 == 4) {
                this.pointsJoueuse2 = 3;
                pointsJoueuse1 = 3;
            }
            //normal
            else if(this.pointsJoueuse2 == 3 && this.pointsJoueuse1 < 3) {
                this.pointsJoueuse2 = 5;
            }
            
            else {
                this.pointsJoueuse2++;
            }
        }
        
        if(this.pointsJoueuse1 < 5 && this.pointsJoueuse2 < 5) {
            if(afficherDetails == true) {
                printJeu(joueuse1, joueuse2);
            }
        } else { 
            return;
            /*this.pointsJoueuse1 = 0;
            this.pointsJoueuse2 = 0;*/
        }
    }
    
    /**
     * Réalise le déroulement du jeu pour les Hommes en faisant appel :
     * - l'incrementation du score
     * - au tieBreak
     * - annonce l'évolution du score
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueuse
     * @param mode sous forme de boolean
     * @param afficherDetails sous forme de boolean
     */
    public void jouerJeu(Joueur joueur1, Joueur joueur2, boolean mode, boolean afficherDetails) {
        Echange echange = new Echange(joueur1, joueur2, serveur, arbitre);
        
        while(true) {
            
            // true -> manuel
            // false -> auto
            if(mode == true) {
                echange.jouerEchange(this.joueur1, this.joueur2);
            } else {
                echange.jouerEchangeAuto(this.joueur1, this.joueur2, afficherDetails);
            }
            
            if(echange.getGagnantEchange() == this.joueur1) {
                this.incrementerScore(this.joueur1, this.joueur2, 1, afficherDetails);
            } else {
                this.incrementerScore(this.joueur1, this.joueur2, 2, afficherDetails);
            }
            
            if(this.pointsJoueur1 == 5) {
                this.gagnantJeu = this.joueur1;
                
                if(afficherDetails == true) {
                    this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnantJeu.getPrenom() + " " + this.gagnantJeu.getNomNaissance() + "\n");
                }
                
                return;
            }
            
            else if(this.pointsJoueur2 == 5) {
                this.gagnantJeu = this.joueur2;
                
                if(afficherDetails == true) {
                    this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnantJeu.getPrenom() + " " + this.gagnantJeu.getNomNaissance() + "\n");
                }
                
                return;
            }    
        }
    }
    
    /**
     * Réalise le déroulement du jeu pour les Femmes en faisant appel :
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param mode sous forme de boolean 
     * @param afficherDetails sous forme de boolean
     */
    public void jouerJeu(Joueuse joueuse1, Joueuse joueuse2, boolean mode, boolean afficherDetails) {
        Echange echange = new Echange(joueuse1, joueuse2, serveuse, arbitre);
        
        while(true) {
            
            // true -> manuel
            // false -> auto
            if(mode == true) {
                echange.jouerEchange(this.joueuse1, this.joueuse2);
            } else {
                echange.jouerEchangeAuto(this.joueuse1, this.joueuse2, afficherDetails);
            }
            
            if(echange.getGagnanteEchange() == this.joueuse1) {
                this.incrementerScore(this.joueuse1, this.joueuse2, 1, afficherDetails);
            } else {
                this.incrementerScore(this.joueuse1, this.joueuse2, 2, afficherDetails);
            }
            
            if(this.pointsJoueuse1 == 5) {
                this.gagnanteJeu = this.joueuse1;
                
                if(afficherDetails == true) {
                    this.arbitre.annoncer("La gagnante du jeu est : " + this.gagnanteJeu.getPrenom() + " " + this.gagnanteJeu.getNomNaissance() + "\n");
                }
                
                return;
            }
            
            else if(this.pointsJoueuse2 == 5) {
                this.gagnanteJeu = this.joueuse2;
                
                if(afficherDetails == true) {
                    this.arbitre.annoncer("La gagnante du jeu est : " + this.gagnanteJeu.getPrenom() + " " + this.gagnanteJeu.getNomNaissance() + "\n");
                }
                
                return;
            }    
        }
    }    
    
    /**
     * Permet de gérer le déroulement du tieBreak
     * -compte les points
     * -annonce les scores et annonce la gagnant
     * @param joueur1 sous forme de de Joueur
     * @param joueur2 sous forme de Joueur
     * @param mode sous forme de boolean
     * @param afficherDetails sous forme de boolean
     */
    public void jouerTieBreak(Joueur joueur1, Joueur joueur2, boolean mode, boolean afficherDetails){
        Echange echange = new Echange(joueur1, joueur2, serveur, arbitre);
        
        while(true) {
            //Changement de joueur qu'une fois 
            if((ptsTieBreakJ1+ptsTieBreakJ2) == 0){
                if (joueur1.equals(serveur) == true){
                    echange.setServeur(joueur2); 
                    this.serveur = this.joueur2;
                }  
                else {
                    echange.setServeur(joueur1);
                    serveur = joueur1;
                }
            }
            
            if(mode == true) {
                echange.jouerEchange(this.joueur1, this.joueur2);
            } else {
                echange.jouerEchangeAuto(this.joueur1, this.joueur2, afficherDetails);
            }
            
            if(echange.getGagnantEchange() == joueur1) {
                incrementerScoreTieBreak(joueur1, joueur2, 1, afficherDetails);
            } else {
                incrementerScoreTieBreak(joueur1, joueur2, 2, afficherDetails);
            }
            
            //Changement de joueur qu'une fois 
            if((ptsTieBreakJ1+ptsTieBreakJ2) == 1){
                if (joueur1.equals(serveur) == true){
                    echange.setServeur(joueur2); 
                    this.serveur = this.joueur2;
                }  
                else {
                    echange.setServeur(joueur1);
                    this.serveur = this.joueur1;
                }
            }
            //On change de serveurs quand le nombre de points est impaire
            if((ptsTieBreakJ1+ptsTieBreakJ2)%2 == 1 && (ptsTieBreakJ1+ptsTieBreakJ2) >1){
                if (joueur1.getNomNaissance().equals(serveur.getNomNaissance()) == true){
                    echange.setServeur(joueur2);
                    this.serveur = this.joueur2;
                }
                else {
                    echange.setServeur(joueur1);
                    this.serveur = this.joueur1;
                }
            
            }
            
            
            if(ptsTieBreakJ1 >= 7) {
                if (ptsTieBreakJ2 < (ptsTieBreakJ1-1)){
                    this.gagnantJeu = this.joueur1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnantJeu.getPrenom() + " " + this.gagnantJeu.getNomNaissance() + "\n");
                    }
                    
                    return;
                }
            }
            
            else if(ptsTieBreakJ2 >= 7) {
                    if(ptsTieBreakJ1 < (ptsTieBreakJ2-1)){
                        this.gagnantJeu = this.joueur2;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnantJeu.getPrenom() + " " + this.gagnantJeu.getNomNaissance() + "\n");
                        }
                        
                        return;
                }
            } 
        }  
    }
    
    /**
     * Gère le déroulement du TieBreak
     * -Annonce et contrôle les scores
     * -Annonce le gagnant
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param mode sous forme de boolean
     * @param afficherDetails sous forme de boolean
     */
    public void jouerTieBreak(Joueuse joueuse1, Joueuse joueuse2, boolean mode, boolean afficherDetails){
        Echange echange = new Echange(joueuse1, joueuse2, serveuse, arbitre);
        
        while(true) {
            //Changement de joueuse qu'une fois 
            if((ptsTieBreakJ1+ptsTieBreakJ2) == 0){
                if (joueuse1.equals(serveuse) == true){
                    echange.setServeuse(joueuse2); 
                    this.serveuse = this.joueuse2;
                }  
                else {
                    echange.setServeuse(joueuse1);
                    serveuse = joueuse1;
                }
            }
            
            if(mode == true) {
                echange.jouerEchange(this.joueuse1, this.joueuse2);
            } else {
                echange.jouerEchangeAuto(this.joueuse1, this.joueuse2, afficherDetails);
            }
            
            if(echange.getGagnanteEchange() == joueuse1) {
                incrementerScoreTieBreak(joueuse1, joueuse2, 1, afficherDetails);
            } else {
                incrementerScoreTieBreak(joueuse1, joueuse2, 2, afficherDetails);
            }
            
            //Changement de joueuse qu'une fois 
            if((ptsTieBreakJ1+ptsTieBreakJ2) == 1){
                if (joueuse1.equals(serveuse) == true){
                    echange.setServeuse(joueuse2); 
                    this.serveuse = this.joueuse2;
                }  
                else {
                    echange.setServeuse(joueuse1);
                    this.serveuse = this.joueuse1;
                }
            }
            //On change de serveuses quand le nombre de points est impaire
            if((ptsTieBreakJ1+ptsTieBreakJ2)%2 == 1 && (ptsTieBreakJ1+ptsTieBreakJ2) >1){
                if (joueuse1.getNomNaissance().equals(serveuse.getNomNaissance()) == true){
                    echange.setServeuse(joueuse2);
                    this.serveuse = this.joueuse2;
                }
                else {
                    echange.setServeuse(joueuse1);
                    this.serveuse = this.joueuse1;
                }
            
            }
            
            
            if(ptsTieBreakJ1 >= 7) {
                if (ptsTieBreakJ2 < (ptsTieBreakJ1-1)){
                    this.gagnanteJeu = this.joueuse1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnanteJeu.getPrenom() + " " + this.gagnanteJeu.getNomNaissance() + "\n");
                    }
                    
                    return;
                }
            }
            
            else if(ptsTieBreakJ2 >= 7) {
                    if(ptsTieBreakJ1 < (ptsTieBreakJ2-1)){
                        this.gagnanteJeu = this.joueuse2;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("Le gagnant du jeu est : " + this.gagnanteJeu.getPrenom() + " " + this.gagnanteJeu.getNomNaissance() + "\n");
                        }
                        
                        return;
                }
            } 
        }  
    }
    
    /**
     * Permet d'augmenter les points des joueuses
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param numeroJoueuse sous forme d'integer
     * @param afficherDetails sous forme de boolean
     */
    public void incrementerScoreTieBreak(Joueuse joueuse1, Joueuse joueuse2, int numeroJoueuse, boolean afficherDetails) {
        if(numeroJoueuse == 1) {       
            //normal
            this.ptsTieBreakJ1++;
        } else {
            this.ptsTieBreakJ2++;
        }
        
        if(afficherDetails == true) {
            this.arbitre.annoncer("Il y a  : " + this.joueuse1.getNomNaissance() + " " + this.ptsTieBreakJ1 + " - " + this.ptsTieBreakJ2 + " " + this.joueuse2.getNomNaissance());
        }
    }
    
    /**
     * Permet d'augementer les scores des joueurs lors du TieBreak
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param numeroJoueur sous forme d'integer
     * @param afficherDetails sous forme de boolean
     */
    public void incrementerScoreTieBreak(Joueur joueur1, Joueur joueur2, int numeroJoueur, boolean afficherDetails) {
        if(numeroJoueur == 1) {       
            //normal
            this.ptsTieBreakJ1++;
        } else {
            this.ptsTieBreakJ2++;
        }
        
        if(afficherDetails == true) {
            this.arbitre.annoncer("Il y a  : " + joueur1.getNomNaissance() + " " + this.ptsTieBreakJ1 + " - " + this.ptsTieBreakJ2 + " " +joueur2.getNomNaissance());
        }
    }
    
    /**
     * Convertit le score de [0-5] en point tennis [0 15 30 40 AV] et l'annonce
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     */
    public void printJeu(Joueur joueur1, Joueur joueur2){
        String PointsJoueur1Tennis = "";
        String PointsJoueur2Tennis = "";
        
        switch(this.pointsJoueur1){
            case 0:
                PointsJoueur1Tennis = "0";
                break;
            
            case 1:
                PointsJoueur1Tennis = "15";
                break;
                
            case 2:
                PointsJoueur1Tennis = "30";
                break;
                
            case 3:
                PointsJoueur1Tennis = "40";
                break;
            
            case 4:
                PointsJoueur1Tennis = "AV";
                break;
        }
        
        switch(this.pointsJoueur2){
            case 0:
                PointsJoueur2Tennis = "0";
                break;
            
            case 1:
                PointsJoueur2Tennis = "15";
                break;
                
            case 2:
                PointsJoueur2Tennis = "30";
                break;
                
            case 3:
                PointsJoueur2Tennis = "40";
                break;
            
            case 4:
                PointsJoueur2Tennis = "AV";
                break;
        }
        
        
        this.arbitre.annoncer("Il y a : " + this.joueur1.getNomNaissance() + " " + PointsJoueur1Tennis + " - " + PointsJoueur2Tennis + " " + this.joueur2.getNomNaissance() + "\n");
       
    }
    
    /**
     * Convertit le score de [0-5] en point tennis [0 15 30 40 AV] et l'annonce
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     */
    public void printJeu(Joueuse joueuse1, Joueuse joueuse2){
        String PointsJoueuse1Tennis = "";
        String PointsJoueuse2Tennis = "";
        
        switch(this.pointsJoueuse1){
            case 0:
                PointsJoueuse1Tennis = "0";
                break;
            
            case 1:
                PointsJoueuse1Tennis = "15";
                break;
                
            case 2:
                PointsJoueuse1Tennis = "30";
                break;
                
            case 3:
                PointsJoueuse1Tennis = "40";
                break;
            
            case 4:
                PointsJoueuse1Tennis = "AV";
                break;
        }
        
        switch(this.pointsJoueuse2){
            case 0:
                PointsJoueuse2Tennis = "0";
                break;
            
            case 1:
                PointsJoueuse2Tennis = "15";
                break;
                
            case 2:
                PointsJoueuse2Tennis = "30";
                break;
                
            case 3:
                PointsJoueuse2Tennis = "40";
                break;
            
            case 4:
                PointsJoueuse2Tennis = "AV";
                break;
        }
        
        
        this.arbitre.annoncer("Il y a : " + joueuse1.getNomNaissance() + " " + PointsJoueuse1Tennis + " - " + PointsJoueuse2Tennis + " " + joueuse2.getNomNaissance() + "\n");
       
    }
}
