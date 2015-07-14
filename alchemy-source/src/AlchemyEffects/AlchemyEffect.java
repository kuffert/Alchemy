package AlchemyEffects;

import AlchemyComponents.AlchemyComponent;
import AlchemyComponents.Catalyst;
import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public abstract class AlchemyEffect {
    public abstract void applyEffect(final VesselBaseAndIngredientMixture mixture);
    public abstract  String summarizeEffect();

    public static void applyIngredientModifications(final VesselBaseAndIngredientMixture mixture) {
        mixture.getEffect().applyEffect(mixture);
        mixture.getSideEffect().applyEffect(mixture);
    }

    public static void applyCatalystModifications(final VesselBaseAndIngredientMixture mixture, final Catalyst catalyst) {
        mixture.setVolatility(mixture.getVolatility() + catalyst.getVolatility());
        catalyst.getEffect().applyEffect(mixture);
        catalyst.getSideEffect().applyEffect(mixture);
    }

    public static String summarizeEffect(AlchemyEffect effect) {
        return effect.summarizeEffect();
    }
}
