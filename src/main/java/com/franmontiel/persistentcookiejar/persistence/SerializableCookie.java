package com.franmontiel.persistentcookiejar.persistence;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

public class SerializableCookie implements Serializable {
    private static long NON_VALID_EXPIRES_AT = -1;
    private static final String TAG = "SerializableCookie";
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

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Cookie.Builder builder = new Cookie.Builder();
        builder.name((String) objectInputStream.readObject());
        builder.value((String) objectInputStream.readObject());
        long readLong = objectInputStream.readLong();
        if (readLong != NON_VALID_EXPIRES_AT) {
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
            j = NON_VALID_EXPIRES_AT;
        }
        objectOutputStream.writeLong(j);
        objectOutputStream.writeObject(this.cookie.domain());
        objectOutputStream.writeObject(this.cookie.path());
        objectOutputStream.writeBoolean(this.cookie.secure());
        objectOutputStream.writeBoolean(this.cookie.httpOnly());
        objectOutputStream.writeBoolean(this.cookie.hostOnly());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Cookie decode(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Stream not closed in decodeCookie"
            byte[] r6 = hexStringToByteArray(r6)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x002c, all -> 0x0028 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x002c, all -> 0x0028 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0024 }
            com.franmontiel.persistentcookiejar.persistence.SerializableCookie r1 = (com.franmontiel.persistentcookiejar.persistence.SerializableCookie) r1     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0024 }
            okhttp3.Cookie r6 = r1.cookie     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0024 }
            r2.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0049
        L_0x001d:
            r1 = move-exception
            java.lang.String r2 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            android.util.Log.d(r2, r0, r1)
            goto L_0x0049
        L_0x0024:
            r1 = move-exception
            goto L_0x002e
        L_0x0026:
            r1 = move-exception
            goto L_0x003d
        L_0x0028:
            r1 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x004b
        L_0x002c:
            r1 = move-exception
            r2 = r6
        L_0x002e:
            java.lang.String r3 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "ClassNotFoundException in decodeCookie"
            android.util.Log.d(r3, r4, r1)     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0049
            r2.close()
            goto L_0x0049
        L_0x003b:
            r1 = move-exception
            r2 = r6
        L_0x003d:
            java.lang.String r3 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            java.lang.String r4 = "IOException in decodeCookie"
            android.util.Log.d(r3, r4, r1)
            if (r2 == 0) goto L_0x0049
            r2.close()
        L_0x0049:
            return r6
        L_0x004a:
            r6 = move-exception
        L_0x004b:
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0057
        L_0x0051:
            r1 = move-exception
            java.lang.String r2 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            android.util.Log.d(r2, r0, r1)
        L_0x0057:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.franmontiel.persistentcookiejar.persistence.SerializableCookie.decode(java.lang.String):okhttp3.Cookie");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[SYNTHETIC, Splitter:B:18:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[SYNTHETIC, Splitter:B:26:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String encode(okhttp3.Cookie r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Stream not closed in encodeCookie"
            r5.cookie = r6
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0029, all -> 0x0027 }
            r2.writeObject(r5)     // Catch:{ IOException -> 0x0025 }
            r2.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r1 = move-exception
            java.lang.String r2 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            android.util.Log.d(r2, r0, r1)
        L_0x001c:
            byte[] r6 = r6.toByteArray()
            java.lang.String r6 = byteArrayToHexString(r6)
            return r6
        L_0x0025:
            r6 = move-exception
            goto L_0x002b
        L_0x0027:
            r6 = move-exception
            goto L_0x0041
        L_0x0029:
            r6 = move-exception
            r2 = r1
        L_0x002b:
            java.lang.String r3 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG     // Catch:{ all -> 0x003f }
            java.lang.String r4 = "IOException in encodeCookie"
            android.util.Log.d(r3, r4, r6)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r6 = move-exception
            java.lang.String r2 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            android.util.Log.d(r2, r0, r6)
        L_0x003e:
            return r1
        L_0x003f:
            r6 = move-exception
            r1 = r2
        L_0x0041:
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r1 = move-exception
            java.lang.String r2 = com.franmontiel.persistentcookiejar.persistence.SerializableCookie.TAG
            android.util.Log.d(r2, r0, r1)
        L_0x004d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.franmontiel.persistentcookiejar.persistence.SerializableCookie.encode(okhttp3.Cookie):java.lang.String");
    }
}
