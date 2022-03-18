package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchThreadMeta;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.n */
public class C53919n extends AbstractC53906a<SearchThreadInfo, SearchThreadMeta> {

    /* renamed from: a */
    AbstractC32808a f133208a = SearchCommonModuleDependency.m208732b().mo102919i();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchThreadInfo mo184290a() {
        return new SearchThreadInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchThreadInfo searchThreadInfo, SearchThreadMeta searchThreadMeta) {
        searchThreadInfo.setChannel(this.f133208a.mo120944a(searchThreadMeta.channel));
        searchThreadInfo.setUpdateTime(searchThreadMeta.update_time.longValue());
    }
}
