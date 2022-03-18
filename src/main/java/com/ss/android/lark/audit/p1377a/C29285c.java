package com.ss.android.lark.audit.p1377a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.ss.android.lark.audit.a.c */
public final class C29285c {

    /* renamed from: a */
    private final KeyStore f73313a;

    /* renamed from: com.ss.android.lark.audit.a.c$a */
    public static class C29286a {

        /* renamed from: a */
        private final byte[] f73314a;

        /* renamed from: b */
        private final byte[] f73315b;

        /* renamed from: a */
        public byte[] mo103807a() {
            return this.f73314a;
        }

        /* renamed from: b */
        public byte[] mo103808b() {
            return this.f73315b;
        }

        public C29286a(byte[] bArr, byte[] bArr2) {
            this.f73314a = bArr;
            this.f73315b = bArr2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m107651b() {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0052 }
            r0.<init>()     // Catch:{ IOException -> 0x0052 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003a }
            r1.writeLong(r2)     // Catch:{ all -> 0x003a }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x003a }
            r1.writeLong(r2)     // Catch:{ all -> 0x003a }
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x003a }
            r1.writeInt(r2)     // Catch:{ all -> 0x003a }
            int r2 = android.os.Process.myUid()     // Catch:{ all -> 0x003a }
            r1.writeInt(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = android.os.Build.BOARD     // Catch:{ all -> 0x003a }
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x003a }
            r1.write(r2)     // Catch:{ all -> 0x003a }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x003a }
            r1.close()
            r0.close()
            return r2
        L_0x003a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003c }
        L_0x003c:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x0045:
            throw r3
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0051:
            throw r2
        L_0x0052:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = "Failed to generate seed"
            r1.<init>(r2, r0)
            java.lang.String r0 = "Audit_Cryptographer"
            com.ss.android.lark.audit.p1377a.C29287d.m107656a(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.p1377a.C29285c.m107651b():byte[]");
    }

    /* renamed from: a */
    private static KeyGenerator m107647a() throws Exception {
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder("lark_audit_secret_key_name", 3).setBlockModes("CBC").setUserAuthenticationRequired(false).setEncryptionPaddings("PKCS7Padding").build());
            return instance;
        }
        KeyGenerator instance2 = KeyGenerator.getInstance("AES");
        SecureRandom instance3 = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        instance3.setSeed(m107651b());
        instance2.init(SmActions.ACTION_ONTHECALL_EXIT, instance3);
        return instance2;
    }

    private C29285c(KeyStore keyStore) {
        this.f73313a = keyStore;
    }

    /* renamed from: a */
    private static SecretKey m107648a(KeyStore keyStore) {
        try {
            return (SecretKey) keyStore.getKey("lark_audit_secret_key_name", null);
        } catch (Exception e) {
            C29287d.m107656a("Audit_Cryptographer", e);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized C29285c m107645a(Context context) {
        C29285c cVar;
        synchronized (C29285c.class) {
            File file = new File(context.getFilesDir(), "lark_audit_crypto");
            Log.m165389i("Audit_Cryptographer", "file path: " + file.getPath());
            try {
                KeyStore a = m107646a(file);
                m107649a(a, file);
                cVar = new C29285c(a);
            } catch (Exception e) {
                C29287d.m107656a("Audit_Cryptographer", e);
                return null;
            }
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r7.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.KeyStore m107646a(java.io.File r7) throws java.lang.Exception {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L_0x0011
            java.lang.String r7 = "AndroidKeyStore"
            java.security.KeyStore r7 = java.security.KeyStore.getInstance(r7)
            r7.load(r1)
            goto L_0x005e
        L_0x0011:
            java.lang.String r0 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            boolean r2 = r7.exists()
            if (r2 != 0) goto L_0x0031
            boolean r7 = r7.createNewFile()
            if (r7 == 0) goto L_0x0029
            r0.load(r1, r1)
            goto L_0x005d
        L_0x0029:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r0 = "创建内部存储文件失败"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            long r2 = r7.length()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x003f
            r0.load(r1, r1)
            goto L_0x005d
        L_0x003f:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0057 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0057 }
            r0.load(r2, r1)     // Catch:{ all -> 0x004b }
            r2.close()
            goto L_0x005d
        L_0x004b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r2 = move-exception
            r7.addSuppressed(r2)
        L_0x0056:
            throw r1
        L_0x0057:
            r7 = move-exception
            java.lang.String r1 = "Audit_Cryptographer"
            com.ss.android.lark.audit.p1377a.C29287d.m107656a(r1, r7)
        L_0x005d:
            r7 = r0
        L_0x005e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.p1377a.C29285c.m107646a(java.io.File):java.security.KeyStore");
    }

    /* renamed from: a */
    public C29286a mo103805a(byte[] bArr) {
        try {
            SecretKey a = m107648a(this.f73313a);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, a);
            return new C29286a(instance.doFinal(bArr), instance.getIV());
        } catch (Exception e) {
            C29287d.m107656a("Audit_Cryptographer", e);
            return null;
        }
    }

    /* renamed from: a */
    public byte[] mo103806a(C29286a aVar) {
        try {
            SecretKey a = m107648a(this.f73313a);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, a, new IvParameterSpec(aVar.mo103808b()));
            return instance.doFinal(aVar.mo103807a());
        } catch (Exception e) {
            C29287d.m107656a("Audit_Cryptographer", e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m107649a(KeyStore keyStore, File file) throws Exception {
        if (!keyStore.containsAlias("lark_audit_secret_key_name")) {
            m107650a(keyStore, file, m107647a().generateKey());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m107650a(java.security.KeyStore r4, java.io.File r5, javax.crypto.SecretKey r6) throws java.lang.Exception {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "lark_audit_secret_key_name"
            r2 = 0
            r3 = 23
            if (r0 < r3) goto L_0x000d
            r4.setKeyEntry(r1, r6, r2, r2)
            goto L_0x002c
        L_0x000d:
            r4.setKeyEntry(r1, r6, r2, r2)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0028 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0028 }
            r4.store(r6, r2)     // Catch:{ all -> 0x001c }
            r6.close()
            goto L_0x002c
        L_0x001c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x001e }
        L_0x001e:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x0027:
            throw r5
        L_0x0028:
            r4 = move-exception
            r4.printStackTrace()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.p1377a.C29285c.m107650a(java.security.KeyStore, java.io.File, javax.crypto.SecretKey):void");
    }
}
