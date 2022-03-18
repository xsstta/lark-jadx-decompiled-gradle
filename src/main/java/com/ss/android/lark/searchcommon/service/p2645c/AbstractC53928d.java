package com.ss.android.lark.searchcommon.service.p2645c;

import android.util.SparseArray;
import com.bytedance.lark.pb.search.v1.IntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.SearchResult;
import com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53947b;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.AbstractC53906a;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53907b;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53908c;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53909d;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53910e;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53911f;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53912g;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53913h;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53914i;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53915j;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53916k;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53917l;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53918m;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53919n;
import com.ss.android.lark.searchcommon.service.p2645c.AbstractC53925a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.searchcommon.service.c.d */
public abstract class AbstractC53928d implements AbstractC53925a {

    /* renamed from: a */
    private SparseArray<AbstractC53906a> f133249a = new SparseArray<>(15);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo184362a(int i) {
        return i;
    }

    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53925a
    /* renamed from: a */
    public /* synthetic */ SearchResponse mo184360a(UniformLocalSearchResponse uniformLocalSearchResponse) {
        return AbstractC53925a.CC.$default$a(this, uniformLocalSearchResponse);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<Integer, C53929a> mo184361a(C53947b bVar);

    public AbstractC53928d() {
        m209022a();
    }

    /* renamed from: a */
    private void m209022a() {
        this.f133249a.put(1, new C53909d());
        this.f133249a.put(11, new C53917l());
        this.f133249a.put(2, new C53908c());
        this.f133249a.put(3, new C53914i());
        this.f133249a.put(6, new C53918m());
        this.f133249a.put(8, new C53919n());
        this.f133249a.put(10000001, new C53910e());
        this.f133249a.put(10, new C53911f());
        this.f133249a.put(12, new C53915j());
        this.f133249a.put(13, new C53912g());
        this.f133249a.put(16, new C53913h());
        this.f133249a.put(21, new C53916k());
    }

    /* renamed from: com.ss.android.lark.searchcommon.service.c.d$a */
    public static class C53929a {

        /* renamed from: a */
        public Map<String, ?> f133250a;

        public C53929a(Map<String, ?> map) {
            this.f133250a = map;
        }
    }

    /* renamed from: b */
    private List<SearchBaseInfo> m209023b(LocalIntegrationSearchResponse localIntegrationSearchResponse) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(localIntegrationSearchResponse.results)) {
            return arrayList;
        }
        return mo184365a(mo184361a(C53907b.m208927a(localIntegrationSearchResponse)), localIntegrationSearchResponse.results);
    }

    /* renamed from: a */
    public SearchResponse mo184363a(IntegrationSearchResponse integrationSearchResponse) {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setHasMore(integrationSearchResponse.has_more.booleanValue());
        searchResponse.setTotal(integrationSearchResponse.total.intValue());
        searchResponse.setInfoList(mo184367b(integrationSearchResponse));
        return searchResponse;
    }

    /* renamed from: a */
    public SearchResponse mo184364a(LocalIntegrationSearchResponse localIntegrationSearchResponse) {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setHasMore(localIntegrationSearchResponse.has_more.booleanValue());
        searchResponse.setTotal(localIntegrationSearchResponse.total.intValue());
        searchResponse.setInfoList(m209023b(localIntegrationSearchResponse));
        return searchResponse;
    }

    /* renamed from: b */
    public List<SearchBaseInfo> mo184367b(IntegrationSearchResponse integrationSearchResponse) {
        if (CollectionUtils.isEmpty(integrationSearchResponse.results)) {
            return new ArrayList();
        }
        return mo184365a(mo184361a(C53907b.m208926a(integrationSearchResponse)), integrationSearchResponse.results);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> Map<String, T> mo184366a(Map<String, T> map) {
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<SearchBaseInfo> mo184365a(Map<Integer, C53929a> map, List<SearchResult> list) {
        ArrayList arrayList = new ArrayList();
        for (SearchResult searchResult : list) {
            if (searchResult != null) {
                int a = mo184362a(searchResult.type.getValue());
                C53929a aVar = map.get(Integer.valueOf(a));
                if (!(aVar == null || CollectionUtils.isEmpty(aVar.f133250a) || aVar.f133250a.get(searchResult.id) == null)) {
                    arrayList.add(this.f133249a.get(a).mo184291a(searchResult, aVar.f133250a.get(searchResult.id)));
                }
            }
        }
        return arrayList;
    }
}
