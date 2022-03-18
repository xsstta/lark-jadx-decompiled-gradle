package org.chromium.wschannel;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: org.chromium.wschannel.a */
public class C70018a extends Observable {

    /* renamed from: a */
    private static volatile C70018a f174999a;

    /* renamed from: a */
    public static C70018a m268596a() {
        if (f174999a == null) {
            synchronized (C70018a.class) {
                if (f174999a == null) {
                    f174999a = new C70018a();
                }
            }
        }
        return f174999a;
    }

    /* renamed from: a */
    private void m268597a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public void mo246516a(String str, long j, long j2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put("is_heartbeat_frame", Boolean.valueOf(z));
        m268597a(hashMap);
    }
}
