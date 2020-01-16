package com.forest;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
     static Map<String,TreeType> treeTypes=new HashMap<>();
    public static  TreeType getTree(String name,String kind,String color){
        TreeType treeType;
        treeType = treeTypes.get(name);
        if(treeType==null) {
            treeType=new TreeType(name, kind, color);
            treeTypes.put(name, treeType);
        }
            return treeType;
        }

    }

