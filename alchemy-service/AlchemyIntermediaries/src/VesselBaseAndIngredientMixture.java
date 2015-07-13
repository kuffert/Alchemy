/**
 * Created by Chris on 7/13/2015.
 */
public class VesselBaseAndIngredientMixture extends VesselAndBaseMixture {
    private AlchemyEffect effect;
    private AlchemyEffect sideEffect;

    VesselBaseAndIngredientMixture(final String vesselType, final int doses, final int maxVolatility, final double intensity, final int volatility, final AlchemyEffect effect, final AlchemyEffect sideEffect) {
        super(vesselType, doses, maxVolatility, intensity, volatility);
        this.effect = effect;
        this.sideEffect = sideEffect;
    }

    VesselBaseAndIngredientMixture(final VesselAndBaseMixture vesselAndBaseMixture, final Ingredient ingredient) {
        super(vesselAndBaseMixture.getVesselType(), vesselAndBaseMixture.getDoses(), vesselAndBaseMixture.getMaxVolatility(), vesselAndBaseMixture.getIntensity(), vesselAndBaseMixture.getVolatility());
        this.effect = ingredient.getEffect();
        this.sideEffect = ingredient.getSideEffect();
    }
    public final AlchemyEffect getEffect() { return this.effect; }
    public final void setEffect(final AlchemyEffect effect) { this.effect = effect; }

    public final AlchemyEffect getSideEffect() { return sideEffect; }
    public final void setSideEffect(final AlchemyEffect sideEffect) { this.sideEffect = sideEffect; }
}
