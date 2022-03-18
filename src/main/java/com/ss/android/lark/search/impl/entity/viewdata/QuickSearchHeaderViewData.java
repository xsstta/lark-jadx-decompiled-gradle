package com.ss.android.lark.search.impl.entity.viewdata;

public class QuickSearchHeaderViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 6702297742521173221L;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10000006;
    }

    public QuickSearchHeaderViewData() {
        setId("-10086");
    }
}
