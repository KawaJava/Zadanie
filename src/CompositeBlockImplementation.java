import java.util.List;

public class CompositeBlockImplementation implements CompositeBlock {
    private final String color;
    private final String material = "composite";
    private final List<Block> blocks;

    public CompositeBlockImplementation(String color, List<Block> blocks) {
        this.color = color;
        this.blocks = List.copyOf(blocks);
    }
    
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
