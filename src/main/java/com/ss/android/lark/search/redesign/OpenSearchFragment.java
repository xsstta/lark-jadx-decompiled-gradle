package com.ss.android.lark.search.redesign;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.searches.SearchTab;
import com.ss.android.lark.search.redesign.viewmodel.SearchFragmentViewModel;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/search/redesign/OpenSearchFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "customRecommendCanLoadMore", "", "getCustomRecommendCanLoadMore", "()Z", "setCustomRecommendCanLoadMore", "(Z)V", "mSearchFilterInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "checkFilterUsable", "clearOpenSearchFilter", "", "customRecommend", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "customRecommendLoadMore", "enablePullCommonRecommend", "enablePullCustomRecommend", "needEraseRecommendPadding", "onResume", "recommendViewNeedHeader", "selfRecommendClickHandler", "isSelected", "position", "", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "", "Response2ListCallback", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.l */
public final class OpenSearchFragment extends BaseSearchTabFragment {

    /* renamed from: o */
    private SearchOpenSearchInfo f132838o;

    /* renamed from: p */
    private boolean f132839p;

    /* renamed from: q */
    private HashMap f132840q;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: L */
    public boolean mo183126L() {
        return false;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: M */
    public boolean mo183127M() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: O */
    public boolean mo183129O() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132840q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        super.mo183081d();
        return false;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: w */
    public boolean mo183165w() {
        if (this.f132838o != null) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final void mo183455T() {
        this.f132838o = null;
        mo183139a(mo183165w());
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C1177w<SearchOpenSearchInfo> searchOpenSearchFilterInfo;
        C1177w<SearchOpenSearchInfo> searchOpenSearchFilterInfo2;
        super.onResume();
        if (this.f132838o != null) {
            SearchFragmentViewModel m = mo183155m();
            if (m != null && (searchOpenSearchFilterInfo2 = m.getSearchOpenSearchFilterInfo()) != null) {
                searchOpenSearchFilterInfo2.mo5929b(this.f132838o);
                return;
            }
            return;
        }
        SearchFragmentViewModel m2 = mo183155m();
        if (m2 != null && (searchOpenSearchFilterInfo = m2.getSearchOpenSearchFilterInfo()) != null) {
            searchOpenSearchFilterInfo.mo5929b((SearchOpenSearchInfo) null);
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public boolean mo183146b(SearchResponse searchResponse) {
        return this.f132839p;
    }

    /* renamed from: c */
    public final void mo183406c(boolean z) {
        this.f132839p = z;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public void mo183142b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo183159q().mo181873a("", mo183077a(""), new Response2ListCallback(this, iGetDataCallback, false));
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: c */
    public void mo183147c(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo183159q().mo181874b("", null, new Response2ListCallback(this, iGetDataCallback, true));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/redesign/OpenSearchFragment$Response2ListCallback;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "callback", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isLoadMore", "", "(Lcom/ss/android/lark/search/redesign/OpenSearchFragment;Lcom/larksuite/framework/callback/IGetDataCallback;Z)V", "getCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "()Z", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.l$a */
    public final class Response2ListCallback implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ OpenSearchFragment f132841a;

        /* renamed from: b */
        private final IGetDataCallback<List<SearchBaseInfo>> f132842b;

        /* renamed from: c */
        private final boolean f132843c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String str = this.f132841a.TAG;
            Log.m165379d(str, "onError, msg: " + errorResult.getDisplayMsg());
            this.f132842b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            SearchCommonResponseHeader.InvokeAbnormalNotice invokeAbnormalNotice;
            List<SearchBaseInfo> infoList;
            if (searchResponse != null) {
                invokeAbnormalNotice = searchResponse.getAbnormalNotice();
            } else {
                invokeAbnormalNotice = null;
            }
            boolean z = false;
            if (invokeAbnormalNotice != SearchCommonResponseHeader.InvokeAbnormalNotice.REQUEST_CANCELED) {
                OpenSearchFragment lVar = this.f132841a;
                if (searchResponse != null) {
                    z = searchResponse.isHasMore();
                }
                lVar.mo183406c(z);
                ArrayList arrayList = new ArrayList();
                if (!(searchResponse == null || (infoList = searchResponse.getInfoList()) == null)) {
                    for (T t : infoList) {
                        if (t instanceof SearchOpenSearchInfo) {
                            arrayList.add(t);
                        }
                    }
                }
                this.f132842b.onSuccess(arrayList);
            } else if (!this.f132843c) {
                this.f132841a.mo183145b(false);
            }
        }

        public Response2ListCallback(OpenSearchFragment lVar, IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback, boolean z) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f132841a = lVar;
            this.f132842b = iGetDataCallback;
            this.f132843c = z;
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        String str2;
        String extra;
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        SearchContext a = super.mo183077a(str);
        SearchTab searchTab = mo183150h().toSearchTab();
        String str3 = "";
        if (searchTab == null || (str2 = searchTab.mapp_id) == null) {
            str2 = str3;
        }
        a.mo184408d(str2);
        SearchOpenSearchInfo searchOpenSearchInfo = this.f132838o;
        if (!(searchOpenSearchInfo == null || (extra = searchOpenSearchInfo.getExtra()) == null)) {
            str3 = extra;
        }
        a.mo184412e(str3);
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public boolean mo183140a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        C1177w<SearchOpenSearchInfo> searchOpenSearchFilterInfo;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(searchBaseInfo instanceof SearchOpenSearchInfo)) {
            return false;
        }
        SearchOpenSearchInfo searchOpenSearchInfo = (SearchOpenSearchInfo) searchBaseInfo;
        if (searchOpenSearchInfo.getSlash_command_type() != SlashCommandMeta.SlashCommandType.FILTER) {
            return false;
        }
        SearchFragmentViewModel m = mo183155m();
        if (!(m == null || (searchOpenSearchFilterInfo = m.getSearchOpenSearchFilterInfo()) == null)) {
            searchOpenSearchFilterInfo.mo5929b((SearchOpenSearchInfo) searchBaseInfo);
        }
        this.f132838o = searchOpenSearchInfo;
        mo183139a(mo183165w());
        return true;
    }
}
