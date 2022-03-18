package com.google.android.play.core.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.android.play.core.splitcompat.C22679r;

public final class bf {

    /* renamed from: a */
    private static final C22630b f56033a = new C22630b("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m82327a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (r1 = signatureArr.length) == 0) {
                f56033a.mo78875d("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature signature : signatureArr) {
                String a = C22679r.m82537a(signature.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
