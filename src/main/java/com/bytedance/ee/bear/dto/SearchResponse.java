package com.bytedance.ee.bear.dto;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchResponse implements Serializable {
    private boolean hasMore;
    private List<C7584a> searchInfos = new ArrayList();
    private String searchKey;
    private int total;

    public List<C7584a> getMetaList() {
        return this.searchInfos;
    }

    public String getSearchKey() {
        return this.searchKey;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(this.searchInfos);
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setMetaList(List<C7584a> list) {
        this.searchInfos = list;
    }

    public void setSearchKey(String str) {
        this.searchKey = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public SearchResponse(List<C7584a> list, String str, int i, boolean z) {
        this.searchInfos = list;
        this.searchKey = str;
        this.total = i;
        this.hasMore = z;
    }
}
