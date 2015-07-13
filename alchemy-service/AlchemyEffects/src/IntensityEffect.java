/**
 * Created by Chris on 7/12/2015.
 */
public class IntensityEffect extends AlchemyEffect {
    private double intensityModification;

    IntensityEffect(final double intensityModification) {
        this.intensityModification = intensityModification;
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setIntensity(mixture.getIntensity() * intensityModification);
    }
}
