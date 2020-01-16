package com.company;


import com.forest.Forest;
import com.forest.TreeFactory;
import com.forest.TreeType;

public class Main {

    public static void main(String[] args) {
        TreeType treeType1 =TreeFactory.getTree("Bambo","Thin","Green");
        TreeType treeType2 =TreeFactory.getTree("Peach","Fruit","Gray");

        Forest f=new Forest();

        f.plantTrees(treeType1.name,treeType1.kind,treeType1.color,10,20);
        f.draw("hi");
        f.plantTrees(treeType2.name,treeType1.kind,treeType1.color,10,20);
        f.draw("goodbye");
    }
}
