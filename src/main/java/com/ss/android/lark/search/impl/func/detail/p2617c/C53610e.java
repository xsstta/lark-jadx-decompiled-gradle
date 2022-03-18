package com.ss.android.lark.search.impl.func.detail.p2617c;

import com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.Scene;

/* renamed from: com.ss.android.lark.search.impl.func.detail.c.e */
public class C53610e extends AbstractC53576c implements AbstractC53584f.AbstractC53589d {

    /* renamed from: d */
    private C53608d f132366d;

    /* renamed from: e */
    private C53606b f132367e;

    public C53610e(C53608d dVar, C53606b bVar) {
        super(dVar, bVar);
        this.f132366d = dVar;
        this.f132367e = bVar;
    }

    /* renamed from: a */
    public void mo182902a(String str, int i, String str2, String str3) {
        m207551a(i, str, str2, str3);
        this.f132367e.mo182841a(str, SearchCommonConstants.FeedType.THREAD);
        this.f132366d.mo182800c(str);
    }

    /* renamed from: a */
    private void m207551a(int i, String str, String str2, String str3) {
        mo182875c();
        mo182865a(this.f132367e.mo182853l(), SearchCommonConstants.SearchHistorySource.MESSAGE);
        m207552b(i, str, str2, str3);
    }

    /* renamed from: b */
    private void m207552b(int i, String str, String str2, String str3) {
        mo182869a("thread", "mobile_thread", i, str, str3, Scene.Type.SEARCH_MESSAGES.getNumber(), str2);
    }
}
