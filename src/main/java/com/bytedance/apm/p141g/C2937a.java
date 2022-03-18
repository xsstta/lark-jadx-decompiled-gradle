package com.bytedance.apm.p141g;

/* renamed from: com.bytedance.apm.g.a */
public class C2937a {

    /* renamed from: a */
    private static AbstractC2940c f9443a;

    /* renamed from: b */
    private static AbstractC2939b f9444b;

    /* renamed from: c */
    private static boolean f9445c;

    /* renamed from: com.bytedance.apm.g.a$a */
    public interface AbstractC2938a {
    }

    /* renamed from: com.bytedance.apm.g.a$b */
    public interface AbstractC2939b {
        /* renamed from: a */
        void mo12639a();
    }

    /* renamed from: com.bytedance.apm.g.a$c */
    public interface AbstractC2940c {
        /* renamed from: a */
        void mo12640a(AbstractC2938a aVar);
    }

    /* renamed from: a */
    public static void m12395a() {
        AbstractC2939b bVar;
        if (!f9445c && (bVar = f9444b) != null) {
            bVar.mo12639a();
            f9445c = true;
        }
    }

    /* renamed from: a */
    public static void m12396a(AbstractC2938a aVar) {
        AbstractC2940c cVar = f9443a;
        if (cVar != null) {
            cVar.mo12640a(aVar);
        }
    }
}
