package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22630b;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class az {

    /* renamed from: a */
    private static final C22630b f55739a = new C22630b("ExtractorLooper");

    /* renamed from: b */
    private final bp f55740b;

    /* renamed from: c */
    private final aw f55741c;

    /* renamed from: d */
    private final cr f55742d;

    /* renamed from: e */
    private final cb f55743e;

    /* renamed from: f */
    private final cf f55744f;

    /* renamed from: g */
    private final ck f55745g;

    /* renamed from: h */
    private final AbstractC22633by<dl> f55746h;

    /* renamed from: i */
    private final bs f55747i;

    /* renamed from: j */
    private final AtomicBoolean f55748j = new AtomicBoolean(false);

    az(bp bpVar, AbstractC22633by<dl> byVar, aw awVar, cr crVar, cb cbVar, cf cfVar, ck ckVar, bs bsVar) {
        this.f55740b = bpVar;
        this.f55746h = byVar;
        this.f55741c = awVar;
        this.f55742d = crVar;
        this.f55743e = cbVar;
        this.f55744f = cfVar;
        this.f55745g = ckVar;
        this.f55747i = bsVar;
    }

    /* renamed from: a */
    private final void m82001a(int i, Exception exc) {
        try {
            this.f55740b.mo78774d(i);
            this.f55740b.mo78763a(i);
        } catch (ay unused) {
            f55739a.mo78873b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78754a() {
        C22630b bVar = f55739a;
        bVar.mo78871a("Run extractor loop", new Object[0]);
        if (this.f55748j.compareAndSet(false, true)) {
            while (true) {
                br brVar = null;
                try {
                    brVar = this.f55747i.mo78775a();
                } catch (ay e) {
                    f55739a.mo78873b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f55738a >= 0) {
                        this.f55746h.mo78909a().mo78781a(e.f55738a);
                        m82001a(e.f55738a, e);
                    }
                }
                if (brVar != null) {
                    try {
                        if (brVar instanceof av) {
                            this.f55741c.mo78753a((av) brVar);
                        } else if (brVar instanceof cq) {
                            this.f55742d.mo78805a((cq) brVar);
                        } else if (brVar instanceof ca) {
                            this.f55743e.mo78788a((ca) brVar);
                        } else if (brVar instanceof cd) {
                            this.f55744f.mo78790a((cd) brVar);
                        } else if (!(brVar instanceof cj)) {
                            f55739a.mo78873b("Unknown task type: %s", brVar.getClass().getName());
                        } else {
                            this.f55745g.mo78792a((cj) brVar);
                        }
                    } catch (Exception e2) {
                        f55739a.mo78873b("Error during extraction task: %s", e2.getMessage());
                        this.f55746h.mo78909a().mo78781a(brVar.f55803j);
                        m82001a(brVar.f55803j, e2);
                    }
                } else {
                    this.f55748j.set(false);
                    return;
                }
            }
        } else {
            bVar.mo78875d("runLoop already looping; return", new Object[0]);
        }
    }
}
