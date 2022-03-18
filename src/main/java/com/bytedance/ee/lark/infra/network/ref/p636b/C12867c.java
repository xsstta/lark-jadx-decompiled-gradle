package com.bytedance.ee.lark.infra.network.ref.p636b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.ref.entity.C12880g;
import com.bytedance.ee.lark.infra.network.ref.entity.C12882h;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkSchema;
import com.bytedance.ee.lark.infra.network.ref.entity.MethodType;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.c */
public class C12867c {

    /* renamed from: a */
    private Map<String, String> f34338a;

    /* renamed from: b */
    private ECONetworkSchema f34339b;

    /* renamed from: c */
    private String f34340c;

    /* renamed from: d */
    private String f34341d;

    /* renamed from: e */
    private C12882h f34342e;

    /* renamed from: f */
    private Map<String, Object> f34343f = new HashMap();

    /* renamed from: g */
    private MethodType f34344g;

    /* renamed from: h */
    private Map<String, String> f34345h = new HashMap();

    /* renamed from: a */
    public Map<String, Object> mo48501a() {
        return this.f34343f;
    }

    /* renamed from: b */
    public Map<String, String> mo48505b() {
        return this.f34345h;
    }

    /* renamed from: c */
    public C12880g mo48506c() throws Exception {
        return new C12880g.C12881a().mo48568a(mo48507d()).mo48567a(this.f34344g, this.f34342e).mo48569a(this.f34345h).mo48570a();
    }

    /* renamed from: d */
    public String mo48507d() throws Exception {
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.scheme(this.f34339b.getSchema()).host(this.f34340c);
        if (!TextUtils.isEmpty(this.f34341d)) {
            builder.encodedPath(this.f34341d);
        }
        Map<String, String> map = this.f34338a;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : this.f34338a.entrySet()) {
                builder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builder.build().toString();
    }

    /* renamed from: a */
    public void mo48502a(C12882h hVar) {
        this.f34342e = hVar;
    }

    /* renamed from: a */
    public void mo48503a(String str) {
        this.f34340c = str;
    }

    public C12867c(AbstractC12871g gVar) {
        if (gVar != null) {
            this.f34339b = gVar.mo48524a();
            this.f34340c = gVar.mo48525b();
            this.f34341d = gVar.mo48526c();
            this.f34342e = gVar.mo48529f();
            this.f34344g = gVar.mo48527d();
            if (gVar.mo48528e() != null && gVar.mo48528e().size() > 0) {
                this.f34345h.putAll(gVar.mo48528e());
            }
        }
    }

    /* renamed from: a */
    public void mo48504a(String str, String str2) {
        this.f34345h.put(str, str2);
    }
}
