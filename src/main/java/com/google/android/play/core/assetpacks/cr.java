package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C22630b;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
public final class cr {

    /* renamed from: a */
    private static final C22630b f55884a = new C22630b("VerifySliceTaskHandler");

    /* renamed from: b */
    private final C22614x f55885b;

    cr(C22614x xVar) {
        this.f55885b = xVar;
    }

    /* renamed from: a */
    private final void m82095a(cq cqVar, File file) {
        try {
            File f = this.f55885b.mo78844f(cqVar.f55804k, cqVar.f55880a, cqVar.f55881b, cqVar.f55882c);
            if (f.exists()) {
                try {
                    if (bz.m82059a(cp.m82093a(file, f)).equals(cqVar.f55883d)) {
                        f55884a.mo78874c("Verification of slice %s of pack %s successful.", cqVar.f55882c, cqVar.f55804k);
                        return;
                    }
                    throw new ay(String.format("Verification failed for slice %s.", cqVar.f55882c), cqVar.f55803j);
                } catch (NoSuchAlgorithmException e) {
                    throw new ay("SHA256 algorithm not supported.", e, cqVar.f55803j);
                } catch (IOException e2) {
                    throw new ay(String.format("Could not digest file during verification for slice %s.", cqVar.f55882c), e2, cqVar.f55803j);
                }
            } else {
                throw new ay(String.format("Cannot find metadata files for slice %s.", cqVar.f55882c), cqVar.f55803j);
            }
        } catch (IOException e3) {
            throw new ay(String.format("Could not reconstruct slice archive during verification for slice %s.", cqVar.f55882c), e3, cqVar.f55803j);
        }
    }

    /* renamed from: a */
    public final void mo78805a(cq cqVar) {
        File a = this.f55885b.mo78825a(cqVar.f55804k, cqVar.f55880a, cqVar.f55881b, cqVar.f55882c);
        if (a.exists()) {
            m82095a(cqVar, a);
            File b = this.f55885b.mo78830b(cqVar.f55804k, cqVar.f55880a, cqVar.f55881b, cqVar.f55882c);
            if (!b.exists()) {
                b.mkdirs();
            }
            if (!a.renameTo(b)) {
                throw new ay(String.format("Failed to move slice %s after verification.", cqVar.f55882c), cqVar.f55803j);
            }
            return;
        }
        throw new ay(String.format("Cannot find unverified files for slice %s.", cqVar.f55882c), cqVar.f55803j);
    }
}
