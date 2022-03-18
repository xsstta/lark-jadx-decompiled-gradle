package com.bytedance.ee.lark.infra.storage.p637a.p638a;

import android.content.Context;
import android.os.Build;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40644k;

/* renamed from: com.bytedance.ee.lark.infra.storage.a.a.b */
public final class C12891b {

    /* renamed from: a */
    static final C12892a f34387a;

    /* renamed from: com.bytedance.ee.lark.infra.storage.a.a.b$a */
    static class C12892a {
        /* renamed from: a */
        public String mo48648a(Context context) {
            return "DCIM/Camera/";
        }

        C12892a() {
        }
    }

    /* renamed from: com.bytedance.ee.lark.infra.storage.a.a.b$b */
    static class C12893b extends C12892a {
        C12893b() {
        }

        @Override // com.bytedance.ee.lark.infra.storage.p637a.p638a.C12891b.C12892a
        /* renamed from: a */
        public String mo48648a(Context context) {
            if (C12894c.m53190a()) {
                return super.mo48648a(context);
            }
            return "相机/";
        }
    }

    static {
        if ("VIVO".equals(Build.BRAND.toUpperCase())) {
            f34387a = new C12893b();
        } else {
            f34387a = new C12892a();
        }
    }

    /* renamed from: a */
    public static String m53186a(Context context) {
        new OPMonitor(C40644k.f103102a).timing().timing().addCategoryValue("brand", Build.BRAND).addCategoryValue("rom_version", Float.valueOf(C12894c.m53191b())).timing().setResultTypeSuccess().flush();
        return f34387a.mo48648a(context);
    }
}
