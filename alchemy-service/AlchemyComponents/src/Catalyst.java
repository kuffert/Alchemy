/**
 * Created by Chris on 7/10/2015.
 */
public class Catalyst extends AlchemyObject {
    private String catalystType;
    private AlchemyEffect effect;
    private AlchemyEffect sideEffect;
    private double intensity;

    Catalyst(String catalystType, AlchemyEffect effect, AlchemyEffect sideEffect, double intensity) {
        this.setName("Catalyst");
        this.catalystType = catalystType;
        this.effect = effect;
        this.sideEffect = sideEffect;
        this.intensity = intensity;
    }

    public final String getCatalystType() { return catalystType; }
    public final void setCatalystType(final String catalystType) { this.catalystType = catalystType; }

    public final AlchemyEffect getEffect() { return effect; }
    public final void setEffect(final AlchemyEffect effect) { this.effect = effect; }

    public final AlchemyEffect getSideEffect() { return sideEffect; }
    public final void setSideEffect(final AlchemyEffect sideEffect) { this.sideEffect = sideEffect; }

    public final double getIntensity() { return intensity; }
    public final void setIntensity(final int intensity) { this.intensity = intensity; }
}
