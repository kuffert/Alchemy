package AlchemyEffects;

import AlchemyComponents.Ingredient;
import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public class IngredientEffect extends AlchemyEffect {
    private String effectDescription;

    private IngredientEffect(final String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public static IngredientEffect createEffect(final String effectDescription) {
        return new IngredientEffect(effectDescription);
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setEffectDescription(effectDescription);
    }

    public final String summarizeEffect() {
        return effectDescription;
    }
}
