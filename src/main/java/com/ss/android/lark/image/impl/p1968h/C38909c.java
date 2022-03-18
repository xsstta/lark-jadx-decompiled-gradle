package com.ss.android.lark.image.impl.p1968h;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bytedance.lark.sdk.LarkNet;
import com.bytedance.lark.sdk.LarkRequest;
import com.bytedance.lark.sdk.LarkResponse;
import com.larksuite.framework.http.response.C26014a;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.log.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.image.impl.h.c */
public class C38909c implements AbstractC38809a<InputStream> {

    /* renamed from: a */
    private final LarkNet f99987a;

    /* renamed from: b */
    private final String f99988b;

    /* renamed from: c */
    private final Map<String, String> f99989c;

    /* renamed from: d */
    private final int f99990d;

    /* renamed from: e */
    private final int f99991e;

    /* renamed from: f */
    private InputStream f99992f;

    /* renamed from: g */
    private volatile boolean f99993g;

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: b */
    public void mo142218b() {
        this.f99993g = true;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: c */
    public Class<InputStream> mo142219c() {
        return InputStream.class;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: d */
    public DataSource mo142220d() {
        return DataSource.REMOTE;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142216a() {
        C26266d.m95082a(this.f99992f);
    }

    /* renamed from: a */
    private String m153586a(List<C26014a> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C26014a aVar = list.get(i);
            sb.append(aVar.mo92502a());
            sb.append('=');
            sb.append(aVar.mo92503b());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private InputStream m153585a(int i) throws IOException {
        String str;
        LarkRequest.Builder aVar = new LarkRequest.Builder();
        aVar.mo67098a(this.f99988b);
        for (Map.Entry<String, String> entry : this.f99989c.entrySet()) {
            aVar.mo67093a(entry.getKey(), entry.getValue());
        }
        m153587a(aVar, this.f99988b);
        aVar.mo67099a(true);
        LarkRequest m = aVar.mo67116m();
        if (this.f99993g) {
            return null;
        }
        LarkResponse a = this.f99987a.mo67181a(m);
        LarkResponse.ResponseHeader c = a.mo67119c();
        if (c != null) {
            int a2 = c.mo67149a();
            if (a2 / 100 == 2) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.mo67122f().mo67146b().toByteArray());
                this.f99992f = byteArrayInputStream;
                return byteArrayInputStream;
            }
            Log.m165383e("RustUrlDataFetcher", "Failed to load image with url：" + this.f99988b + ", statusCode:" + a2 + ", msg:" + a.mo67122f().mo67146b());
            throw new IOException("Request failed " + a2 + ": " + a.mo67122f().mo67146b().toString());
        } else if (i < 3) {
            return m153585a(i + 1);
        } else {
            LarkResponse.InnerError d = a.mo67120d();
            LarkResponse.ResponseError e = a.mo67121e();
            StringBuilder sb = new StringBuilder("Failed to load image with url: ");
            sb.append(this.f99988b);
            sb.append(", inner error:");
            String str2 = "Unknown";
            if (d == null) {
                str = str2;
            } else {
                str = d.mo67144b();
            }
            sb.append(str);
            sb.append(", response error:");
            if (e != null) {
                str2 = e.mo67148b();
            }
            sb.append(str2);
            Log.m165383e("RustUrlDataFetcher", sb.toString());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m153587a(LarkRequest.Builder aVar, String str) {
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (this.f99988b.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        List<C26014a> a = C38792a.m153106a().mo142258a(str);
        if (CollectionUtils.isNotEmpty(a)) {
            aVar.mo67093a("Cookie", m153586a(a));
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a
    /* renamed from: a */
    public void mo142217a(Priority priority, AbstractC38809a.AbstractC38810a<? super InputStream> aVar) {
        try {
            InputStream a = m153585a(0);
            if (a != null) {
                aVar.mo142222a(a);
            } else {
                aVar.mo142221a(new Exception("Request is canceled"));
            }
        } catch (IOException e) {
            Log.m165383e("RustUrlDataFetcher", "loadData:" + e);
            aVar.mo142221a((Exception) e);
            e.printStackTrace();
        }
    }

    public C38909c(LarkNet eVar, String str, Map<String, String> map, int i, int i2) {
        HashMap hashMap = new HashMap();
        this.f99989c = hashMap;
        this.f99987a = eVar;
        this.f99988b = str;
        this.f99990d = i;
        this.f99991e = i2;
        if (CollectionUtils.isNotEmpty(map)) {
            hashMap.putAll(map);
        }
    }
}
