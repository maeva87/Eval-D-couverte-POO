import java.util.Scanner;

// Programme principal
public class Main {
    // Vérification de la machine 
    public static void main(String[] args) {
        Machine machine = new Machine();
        Scanner sc = new Scanner(System.in);
        
        if (machine.BacAMarc >= 5){
            System.out.println("ERREUR : Machine entarttrée -Appelez le technicien.");
        }
        if (machine.Credit < 1.50){
            System.out.println("Crédit insuffisant, ajoutez de la monnaie.");
        }
        if (machine.Eau < 20){
            System.out.println("Plus d'eau.");
        }
        if (machine.GrainDeCafe < 10){
            System.out.println("Plus de grain de café.");
        }
        if (machine.Gobelet < 1){
            System.out.println("Plus de gobelet.");
        }
        else {
            System.out.println("Votre café est prêt. Merci et à bientôt !");
            machine.RecetteCafe("Espresso");
        }

        // Menu de la machine 
        while (true) {
            System.out.println("ETAT : EAU: " + machine.Eau + "| GRAIN: " + machine.GrainDeCafe + "\n" + "| GOBELET: " + machine.Gobelet + " | CREDIT:" + machine.Credit + "€ |PANNES: OK");
            System.out.println("1. Insérer une pièce (+0.50€)");
            System.out.println("2. Commander un Espresso (1.50€)");
            System.out.println("3. Commander un Allongé (2.00€)");
            System.out.println("4. MENU TECHNICIEN (Maintenance)");
            System.out.println("5. Quitter");
            String choix = sc.nextLine();
            
            if (choix.equals("1")) {
                machine.Credit += 0.50;
            }
            else if (choix.equals("2")){
                machine.RecetteCafe("Espresso");
            }
            else if (choix.equals("3")){
                machine.RecetteCafe("Allongé");
            }
            // Menu de maintenance
            else if (choix.equals("4")){
                System.out.println("ETAT : EAU: " + machine.Eau + "| GRAIN: " + machine.GrainDeCafe + "\n" + "| GOBELET: " + machine.Gobelet);
                System.out.println("1. Recharger");
                System.out.println("2. Détartrer");
                System.out.println("3. Récupérer argent");
                System.out.println("4. Quitter");

                if (choix.equals("1")) {
                    machine.Eau = 100;
                    machine.GrainDeCafe = 50;
                    machine.Gobelet = 10;
                }
                else if (choix.equals("2")){
                    machine.BacAMarc = 0;
                }
                else if (choix.equals("3")){
                    machine.Credit = 0;
                }
                else if (choix.equals("4")){
                    break;
                }
            }   
            else if (choix.equals("5")){
                System.out.println("Merci et à bientôt !");
                break;
            }
        }
    }
}