package com.bytedance.ee.lark.infra.network.p630d.p631a.p632a;

import com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c;
import okhttp3.Call;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.d.a.a.a */
public class C12832a {

    /* renamed from: a */
    public int f34282a;

    /* renamed from: b */
    public String f34283b;

    /* renamed from: c */
    public JSONObject f34284c;

    /* renamed from: d */
    public String f34285d;

    /* renamed from: e */
    public String f34286e;

    /* renamed from: f */
    public String f34287f;

    /* renamed from: g */
    public AbstractC12797c f34288g = new C12833a();

    /* renamed from: com.bytedance.ee.lark.infra.network.d.a.a.a$a */
    public static class C12833a implements AbstractC12797c {

        /* renamed from: a */
        private volatile boolean f34289a;

        /* renamed from: b */
        private Call f34290b;

        @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c
        /* renamed from: a */
        public boolean mo48355a() {
            return this.f34289a;
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c
        /* renamed from: b */
        public void mo48356b() {
            this.f34289a = true;
            Call call = this.f34290b;
            if (call != null && !call.isCanceled()) {
                this.f34290b.cancel();
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12797c
        /* renamed from: a */
        public void mo48354a(Call call) {
            this.f34290b = call;
        }
    }

    public C12832a(int i, String str, JSONObject jSONObject, String str2, String str3, String str4) {
        this.f34282a = i;
        this.f34283b = str;
        this.f34284c = jSONObject;
        this.f34287f = str2;
        this.f34285d = str3;
        this.f34286e = str4;
    }
}
