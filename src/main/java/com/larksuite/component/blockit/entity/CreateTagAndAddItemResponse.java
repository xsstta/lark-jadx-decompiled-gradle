package com.larksuite.component.blockit.entity;

import java.io.Serializable;

public class CreateTagAndAddItemResponse implements Serializable {
    public ItemTags latestItemTags;
    public Tag tagInfo;

    public class Tag implements Serializable {
        public String created_at;
        public String creatorId;
        public String description;
        public String name;
        public String namespaceId;
        public TagSchema schema;
        public String tagId;
        public int tagPermissionSetting;
        public int type;
        public String updated_at;
        public String version;

        public Tag() {
        }
    }
}
