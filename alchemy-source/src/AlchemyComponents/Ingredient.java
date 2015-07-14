package AlchemyComponents;

import AlchemyEffects.AlchemyEffect;

/**
 * Created by Chris on 7/10/2015.
 */
public class Ingredient extends AlchemyComponent {
    private String ingredientType;
    private AlchemyEffect effect;
    private AlchemyEffect sideEffect;
    private int volatility;

    private Ingredient(final String ingredientType,final AlchemyEffect effect,final AlchemyEffect sideEffect,final int volatility) {
        this.setName("Ingredient");
        this.ingredientType = ingredientType;
        this.effect = effect;
        this.sideEffect = sideEffect;
        this.volatility = volatility;
    }

    public static Ingredient createComponent(final String ingredientType, final AlchemyEffect effect, final AlchemyEffect sideEffect, final int volatility) {
        return new Ingredient(ingredientType, effect, sideEffect, volatility);
    }

    public String getComponentName() {
        return ingredientType;
    }

    public String summarizeComponent() {
        return "Volatility: " + volatility + "\n" +
               "Effect: " + AlchemyEffect.summarizeEffect(effect) + "\n" +
               "Side Effect: " + AlchemyEffect.summarizeEffect(sideEffect);
    }

    public final AlchemyEffect getEffect() { return this.effect; }

    public final AlchemyEffect getSideEffect() { return sideEffect; }

    public final int getVolatility() { return volatility; }
}
