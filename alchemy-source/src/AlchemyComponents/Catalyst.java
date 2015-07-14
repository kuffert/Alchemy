package AlchemyComponents;

import AlchemyEffects.AlchemyEffect;

/**
 * Created by Chris on 7/10/2015.
 */
public class Catalyst extends AlchemyComponent {
    private String catalystType;
    private AlchemyEffect effect;
    private AlchemyEffect sideEffect;
    private int volatility;

    private Catalyst(final String catalystType,final AlchemyEffect effect,final AlchemyEffect sideEffect,final int intensity) {
        this.setName("Catalyst");
        this.catalystType = catalystType;
        this.effect = effect;
        this.sideEffect = sideEffect;
        this.volatility = intensity;
    }

    public static Catalyst createComponent(final String catalystType, final AlchemyEffect effect, final AlchemyEffect sideEffect, final int intensity) {
        return new Catalyst(catalystType, effect, sideEffect, intensity);
    }

    public String getComponentName() {
        return catalystType;
    }

    public String summarizeComponent() {
        return "Volatility: " + volatility + "\n" +
               "Effect: " + AlchemyEffect.summarizeEffect(effect) + "\n" +
               "Side Effect: " + AlchemyEffect.summarizeEffect(sideEffect);
    }

    public final AlchemyEffect getEffect() { return effect; }

    public final AlchemyEffect getSideEffect() { return sideEffect; }

    public final int getVolatility() { return volatility; }
}
