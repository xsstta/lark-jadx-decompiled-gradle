package com.bytedance.ee.ref.impl.host.p697a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67728b;

/* renamed from: com.bytedance.ee.ref.impl.host.a.a */
public class C13581a {
    /* renamed from: a */
    public static CrossProcessDataEntity m55110a(CrossProcessCallEntity crossProcessCallEntity) {
        String c = crossProcessCallEntity.mo234727c();
        CrossProcessDataEntity d = crossProcessCallEntity.mo234728d();
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52829e("CrossProcessHelper", "handleHostProcessReceivedSyncCall error callType. crossProcessCallEntity:", crossProcessCallEntity);
            return null;
        }
        AbstractC67571b syncHandler = AppbrandContext.getInst().getSyncHandler(c);
        if (syncHandler != null) {
            return syncHandler.mo49138a(d);
        }
        AppBrandLogger.m52829e("CrossProcessHelper", "no handler for callType: " + c);
        return null;
    }

    /* renamed from: a */
    public static void m55111a(CrossProcessCallEntity crossProcessCallEntity, AbstractC67727a aVar) {
        String c = crossProcessCallEntity.mo234727c();
        CrossProcessDataEntity d = crossProcessCallEntity.mo234728d();
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52829e("CrossProcessHelper", "handleHostProcessReceivedAsyncCall error callType. crossProcessCallEntity:", crossProcessCallEntity);
            return;
        }
        AbstractC67728b asyncHandlerV2 = AppbrandContext.getInst().getAsyncHandlerV2(c);
        if (asyncHandlerV2 != null) {
            asyncHandlerV2.mo49148a(d, aVar);
            return;
        }
        AppBrandLogger.m52829e("CrossProcessHelper", "no handler for callType: " + c);
    }
}
