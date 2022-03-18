package com.ss.android.lark.search.impl.func.detail.p2617c;

import android.app.Activity;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.detail.c.d */
public class C53608d extends BaseSearchView implements AbstractC53584f.AbstractC53590e {

    /* renamed from: h */
    private AbstractC53609a f132365h;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.c.d$a */
    public interface AbstractC53609a extends BaseSearchView.AbstractC53568a {
        void g_(String str);
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.BaseSearchView
    /* renamed from: q */
    public String mo182801q() {
        return "mobile_thread";
    }

    /* renamed from: c */
    public void mo182800c(String str) {
        this.f132365h.g_(str);
    }

    public C53608d(Activity activity, AbstractC53609a aVar, SearchDetailInitData searchDetailInitData) {
        super(activity, aVar, searchDetailInitData);
        this.f132365h = aVar;
    }
}
