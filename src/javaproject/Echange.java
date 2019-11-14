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
    
    /**
     * Demande à l'utilisateur si le serveur se voit faire :
     * 1 une faute au service
     * 2 une let
     * 3 un échange correcte
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @return résultat sous forme d'integer
     */
    public int entrerResultat() {
        boolean saisieCorrecte = false;
        
        Scanner sc = new Scanner(System.in);
        String saisie = "";
        
        while(saisieCorrecte == false) {
            System.out.println("Entrer le résultat :");
            System.out.println("1 - Faute au service \n2 - Let \n3 - Echange correct \n");
            saisie = sc.nextLine();
            
            if(saisie.equals("1") || saisie.equals("2") || saisie.equals("3") ) {
                saisieCorrecte = true;
            } else {
                System.out.println("--- Saisie incorrecte ! ---");
            }
        }

        int resultat = Integer.parseInt(saisie);
        
        return resultat;
    }
    

    /**
     * jouerEchange réalise:
     * - L'arbitre annonce le serveur
     * - Annonce le vainqueur si le serveur réalise une faute au service
     * - Demande à l'utilisateur quel sera le vainqueur de l'échange et l'annonce
     * @param joueur1 sous forme de joueur
     * @param joueur2 sous forme de joueur
     */
    public void jouerEchange(Joueur joueur1, Joueur joueur2) {
        int resultat;
        
        while(true) {
            this.arbitre.annoncer("Service de " + this.serveur.getPrenom() + " " + this.serveur.getNomNaissance());
            
            resultat = entrerResultat();
            
            switch(resultat) {
                case 1:
                    if(numeroService == 2) {
                        if(serveur == joueur1) {
                            this.gagnantEchange = this.joueur2;
                        } else {
                            this.gagnantEchange = this.joueur1;
                        }
                        
                        numeroService = 1;
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance() );
                        return;
                    } else {
                        numeroService++;
                    }
                    break;

                case 2:
                    //nbLet++;
                    break;
                
                case 3:
                    Scanner sc = new Scanner(System.in);
                    String saisie = "";
                    boolean saisieCorrecte = false;
                    
                    while(saisieCorrecte == false) {
                        System.out.println("Joueur gagnant de l'échange ? :");
                        System.out.println("1 - " + this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + "\n" + "2 - " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + "\n");
                        saisie = sc.nextLine();
                        
                        if(saisie.equals("1") || saisie.equals("2")) {
                            saisieCorrecte = true;
                        } else {
                            System.out.println("--- Saisie incorrecte ! ---");
                        }
                    }
                    
                    if(saisie.equals("1")) {
                        this.gagnantEchange = this.joueur1;
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        contestation(this.joueur1, this.joueur2, true);
                        return;
                    } else if (saisie.equals("2")) {
                        gagnantEchange = joueur2;
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        contestation(this.joueur1, this.joueur2, true);
                        return;
                    }
            }
        }
    }
    
    /**
     * jouerEchange réalise:
     * - L'arbitre annonce le serveur
     * - Annonce le vainqueur si le serveur réalise une faute au service
     * - Demande à l'utilisateur quel sera le vainqueur de l'échange et l'annonce
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     */
    public void jouerEchange(Joueuse joueuse1, Joueuse joueuse2) {
        int resultat;
        
        while(true) {
            this.arbitre.annoncer("Service de " + this.serveuse.getPrenom() + " " + this.serveuse.getNomNaissance());
            
            resultat = entrerResultat();
            
            switch(resultat) {
                case 1:
                    if(numeroService == 2) {
                        if(serveuse == this.joueuse1) {
                            this.gagnanteEchange = this.joueuse2;
                        } else {
                            this.gagnanteEchange = this.joueuse1;
                        }
                        
                        numeroService = 1;
                        this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance() );
                        return;
                    } else {
                        numeroService++;
                    }
                    break;

                case 2:
                    //nbLet++;
                    break;
                
                case 3:
                    Scanner sc = new Scanner(System.in);
                    String saisie = "";
                    boolean saisieCorrecte = false;
                    
                    while(saisieCorrecte == false) {
                        System.out.println("Joueuse gagnante de l'échange ? :");
                        System.out.println("1 - " + this.joueuse1.getPrenom() + " " + this.joueuse1.getNomNaissance() + "\n" + "2 - " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + "\n");
                        saisie = sc.nextLine();
                        
                        if(saisie.equals("1") || saisie.equals("2")) {
                            saisieCorrecte = true;
                        } else {
                            System.out.println("--- Saisie incorrecte ! ---");
                        }
                    }
                    
                    if(saisie.equals("1")) {
                        this.gagnanteEchange = this.joueuse1;
                        this.arbitre.annoncer("La gagnante de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance());
                        contestation(this.joueuse1, this.joueuse2, true);
                        return;
                    } else if (saisie.equals("2")) {
                        gagnanteEchange = joueuse2;
                        this.arbitre.annoncer("La gagnante de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance());
                        contestation(this.joueuse1, this.joueuse2, true);
                        return;
                    }
            }
        }
    }
    
    /**
     * Réalise l'échange sans échange avec l'utilisateur
     * jouerEchangeAuto réalise:
     * - L'arbitre annonce le serveur
     * - Annonce le vainqueur si le serveur réalise une faute au service aléatoirement
     * - Determine aléatoirement et annonce quel sera le vainqueur de l'échange
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param afficherDetails sous forme de boolean
     */
    public void jouerEchangeAuto(Joueuse joueuse1, Joueuse joueuse2, boolean afficherDetails) {
        int resultat;
        
        while(true) {
            if(afficherDetails == true) {
                this.arbitre.annoncer("Service de " + this.serveuse.getPrenom() + " " + this.serveuse.getNomNaissance());
                
                System.out.println("Entrer le résultat :");
                System.out.println("1 - Faute au service \n2 - Let \n3 - Echange correct \n");
            }
            
            Random r = new Random();
            resultat = 1 + r.nextInt(4 - 1);
            //resultat = 3;
            
            if(afficherDetails == true) {
                System.out.println(resultat);
            }
            
            switch(resultat) {
                case 1:
                    if(numeroService == 2) {
                        if(this.serveuse == this.joueuse1) {
                            this.gagnanteEchange = this.joueuse2;
                        } else {
                            this.gagnanteEchange = this.joueuse1;
                        }
                        
                        numeroService = 1;
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("La gagnante de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance() );
                        }
                        
                        return;
                    } else {
                        numeroService++;
                    }
                    break;

                case 2:
                    //nbLet++;
                    break;
                
                case 3:
                    
                    if(afficherDetails == true) {
                        System.out.println("Joueuse gagnante de l'échange ? :");
                        System.out.println("1 - " + this.joueuse1.getPrenom() + " " + this.joueuse1.getNomNaissance() + "\n" + "2 - " + this.joueuse2.getPrenom() + " " + this.joueuse2.getNomNaissance() + "\n");
                    }
                    
                    int saisie;
                    
                    saisie = 1 + r.nextInt(3 - 1);
                    //saisie = 2;
                    if(afficherDetails == true) {
                        System.out.println(saisie);
                    }
                    
                    if(saisie == 1) {
                        this.gagnanteEchange = this.joueuse1;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("La gagnante de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance());
                        }
                        contestation(this.joueuse1, this.joueuse2, afficherDetails);
                        return;
                    } else {
                        this.gagnanteEchange = this.joueuse2;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("La gagnante de l'échange est : " + this.gagnanteEchange.getPrenom() + " " + this.gagnanteEchange.getNomNaissance());
                        }
                        contestation(this.joueuse1, this.joueuse2, afficherDetails);
                        return;
                    }
            }
        }
    }
    
    /**
     * Réalise l'échange sans échange avec l'utilisateur
     * jouerEchangeAuto réalise:
     * - L'arbitre annonce le serveur
     * - Annonce le vainqueur si le serveur réalise une faute au service aléatoirement
     * - Determine aléatoirement et annonce quel sera le vainqueur de l'échange
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param afficherDetails sous forme de boolean
     */
    public void jouerEchangeAuto(Joueur joueur1, Joueur joueur2, boolean afficherDetails) {
        int resultat;
        
        while(true) {
            if(afficherDetails == true) {
                System.out.println("Service de " + this.serveur.getPrenom() + " " + this.serveur.getNomNaissance());
                
                System.out.println("Entrer le résultat :");
                System.out.println("1 - Faute au service \n2 - Let \n3 - Echange correct \n");
            }
            
            Random r = new Random();
            resultat = 1 + r.nextInt(4 - 1);
            //resultat = 3;
            
            if(afficherDetails == true) {
                System.out.println(resultat);
            }
            
            switch(resultat) {
                case 1:
                    if(numeroService == 2) {
                        if(this.serveur == this.joueur1) {
                            this.gagnantEchange = this.joueur2;
                        } else {
                            this.gagnantEchange = this.joueur1;
                        }
                        
                        numeroService = 1;
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance() );
                        }
                        
                        return;
                    } else {
                        numeroService++;
                    }
                    break;

                case 2:
                    //nbLet++;
                    break;
                
                case 3:
                    
                    if(afficherDetails == true) {
                        System.out.println("Joueur gagnant de l'échange ? :");
                        System.out.println("1 - " + this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + "\n" + "2 - " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + "\n");
                    }
                    
                    int saisie;
                    
                    saisie = 1 + r.nextInt(3 - 1);
                    //saisie = 2;
                    if(afficherDetails == true) {
                        System.out.println(saisie);
                    }
                    
                    if(saisie == 1) {
                        this.gagnantEchange = this.joueur1;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        }
                        contestation(this.joueur1, this.joueur2, afficherDetails);
                        return;
                    } else {
                        this.gagnantEchange = this.joueur2;
                        
                        if(afficherDetails == true) {
                            this.arbitre.annoncer("Le gagnant de l'échange est : " + this.gagnantEchange.getPrenom() + " " + this.gagnantEchange.getNomNaissance());
                        }
                        contestation(this.joueur1, this.joueur2, afficherDetails);
                        return;
                    }
            }
        }
    }
    
    /**
     * Réalise avec une certaine probabilité une remise en question du point attribué
     * L'abitre peut choisir de revenir sur sa décision avec une certaine probabilité
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean) 
     * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean) 
     * @param joueur1 sous forme de Joueur
     * @param joueur2 sous forme de Joueur
     * @param afficherDetails sous forme de boolean
     */
    public void contestation(Joueur joueur1, Joueur joueur2, boolean afficherDetails){
        int resultat1;
        int resultat2;
        
        Random r = new Random();
        resultat1 = 1 + r.nextInt(100);
        resultat2 = 1 + r.nextInt(5);
        
        //Probabilité de 1/100 que le joueur perdant conteste le point
        if (resultat1 == 49){
            //Si le gagnant de l'échange est le joueur1
            if (this.gagnantEchange == joueur1){
                if(afficherDetails == true) {
                    System.out.println( this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance() + " conteste l'échange\n");
                }
                //Probabilité de 20/100 que l'arbitre réevalue son point et l'accorde à l'autre joueur
                if (resultat2 == 3){
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je revient sur ma décision et accorde le point à : " + this.joueur2.getPrenom() + " " + this.joueur2.getNomNaissance());
                    }
                    this.gagnantEchange = this.joueur2;                    
                
                }
                else {
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je ne reviens pas sur ma décision");
                    }
                }
                
            }
            //si le gagnant de léchange est le joueur2
            else {
                if(afficherDetails == true) {
                    this.arbitre.annoncer( this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + " conteste l'échange\n");
                }
                //Probabilité de 20/100 que l'arbitre réevalue son point et l'accorde à l'autre joueur
                if (resultat2 == 3){
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je reviens sur ma décision et accorde le point à : " + this.joueur1.getPrenom() + " " + this.joueur1.getNomNaissance() + " \n");
                    }
                    this.gagnantEchange = this.joueur1;                    
                
                }
                else{
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je ne reviens pas sur ma décision \n");
                    }
                }
            }
        }   
    }
     /**
     * Réalise avec une certaine probabilité une remise en question du point attribué
     * L'abitre peut choisir de revenir sur sa décision avec une certaine probabilité
     * @see Echange#jouerEchange(tennis.Joueur, tennis.Joueur) 
     * @see Echange#jouerEchange(tennis.Joueuse, tennis.Joueuse) 
     * @see Echange#jouerEchangeAuto(tennis.Joueur, tennis.Joueur, boolean) 
     * @see Echange#jouerEchangeAuto(tennis.Joueuse, tennis.Joueuse, boolean) 
     * @param joueuse1 sous forme de Joueuse
     * @param joueuse2 sous forme de Joueuse
     * @param afficherDetails sous forme de boolean
     */
    public void contestation(Joueuse joueuse1, Joueuse joueuse2, boolean afficherDetails){
        int resultat1;
        int resultat2;
        
        Random r = new Random();
        resultat1 = 1 + r.nextInt(100);
        resultat2 = 1 + r.nextInt(5);
        
        //Probabilité de 1/100 que le joueuse perdant conteste le point
        if (resultat1 == 49){
            //Si le gagnant de l'échange est le joueuse1
            if (this.gagnanteEchange == this.joueuse1){
                if(afficherDetails == true) {
                    System.out.println( this.joueuse2.getPrenom() + " " + this.joueuse2.getNomNaissance() + " conteste l'échange\n");
                }
                //Probabilité de 20/100 que l'arbitre réevalue son point et l'accorde à l'autre joueuse
                if (resultat2 == 3){
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je revient sur ma décision et accorde le point à : " + this.joueuse2.getPrenom() + " " + this.joueuse2.getNomNaissance());
                    }
                    this.gagnanteEchange = this.joueuse2;                    
                
                }
                else {
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je ne reviens pas sur ma décision");
                    }
                }
                
            }
            //si le gagnant de léchange est le joueuse2
            else {
                if(afficherDetails == true) {
                    this.arbitre.annoncer( this.joueuse1.getPrenom() + " " + this.joueuse1.getNomNaissance() + " conteste l'échange\n");
                }
                //Probabilité de 20/100 que l'arbitre réevalue son point et l'accorde à l'autre joueuse
                if (resultat2 == 3){
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je reviens sur ma décision et accorde le point à : " + this.joueuse1.getPrenom() + " " + this.joueuse1.getNomNaissance() + " \n");
                    }
                    this.gagnanteEchange = this.joueuse1;                    
                
                }
                else{
                    if(afficherDetails == true) {
                        this.arbitre.annoncer("Je ne reviens pas sur ma décision \n");
                    }
                }
            }
        }   
    }
}