/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *La classe s'occupe du déroulement du set qui est joué entre deux joueurs ou joueuses
 * Possède des caractéristiques comme le nombre de Jeux des joueurs, le gagnant du set, le serveur
 * @author ISEN
 */
public class Set {
    
    /**
     * Arbitre est sous forme d'arbitre
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Set#jouerSet(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Set#jouerSet(tennis.Joueuse, tennis.Joueuse, boolean, boolean) 
     */
    private final Arbitre arbitre;
        
    /**
     * joueur1 sous forme de Joueur
     * @see Set#jouerSet(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     */
    private Joueur joueur1 = null;
    
    /**
     * jouer2 sous forme de Joueur
     * @see Set#jouerSet(tennis.Joueur, tennis.Joueur, boolean, boolean) 
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     */
    private Joueur joueur2 = null; 
    
    /**
     * nbJeuxJoueur1 et nbJeuxJoueur2 permet de compter les points des joueurs
     * @see Set#getNbJeuxJoueur1() 
     * @see Set#getNbJeuxJoueur2() 
     */
    private int nbJeuxJoueur1, nbJeuxJoueur2;
    
    /**
     * gagant du su set sous forme de joueur
     * @see Set#getGagnantSet() 
     */
    private Joueur gagnantSet;
    
    /**
     * premier serveur sous forme de Joueur
     * @see Set#Set(tennis.Joueur, tennis.Joueur, tennis.Joueur, tennis.Arbitre) 
     * @see Set#setPremierServeur(tennis.Joueur) 
     */
    private Joueur premierServeur;
    
    /**
     * Joueuse1 sous forme de joueuse
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private Joueuse joueuse1 = null;
    
    /**
     * Joueuse2 sous forme de joueuse
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private Joueuse joueuse2 = null; 
    
    /**
     * Compte le nombre de jeux des joueuses
     * @see Set#getNbJeuxJoueuse1() 
     * @see Set#getNbJeuxJoueuse2() 
     */
    private int nbJeuxJoueuse1, nbJeuxJoueuse2;
    
    /**
     * La gaganante du set sous forme de joueuse
     * @see Set#getGagnanteSet() 
     */
    private Joueuse gagnanteSet;
    /**
     * premiereServeuse sous forme de Joueuse
     * @see Set#setPremiereServeuse(tennis.Joueuse) 
     * @see Set#Set(tennis.Joueuse, tennis.Joueuse, tennis.Joueuse, tennis.Arbitre) 
     */
    private Joueuse premiereServeuse;
    
    /**
     * serveur soous forme de boolean
     */
    private boolean serveur;

    /**
     * Retourne le nombre de jeux du joueur1
     * @return sous forme de int
     */
    public int getNbJeuxJoueur1() {
        return nbJeuxJoueur1;
    }

    /**
     * Retourne le nombre de jeux du joueur2
     * @return sous forme de int
     */
    public int getNbJeuxJoueur2() {
        return nbJeuxJoueur2;
    }

    /**
     * Retourne le nombre de jeux de la joueuse1
     * @return sous forme de int
     */
    public int getNbJeuxJoueuse1() {
        return nbJeuxJoueuse1;
    }

    /**
     * Retourne le nombre de jeux de la joueuse2
     * @return sous forme de int
     */
    public int getNbJeuxJoueuse2() {
        return nbJeuxJoueuse2;
    }
    
    /**
     * Retourne le joueur gagnant du set
     * @return sous forme de joueur
     */
    public Joueur getGagnantSet() {
        return gagnantSet;
    }

    /**
     * Retourne la joueuse gagnant le set
     * @return sous forme de joueuse
     */
    public Joueuse getGagnanteSet() {
        return gagnanteSet;
    }
    
    /**
     * Définit le premierServeur 
     * @param premierServeur sous forme de Joueur
     */
    public void setPremierServeur(Joueur premierServeur) {
        this.premierServeur = premierServeur;
    }
    
    /**
     * Définit de la première serveuse 
     * @param premiereServeuse sous forme de Joueuse
     */
    public void setPremiereServeuse(Joueuse premiereServeuse) {
        this.premiereServeuse = premiereServeuse;
    }

    /**
     * Constructeur du Set
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param arbitre  sous forme de arbitre
     */
    public Set(Joueur joueur1, Joueur joueur2, Arbitre arbitre) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur du set
     * @param joueur1 sous forme de joueur
     * @param joueur2 sous forme de  joueur
     * @param premierServeur sous forme de joueur
     * @param arbitre sous forme de arbitre
     */
    public Set(Joueur joueur1, Joueur joueur2, Joueur premierServeur, Arbitre arbitre) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.premierServeur= premierServeur;
        this.arbitre = arbitre;
        
        if(premierServeur == joueur1) {
            serveur = false;
        } else {
            serveur = true;
        }
    }
    
    /**
     * Constructeur de Set
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param arbitre sous forme de arbitre
     */
    public Set(Joueuse joueuse1, Joueuse joueuse2, Arbitre arbitre) {
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.arbitre = arbitre;
    }
    
    /**
     * Constructeur du Set
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param premiereServeuse sous forme de Joueuse
     * @param arbitre sous forme de arbitre
     */
    public Set(Joueuse joueuse1, Joueuse joueuse2, Joueuse premiereServeuse, Arbitre arbitre) {
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.premiereServeuse = premiereServeuse;
        this.arbitre = arbitre;
        
        if(premiereServeuse == joueuse1) {
            serveur = false;
        } else {
            serveur = true;
        }
    }
    
    /**
     * jouerSet des joueurs déroulement du set :
     * -création du jeu, gère les serveurs, annonce et compte le nombre de jeu pour ainsi faire remporter le Set
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param mode sous forme de boolean
     * @param afficherDetails sous forme de boolean
     */
    public void jouerSet(Joueur joueur1, Joueur joueur2, boolean mode, boolean afficherDetails) {     

        this.nbJeuxJoueur1 = 0;
        this.nbJeuxJoueur2 = 0;
        
        while(true) {
            
            //creer jeu
            Jeu jeu = new Jeu(joueur1, joueur2, arbitre);
            
            if(serveur == false) {
                jeu.setServeur(joueur1);
            } else {
                jeu.setServeur(joueur2);
            }
            serveur = !serveur; //on inverse le serveur pour le prochain tour
            
            jeu.jouerJeu(joueur1, joueur2, mode, afficherDetails);
            
            if(jeu.getGagnantJeu() == joueur1) {
                nbJeuxJoueur1++;
            }
            
            else if (jeu.getGagnantJeu() == joueur2) {
                nbJeuxJoueur2++;
            }
            
            //on vérifie si quelqu'un a gagné le set
            
            // JOUEUR1
            if(nbJeuxJoueur1 == 6) {
                if(nbJeuxJoueur2 < 5) {
                    gagnantSet = joueur1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + joueur1.getNomNaissance() + " " + joueur1.getPrenom() + "\n");
                    }
                    return;
                }
                
                if(nbJeuxJoueur1 == 6) {
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Nous rentrons dans le tiebreak\n");
                    }
                    
                    jeu.jouerTieBreak(joueur1, joueur2, mode, afficherDetails);
                    this.gagnantSet = jeu.getGagnantJeu();
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + gagnantSet.getNomNaissance() + " " + gagnantSet.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            if(nbJeuxJoueur1 == 7) {
                if(nbJeuxJoueur2 < 6) {
                    gagnantSet = joueur1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + joueur1.getNomNaissance() + " " + joueur1.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            // JOUEUR2
            if(nbJeuxJoueur2 == 6) {
                if(nbJeuxJoueur1 < 5) {
                    gagnantSet = joueur2;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + joueur2.getNomNaissance() + " " + joueur2.getPrenom() + "\n");
                    }
                    
                    return;
                }
                
                if(nbJeuxJoueur2 == 6) {
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Nous rentrons dans le tiebreak\n");
                    }
                    
                    jeu.jouerTieBreak(joueur1, joueur2, mode, afficherDetails);
                    this.gagnantSet = jeu.getGagnantJeu();
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + gagnantSet.getNomNaissance() + " " + gagnantSet.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            if(nbJeuxJoueur2 == 7) {
                if(nbJeuxJoueur1 < 6) {
                    gagnantSet = joueur2;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Le gagnant du set est : " + joueur2.getNomNaissance() + " " + joueur2.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            
            if(afficherDetails == true) {
                this.arbitre.annoncer("\t" + joueur1.getNomNaissance() + " - " + this.nbJeuxJoueur1);
                this.arbitre.annoncer("\t" + joueur2.getNomNaissance() + " - " + this.nbJeuxJoueur2 + "\n");
            }

        }
    }
    
    /**
     * jouerSet des joueureuses déroulement du set :
     * -création du jeu, gère les serveuses, annonce et compte le nombre de jeu pour ainsi faire remporter le Set
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param mode sous forme de boolean
     * @param afficherDetails sous forme de boolean
     */
    public void jouerSet(Joueuse joueuse1, Joueuse joueuse2, boolean mode, boolean afficherDetails) {     

        this.nbJeuxJoueuse1 = 0;
        this.nbJeuxJoueuse2 = 0;
        
        while(true) {
            
            //creer jeu
            Jeu jeu = new Jeu(joueuse1, joueuse2, arbitre);
            
            if(serveur == false) {
                jeu.setServeuse(joueuse1);
            } else {
                jeu.setServeuse(joueuse2);
            }
            serveur = !serveur; //on inverse le serveuse pour le prochain tour
            
            jeu.jouerJeu(joueuse1, joueuse2, mode, afficherDetails);
            
            if(jeu.getGagnanteJeu() == joueuse1) {
                nbJeuxJoueuse1++;
            }
            
            else if (jeu.getGagnanteJeu() == joueuse2) {
                nbJeuxJoueuse2++;
            }
            
            //on vérifie si quelqu'un a gagné le set
            
            // JOUEUR1
            if(nbJeuxJoueuse1 == 6) {
                if(nbJeuxJoueuse2 < 5) {
                    gagnanteSet = joueuse1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnante du set est : " + joueuse1.getNomNaissance() + " " + joueuse1.getPrenom() + "\n");
                    }
                    return;
                }
                
                if(nbJeuxJoueuse1 == 6) {
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Nous rentrons dans le tiebreak\n");
                    }
                    
                    jeu.jouerTieBreak(joueuse1, joueuse2, mode, afficherDetails);
                    this.gagnanteSet = jeu.getGagnanteJeu();
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnante du set est : " + gagnanteSet.getNomNaissance() + " " + gagnanteSet.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            if(nbJeuxJoueuse1 == 7) {
                if(nbJeuxJoueuse2 < 6) {
                    gagnanteSet = joueuse1;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnante du set est : " + joueuse1.getNomNaissance() + " " + joueuse1.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            // JOUEUR2
            if(nbJeuxJoueuse2 == 6) {
                if(nbJeuxJoueuse1 < 5) {
                    gagnanteSet = joueuse2;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnante du set est : " + joueuse2.getNomNaissance() + " " + joueuse2.getPrenom() + "\n");
                    }
                    
                    return;
                }
                
                if(nbJeuxJoueuse2 == 6) {
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Nous rentrons dans le tiebreak\n");
                    }
                    
                    jeu.jouerTieBreak(joueuse1, joueuse2, mode, afficherDetails);
                    this.gagnanteSet = jeu.getGagnanteJeu();
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnantd du set est : " + gagnantSet.getNomNaissance() + " " + gagnantSet.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            if(nbJeuxJoueuse2 == 7) {
                if(nbJeuxJoueuse1 < 6) {
                    gagnanteSet = joueuse2;
                    
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("La gagnante du set est : " + joueuse2.getNomNaissance() + " " + joueuse2.getPrenom() + "\n");
                    }
                    
                    return;
                }
            }
            
            
            if(afficherDetails == true) {
                this.arbitre.annoncer("\t" + joueuse1.getNomNaissance() + " - " + this.nbJeuxJoueuse1);
                this.arbitre.annoncer("\t" + joueuse2.getNomNaissance() + " - " + this.nbJeuxJoueuse2 + "\n");
            }

        }
    }
}
