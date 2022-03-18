package com.bytedance.applog.util;

import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.applog.util.g */
public class C3458g {
    /* renamed from: a */
    public static String[] m14606a() {
        String[] strArr = new String[2];
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            instance.init(SmActions.ACTION_ONTHECALL_EXIT, secureRandom);
            strArr[0] = m14607b(instance.generateKey().getEncoded());
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            strArr[1] = m14607b(bArr);
            if (TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1]) || strArr[1].length() != 16) {
                return null;
            }
            return strArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static byte[] m14608b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: b */
    private static String m14607b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (bArr != null && i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
            i++;
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m14603a(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3458g.m14603a(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0050, code lost:
        if (r2 == null) goto L_0x0053;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC, Splitter:B:28:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0044 A[SYNTHETIC, Splitter:B:32:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004b A[SYNTHETIC, Splitter:B:39:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m14604a(byte[] r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0058
            int r1 = r6.length
            if (r1 > 0) goto L_0x0007
            goto L_0x0058
        L_0x0007:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0048, all -> 0x0037 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0048, all -> 0x0037 }
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0035, all -> 0x0030 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x002e, all -> 0x002c }
        L_0x001a:
            int r3 = r6.read(r0)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            if (r3 < 0) goto L_0x0025
            r4 = 0
            r1.write(r0, r4, r3)     // Catch:{ IOException -> 0x002e, all -> 0x002c }
            goto L_0x001a
        L_0x0025:
            r6.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x002c:
            r0 = move-exception
            goto L_0x003b
        L_0x002e:
            r0 = r6
            goto L_0x0049
        L_0x0030:
            r6 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x003b
        L_0x0035:
            goto L_0x0049
        L_0x0037:
            r6 = move-exception
            r2 = r0
            r0 = r6
            r6 = r2
        L_0x003b:
            if (r6 == 0) goto L_0x0042
            r6.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r2 = r0
        L_0x0049:
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            goto L_0x0028
        L_0x0053:
            byte[] r6 = r1.toByteArray()
            return r6
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.C3458g.m14604a(byte[]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m14605a(byte[] bArr, String str, String str2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            instance.init(2, new SecretKeySpec(m14608b(str), "AES"), new IvParameterSpec(m14608b(str2)));
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
