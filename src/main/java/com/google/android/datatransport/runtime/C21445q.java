package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.AbstractC21394f;
import com.google.android.datatransport.AbstractC21395g;
import com.google.android.datatransport.C21349b;
import com.google.android.datatransport.runtime.scheduling.AbstractC21493e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21509g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C21516n;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.q */
public class C21445q implements AbstractC21444p {

    /* renamed from: a */
    private static volatile AbstractC21446r f52057a;

    /* renamed from: b */
    private final AbstractC21523a f52058b;

    /* renamed from: c */
    private final AbstractC21523a f52059c;

    /* renamed from: d */
    private final AbstractC21493e f52060d;

    /* renamed from: e */
    private final C21509g f52061e;

    /* renamed from: b */
    public C21509g mo72696b() {
        return this.f52061e;
    }

    /* renamed from: a */
    public static C21445q m77585a() {
        AbstractC21446r rVar = f52057a;
        if (rVar != null) {
            return rVar.mo72670b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    private static Set<C21349b> m77587b(AbstractC21430e eVar) {
        if (eVar instanceof AbstractC21431f) {
            return Collections.unmodifiableSet(((AbstractC21431f) eVar).mo72506c());
        }
        return Collections.singleton(C21349b.m77288a("proto"));
    }

    /* renamed from: a */
    public static void m77586a(Context context) {
        if (f52057a == null) {
            synchronized (C21445q.class) {
                if (f52057a == null) {
                    f52057a = C21427d.m77514a().mo72674b(context).mo72673a();
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC21433h m77584a(AbstractC21437k kVar) {
        return AbstractC21433h.m77526i().mo72613a(this.f52058b.mo72782a()).mo72619b(this.f52059c.mo72782a()).mo72616a(kVar.mo72622b()).mo72614a(new C21432g(kVar.mo72625e(), kVar.mo72689f())).mo72615a(kVar.mo72623c().mo72493a()).mo72620b();
    }

    /* renamed from: a */
    public AbstractC21394f mo72694a(AbstractC21430e eVar) {
        return new C21441m(m77587b(eVar), AbstractC21439l.m77567d().mo72667a(eVar.mo72504a()).mo72668a(eVar.mo72505b()).mo72669a(), this);
    }

    /* renamed from: a */
    public AbstractC21394f mo72695a(String str) {
        return new C21441m(m77587b(null), AbstractC21439l.m77567d().mo72667a(str).mo72669a(), this);
    }

    @Override // com.google.android.datatransport.runtime.AbstractC21444p
    /* renamed from: a */
    public void mo72693a(AbstractC21437k kVar, AbstractC21395g gVar) {
        this.f52060d.mo72699a(kVar.mo72621a().mo72690a(kVar.mo72623c().mo72495c()), m77584a(kVar), gVar);
    }

    @Inject
    C21445q(AbstractC21523a aVar, AbstractC21523a aVar2, AbstractC21493e eVar, C21509g gVar, C21516n nVar) {
        this.f52058b = aVar;
        this.f52059c = aVar2;
        this.f52060d = eVar;
        this.f52061e = gVar;
        nVar.mo72779a();
    }
}
