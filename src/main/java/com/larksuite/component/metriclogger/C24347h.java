package com.larksuite.component.metriclogger;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.sdk.log.C19837a;
import com.larksuite.component.metriclogger.C24345g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.metriclogger.h */
public class C24347h implements AbstractC24337b {

    /* renamed from: c */
    private static AtomicBoolean f60051c = new AtomicBoolean(false);

    /* renamed from: a */
    private FixSizeLinkedList<C24345g> f60052a = new FixSizeLinkedList<>(30);

    /* renamed from: b */
    private final Object f60053b = new Object();

    C24347h() {
    }

    /* renamed from: a */
    private static String m88881a(Object obj) {
        if (obj == null) {
            return "{}";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable unused) {
            return "{}";
        }
    }

    @Override // com.larksuite.component.metriclogger.AbstractC24337b
    /* renamed from: a */
    public boolean mo87089a(C24345g gVar) {
        if (gVar == null || !mo87105b(gVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m88883c(C24345g gVar) {
        if (gVar == null) {
            return false;
        }
        String a = m88881a(gVar.f60046g);
        if (gVar.f60047h == 2) {
            return C19837a.m72364a(gVar.f60041b, gVar.f60042c, gVar.f60043d, gVar.f60044e, gVar.f60045f, a, 2, gVar.f60048i);
        }
        return C19837a.m72363a(gVar.f60041b, gVar.f60042c, gVar.f60043d, gVar.f60044e, gVar.f60045f, a);
    }

    /* renamed from: b */
    public boolean mo87105b(C24345g gVar) {
        if (gVar.f60046g == null) {
            gVar.f60046g = new HashMap();
        }
        gVar.f60046g.put("channel_type", "client_metrics");
        synchronized (this.f60053b) {
            if (!f60051c.get()) {
                FixSizeLinkedList<C24345g> fixSizeLinkedList = this.f60052a;
                if (fixSizeLinkedList != null) {
                    fixSizeLinkedList.add(gVar);
                }
                return false;
            }
            FixSizeLinkedList<C24345g> fixSizeLinkedList2 = this.f60052a;
            if (fixSizeLinkedList2 != null) {
                Iterator it = fixSizeLinkedList2.iterator();
                while (it.hasNext()) {
                    m88883c((C24345g) it.next());
                }
                this.f60052a = null;
            }
            return m88883c(gVar);
        }
    }

    /* renamed from: a */
    public static void m88882a(String str, String str2) {
        if (!f60051c.get()) {
            if (TextUtils.isEmpty(str)) {
                str = "main";
            }
            try {
                f60051c.set(true);
                C19837a.m72361a(str, str2);
            } catch (Exception e) {
                Log.e("MLog", "initMetricPath error=" + e.toString());
            }
        }
    }

    /* renamed from: b */
    public C24345g.C24346a mo87088a(int i, int i2, int... iArr) {
        return C24345g.m88863a(this, i, i2, iArr);
    }
}
