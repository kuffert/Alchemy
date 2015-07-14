package AlchemyComponents;

import AlchemyEffects.AlchemyEffect;
import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/10/2015.
 */
public class Solution extends AlchemyComponent {
    private String solutionName;
    private AlchemyEffect effect;
    private double intensity;
    private int doses;
    private int volatility;


    private Solution(final String solutionName, final AlchemyEffect effect, final double intensity, final int doses, final int volatility) {
        this.solutionName = solutionName;
        this.effect = effect;
        this.intensity = intensity;
        this.doses = doses;
        this.volatility = volatility;
    }

    private Solution (final VesselBaseAndIngredientMixture mixture) {
        this.effect = mixture.getEffect();
        this.intensity = mixture.getIntensity();
        this.doses = mixture.getDoses();
        this.volatility  = mixture.getVolatility() < 0? 0 : mixture.getVolatility();
        this.solutionName = mixture.getEffectDescription() + " " +  mixture.getVesselType();
    }

    public static Solution createComponent(final String solutionName, final AlchemyEffect effect, final double intensity, final int doses, final int volatility) {
        return new Solution(solutionName, effect, intensity, doses, volatility);
    }

    public static Solution createComponent(final VesselBaseAndIngredientMixture mixture) {
        return new Solution(mixture);
    }

    public String getComponentName() {
        return solutionName;
    }

    public String summarizeComponent() {
        return solutionName + "\n" +
                "Dosage: " + doses + "\n" +
                "Intensity: " + intensity + "\n" +
                "Volatility: " + volatility;
    }

    public final AlchemyEffect getEffect() { return effect; }
    public final void setEffect(final AlchemyEffect effect) { this.effect = effect; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final double intensity) { this.intensity = intensity; }
}
