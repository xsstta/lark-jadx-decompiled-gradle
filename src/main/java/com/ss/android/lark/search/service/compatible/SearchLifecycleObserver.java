package com.ss.android.lark.search.service.compatible;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J&\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearchLifecycleObserver;", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "useGlobalSession", "", "(Z)V", "mOldSeqId", "", "mSearcherRepo", "Lcom/ss/android/lark/search/service/compatible/SearcherRepo;", "mSeqId", "mSession", "", "mType", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "incSeqId", "", "onLoadMore", "requestId", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onSearch", "seqId", "session", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.c */
public final class SearchLifecycleObserver implements ISearchLifecycleObserver {

    /* renamed from: a */
    public static final Companion f131700a = new Companion(null);

    /* renamed from: b */
    private Scene.Type f131701b;

    /* renamed from: c */
    private String f131702c;

    /* renamed from: d */
    private int f131703d;

    /* renamed from: e */
    private int f131704e;

    /* renamed from: f */
    private final SearcherRepo f131705f;

    /* renamed from: g */
    private final boolean f131706g;

    public SearchLifecycleObserver() {
        this(false, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearchLifecycleObserver$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final int m206135a() {
        if (this.f131706g) {
            return SessionManager.m209246b();
        }
        return this.f131703d;
    }

    /* renamed from: b */
    private final String m206136b() {
        if (this.f131706g) {
            return SessionManager.m209245a();
        }
        return this.f131702c;
    }

    /* renamed from: c */
    private final void m206137c() {
        if (this.f131706g) {
            SessionManager.f133395a.mo184570d();
        } else {
            this.f131703d++;
        }
    }

    @Override // com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver
    /* renamed from: a */
    public void mo181872a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        ISearcher a = this.f131705f.mo181875a(this.f131701b);
        if (a != null) {
            a.mo181849a(str, m206136b(), this.f131704e);
        }
    }

    public SearchLifecycleObserver(boolean z) {
        this.f131706g = z;
        this.f131701b = Scene.Type.UNKNOWN;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append(UUID.randomUUID());
        this.f131702c = sb.toString();
        this.f131705f = new SearcherRepo();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchLifecycleObserver(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver
    /* renamed from: b */
    public void mo181874b(String str, SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Scene.Type type;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (this.f131701b != Scene.Type.UNKNOWN) {
            type = this.f131701b;
        } else if (searchContext == null || (type = searchContext.mo184387a()) == null) {
            type = Scene.Type.UNKNOWN;
        }
        this.f131701b = type;
        ISearcher a = this.f131705f.mo181875a(type);
        if (a != null) {
            a.mo181852b(searchContext, iGetDataCallback);
            a.mo181849a(str, m206136b(), this.f131704e);
        }
    }

    @Override // com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver
    /* renamed from: a */
    public void mo181873a(String str, SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Log.m165389i("LarkSearch.Search.V2.SearchLifecycleObserver", "onSearch ing, requestId: " + str + ", query pattern: " + SearchCommonUtils.m209228a(searchContext.mo184397b()) + ", " + "scene type: " + searchContext.mo184387a() + ", seqId: " + m206135a());
        this.f131701b = searchContext.mo184387a();
        this.f131704e = m206135a();
        ISearcher a = this.f131705f.mo181875a(this.f131701b);
        if (a != null) {
            a.mo181847a(searchContext, iGetDataCallback);
            a.mo181849a(str, m206136b(), m206135a());
        }
        m206137c();
    }
}
