package com.ss.android.lark.littleapp;

import android.content.Context;
import com.bytedance.ee.larkbrand.C12941a;
import com.bytedance.ee.larkbrand.hostbridge.sync.C13118f;
import com.bytedance.ee.log.C13479a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.littleapp.e */
public class C41324e {
    /* renamed from: a */
    private static void m163811a(Context context, String str, int i) {
        C13118f.m53715a(context, "lark_navigate_to_app", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_url", (Object) str).mo234760a("scene", (Object) Integer.valueOf(i)).mo234763b());
    }

    /* renamed from: a */
    public static void m163812a(Context context, String str, int i, String str2) {
        C13479a.m54772d("LittleAppHostLauncher", "LittleAppHostLauncher openAppBrand = " + str + ", context = " + context);
        if (C12941a.m53327b(ProcessUtil.getCurProcessName(context))) {
            HashMap hashMap = new HashMap();
            hashMap.put("mp_extra_data", str2);
            C12941a.m53319a(context, str, i, hashMap);
            return;
        }
        m163811a(context, str, i);
    }
}
