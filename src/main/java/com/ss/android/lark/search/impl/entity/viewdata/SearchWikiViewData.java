package com.ss.android.lark.search.impl.entity.viewdata;

public class SearchWikiViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 8840222594676101581L;
    private SearchSpaceViewData searchSpaceViewData;
    private String url;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 15;
    }

    public SearchSpaceViewData getSearchSpaceViewData() {
        return this.searchSpaceViewData;
    }

    public String getUrl() {
        return this.url;
    }

    public void setSearchSpaceViewData(SearchSpaceViewData searchSpaceViewData2) {
        this.searchSpaceViewData = searchSpaceViewData2;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
