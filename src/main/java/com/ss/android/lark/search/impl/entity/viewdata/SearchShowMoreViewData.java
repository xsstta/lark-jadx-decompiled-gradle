package com.ss.android.lark.search.impl.entity.viewdata;

public class SearchShowMoreViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 6152700804652165430L;
    private int groupResultType;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10000002;
    }

    public int getGroupResultType() {
        return this.groupResultType;
    }

    public SearchShowMoreViewData() {
        this.id = "-1000";
    }

    public void setGroupResultType(int i) {
        this.groupResultType = i;
    }
}
