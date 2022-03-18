package com.tt.miniapp.net.p3309b;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import okhttp3.Dns;

/* renamed from: com.tt.miniapp.net.b.b */
public class C66510b implements Dns {

    /* renamed from: a */
    private IAppContext f167900a;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.net.b.b$a */
    public static class C66511a {

        /* renamed from: a */
        static final C66510b f167901a = new C66510b();
    }

    /* renamed from: a */
    public static C66510b m259911a() {
        return C66511a.f167901a;
    }

    /* renamed from: a */
    public void mo232080a(IAppContext iAppContext) {
        this.f167900a = iAppContext;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        if (str != null) {
            try {
                List<InetAddress> a = C66509a.m259907a().mo232078a(str);
                if (a != null && a.size() > 0) {
                    return a;
                }
                List<InetAddress> lookup = Dns.SYSTEM.lookup(str);
                if (lookup != null && lookup.size() > 0) {
                    List<InetAddress> a2 = C66509a.m259907a().mo232078a(str);
                    if (a2 == null || a2.size() <= 0) {
                        return lookup;
                    }
                    return a2;
                }
                List<InetAddress> a3 = C66509a.m259907a().mo232079a(str, this.f167900a);
                if (a3 != null && a3.size() > 0) {
                    return a3;
                }
                throw new UnknownHostException("resolve dns failed by http dns, domain=" + str);
            } catch (Exception unused) {
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }
}
