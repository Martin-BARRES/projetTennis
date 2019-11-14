/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * La classe Tournoi permet de gérer le déroulement du Tournoi, caractérisé par la ville du Tournoi, le type de terrain, catégorieTournoi
 * 
 * @author hecto
 */
public class Tournoi {
    
    /**
     * VilleTournoi sous forme de string
     * @see Tournoi#getVilleTournoi() 
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private final String VilleTournoi;
    
    /**
     * TypeTerrain sous forme de String
     * @see Tournoi#getTypeTerrain() 
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private final String TypeTerrain;
    
    /**
     * CategorieTournoi sous forme de String
     * @see Tournoi#getCategorieTournoi()      
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private final String CategorieTournoi;
    
    /**
     * tableauJoueurs sous forme d'arrayList
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
    */
    private ArrayList tableauJoueurs;
    
    /**
     * tableauJoueuses sous forme d'ArrayList
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private ArrayList tableauJoueuses;
    
    /**
     * tableauArbitres sous forme d'ArrayList
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private final ArrayList tableauArbitres;
    
    /**
     * tableauArbitres sous forme d'ArrayList
     * @see Tournoi#Tournoi(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList) 
     */
    private final ArrayList tableauSpectateurs;
    
    /**
     * gagnantTournoiHomme sous forme de joueur
     * @see Tournoi#getGagnantTournoiHomme()  
     */
    private Joueur gagnantTournoiHomme = null;
    
    /**
     * gagnanteTournoiFemme sous forme de Joueuse
     * @see Tournoi#getGagnanteTournoiFemme() 
     */
    private Joueuse gagnanteTournoiFemme = null;

    /**
     * Constructeur du Tournoi
     * @param VilleTournoi sous forme de String
     * @param TypeTerrain sous forme destring
     * @param CategorieTournoi sous forme de String
     * @param tableauJoueurs sous forme d'ArrayList
     * @param tableauJoueuses sous forme d'ArrayList
     * @param tableauArbitres  sous forme d'ArrayList
     * @param tableauSpectateurs  sous forme d'ArrayList
     */
    public Tournoi(String VilleTournoi, String TypeTerrain, String CategorieTournoi, ArrayList tableauJoueurs, ArrayList tableauJoueuses, ArrayList tableauArbitres, ArrayList tableauSpectateurs) {
        this.VilleTournoi = VilleTournoi;
        this.TypeTerrain = TypeTerrain;
        this.CategorieTournoi = CategorieTournoi;
        this.tableauJoueurs = tableauJoueurs;
        this.tableauJoueuses = tableauJoueuses;
        this.tableauArbitres = tableauArbitres;
        this.tableauSpectateurs = tableauSpectateurs;
    }

    /**
     * On retourne le gagnant du tournoi homme
     * @return sous forme du Joueur
     */
    public Joueur getGagnantTournoiHomme() {
        return gagnantTournoiHomme;
    }
    
    /**
     * On retourne le gagnant du tournoi femme
     * @return sous forme de Joueuse
     */
    public Joueuse getGagnanteTournoiFemme() {
        return gagnanteTournoiFemme;
    }
    
    /**
     * On retourne la ville du Tournoi
     * @return sous forme de String
     */
    public String getVilleTournoi() {
        return VilleTournoi;
    }
    
    /**
     * On retourne le type de terrain
     * @return sous forme de String
     */
    public String getTypeTerrain() {
        return TypeTerrain;
    }
    
    /**
     * Retourne la catégorie du Tournoi
     * @return sous forme de String
     */
    public String getCategorieTournoi() {
        return CategorieTournoi;
    }
    
    /**
     * Cette méthode permet le déroulement du tournoi homme en appelant les joueurs
     * @param modeAutoTournoi sous forme de boolean
     */
    private void jouerTournoiHomme(boolean modeAutoTournoi) {
        Random r = new Random();
        ArrayList tableauGagnants = new ArrayList();
        ArrayList tableauJoueursTournoi = (ArrayList)this.tableauJoueurs.clone();
        
        while(this.gagnantTournoiHomme == null) {
            Joueur joueur1, joueur2;
            Arbitre arbitre;
            
            //Premier tour
            for(int i=0; i < tableauJoueursTournoi.size(); i=i+2) {
                
                joueur1 = (Joueur) tableauJoueursTournoi.get(i);
                joueur2 = (Joueur) tableauJoueursTournoi.get(i+1);
                arbitre = (Arbitre) this.tableauArbitres.get(r.nextInt(tableauArbitres.size()));
                
                Match match = new Match(joueur1, joueur2, arbitre, "simple", "1er tour", 10);
                match.demarrerMatch(joueur1, joueur2, modeAutoTournoi);
                
                //on ajoute le gagnant dans le tableau des gagnants
                tableauGagnants.add(match.getGagnant());
                
                if(tableauJoueursTournoi.size() == 2) { //finale
                    this.gagnantTournoiHomme = match.getGagnant();
                }
            }
            
            tableauJoueursTournoi.clear();
            tableauJoueursTournoi = (ArrayList)tableauGagnants.clone();          
            tableauGagnants.clear();
            
        }
        
        System.out.println("\n\nLe tournoi simple homme est remporté par " + this.gagnantTournoiHomme.getPrenom() + " " + this.gagnantTournoiHomme.getNomNaissance() + ".");
    }
    
    /**
     * Cette méthode permet de gérer le trounoi des joueuses
     * @param modeAutoTournoi sous forme de boolean
     */
    private void jouerTournoiFemme(boolean modeAutoTournoi) {
        Random r = new Random();
        ArrayList tableauGagnants = new ArrayList();
        ArrayList tableauJoueusesTournoi = (ArrayList)this.tableauJoueuses.clone();
        
        while(this.gagnanteTournoiFemme == null) {
            Joueuse joueuse1, joueuse2;
            Arbitre arbitre;
            
            //Premier tour
            for(int i=0; i < tableauJoueusesTournoi.size(); i=i+2) {
                
                joueuse1 = (Joueuse) tableauJoueusesTournoi.get(i);
                joueuse2 = (Joueuse) tableauJoueusesTournoi.get(i+1);
                arbitre = (Arbitre) this.tableauArbitres.get(r.nextInt(tableauArbitres.size()));
                
                Match match = new Match(joueuse1, joueuse2, arbitre, "simple", "1er tour", 10);
                match.demarrerMatch(joueuse1, joueuse2, modeAutoTournoi);
                
                //on ajoute le gagnant dans le tableau des gagnants
                tableauGagnants.add(match.getGagnante());
                
                if(tableauJoueusesTournoi.size() == 2) { //finale
                    this.gagnanteTournoiFemme = match.getGagnante();
                }
            }
            
            tableauJoueusesTournoi.clear();
            tableauJoueusesTournoi = (ArrayList)tableauGagnants.clone();          
            tableauGagnants.clear();
            
        }
        
        System.out.println("\n\nLe tournoi simple femme est remporté par " + this.gagnanteTournoiFemme.getPrenom() + " " + this.gagnanteTournoiFemme.getNomNaissance() + ".");
    }
    
    /**
     * Cette méthode permet de gérer l'interface avec l'utilisateur
     */
    public void lancerTournoi() {
        Scanner sc = new Scanner(System.in);
        String saisie = "";
        boolean saisieCorrecte = false;
        
        while(saisieCorrecte == false) {
            System.out.println("Voulez-vous exécuter l'intégralité du tournoi automatiquement ?");
            System.out.println("1 - Oui \n2 - Non\n");
        
            saisie = sc.nextLine();
            
            if(saisie.equals("1") || saisie.equals("2")) {
                saisieCorrecte = true;
            } else {
                System.out.println("--- Saisie incorrecte ! ---");
            }
        }
        
        if(saisie.equals("1")) {
            this.jouerTournoiHomme(true);
            this.jouerTournoiFemme(true);
        } else {
            this.jouerTournoiHomme(false);
            this.jouerTournoiFemme(false);
        }
        
        
    }
}
