package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.AbstractC21446r;
import com.google.android.datatransport.runtime.backends.C21418j;
import com.google.android.datatransport.runtime.backends.C21421l;
import com.google.android.datatransport.runtime.scheduling.C21449a;
import com.google.android.datatransport.runtime.scheduling.C21492d;
import com.google.android.datatransport.runtime.scheduling.C21495g;
import com.google.android.datatransport.runtime.scheduling.C21497i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC21520r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21509g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21515m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21516n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21519q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.scheduling.p974a.C21453aa;
import com.google.android.datatransport.runtime.scheduling.p974a.C21459af;
import com.google.android.datatransport.runtime.scheduling.p974a.C21465f;
import com.google.android.datatransport.runtime.scheduling.p974a.C21466g;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;
import com.google.android.datatransport.runtime.time.C21525c;
import com.google.android.datatransport.runtime.time.C21526d;
import dagger.internal.AbstractC68174b;
import dagger.internal.C68173a;
import dagger.internal.C68175c;
import dagger.internal.C68177e;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.d */
public final class C21427d extends AbstractC21446r {

    /* renamed from: a */
    private Provider<Executor> f52032a;

    /* renamed from: b */
    private Provider<Context> f52033b;

    /* renamed from: c */
    private Provider f52034c;

    /* renamed from: d */
    private Provider f52035d;

    /* renamed from: e */
    private Provider f52036e;

    /* renamed from: f */
    private Provider<C21468i> f52037f;

    /* renamed from: g */
    private Provider<SchedulerConfig> f52038g;

    /* renamed from: h */
    private Provider<AbstractC21520r> f52039h;

    /* renamed from: i */
    private Provider<C21449a> f52040i;

    /* renamed from: j */
    private Provider<C21509g> f52041j;

    /* renamed from: k */
    private Provider<C21516n> f52042k;

    /* renamed from: l */
    private Provider<C21445q> f52043l;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.datatransport.runtime.d$a */
    public static final class C21429a implements AbstractC21446r.AbstractC21447a {

        /* renamed from: a */
        private Context f52044a;

        private C21429a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC21446r.AbstractC21447a
        /* renamed from: a */
        public AbstractC21446r mo72673a() {
            C68177e.m264825a(this.f52044a, Context.class);
            return new C21427d(this.f52044a);
        }

        /* renamed from: a */
        public C21429a mo72674b(Context context) {
            this.f52044a = (Context) C68177e.m264823a(context);
            return this;
        }
    }

    /* renamed from: a */
    public static AbstractC21446r.AbstractC21447a m77514a() {
        return new C21429a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC21446r
    /* renamed from: b */
    public C21445q mo72670b() {
        return this.f52043l.mo47880b();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC21446r
    /* renamed from: c */
    public AbstractC21461c mo72671c() {
        return this.f52037f.mo47880b();
    }

    private C21427d(Context context) {
        m77515a(context);
    }

    /* renamed from: a */
    private void m77515a(Context context) {
        this.f52032a = C68173a.m264818a(C21436j.m77550c());
        AbstractC68174b a = C68175c.m264821a(context);
        this.f52033b = a;
        C21418j a2 = C21418j.m77492a(a, C21525c.m77831c(), C21526d.m77835c());
        this.f52034c = a2;
        this.f52035d = C68173a.m264818a(C21421l.m77500a(this.f52033b, a2));
        this.f52036e = C21459af.m77626a(this.f52033b, C21465f.m77653c());
        this.f52037f = C68173a.m264818a(C21453aa.m77611a(C21525c.m77831c(), C21526d.m77835c(), C21466g.m77657c(), this.f52036e));
        C21495g a3 = C21495g.m77750a(C21525c.m77831c());
        this.f52038g = a3;
        C21497i a4 = C21497i.m77755a(this.f52033b, this.f52037f, a3, C21526d.m77835c());
        this.f52039h = a4;
        Provider<Executor> provider = this.f52032a;
        Provider provider2 = this.f52035d;
        Provider<C21468i> provider3 = this.f52037f;
        this.f52040i = C21492d.m77745a(provider, provider2, a4, provider3, provider3);
        Provider<Context> provider4 = this.f52033b;
        Provider provider5 = this.f52035d;
        Provider<C21468i> provider6 = this.f52037f;
        this.f52041j = C21515m.m77813a(provider4, provider5, provider6, this.f52039h, this.f52032a, provider6, C21525c.m77831c());
        Provider<Executor> provider7 = this.f52032a;
        Provider<C21468i> provider8 = this.f52037f;
        this.f52042k = C21519q.m77822a(provider7, provider8, this.f52039h, provider8);
        this.f52043l = C68173a.m264818a(C21448s.m77596a(C21525c.m77831c(), C21526d.m77835c(), this.f52040i, this.f52041j, this.f52042k));
    }
}
