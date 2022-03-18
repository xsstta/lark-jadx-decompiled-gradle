package com.ss.android.lark.mail.impl.utils.p2223a;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.mail.impl.utils.C43849u;

/* renamed from: com.ss.android.lark.mail.impl.utils.a.a */
public class C43751a<T> extends C1177w<T> {

    /* renamed from: a */
    private volatile T f111022a;

    /* renamed from: f */
    private final C1177w<T> f111023f;

    @Override // androidx.lifecycle.LiveData
    /* renamed from: b */
    public T mo5927b() {
        return this.f111022a;
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5926a(T t) {
        mo5929b((Object) t);
    }

    public C43751a(C1177w<T> wVar) {
        this.f111023f = wVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m173424b(LifecycleOwner lifecycleOwner) {
        this.f111023f.mo5922a(lifecycleOwner);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m173426c(AbstractC1178x xVar) {
        this.f111023f.mo5928b(xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m173427d(AbstractC1178x xVar) {
        this.f111023f.mo5925a(xVar);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5922a(LifecycleOwner lifecycleOwner) {
        if (C43849u.m173830c()) {
            this.f111023f.mo5922a(lifecycleOwner);
        } else {
            C43849u.m173826a(new Runnable(lifecycleOwner) {
                /* class com.ss.android.lark.mail.impl.utils.p2223a.$$Lambda$a$edqOyVk8H6pB0QwDKgiMwl4dcpg */
                public final /* synthetic */ LifecycleOwner f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C43751a.this.m173424b((C43751a) this.f$1);
                }
            });
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: b */
    public void mo5928b(AbstractC1178x<? super T> xVar) {
        if (C43849u.m173830c()) {
            this.f111023f.mo5928b((AbstractC1178x) xVar);
        } else {
            C43849u.m173826a(new Runnable(xVar) {
                /* class com.ss.android.lark.mail.impl.utils.p2223a.$$Lambda$a$w2jMZxr7TZLsuVjQGiNteYeESA8 */
                public final /* synthetic */ AbstractC1178x f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C43751a.this.m173426c(this.f$1);
                }
            });
        }
    }

    @Override // androidx.lifecycle.C1177w, androidx.lifecycle.LiveData
    /* renamed from: b */
    public void mo5929b(T t) {
        this.f111022a = t;
        if (C43849u.m173830c()) {
            this.f111023f.mo5929b((Object) t);
        } else {
            this.f111023f.mo5926a((Object) t);
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5925a(AbstractC1178x<? super T> xVar) {
        if (C43849u.m173830c()) {
            this.f111023f.mo5925a((AbstractC1178x) xVar);
        } else {
            C43849u.m173826a(new Runnable(xVar) {
                /* class com.ss.android.lark.mail.impl.utils.p2223a.$$Lambda$a$cK0J7m2pDtN1o2lY3x_E3PLWCQo */
                public final /* synthetic */ AbstractC1178x f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C43751a.this.m173427d(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m173425b(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
        this.f111023f.mo5923a(lifecycleOwner, xVar);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5923a(LifecycleOwner lifecycleOwner, AbstractC1178x<? super T> xVar) {
        if (C43849u.m173830c()) {
            this.f111023f.mo5923a(lifecycleOwner, xVar);
        } else {
            C43849u.m173826a(new Runnable(lifecycleOwner, xVar) {
                /* class com.ss.android.lark.mail.impl.utils.p2223a.$$Lambda$a$or3S2t88RBhJox_IYVI_jgAIA4 */
                public final /* synthetic */ LifecycleOwner f$1;
                public final /* synthetic */ AbstractC1178x f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C43751a.this.m173425b(this.f$1, this.f$2);
                }
            });
        }
    }
}
