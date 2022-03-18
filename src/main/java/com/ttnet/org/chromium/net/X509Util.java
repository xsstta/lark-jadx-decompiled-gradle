package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import me.ele.lancet.base.annotations.Skip;

@JNINamespace("net")
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static CertificateFactory sCertificateFactory;
    private static X509TrustManagerImplementation sDefaultTrustManager;
    private static boolean sDisableNativeCodeForTest;
    private static boolean sLoadedSystemKeyStore;
    private static final Object sLock = new Object();
    private static File sSystemCertificateDirectory;
    private static KeyStore sSystemKeyStore;
    private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    private static KeyStore sTestKeyStore;
    private static X509TrustManagerImplementation sTestTrustManager;
    private static TrustStorageListener sTrustStorageListener;

    /* access modifiers changed from: private */
    public interface X509TrustManagerImplementation {
        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException;
    }

    private static native void nativeNotifyKeyChainChanged();

    /* access modifiers changed from: private */
    public static final class TrustStorageListener extends BroadcastReceiver {
        private TrustStorageListener() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 26) {
                z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
            } else if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                z = false;
            }
            if (z) {
                try {
                    X509Util.reloadDefaultTrustManager();
                } catch (CertificateException e) {
                    Log.e("X509Util", "Unable to reload the default TrustManager", e);
                } catch (KeyStoreException e2) {
                    Log.e("X509Util", "Unable to reload the default TrustManager", e2);
                } catch (NoSuchAlgorithmException e3) {
                    Log.e("X509Util", "Unable to reload the default TrustManager", e3);
                }
            }
        }
    }

    private static void ensureInitialized() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void reloadTestTrustManager() throws KeyStoreException, NoSuchAlgorithmException {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateException, java.security.KeyStoreException {
        /*
            ensureInitialized()
            java.lang.Object r0 = com.ttnet.org.chromium.net.X509Util.sLock
            monitor-enter(r0)
            java.security.KeyStore r1 = com.ttnet.org.chromium.net.X509Util.sTestKeyStore     // Catch:{ IOException -> 0x0012 }
            r2 = 0
            r1.load(r2)     // Catch:{ IOException -> 0x0012 }
            reloadTestTrustManager()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0012
        L_0x0010:
            r1 = move-exception
            goto L_0x0014
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.clearTestRootCertificates():void");
    }

    public static void reloadDefaultTrustManager() throws KeyStoreException, NoSuchAlgorithmException, CertificateException {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        nativeNotifyKeyChainChanged();
    }

    private static void ensureInitializedLocked() throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = instance;
                try {
                    instance.load(null);
                } catch (IOException unused) {
                }
                sSystemCertificateDirectory = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTestKeyStore == null) {
            KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = instance2;
            try {
                instance2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            INVOKEVIRTUAL_com_ttnet_org_chromium_net_X509Util_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), sTrustStorageListener, intentFilter);
        }
    }

    public static void setDisableNativeCodeForTest(boolean z) {
        sDisableNativeCodeForTest = z;
    }

    /* access modifiers changed from: private */
    public static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        private final X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        @Override // com.ttnet.org.chromium.net.X509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: private */
    public static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        private final X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.ttnet.org.chromium.net.X509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        ensureInitialized();
        X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + Integer.toString(sTestKeyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static String hashPrincipal(X500Principal x500Principal) throws NoSuchAlgorithmException {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            int i3 = 3 - i;
            cArr[i2] = cArr2[(digest[i3] >> 4) & 15];
            cArr[i2 + 1] = cArr2[digest[i3] & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean verifyKeyUsage(java.security.cert.X509Certificate r4) throws java.security.cert.CertificateException {
        /*
            r0 = 0
            java.util.List r4 = r4.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x003a }
            r1 = 1
            if (r4 != 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "1.3.6.1.5.5.7.3.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.5.29.37.0"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "2.16.840.1.113730.4.1"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0039
            java.lang.String r3 = "1.3.6.1.4.1.311.10.3.3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x000d
        L_0x0039:
            return r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.verifyKeyUsage(java.security.cert.X509Certificate):boolean");
    }

    private static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    if (Build.VERSION.SDK_INT >= 17) {
                        return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                    }
                    return new X509TrustManagerIceCreamSandwich((X509TrustManager) trustManager);
                } catch (IllegalArgumentException e) {
                    Log.e("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e);
                }
            }
        }
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    private static boolean isKnownRoot(X509Certificate x509Certificate) throws NoSuchAlgorithmException, KeyStoreException {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = hashPrincipal + '.' + i;
            if (!new File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    Log.e("X509Util", "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                }
            }
            i++;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ttnet_org_chromium_net_X509Util_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) throws KeyStoreException, NoSuchAlgorithmException {
        List<X509Certificate> list;
        boolean z;
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        }
        try {
            ensureInitialized();
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(createCertificateFromBytes(bArr[0]));
                for (int i = 1; i < bArr.length; i++) {
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[i]));
                    } catch (CertificateException unused) {
                        Log.w("X509Util", "intermediate " + i + " failed parsing");
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!verifyKeyUsage(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (sLock) {
                        X509TrustManagerImplementation x509TrustManagerImplementation = sDefaultTrustManager;
                        if (x509TrustManagerImplementation == null) {
                            return new AndroidCertVerifyResult(-1);
                        }
                        try {
                            list = x509TrustManagerImplementation.checkServerTrusted(x509CertificateArr, str, str2);
                        } catch (CertificateException e) {
                            try {
                                list = sTestTrustManager.checkServerTrusted(x509CertificateArr, str, str2);
                            } catch (CertificateException unused2) {
                                Log.i("X509Util", "Failed to validate the certificate chain, error: " + e.getMessage());
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                        if (list.size() > 0) {
                            z = isKnownRoot(list.get(list.size() - 1));
                        } else {
                            z = false;
                        }
                        return new AndroidCertVerifyResult(0, z, list);
                    }
                } catch (CertificateExpiredException unused3) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException unused4) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException unused5) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException unused6) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException unused7) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
