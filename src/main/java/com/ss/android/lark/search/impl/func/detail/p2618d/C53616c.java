package com.ss.android.lark.search.impl.func.detail.p2618d;

import android.app.Activity;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;

/* renamed from: com.ss.android.lark.search.impl.func.detail.d.c */
public class C53616c extends BaseSearchView implements AbstractC53584f.AbstractC53592g {

    /* renamed from: h */
    private AbstractC53617a f132370h;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.d.c$a */
    public interface AbstractC53617a extends BaseSearchView.AbstractC53568a {
        /* renamed from: b */
        void mo182906b(String str);

        void h_(String str);
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.BaseSearchView
    /* renamed from: q */
    public String mo182801q() {
        return "mobile_contact";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.detail.base.BaseSearchView
    /* renamed from: l */
    public void mo182822l() {
        KeyboardUtils.hideKeyboard(this.f132297e);
        mo182826p();
    }

    /* renamed from: c */
    public void mo182800c(String str) {
        AbstractC53617a aVar = this.f132370h;
        if (aVar != null) {
            aVar.h_(str);
        }
    }

    /* renamed from: d */
    public void mo182905d(String str) {
        AbstractC53617a aVar = this.f132370h;
        if (aVar != null) {
            aVar.mo182906b(str);
        }
    }

    public C53616c(Activity activity, AbstractC53617a aVar, SearchDetailInitData searchDetailInitData) {
        super(activity, aVar, searchDetailInitData);
        this.f132370h = aVar;
    }
}
