package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class SearchTagsResponse implements Serializable {
    public boolean needCreate;
    public List<TagStruct> tags;
}
