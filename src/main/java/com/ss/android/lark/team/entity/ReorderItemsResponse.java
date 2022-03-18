package com.ss.android.lark.team.entity;

import java.io.Serializable;
import java.util.List;

public class ReorderItemsResponse implements Serializable {
    private static final long serialVersionUID = 7721131594293431656L;
    private List<Item> items;
    private long parentId;

    public List<Item> getItems() {
        return this.items;
    }

    public long getParentId() {
        return this.parentId;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }

    public void setParentId(long j) {
        this.parentId = j;
    }
}
