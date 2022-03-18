package com.ss.android.lark.search.impl.func.detail.base;

import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a.AbstractC53586a;
import com.ss.android.lark.searchcommon.p2634b.C53883a;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.i */
public abstract class AbstractC53597i<VD extends SearchBaseViewData, T extends AbstractC53584f.AbstractC53585a.AbstractC53586a> {
    /* renamed from: a */
    public void mo182787a(VD vd, int i, String str, T t) {
    }

    /* renamed from: b */
    public abstract void mo182790b(VD vd, int i, T t);

    /* renamed from: a */
    public final void mo182883a(VD vd, int i, T t) {
        mo182790b(vd, i, t);
        C53883a.m208794a().mo183800c();
    }
}
