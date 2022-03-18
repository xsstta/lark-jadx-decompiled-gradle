package com.bytedance.apm.impl;

import com.bytedance.apm.util.C3116d;
import com.bytedance.apm.util.C3122i;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTTNetImpl implements IHttpService {
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

    private List<Header> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new Header(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b doGet(String str, Map<String, String> map) throws Exception {
        SsResponse<TypedInput> execute = ((RetrofitMonitorService) RetrofitUtils.createSsService(str, RetrofitMonitorService.class)).fetch(str, map, false).execute();
        return new C20697b(execute.code(), toByteArray(execute.body().in()));
    }

    private C20697b doUploadFiles(String str, List<File> list, Map<String, String> map) {
        return C3116d.m12978a(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b uploadFiles(String str, List<File> list, Map<String, String> map) throws Exception {
        return doUploadFiles(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C20697b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        int i;
        int i2 = 0;
        Call<TypedInput> report = ((RetrofitMonitorService) RetrofitUtils.createSsService(str, RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap hashMap = new HashMap();
        byte[] bArr2 = null;
        try {
            SsResponse<TypedInput> execute = report.execute();
            bArr2 = toByteArray(execute.body().in());
            List<Header> headers = execute.headers();
            if (!C3122i.m13009a(headers)) {
                for (Header header : headers) {
                    hashMap.put(header.getName(), header.getValue());
                }
            }
            i = execute.code();
        } catch (Throwable th) {
            try {
                if (th instanceof HttpResponseException) {
                    i2 = th.getStatusCode();
                }
                if (th instanceof CronetIOException) {
                    i = ((CronetIOException) th).getStatusCode();
                }
            } catch (Exception unused) {
            }
            i = i2;
        }
        return new C20697b(i, hashMap, bArr2);
    }
}
