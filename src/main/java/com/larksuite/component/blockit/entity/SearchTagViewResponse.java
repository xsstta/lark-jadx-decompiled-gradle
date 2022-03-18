package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class SearchTagViewResponse implements Serializable {
    public List<TagViewStruct> tagViews;

    public static class TagViewStruct implements Serializable {
        public String description;
        public String id;
        public boolean isAvailable;
        public boolean isSubscribed;
        public String name;
        public int permissionType;
        public String teamworkerCount;
    }
}
