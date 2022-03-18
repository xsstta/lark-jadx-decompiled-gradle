package com.ss.android.lark.searchcommon.service.p2645c;

import com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53947b;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53907b;
import com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.searchcommon.service.c.t */
public class C53945t extends AbstractC53928d {
    /* renamed from: b */
    private List<SearchBaseInfo> m209048b(UniformLocalSearchResponse uniformLocalSearchResponse) {
        if (CollectionUtils.isEmpty(uniformLocalSearchResponse.results)) {
            return new ArrayList();
        }
        return mo184365a(mo184361a(C53907b.m208928a(uniformLocalSearchResponse)), uniformLocalSearchResponse.results);
    }

    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53925a, com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d
    /* renamed from: a */
    public SearchResponse mo184360a(UniformLocalSearchResponse uniformLocalSearchResponse) {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setHasMore(uniformLocalSearchResponse.has_more.booleanValue());
        searchResponse.setTotal(uniformLocalSearchResponse.total.intValue());
        searchResponse.setInfoList(m209048b(uniformLocalSearchResponse));
        return searchResponse;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d
    /* renamed from: a */
    public Map<Integer, AbstractC53928d.C53929a> mo184361a(C53947b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new AbstractC53928d.C53929a(mo184366a(bVar.mo184464a())));
        hashMap.put(2, new AbstractC53928d.C53929a(mo184366a(bVar.mo184466b())));
        hashMap.put(8, new AbstractC53928d.C53929a(mo184366a(bVar.mo184472e())));
        return hashMap;
    }
}
