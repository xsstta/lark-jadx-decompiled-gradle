package com.bytedance.ee.bear.search;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8175b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.search.model.DelSearchRecord;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.bear.search.model.SearchRecord;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.model.SearchResult;
import com.bytedance.ee.bear.search.p538c.C10817a;
import com.bytedance.ee.bear.search.p538c.C10818b;
import com.bytedance.ee.bear.search.wiki.C10898b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.bear.search.k */
public class C10841k {

    /* renamed from: a */
    public C1177w<SearchResult> f29049a = new C1177w<>();

    /* renamed from: b */
    public C1177w<List<SearchResponse.Data.SpaceData>> f29050b = new C1177w<>();

    /* renamed from: c */
    public String f29051c;

    /* renamed from: d */
    private C1177w<SearchHistoryResponse> f29052d = new C1177w<>();

    /* renamed from: e */
    private C1177w<List<Document>> f29053e = new C1177w<>();

    /* renamed from: f */
    private Map<String, String> f29054f = new HashMap();

    /* renamed from: g */
    private NetService f29055g;

    /* renamed from: h */
    private Call f29056h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public LiveData<SearchHistoryResponse> mo40960a() {
        return this.f29052d;
    }

    /* renamed from: c */
    public LiveData<SearchResult> mo40967c() {
        return this.f29049a;
    }

    /* renamed from: d */
    public LiveData<List<SearchResponse.Data.SpaceData>> mo40969d() {
        return this.f29050b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public LiveData<List<Document>> mo40970e() {
        return this.f29053e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC68307f<List<C8175b>> mo40961a(Set<String> set) {
        return AbstractC68307f.m265083a((Object) set).mo237985a(C11678b.m48479c()).mo238020d(new Function(set) {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$NEIzHjYLBanQqrKcsDCHIcDx88 */
            public final /* synthetic */ Set f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10841k.m44955a(this.f$0, (Set) obj);
            }
        }).mo237985a(C11678b.m48481e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40963a(NetService.C5076e eVar) {
        this.f29055g.mo20117a(new C10817a()).mo20141a(eVar).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$NIje2ImQFdOqnQR9Emdu1GQ8OA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10841k.this.m44957a((C10841k) ((SearchHistoryResponse) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$k0iui48rs3vb0qS4iK6tN8HM_c */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10841k.this.m44964d((Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40964a(SearchRecord searchRecord) {
        NetService.C5076e eVar = new NetService.C5076e();
        eVar.mo20150b("/space/api/search/update_refine_search_history/");
        searchRecord.setSource("android");
        eVar.mo20153c(JSON.toJSONString(searchRecord));
        this.f29055g.mo20118a(NetService.Result.class).mo20141a(eVar).mo238001b($$Lambda$k$0SakqddmZepGMsH5anpZhnzTZ9M.INSTANCE, $$Lambda$k$Uhlx4lywr8sJTmQ0SaFiAkDFEYA.INSTANCE);
    }

    /* renamed from: a */
    public void mo40962a(int i, C10844a aVar) {
        String str;
        final C10818b bVar;
        if (aVar == null) {
            C13479a.m54758a("SearchRepository", "search(), searchParams == null");
            return;
        }
        C13479a.m54764b("SearchRepository", "query from net, keyword:" + C13598b.m55197d(aVar.f29061a));
        Call call = this.f29056h;
        if (call != null && !call.isCanceled()) {
            this.f29056h.cancel();
        }
        if (i == 1) {
            if (!CollectionUtils.isEmpty(aVar.f29068h)) {
                aVar.f29069i.addAll(aVar.f29068h);
                aVar.f29068h.clear();
            }
            str = "/space/api/search/search_wiki/";
        } else {
            str = "/space/api/search/refine_search/";
        }
        Uri.Builder a = mo40959a(str, aVar);
        if (i == 1 || i == 2) {
            bVar = new C10898b();
        } else {
            bVar = new C10818b();
        }
        this.f29056h = this.f29055g.mo20119a(new Request.Builder().get().url(a.build().toString()).build(), new Callback() {
            /* class com.bytedance.ee.bear.search.C10841k.C108421 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (call != null && !call.isCanceled()) {
                    C13479a.m54761a("SearchRepository", iOException);
                    C10841k.this.f29049a.mo5926a((SearchResult) null);
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                C13479a.m54764b("SearchRepository", "search response");
                try {
                    C10841k.this.f29051c = response.header("request-id", "");
                    ResponseBody body = response.body();
                    if (body == null) {
                        C13479a.m54758a("SearchRepository", "search onResponse fail body is null");
                        C10841k.this.f29049a.mo5926a((SearchResult) null);
                        return;
                    }
                    C10841k.this.f29049a.mo5926a(bVar.parse(body.string()));
                } catch (Exception e) {
                    C13479a.m54761a("SearchRepository", e);
                    C10841k.this.f29049a.mo5926a((SearchResult) null);
                }
            }
        });
    }

    /* renamed from: a */
    public Uri.Builder mo40959a(String str, C10844a aVar) {
        String str2 = this.f29055g.mo20116a().f14784a + str;
        HashMap hashMap = new HashMap();
        hashMap.put(SearchIntents.EXTRA_QUERY, aVar.f29061a);
        hashMap.put("offset", String.valueOf(aVar.f29062b));
        hashMap.put("count", String.valueOf(aVar.f29063c));
        hashMap.put("search_quick_access", String.valueOf(aVar.f29071k));
        hashMap.put("candidates_type", String.valueOf(aVar.f29075o));
        if (aVar.f29064d.size() > 0) {
            if (aVar.f29064d.contains(Integer.valueOf(C8275a.f22371d.mo32555b())) && C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false) && !aVar.f29064d.contains(Integer.valueOf(C8275a.f22378k.mo32555b()))) {
                aVar.f29064d.add(Integer.valueOf(C8275a.f22378k.mo32555b()));
            }
            hashMap.put("obj_types", m44954a(aVar.f29064d));
        }
        if (!aVar.f29066f.isEmpty()) {
            hashMap.put("space_id", m44954a(aVar.f29066f));
        }
        if (aVar.f29067g.size() > 0) {
            hashMap.put("owner_id", m44954a(aVar.f29067g));
        }
        if (!(aVar.f29072l == 0 && aVar.f29073m == 0)) {
            hashMap.put("open_time", (aVar.f29072l / 1000) + "," + (aVar.f29073m / 1000));
            hashMap.put("sort_rule", String.valueOf(aVar.f29074n));
        }
        if (aVar.f29065e.size() > 0) {
            hashMap.put("file_type", m44954a(aVar.f29065e));
        }
        if (aVar.f29068h.size() > 0) {
            hashMap.put("chat_id", m44954a(aVar.f29068h));
        }
        if (aVar.f29069i.size() > 0) {
            hashMap.put("group_id", m44954a(aVar.f29069i));
        }
        if (aVar.f29070j.size() > 0) {
            hashMap.put("folder_tokens", m44954a(aVar.f29070j));
        }
        hashMap.put(ShareHitPoint.f121868c, "android");
        hashMap.put("search_location", aVar.f29076p);
        hashMap.put("config_source", String.valueOf(aVar.f29078r));
        if (TextUtils.equals("/space/api/search/refine_search/", str)) {
            hashMap.put("container_type", "1");
        }
        hashMap.put("biz_type", String.valueOf(aVar.f29079s));
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        for (Map.Entry entry : hashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo40971f() {
        String str = this.f29051c;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static NetService.C5077f m44960b() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/search/get_refine_search_history/");
        fVar.mo20143a(2);
        fVar.mo20145a(ShareHitPoint.f121868c, "android");
        return fVar;
    }

    /* renamed from: com.bytedance.ee.bear.search.k$a */
    public static class C10844a {

        /* renamed from: a */
        public String f29061a;

        /* renamed from: b */
        public int f29062b;

        /* renamed from: c */
        public int f29063c = 20;

        /* renamed from: d */
        public List<Integer> f29064d = new ArrayList();

        /* renamed from: e */
        public List<Integer> f29065e = new ArrayList();

        /* renamed from: f */
        public List<String> f29066f = new ArrayList();

        /* renamed from: g */
        public List<String> f29067g = new ArrayList();

        /* renamed from: h */
        public List<String> f29068h = new ArrayList();

        /* renamed from: i */
        public List<String> f29069i = new ArrayList();

        /* renamed from: j */
        public List<String> f29070j = new ArrayList();

        /* renamed from: k */
        public boolean f29071k = false;

        /* renamed from: l */
        public long f29072l = 0;

        /* renamed from: m */
        public long f29073m;

        /* renamed from: n */
        public int f29074n;

        /* renamed from: o */
        public int f29075o = 2;

        /* renamed from: p */
        public String f29076p = "search_docs_pri";

        /* renamed from: q */
        public int f29077q = 0;

        /* renamed from: r */
        public int f29078r = 0;

        /* renamed from: s */
        public int f29079s = 1;

        /* renamed from: a */
        public void mo40972a() {
            this.f29061a = "";
            this.f29062b = 0;
            this.f29063c = 20;
            this.f29064d.clear();
            this.f29065e.clear();
            this.f29066f.clear();
            this.f29067g.clear();
            this.f29068h.clear();
            this.f29069i.clear();
            this.f29070j.clear();
            this.f29071k = false;
            this.f29072l = 0;
            this.f29073m = 0;
            this.f29074n = 0;
            this.f29075o = 1;
        }

        /* renamed from: b */
        public boolean mo40974b() {
            if (!CollectionUtils.isEmpty(this.f29064d) || !CollectionUtils.isEmpty(this.f29065e) || !CollectionUtils.isEmpty(this.f29066f) || !CollectionUtils.isEmpty(this.f29067g) || !CollectionUtils.isEmpty(this.f29068h) || !CollectionUtils.isEmpty(this.f29069i) || !CollectionUtils.isEmpty(this.f29070j)) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void mo40976d() {
            this.f29064d.clear();
            this.f29065e.clear();
            this.f29067g.clear();
            this.f29068h.clear();
            this.f29069i.clear();
            this.f29070j.clear();
            this.f29066f.clear();
        }

        /* renamed from: c */
        public String mo40975c() {
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(this.f29067g)) {
                arrayList.add("docsAuthor");
            }
            if (!CollectionUtils.isEmpty(this.f29068h)) {
                arrayList.add("docsChatIds");
            }
            if (!CollectionUtils.isEmpty(this.f29064d) || !CollectionUtils.isEmpty(this.f29065e)) {
                arrayList.add("docTypes");
            }
            if (!CollectionUtils.isEmpty(this.f29070j)) {
                arrayList.add("docsFolder");
            }
            if (!CollectionUtils.isEmpty(this.f29066f)) {
                arrayList.add("docsSpace");
            }
            int size = arrayList.size() - 1;
            if (size == -1) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                sb.append((String) arrayList.get(i));
                if (i == size) {
                    return sb.toString();
                }
                sb.append(",");
                i++;
            }
        }

        public String toString() {
            return "SearchParams{query='" + this.f29061a + '\'' + ", offset=" + this.f29062b + ", count=" + this.f29063c + ", openTimeStart=" + this.f29072l + ", openTimeEnd=" + this.f29073m + ", fileType=" + this.f29065e + ", sortRule=" + this.f29074n + ", searchQuickAccess=" + this.f29071k + '}';
        }

        /* renamed from: a */
        public void mo40973a(String str) {
            this.f29066f.clear();
            this.f29066f.add(str);
        }
    }

    /* renamed from: a */
    public static C10841k m44952a(NetService netService) {
        return new C10841k(netService);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44958a(SearchResult searchResult) throws Exception {
        C13479a.m54764b("SearchRepository", "query from cache return value");
        this.f29049a.mo5929b(searchResult);
    }

    /* renamed from: a */
    public static NetService.C5076e m44951a(String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/search/del_refine_search_history/");
        fVar.mo20143a(1);
        DelSearchRecord delSearchRecord = new DelSearchRecord();
        delSearchRecord.setFrom(str);
        fVar.mo20153c(JSON.toJSONString(delSearchRecord));
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m44963c(Throwable th) throws Exception {
        C13479a.m54758a("SearchRepository", "saveSearchHistory(), error:" + th);
    }

    private C10841k(NetService netService) {
        this.f29055g = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m44961b(NetService.Result result) throws Exception {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("saveSearchHistory(), ");
        if (result == null) {
            str = "result=null";
        } else {
            str = "result.code=" + result.code;
        }
        sb.append(str);
        C13479a.m54772d("SearchRepository", sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m44964d(Throwable th) throws Exception {
        C13479a.m54758a("SearchRepository", "getSearchHistory() error:" + th);
        SearchHistoryResponse searchHistoryResponse = new SearchHistoryResponse();
        searchHistoryResponse.setData(new SearchHistoryResponse.Data());
        this.f29052d.mo5929b(searchHistoryResponse);
    }

    /* renamed from: a */
    private String m44954a(List list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(String.valueOf(list.get(i)));
            } else {
                sb.append(String.valueOf(list.get(i)));
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m44962b(Throwable th) throws Exception {
        C13479a.m54758a("SearchRepository", "deleteSearchHistory(), error:" + th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo40968c(String str) {
        Call call = this.f29056h;
        if (call != null && !call.isCanceled()) {
            this.f29056h.cancel();
        }
        C10844a aVar = new C10844a();
        aVar.f29077q = 2;
        aVar.f29061a = str;
        Uri.Builder a = mo40959a("/space/api/search/search_wiki/", aVar);
        a.appendQueryParameter("search_type", String.valueOf(aVar.f29077q));
        final C10898b bVar = new C10898b();
        this.f29056h = this.f29055g.mo20119a(new Request.Builder().get().url(a.build().toString()).build(), new Callback() {
            /* class com.bytedance.ee.bear.search.C10841k.C108432 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (call != null && !call.isCanceled()) {
                    C13479a.m54761a("SearchRepository", iOException);
                    C10841k.this.f29050b.mo5926a((List<SearchResponse.Data.SpaceData>) null);
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                C13479a.m54764b("SearchRepository", "search response");
                try {
                    C10841k.this.f29051c = response.header("request-id", "");
                    C10841k.this.f29050b.mo5926a(bVar.parse(response.body().string()).getSpaceDatas());
                } catch (Exception e) {
                    C13479a.m54761a("SearchRepository", e);
                    C10841k.this.f29050b.mo5926a((List<SearchResponse.Data.SpaceData>) null);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40965b(NetService.C5076e eVar) {
        this.f29055g.mo20118a(NetService.Result.class).mo20141a(eVar).mo238001b($$Lambda$k$KMoPB9FwH2_6bnDTiNnUja1VHdk.INSTANCE, $$Lambda$k$vCj33aJDtLTFiFRyxANlZ8CNnA.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40966b(String str) {
        C13479a.m54764b("SearchRepository", "query from cache, keyword:" + C13598b.m55197d(str));
        AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$ajFSF1IZT726B3geqh2ru0Zrgbw */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C10841k.m44953a(this.f$0, (String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$koqtvoksdKP4H_lcCs0GbkaMJo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10841k.this.m44958a((C10841k) ((SearchResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$DWgMENGqtdTc0K3rG_zIHYVi5W4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10841k.this.m44959a((C10841k) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m44956a(NetService.Result result) throws Exception {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("deleteSearchHistory(), ");
        if (result == null) {
            str = "result=null";
        } else {
            str = "result.code=" + result.code;
        }
        sb.append(str);
        C13479a.m54772d("SearchRepository", sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44957a(SearchHistoryResponse searchHistoryResponse) throws Exception {
        if (searchHistoryResponse.getData() == null) {
            searchHistoryResponse.setData(new SearchHistoryResponse.Data());
        }
        this.f29052d.mo5929b(searchHistoryResponse);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m44959a(Throwable th) throws Exception {
        C13479a.m54758a("SearchRepository", "query from cache exception:" + th);
        this.f29049a.mo5929b((SearchResult) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SearchResult m44953a(String str, String str2) throws Exception {
        List<Document> j = C8153a.m32844b().mo31640j(str);
        Collections.sort(j, new Comparator(str) {
            /* class com.bytedance.ee.bear.search.$$Lambda$k$lZvZEs52x1X6wGqaXsahg8K0400 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C10841k.m44950a(this.f$0, (Document) obj, (Document) obj2);
            }
        });
        boolean z = !TextUtils.isEmpty(str);
        for (int i = 0; i < j.size(); i++) {
            Document document = j.get(i);
            document.mo32431b(true);
            if (z) {
                String n = document.mo32469n();
                Matcher matcher = Pattern.compile(str, 2).matcher(n);
                ArrayList<String> arrayList = new ArrayList();
                while (matcher.find()) {
                    String substring = n.substring(matcher.start(), matcher.end());
                    if (!arrayList.contains(substring)) {
                        arrayList.add(substring);
                    }
                }
                for (String str3 : arrayList) {
                    n = n.replaceAll(str3, "<em>" + str3 + "</em>");
                }
                document.mo32443g(n);
            }
        }
        SearchResult searchResult = new SearchResult();
        searchResult.setHas_more(false);
        searchResult.setObjs(j);
        searchResult.setCandidates(new ArrayList());
        searchResult.setCorrections(new ArrayList());
        searchResult.setSuggestions(new ArrayList());
        return searchResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m44955a(Set set, Set set2) throws Exception {
        List<C8175b> list;
        if (C8153a.m32844b() != null) {
            list = C8153a.m32844b().mo31581a(set);
        } else {
            list = null;
        }
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m44950a(String str, Document document, Document document2) {
        long j;
        long j2;
        if (TextUtils.isEmpty(str)) {
            j = C13721c.m55642a(document.mo32492x(), 0L);
            j2 = C13721c.m55642a(document2.mo32492x(), 0L);
        } else {
            j = C13721c.m55642a(document.mo32479r(), 0L);
            j2 = C13721c.m55642a(document2.mo32479r(), 0L);
        }
        return Long.compare(j2, j);
    }
}
