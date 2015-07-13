/**
 * Created by Chris on 7/10/2015.
 */
public class Solution extends AlchemyObject {
    private String solutionName;
    private AlchemyEffect effect;
    private double intensity;
    private int doses;
    private int volatility;


    Solution(final String solutionName, final AlchemyEffect effect, final double intensity, final int doses, final int volatility) {
        this.solutionName = solutionName;
        this.effect = effect;
        this.intensity = intensity;
        this.doses = doses;
        this.volatility = volatility;
    }

    Solution (final VesselBaseAndIngredientMixture mixture, final Catalyst catalyst) {
        this.solutionName = mixture.getEffectDescription() + " " +  mixture.getVesselType();
        this.effect = mixture.getEffect();
        this.intensity = mixture.getIntensity();
        this.doses = mixture.getDoses();
        this.volatility  = mixture.getVolatility();
    }

    public final String getSolutionName() { return solutionName; }
    public final void setSolutionName(final String solutionName) { this.solutionName = solutionName; }

    public final AlchemyEffect getEffect() { return effect; }
    public final void setEffect(final AlchemyEffect effect) { this.effect = effect; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final double intensity) { this.intensity = intensity; }
}
