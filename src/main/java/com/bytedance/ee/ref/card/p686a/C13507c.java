package com.bytedance.ee.ref.card.p686a;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.lynx.tasm.C26910m;

/* renamed from: com.bytedance.ee.ref.card.a.c */
public class C13507c {

    /* renamed from: a */
    private C26910m f35591a = new C26910m();

    /* renamed from: b */
    private CardAppInfo f35592b;

    /* renamed from: c */
    private String f35593c;

    /* renamed from: b */
    public String mo50251b() {
        return this.f35593c;
    }

    /* renamed from: c */
    public C26910m mo50252c() {
        return this.f35591a;
    }

    /* renamed from: a */
    public CardAppInfo mo50250a() {
        return this.f35592b;
    }

    /* renamed from: a */
    public C13507c mo50249a(CardAppInfo cardAppInfo) {
        this.f35592b = cardAppInfo;
        return this;
    }

    /* renamed from: a */
    public C13505b mo50248a(Context context, IAppContext iAppContext) {
        return new C13505b(context, iAppContext, this);
    }
}
