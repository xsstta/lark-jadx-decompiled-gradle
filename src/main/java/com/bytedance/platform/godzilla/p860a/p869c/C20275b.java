package com.bytedance.platform.godzilla.p860a.p869c;

import android.os.IBinder;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20261c;
import com.bytedance.platform.godzilla.p860a.p862b.p866b.p867a.C20264a;
import com.bytedance.platform.godzilla.p872b.C20312d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.godzilla.a.c.b */
public class C20275b extends AbstractC20261c {

    /* renamed from: com.bytedance.platform.godzilla.a.c.b$a */
    private static class C20277a extends AbstractC20260b {
        private C20277a() {
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68542a(Object obj, Method method, Object[] objArr) {
            return super.mo68542a(obj, method, objArr);
        }
    }

    static {
        m73958a("getNetworkCapabilities", new C20277a());
        m73958a("getAllNetworks", new C20277a());
        m73958a("getLinkProperties", new C20277a());
        m73958a("getActiveNetworkInfo", new C20277a());
    }

    /* renamed from: b */
    public void mo68556b() {
        try {
            C20264a aVar = new C20264a("connectivity", this);
            aVar.mo68552b();
            mo68546a(C20312d.m74079a(Class.forName("android.net.IConnectivityManager$Stub"), "asInterface", IBinder.class).invoke(null, aVar.mo68545a()));
            Logger.m74095a("IConnectivityManagerProxy", "Hook proxy success!");
        } catch (Exception e) {
            Logger.m74095a("IConnectivityManagerProxy", "Hook proxy connectivity Failed!!!");
            e.printStackTrace();
        }
    }
}
