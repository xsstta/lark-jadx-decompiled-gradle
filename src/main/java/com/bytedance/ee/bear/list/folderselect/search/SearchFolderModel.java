package com.bytedance.ee.bear.list.folderselect.search;

import android.net.Uri;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u0016\u0010 \u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderModel;", "Lcom/bytedance/ee/bear/list/folderselect/search/ISearchFolderContract$IModel;", "operateBean", "Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/route/parcelable/DocOperateBean;Lcom/bytedance/ee/bear/contract/NetService;)V", "call", "Lokhttp3/Call;", "currentRequestId", "", "isHasMoreLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "offset", "", SearchIntents.EXTRA_QUERY, "searchResultLiveData", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "searchType", "create", "", "dealWithResult", "it", "Lcom/bytedance/ee/bear/list/folderselect/search/SearchResult;", "destroy", "getIsHasMore", "getSearchResult", "loadData", "loadFromNet", "loadMore", "sendResult", "list", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folderselect.search.d */
public final class SearchFolderModel implements ISearchFolderContract.IModel {

    /* renamed from: b */
    public static final Companion f22781b = new Companion(null);

    /* renamed from: a */
    public String f22782a = "";

    /* renamed from: c */
    private final C1177w<List<Document>> f22783c = new C1177w<>();

    /* renamed from: d */
    private final C1177w<Boolean> f22784d = new C1177w<>();

    /* renamed from: e */
    private int f22785e = 1;

    /* renamed from: f */
    private int f22786f;

    /* renamed from: g */
    private String f22787g = "";

    /* renamed from: h */
    private Call f22788h;

    /* renamed from: i */
    private final DocOperateBean f22789i;

    /* renamed from: j */
    private final NetService f22790j;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/list/folderselect/search/SearchFolderModel$Companion;", "", "()V", "API_SEARCH", "", "DEFAULT_COUNT", "", "KEY_COUNT", "KEY_OBJ_TYPES", "KEY_OFFSET", "KEY_QUERY", "KEY_SEARCH_CANDIDATES_TYPE", "KEY_SEARCH_LOCATION", "KEY_SEARCH_QUICK_ACCESS", "SEARCH_SOURCE_KEY", "SEARCH_SOURCE_VALUE", "TAG", "TYPE_LOAD_NEXT", "TYPE_NET", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IModel
    /* renamed from: b */
    public C1177w<List<Document>> mo33008b() {
        return this.f22783c;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IModel
    /* renamed from: c */
    public C1177w<Boolean> mo33009c() {
        return this.f22784d;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IModel
    /* renamed from: a */
    public void mo33006a() {
        this.f22785e = 2;
        this.f22786f += 20;
        m34969b(this.f22787g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/list/folderselect/search/SearchFolderModel$loadFromNet$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.d$e */
    public static final class C8441e implements Callback {

        /* renamed from: a */
        final /* synthetic */ SearchFolderModel f22794a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8441e(SearchFolderModel dVar) {
            this.f22794a = dVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(iOException, "e");
            this.f22794a.f22782a = "";
            if (!call.isCanceled()) {
                C13479a.m54774d("SearchFolderModel", iOException);
                this.f22794a.mo33028a((SearchResult) null);
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            String str = "";
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            C13479a.m54764b("SearchFolderModel", "search response");
            try {
                SearchFolderModel dVar = this.f22794a;
                String header = response.header("request-id", str);
                if (header != null) {
                    str = header;
                }
                dVar.f22782a = str;
                ResponseBody body = response.body();
                if (body == null) {
                    Intrinsics.throwNpe();
                }
                SearchResult a = new C8453g().parse(body.string());
                Intrinsics.checkExpressionValueIsNotNull(a, "SearchResultParser().parse(json)");
                this.f22794a.mo33028a(a);
            } catch (Exception e) {
                C13479a.m54761a("SearchFolderModel", e);
                this.f22794a.mo33028a((SearchResult) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "list", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "kotlin.jvm.PlatformType", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.d$b */
    public static final class C8438b<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C8438b f22791a = new C8438b();

        C8438b() {
        }

        /* renamed from: a */
        public final DocumentListInfo apply(List<Document> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            DocumentListInfo documentListInfo = new DocumentListInfo();
            documentListInfo.setDocumentList(new ArrayList<>());
            documentListInfo.getDocumentList().addAll(list);
            return documentListInfo;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "listInfo", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.d$c */
    public static final class C8439c<T> implements Consumer<DocumentListInfo> {

        /* renamed from: a */
        final /* synthetic */ SearchFolderModel f22792a;

        C8439c(SearchFolderModel dVar) {
            this.f22792a = dVar;
        }

        /* renamed from: a */
        public final void accept(DocumentListInfo documentListInfo) {
            SearchFolderModel dVar = this.f22792a;
            Intrinsics.checkExpressionValueIsNotNull(documentListInfo, "listInfo");
            ArrayList<Document> documentList = documentListInfo.getDocumentList();
            Intrinsics.checkExpressionValueIsNotNull(documentList, "listInfo.documentList");
            dVar.mo33029a(documentList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folderselect.search.d$d */
    public static final class C8440d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ SearchFolderModel f22793a;

        C8440d(SearchFolderModel dVar) {
            this.f22793a = dVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("SearchFolderModel", "fetch folder permission error", th);
            this.f22793a.mo33029a(new ArrayList());
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.search.ISearchFolderContract.IModel
    /* renamed from: a */
    public void mo33007a(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        this.f22787g = str;
        this.f22785e = 1;
        this.f22786f = 0;
        m34969b(str);
    }

    /* renamed from: a */
    public final void mo33029a(List<? extends Document> list) {
        ArrayList arrayList = new ArrayList();
        if (this.f22785e == 2) {
            List<Document> b = this.f22783c.mo5927b();
            if (b == null) {
                b = new ArrayList<>();
            }
            arrayList.addAll(b);
            arrayList.addAll(list);
        } else {
            arrayList.addAll(list);
        }
        this.f22783c.mo5926a(arrayList);
    }

    /* renamed from: a */
    public final void mo33028a(SearchResult searchResult) {
        boolean z;
        List<Document> list;
        C1177w<Boolean> wVar = this.f22784d;
        if (searchResult != null) {
            z = searchResult.isHas_more();
        } else {
            z = false;
        }
        wVar.mo5926a(Boolean.valueOf(z));
        if (searchResult == null || searchResult.getObjs() == null || searchResult.getObjs().size() == 0) {
            if (this.f22785e == 1) {
                list = new ArrayList<>();
            } else {
                list = this.f22783c.mo5927b();
            }
            this.f22783c.mo5926a(list);
        } else if (this.f22789i.mo20985k()) {
            List<Document> objs = searchResult.getObjs();
            Intrinsics.checkExpressionValueIsNotNull(objs, "it.objs");
            mo33029a(objs);
        } else {
            AbstractC68307f.m265083a((Object) searchResult.getObjs()).mo237985a(C11678b.m48478b()).mo238020d(C8438b.f22791a).mo238001b(new C8439c(this), new C8440d(this));
        }
    }

    /* renamed from: b */
    private final void m34969b(String str) {
        Call call;
        Call call2 = this.f22788h;
        if (!(call2 == null || call2 == null || call2.isCanceled() || (call = this.f22788h) == null)) {
            call.cancel();
        }
        Uri.Builder appendQueryParameter = Uri.parse(this.f22790j.mo20116a().f14784a + "/space/api/search/refine_search/").buildUpon().appendQueryParameter(SearchIntents.EXTRA_QUERY, str).appendQueryParameter("offset", String.valueOf(this.f22786f)).appendQueryParameter("count", String.valueOf(20));
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        String uri = appendQueryParameter.appendQueryParameter("obj_types", String.valueOf(aVar.mo32555b())).appendQueryParameter("search_quick_access", String.valueOf(false)).appendQueryParameter("candidates_type", String.valueOf(0)).appendQueryParameter("search_location", this.f22789i.mo20984j()).appendQueryParameter(ShareHitPoint.f121868c, "android").appendQueryParameter("container_type", "1").build().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "urlBuilder.appendQueryPa…              .toString()");
        this.f22788h = this.f22790j.mo20119a(new Request.Builder().get().url(uri).build(), new C8441e(this));
    }

    public SearchFolderModel(DocOperateBean docOperateBean, NetService netService) {
        Intrinsics.checkParameterIsNotNull(docOperateBean, "operateBean");
        Intrinsics.checkParameterIsNotNull(netService, "netService");
        this.f22789i = docOperateBean;
        this.f22790j = netService;
    }
}
