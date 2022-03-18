package com.bytedance.ee.falcon.inspector.p604b;

import android.util.Log;
import com.bytedance.ee.falcon.inspector.jsonrpc.AbstractC12654a;
import com.bytedance.ee.falcon.inspector.jsonrpc.AbstractC12657d;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12659b;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.falcon.inspector.b.a */
public class C12648a {

    /* renamed from: a */
    private final Map<C12659b, AbstractC12654a> f33884a = new HashMap();

    /* renamed from: b */
    private C12659b[] f33885b;

    /* renamed from: c */
    private AbstractC12649b f33886c;

    /* renamed from: b */
    private synchronized C12659b[] m52445b() {
        if (this.f33885b == null) {
            this.f33885b = (C12659b[]) this.f33884a.keySet().toArray(new C12659b[this.f33884a.size()]);
        }
        return this.f33885b;
    }

    /* renamed from: a */
    public synchronized boolean mo48023a() {
        return !this.f33884a.isEmpty();
    }

    /* renamed from: a */
    public synchronized void mo48021a(AbstractC12649b bVar) {
        this.f33886c = bVar;
    }

    /* renamed from: a */
    public void mo48022a(String str, Object obj) {
        m52444a(str, obj, null);
    }

    /* renamed from: a */
    private void m52444a(String str, Object obj, AbstractC12657d dVar) {
        for (C12659b bVar : m52445b()) {
            try {
                bVar.mo48032a(str, obj, dVar);
            } catch (NotYetConnectedException e) {
                Log.e("ChromePeerManager", "Error delivering data to Chrome", e);
            }
        }
    }
}
