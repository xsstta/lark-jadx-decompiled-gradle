package com.larksuite.component.blockit.entity;

import java.io.Serializable;
import java.util.List;

public class BatchGetItemTagsRequest implements Serializable {
    public String context;
    public boolean fetchDeletePerm;
    public boolean fetchSubscribe;
    public boolean needTeamworkerCount;
    public List<String> uniqIds;
}
