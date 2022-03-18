package com.bytedance.ee.bear.more.itemv2;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;

/* renamed from: com.bytedance.ee.bear.more.itemv2.c */
public class C10236c {
    /* renamed from: a */
    public static String m42701a(IMoreInfo dVar) {
        if (dVar instanceof WikiMoreInfo) {
            return ((WikiMoreInfo) dVar).mo39091O();
        }
        return dVar.mo39041h();
    }

    /* renamed from: b */
    public static int m42702b(IMoreInfo dVar) {
        if (dVar instanceof WikiMoreInfo) {
            return C8275a.f22377j.mo32555b();
        }
        return dVar.mo39036e();
    }
}
