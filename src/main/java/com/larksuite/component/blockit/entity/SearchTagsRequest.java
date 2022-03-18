package com.larksuite.component.blockit.entity;

import java.io.Serializable;

public class SearchTagsRequest implements Serializable {
    public boolean isPreciseSearch;
    public String tagName;
    public String uniqueId;
}
