package com.ss.android.lark.searchcommon.dto.info;

public class SearchMoreInfo extends SearchBaseInfo {
    private boolean mHasMore;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "more_results";
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public boolean isHasMore() {
        return this.mHasMore;
    }

    public SearchMoreInfo() {
        this.type = 10000002;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public void setHasMore(boolean z) {
        this.mHasMore = z;
    }
}
