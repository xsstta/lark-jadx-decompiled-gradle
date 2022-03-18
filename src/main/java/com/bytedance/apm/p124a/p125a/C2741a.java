package com.bytedance.apm.p124a.p125a;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.p124a.AbstractC2738a;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a.a */
public class C2741a extends AbstractC2738a<AbstractC2747b> {

    /* renamed from: c */
    private static volatile C2741a f8801c;

    /* renamed from: b */
    private AbstractC2742b f8802b;

    private C2741a() {
    }

    /* renamed from: c */
    public static C2741a m11630c() {
        if (f8801c == null) {
            synchronized (C2741a.class) {
                if (f8801c == null) {
                    f8801c = new C2741a();
                }
            }
        }
        return f8801c;
    }

    /* renamed from: a */
    public void mo11795a(AbstractC2742b bVar) {
        this.f8802b = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p124a.AbstractC2738a
    /* renamed from: e */
    public void mo11790e(AbstractC2747b bVar) {
        JSONObject a = bVar.mo11807a();
        boolean a2 = bVar.mo11808a(a);
        if (C2785b.m11769j()) {
            try {
                String str = C2922b.f9433h;
                C2925e.m12371a(str, "logType: " + bVar.mo11809b() + ", subType: " + bVar.mo11810c() + "data: " + a, " ,sample: " + a2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (a2 || bVar.mo11811d()) {
            mo11786a(bVar.mo11809b(), bVar.mo11810c(), a, a2, false);
            AbstractC2742b bVar2 = this.f8802b;
            if (bVar2 != null) {
                bVar2.mo11796a(bVar.mo11809b(), bVar.mo11810c(), a);
            }
        }
    }
}
