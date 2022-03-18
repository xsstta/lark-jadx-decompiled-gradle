package com.bytedance.apm.block;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.block.e */
public class C2866e {

    /* renamed from: a */
    private static List<AbstractC2865d> f9166a = new ArrayList(2);

    /* renamed from: a */
    public static synchronized void m12067a(AbstractC2865d dVar) {
        synchronized (C2866e.class) {
            f9166a.add(dVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m12068a(boolean z, long j) {
        synchronized (C2866e.class) {
            for (AbstractC2865d dVar : f9166a) {
                if (dVar != null) {
                    dVar.mo12311a(z, j);
                }
            }
        }
    }
}
