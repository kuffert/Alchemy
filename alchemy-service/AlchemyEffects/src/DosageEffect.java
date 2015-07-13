/**
 * Created by Chris on 7/12/2015.
 */
public class DosageEffect extends AlchemyEffect {
    private int dosageModification;

    DosageEffect(final int dosageModification) {
        this.dosageModification= dosageModification;
    }

    public final void applyEffect(final VesselBaseAndIngredientMixture mixture) {
        mixture.setDoses(mixture.getDoses() + dosageModification);
    }
}
