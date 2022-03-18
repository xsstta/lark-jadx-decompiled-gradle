package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapp.manager.p3302a.C66389b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;

/* renamed from: com.tt.miniapp.manager.a.b.c */
public class C66392c extends AbstractC66390a {
    /* renamed from: a */
    private String m259591a() {
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            return initParams.mo234512l();
        }
        return "-1";
    }

    /* renamed from: a */
    private boolean m259592a(Context context) {
        String d = C66377a.m259537d(context);
        String a = m259591a();
        AppBrandLogger.m52830i("CheckBuildInBaseBundleHandler", "isNeedUpdate, lastVersionName: ", d, ", currentVersionName: ", a);
        if (TextUtils.equals(a, d)) {
            return false;
        }
        C66377a.m259535b(context, a);
        return true;
    }

    @Override // com.tt.miniapp.manager.p3302a.p3304b.AbstractC66390a
    /* renamed from: a */
    public C66391b mo231908a(Context context, C66391b bVar) {
        C66016a.C66018a aVar = bVar.f167613a;
        long j = bVar.f167614b;
        if (m259592a(context) || C66389b.m259581c() <= 0) {
            j = C66389b.m259573a(context, "__dev__.zip", "buildin_bundle", true, aVar);
            AppBrandLogger.m52830i("CheckBuildInBaseBundleHandler", "update build-in jssdk, version: ", Long.valueOf(j));
        } else {
            AppBrandLogger.m52830i("CheckBuildInBaseBundleHandler", "JSSDK no need to update");
        }
        bVar.f167614b = j;
        return bVar;
    }
}
