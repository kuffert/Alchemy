package AlchemyRunner;

import AlchemyComponents.*;
import AlchemyUtil.AlchemyUtil;
import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by chris on 7/14/2015.
 */
public class AlchemyRunner {

    public static void main(String [] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        Vessel selectedVessel = null;
        Base selectedBase = null;
        Ingredient selectedIngredient = null;
        Catalyst selectedCatalyst = null;
        String userInput = null;

        AlchemyUtil.writeLine("Welcome to Alchemy! Press Enter to begin.");
        while(userInput == null) {
            userInput = inputReader.readLine();
        }

        AlchemyUtil.writeLine("First, Select the kind of Vessel to brew your concoction.");
        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);

        String confirmation = "n";
        while (!confirmation.equals("y")) {
            userInput = inputReader.readLine();

            switch (userInput) {
                case "Vial":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.vial);
                    AlchemyUtil.writeLine("Do you want to use the vial? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedVessel = AlchemyDataLoader.vial;
                    }
                    else {
                        AlchemyUtil.writeLine("Please select another Vessel.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);
                    }
                    break;

                case "Flask":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.flask);
                    AlchemyUtil.writeLine("Do you want to use the flask? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedVessel = AlchemyDataLoader.flask;
                    }
                    else {
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);
                    }
                    break;

                case "Potion":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.potion);
                    AlchemyUtil.writeLine("Do you want to use the potion? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedVessel = AlchemyDataLoader.potion;
                    }
                    else {
                        AlchemyUtil.writeLine("Please select another Vessel.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);
                    }
                    break;

                case "Mist Potion":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.mistPotion);
                    AlchemyUtil.writeLine("Do you want to use the mist potion? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedVessel = AlchemyDataLoader.mistPotion;
                    }
                    else {
                        AlchemyUtil.writeLine("Please select another Vessel.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);
                    }
                    break;

                default:
                    AlchemyUtil.writeLine("Please select one of the options listed.");
                    break;
            }
        }

        AlchemyUtil.writeLine("Next, select a Base for your concoction.");
        userInput = inputReader.readLine();
    }
}
