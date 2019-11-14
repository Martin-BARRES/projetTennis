/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *Gère le déroulement du match 
 * possède de nombreuses caractéristiques comme la catégorie du match, le niveau du match, le nombre de point à gagner, le gagnant et le perdant du match
 * 
 * @author ISEN
 */
public class Match {
    
    /**
     * Arbitre sous forme d'arbitre
     * @see Match#getArbitre() 
     * @see Match#Match(tennis.Joueur, tennis.Joueur, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     * @see Match#Match(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private final Arbitre arbitre;
    
    /**
     * joueur1 sous forme de Joueur
     * @see Match#getJoueur1() 
     * @see Match#Match(tennis.Joueur, tennis.Joueur, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private Joueur joueur1 = null;
    /**
     * joueur2 sous forme de Joueur
     * @see Match#getJoueur2() 
     * @see Match#Match(tennis.Joueur, tennis.Joueur, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private Joueur joueur2 = null;
    /**
     * Serveur sous forme de boolean
     */
    private boolean serveur;
    
    /**
     * joueuse1 sous forme de Joueuse
     * @see Match#getJoueuse1() 
     * @see Match#Match(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private Joueuse joueuse1 = null;
    /**
     * joueuse2 sous forme de Joueuse
     * @see Match#getJoueuse2() 
     * @see Match#Match(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private Joueuse joueuse2 = null;
    
    /**
     * gagnant sous forme de Joueur
     * @see Match#getGagnant() 
     * @see Match#setGagnant(tennis.Joueur) 
     */
    private Joueur gagnant;
    /**
     * perdant sous forme de Joueur
     * @see Match#getPerdant() 
     * @see Match#setPerdant(tennis.Joueur) 
     */
    private Joueur perdant;
    
    
    /**
     * gagnante sous forme de Joueuse
     * @see Match#getGagnante() 
     * @see Match#setGagnante(tennis.Joueuse) 
     */
    private Joueuse gagnante;
    /**
     * perdante sous forme de joueuse
     * @see Match#getPerdante() 
     * @see Match#setPerdante(tennis.Joueuse) 
     */
    private Joueuse perdante;
    
    
    /**
     * categorieMatch est un String
     * @see Match#getCategorieMatch() 
     */
    private final String categorieMatch;
    /**
     * niveauMatch sous forme de String
     * @see Match#getNiveauMatch() 
     */
    private final String niveauMatch;
    /**
     * nombrePoint sous forme de int
     * @see Match#getNombrePoint()
     * @see Match#Match(tennis.Joueur, tennis.Joueur, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     * @see Match#Match(tennis.Joueuse, tennis.Joueuse, tennis.Arbitre, java.lang.String, java.lang.String, int) 
     */
    private final int nombrePoint;
    
    /**
     * nbSetsGagnats sous forme de int
     */
    private int nbSetsGagnants;
    /**
     * nbSetsJoueur1/2 sous forme de int
     */
    private int nbSetsJoueur1, nbSetsJoueur2;
    /**
     * nbSetsJoueuse1/2 sous forme de int
     */
    private int nbSetsJoueuse1, nbSetsJoueuse2;
    
    
    /**
     * Constructeur du Match
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param arbitre sous forme de Arbitre
     * @param categorieMatch sous forme de String
     * @param niveauMatch sous forme de String
     * @param nombrePoint  sous forme de int
     */
    public Match(Joueur joueur1, Joueur joueur2, Arbitre arbitre, String categorieMatch, String niveauMatch, int nombrePoint) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.arbitre = arbitre;
        this.categorieMatch = categorieMatch;
        this.niveauMatch = niveauMatch;
        this.nombrePoint = nombrePoint;
    }
    
    /**
     * Constructeur du Match
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param arbitre sous forme de Arbitre
     * @param categorieMatch sous forme de String
     * @param niveauMatch sous forme de String
     * @param nombrePoint sous forme de int 
     */
    public Match(Joueuse joueuse1, Joueuse joueuse2, Arbitre arbitre, String categorieMatch, String niveauMatch, int nombrePoint) {
        this.joueuse1 = joueuse1;
        this.joueuse2 = joueuse2;
        this.arbitre = arbitre;
        this.categorieMatch = categorieMatch;
        this.niveauMatch = niveauMatch;
        this.nombrePoint = nombrePoint;
    }


    /**
     * Retourne joueur1
     * @return sous forme de Joueur 
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     * Retourne joueur2
     * @return sous forme de Joueur 
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     * Retourne joueuse1
     * @return sous forme de Joueuse 
     */
    public Joueuse getJoueuse1() {
        return joueuse1;
    }

    /**
     * Retourne joueuse2
     * @return sous forme de Joueuse 
     */
    public Joueuse getJoueuse2() {
        return joueuse2;
    }
    
    /**
     * Retourne arbitre
     * @return sous forme de Arbitre 
     */
    public Arbitre getArbitre() {
        return arbitre;
    }

    /**
     * Retourne gagnant
     * @return sous forme de Joueur 
     */
    public Joueur getGagnant() {
        return gagnant;
    }

    /**
     * Retourne perdant
     * @return sous forme de Joueur 
     */
    public Joueur getPerdant() {
        return perdant;
    }
    
    /**
     * Retourne gagnante
     * @return sous forme de Joueuse 
     */
    public Joueuse getGagnante() {
        return gagnante;
    }

    /**
     * Retourne perdante
     * @return sous forme de Joueuse 
     */
    public Joueuse getPerdante() {
        return perdante;
    }
    
    /**
     * Retourne la categorieMatch
     * @return sous forme de String 
     */
    public String getCategorieMatch() {
        return categorieMatch;
    }

    /**
     * Retourne niveauMatch
     * @return sous forme de String 
     */
    public String getNiveauMatch() {
        return niveauMatch;
    }

    /**
     * Retourne le nombrePoint
     * @return sous forme de int
     */
    public int getNombrePoint() {
        return nombrePoint;
    }

    /**
     * Définit le gagnant
     * @param gagnant sous forme de Joueur 
     */
    public void setGagnant(Joueur gagnant) {
        this.gagnant = gagnant;
    }

    /**
     * Définit perdant
     * @param perdant  sous forme de Joueur
     */
    public void setPerdant(Joueur perdant) {
        this.perdant = perdant;
    }
    
    /**
     * Définit gagnante
     * @param gagnante sous forme de Joueuse 
     */
    public void setGagnante(Joueuse gagnante) {
        this.gagnante = gagnante;
    }

    /**
     * Définit perdante
     * @param perdante sous forme de Joueuse 
     */
    public void setPerdante(Joueuse perdante) {
        this.perdante = perdante;
    }
    
    // détermine aléatoirement le joueur qui sert en premier
    /**
     * Retourne un boolean pour connaître le joueur servant en premier
     * @return sous forme de boolean 
     */
    private boolean joueurPremierService() {
        int tirage;
        
        Random r = new Random();
        tirage = r.nextInt(3 - 1);
        
        if(tirage == 0) {
            return false;
        } else {
            return true;
        }
  
    }
    
    /**
     * S'occupe du déroulement du Match donne le premier service aléatoirement, lance le set jusqu'a obtenir un gagnant de set puis annonce le gagnant du match
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur 
     */
    private void jouerMatch(Joueur joueur1, Joueur joueur2) {

        this.nbSetsGagnants = 3;
        
        serveur = joueurPremierService();
        Set set = new Set(joueur1, joueur2, arbitre);
        
        if (serveur == false) {
            set.setPremierServeur(joueur1);
        } else {
            set.setPremierServeur(joueur2);
        }
        
        while(nbSetsJoueur1 < nbSetsGagnants && nbSetsJoueur2 < nbSetsGagnants) {
            if( (set.getNbJeuxJoueur1() + set.getNbJeuxJoueur2() ) % 2  != 0) {
                serveur = !serveur;
            }
            
            set.jouerSet(joueur1, joueur2, true, true);
            
            if(set.getGagnantSet() == joueur1) {
                this.nbSetsJoueur1++;
            } else {
                this.nbSetsJoueur2++;
            }
        }
        
        if(nbSetsJoueur1 == nbSetsGagnants) {
            this.gagnant = joueur1;
            this.perdant = joueur2;
        } else {
            this.gagnant = joueur2;
            this.perdant = joueur1;
        }
        
        System.out.println("Le gagnant du match est " + this.gagnant.getPrenom() + " " + this.gagnant.getNomNaissance() + ". Il remporte " + this.nombrePoint + " points.");
        
    }
   
    /**
     * S'occupe du déroulement du Match donne le premier service aléatoirement, lance le set jusqu'a obtenir un gagnant de set puis annonce le gagnant du match
     * @param joueuse1 sous forme de joueuse
     * @param joueuse2 sous forme de joueuse
     */
    private void jouerMatch(Joueuse joueuse1, Joueuse joueuse2) {

        this.nbSetsGagnants = 2;
        
        serveur = joueurPremierService();
        Set set = new Set(joueuse1, joueuse2, arbitre);
        
        if (serveur == false) {
            set.setPremiereServeuse(joueuse1);
        } else {
            set.setPremiereServeuse(joueuse2);
        }
        
        while(nbSetsJoueuse1 < nbSetsGagnants && nbSetsJoueuse2 < nbSetsGagnants) {
            if( (set.getNbJeuxJoueuse1() + set.getNbJeuxJoueuse2() ) % 2  != 0) {
                serveur = !serveur;
            }
            
            set.jouerSet(joueuse1, joueuse2, true, true);
            
            if(set.getGagnanteSet() == joueuse1) {
                this.nbSetsJoueuse1++;
            } else {
                this.nbSetsJoueuse2++;
            }
        }
        
        if(nbSetsJoueuse1 == nbSetsGagnants) {
            this.gagnante = this.joueuse1;
            this.perdante = this.joueuse2;
        } else {
            this.gagnante = this.joueuse2;
            this.perdante = this.joueuse1;
        }
        
        System.out.println("La gagnante du match est " + this.gagnante.getPrenom() + " " + this.gagnante.getNomNaissance() + ". Il remporte " + this.nombrePoint + " points.");
        
    }
    
    /**
     * Cette mét
     * S'occupe du déroulement du Match sans intéraction avec l'utilisateur, donne le premier service aléatoirement, lance le set jusqu'a obtenir un gagnant de set puis annonce le gagnant du match
     * @param joueur1 sous forme de joueur
     * @param joueur2 sous forme de joueur
     * @param afficherDetails sous forme de boolean
     * @param modeAutoTournoi sous forme de boolean
     */
    private void jouerMatchAuto(Joueur joueur1, Joueur joueur2, boolean afficherDetails, boolean modeAutoTournoi) {
        //System.out.println("MODE MATCH AUTOMATIQUE");
        
        this.nbSetsGagnants = 3;
        
        serveur = joueurPremierService();

        Set set = new Set(joueur1, joueur2, arbitre);
        
        if (serveur == false) {
            set.setPremierServeur(joueur1);
        } else {
            set.setPremierServeur(joueur2);
        }
        
        while(nbSetsJoueur1 < nbSetsGagnants && nbSetsJoueur2 < nbSetsGagnants) {
            if( (set.getNbJeuxJoueur1() + set.getNbJeuxJoueur2() ) % 2  != 0) {
                serveur = !serveur;
            }
                
            set.jouerSet(joueur1, joueur2, false, afficherDetails);
            
            if(set.getGagnantSet() == joueur1) {
                this.nbSetsJoueur1++;
            } else {
                this.nbSetsJoueur2++;
            }
        }
        
        if(nbSetsJoueur1 == nbSetsGagnants) {
            this.gagnant = joueur1;
            this.perdant = joueur2;
        } else {
            this.gagnant = joueur2;
            this.perdant = joueur1;
        }
        
        if(modeAutoTournoi == false) {
            this.arbitre.annoncer("Le gagnant du match est " + this.gagnant.getPrenom() + " " + this.gagnant.getNomNaissance() + ". Il remporte " + this.nombrePoint + " points.");
        }
        
    }
    
    /**
     * S'occupe du déroulement du Match sans intéraction avec l'utilisateur, donne le premier service aléatoirement, lance le set jusqu'a obtenir un gagnant de set puis annonce le gagnant du match
     * 
     * @param joueuse1 sous forme de joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param afficherDetails sous forme de Boolean
     * @param modeAutoTournoi sous forme de Boolean
     */
    private void jouerMatchAuto(Joueuse joueuse1, Joueuse joueuse2, boolean afficherDetails, boolean modeAutoTournoi) {
        //System.out.println("MODE MATCH AUTOMATIQUE");
        
        this.nbSetsGagnants = 2;
        
        serveur = joueurPremierService();

        Set set = new Set(joueuse1, joueuse2, arbitre);
        
        if (serveur == false) {
            set.setPremiereServeuse(joueuse1);
        } else {
            set.setPremiereServeuse(joueuse2);
        }
        
        while(nbSetsJoueuse1 < nbSetsGagnants && nbSetsJoueuse2 < nbSetsGagnants) {
            if( (set.getNbJeuxJoueuse1() + set.getNbJeuxJoueuse2() ) % 2  != 0) {
                serveur = !serveur;
            }
                
            set.jouerSet(joueuse1, joueuse2, false, afficherDetails);
            
            if(set.getGagnanteSet() == joueuse1) {
                this.nbSetsJoueuse1++;
            } else {
                this.nbSetsJoueuse2++;
            }
        }
        
        if(nbSetsJoueuse1 == nbSetsGagnants) {
            this.gagnante = this.joueuse1;
            this.perdante = this.joueuse2;
        } else {
            this.gagnante = this.joueuse2;
            this.perdante = this.joueuse1;
        }
        
        if(modeAutoTournoi == false) {
            this.arbitre.annoncer("La gagnante du match est " + this.gagnante.getPrenom() + " " + this.gagnante.getNomNaissance() + ". Il remporte " + this.nombrePoint + " points.");
        }
        
    }
    
    /**
     * Cette méthode permet de gérer le déroulement du match, il est un intermédiaire avec l'utilisateur
     * @param joueur1 sous forme de joueur
     * @param joueur2 sous forme de joueur
     * @param modeAutoTournoi  sous forme de boolean
     */
    public void demarrerMatch(Joueur joueur1, Joueur joueur2, boolean modeAutoTournoi) {
        Scanner sc = new Scanner(System.in);
        String saisie = "";
        boolean saisieCorrecte = false;
        
        if(modeAutoTournoi == false) {
            this.arbitre.annoncer("\nLe match est un match " + this.categorieMatch + " opposant " + joueur1.getPrenom() + " " + joueur1.getNomNaissance() + " contre " + joueur2.getPrenom() + " " + joueur2.getNomNaissance() + "\n");
            
            while(saisieCorrecte == false) {
                System.out.println("Choisir le mode de déroulement du match ? :");
                System.out.println("1 - Mode manuel\n2 - Mode automatique\n");
                saisie = sc.nextLine();
                
                if(saisie.equals("1") || saisie.equals("2")) {
                        saisieCorrecte = true;
                    } else {
                        System.out.println("--- Saisie incorrecte ! ---");
                    }
            }
        } else {
            saisie = "2";
        }
        
        if(saisie.equals("1")) {
            this.jouerMatch(joueur1, joueur2);
        } else {
            if(modeAutoTournoi == false) {
                
                saisieCorrecte = false;
                
                while(saisieCorrecte == false) {
                    System.out.println("Voulez-vous afficher le détail des actions du match ?");
                    System.out.println("1 - Oui\n2 - Non");
                    saisie = sc.nextLine();
                    
                    if(saisie.equals("1") || saisie.equals("2")) {
                        saisieCorrecte = true;
                    } else {
                        System.out.println("--- Saisie incorrecte ! ---");
                    }
                }
                
            } else {
                saisie = "2";
            }
            
            if(saisie.equals("1")) {
                this.jouerMatchAuto(joueur1, joueur2, true, modeAutoTournoi);
            } else
                this.jouerMatchAuto(joueur1, joueur2, false, modeAutoTournoi);
        }
    }
    
    /**
     * Cette méthode permet de gérer le déroulement du match, il est un intermédiaire avec l'utilisateur
     * 
     * @param joueuse1 sous forme de joueuse
     * @param joueuse2 sous forme de joueuse
     * @param modeAutoTournoi sous forme de boolean
     */
    public void demarrerMatch(Joueuse joueuse1, Joueuse joueuse2, boolean modeAutoTournoi) {
        Scanner sc = new Scanner(System.in);
        String saisie = "";
        boolean saisieCorrecte = false;
        
        if(modeAutoTournoi == false) {
            this.arbitre.annoncer("\nLe match est un match " + this.categorieMatch + " opposant " + joueuse1.getPrenom() + " " + joueuse1.getNomNaissance() + " contre " + joueur2.getPrenom() + " " + joueur2.getNomNaissance() + "\n");
            
            while(saisieCorrecte == false) {
                System.out.println("Choisir le mode de déroulement du match ? :");
                System.out.println("1 - Mode manuel\n2 - Mode automatique\n");
                saisie = sc.nextLine();
                
                if(saisie.equals("1") || saisie.equals("2")) {
                        saisieCorrecte = true;
                    } else {
                        System.out.println("--- Saisie incorrecte ! ---");
                    }
            }
        } else {
            saisie = "2";
        }
        
        if(saisie.equals("1")) {
            this.jouerMatch(joueuse1, joueuse2);
        } else {
            if(modeAutoTournoi == false) {
                
                saisieCorrecte = false;
                
                while(saisieCorrecte == false) {
                    System.out.println("Voulez-vous afficher le détail des actions du match ?");
                    System.out.println("1 - Oui\n2 - Non");
                    saisie = sc.nextLine();
                    
                    if(saisie.equals("1") || saisie.equals("2")) {
                        saisieCorrecte = true;
                    } else {
                        System.out.println("--- Saisie incorrecte ! ---");
                    }
                }
                
            } else {
                saisie = "2";
            }
            
            if(saisie.equals("1")) {
                this.jouerMatchAuto(joueuse1, joueuse2, true, modeAutoTournoi);
            } else
                this.jouerMatchAuto(joueuse1, joueuse2, false, modeAutoTournoi);
        }
    }
}
