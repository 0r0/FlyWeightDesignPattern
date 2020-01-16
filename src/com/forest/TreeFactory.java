package com.forest;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static Map<String,TreeType> treeTypes=new HashMap<>();
    public static  TreeType getTree(String name,String kind,String color){
        TreeType treeType=treeTypes.get(name);
        if(treeType==null) {
            treeTypes.put(name, new TreeType(name, kind, color));
        }
            return treeType;
        }

    }

