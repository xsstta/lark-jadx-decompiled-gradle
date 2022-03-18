package com.ss.android.lark.searchcommon.dto;

import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchResponse implements Serializable {
    private static final long serialVersionUID = 2211277683604241438L;
    private SearchCommonResponseHeader.InvokeAbnormalNotice abnormalNotice;
    private int from = 1;
    private boolean hasMore;
    private String imprId = "";
    private boolean isErrorResponse = false;
    private String pageToken;
    private String query = "";
    private String recommendTitle;
    private String requestId = "";
    private int resultType;
    private Scene.Type scene;
    private List<SearchBaseInfo> searchInfo = new ArrayList();
    private int seqId;
    private String session;
    private List<SearchBaseInfo> suggestionInfo = new ArrayList();
    private int suggestionType;
    private int total;

    public SearchCommonResponseHeader.InvokeAbnormalNotice getAbnormalNotice() {
        return this.abnormalNotice;
    }

    public int getFrom() {
        return this.from;
    }

    public String getImprId() {
        return this.imprId;
    }

    public List<SearchBaseInfo> getInfoList() {
        return this.searchInfo;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRecommendTitle() {
        return this.recommendTitle;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getResultType() {
        return this.resultType;
    }

    public Scene.Type getScene() {
        return this.scene;
    }

    public int getSeqId() {
        return this.seqId;
    }

    public String getSession() {
        return this.session;
    }

    public List<SearchBaseInfo> getSuggestionList() {
        return this.suggestionInfo;
    }

    public int getSuggestionType() {
        return this.suggestionType;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean isErrorResponse() {
        return this.isErrorResponse;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(this.searchInfo);
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public void setAbnormalNotice(SearchCommonResponseHeader.InvokeAbnormalNotice invokeAbnormalNotice) {
        this.abnormalNotice = invokeAbnormalNotice;
    }

    public void setErrorResponse(boolean z) {
        this.isErrorResponse = z;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }

    public void setInfoList(List<SearchBaseInfo> list) {
        this.searchInfo = list;
    }

    public void setPageToken(String str) {
        this.pageToken = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRecommendTitle(String str) {
        this.recommendTitle = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setResultType(int i) {
        this.resultType = i;
    }

    public void setScene(Scene.Type type) {
        this.scene = type;
    }

    public void setSeqId(int i) {
        this.seqId = i;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSuggestionList(List<SearchBaseInfo> list) {
        this.suggestionInfo = list;
    }

    public void setSuggestionType(int i) {
        this.suggestionType = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
