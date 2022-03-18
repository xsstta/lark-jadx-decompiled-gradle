package com.ss.android.lark.search.service.compatible;

import com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0004J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u001e\u00104\u001a\u0002012\u0006\u00102\u001a\u0002032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J \u00106\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J \u00107\u001a\u0002012\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\nH\u0016J \u0010;\u001a\u0002012\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\nH&J \u0010<\u001a\u0002012\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\nH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u0014\u0010&\u001a\u00020'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "Lcom/ss/android/lark/search/service/compatible/ISearcher;", "()V", "backupRequestId", "", "getBackupRequestId", "()Ljava/lang/String;", "setBackupRequestId", "(Ljava/lang/String;)V", "backupSeqId", "", "getBackupSeqId", "()I", "setBackupSeqId", "(I)V", "backupSession", "getBackupSession", "setBackupSession", "mBegin", "getMBegin", "setMBegin", "mCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "getMCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "setMCallback", "(Lcom/larksuite/framework/callback/IGetDataCallback;)V", "mEnd", "getMEnd", "setMEnd", "mInnerCallback", "mPageToken", "getMPageToken", "setMPageToken", "mQueryKey", "getMQueryKey", "setMQueryKey", "mV1SearchService", "Lcom/ss/android/lark/search/service/SearchService;", "getMV1SearchService", "()Lcom/ss/android/lark/search/service/SearchService;", "mV2APIEnable", "", "getTimeForFilter", "", "date", "Ljava/util/Date;", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "parseParams", "callback", "parseParamsForInChatLoadMore", "search", "requestId", "session", "seqId", "v1Search", "v2Search", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.a */
public abstract class BaseSearcher implements ISearcher {

    /* renamed from: b */
    public static final Companion f131664b = new Companion(null);

    /* renamed from: a */
    public IGetDataCallback<SearchResponse> f131665a;

    /* renamed from: c */
    private String f131666c = "";

    /* renamed from: d */
    private IGetDataCallback<SearchResponse> f131667d;

    /* renamed from: e */
    private int f131668e;

    /* renamed from: f */
    private int f131669f = (this.f131668e + 20);

    /* renamed from: g */
    private String f131670g = "";

    /* renamed from: h */
    private final C53287b f131671h;

    /* renamed from: i */
    private final boolean f131672i;

    /* renamed from: j */
    private String f131673j;

    /* renamed from: k */
    private String f131674k;

    /* renamed from: l */
    private int f131675l;

    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
    }

    /* renamed from: b */
    public abstract void mo181854b(String str, String str2, int i);

    /* renamed from: c */
    public abstract void mo181858c(String str, String str2, int i);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/BaseSearcher$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo181844a() {
        return this.f131666c;
    }

    /* renamed from: b */
    public final IGetDataCallback<SearchResponse> mo181850b() {
        return this.f131667d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo181855c() {
        return this.f131668e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo181859d() {
        return this.f131669f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo181860e() {
        return this.f131670g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C53287b mo181861f() {
        return this.f131671h;
    }

    /* renamed from: g */
    public final String mo181862g() {
        return this.f131673j;
    }

    /* renamed from: h */
    public final String mo181863h() {
        return this.f131674k;
    }

    /* renamed from: i */
    public final int mo181864i() {
        return this.f131675l;
    }

    public BaseSearcher() {
        C53287b a = C53287b.m206193a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchService.inst()");
        this.f131671h = a;
        this.f131672i = C53258a.m205939a().mo181745a("lark.search.v2.api");
        this.f131667d = new IGetDataCallback<SearchResponse>(this) {
            /* class com.ss.android.lark.search.service.compatible.BaseSearcher.C532821 */

            /* renamed from: a */
            final /* synthetic */ BaseSearcher f131676a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f131676a = r1;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IGetDataCallback<SearchResponse> iGetDataCallback = this.f131676a.f131665a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                Intrinsics.checkParameterIsNotNull(searchResponse, "response");
                if (searchResponse.getAbnormalNotice() == SearchCommonResponseHeader.InvokeAbnormalNotice.VERSION_SWITCH) {
                    C53339b.m206445e();
                    BaseSearcher aVar = this.f131676a;
                    aVar.mo181854b(aVar.mo181862g(), this.f131676a.mo181863h(), this.f131676a.mo181864i());
                    return;
                }
                BaseSearcher aVar2 = this.f131676a;
                aVar2.mo181845a(aVar2.mo181859d());
                BaseSearcher aVar3 = this.f131676a;
                aVar3.mo181851b(aVar3.mo181855c() + 20);
                BaseSearcher aVar4 = this.f131676a;
                String pageToken = searchResponse.getPageToken();
                if (pageToken == null) {
                    pageToken = "";
                }
                aVar4.mo181848a(pageToken);
                IGetDataCallback<SearchResponse> iGetDataCallback = this.f131676a.f131665a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(searchResponse);
                }
            }
        };
        this.f131673j = "";
        this.f131674k = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo181845a(int i) {
        this.f131668e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo181851b(int i) {
        this.f131669f = i;
    }

    /* renamed from: c */
    public final void mo181856c(int i) {
        this.f131675l = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo181843a(Date date) {
        if (date == null) {
            return 0;
        }
        return date.getTime() / ((long) 1000);
    }

    /* renamed from: b */
    public final void mo181853b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f131673j = str;
    }

    /* renamed from: c */
    public final void mo181857c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f131674k = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo181848a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f131670g = str;
    }

    @Override // com.ss.android.lark.search.service.compatible.ISearcher
    /* renamed from: a */
    public void mo181847a(SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f131666c = searchContext.mo184397b();
        this.f131665a = iGetDataCallback;
        this.f131668e = 0;
        this.f131669f = 0 + 20;
        this.f131670g = "";
        mo181846a(searchContext);
    }

    @Override // com.ss.android.lark.search.service.compatible.ISearcher
    /* renamed from: b */
    public void mo181852b(SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f131665a = iGetDataCallback;
        if (searchContext != null) {
            String b = searchContext.mo184397b();
            boolean z2 = false;
            if (b == null || StringsKt.isBlank(b)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f131666c = searchContext.mo184397b();
            }
            String S = searchContext.mo184386S();
            if (S == null || StringsKt.isBlank(S)) {
                z2 = true;
            }
            if (!z2) {
                String S2 = searchContext.mo184386S();
                if (S2 == null) {
                    S2 = "";
                }
                this.f131670g = S2;
            }
            mo181846a(searchContext);
        }
    }

    @Override // com.ss.android.lark.search.service.compatible.ISearcher
    /* renamed from: a */
    public void mo181849a(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        Log.m165379d("LarkSearch.Search.V2.BaseSearcher", "session: " + str2);
        this.f131673j = str;
        this.f131674k = str2;
        this.f131675l = i;
        if (!this.f131672i || C53339b.m206444d()) {
            mo181854b(str, str2, i);
        } else {
            mo181858c(str, str2, i);
        }
    }
}
