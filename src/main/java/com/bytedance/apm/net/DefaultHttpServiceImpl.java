package com.bytedance.apm.net;

import com.bytedance.apm.util.C3116d;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b doGet(String str, Map<String, String> map) throws Exception {
        return doRequest(str, null, METHOD_GET, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return C3116d.m12978a(str, list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0121 A[SYNTHETIC, Splitter:B:69:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0128 A[SYNTHETIC, Splitter:B:73:0x0128] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.C20697b doRequest(java.lang.String r9, byte[] r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 322
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.b");
    }
}
