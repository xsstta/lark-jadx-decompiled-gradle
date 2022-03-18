package com.bytedance.ee.lark.infra.network.ref.p636b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.C12883i;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.d */
public class C12868d<R> {

    /* renamed from: a */
    private C12883i f34346a;

    /* renamed from: b */
    private ECONetworkException f34347b;

    /* renamed from: c */
    private R f34348c;

    /* renamed from: d */
    private String f34349d;

    /* renamed from: a */
    public R mo48508a() {
        return this.f34348c;
    }

    /* renamed from: b */
    public String mo48510b() {
        return this.f34346a.mo48575b();
    }

    /* renamed from: c */
    public Map<String, String> mo48511c() {
        return this.f34346a.mo48576c();
    }

    /* renamed from: d */
    public int mo48512d() {
        return this.f34346a.mo48577d();
    }

    /* renamed from: e */
    public String mo48513e() {
        if (TextUtils.isEmpty(this.f34349d) && this.f34347b == null && this.f34346a.mo48574a() != null) {
            try {
                this.f34349d = this.f34346a.mo48574a().mo48485a();
            } catch (IOException e) {
                AppBrandLogger.m52829e("ECONetworkResponse", " body string err ", e);
                this.f34347b = new ECONetworkException("body string err ", e);
            }
        }
        return this.f34349d;
    }

    public C12868d(C12883i iVar) {
        this.f34346a = iVar;
    }

    /* renamed from: a */
    public void mo48509a(R r) {
        this.f34348c = r;
    }
}
