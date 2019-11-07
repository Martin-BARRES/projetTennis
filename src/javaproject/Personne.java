/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Calendar;
/**
 *Personne est une classe mère caractérisé par :
 * <p>
 * -nomNaissance, nomCourant,prenom, surnom, dateNaissance,lieuNaissance,dateDeces,nationalite, genre, taille, poids
 * 
 * @author ISEN
 */
abstract class Personne {
    
    /**
     * nomNaissance de personne en string
     * @see Personne#getNomNaissance() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private final String nomNaissance;
    
    /**
     * nomCourant de la Personne
     */
    private String nomCourant;
    
    /**
     * prenom de la Personne
     * @see Personne#getPrenom()
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private final String prenom;
    
    /**
     * surnom de la Personne
     * @see Personne#getSurnom() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private String surnom;
    
    /**
     * dateNaissance de la Personne
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private final String dateNaissance;
    
    /**
     * lieuNaissance de la Personne
     * @see Personne#getLieuNaissance() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private final String lieuNaissance;
    
    /**
     * dateDeces de la Personne
     * @see Personne#getDateDeces()
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
      */
    private String dateDeces;
    
    /**
     * nationalite de la Personne
     * @see Personne#getNationalite() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private String nationalite;
    
    /**
     * genre de la personne homme ou femme
     * @see Personne#getGenre() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private String genre;
    
    /**
     * taille de la personne
     * @see Personne#getTaille() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private int taille;
    
    /**
     * poids de la personne
     * @see Personne#getPoids() 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     * @see Personne#Personne(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, float) 
     */
    private float poids;
    
    /**
     * Constructeur de Personne
     * @param nomNaissance sous forme de string
     * @param nomCourant sous forme de string
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
    Personne(String nomNaissance, String nomCourant, String prenom, String surnom, String dateNaissance, String lieuNaissance, String dateDeces, String nationalite, String genre, int taille, float poids) {
        this.nomNaissance = nomNaissance;
        this.nomCourant = nomCourant;
        this.prenom = prenom;
        this.surnom = surnom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.dateDeces = dateDeces;
        this.nationalite = nationalite;
        this.taille = taille;
        this.poids = poids;
    }
    
   /**
    * Définit le NomCourant de la Personne
    * @param nomCourant sous forme de string
    */
    public void setNomCourant(String nomCourant) {
        this.nomCourant = nomCourant;
    }
    
    /**
     * Définit le Surnom
     * @param surnom sous forme de string 
     */
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
    
    /**
     * Définit la nationelite
     * @param nationalite sous forme de string 
     */
    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
    
    /**
     * Définit la taille
     * @param taille sous forme de int
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }
    
    /**
     * Définit le poid
     * @param poids sous forme de int 
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
    
    /**
     * Définit le Surnom
     * @param date sous forme de string 
     */
    public void setDateDeces(String date) {
        this.dateDeces = date;
    }
    
    /**
     * Retourne le Nom de Naissance de la Personne
     * @return sous forme de string  
     */
    public String getNomNaissance() {
        return nomNaissance;
    }
    
    /**
     * Retourne le prénom de la Personne
     * @return sous forme de string  
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     * Retourne le surnom
     * @return sous forme de string  
     */
    public String getSurnom() {
        return surnom;
    }
    
    /**
     * Retourne le Lieu de Naissance de la Personne
     * @return sous forme de string  
     */
    public String getLieuNaissance() {
        return lieuNaissance;
    }
    
    /**
     * Retourne la date de Deces de la Personne
     * @return sous forme de string  
     */
    public String getDateDeces() {
        return dateDeces;
    }
    
    /**
     * Retourne la nationalite de la Personne
     * @return sous forme de string  
     */
    public String getNationalite() {
        return nationalite;
    }
    
    /**
     * Retourne le Genre de la Personne
     * @return sous forme de string  
     */
    public String getGenre() {
        return genre;
    }
    
    /**
     * Retourne la taille de la Personne
     * @return sous forme de int  
     */
    public int getTaille() {
        return taille;
    }
    
    /**
     * Retourne le poid de la Personne
     * @return sous forme de float 
     */
    public float getPoids() {
        return poids;
    }
    
    
    /**
     * Retouurne l'age de la personne suivant la date d'aujourd'hui, sa date de Naissance et ou sa date de mort
     * @return  sous forme de int
     */
    public int getAge(){
        String[] date= this.dateNaissance.split("/");
        int year = 0;
        int month = 0;
        int day = 0;
        
        if(dateDeces.equals("")){
            year= Calendar.getInstance().get(Calendar.YEAR);
            month= Calendar.getInstance().get(Calendar.MONTH);
            day= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }
        else{
            String[] date_Deces= this.dateDeces.split("/");
            day=Integer.parseInt(date_Deces[0]);
            month=Integer.parseInt(date_Deces[1]);
            year=Integer.parseInt(date_Deces[2]);
 
        }
        
        if (  Integer.parseInt(date[1])< month ){
                //si le mois d'anniversaire se situe avant le mois actuel
            return ( year - Integer.parseInt(date[2]) );           
        }
        else{
            if ( Integer.parseInt(date[0])<=day ){
                //si la date d'anniversaire est déjà passé par rapport au jour d'aujourd'hui
                return ( year - Integer.parseInt(date[2]) );  
            }
            else{
                //Son anniversaire n'est pas encore passé
                return ( year - Integer.parseInt(date[2]) - 1 );
            }            
        }
    }  
    
}