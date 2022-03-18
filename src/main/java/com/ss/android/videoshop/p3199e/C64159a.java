package com.ss.android.videoshop.p3199e;

import com.bytedance.common.utility.Logger;
import com.ss.android.videoshop.api.C64107n;
import com.ss.android.videoshop.p3195b.C64116b;

/* renamed from: com.ss.android.videoshop.e.a */
public class C64159a {

    /* renamed from: a */
    private static AbstractC64160a f162062a;

    /* renamed from: com.ss.android.videoshop.e.a$a */
    public interface AbstractC64160a {
        /* renamed from: a */
        void mo163950a(int i, String str, StackTraceElement[] stackTraceElementArr);

        /* renamed from: a */
        void mo163951a(C64116b bVar, String str);

        /* renamed from: a */
        void mo163952a(String str, String str2);

        /* renamed from: a */
        void mo163953a(String str, boolean z);

        /* renamed from: b */
        void mo163954b(String str, String str2);

        /* renamed from: c */
        void mo163955c(String str, String str2);
    }

    /* renamed from: a */
    public static void m252079a(String str) {
        m252081a(str, true);
    }

    /* renamed from: a */
    public static void m252078a(AbstractC64160a aVar) {
        if (f162062a == null) {
            f162062a = aVar;
        } else if (C64107n.m251618b()) {
            throw new RuntimeException("LoggerImpl has been set");
        }
    }

    /* renamed from: a */
    public static void m252077a(C64116b bVar, String str) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163951a(bVar, str);
        }
    }

    /* renamed from: a */
    public static void m252080a(String str, String str2) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163952a("vs_" + str, str2);
            return;
        }
        Logger.m15178v("VideoShop", str + ":" + str2);
    }

    /* renamed from: b */
    public static void m252083b(String str, String str2) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163954b("vs_" + str, str2);
            return;
        }
        Logger.m15167d("VideoShop", str + ":" + str2);
    }

    /* renamed from: c */
    public static void m252084c(String str, String str2) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163955c("vs_" + str, str2);
            return;
        }
        Logger.m15170e("VideoShop", str + ":" + str2);
    }

    /* renamed from: a */
    public static void m252081a(String str, boolean z) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163953a(str, z);
        }
    }

    /* renamed from: a */
    public static void m252082a(String str, StackTraceElement[] stackTraceElementArr) {
        AbstractC64160a aVar = f162062a;
        if (aVar != null) {
            aVar.mo163950a(3, str, stackTraceElementArr);
        }
    }
}
