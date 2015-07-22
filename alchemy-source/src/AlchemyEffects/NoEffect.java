package AlchemyEffects;

import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public class NoEffect extends AlchemyEffect {
    private String description;

    private NoEffect() {
        this.description = "No Effect";
    }

    public static NoEffect createNoEffect() {
        return new NoEffect();
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        if (mixture.getEffectDescription().equals("")) {
            mixture.setEffectDescription(description);
        }
    }

    public final String summarizeEffect() {
        return "No effect";
    }
}
