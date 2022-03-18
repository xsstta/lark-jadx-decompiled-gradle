package com.ss.android.lark.chat.base.view.p1603a;

import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.base.view.a.c */
public class C32929c<T> implements C32930d.AbstractC32933b {

    /* renamed from: a */
    T f84616a;

    /* renamed from: b */
    List<AbstractC32928b<T>> f84617b = new ArrayList();

    /* renamed from: a */
    public C32929c<T> mo121589a(AbstractC32928b<T> bVar) {
        this.f84617b.add(bVar);
        return this;
    }

    public C32929c(T t) {
        this.f84616a = t;
    }

    @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32933b
    /* renamed from: a */
    public boolean mo121590a(C34029b bVar) {
        for (AbstractC32928b<T> bVar2 : this.f84617b) {
            if (!bVar2.accept(bVar, this.f84616a)) {
                return false;
            }
        }
        return true;
    }
}
