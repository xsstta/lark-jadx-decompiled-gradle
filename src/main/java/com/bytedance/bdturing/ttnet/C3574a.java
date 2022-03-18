package com.bytedance.bdturing.ttnet;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.bdturing.ttnet.a */
public class C3574a {
    /* renamed from: a */
    public static void m15099a() {
        final HashMap hashMap = new HashMap();
        hashMap.put("x-vc-bdturing-sdk-version", "2.2.2.i18n");
        RetrofitUtils.addInterceptor(new Interceptor() {
            /* class com.bytedance.bdturing.ttnet.C3574a.C35762 */

            @Override // com.bytedance.retrofit2.intercept.Interceptor
            public SsResponse intercept(Interceptor.Chain chain) throws Exception {
                Request request = chain.request();
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(request.getHeaders());
                for (String str : hashMap.keySet()) {
                    linkedList.add(new Header(str, (String) hashMap.get(str)));
                }
                return chain.proceed(request.newBuilder().mo69379a(linkedList).mo69380b());
            }
        });
    }

    /* renamed from: a */
    private static INetworkApi m15097a(String str) {
        return (INetworkApi) RetrofitUtils.getSsRetrofit(str).create(INetworkApi.class);
    }

    /* renamed from: a */
    private static List<Header> m15098a(Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new Header(str, map.get(str)));
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private static byte[] m15100a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static byte[] m15101a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        try {
            SsResponse<TypedInput> execute = m15097a(str).doGet(true, str, map, m15098a(map2)).execute();
            if (execute.code() == 200) {
                return m15100a(execute.body().in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static byte[] m15102a(String str, String str2, Map<String, String> map, final byte[] bArr, Map<String, String> map2) {
        try {
            SsResponse<TypedInput> execute = m15097a(str).doPost(str, map, new TypedOutput() {
                /* class com.bytedance.bdturing.ttnet.C3574a.C35751 */

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public String fileName() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public String md5Stub() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public String mimeType() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public long length() {
                    return (long) bArr.length;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public void writeTo(OutputStream outputStream) throws IOException {
                    outputStream.write(bArr);
                }
            }, m15098a(map2)).execute();
            if (execute.code() == 200) {
                return m15100a(execute.body().in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }
}
