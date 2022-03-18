package com.ss.android.lark.searchcommon.dto.info;

public class SearchWikiInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -8785266645108862565L;
    private SearchSpaceInfo spaceInfo;
    private String url;

    public SearchSpaceInfo getSpaceInfo() {
        return this.spaceInfo;
    }

    public String getUrl() {
        return this.url;
    }

    public SearchWikiInfo() {
        this.type = 15;
    }

    public void setSpaceInfo(SearchSpaceInfo searchSpaceInfo) {
        this.spaceInfo = searchSpaceInfo;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
