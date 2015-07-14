package AlchemyComponents;

/**
 * Created by Chris on 7/10/2015.
 */
public abstract class AlchemyComponent {
    private Long id;
    private String name;

    public abstract String getComponentName();
    public abstract String summarizeComponent();

    public static String getComponentName(AlchemyComponent component) {
        return component.getComponentName();
    }
    public static String summarizeComponent(AlchemyComponent component) {
        return component.summarizeComponent();
    }

    public final void setName(final String name) { this.name = name; }
}
