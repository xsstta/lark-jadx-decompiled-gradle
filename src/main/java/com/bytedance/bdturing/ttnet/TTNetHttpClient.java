package com.bytedance.bdturing.ttnet;

import android.content.Context;
import com.bytedance.bdturing.C3520a;
import com.bytedance.bdturing.net.HttpClient;
import java.util.Map;

public class TTNetHttpClient implements HttpClient {
    private Context context;

    public TTNetHttpClient(Context context2) {
        this.context = context2;
        if (C3520a.m14831a().mo14275c().mo14229r()) {
            C3574a.m15099a();
        }
    }

    @Override // com.bytedance.bdturing.net.HttpClient
    public byte[] get(String str, Map<String, String> map) {
        C3577b.m15103a(this.context, str, map);
        return C3574a.m15101a(str, null, null, map);
    }

    @Override // com.bytedance.bdturing.net.HttpClient
    public byte[] post(String str, Map<String, String> map, byte[] bArr) {
        C3577b.m15103a(this.context, str, map);
        return C3574a.m15102a(str, null, null, bArr, map);
    }
}
