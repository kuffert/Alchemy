/**
 * Created by Chris on 7/12/2015.
 */
public class NoEffect extends AlchemyEffect {
    private String description;

    NoEffect() {
        this.description = "No Effect";
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setEffectDescription(description);
    }
}
