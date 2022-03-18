package com.ss.android.lark.member_manage.dto;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchResponse implements Serializable {
    private boolean hasMore;
    private String mRequestId;
    private List<SearchChatterInfo> searchInfos = new ArrayList();
    private String searchKey;
    private int total;

    public List<SearchChatterInfo> getMetaList() {
        return this.searchInfos;
    }

    public String getRequestId() {
        return this.mRequestId;
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

    public void setMetaList(List<SearchChatterInfo> list) {
        this.searchInfos = list;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setSearchKey(String str) {
        this.searchKey = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
