package com.ss.android.lark.passport.infra.util.security;

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
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AesCbcWithIntegrityUtils {

    /* renamed from: a */
    static final AtomicBoolean f123520a = new AtomicBoolean(false);

    public static final class PrngFixes {

        /* renamed from: a */
        private static final byte[] f123521a = m194004f();

        private PrngFixes() {
        }

        /* renamed from: a */
        public static void m193999a() {
            m194001c();
            m194002d();
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
                    engineSetSeed(PrngFixes.m194000b());
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
                    Log.m165397w("AesCbcWithIntegrityUtils", "Failed to mix seed into " + URANDOM_FILE);
                } catch (Throwable th) {
                    this.mSeeded = true;
                    throw th;
                }
                this.mSeeded = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils$PrngFixes$a */
        public static class C49209a extends Provider {
            public C49209a() {
                super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
                put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
                put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
            }
        }

        /* renamed from: e */
        private static String m194003e() {
            try {
                return (String) Build.class.getField("SERIAL").get(null);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: f */
        private static byte[] m194004f() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String e = m194003e();
            if (e != null) {
                sb.append(e);
            }
            return sb.toString().getBytes(StandardCharsets.UTF_8);
        }

        /* renamed from: b */
        public static byte[] m194000b() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(f123521a);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }

        /* renamed from: c */
        private static void m194001c() throws SecurityException {
            if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 18) {
                try {
                    Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", byte[].class).invoke(null, m194000b());
                    int intValue = ((Integer) Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", String.class, Long.TYPE).invoke(null, "/dev/urandom", 1024)).intValue();
                    if (intValue != 1024) {
                        throw new IOException("Unexpected number of bytes read from Linux PRNG: " + intValue);
                    }
                } catch (Exception e) {
                    Log.m165398w("AesCbcWithIntegrityUtils", "Failed to seed OpenSSL PRNG", e);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
            if (r0[0].getClass().getSimpleName().equals(com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils.PrngFixes.C49209a.class.getSimpleName()) != false) goto L_0x0035;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m194002d() throws java.lang.SecurityException {
            /*
            // Method dump skipped, instructions count: 191
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils.PrngFixes.m194002d():void");
        }
    }

    /* renamed from: com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils$a */
    public static class C49210a {

        /* renamed from: a */
        private final byte[] f123522a;

        /* renamed from: b */
        private final byte[] f123523b;

        /* renamed from: c */
        private final byte[] f123524c;

        /* renamed from: a */
        public byte[] mo171712a() {
            return this.f123522a;
        }

        /* renamed from: b */
        public byte[] mo171713b() {
            return this.f123523b;
        }

        /* renamed from: c */
        public byte[] mo171714c() {
            return this.f123524c;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f123522a) + 31) * 31) + Arrays.hashCode(this.f123523b)) * 31) + Arrays.hashCode(this.f123524c);
        }

        public String toString() {
            String encodeToString = Base64.encodeToString(this.f123523b, 2);
            String encodeToString2 = Base64.encodeToString(this.f123522a, 2);
            String encodeToString3 = Base64.encodeToString(this.f123524c, 2);
            return String.format(encodeToString + ":" + encodeToString3 + ":" + encodeToString2, new Object[0]);
        }

        public C49210a(String str) {
            String[] split = str.split(":");
            if (split.length == 3) {
                this.f123523b = Base64.decode(split[0], 2);
                this.f123524c = Base64.decode(split[1], 2);
                this.f123522a = Base64.decode(split[2], 2);
                return;
            }
            throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C49210a aVar = (C49210a) obj;
            if (Arrays.equals(this.f123522a, aVar.f123522a) && Arrays.equals(this.f123523b, aVar.f123523b)) {
                return Arrays.equals(this.f123524c, aVar.f123524c);
            }
            return false;
        }

        /* renamed from: a */
        public static byte[] m194005a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public C49210a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.f123522a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.f123523b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.f123524c = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }
    }

    /* renamed from: com.ss.android.lark.passport.infra.util.security.AesCbcWithIntegrityUtils$b */
    public static class C49211b {

        /* renamed from: a */
        private SecretKey f123525a;

        /* renamed from: b */
        private SecretKey f123526b;

        /* renamed from: a */
        public SecretKey mo171718a() {
            return this.f123525a;
        }

        /* renamed from: b */
        public SecretKey mo171720b() {
            return this.f123526b;
        }

        public int hashCode() {
            return ((this.f123525a.hashCode() + 31) * 31) + this.f123526b.hashCode();
        }

        public String toString() {
            return Base64.encodeToString(mo171718a().getEncoded(), 2) + ":" + Base64.encodeToString(mo171720b().getEncoded(), 2);
        }

        /* renamed from: a */
        public void mo171719a(SecretKey secretKey) {
            this.f123525a = secretKey;
        }

        /* renamed from: b */
        public void mo171721b(SecretKey secretKey) {
            this.f123526b = secretKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C49211b bVar = (C49211b) obj;
            if (!this.f123526b.equals(bVar.f123526b)) {
                return false;
            }
            return this.f123525a.equals(bVar.f123525a);
        }

        public C49211b(SecretKey secretKey, SecretKey secretKey2) {
            mo171719a(secretKey);
            mo171721b(secretKey2);
        }
    }

    /* renamed from: a */
    private static byte[] m193993a(int i) throws GeneralSecurityException {
        m193998c();
        byte[] bArr = new byte[i];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m193995a(byte[] bArr, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKey);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m193994a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m193996b() throws GeneralSecurityException {
        return m193993a(16);
    }

    /* renamed from: c */
    private static void m193998c() {
        AtomicBoolean atomicBoolean = f123520a;
        if (!atomicBoolean.get()) {
            synchronized (PrngFixes.class) {
                if (!atomicBoolean.get()) {
                    PrngFixes.m193999a();
                    atomicBoolean.set(true);
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m193992a() throws GeneralSecurityException {
        return m193993a((int) SmActions.ACTION_ONTHECALL_EXIT);
    }

    /* renamed from: a */
    public static C49211b m193987a(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            Log.m165383e("AesCbcWithIntegrityUtils", "error length of keysArr");
            return null;
        }
        byte[] decode = Base64.decode(split[0], 2);
        if (decode.length != 16) {
            Log.m165383e("AesCbcWithIntegrityUtils", "Base64 decoded key is not 128 bytes");
            return null;
        }
        byte[] decode2 = Base64.decode(split[1], 2);
        if (decode2.length != 32) {
            Log.m165383e("AesCbcWithIntegrityUtils", "Base64 decoded key is not \" + HMAC_KEY_LENGTH_BITS + \" bytes");
            return null;
        }
        try {
            return new C49211b(new SecretKeySpec(decode, 0, decode.length, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C49210a m193984a(String str, C49211b bVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return m193985a(str, bVar, "UTF-8");
    }

    /* renamed from: a */
    public static String m193989a(C49210a aVar, C49211b bVar) throws UnsupportedEncodingException, GeneralSecurityException {
        return m193990a(aVar, bVar, "UTF-8");
    }

    /* renamed from: a */
    private static C49210a m193986a(byte[] bArr, C49211b bVar) throws GeneralSecurityException {
        byte[] b = m193996b();
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, bVar.mo171718a(), new IvParameterSpec(b));
        byte[] iv = instance.getIV();
        byte[] doFinal = instance.doFinal(bArr);
        return new C49210a(doFinal, iv, m193995a(C49210a.m194005a(iv, doFinal), bVar.mo171720b()));
    }

    /* renamed from: b */
    public static byte[] m193997b(C49210a aVar, C49211b bVar) throws GeneralSecurityException {
        if (m193991a(m193995a(C49210a.m194005a(aVar.mo171713b(), aVar.mo171712a()), bVar.mo171720b()), aVar.mo171714c())) {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, bVar.mo171718a(), new IvParameterSpec(aVar.mo171713b()));
            return instance.doFinal(aVar.mo171712a());
        }
        throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
    }

    /* renamed from: a */
    public static C49211b m193988a(String str, byte[] bArr) throws GeneralSecurityException {
        m193998c();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 100, 384)).getEncoded();
        return new C49211b(new SecretKeySpec(m193994a(encoded, 0, 16), "AES"), new SecretKeySpec(m193994a(encoded, 16, 48), "HmacSHA256"));
    }

    /* renamed from: a */
    public static boolean m193991a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C49210a m193985a(String str, C49211b bVar, String str2) throws UnsupportedEncodingException, GeneralSecurityException {
        return m193986a(str.getBytes(str2), bVar);
    }

    /* renamed from: a */
    public static String m193990a(C49210a aVar, C49211b bVar, String str) throws UnsupportedEncodingException, GeneralSecurityException {
        return new String(m193997b(aVar, bVar), str);
    }
}
