import java.util.HashMap;
import java.util.Scanner;

public class Machine (String, int){
    // Ressource de la machine
    Eau = 100
    GrainDeCafe = 50
    Gobelet = 10
    BacAMarc = 0
    Credit = 0
    Caisse = 0
    // Recettes de café
    public void RecetteCafe(String typeCafe){
        if (typeCafe == "Espresso"){
            Eau -= 10
            GrainDeCafe -= 10
            Gobelet -= 1
            BacAMarc += 1
            Prix += 1.50
        }
        else if (typeCafe == "Allongé"){
            Eau -= 20
            GrainDeCafe -= 10
            Gobelet -= 1
            BacAMarc += 1
            Prix += 2.00
        }
    }
}
// Programme principal
public class Main {
    // Vérification de la machine 
    if (BacAMarc <= 5){
        System.out.println("ERREUR : Machine entarttrée -Appelez le technicien.");
    }
    if (Credit < Prix){
        System.out.println("Crédit insuffisant, ajoutez de la monnaie.");
    }
    if (Eau < Eau.typeCafe){
        System.out.println("Plus d'eau.");
    }
    if (GrainDeCafe < GrainDeCafe.typeCafe){
        System.out.println("Plus de grain de café.");
    }
    if (Gobelet < 1){
        System.out.println("Plus de gobelet.");
    }
    else {
        System.out.println("Votre café " + typeCafe + " est prêt. Merci et à bientôt !");
        Machine -> RecetteCafe(typeCafe);
    }
    // Menu de la machine 
        while (true) {
            System.out.println("ETAT : EAU: " + Eau + "| GRAIN: " + GrainDeCafe + "\n" + "| GOBELET: " + Gobelet + " | CREDIT:" + Credit + "€ |PANNES: OK");
            System.out.println("1. Insérer une pièce (+0.50€)");
            System.out.println("2. Commander un Espresso (1.50€)");
            System.out.println("3. Commander un Allongé (2.00€)");
            System.out.println("4. MENU TECHNICIEN (Maintenance)");
            System.out.println("5. Quitter");
            
            if (choix.equals("1")) {
                Credit += 0.50;
            }
            else if (choix.equals("2")){
                Machine -> RecetteCafe("Espresso");
            }
            else if (choix.equals("3")){
                Machine -> RecetteCafe("Allongé");
            }
            // Menu de maintenance
            else if (choix.equals("4")){
                System.out.println("ETAT : EAU: " + Eau + "| GRAIN: " + GrainDeCafe + "\n" + "| GOBELET: " + Gobelet + );
                System.out.println("1. Recharger");
                System.out.println("2. Détartrer");
                System.out.println("3. Récupérer argent");
                System.out.println("5. Quitter");

                if (choix.equals("1")) {
                    Eau = 100
                    GrainDeCafe = 50
                    Gobelet = 10
                }
                else if (choix.equals("2")){
                    BacAMarc = 0
                }
                else if (choix.equals("3")){
                    Credit = 0
                }
            }
}

