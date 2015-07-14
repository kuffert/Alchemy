package AlchemyEffects;

import AlchemyComponents.Ingredient;
import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public class IntensityEffect extends AlchemyEffect {
    private double intensityModification;

    private IntensityEffect(final double intensityModification) {
        this.intensityModification = intensityModification;
    }

    public static IntensityEffect createEffect(final double intensityModification) {
        return new IntensityEffect(intensityModification);
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setIntensity(mixture.getIntensity() * intensityModification);
    }

    public final String summarizeEffect() {
        return intensityModification + "x intensity";
    }
}
