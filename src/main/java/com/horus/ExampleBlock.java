package main.java.com.horus;

import java.util.ArrayList;
import java.util.List;

public class ExampleBlock implements CompositeBlock{


    private String color;
    private String material;
    private List<Block> blocks= new ArrayList<>();

    public ExampleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public ExampleBlock() {
    }

    public void addBlock(String color, String material){
        blocks.add(new ExampleBlock(color,material));
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
    public List getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "ExampleBlock{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
