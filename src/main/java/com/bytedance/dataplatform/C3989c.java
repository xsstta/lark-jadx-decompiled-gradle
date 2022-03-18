package com.bytedance.dataplatform;

import android.app.Application;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: com.bytedance.dataplatform.c */
public final class C3989c {

    /* renamed from: a */
    private static AbstractC3990a f12140a;

    /* renamed from: com.bytedance.dataplatform.c$a */
    public interface AbstractC3990a {
        /* renamed from: a */
        <T> T mo15689a(String str, Type type);

        /* renamed from: a */
        void mo15690a(Application application, AbstractC3995h hVar, AbstractC3994g gVar, C3982a aVar);

        /* renamed from: a */
        void mo15691a(String str, Set<ExperimentEntity> set);

        /* renamed from: a */
        void mo15692a(boolean z);
    }

    /* renamed from: a */
    public static void m16624a(boolean z) {
        AbstractC3990a aVar = f12140a;
        if (aVar != null) {
            aVar.mo15692a(z);
        }
    }

    /* renamed from: a */
    static <T> T m16621a(String str, Type type) {
        AbstractC3990a aVar = f12140a;
        if (aVar == null) {
            return null;
        }
        return (T) aVar.mo15689a(str, type);
    }

    /* renamed from: a */
    public static void m16623a(String str, Set<ExperimentEntity> set) {
        AbstractC3990a aVar = f12140a;
        if (aVar != null) {
            aVar.mo15691a(str, set);
        }
    }

    /* renamed from: a */
    static void m16622a(Application application, AbstractC3995h hVar, AbstractC3994g gVar, C3982a aVar) {
        AbstractC3990a aVar2 = f12140a;
        if (aVar2 != null) {
            aVar2.mo15690a(application, hVar, gVar, aVar);
        }
    }
}
