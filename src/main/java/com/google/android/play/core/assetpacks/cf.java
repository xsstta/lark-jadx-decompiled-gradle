package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC22633by;
import java.io.File;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class cf {

    /* renamed from: a */
    private final C22614x f55843a;

    /* renamed from: b */
    private final AbstractC22633by<dl> f55844b;

    /* renamed from: c */
    private final bp f55845c;

    /* renamed from: d */
    private final AbstractC22633by<Executor> f55846d;

    /* renamed from: e */
    private final bb f55847e;

    cf(C22614x xVar, AbstractC22633by<dl> byVar, bp bpVar, AbstractC22633by<Executor> byVar2, bb bbVar) {
        this.f55843a = xVar;
        this.f55844b = byVar;
        this.f55845c = bpVar;
        this.f55846d = byVar2;
        this.f55847e = bbVar;
    }

    /* renamed from: a */
    public final void mo78790a(cd cdVar) {
        File c = this.f55843a.mo78833c(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b);
        File e = this.f55843a.mo78842e(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b);
        if (!c.exists() || !e.exists()) {
            throw new ay(String.format("Cannot find pack files to move for pack %s.", cdVar.f55804k), cdVar.f55803j);
        }
        File a = this.f55843a.mo78824a(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b);
        a.mkdirs();
        if (c.renameTo(a)) {
            new File(this.f55843a.mo78824a(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b), "merge.tmp").delete();
            File b = this.f55843a.mo78829b(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b);
            b.mkdirs();
            if (e.renameTo(b)) {
                C22614x xVar = this.f55843a;
                xVar.getClass();
                this.f55846d.mo78909a().execute(ce.m82068a(xVar));
                this.f55845c.mo78764a(cdVar.f55804k, cdVar.f55840a, cdVar.f55841b);
                this.f55847e.mo78758a(cdVar.f55804k);
                this.f55844b.mo78909a().mo78782a(cdVar.f55803j, cdVar.f55804k);
                return;
            }
            throw new ay("Cannot move metadata files to final location.", cdVar.f55803j);
        }
        throw new ay("Cannot move merged pack files to final location.", cdVar.f55803j);
    }
}
