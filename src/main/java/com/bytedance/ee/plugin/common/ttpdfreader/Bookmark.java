package com.bytedance.ee.plugin.common.ttpdfreader;

import java.util.List;

public class Bookmark {
    private List<Bookmark> children;
    private long pageIdx;
    private String title;

    public List<Bookmark> getChildren() {
        return this.children;
    }

    public long getPageIdx() {
        return this.pageIdx;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }

    public Bookmark(List<Bookmark> list, String str, long j) {
        this.children = list;
        this.title = str;
        this.pageIdx = j;
    }
}
