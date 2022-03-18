package com.tt.miniapp.shortcut.p3329b;

import android.app.Activity;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.shortcut.ShortcutResult;

/* renamed from: com.tt.miniapp.shortcut.b.a */
public abstract class AbstractC66828a {

    /* renamed from: a */
    AbstractC66828a f168583a;

    /* renamed from: b */
    Activity f168584b;

    /* renamed from: c */
    C66838e f168585c;

    /* renamed from: d */
    protected IAppContext f168586d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ShortcutResult mo232759b();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC66828a mo232757a() {
        return this.f168583a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo232758a(AbstractC66828a aVar) {
        this.f168583a = aVar;
    }

    AbstractC66828a(C66838e eVar, IAppContext iAppContext) {
        this.f168585c = eVar;
        this.f168586d = iAppContext;
        this.f168584b = eVar.f168603d;
    }
}
