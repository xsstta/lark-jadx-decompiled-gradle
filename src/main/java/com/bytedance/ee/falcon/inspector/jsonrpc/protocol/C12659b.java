package com.bytedance.ee.falcon.inspector.jsonrpc.protocol;

import android.database.Observable;
import com.bytedance.ee.falcon.inspector.json.C12653a;
import com.bytedance.ee.falcon.inspector.jsonrpc.AbstractC12654a;
import com.bytedance.ee.falcon.inspector.jsonrpc.AbstractC12657d;
import com.bytedance.ee.falcon.inspector.jsonrpc.C12656c;
import com.bytedance.ee.falcon.inspector.utils.C12701b;
import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.jsonrpc.protocol.b */
public class C12659b {

    /* renamed from: a */
    private final AbstractC24000g f33900a;

    /* renamed from: b */
    private final C12653a f33901b;

    /* renamed from: c */
    private final Map<Long, C12656c> f33902c = new HashMap();

    /* renamed from: d */
    private final C12661a f33903d = new C12661a();

    /* renamed from: e */
    private long f33904e;

    /* renamed from: com.bytedance.ee.falcon.inspector.jsonrpc.protocol.b$a */
    private static class C12661a extends Observable<AbstractC12654a> {
        private C12661a() {
        }

        /* renamed from: a */
        public void mo48034a() {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC12654a) this.mObservers.get(i)).mo48029a();
            }
        }
    }

    /* renamed from: a */
    public AbstractC24000g mo48031a() {
        return this.f33900a;
    }

    /* renamed from: b */
    public void mo48033b() {
        this.f33903d.mo48034a();
    }

    /* renamed from: a */
    private synchronized long m52468a(AbstractC12657d dVar) {
        long j;
        j = this.f33904e;
        this.f33904e = 1 + j;
        this.f33902c.put(Long.valueOf(j), new C12656c(j, dVar));
        return j;
    }

    public C12659b(C12653a aVar, AbstractC24000g gVar) {
        this.f33901b = aVar;
        this.f33900a = (AbstractC24000g) C12701b.m52567a(gVar);
    }

    /* renamed from: a */
    public void mo48032a(String str, Object obj, AbstractC12657d dVar) throws NotYetConnectedException {
        Long l;
        C12701b.m52567a(str);
        if (dVar != null) {
            l = Long.valueOf(m52468a(dVar));
        } else {
            l = null;
        }
        this.f33900a.mo86163a(((JSONObject) this.f33901b.mo48027a(new C12662c(l, str, (JSONObject) this.f33901b.mo48027a(obj, JSONObject.class)), JSONObject.class)).toString());
    }
}
