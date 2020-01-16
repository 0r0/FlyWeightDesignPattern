package com.forest;



public class Tree {

    public int x;
    public int y;
    public TreeType treeType;

    public Tree(int x,int y,TreeType treeType)
    {
        this.x=x;
        this.y=y;
        this.treeType=treeType;

    }
    public void draw( String canvas){
        treeType.draw( this.x, this.y, canvas,this.treeType);

    }
}
