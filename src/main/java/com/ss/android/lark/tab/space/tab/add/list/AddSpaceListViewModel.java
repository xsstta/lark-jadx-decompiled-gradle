package com.ss.android.lark.tab.space.tab.add.list;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "canLoadMore", "", "getCanLoadMore", "()Z", "setCanLoadMore", "(Z)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadMoreFlag", "getLoadMoreFlag", "setLoadMoreFlag", "(Landroidx/lifecycle/MutableLiveData;)V", "loadRecommendFlag", "getLoadRecommendFlag", "setLoadRecommendFlag", "loadSearchFlag", "getLoadSearchFlag", "setLoadSearchFlag", "recommendListLiveData", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "getRecommendListLiveData", "searchKeyLiveData", "", "getSearchKeyLiveData", "searchListLiveData", "getSearchListLiveData", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.tab.add.list.b */
public final class AddSpaceListViewModel extends AbstractC1142af {
    private boolean canLoadMore;
    private final C1177w<ErrorResult> errorLiveData = new C1177w<>();
    private C1177w<Boolean> loadMoreFlag = new C1177w<>();
    private C1177w<Boolean> loadRecommendFlag = new C1177w<>();
    private C1177w<Boolean> loadSearchFlag = new C1177w<>();
    private final C1177w<List<SpaceSelectViewData>> recommendListLiveData = new C1177w<>();
    private final C1177w<String> searchKeyLiveData = new C1177w<>();
    private final C1177w<List<SpaceSelectViewData>> searchListLiveData = new C1177w<>();

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final C1177w<ErrorResult> getErrorLiveData() {
        return this.errorLiveData;
    }

    public final C1177w<Boolean> getLoadMoreFlag() {
        return this.loadMoreFlag;
    }

    public final C1177w<Boolean> getLoadRecommendFlag() {
        return this.loadRecommendFlag;
    }

    public final C1177w<Boolean> getLoadSearchFlag() {
        return this.loadSearchFlag;
    }

    public final C1177w<List<SpaceSelectViewData>> getRecommendListLiveData() {
        return this.recommendListLiveData;
    }

    public final C1177w<String> getSearchKeyLiveData() {
        return this.searchKeyLiveData;
    }

    public final C1177w<List<SpaceSelectViewData>> getSearchListLiveData() {
        return this.searchListLiveData;
    }

    public final void setCanLoadMore(boolean z) {
        this.canLoadMore = z;
    }

    public final void setLoadMoreFlag(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.loadMoreFlag = wVar;
    }

    public final void setLoadRecommendFlag(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.loadRecommendFlag = wVar;
    }

    public final void setLoadSearchFlag(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.loadSearchFlag = wVar;
    }
}
