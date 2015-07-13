/**
 * Created by Chris on 7/10/2015.
 */
public class Ingredient extends AlchemyObject {
    private String ingredientType;
    private AlchemyEffect effect;
    private AlchemyEffect sideEffect;
    private int volatility;

    Ingredient(String ingredientType, AlchemyEffect effect, AlchemyEffect sideEffect, int volatility) {
        this.setName("Ingredient");
        this.ingredientType = ingredientType;
        this.effect = effect;
        this.sideEffect = sideEffect;
        this.volatility = volatility;
    }

    public final String getIngredientType() { return ingredientType; }
    public final void setIngredientType(final String ingredientType) { this.ingredientType = ingredientType; }

    public final AlchemyEffect getEffect() { return this.effect; }
    public final void setEffect(final AlchemyEffect effect) { this.effect = effect; }

    public final AlchemyEffect getSideEffect() { return sideEffect; }
    public final void setSideEffect(final AlchemyEffect sideEffect) { this.sideEffect = sideEffect; }

    public final int getVolatility() { return volatility; }
    public final void setVolatility(final int volatility) { this.volatility = volatility; }
}
