package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class TagInstance implements Serializable {
    public String appLink;
    public boolean deletable;
    public String instanceId;
    public boolean isSubscribed;
    public TagInstanceAttr tagAttr;
    public BasicTagInfo tagInfo;
    public boolean viewable;

    public class BasicTagInfo implements Serializable {
        public String description;
        public String name;
        public List<GrantRecord4Get> owners;
        public int permissionType;
        public String tagId;
        public String teamworkerCount;

        public BasicTagInfo() {
        }
    }
}
