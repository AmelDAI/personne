public class Main {
    public static void main (String[] args){
        /* Lorsqu'on declare une variable de type objet, on dit que l'on fait une INSTANCIATION.
        Un objet est une Instance d'une classe */
        Personne p = new Personne("Onyme", "Anne", 50);
         //p.prenom ="Anne";
         //p.nom = "Onyme";
         //p.setAge(50);
         System.out.println("Nom :" + p.nom);
         System.out.println("prenom :" + p.prenom);
         System.out.println("Age :" + p.getAge());
         
         System.out.println(p.identite());
         Personne p1 = new Personne();
         //p1.prenom ="Jean";
         //p1.nom = "Cerien";
         //p1.setAge(25);
         p1.prenom ="Jean";
         p1.nom = "Cerien";
         p1.setAge(25);
         System.out.println(" Identite de p1 :" + p1.identite());

          
          /* 
         * EXERCICES : 
         * 1. Déclarer un tableau d'objets Personne.
         * 2. Remplir le tableau avec les données utilisées dans exempleArray.java (cf. ci-dessous)
         * 3. Affichez toutes les identités des personnes (en utilisant la méthode identite()).
         * 4. ajoutez un constructeur qui permet d'instancier 
         *      une personne en définissant directement son prénom, 
         *      son nom et son âge. (Cherchez sur internet ce qu'est un constructeur
         		et comment le déclarer)
         */
        // la declaration de tableau :
        Personne[] tableauPersonnes = new Personne[10];
        for(int i =0; i< tableauPersonnes.length;i++){
            tableauPersonnes[i]=new Personne();
        }
        //tableauPersonnes[0]= new Personne();
        tableauPersonnes[0].prenom= "Gerard";
        tableauPersonnes[0].nom= "Menfin";
        tableauPersonnes[0].setAge(35);
        //tableauPersonnes[0]= new Personne();
        tableauPersonnes[0].prenom= "Nordine";
        tableauPersonnes[0].nom= "Ateur";
        tableauPersonnes[0].setAge(20);

        for (Personne personne : tableauPersonnes){
            System.out.println(personne.identite() + " " + personne.getAge());
        }

        /* NULL est un type de donnees particulier ( qu'on peut considerer comme une valeur particuliere).
         * une variable de type objet qui n'a pas ete initialisee est considere comme etant NULL.
         */



    }
         
}