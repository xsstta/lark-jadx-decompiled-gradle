package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.AFExecutor;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {

    /* renamed from: ı */
    int f6724;

    /* renamed from: ǃ */
    KeyStore f6725;

    /* renamed from: ɩ */
    final Object f6726 = new Object();

    /* renamed from: Ι */
    String f6727;

    /* renamed from: ι */
    private Context f6728;

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final int mo9897() {
        int i;
        synchronized (this.f6726) {
            i = this.f6724;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final String mo9899() {
        String str;
        synchronized (this.f6726) {
            str = this.f6727;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final String mo9900() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f6726) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.f6727);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.f6724);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.length != 3) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r1[1].trim().split(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER);
        r1 = r1[2].trim().split(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r3.length != 2) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1.length != 2) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r7.f6727 = r3[1].trim();
        r7.f6724 = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r1 = th;
     */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9898() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.mo9898():boolean");
    }

    /* renamed from: Ι */
    private static boolean m8725(String str) {
        return str.startsWith("com.appsflyer");
    }

    public AFKeystoreWrapper(Context context) {
        this.f6728 = context;
        this.f6727 = "";
        this.f6724 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f6725 = instance;
            instance.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final void mo9901(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f6726) {
                if (!this.f6725.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (Build.VERSION.SDK_INT >= 18 && !AFExecutor.ThreadFactoryC19774.m8712()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f6728).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
