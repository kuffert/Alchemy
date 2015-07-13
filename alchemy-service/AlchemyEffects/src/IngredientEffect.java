/**
 * Created by Chris on 7/12/2015.
 */
public class IngredientEffect extends AlchemyEffect {
    private String effectDescription;

    IngredientEffect(final String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setEffectDescription(effectDescription);
    }
}
