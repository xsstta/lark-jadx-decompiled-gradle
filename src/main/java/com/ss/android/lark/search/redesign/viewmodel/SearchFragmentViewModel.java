package com.ss.android.lark.search.redesign.viewmodel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/search/redesign/viewmodel/SearchFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "globalSearchOrderData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/search/impl/func/global/search/entity/GlobalSearchOrderData;", "getGlobalSearchOrderData", "()Landroidx/lifecycle/MutableLiveData;", "setGlobalSearchOrderData", "(Landroidx/lifecycle/MutableLiveData;)V", "queryString", "", "getQueryString", "setQueryString", "searchInfoHistory", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "getSearchInfoHistory", "searchOpenSearchFilterInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "getSearchOpenSearchFilterInfo", "tabType", "Lcom/ss/android/lark/search/redesign/viewmodel/TabType;", "getTabType", "setTabType", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.b.b */
public final class SearchFragmentViewModel extends AbstractC1142af {
    private C1177w<GlobalSearchOrderData> globalSearchOrderData = new C1177w<>();
    private C1177w<String> queryString = new C1177w<>();
    private final C1177w<SearchInfoHistory> searchInfoHistory = new C1177w<>();
    private final C1177w<SearchOpenSearchInfo> searchOpenSearchFilterInfo = new C1177w<>();
    private C1177w<TabType> tabType = new C1177w<>();

    public final C1177w<GlobalSearchOrderData> getGlobalSearchOrderData() {
        return this.globalSearchOrderData;
    }

    public final C1177w<String> getQueryString() {
        return this.queryString;
    }

    public final C1177w<SearchInfoHistory> getSearchInfoHistory() {
        return this.searchInfoHistory;
    }

    public final C1177w<SearchOpenSearchInfo> getSearchOpenSearchFilterInfo() {
        return this.searchOpenSearchFilterInfo;
    }

    public final C1177w<TabType> getTabType() {
        return this.tabType;
    }

    public final void setGlobalSearchOrderData(C1177w<GlobalSearchOrderData> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.globalSearchOrderData = wVar;
    }

    public final void setQueryString(C1177w<String> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.queryString = wVar;
    }

    public final void setTabType(C1177w<TabType> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.tabType = wVar;
    }
}
