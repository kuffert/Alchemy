package AlchemyProcess;

import AlchemyUtil.AlchemyUtil;
import AlchemyComponents.*;
import AlchemyEffects.AlchemyEffect;
import AlchemyMixtures.*;

/**
 * Created by Chris on 7/12/2015.
 */
public class AlchemyProcess {

    public static Solution createSolution(final Vessel vessel, final Base base, final Ingredient ingredient, final Catalyst catalyst) {
        try {
            VesselAndBaseMixture vesselAndBaseMixture = combineVesselAndBase(vessel, base);
            VesselBaseAndIngredientMixture vesselBaseAndIngredientMixture = combineVesselBaseAndIngredient(vesselAndBaseMixture, ingredient);
            return concoctSolution(vesselBaseAndIngredientMixture, catalyst);
        }
        catch(Exception e) {
            return generateFailedSolution();
        }
    }

    public static VesselAndBaseMixture combineVesselAndBase(final Vessel vessel, final Base base) {
        System.out.println("Combining AlchemyComponents.Vessel and AlchemyComponents.Base...");
        return VesselAndBaseMixture.createMixture(vessel, base);
    }

    public static VesselBaseAndIngredientMixture combineVesselBaseAndIngredient(final VesselAndBaseMixture mixture, final Ingredient ingredient) {
        System.out.println("Combining Mixture with AlchemyComponents.Ingredient...");
        VesselBaseAndIngredientMixture vesselBaseAndIngredientMixture = VesselBaseAndIngredientMixture.createMixture(mixture, ingredient);
        AlchemyEffect.applyIngredientModifications(vesselBaseAndIngredientMixture);
        return vesselBaseAndIngredientMixture;
    }

    public static Solution concoctSolution(final VesselBaseAndIngredientMixture mixture, final Catalyst catalyst) {
        System.out.println("Combining Mixture with AlchemyComponents.Catalyst...");
        AlchemyEffect.applyCatalystModifications(mixture, catalyst);
        return Solution.createComponent(mixture);
    }

    public static Solution generateFailedSolution() {
        return Solution.createComponent(AlchemyUtil.FAILED_NAME, AlchemyUtil.NO_EFFECT, AlchemyUtil.FAILED_INTENSITY, AlchemyUtil.FAILED_DOSES, AlchemyUtil.FAILED_VOLATILITY);
    }
}
