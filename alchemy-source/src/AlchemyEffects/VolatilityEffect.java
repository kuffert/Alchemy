package AlchemyEffects;

import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public class VolatilityEffect extends AlchemyEffect {
    private int volatilityModification;

    private VolatilityEffect(final int volatilityModification) {
        this.volatilityModification = volatilityModification;
    }

    public static VolatilityEffect createEffect(final int volatilityModification) {
        return new VolatilityEffect(volatilityModification);
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setVolatility(mixture.getVolatility() + volatilityModification);
    }

    public final String summarizeEffect() {
        String plusOrMinus = volatilityModification > 0? "+" : "";
        return plusOrMinus + volatilityModification + " volatility";
    }
}
