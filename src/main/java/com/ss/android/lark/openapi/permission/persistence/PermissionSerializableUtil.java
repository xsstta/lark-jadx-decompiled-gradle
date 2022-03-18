package com.ss.android.lark.openapi.permission.persistence;

import java.io.Serializable;

public class PermissionSerializableUtil implements Serializable {
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

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035 A[Catch:{ IOException -> 0x0036, ClassNotFoundException -> 0x002c, all -> 0x0028, all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC, Splitter:B:31:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.lark.openapi.permission.bean.PermissionModel decode(java.lang.String r5) {
        /*
            java.lang.String r0 = "IOException in decode close ObjectInputStream"
            java.lang.String r1 = "PermissionSerializable"
            byte[] r5 = hexStringToByteArray(r5)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0036, ClassNotFoundException -> 0x002c, all -> 0x0028 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0036, ClassNotFoundException -> 0x002c, all -> 0x0028 }
            java.lang.Object r2 = r3.readObject()     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0024 }
            com.ss.android.lark.openapi.permission.bean.PermissionModel r2 = (com.ss.android.lark.openapi.permission.bean.PermissionModel) r2     // Catch:{ IOException -> 0x0026, ClassNotFoundException -> 0x0024 }
            r3.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0020
        L_0x001d:
            com.ss.android.lark.log.Log.m165389i(r1, r0)
        L_0x0020:
            r5 = r2
            goto L_0x0046
        L_0x0022:
            r5 = move-exception
            goto L_0x0047
        L_0x0024:
            r2 = move-exception
            goto L_0x002e
        L_0x0026:
            r2 = move-exception
            goto L_0x0038
        L_0x0028:
            r2 = move-exception
            r3 = r5
            r5 = r2
            goto L_0x0047
        L_0x002c:
            r2 = move-exception
            r3 = r5
        L_0x002e:
            java.lang.String r4 = "ClassNotFoundException in decode permission"
            com.ss.android.lark.log.Log.m165390i(r1, r4, r2)     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0046
            goto L_0x003f
        L_0x0036:
            r2 = move-exception
            r3 = r5
        L_0x0038:
            java.lang.String r4 = "IOException in decode permission"
            com.ss.android.lark.log.Log.m165390i(r1, r4, r2)     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0046
        L_0x003f:
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            com.ss.android.lark.log.Log.m165389i(r1, r0)
        L_0x0046:
            return r5
        L_0x0047:
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0050
        L_0x004d:
            com.ss.android.lark.log.Log.m165389i(r1, r0)
        L_0x0050:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openapi.permission.persistence.PermissionSerializableUtil.decode(java.lang.String):com.ss.android.lark.openapi.permission.bean.PermissionModel");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC, Splitter:B:21:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003e A[SYNTHETIC, Splitter:B:27:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String encode(com.ss.android.lark.openapi.permission.bean.PermissionModel r5) {
        /*
            java.lang.String r0 = "IOException in encode close ObjectOutputStream"
            java.lang.String r1 = "PermissionSerializable"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 0
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            r4.writeObject(r5)     // Catch:{ IOException -> 0x0026 }
            r4.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r5 = move-exception
            com.ss.android.lark.log.Log.m165390i(r1, r0, r5)
        L_0x001a:
            byte[] r5 = r2.toByteArray()
            java.lang.String r5 = byteArrayToHexString(r5)
            return r5
        L_0x0023:
            r5 = move-exception
            r3 = r4
            goto L_0x003c
        L_0x0026:
            r5 = move-exception
            goto L_0x002c
        L_0x0028:
            r5 = move-exception
            goto L_0x003c
        L_0x002a:
            r5 = move-exception
            r4 = r3
        L_0x002c:
            java.lang.String r2 = "IOException in encode permission"
            com.ss.android.lark.log.Log.m165390i(r1, r2, r5)     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x003b
            r4.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r5 = move-exception
            com.ss.android.lark.log.Log.m165390i(r1, r0, r5)
        L_0x003b:
            return r3
        L_0x003c:
            if (r3 == 0) goto L_0x0046
            r3.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r2 = move-exception
            com.ss.android.lark.log.Log.m165390i(r1, r0, r2)
        L_0x0046:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openapi.permission.persistence.PermissionSerializableUtil.encode(com.ss.android.lark.openapi.permission.bean.PermissionModel):java.lang.String");
    }
}
