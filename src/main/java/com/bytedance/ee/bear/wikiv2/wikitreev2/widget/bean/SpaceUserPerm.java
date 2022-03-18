package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class SpaceUserPerm implements NonProguard, Cloneable {
    public boolean delete_wiki;
    public boolean edit_wiki_attribute;
    public boolean edit_wiki_collaborator;
    public boolean edit_wiki_info;
    public boolean view_wiki_attribute;
    public boolean view_wiki_collaborator;
    public boolean view_wiki_info;

    @Override // java.lang.Object
    public SpaceUserPerm clone() {
        try {
            return (SpaceUserPerm) super.clone();
        } catch (Exception e) {
            C13479a.m54759a("SpaceUserPerm", "clone spaceUserPerm fail. ", e);
            return null;
        }
    }
}
