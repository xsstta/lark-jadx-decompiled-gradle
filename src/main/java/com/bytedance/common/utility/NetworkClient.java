package com.bytedance.common.utility;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class NetworkClient {
    private static NetworkClient sDefault = new DummyNetworkClient();

    public static class ReqContext {
        public boolean addCommonParams;
    }

    public abstract String get(String str, Map<String, String> map, ReqContext reqContext) throws Exception;

    public abstract String post(String str, List<Pair<String, String>> list, Map<String, String> map, ReqContext reqContext) throws CommonHttpException;

    public abstract String post(String str, byte[] bArr, Map<String, String> map, ReqContext reqContext) throws CommonHttpException;

    public byte[] postDataStream(String str, byte[] bArr, Map<String, String> map, ReqContext reqContext) throws CommonHttpException {
        return null;
    }

    public static NetworkClient getDefault() {
        return sDefault;
    }

    public static void setDefault(NetworkClient networkClient) {
        if (networkClient != null && networkClient != sDefault) {
            sDefault = networkClient;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] compressWithgzip(byte[] r3) throws java.lang.Exception {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x001b }
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r2.<init>(r1)     // Catch:{ all -> 0x001b }
            r2.write(r3)     // Catch:{ all -> 0x0018 }
            r2.close()     // Catch:{ all -> 0x0018 }
            byte[] r3 = r1.toByteArray()
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.NetworkClient.compressWithgzip(byte[]):byte[]");
    }

    public String post(String str, byte[] bArr, boolean z, String str2, boolean z2) throws CommonHttpException {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = compressWithgzip(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e) {
                throw new CommonHttpException(0, e.getMessage());
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("Content-Type", str2);
        }
        ReqContext reqContext = new ReqContext();
        reqContext.addCommonParams = z2;
        return post(str, bArr, hashMap, reqContext);
    }
}
