package com.ss.android.lark.image.impl.p1962b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* renamed from: com.ss.android.lark.image.impl.b.l */
public class C38864l {

    /* renamed from: a */
    private final Context f99848a;

    /* renamed from: b */
    private String f99849b;

    /* renamed from: c */
    private AbstractC38860j f99850c;

    /* renamed from: d */
    private AbstractC38869o f99851d;

    /* renamed from: e */
    private Handler f99852e;

    /* renamed from: a */
    public C38864l mo142376a(String str) {
        this.f99849b = str;
        return this;
    }

    /* renamed from: a */
    public C38852d mo142374a(File file) {
        return m153396a((AbstractC38858h) new C38856f(file), false);
    }

    /* renamed from: a */
    private void m153404a(boolean z) {
        AbstractC38869o oVar = this.f99851d;
        if (oVar == null) {
            return;
        }
        if (z) {
            m153401a(new Runnable() {
                /* class com.ss.android.lark.image.impl.p1962b.$$Lambda$l$Yw5HP8fuas2rTqZaz_KYgDe1ecc */

                public final void run() {
                    C38864l.lambda$Yw5HP8fuas2rTqZaz_KYgDe1ecc(C38864l.this);
                }
            });
        } else {
            oVar.mo142390a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153398a() {
        this.f99851d.mo142390a();
    }

    /* renamed from: a */
    public C38864l mo142375a(AbstractC38860j jVar) {
        this.f99850c = jVar;
        return this;
    }

    private C38864l(Context context) {
        this.f99848a = context;
    }

    /* renamed from: a */
    public static C38864l m153397a(Context context) {
        return new C38864l(context);
    }

    /* renamed from: a */
    private C38849c m153395a(AbstractC38858h hVar) {
        return C38849c.m153353a().mo142348a(hVar).mo142349a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153399a(C38852d dVar) {
        this.f99851d.mo142391a(dVar);
    }

    /* renamed from: a */
    private void m153401a(Runnable runnable) {
        if (this.f99852e == null) {
            this.f99852e = new Handler(Looper.getMainLooper());
        }
        this.f99852e.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153402a(Throwable th) {
        this.f99851d.mo142392a(th);
    }

    /* renamed from: a */
    private C38852d m153396a(AbstractC38858h hVar, boolean z) {
        m153404a(z);
        try {
            C38852d a = new C38847a(new C38848b(this.f99848a, this.f99849b), new C38855e(this.f99850c)).mo142345a(m153395a(hVar));
            m153400a(a, z);
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            m153403a(e, z);
            return new C38852d(e);
        }
    }

    /* renamed from: a */
    private void m153400a(C38852d dVar, boolean z) {
        AbstractC38869o oVar = this.f99851d;
        if (oVar == null) {
            return;
        }
        if (z) {
            m153401a(new Runnable(dVar) {
                /* class com.ss.android.lark.image.impl.p1962b.$$Lambda$l$1g8QZuI5oe5QYq376eXMYlOTOCA */
                public final /* synthetic */ C38852d f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C38864l.lambda$1g8QZuI5oe5QYq376eXMYlOTOCA(C38864l.this, this.f$1);
                }
            });
        } else {
            oVar.mo142391a(dVar);
        }
    }

    /* renamed from: a */
    private void m153403a(Throwable th, boolean z) {
        AbstractC38869o oVar = this.f99851d;
        if (oVar == null) {
            return;
        }
        if (z) {
            m153401a(new Runnable(th) {
                /* class com.ss.android.lark.image.impl.p1962b.$$Lambda$l$7K35IqriUJk0PShPOmOTg_6VFik */
                public final /* synthetic */ Throwable f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C38864l.lambda$7K35IqriUJk0PShPOmOTg_6VFik(C38864l.this, this.f$1);
                }
            });
        } else {
            oVar.mo142392a(th);
        }
    }
}
