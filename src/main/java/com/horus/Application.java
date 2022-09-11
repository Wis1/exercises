package main.java.com.horus;

import java.util.List;
import java.util.Objects;

public class Application {

    public static void main(String[]args){

        ExampleBlock block1= new ExampleBlock();
        block1.addBlock("red", "beton");
        block1.addBlock("yellow", "beton");
        block1.addBlock("black", "beton");
        block1.addBlock("pink", "wooden");
        block1.addBlock("grey", "wooden");
        block1.addBlock("grey", "wooden");
        block1.addBlock("blue", "wooden");

        List list=block1.getBlocks();
        Wall wall= new Wall(list);

        System.out.println("Total number of items: "+wall.count());
        wall.findBlockByColor("white").ifPresentOrElse(System.out::println, ()-> System.out.println("Color is absent"));
        System.out.println("List of blocks by material: ");
        wall.findBlocksByMaterial("wooden").stream().map(Objects::toString).forEach(System.out::println);
    }
}
