package com.bytedance.ee.bear.list.folderselect.search;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchResult extends NetService.Result {
    private boolean has_more;
    private Map<String, String> headers;
    private List<Document> objs;
    private String strategy;
    private int total;

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isHas_more() {
        return this.has_more;
    }

    public List<Document> getObjs() {
        return ensureListNotNull(this.objs);
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setObjs(List<Document> list) {
        this.objs = list;
    }

    public void setStrategy(String str) {
        this.strategy = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    private List ensureListNotNull(List list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }
}
