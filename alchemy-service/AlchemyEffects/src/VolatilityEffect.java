/**
 * Created by Chris on 7/12/2015.
 */
public class VolatilityEffect extends AlchemyEffect {
    private int volatilityModification;

    VolatilityEffect(final int volatilityModification) {
        this.volatilityModification = volatilityModification;
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setVolatility(mixture.getVolatility() + volatilityModification);
    }
}
