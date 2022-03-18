package com.ss.android.lark.p2921w.p2923b;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.ss.android.lark.w.b.a */
public class C58206a {

    /* renamed from: a */
    private static final byte[] f143139a = {-1, -1, -1, -1};

    /* renamed from: b */
    private static final Object f143140b = new Object();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.w.b.a$a */
    public static class C58207a {

        /* renamed from: a */
        public static final C58206a f143141a = new C58206a();
    }

    /* renamed from: a */
    public static C58206a m225833a() {
        return C58207a.f143141a;
    }

    /* renamed from: e */
    private static byte[] m225842e() throws GeneralSecurityException {
        byte[] bArr = new byte[12];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }

    /* renamed from: c */
    private void m225840c() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        synchronized (f143140b) {
            if (Build.VERSION.SDK_INT >= 23) {
                m225841d();
            }
        }
    }

    /* renamed from: b */
    public Key mo197218b() throws NoSuchAlgorithmException, IOException, KeyStoreException, UnrecoverableEntryException, CertificateException, InvalidAlgorithmParameterException, NoSuchProviderException {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        Key key = instance.getKey("cache", null);
        if (key != null) {
            return key;
        }
        m225840c();
        return instance.getKey("cache", null);
    }

    /* renamed from: d */
    private void m225841d() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance.init(new KeyGenParameterSpec.Builder("cache", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
        instance.generateKey();
    }

    /* renamed from: a */
    private boolean m225835a(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i != 4) {
            return false;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return Arrays.equals(bArr, f143139a);
    }

    /* renamed from: a */
    private static byte[] m225836a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    private byte[] m225839b(byte[] bArr) throws Exception {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = wrap.getInt();
        if (i < 12 || i >= 16) {
            throw new IllegalArgumentException("invalid iv length");
        }
        byte[] bArr2 = new byte[i];
        wrap.get(bArr2);
        byte[] bArr3 = new byte[wrap.remaining()];
        wrap.get(bArr3);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, mo197218b(), new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, bArr2));
        return instance.doFinal(bArr3);
    }

    /* renamed from: a */
    private byte[] m225837a(byte[] bArr) throws Exception {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] e = m225842e();
        instance.init(1, mo197218b(), new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, e));
        byte[] doFinal = instance.doFinal(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(e.length + 12 + doFinal.length);
        allocate.putInt(4);
        allocate.put(f143139a);
        allocate.putInt(e.length);
        allocate.put(e);
        allocate.put(doFinal);
        return allocate.array();
    }

    /* renamed from: a */
    private static void m225834a(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    /* renamed from: b */
    public byte[] mo197219b(File file, boolean z) throws Exception {
        if (file.exists()) {
            byte[] a = m225836a(file);
            if (Build.VERSION.SDK_INT < 23) {
                return a;
            }
            try {
                return m225838a(a, z, file);
            } catch (Exception e) {
                Log.m165386e("KeystoreImpl", e);
                if (!m225835a(ByteBuffer.wrap(a))) {
                    return a;
                }
                Log.m165383e("KeystoreImpl", "Decryption fails and the content is ciphertext");
                throw new KeyStoreException("Decryption fails and the content is ciphertext");
            }
        } else {
            throw new IllegalArgumentException("File to be encrypted not exists");
        }
    }

    /* renamed from: a */
    public void mo197217a(File file, boolean z) throws Exception {
        if (z) {
            if (file.exists()) {
                byte[] a = m225836a(file);
                if (Build.VERSION.SDK_INT >= 23) {
                    m225834a(file, m225837a(a));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("File to be encrypted must be non null");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|(1:13)|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r5.delete() == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        com.ss.android.lark.log.Log.m165383e("KeystoreImpl", "decrypt error and file can not be delete.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m225838a(byte[] r3, boolean r4, java.io.File r5) throws java.lang.Exception {
        /*
            r2 = this;
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r3)
            boolean r1 = r2.m225835a(r0)
            if (r1 == 0) goto L_0x0033
            int r3 = r0.remaining()
            byte[] r3 = new byte[r3]
            r0.get(r3)
            if (r4 == 0) goto L_0x001a
            byte[] r3 = r2.m225839b(r3)
            return r3
        L_0x001a:
            r4 = 0
            byte[] r4 = new byte[r4]
            byte[] r4 = r2.m225839b(r3)     // Catch:{ Exception -> 0x0025 }
            m225834a(r5, r4)     // Catch:{ Exception -> 0x0025 }
            return r4
        L_0x0025:
            boolean r3 = r5.delete()     // Catch:{ all -> 0x0032 }
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = "KeystoreImpl"
            java.lang.String r5 = "decrypt error and file can not be delete."
            com.ss.android.lark.log.Log.m165383e(r3, r5)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            return r4
        L_0x0033:
            if (r4 == 0) goto L_0x0039
            r4 = 1
            r2.mo197217a(r5, r4)
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p2921w.p2923b.C58206a.m225838a(byte[], boolean, java.io.File):byte[]");
    }
}
