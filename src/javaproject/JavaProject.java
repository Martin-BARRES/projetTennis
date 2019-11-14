/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * JavaProject est la classe contenant le main, et celle qui fait interagir
 * les classes entre elles.
 * @author ISEN
 */
public class JavaProject {

    /**
     * @param args the command line arguments of string
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        /*Joueur joueur1 = new Joueur("gauche", "babolat", 2, "philippe lucas", "vert", "Nadal","Raphael","raph","3/06/1986", "Madrid","","espagnol","H",185,85);
        Joueur joueur2 = new Joueur("droite", "artengo", 4, "hector guerin", "magenta", "Boubou","Eliott","Eliotlephoque","3/06/1997","Lille","","France","H",175,95);
        Arbitre arbitre = new Arbitre("Condarbitre","encule","fdpsurnom","3/06/1957","HEI","","France","H",195,65);
        
        Match finale = new Match(joueur1, joueur2, arbitre, "simple", "finale", 32);
        finale.demarrerMatch();*/

        ArrayList listeJoueurs = new ArrayList();
        ArrayList listeJoueuses = new ArrayList();
        ArrayList listeArbitres = new ArrayList();
        ArrayList listeSpectateurs = new ArrayList();

        ArrayList nomListe = new ArrayList();
        ArrayList prenomHommeListe = new ArrayList();
        ArrayList prenomFemmeListe = new ArrayList();
        ArrayList paysListe = new ArrayList();
        ArrayList couleursListe = new ArrayList();
        ArrayList sponsorsListe = new ArrayList();
        
        //création des ArrayList des caractéristiques
        try {
            prenomHommeListe = ouvrirFichier("prenom_homme.txt");
            prenomFemmeListe = ouvrirFichier("prenom_femme.txt");
            nomListe = ouvrirFichier("nom.txt");
            paysListe = ouvrirFichier("pays.txt");
            couleursListe = ouvrirFichier("couleurs.txt");
            sponsorsListe = ouvrirFichier("sponsors.txt");
           
        } catch (IOException ex) {
            System.out.println("Fichier non trouvé");
        }
        
        //création des joueurs 
        String main, sponsor, entraineur, couleurShort = null, couleurJupe = null, nomNaissance, nomCourant, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre;
        int taille, classement;
        float poids;
        
        //HOMMES
        for(int i=0; i<128; i++) {
            //r.nextInt(nomListe.size() - 1)

            genre = "homme";
            
            nomNaissance = (String) nomListe.get(r.nextInt(nomListe.size() - 1));
            nomCourant = (String) nomListe.get(r.nextInt(nomListe.size() - 1));

            if(genre.equals("homme")) {
                prenom = (String) prenomHommeListe.get(r.nextInt(prenomHommeListe.size() - 1));
            } else {
                prenom = (String) prenomFemmeListe.get(r.nextInt(prenomFemmeListe.size() - 1));
            }

            surnom = "";

            dateNaissance = Integer.toString(1 + r.nextInt(30)) + "/" + Integer.toString(1 + r.nextInt(11)) + "/" + Integer.toString(1970 + r.nextInt(35));
            lieuNaissance = (String) paysListe.get(r.nextInt(paysListe.size() - 1));
            dateDeces = "";
            nationalite = (String) paysListe.get(r.nextInt(paysListe.size() - 1));

            
            taille = 160 + r.nextInt(200 - 160);
            poids = 70 + r.nextInt(50);

            if(r.nextInt(10) > 7) {
                main = "gauche";
            } else {
                main = "droite";
            }

            sponsor = (String) sponsorsListe.get(r.nextInt(sponsorsListe.size() - 1));

            if(r.nextInt(1) == 0) {
                entraineur = (String) prenomHommeListe.get(r.nextInt(prenomHommeListe.size() - 1));
            } else {
                entraineur = (String) prenomFemmeListe.get(r.nextInt(prenomFemmeListe.size() - 1));
            }

            if(genre.equals("homme")) {
                couleurShort = (String) couleursListe.get(r.nextInt(couleursListe.size() - 1));
            }
            
            classement = i + 1;

            if(genre.equals("homme")) {
                listeJoueurs.add(new Joueur(main, sponsor, classement, entraineur, couleurShort, nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids));
            }
        }
        
        
        //FEMMES
        for(int i=0; i<128; i++) {
            //r.nextInt(nomListe.size() - 1)

            genre = "femme";
            
            nomNaissance = (String) nomListe.get(r.nextInt(nomListe.size() - 1));
            nomCourant = (String) nomListe.get(r.nextInt(nomListe.size() - 1));

            if(genre.equals("homme")) {
                prenom = (String) prenomHommeListe.get(r.nextInt(prenomHommeListe.size() - 1));
            } else {
                prenom = (String) prenomFemmeListe.get(r.nextInt(prenomFemmeListe.size() - 1));
            }

            surnom = "";

            dateNaissance = Integer.toString(1 + r.nextInt(30)) + "/" + Integer.toString(1 + r.nextInt(11)) + "/" + Integer.toString(1970 + r.nextInt(35));
            lieuNaissance = (String) paysListe.get(r.nextInt(paysListe.size() - 1));
            dateDeces = "";
            nationalite = (String) paysListe.get(r.nextInt(paysListe.size() - 1));

            
            taille = 160 + r.nextInt(200 - 160);
            poids = 70 + r.nextInt(50);

            if(r.nextInt(10) > 7) {
                main = "gauche";
            } else {
                main = "droite";
            }

            sponsor = (String) sponsorsListe.get(r.nextInt(sponsorsListe.size() - 1));

            if(r.nextInt(1) == 0) {
                entraineur = (String) prenomHommeListe.get(r.nextInt(prenomHommeListe.size() - 1));
            } else {
                entraineur = (String) prenomFemmeListe.get(r.nextInt(prenomFemmeListe.size() - 1));
            }

            couleurJupe = (String) couleursListe.get(r.nextInt(couleursListe.size() - 1));

            
            classement = i + 1;

            listeJoueuses.add(new Joueuse(main, sponsor, classement, entraineur, couleurJupe, nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids));
            
        }
        
        
        //
        //ARBITRES
        //
        for(int i=0; i<10; i++) {

            if(r.nextInt(2-1) == 0) {
                genre = "homme";
            } else {
                genre = "femme";
            }

            nomNaissance = (String) nomListe.get(r.nextInt(nomListe.size() - 1));
            nomCourant = (String) nomListe.get(r.nextInt(nomListe.size() - 1));

            if(genre.equals("homme")) {
                prenom = (String) prenomHommeListe.get(r.nextInt(prenomHommeListe.size() - 1));
            } else {
                prenom = (String) prenomFemmeListe.get(r.nextInt(prenomFemmeListe.size() - 1));
            }

            surnom = "";

            dateNaissance = Integer.toString(1 + r.nextInt(30)) + "/" + Integer.toString(1 + r.nextInt(11)) + "/" + Integer.toString(1970 + r.nextInt(35));
            lieuNaissance = (String) paysListe.get(r.nextInt(paysListe.size() - 1));
            dateDeces = "";
            nationalite = (String) paysListe.get(r.nextInt(paysListe.size() - 1));

            if(r.nextInt(2-1) == 0) {
                genre = "homme";
            } else {
                genre = "femme";
            }

            taille = 160 + r.nextInt(200 - 160);
            poids = 70 + r.nextInt(50);

            listeArbitres.add(new Arbitre(nomNaissance, prenom, surnom, dateNaissance, lieuNaissance, dateDeces, nationalite, genre, taille, poids));

        }
        
        
        1
        String saisie = "";
        Scanner sc = new Scanner(System.in);
        
        
        while(true) {
            System.out.println("\n------------------------------");
            System.out.println("Interface de gestion de tounoi");
            System.out.println("------------------------------");
            System.out.println("1 - Afficher les joueurs");
            System.out.println("2 - Lancer un tournoi");
            System.out.println("3 - Quitter\n");
            saisie = sc.nextLine();

            if(saisie.equals("1")) {
                //aficher les joueurs
                System.out.println("Afficher les joueurs :");
                System.out.println("1 - Hommes");
                System.out.println("2 - Femmes");
                saisie = sc.nextLine();
                
                if(saisie.equals("1")) {
                    for(int i=0; i < listeJoueurs.size(); i++) {
                        Joueur joueur = (Joueur) listeJoueurs.get(i);
                        System.out.println(i + " - " + joueur.getPrenom() + " " + joueur.getNomNaissance());
                    }
                }
                
                else if(saisie.equals("2")) {
                    for(int i=0; i < listeJoueuses.size(); i++) {
                        Joueuse joueuse = (Joueuse) listeJoueuses.get(i);
                        System.out.println(i + " - " + joueuse.getPrenom() + " " + joueuse.getNomNaissance());
                    }
                }
                
                saisie = "";
            }
            
            if(saisie.equals("2")) {
                //lancer tournoi
                
                String ville;
                System.out.println("Dans quelle ville se déroule le tournoi ?");
                ville = sc.nextLine();
                
                String terrain;
                System.out.println("Quel est le type de terrain ?");
                terrain = sc.nextLine();
                
                String typeTournoi;
                System.out.println("Quel est le type de tournoi (grand chelem, master...) ?");
                typeTournoi = sc.nextLine();
                
                Tournoi tournoi = new Tournoi(ville, terrain, typeTournoi, listeJoueurs, listeJoueuses, listeArbitres, listeSpectateurs);
                tournoi.lancerTournoi();
            }
            
            //quitter programme
            if(saisie.equals("3")) {
                System.exit(0);
            }
        }
    }
    
    /**
     * Permet d'ouvrier les fichiers texte
     * @param nomFichier sous forme de String
     * @return sous forme d'arraylist
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static ArrayList ouvrirFichier(String nomFichier) throws FileNotFoundException, IOException {
        ArrayList tab = new ArrayList();
        int i = 0;
        
        //BufferedReader br = new BufferedReader(new FileReader(nomFichier));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nomFichier), "UTF8"));
        String line;
        
        while ((line = br.readLine()) != null) {
            tab.add(line);
            i++;
        }
        
        br.close();
        
        return tab;
    }

}
