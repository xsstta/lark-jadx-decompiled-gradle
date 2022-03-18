package com.ss.android.lark.search.service.recommend;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.urecommend.SectionEntityType;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\tJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/search/service/recommend/CommonRecommendPuller;", "", "sectionList", "", "Lcom/ss/android/lark/pb/urecommend/SectionEntityType;", "tagName", "", "(Ljava/util/List;Ljava/lang/String;)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "pageToken", "getPageToken", "()Ljava/lang/String;", "setPageToken", "(Ljava/lang/String;)V", "getSectionList", "()Ljava/util/List;", "getTagName", "canLoadMore", "onPullRecommend", "", "session", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.d.a */
public final class CommonRecommendPuller {

    /* renamed from: a */
    public static final Companion f131798a = new Companion(null);

    /* renamed from: b */
    private boolean f131799b;

    /* renamed from: c */
    private String f131800c = "";

    /* renamed from: d */
    private final List<SectionEntityType> f131801d;

    /* renamed from: e */
    private final String f131802e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/recommend/CommonRecommendPuller$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo181927a() {
        boolean z;
        if (C53258a.m205939a().mo181745a("lark.search.common.recommend.hasmore") && this.f131799b) {
            String str = this.f131800c;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo181924a(String str) {
        this.f131800c = str;
    }

    /* renamed from: a */
    public final void mo181926a(boolean z) {
        this.f131799b = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/service/recommend/CommonRecommendPuller$onPullRecommend$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.d.a$b */
    public static final class C53305b implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ CommonRecommendPuller f131803a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f131804b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f131804b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            List<SearchBaseInfo> list;
            List<SearchBaseInfo> infoList;
            SearchBaseInfo searchBaseInfo;
            String pageToken;
            List<SearchBaseInfo> infoList2;
            SearchBaseInfo searchBaseInfo2;
            List<SearchBaseInfo> infoList3;
            SearchBaseInfo searchBaseInfo3;
            List<SearchBaseInfo> infoList4;
            SearchBaseInfo searchBaseInfo4;
            String str = "";
            boolean z = false;
            if ((searchResponse == null || (infoList4 = searchResponse.getInfoList()) == null || (searchBaseInfo4 = (SearchBaseInfo) CollectionsKt.lastOrNull((List) infoList4)) == null || searchBaseInfo4.getType() != 100000017) && ((searchResponse == null || (infoList3 = searchResponse.getInfoList()) == null || (searchBaseInfo3 = (SearchBaseInfo) CollectionsKt.lastOrNull((List) infoList3)) == null || searchBaseInfo3.getType() != 100000018) && (searchResponse == null || (infoList2 = searchResponse.getInfoList()) == null || (searchBaseInfo2 = (SearchBaseInfo) CollectionsKt.lastOrNull((List) infoList2)) == null || searchBaseInfo2.getType() != 100000019))) {
                CommonRecommendPuller aVar = this.f131803a;
                if (searchResponse != null) {
                    z = searchResponse.isHasMore();
                }
                aVar.mo181926a(z);
                CommonRecommendPuller aVar2 = this.f131803a;
                if (!(searchResponse == null || (pageToken = searchResponse.getPageToken()) == null)) {
                    str = pageToken;
                }
                aVar2.mo181924a(str);
            } else {
                this.f131803a.mo181926a(false);
                this.f131803a.mo181924a(str);
            }
            if (!(!this.f131803a.mo181927a() || searchResponse == null || (infoList = searchResponse.getInfoList()) == null || (searchBaseInfo = (SearchBaseInfo) CollectionsKt.lastOrNull((List) infoList)) == null || !(searchBaseInfo instanceof SearchPlaceholderInfo))) {
                searchResponse.getInfoList().remove(searchBaseInfo);
                List<SearchBaseInfo> infoList5 = searchResponse.getInfoList();
                Intrinsics.checkExpressionValueIsNotNull(infoList5, "data.infoList");
                SearchBaseInfo searchBaseInfo5 = (SearchBaseInfo) CollectionsKt.lastOrNull((List) infoList5);
                if (searchBaseInfo5 != null && (searchBaseInfo5 instanceof SearchPlaceholderInfo)) {
                    searchResponse.getInfoList().remove(searchBaseInfo5);
                }
            }
            IGetDataCallback iGetDataCallback = this.f131804b;
            if (searchResponse != null) {
                list = searchResponse.getInfoList();
            } else {
                list = null;
            }
            iGetDataCallback.onSuccess(list);
        }

        C53305b(CommonRecommendPuller aVar, IGetDataCallback iGetDataCallback) {
            this.f131803a = aVar;
            this.f131804b = iGetDataCallback;
        }
    }

    public CommonRecommendPuller(List<SectionEntityType> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "sectionList");
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        this.f131801d = list;
        this.f131802e = str;
    }

    /* renamed from: a */
    public final void mo181925a(String str, IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "session");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        RecommendService bVar = RecommendService.f131805a;
        List<SectionEntityType> list = this.f131801d;
        String str2 = this.f131800c;
        if (str2 == null) {
            str2 = "";
        }
        bVar.mo181932a(list, str2, str, this.f131802e, new C53305b(this, iGetDataCallback));
    }
}
