package com.ss.android.lark.search.impl.func.chatinside.entity;

import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChatInsideSearchResponse implements Serializable {
    private SearchCommonResponseHeader.InvokeAbnormalNotice abnormalNotice;
    private boolean hasMore;
    private String imprId;
    private String requestId;
    private final List<SearchBaseInfo> searchItems = new ArrayList();
    private String searchKey;
    private int total;

    public SearchCommonResponseHeader.InvokeAbnormalNotice getAbnormalNotice() {
        return this.abnormalNotice;
    }

    public String getImprId() {
        return this.imprId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<SearchBaseInfo> getSearchItems() {
        return this.searchItems;
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
        return CollectionUtils.isEmpty(this.searchItems);
    }

    public void setAbnormalNotice(SearchCommonResponseHeader.InvokeAbnormalNotice invokeAbnormalNotice) {
        this.abnormalNotice = invokeAbnormalNotice;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSearchKey(String str) {
        this.searchKey = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setSearchItems(List<SearchBaseInfo> list) {
        this.searchItems.clear();
        this.searchItems.addAll(list);
    }
}
