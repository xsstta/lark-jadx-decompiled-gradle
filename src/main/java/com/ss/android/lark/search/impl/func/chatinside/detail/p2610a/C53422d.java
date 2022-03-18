package com.ss.android.lark.search.impl.func.chatinside.detail.p2610a;

import android.text.TextUtils;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.d */
public class C53422d extends AbstractC53447b<SearchBaseInfo> {

    /* renamed from: c */
    private final C53417a f132035c;

    /* renamed from: d */
    private final C53420c f132036d;

    public C53422d(C53417a aVar, C53420c cVar) {
        super(aVar, cVar);
        this.f132035c = aVar;
        this.f132036d = cVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b
    /* renamed from: b */
    public void mo182472b(SearchBaseInfo searchBaseInfo, int i) {
        this.f132036d.mo182469a(searchBaseInfo, !TextUtils.isEmpty(this.f132035c.mo182515b()));
    }
}
