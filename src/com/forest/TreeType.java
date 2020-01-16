package com.forest;


public class TreeType {
    public String name;
    public String kind;
    public String color;

    public TreeType(String name,String kind,String color){
        this.name=name;
        this.kind=kind;
        this.color=color;
    }

    public void draw(int x, int y, String canvas,TreeType treeType){
        System.out.println("the tree is created x:"+x+" y:"+y+" canvas:"+canvas);
        System.out.println("name:"+treeType.name+" kind:"+treeType.kind+" color:"+treeType.color);
    }
}
