package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class BatchTagActionRequest implements Serializable {
    public String context;
    public List<ItemTagAction> itemsAction;

    public static class AddTagAction implements Serializable {
        public TagInstanceAttr tagAttr;
        public String tagId;
        public int tagType;
    }

    public static class ItemTagAction implements Serializable {
        public BlockInfo blockInfo;
        public List<AddTagAction> tagsAdding;
        public List<RemoveTagAction> tagsRemoving;
        public List<UpdateTagAction> tagsUpdating;
        public String uniqId;
    }

    public static class RemoveTagAction implements Serializable {
        public String tagId;
        public String tagInstanceId;
        public int tagType;
    }

    public static class UpdateTagAction implements Serializable {
        public TagInstanceAttr latestTagAttr;
        public String tagId;
        public String tagInstanceId;
        public int tagType;
    }
}
