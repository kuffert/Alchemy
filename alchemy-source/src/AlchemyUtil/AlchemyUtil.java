package AlchemyUtil;

import AlchemyComponents.AlchemyComponent;
import AlchemyEffects.AlchemyEffect;
import AlchemyEffects.NoEffect;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Chris on 7/12/2015.
 */
public class AlchemyUtil {
    public static double DEFAULT_INTENSITY = 1d;
    public static double FAILED_INTENSITY = 0d;
    public static int FAILED_VOLATILITY = 0;
    public static String FAILED_NAME = "Failed Solution";
    public static int FAILED_DOSES = 0;
    public static AlchemyEffect NO_EFFECT = NoEffect.createNoEffect();

    public static void writeLine(final String output){
        System.out.println(output);
    }

    public static ArrayList<String> getComponentNames(AlchemyComponent[] components) {
        ArrayList<String> componentNames = new ArrayList<>();
        for (AlchemyComponent component : components) {
            componentNames.add(component.getComponentName());
        }
        return componentNames;
    }

    public static void outputComponentNames(AlchemyComponent[] components) {
        writeLine(Arrays.toString(getComponentNames(components).toArray()));
    }

    public static boolean isValidComponent(AlchemyComponent[] components, String userInput) {
        return getComponentNames(components).contains(userInput);
    }

    public static void outputComponentSummary(AlchemyComponent component) {
        writeLine(AlchemyComponent.summarizeComponent(component));
    }
}
