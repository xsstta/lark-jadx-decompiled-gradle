package com.bytedance.ee.falcon.inspector.network;

import android.os.SystemClock;
import com.bytedance.ee.falcon.inspector.network.AbstractC12674i;
import com.bytedance.ee.falcon.inspector.p603a.C12643a;
import com.bytedance.ee.falcon.inspector.protocol.module.Console;
import com.bytedance.ee.falcon.inspector.protocol.module.Network;
import com.bytedance.ee.falcon.inspector.protocol.module.Page;
import com.lark.falcon.engine.inspect.p1062a.p1064b.C24001h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.network.j */
public class C12680j implements AbstractC12674i {

    /* renamed from: a */
    private static AbstractC12674i f33926a;

    /* renamed from: b */
    private final AtomicInteger f33927b = new AtomicInteger(0);

    /* renamed from: c */
    private C12684m f33928c;

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public boolean mo48060a() {
        return m52527e() != null;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public void mo48056a(AbstractC12674i.AbstractC12678d dVar) {
        C12681k e = m52527e();
        if (e != null) {
            Network.C12698g gVar = new Network.C12698g();
            gVar.f33985a = dVar.mo48015b();
            gVar.f33986b = dVar.mo48016c();
            gVar.f33987c = dVar.mo48017d();
            gVar.f33988d = m52521a((AbstractC12674i.AbstractC12675a) dVar);
            String b = m52522b(dVar);
            gVar.f33989e = b != null ? m52528f().mo48071b(b) : "application/octet-stream";
            gVar.f33990f = dVar.mo48018e();
            gVar.f33991g = dVar.mo48019f();
            gVar.f33992h = Boolean.valueOf(dVar.mo48020h());
            Network.C12699h hVar = new Network.C12699h();
            hVar.f33993a = dVar.mo48014a();
            hVar.f33994b = "1";
            hVar.f33995c = "1";
            hVar.f33996d = ((double) m52526d()) / 1000.0d;
            hVar.f33998f = gVar;
            hVar.f33997e = m52519a(m52518a(dVar, e), b, m52528f());
            e.mo48022a("Network.responseReceived", hVar);
        }
    }

    /* renamed from: d */
    private static long m52526d() {
        return SystemClock.elapsedRealtime();
    }

    private C12680j() {
    }

    /* renamed from: e */
    private C12681k m52527e() {
        C12681k b = C12681k.m52540b();
        if (b == null || !b.mo48023a()) {
            return null;
        }
        return b;
    }

    /* renamed from: f */
    private C12684m m52528f() {
        if (this.f33928c == null) {
            this.f33928c = new C12684m();
        }
        return this.f33928c;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: b */
    public String mo48061b() {
        return String.valueOf(this.f33927b.getAndIncrement());
    }

    /* renamed from: c */
    public static synchronized AbstractC12674i m52524c() {
        AbstractC12674i iVar;
        synchronized (C12680j.class) {
            if (f33926a == null) {
                f33926a = new C12680j();
            }
            iVar = f33926a;
        }
        return iVar;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public void mo48057a(String str) {
        m52523b(str);
    }

    /* renamed from: b */
    private String m52522b(AbstractC12674i.AbstractC12675a aVar) {
        return aVar.mo48006a("Content-Type");
    }

    /* renamed from: b */
    private void m52523b(String str) {
        C12681k e = m52527e();
        if (e != null) {
            Network.C12695d dVar = new Network.C12695d();
            dVar.f33970a = str;
            dVar.f33971b = ((double) m52526d()) / 1000.0d;
            e.mo48022a("Network.loadingFinished", dVar);
        }
    }

    /* renamed from: a */
    private static JSONObject m52521a(AbstractC12674i.AbstractC12675a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < aVar.mo48013g(); i++) {
            String a = aVar.mo48005a(i);
            String b = aVar.mo48008b(i);
            try {
                if (jSONObject.has(a)) {
                    jSONObject.put(a, jSONObject.getString(a) + "\n" + b);
                } else {
                    jSONObject.put(a, b);
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return jSONObject;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public void mo48055a(AbstractC12674i.AbstractC12676b bVar) {
        int i;
        C12681k e = m52527e();
        if (e != null) {
            Network.C12696e eVar = new Network.C12696e();
            eVar.f33972a = bVar.mo48010d();
            eVar.f33973b = bVar.mo48011e();
            eVar.f33974c = m52521a((AbstractC12674i.AbstractC12675a) bVar);
            eVar.f33975d = m52520a(e, bVar);
            String b = bVar.mo48007b();
            Integer c = bVar.mo48009c();
            Network.C12693b bVar2 = new Network.C12693b();
            bVar2.f33964a = Network.InitiatorType.SCRIPT;
            bVar2.f33965b = new ArrayList();
            List<Console.C12689a> list = bVar2.f33965b;
            if (c != null) {
                i = c.intValue();
            } else {
                i = 0;
            }
            list.add(new Console.C12689a(b, b, i, 0));
            Network.C12697f fVar = new Network.C12697f();
            fVar.f33976a = bVar.mo48004a();
            fVar.f33977b = "1";
            fVar.f33978c = "1";
            fVar.f33979d = bVar.mo48010d();
            fVar.f33980e = eVar;
            fVar.f33981f = ((double) m52526d()) / 1000.0d;
            fVar.f33982g = bVar2;
            fVar.f33983h = null;
            fVar.f33984i = Page.ResourceType.OTHER;
            e.mo48022a("Network.requestWillBeSent", fVar);
        }
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: b */
    public void mo48063b(String str, String str2) {
        m52525c(str, str2);
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public void mo48059a(String str, String str2) {
        m52525c(str, str2);
    }

    /* renamed from: a */
    private static AbstractC12664a m52518a(AbstractC12674i.AbstractC12678d dVar, C12681k kVar) {
        AbstractC12664a a = m52517a(dVar, kVar.mo48065d());
        if (a != null) {
            kVar.mo48064c().mo48073a(dVar.mo48014a(), a);
        }
        return a;
    }

    /* renamed from: a */
    static AbstractC12664a m52517a(AbstractC12674i.AbstractC12678d dVar, C12666c cVar) {
        if (cVar == null) {
            return null;
        }
        int g = dVar.mo48013g();
        for (int i = 0; i < g; i++) {
            AbstractC12665b a = cVar.mo48038a(dVar.mo48005a(i));
            if (a != null) {
                return a.mo48037a(dVar.mo48005a(i), dVar.mo48008b(i));
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m52525c(String str, String str2) {
        C12681k e = m52527e();
        if (e != null) {
            Network.C12694c cVar = new Network.C12694c();
            cVar.f33966a = str;
            cVar.f33967b = ((double) m52526d()) / 1000.0d;
            cVar.f33968c = str2;
            cVar.f33969d = Page.ResourceType.OTHER;
            e.mo48022a("Network.loadingFailed", cVar);
        }
    }

    /* renamed from: a */
    private static String m52520a(C12681k kVar, AbstractC12674i.AbstractC12676b bVar) {
        try {
            byte[] f = bVar.mo48012f();
            if (f != null) {
                return new String(f, C24001h.f59363a);
            }
            return null;
        } catch (IOException | OutOfMemoryError e) {
            Console.MessageLevel messageLevel = Console.MessageLevel.WARNING;
            Console.MessageSource messageSource = Console.MessageSource.NETWORK;
            C12643a.m52422a(kVar, messageLevel, messageSource, "Could not reproduce POST body: " + e);
            return null;
        }
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public void mo48058a(String str, int i, int i2) {
        mo48062b(str, i, i2);
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: b */
    public void mo48062b(String str, int i, int i2) {
        C12681k e = m52527e();
        if (e != null) {
            Network.C12692a aVar = new Network.C12692a();
            aVar.f33960a = str;
            aVar.f33961b = ((double) m52526d()) / 1000.0d;
            aVar.f33962c = i;
            aVar.f33963d = i2;
            e.mo48022a("Network.dataReceived", aVar);
        }
    }

    /* renamed from: a */
    private static Page.ResourceType m52519a(AbstractC12664a aVar, String str, C12684m mVar) {
        if (aVar != null) {
            return aVar.mo48036a().getResourceType();
        }
        if (str != null) {
            return mVar.mo48070a(str);
        }
        return Page.ResourceType.OTHER;
    }

    @Override // com.bytedance.ee.falcon.inspector.network.AbstractC12674i
    /* renamed from: a */
    public InputStream mo48054a(String str, String str2, String str3, InputStream inputStream, AbstractC12686o oVar) {
        C12681k e = m52527e();
        if (e != null) {
            Page.ResourceType resourceType = null;
            if (inputStream == null) {
                oVar.mo48043a();
                return null;
            }
            if (str2 != null) {
                resourceType = m52528f().mo48070a(str2);
            }
            boolean z = false;
            if (resourceType != null && resourceType == Page.ResourceType.IMAGE) {
                z = true;
            }
            try {
                return C12668e.m52477a(e, str, inputStream, e.mo48064c().mo48072a(str, z), str3, oVar);
            } catch (IOException unused) {
                Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                C12643a.m52422a(e, messageLevel, messageSource, "Error writing response body data for request #" + str);
            }
        }
        return inputStream;
    }
}
