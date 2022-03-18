package com.tt.miniapp.process.p3321f;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import com.tt.miniapphost.process.p3379e.C67577a;

/* renamed from: com.tt.miniapp.process.f.a */
public class C66627a {
    /* renamed from: a */
    public static CrossProcessDataEntity m260276a(CrossProcessCallEntity crossProcessCallEntity) {
        String c = crossProcessCallEntity.mo234727c();
        CrossProcessDataEntity d = crossProcessCallEntity.mo234728d();
        CrossProcessDataEntity e = crossProcessCallEntity.mo234730e();
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52829e("CrossProcessCallHandler", "handleHostProcessReceivedSyncCall error callType. crossProcessCallEntity:", crossProcessCallEntity);
            return null;
        }
        CrossProcessDataEntity[] crossProcessDataEntityArr = new CrossProcessDataEntity[1];
        if (C66628b.m260288a(c, d, e, crossProcessDataEntityArr)) {
            return crossProcessDataEntityArr[0];
        }
        AbstractC67571b syncHandler = AppbrandContext.getInst().getSyncHandler(c);
        if (syncHandler != null) {
            return syncHandler.mo49138a(d);
        }
        AppBrandLogger.m52829e("CrossProcessCallHandler", "no handler for callType: " + c);
        return null;
    }

    /* renamed from: a */
    public static void m260277a(CrossProcessCallEntity crossProcessCallEntity, C67577a aVar) {
        AbstractC67570a asyncHandler;
        String c = crossProcessCallEntity.mo234727c();
        CrossProcessDataEntity d = crossProcessCallEntity.mo234728d();
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52829e("CrossProcessCallHandler", "handleHostProcessReceivedAsyncCall error callType. crossProcessCallEntity:", crossProcessCallEntity);
        } else if (!C66628b.m260287a(c, d, crossProcessCallEntity.mo234730e(), aVar) && (asyncHandler = AppbrandContext.getInst().getAsyncHandler(c)) != null) {
            asyncHandler.mo49146a(d, aVar);
        }
    }

    /* renamed from: b */
    public static void m260278b(CrossProcessCallEntity crossProcessCallEntity, C67577a aVar) {
        String c = crossProcessCallEntity.mo234727c();
        CrossProcessDataEntity d = crossProcessCallEntity.mo234728d();
        CrossProcessDataEntity e = crossProcessCallEntity.mo234730e();
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52829e("CrossProcessCallHandler", "handleMiniAppReceivedAsyncCall error callType. crossProcessCallEntity:", crossProcessCallEntity);
            return;
        }
        C66639c.m260328a(c, d, e, aVar);
    }
}
