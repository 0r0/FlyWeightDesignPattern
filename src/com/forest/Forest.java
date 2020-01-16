package com.forest;

import java.util.HashMap;
import java.util.Map;

public class Forest {
    //make tree planter
    public Map<String,Tree> trees=new HashMap<>();
    Tree tree;
    static TreeType treeType;
    public void plantTrees(String name,String kind,String color,int x,int y){
     treeType=TreeFactory.getTree(name,kind,color);
     tree=new Tree(x,y,treeType);
     trees.put(name,tree);

    }
    public void draw(String canvas){
        for (String treeName:trees.keySet()) {

            tree=trees.get(treeName);
            tree.draw(canvas);
        }
    }
}
