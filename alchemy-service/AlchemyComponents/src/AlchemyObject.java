/**
 * Created by Chris on 7/10/2015.
 */
public abstract class AlchemyObject {
    private Long id;
    private String name;

    public final Long getId() { return id; }
    public final void setId(final Long id){ this.id = id; }
    public final String getName(){ return name; }
    public final void setName(final String name) {this.name = name; }
}
