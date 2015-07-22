package AlchemyRunner;

import AlchemyComponents.*;
import AlchemyProcess.AlchemyProcess;
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


    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        Vessel selectedVessel = null;
        Base selectedBase = null;
        Ingredient selectedIngredient = null;
        Catalyst selectedCatalyst = null;
        Solution solution = null;
        String userInput = null;

        AlchemyUtil.writeLine("Welcome to Alchemy! Press Enter to begin.");
        while (userInput == null) {
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
                    } else {
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
                    } else {
                        AlchemyUtil.writeLine("Please select another Vessel.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.vessels);
                    }
                    break;

                case "Potion":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.potion);
                    AlchemyUtil.writeLine("Do you want to use the potion? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedVessel = AlchemyDataLoader.potion;
                    } else {
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
                    } else {
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
        AlchemyUtil.outputComponentNames(AlchemyDataLoader.bases);

        confirmation = "n";
        while (!confirmation.equals("y")) {
            userInput = inputReader.readLine();

            switch (userInput) {

                case "Water":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.water);
                    AlchemyUtil.writeLine("Do you want to use the water? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedBase = AlchemyDataLoader.water;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.bases);
                    }
                    break;

                case "Organic Oil":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.organicOil);
                    AlchemyUtil.writeLine("Do you want to use the Organic Oil? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedBase = AlchemyDataLoader.organicOil;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.bases);
                    }
                    break;

                case "Crude Oil":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.crudeOil);
                    AlchemyUtil.writeLine("Do you want to use the Crude Oil? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedBase = AlchemyDataLoader.crudeOil;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.bases);
                    }
                    break;

                default:
                    AlchemyUtil.writeLine("Please select one of the options listed.");
                    break;
            }
        }

        AlchemyUtil.writeLine("Next, select the ingredient you would like to use.");
        AlchemyUtil.outputComponentNames(AlchemyDataLoader.ingredients);
        confirmation = "n";

        while (!confirmation.equals("y")) {
            userInput = inputReader.readLine();

            switch (userInput) {

                case "Frost Blossom":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.frostBlossom);
                    AlchemyUtil.writeLine("Do you want to use the Frost Blossom? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedIngredient = AlchemyDataLoader.frostBlossom;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.ingredients);
                    }
                    break;

                case "Talivay Leaf":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.talivayLeaf);
                    AlchemyUtil.writeLine("Do you want to use the Talivay Leaf? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedIngredient = AlchemyDataLoader.talivayLeaf;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.ingredients);
                    }
                    break;

                case "Reuden Sprout":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.reudenSprout);
                    AlchemyUtil.writeLine("Do you want to use the Reuden Sprout? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedIngredient = AlchemyDataLoader.reudenSprout;
                    } else {
                        AlchemyUtil.writeLine("Please select another Base.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.ingredients);
                    }
                    break;

                default:
                    AlchemyUtil.writeLine("Please select one of the options listed.");
                    break;
            }
        }

        AlchemyUtil.writeLine("Finally, select a catalyst.");
        AlchemyUtil.outputComponentNames(AlchemyDataLoader.catalysts);
        confirmation = "n";

        while (!confirmation.equals("y")) {
            userInput = inputReader.readLine();
            switch (userInput) {
                case "Silver Shard":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.silverShard);
                    AlchemyUtil.writeLine("Do you want to use the silver shard? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedCatalyst = AlchemyDataLoader.silverShard;
                    } else {
                        AlchemyUtil.writeLine("Please select another Catalyst.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.catalysts);
                    }
                    break;

                case "Pure Water":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.pureWater);
                    AlchemyUtil.writeLine("Do you want to use the Pure Water? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedCatalyst = AlchemyDataLoader.pureWater;
                    } else {
                        AlchemyUtil.writeLine("Please select another Catalyst.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.catalysts);
                    }
                    break;

                case "Life Essence":
                    AlchemyUtil.outputComponentSummary(AlchemyDataLoader.lifeEssence);
                    AlchemyUtil.writeLine("Do you want to use the Life Essence? (y/n)");
                    confirmation = inputReader.readLine();
                    if (confirmation.equals("y")) {
                        selectedCatalyst = AlchemyDataLoader.lifeEssence;
                    } else {
                        AlchemyUtil.writeLine("Please select another Catalyst.");
                        AlchemyUtil.outputComponentNames(AlchemyDataLoader.catalysts);
                    }
                    break;

                default:
                    AlchemyUtil.writeLine("Please select one of the options listed.");
                    break;
            }
        }

        userInput = null;
        AlchemyUtil.writeLine("All components have been selected. Press Enter to begin brewing your Solution.");
        while (userInput == null) {
            userInput = inputReader.readLine();
        }
        solution = AlchemyProcess.createSolution(selectedVessel, selectedBase, selectedIngredient, selectedCatalyst);
        AlchemyUtil.outputComponentSummary(solution);
        userInput = inputReader.readLine();
    }
}

