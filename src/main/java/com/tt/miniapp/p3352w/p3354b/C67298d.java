package com.tt.miniapp.p3352w.p3354b;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.w.b.d */
public class C67298d implements AbstractC67299e {

    /* renamed from: b */
    private static final long f169842b = SystemClock.elapsedRealtime();

    /* renamed from: a */
    private ConcurrentHashMap<String, Vector<String>> f169843a = new ConcurrentHashMap<>();

    @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67299e
    /* renamed from: a */
    public void mo233964a(String str, String str2) {
        String a = C67300f.m262171a(str2);
        Vector<String> vector = this.f169843a.get(a);
        if (vector == null) {
            Vector<String> vector2 = new Vector<>();
            this.f169843a.put(a, vector2);
            vector2.add(str);
            return;
        }
        boolean z = false;
        Iterator<String> it = vector.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                z = true;
            }
        }
        if (!z) {
            vector.add(str);
        }
    }

    @Override // com.tt.miniapp.p3352w.p3354b.AbstractC67299e
    /* renamed from: b */
    public void mo233965b(String str, String str2) {
        String a = C67300f.m262171a(str2);
        Vector<String> vector = this.f169843a.get(a);
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(str)) {
                        vector.remove(str);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (vector.size() == 0) {
                this.f169843a.remove(a);
            }
        }
    }
}
