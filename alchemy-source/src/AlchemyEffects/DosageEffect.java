package AlchemyEffects;

import AlchemyMixtures.VesselBaseAndIngredientMixture;

/**
 * Created by Chris on 7/12/2015.
 */
public class DosageEffect extends AlchemyEffect {
    private int dosageModification;

    private DosageEffect(final int dosageModification) {
        this.dosageModification= dosageModification;
    }

    public static DosageEffect createEffect(final int dosageModification) {
        return new DosageEffect(dosageModification);
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setDoses(mixture.getDoses() + dosageModification);
    }

    public final String summarizeEffect() {
        String plusOrMinus = dosageModification > 0? "+" : "";
        return plusOrMinus + dosageModification + " doses";
    }
}
