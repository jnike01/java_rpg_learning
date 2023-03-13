package basicrpg;

public class Player extends Character{
    // integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    // arrays to store skill names
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};
    
    // player specific constructor
    public Player(String name) {
        // calling constructor of super class
        super(name, 100, 0);

        // setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;

        // let the player choose a trait when creating a new character
        chooseTrait();
    }

    // player specific methods 
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defense() {
        return 0;
    }  

    // let the player choose a trait of either skill path
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait:");

        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);

        // get the player's choice
        int input = GameLogic.readInt("-> ", 2);

        GameLogic.clearConsole();

        // deal with both cases
        if(input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;
        } else{
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
        }

        GameLogic.anythingToContinue();
    }
}
