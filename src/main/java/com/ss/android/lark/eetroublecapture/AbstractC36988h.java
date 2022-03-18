package com.ss.android.lark.eetroublecapture;

import java.util.Map;

/* renamed from: com.ss.android.lark.eetroublecapture.h */
public abstract class AbstractC36988h<T> extends C36997n {

    /* renamed from: d */
    private T f95088d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo129761a(T t);

    @Override // com.ss.android.lark.eetroublecapture.C36997n, com.ss.android.lark.eetroublebase.AbstractC36967b
    /* renamed from: c */
    public Map<String, String> mo129679c() {
        if (this.f95113c == null) {
            this.f95113c = mo129761a((Object) this.f95088d);
        }
        return this.f95113c;
    }

    public AbstractC36988h(T t) {
        this.f95088d = t;
    }

    /* renamed from: b */
    public void mo136501b(T t) {
        this.f95088d = t;
        mo136514a((Map<String, String>) null);
    }
}
