package com.bytedance.ee.bear.search.model;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchResult extends NetService.Result {
    private List<SearchResponse.Data.Candidates> candidates;
    private List<String> corrections;
    private boolean has_more;
    private Map<String, String> headers;
    private List<SearchResponse.Data.SpaceData> mSpaceDatas;
    private List<Document> objs;
    private String strategy;
    private List<String> suggestions;
    private int total;
    private List<SearchResponse.Data.WikiInfo> wikiInfos;

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

    public List<SearchResponse.Data.Candidates> getCandidates() {
        return ensureListNotNull(this.candidates);
    }

    public List<String> getCorrections() {
        return ensureListNotNull(this.corrections);
    }

    public List<Document> getObjs() {
        return ensureListNotNull(this.objs);
    }

    public List<SearchResponse.Data.SpaceData> getSpaceDatas() {
        return ensureListNotNull(this.mSpaceDatas);
    }

    public List<String> getSuggestions() {
        return ensureListNotNull(this.suggestions);
    }

    public List<SearchResponse.Data.WikiInfo> getWikiInfos() {
        return ensureListNotNull(this.wikiInfos);
    }

    public List<Document> getFileDoc() {
        ArrayList arrayList = new ArrayList();
        if (!C13657b.m55421a(this.objs)) {
            for (Document document : this.objs) {
                if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
                    arrayList.add(document);
                }
            }
        }
        return arrayList;
    }

    public boolean hasSuggestion() {
        List<String> list;
        List<String> list2;
        List<SearchResponse.Data.Candidates> list3 = this.candidates;
        if ((list3 == null || list3.isEmpty()) && (((list = this.corrections) == null || list.isEmpty()) && ((list2 = this.suggestions) == null || list2.isEmpty()))) {
            return false;
        }
        return true;
    }

    public void setCandidates(List<SearchResponse.Data.Candidates> list) {
        this.candidates = list;
    }

    public void setCorrections(List<String> list) {
        this.corrections = list;
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

    public void setSpaceDatas(List<SearchResponse.Data.SpaceData> list) {
        this.mSpaceDatas = list;
    }

    public void setStrategy(String str) {
        this.strategy = str;
    }

    public void setSuggestions(List<String> list) {
        this.suggestions = list;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public void setWikiInfos(List<SearchResponse.Data.WikiInfo> list) {
        this.wikiInfos = list;
    }

    private List ensureListNotNull(List list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }
}
