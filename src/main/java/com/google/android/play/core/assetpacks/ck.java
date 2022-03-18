package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22627ah;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* access modifiers changed from: package-private */
public final class ck {

    /* renamed from: a */
    private static final C22630b f55865a = new C22630b("PatchSliceTaskHandler");

    /* renamed from: b */
    private final C22614x f55866b;

    /* renamed from: c */
    private final AbstractC22633by<dl> f55867c;

    ck(C22614x xVar, AbstractC22633by<dl> byVar) {
        this.f55866b = xVar;
        this.f55867c = byVar;
    }

    /* renamed from: a */
    public final void mo78792a(cj cjVar) {
        File a = this.f55866b.mo78824a(cjVar.f55804k, cjVar.f55857a, cjVar.f55858b);
        C22614x xVar = this.f55866b;
        String str = cjVar.f55804k;
        int i = cjVar.f55857a;
        long j = cjVar.f55858b;
        File file = new File(xVar.mo78829b(str, i, j), cjVar.f55862f);
        try {
            InputStream inputStream = cjVar.f55864h;
            if (cjVar.f55861e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                C22576aa aaVar = new C22576aa(a, file);
                File file2 = new File(this.f55866b.mo78844f(cjVar.f55804k, cjVar.f55859c, cjVar.f55860d, cjVar.f55862f), "slice.zip.tmp");
                if (file2.getParentFile() != null) {
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                }
                C22627ah.m82258a(aaVar, inputStream, new FileOutputStream(file2), cjVar.f55863g);
                if (file2.renameTo(this.f55866b.mo78843e(cjVar.f55804k, cjVar.f55859c, cjVar.f55860d, cjVar.f55862f))) {
                    inputStream.close();
                    f55865a.mo78874c("Patching finished for slice %s of pack %s.", cjVar.f55862f, cjVar.f55804k);
                    this.f55867c.mo78909a().mo78783a(cjVar.f55803j, cjVar.f55804k, cjVar.f55862f, 0);
                    try {
                        cjVar.f55864h.close();
                        return;
                    } catch (IOException unused) {
                        f55865a.mo78875d("Could not close file for slice %s of pack %s.", cjVar.f55862f, cjVar.f55804k);
                        return;
                    }
                } else {
                    throw new ay(String.format("Error moving patch for slice %s of pack %s.", cjVar.f55862f, cjVar.f55804k), cjVar.f55803j);
                }
            } catch (Throwable th) {
                bx.m82371a(th, th);
            }
            throw th;
        } catch (IOException e) {
            f55865a.mo78873b("IOException during patching %s.", e.getMessage());
            throw new ay(String.format("Error patching slice %s of pack %s.", cjVar.f55862f, cjVar.f55804k), e, cjVar.f55803j);
        }
    }
}
