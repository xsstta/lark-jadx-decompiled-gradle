package com.ss.android.lark.secure;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AesCbcWithIntegrityUtils {

    /* renamed from: a */
    static final AtomicBoolean f133844a = new AtomicBoolean(false);

    public static final class PrngFixes {

        /* renamed from: a */
        private static final byte[] f133845a = m209774f();

        private PrngFixes() {
        }

        /* renamed from: a */
        public static void m209769a() {
            m209771c();
            m209772d();
        }

        public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
            private static final File URANDOM_FILE = new File("/dev/urandom");
            private static final Object sLock = new Object();
            private static DataInputStream sUrandomIn;
            private static OutputStream sUrandomOut;
            private boolean mSeeded;

            private OutputStream getUrandomOutputStream() throws IOException {
                OutputStream outputStream;
                synchronized (sLock) {
                    if (sUrandomOut == null) {
                        sUrandomOut = new FileOutputStream(URANDOM_FILE);
                    }
                    outputStream = sUrandomOut;
                }
                return outputStream;
            }

            private DataInputStream getUrandomInputStream() {
                DataInputStream dataInputStream;
                synchronized (sLock) {
                    if (sUrandomIn == null) {
                        try {
                            sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                        } catch (IOException e) {
                            throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e);
                        }
                    }
                    dataInputStream = sUrandomIn;
                }
                return dataInputStream;
            }

            /* access modifiers changed from: protected */
            public byte[] engineGenerateSeed(int i) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                return bArr;
            }

            /* access modifiers changed from: protected */
            public void engineNextBytes(byte[] bArr) {
                DataInputStream urandomInputStream;
                if (!this.mSeeded) {
                    engineSetSeed(PrngFixes.m209770b());
                }
                try {
                    synchronized (sLock) {
                        urandomInputStream = getUrandomInputStream();
                    }
                    synchronized (urandomInputStream) {
                        urandomInputStream.readFully(bArr);
                    }
                } catch (IOException e) {
                    throw new SecurityException("Failed to read from " + URANDOM_FILE, e);
                }
            }

            /* access modifiers changed from: protected */
            public void engineSetSeed(byte[] bArr) {
                OutputStream urandomOutputStream;
                try {
                    synchronized (sLock) {
                        urandomOutputStream = getUrandomOutputStream();
                    }
                    urandomOutputStream.write(bArr);
                    urandomOutputStream.flush();
                } catch (IOException unused) {
                    String simpleName = PrngFixes.class.getSimpleName();
                    Log.m165397w(simpleName, "Failed to mix seed into " + URANDOM_FILE);
                } catch (Throwable th) {
                    this.mSeeded = true;
                    throw th;
                }
                this.mSeeded = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.secure.AesCbcWithIntegrityUtils$PrngFixes$a */
        public static class C54049a extends Provider {
            public C54049a() {
                super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
                put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
                put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
            }
        }

        /* renamed from: e */
        private static String m209773e() {
            try {
                return (String) Build.class.getField("SERIAL").get(null);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public static byte[] m209770b() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(f133845a);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }

        /* renamed from: f */
        private static byte[] m209774f() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String e = m209773e();
            if (e != null) {
                sb.append(e);
            }
            try {
                return sb.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 encoding not supported");
            }
        }

        /* renamed from: c */
        private static void m209771c() throws SecurityException {
            if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 18) {
                try {
                    Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", byte[].class).invoke(null, m209770b());
                    int intValue = ((Integer) Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", String.class, Long.TYPE).invoke(null, "/dev/urandom", 1024)).intValue();
                    if (intValue != 1024) {
                        throw new IOException("Unexpected number of bytes read from Linux PRNG: " + intValue);
                    }
                } catch (Exception e) {
                    Log.m165398w(PrngFixes.class.getSimpleName(), "Failed to seed OpenSSL PRNG", e);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            if (r1[0].getClass().getSimpleName().equals(com.ss.android.lark.secure.AesCbcWithIntegrityUtils.PrngFixes.C54049a.class.getSimpleName()) != false) goto L_0x0037;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m209772d() throws java.lang.SecurityException {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.secure.AesCbcWithIntegrityUtils.PrngFixes.m209772d():void");
        }
    }

    /* renamed from: com.ss.android.lark.secure.AesCbcWithIntegrityUtils$a */
    public static class C54050a {

        /* renamed from: a */
        private final byte[] f133846a;

        /* renamed from: b */
        private final byte[] f133847b;

        /* renamed from: a */
        public byte[] mo185037a() {
            return this.f133846a;
        }

        /* renamed from: b */
        public byte[] mo185038b() {
            return this.f133847b;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.f133846a) + 31) * 31) + Arrays.hashCode(this.f133847b);
        }

        public String toString() {
            String encodeToString = Base64.encodeToString(this.f133847b, 2);
            String encodeToString2 = Base64.encodeToString(this.f133846a, 2);
            return String.format(encodeToString + ":" + encodeToString2, new Object[0]);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54050a aVar = (C54050a) obj;
            if (Arrays.equals(this.f133846a, aVar.f133846a) && Arrays.equals(this.f133847b, aVar.f133847b)) {
                return true;
            }
            return false;
        }

        public C54050a(String str) {
            String[] split = str.split(":");
            if (split.length != 3 && split.length != 2) {
                throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
            } else if (split.length == 3) {
                this.f133847b = Base64.decode(split[0], 2);
                this.f133846a = Base64.decode(split[2], 2);
            } else {
                this.f133847b = Base64.decode(split[0], 2);
                this.f133846a = Base64.decode(split[1], 2);
            }
        }

        public C54050a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[bArr.length];
            this.f133846a = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            byte[] bArr4 = new byte[bArr2.length];
            this.f133847b = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
    }

    /* renamed from: com.ss.android.lark.secure.AesCbcWithIntegrityUtils$b */
    public static class C54051b {

        /* renamed from: a */
        private SecretKey f133848a;

        /* renamed from: b */
        private SecretKey f133849b;

        /* renamed from: a */
        public SecretKey mo185042a() {
            return this.f133848a;
        }

        /* renamed from: b */
        public SecretKey mo185044b() {
            return this.f133849b;
        }

        public int hashCode() {
            return ((this.f133848a.hashCode() + 31) * 31) + this.f133849b.hashCode();
        }

        public String toString() {
            return Base64.encodeToString(mo185042a().getEncoded(), 2) + ":" + Base64.encodeToString(mo185044b().getEncoded(), 2);
        }

        /* renamed from: a */
        public void mo185043a(SecretKey secretKey) {
            this.f133848a = secretKey;
        }

        /* renamed from: b */
        public void mo185045b(SecretKey secretKey) {
            this.f133849b = secretKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54051b bVar = (C54051b) obj;
            if (this.f133849b.equals(bVar.f133849b) && this.f133848a.equals(bVar.f133848a)) {
                return true;
            }
            return false;
        }

        public C54051b(SecretKey secretKey, SecretKey secretKey2) {
            mo185043a(secretKey);
            mo185045b(secretKey2);
        }
    }

    /* renamed from: a */
    private static byte[] m209763a(int i) throws GeneralSecurityException {
        m209768d();
        byte[] bArr = new byte[i];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m209764a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m209765b() throws GeneralSecurityException {
        return m209763a((int) SmActions.ACTION_ONTHECALL_EXIT);
    }

    /* renamed from: c */
    public static byte[] m209767c() throws GeneralSecurityException {
        return m209763a(16);
    }

    /* renamed from: d */
    private static void m209768d() {
        AtomicBoolean atomicBoolean = f133844a;
        if (!atomicBoolean.get()) {
            synchronized (PrngFixes.class) {
                if (!atomicBoolean.get()) {
                    PrngFixes.m209769a();
                    atomicBoolean.set(true);
                }
            }
        }
    }

    /* renamed from: a */
    public static C54051b m209757a() throws GeneralSecurityException {
        m209768d();
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(SmActions.ACTION_ONTHECALL_EXIT);
        return new C54051b(instance.generateKey(), new SecretKeySpec(m209763a(32), "HmacSHA256"));
    }

    /* renamed from: a */
    public static C54051b m209758a(String str) throws InvalidKeyException {
        String[] split = str.split(":");
        if (split.length == 2) {
            byte[] decode = Base64.decode(split[0], 2);
            if (decode.length == 16) {
                byte[] decode2 = Base64.decode(split[1], 2);
                if (decode2.length == 32) {
                    return new C54051b(new SecretKeySpec(decode, 0, decode.length, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
                }
                throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
            }
            throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
        }
        throw new IllegalArgumentException("Cannot parse aesKey:hmacKey");
    }

    /* renamed from: a */
    public static C54050a m209754a(String str, C54051b bVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return m209755a(str, bVar, "UTF-8");
    }

    /* renamed from: a */
    public static C54051b m209759a(String str, String str2) throws GeneralSecurityException {
        return m209760a(str, Base64.decode(str2, 2));
    }

    /* renamed from: b */
    public static byte[] m209766b(C54050a aVar, C54051b bVar) throws GeneralSecurityException {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, bVar.mo185042a(), new IvParameterSpec(aVar.mo185038b()));
        return instance.doFinal(aVar.mo185037a());
    }

    /* renamed from: a */
    public static C54050a m209756a(byte[] bArr, C54051b bVar) throws GeneralSecurityException {
        byte[] c = m209767c();
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, bVar.mo185042a(), new IvParameterSpec(c));
        return new C54050a(instance.doFinal(bArr), instance.getIV());
    }

    /* renamed from: a */
    public static C54051b m209760a(String str, byte[] bArr) throws GeneralSecurityException {
        m209768d();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 100, 384)).getEncoded();
        return new C54051b(new SecretKeySpec(m209764a(encoded, 0, 16), "AES"), new SecretKeySpec(m209764a(encoded, 16, 48), "HmacSHA256"));
    }

    /* renamed from: a */
    public static String m209761a(C54050a aVar, C54051b bVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return m209762a(aVar, bVar, "UTF-8");
    }

    /* renamed from: a */
    public static C54050a m209755a(String str, C54051b bVar, String str2) throws UnsupportedEncodingException, GeneralSecurityException {
        return m209756a(str.getBytes(str2), bVar);
    }

    /* renamed from: a */
    public static String m209762a(C54050a aVar, C54051b bVar, String str) throws UnsupportedEncodingException, GeneralSecurityException {
        return new String(m209766b(aVar, bVar), str);
    }
}
