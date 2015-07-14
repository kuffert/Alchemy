package AlchemyRunner;

import AlchemyComponents.Base;
import AlchemyComponents.Catalyst;
import AlchemyComponents.Ingredient;
import AlchemyComponents.Vessel;
import AlchemyEffects.*;

import java.util.ArrayList;

/**
 * Created by chris on 7/13/2015.
 */
public class AlchemyDataLoader {

    public static AlchemyEffect noSideEffect = NoEffect.createNoEffect();
    public static AlchemyEffect frostBlossomEffect = IngredientEffect.createEffect("1000 Health");
    public static AlchemyEffect talivayEffect = IngredientEffect.createEffect("250 Mana");
    public static AlchemyEffect reudenEffect = IngredientEffect.createEffect("50 Stamina");
    public static AlchemyEffect silverShardEffect = IntensityEffect.createEffect(1.5d);
    public static AlchemyEffect pureWaterEffect = VolatilityEffect.createEffect(-250);
    public static AlchemyEffect pureWaterSideEffect = IntensityEffect.createEffect(.8d);
    public static AlchemyEffect lifeEssenceEffect = DosageEffect.createEffect(5);
    public static AlchemyEffect lifeEssenceSideEffect = VolatilityEffect.createEffect(100);

    public static Vessel vial = Vessel.createComponent("Vial", 3, 250, 3d);
    public static Vessel flask = Vessel.createComponent("Flask", 10, 100, 2d);
    public static Vessel potion = Vessel.createComponent("Potion", 25, 50, .5d);
    public static Vessel mistPotion = Vessel.createComponent("Mist Potion", 25, 50, .5d);

    public static Base water = Base.createComponent("Water",0, 1d);
    public static Base organicOil = Base.createComponent("Organic Oil", 10, 1.1d);
    public static Base crudeOil = Base.createComponent("Crude Oil", 50, 1.5d);

    public static Ingredient frostBlossom = Ingredient.createComponent("Frost Blossom", frostBlossomEffect, noSideEffect, 0);
    public static Ingredient talivayLeaf = Ingredient.createComponent("Talivay Leaf", talivayEffect, noSideEffect, 0);
    public static Ingredient reudenSprout = Ingredient.createComponent("Reuden Sprout", reudenEffect, noSideEffect, 0);

    public static Catalyst silverShard = Catalyst.createComponent("Silver Shard", silverShardEffect, noSideEffect, 20);
    public static Catalyst pureWater = Catalyst.createComponent("Pure Water", pureWaterEffect, pureWaterSideEffect, 0);
    public static Catalyst lifeEssence = Catalyst.createComponent("Life Essence", lifeEssenceEffect, lifeEssenceSideEffect, 50);

    public static Vessel[] vessels = new Vessel[]{vial, flask, potion, mistPotion};
    public static Base[] bases = new Base[]{water, organicOil, crudeOil};
    public static Ingredient[] ingredients = new Ingredient[]{frostBlossom, talivayLeaf, reudenSprout};
    public static  Catalyst[] catalysts = new Catalyst[]{silverShard, pureWater, lifeEssence};


}
