public class Personne{
    /*les proprietes (ou attributs) definies dans une classe
     * correspond aux caracteristique des objets qui vont
     * etre crees a partir de cette classe.
     */
    private String prenom = "defaut";
    private String nom;
    private int age;
    /**CONSTRUCTEUR
     * un constructeur est une methode qui est executee quand un objet est instancie.
     * Toutes les classes ont un constructeur par defaut dans Java. 
     * Ce constructeur a le meme nom que la classe. Par example :
     *  Personne p =new Personne();
     * 
     * On peut definir un nouveau constructeur.
     * ⚠️ Un constructeur ne DOIT PAS retourner une valeur. Donc il n'y a pas de type 
     * avant le nom de la methode lors de la declaration.
     * En general, les constructeurs sont utiliser la valeur des proprietes de l'objet.
     */
    public Personne(String name, String firstname, int old){
        nom = name;
        prenom = firstname;
        age = old;
    }
     /**
      * Quand on definit un constructeur, le constructeur par defaut n'est plus accessible.
       Si on veut l'utiliser a nouveau, il faut declarer un constructeur sans argument.
       NB : on peut laisser les {} vides si aucune instruction ne doit etre executee.
       PS : on peut declarer autant de costructeurs que l'on veut
      */
    public Personne(){} 
    
    public Personne(String prenom, int age, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    /** 
     * une fonction dans une classe est appelee une METHODE.
     * @var aucun variable n'est declaree dans cette methode
     * @param aucun parametre
     * @return String concatination du prenom et du nom
      */
    public String identite(){
        String temp= this.prenom + " " + this.nom ;
        return temp;

    }
    public String identite(boolean vrai){
        return this.prenom + " " + this.nom + ",age de" + this.age + "ans" ;
        
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
         this.age = age;
    }
    
}
/c/Users/Amel/java_cours_philiance/objet