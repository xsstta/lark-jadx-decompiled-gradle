package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.Map;

public class BatchGetItemTagsResponse implements Serializable {
    public Map<String, ItemTags> itemsTags;
}
