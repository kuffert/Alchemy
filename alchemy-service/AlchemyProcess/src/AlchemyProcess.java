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
        System.out.println("Combining Vessel and Base...");
        return new VesselAndBaseMixture(vessel, base);
    }

    public static VesselBaseAndIngredientMixture combineVesselBaseAndIngredient(final VesselAndBaseMixture mixture, final Ingredient ingredient) {
        System.out.println("Combining Mixture with Ingredient...");
        VesselBaseAndIngredientMixture vesselBaseAndIngredientMixture = new VesselBaseAndIngredientMixture(mixture, ingredient);
        AlchemyEffect.applyIngredientModifications(vesselBaseAndIngredientMixture);
        return vesselBaseAndIngredientMixture;
    }

    public static Solution concoctSolution(final VesselBaseAndIngredientMixture mixture, final Catalyst catalyst) {
        System.out.println("Combining Mixture with Catalyst...");
        AlchemyEffect.applyCatalystModifications(mixture, catalyst);
        return new Solution(mixture, catalyst);
    }

    public static Solution generateFailedSolution() {
        return new Solution(AlchemyUtil.FAILED_NAME, AlchemyUtil.NO_EFFECT, AlchemyUtil.FAILED_INTENSITY, AlchemyUtil.FAILED_DOSES, AlchemyUtil.FAILED_VOLATILITY);
    }
}
