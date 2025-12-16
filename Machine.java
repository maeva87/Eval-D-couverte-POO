public class Machine{
    // Ressource de la machine
    int Eau = 100;
    int GrainDeCafe = 50;
    int Gobelet = 10;
    int BacAMarc = 0;
    double Credit = 0.0;
    double Caisse = 0.0;
    
    // Système de prix
    public static final double PRIX_ESPRESSO = 1.50;
    public static final double PRIX_ALLONGE = 2.00;
    
    // Recettes de café
    public boolean RecetteCafe (String typeCafe){
        if (typeCafe.equals("Espresso")){
            if (Credit < PRIX_ESPRESSO || Eau < 10 || GrainDeCafe < 10 || Gobelet < 1){
                return false;
            }
            Eau -= 10;
            GrainDeCafe -= 10;
            Gobelet -= 1;
            BacAMarc += 1;
            Credit -= PRIX_ESPRESSO;
            Caisse += PRIX_ESPRESSO;

            return true;
        }
        else if (typeCafe.equals("Allongé")){
            if (Credit < PRIX_ALLONGE || Eau < 20 || GrainDeCafe < 10 || Gobelet < 1) {
                return false;
            }
            Eau -= 20;
            GrainDeCafe -= 10;
            Gobelet -= 1;
            BacAMarc += 1;
            Credit -= PRIX_ALLONGE;
            Caisse += PRIX_ALLONGE;

            return true;
        }
        return false;
    }
}
