package com.ss.android.vc.dto;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchResponse implements Serializable {
    private boolean hasMore;
    private List<BaseSearchInfo> searchInfos = new ArrayList();
    private String searchKey;
    private int total;

    public List<BaseSearchInfo> getMetaList() {
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

    public void setMetaList(List<BaseSearchInfo> list) {
        this.searchInfos = list;
    }

    public void setSearchKey(String str) {
        this.searchKey = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
