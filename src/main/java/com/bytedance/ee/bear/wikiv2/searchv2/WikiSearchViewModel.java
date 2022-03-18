package com.bytedance.ee.bear.wikiv2.searchv2;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchPuller;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0006\u0010\u0015\u001a\u00020\u0012J\u001a\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastParams", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchPuller$Params;", "puller", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchPuller;", "searchResultList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "getSearchResultList", "()Landroidx/lifecycle/MutableLiveData;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "cancelSearch", "", "doSearch", "searchParams", "loadmore", "search", "queryKey", "", "spaceId", "searchSpace", "spaceType", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.d */
public final class WikiSearchViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C68289a disposable = new C68289a();
    private WikiSearchPuller.Params lastParams;
    private final WikiSearchPuller puller = new WikiSearchPuller((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
    private final C1177w<List<C12360b>> searchResultList = new C1177w<>();
    private final C10917c serviceContext = new C10917c(new C10929e());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchViewModel$Companion;", "", "()V", "TAG", "", "get", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WikiSearchViewModel mo47090a(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            AbstractC1142af a = aj.m5364a(fragment).mo6005a(WikiSearchViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(fr…rchViewModel::class.java)");
            return (WikiSearchViewModel) a;
        }
    }

    public final C1177w<List<C12360b>> getSearchResultList() {
        return this.searchResultList;
    }

    public final void cancelSearch() {
        C13479a.m54764b("Wiki_WikiSearchViewModel", "cancel search. ");
        this.disposable.mo237935a();
    }

    public final void loadmore() {
        C13479a.m54764b("Wiki_WikiSearchViewModel", "load next page. ");
        WikiSearchPuller.Params params = this.lastParams;
        if (params != null) {
            params.offset += params.count;
            doSearch(params);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.d$c */
    public static final class C12366c<T> implements Consumer<List<? extends C12360b>> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchViewModel f33181a;

        C12366c(WikiSearchViewModel dVar) {
            this.f33181a = dVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends C12360b> list) {
            this.f33181a.getSearchResultList().mo5929b((List<C12360b>) list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "it", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchPuller$Data;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.d$b */
    public static final class C12365b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchPuller.Params f33180a;

        C12365b(WikiSearchPuller.Params params) {
            this.f33180a = params;
        }

        /* renamed from: a */
        public final List<C12360b> apply(WikiSearchPuller.Data data) {
            Intrinsics.checkParameterIsNotNull(data, "it");
            return C12359a.m51447a(data, this.f33180a.query, TextUtils.isEmpty(this.f33180a.space_id));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.searchv2.d$d */
    public static final class C12367d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiSearchViewModel f33182a;

        C12367d(WikiSearchViewModel dVar) {
            this.f33182a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("Wiki_WikiSearchViewModel", "request search fail. ", th);
            this.f33182a.getSearchResultList().mo5929b((List<C12360b>) null);
        }
    }

    private final void doSearch(WikiSearchPuller.Params params) {
        cancelSearch();
        C13479a.m54764b("Wiki_WikiSearchViewModel", "doSearch. ");
        this.disposable.mo237937a(this.puller.pull((Serializable) params).mo238020d(new C12365b(params)).mo238001b(new C12366c(this), new C12367d(this)));
    }

    public final void search(String str, String str2) {
        C13479a.m54764b("Wiki_WikiSearchViewModel", "search. ");
        if (str == null || str2 == null) {
            C13479a.m54758a("Wiki_WikiSearchViewModel", "search, queryKey or spaceId is null. ");
            return;
        }
        WikiSearchPuller.Params params = new WikiSearchPuller.Params();
        params.query = str;
        params.space_id = str2;
        params.offset = 0;
        params.count = 20;
        params.search_field = "0";
        params.search_type = 1;
        params.need_main_path = 1;
        params.source = "android";
        this.lastParams = params;
        doSearch(params);
    }

    public final void searchSpace(String str, int i) {
        Integer num;
        C13479a.m54764b("Wiki_WikiSearchViewModel", "searchSpace. ");
        if (str == null) {
            C13479a.m54758a("Wiki_WikiSearchViewModel", "searchSpace, queryKey is null. ");
            return;
        }
        WikiSearchPuller.Params params = new WikiSearchPuller.Params();
        params.query = str;
        params.space_id = "";
        params.offset = 0;
        params.count = 20;
        params.search_field = "0";
        params.search_type = 2;
        params.need_main_path = 1;
        params.source = "android";
        if (i == -1) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        params.wiki_space_type = num;
        this.lastParams = params;
        doSearch(params);
    }

    public static /* synthetic */ void searchSpace$default(WikiSearchViewModel dVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        dVar.searchSpace(str, i);
    }
}
