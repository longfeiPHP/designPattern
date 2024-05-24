package pattern.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<IComponent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(IComponent iComponent) {
        children.add(iComponent);
    }

    @Override
    public void remove(IComponent iComponent) {
        children.remove(iComponent);
    }

    @Override
    public void display() {
        System.out.println("Composite" + name);
        for (IComponent component : children) {
            component.display();
        }
    }
}
