package com.forest;

//import javafx.scene.canvas.Canvas;

public class TreeType {
    public String name;
    public String kind;
    public String color;
//    public static TreeType treeType;
    public TreeType(String name,String kind,String color){
        this.name=name;
        this.kind=kind;
        this.color=color;
    }
//    public static TreeType getTreeType(){
//
//    }
    public void draw(int x, int y, String canvas,TreeType treeType){
//        treeType.draw( x, y, canvas);
        System.out.println("the tree is created x:"+x+" y:"+y+" canvas:"+canvas);
        System.out.println("name:"+treeType.name+" kind:"+treeType.kind+" color:"+treeType.color);
    }
}
