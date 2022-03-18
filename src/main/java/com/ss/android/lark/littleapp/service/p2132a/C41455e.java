package com.ss.android.lark.littleapp.service.p2132a;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.littleapp.C41324e;
import com.ss.android.lark.littleapp.C41390l;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.service.ILittleAppService;

/* renamed from: com.ss.android.lark.littleapp.service.a.e */
public class C41455e {
    /* renamed from: a */
    public static void m164492a(Context context, String str, String str2, int i) {
        C41324e.m163812a(context, str, i, str2);
    }

    /* renamed from: a */
    public static IAppContext m164491a(Application application, ILittleAppService.AbstractC41416a aVar, ILittleAppService iLittleAppService, AbstractC41301a aVar2) {
        return C41390l.m164161a(application, new C41426c(application, aVar, iLittleAppService, aVar2), new C41420a(application, aVar2));
    }
}
