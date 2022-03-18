package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.play.core.splitcompat.C22666e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.af */
public final class C22625af {

    /* renamed from: a */
    private final C22666e f56025a;

    /* renamed from: b */
    private final Context f56026b;

    /* renamed from: c */
    private final C22627ah f56027c;

    public C22625af(Context context, C22666e eVar, C22627ah ahVar, byte[] bArr) {
        this.f56025a = eVar;
        this.f56027c = ahVar;
        this.f56026b = context;
    }

    /* renamed from: a */
    private static X509Certificate m82251a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ae, code lost:
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r8).length() + 32);
        r5.append("Downloaded split ");
        r5.append(r8);
        r5.append(" is not signed.");
        r0 = r5.toString();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78864a() {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C22625af.mo78864a():boolean");
    }

    /* renamed from: a */
    public final boolean mo78865a(List<Intent> list) throws IOException {
        for (Intent intent : list) {
            if (!this.f56025a.mo78986b(intent.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
