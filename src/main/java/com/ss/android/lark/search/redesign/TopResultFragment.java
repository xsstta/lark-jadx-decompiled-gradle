package com.ss.android.lark.search.redesign;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.search.v1.Scene;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.C53329a;
import com.ss.android.lark.search.impl.func.global.p2620b.C53627a;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.search.impl.func.global.search.p2621a.C53628a;
import com.ss.android.lark.search.redesign.click.handler.IMoreItemClickListener;
import com.ss.android.lark.search.redesign.click.handler.SearchItemClickHandler;
import com.ss.android.lark.search.redesign.p2625a.C53680a;
import com.ss.android.lark.search.redesign.viewmodel.SearchFragmentViewModel;
import com.ss.android.lark.search.redesign.viewmodel.TabType;
import com.ss.android.lark.search.service.recommend.RecommendService;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFeedbackInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0017\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u001c\u0010 \u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0014J\b\u0010'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006<"}, d2 = {"Lcom/ss/android/lark/search/redesign/TopResultFragment;", "Lcom/ss/android/lark/search/redesign/BaseSearchTabFragment;", "()V", "mHasReported", "", "getMHasReported", "()Z", "setMHasReported", "(Z)V", "mNavigationBarSearchManager", "Lcom/ss/android/lark/search/impl/func/global/search/navigation/NavigationBarSearchManager;", "mRecommendRequestId", "", "mResponseCacheArray", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "mSearchFeedback", "Lcom/ss/android/lark/searchcommon/dto/info/SearchFeedbackInfo;", "mSearchFromTab", "", "mSearchResultDataGenerator", "Lcom/ss/android/lark/search/impl/func/global/result/SearchResultDataGenerator;", "moreItemClickListener", "com/ss/android/lark/search/redesign/TopResultFragment$moreItemClickListener$1", "Lcom/ss/android/lark/search/redesign/TopResultFragment$moreItemClickListener$1;", "absPosition", "position", "attachInfoForReport", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "customRecommend", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "enablePullCommonRecommend", "enablePullCustomRecommend", "needEraseResultPadding", "needShowDynamicSearchFeedback", "onFeedbackDismiss", "onFeedbackPopUp", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "recommendCacheKey", "recommendSectionList", "", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "sceneType", "Lcom/bytedance/lark/pb/search/v1/Scene$Type;", "searchMode", "selfReportSearchRequest", "selfReportSearchTime", "subPagePosition", "transform2SearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "queryKey", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.n */
public final class TopResultFragment extends BaseSearchTabFragment {

    /* renamed from: u */
    public static final Companion f132886u = new Companion(null);

    /* renamed from: o */
    public final SparseArray<SearchResponse> f132887o = new SparseArray<>();

    /* renamed from: p */
    public final C53627a f132888p = new C53627a();

    /* renamed from: q */
    public final int f132889q;

    /* renamed from: r */
    public final C53628a f132890r;

    /* renamed from: s */
    public final SearchFeedbackInfo f132891s;

    /* renamed from: t */
    public String f132892t;

    /* renamed from: v */
    private final C53832c f132893v;

    /* renamed from: w */
    private boolean f132894w;

    /* renamed from: x */
    private HashMap f132895x;

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: F */
    public boolean mo183120F() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: G */
    public boolean mo183121G() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: I */
    public boolean mo183123I() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: M */
    public boolean mo183127M() {
        return true;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: P */
    public boolean mo183130P() {
        return false;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public String mo183078a() {
        return "top_result_recommend_list_cache";
    }

    @Override // com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: g */
    public void mo183084g() {
        HashMap hashMap = this.f132895x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.search.redesign.BaseVMFragment, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo183084g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/redesign/TopResultFragment$Companion;", "", "()V", "SECTION_MAX_SHOW_COUNT", "", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: T */
    public final boolean mo183475T() {
        return this.f132894w;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: c */
    public Scene.Type mo183080c() {
        return Scene.Type.SMART_SEARCH;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: J */
    public void mo183124J() {
        SearchResultView p = mo183158p();
        SearchFeedbackInfo searchFeedbackInfo = this.f132891s;
        searchFeedbackInfo.setShow(false);
        p.mo184611a(searchFeedbackInfo);
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: K */
    public void mo183125K() {
        SearchResultView p = mo183158p();
        SearchFeedbackInfo searchFeedbackInfo = this.f132891s;
        searchFeedbackInfo.setShow(true);
        p.mo184611a(searchFeedbackInfo);
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: y */
    public void mo183167y() {
        super.mo183167y();
        this.f132887o.clear();
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: d */
    public boolean mo183081d() {
        if (!super.mo183081d() || !C53258a.m205939a().mo181745a("lark.search.common.recommend.smart_search")) {
            return false;
        }
        return true;
    }

    public TopResultFragment() {
        int i;
        C1177w<GlobalSearchOrderData> globalSearchOrderData;
        GlobalSearchOrderData b;
        SearchFragmentViewModel m = mo183155m();
        if (m == null || (globalSearchOrderData = m.getGlobalSearchOrderData()) == null || (b = globalSearchOrderData.mo5927b()) == null) {
            i = 1;
        } else {
            i = b.getSearchFromTab();
        }
        this.f132889q = i;
        this.f132890r = new C53628a(i);
        this.f132891s = new SearchFeedbackInfo();
        this.f132893v = new C53832c(this);
        mo183134a(new IGetDataCallback<SearchResponse>(this) {
            /* class com.ss.android.lark.search.redesign.TopResultFragment.C538301 */

            /* renamed from: a */
            final /* synthetic */ TopResultFragment f132896a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f132896a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
                if (r6.getResultType() == 100000014) goto L_0x0206;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d6, code lost:
                if (r6.getResultType() == 100000015) goto L_0x0206;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:74:0x01dc, code lost:
                if (r6.getResultType() == 100000016) goto L_0x0206;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:75:0x01de, code lost:
                r6 = new com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo();
                r6.setPlaceholderType(com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo.Type.CARD_FOOTER);
                r6.setId(java.lang.String.valueOf(r10));
                r5.add(r6);
                r6 = new com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo();
                r6.setPlaceholderType(com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo.Type.DIVIDER_8DP);
                r6.setId(java.lang.String.valueOf(r10));
                r5.add(r6);
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSuccess(com.ss.android.lark.searchcommon.dto.SearchResponse r18) {
                /*
                // Method dump skipped, instructions count: 877
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.TopResultFragment.C538301.onSuccess(com.ss.android.lark.searchcommon.dto.SearchResponse):void");
            }

            /* JADX WARNING: Removed duplicated region for block: B:3:0x0015  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean mo183477a(android.util.SparseArray<com.ss.android.lark.searchcommon.dto.SearchResponse> r4, java.util.List<java.lang.Integer> r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "cacheArray"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                    java.lang.String r0 = "orderList"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
                    java.util.Iterator r5 = r5.iterator()
                L_0x000e:
                    boolean r0 = r5.hasNext()
                    r1 = 1
                    if (r0 == 0) goto L_0x002f
                    java.lang.Object r0 = r5.next()
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    java.lang.Object r0 = r4.get(r0)
                    com.ss.android.lark.searchcommon.dto.SearchResponse r0 = (com.ss.android.lark.searchcommon.dto.SearchResponse) r0
                    r2 = 0
                    if (r0 == 0) goto L_0x002e
                    int r0 = r0.getFrom()
                    if (r0 == r1) goto L_0x000e
                L_0x002e:
                    return r2
                L_0x002f:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.TopResultFragment.C538301.mo183477a(android.util.SparseArray, java.util.List):boolean");
            }
        });
        this.f132892t = "";
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public List<SectionEntityType> mo183079b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.USER)));
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.APP)));
        arrayList.add(new SectionEntityType(CollectionsKt.mutableListOf(SearchEntityType.USER, SearchEntityType.GROUP_CHAT, SearchEntityType.DOC, SearchEntityType.APP, SearchEntityType.MESSAGE, SearchEntityType.ONCALL, SearchEntityType.THREAD)));
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/redesign/TopResultFragment$moreItemClickListener$1", "Lcom/ss/android/lark/search/redesign/click/handler/IMoreItemClickListener;", "onMoreItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchMoreInfo;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.n$c */
    public static final class C53832c implements IMoreItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TopResultFragment f132899a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53832c(TopResultFragment nVar) {
            this.f132899a = nVar;
        }

        @Override // com.ss.android.lark.search.redesign.click.handler.IMoreItemClickListener
        /* renamed from: a */
        public void mo183100a(SearchMoreInfo searchMoreInfo) {
            Scene.Type type;
            SearchFragmentViewModel m;
            C1177w<TabType> tabType;
            C1177w<String> queryString;
            String b;
            C1177w<String> queryString2;
            String b2;
            Intrinsics.checkParameterIsNotNull(searchMoreInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (searchMoreInfo.isHasMore()) {
                int type2 = searchMoreInfo.getType();
                if (type2 == 1) {
                    type = Scene.Type.SEARCH_CHATTERS;
                } else if (type2 == 2) {
                    type = Scene.Type.SEARCH_CHATS;
                } else if (type2 == 3) {
                    type = Scene.Type.SEARCH_MESSAGES;
                } else if (type2 != 6) {
                    String str = "";
                    if (type2 == 8) {
                        Context context = this.f132899a.getContext();
                        Scene.Type type3 = Scene.Type.SEARCH_THREAD;
                        int i = this.f132899a.f132889q;
                        SearchFragmentViewModel m2 = this.f132899a.mo183155m();
                        if (!(m2 == null || (queryString = m2.getQueryString()) == null || (b = queryString.mo5927b()) == null)) {
                            str = b;
                        }
                        C53680a.m207809a(context, type3, 8, i, str);
                        return;
                    } else if (type2 == 10) {
                        type = Scene.Type.SEARCH_HELP_DESK;
                    } else if (type2 == 12) {
                        type = Scene.Type.SEARCH_OPEN_APP_SCENE;
                    } else if (type2 == 15) {
                        type = Scene.Type.SEARCH_WIKI_SCENE;
                    } else if (type2 != 10000004) {
                        type = Scene.Type.UNKNOWN;
                    } else {
                        Context context2 = this.f132899a.getContext();
                        Scene.Type type4 = Scene.Type.SEARCH_CALENDAR_EVENT;
                        int i2 = this.f132899a.f132889q;
                        SearchFragmentViewModel m3 = this.f132899a.mo183155m();
                        if (!(m3 == null || (queryString2 = m3.getQueryString()) == null || (b2 = queryString2.mo5927b()) == null)) {
                            str = b2;
                        }
                        C53680a.m207809a(context2, type4, 10000004, i2, str);
                        return;
                    }
                } else {
                    type = Scene.Type.SEARCH_SPACE;
                }
                if (type != Scene.Type.UNKNOWN && (m = this.f132899a.mo183155m()) != null && (tabType = m.getTabType()) != null) {
                    tabType.mo5929b(new TabType(type, "more"));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo183406c(boolean z) {
        this.f132894w = z;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public void mo183137a(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "infoList");
        super.mo183137a(list);
        for (SearchBaseInfo searchBaseInfo : list) {
            searchBaseInfo.setSearchLocation("quick_search");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/TopResultFragment$customRecommend$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.n$b */
    public static final class C53831b implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ TopResultFragment f132897a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f132898b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.TopResultFragment", "pullRecommendData onError, msg: " + errorResult.getDisplayMsg());
            this.f132898b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!Intrinsics.areEqual(this.f132897a.f132892t, searchResponse.getRequestId())) {
                Log.m165383e("LarkSearch.Search.V2.TopResultFragment", "requestId not match! old: " + this.f132897a.f132892t + " return: " + searchResponse.getRequestId());
                return;
            }
            SearchCommonUtils bVar = SearchCommonUtils.f133387a;
            String a = this.f132897a.mo183078a();
            List<SearchBaseInfo> infoList = searchResponse.getInfoList();
            Intrinsics.checkExpressionValueIsNotNull(infoList, "data.infoList");
            bVar.mo184561a(a, infoList);
            this.f132898b.onSuccess(searchResponse.getInfoList());
        }

        C53831b(TopResultFragment nVar, IGetDataCallback iGetDataCallback) {
            this.f132897a = nVar;
            this.f132898b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
    /* renamed from: a */
    public int mo183116a(int i) {
        List<SearchBaseInfo> b = mo183156n().getSearchBaseInfoDataList().mo5927b();
        if (b == null) {
            return super.mo183116a(i);
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…subPagePosition(position)");
        if (i >= b.size()) {
            return super.mo183116a(i);
        }
        int i2 = i;
        while (i2 >= 0 && !(b.get(i2) instanceof SearchMoreInfo)) {
            i2--;
        }
        return (i - i2) - 1;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: b */
    public void mo183142b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (!mo183081d()) {
            if (!C53329a.m206412b()) {
                String a = C53234a.m205877a();
                Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
                this.f132892t = a;
                RecommendService.f131805a.mo181931a(this.f132892t, new C53831b(this, iGetDataCallback));
                return;
            }
            iGetDataCallback.onSuccess(CollectionsKt.emptyList());
        }
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment
    /* renamed from: a */
    public SearchContext mo183077a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "queryKey");
        this.f132894w = false;
        SearchContext a = super.mo183077a(str);
        a.mo184388a(this.f132889q);
        a.mo184428l(true);
        a.mo184430m(false);
        a.mo184432n(true);
        a.mo184438q(true);
        a.mo184440r(true);
        a.mo184407c(true);
        return a;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, com.ss.android.lark.search.redesign.click.report.SubPositionCalculator
    /* renamed from: b */
    public int mo183117b(int i) {
        List<SearchBaseInfo> b = mo183156n().getSearchBaseInfoDataList().mo5927b();
        if (b == null) {
            return super.mo183117b(i);
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "mBaseSearchTabFragmentVi…per.absPosition(position)");
        if (i > b.size()) {
            return super.mo183117b(i);
        }
        int i2 = 0;
        int i3 = 0;
        for (T t : b) {
            if (i2 == i) {
                break;
            }
            if ((t instanceof SearchPlaceholderInfo) || (t instanceof SearchMoreInfo)) {
                i3++;
            }
            i2++;
        }
        return i - i3;
    }

    @Override // com.ss.android.lark.search.redesign.BaseSearchTabFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        SearchItemClickHandler i = mo183151i();
        if (i != null) {
            i.mo183105a(this.f132893v);
        }
        mo183158p().mo184623f();
    }
}
