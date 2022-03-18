package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class SpaceInfo implements NonProguard, Cloneable {
    public String description;
    public boolean is_star;
    public SpaceCover space_cover;
    public String space_icon;
    public String space_id;
    public String space_name;
    public String tenant_id;
    public int wiki_scope;

    public static class SpaceCover implements NonProguard {
        public String color_value;
        public boolean is_graph_dark;
        public String key;
        public String origin;
        public String thumbnail;
    }

    @Override // java.lang.Object
    public SpaceInfo clone() {
        try {
            return (SpaceInfo) super.clone();
        } catch (Exception e) {
            C13479a.m54759a("SpaceInfo", "clone spaceInfo fail. ", e);
            return null;
        }
    }
}
