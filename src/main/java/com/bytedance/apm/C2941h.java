package com.bytedance.apm;

import com.bytedance.apm.config.C2895f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.h */
public class C2941h {

    /* renamed from: a */
    private static List<AbstractC2936g> f9446a = new ArrayList(2);

    /* renamed from: a */
    public static synchronized void m12400a(AbstractC2936g gVar) {
        synchronized (C2941h.class) {
            f9446a.add(gVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m12399a(C2895f fVar) {
        synchronized (C2941h.class) {
            for (AbstractC2936g gVar : f9446a) {
                if (gVar != null) {
                    gVar.mo12303a(fVar);
                }
            }
        }
    }
}
