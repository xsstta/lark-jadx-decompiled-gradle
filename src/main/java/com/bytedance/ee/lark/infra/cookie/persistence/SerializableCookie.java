package com.bytedance.ee.lark.infra.cookie.persistence;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

public class SerializableCookie implements Serializable {
    private static final long serialVersionUID = -8594045714036645534L;
    private transient Cookie cookie;

    private static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Cookie.Builder builder = new Cookie.Builder();
        builder.name((String) objectInputStream.readObject());
        builder.value((String) objectInputStream.readObject());
        long readLong = objectInputStream.readLong();
        if (readLong != -1) {
            builder.expiresAt(readLong);
        }
        String str = (String) objectInputStream.readObject();
        builder.domain(str);
        builder.path((String) objectInputStream.readObject());
        if (objectInputStream.readBoolean()) {
            builder.secure();
        }
        if (objectInputStream.readBoolean()) {
            builder.httpOnly();
        }
        if (objectInputStream.readBoolean()) {
            builder.hostOnlyDomain(str);
        }
        this.cookie = builder.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        long j;
        objectOutputStream.writeObject(this.cookie.name());
        objectOutputStream.writeObject(this.cookie.value());
        if (this.cookie.persistent()) {
            j = this.cookie.expiresAt();
        } else {
            j = -1;
        }
        objectOutputStream.writeLong(j);
        objectOutputStream.writeObject(this.cookie.domain());
        objectOutputStream.writeObject(this.cookie.path());
        objectOutputStream.writeBoolean(this.cookie.secure());
        objectOutputStream.writeBoolean(this.cookie.httpOnly());
        objectOutputStream.writeBoolean(this.cookie.hostOnly());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[SYNTHETIC, Splitter:B:20:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[SYNTHETIC, Splitter:B:26:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String encode(okhttp3.Cookie r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Stream not closed in encodeCookie"
            java.lang.String r1 = "SerializableCookie"
            r9.cookie = r10
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 2
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r6.writeObject(r9)     // Catch:{ IOException -> 0x0031 }
            r6.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r5)
        L_0x0025:
            byte[] r10 = r10.toByteArray()
            java.lang.String r10 = byteArrayToHexString(r10)
            return r10
        L_0x002e:
            r10 = move-exception
            r2 = r6
            goto L_0x0053
        L_0x0031:
            r10 = move-exception
            goto L_0x0037
        L_0x0033:
            r10 = move-exception
            goto L_0x0053
        L_0x0035:
            r10 = move-exception
            r6 = r2
        L_0x0037:
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x002e }
            java.lang.String r8 = "IOException in encodeCookie"
            r7[r4] = r8     // Catch:{ all -> 0x002e }
            r7[r3] = r10     // Catch:{ all -> 0x002e }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r7)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0052
            r6.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0052
        L_0x0048:
            r10 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r10
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r5)
        L_0x0052:
            return r2
        L_0x0053:
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x0063
        L_0x0059:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r5)
        L_0x0063:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.cookie.persistence.SerializableCookie.encode(okhttp3.Cookie):java.lang.String");
    }

    private static byte[] hexStringToByteArray(String str, IAppContext iAppContext) {
        try {
            int length = str.length();
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        } catch (Throwable th) {
            AppBrandLogger.eWithThrowable("SerializableCookie", str, th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC, Splitter:B:29:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[SYNTHETIC, Splitter:B:34:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Cookie decode(java.lang.String r9, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r10) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.infra.cookie.persistence.SerializableCookie.decode(java.lang.String, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):okhttp3.Cookie");
    }
}
