package com.bytedance.ee.larkbrand.hostbridge.sync;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.hostbridge.sync.f */
public class C13118f {

    /* renamed from: a */
    private static Map<Integer, CrossProcessDataEntity> f34806a = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m53716a(final String str, final CrossProcessDataEntity crossProcessDataEntity) {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.hostbridge.sync.C13118f.C131191 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C67560a.m262955a(str, crossProcessDataEntity);
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    /* renamed from: b */
    public static CrossProcessDataEntity m53717b(String str, CrossProcessDataEntity crossProcessDataEntity) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return m53715a(applicationContext, str, crossProcessDataEntity);
        }
        return C67560a.m262955a(str, crossProcessDataEntity);
    }

    /* renamed from: a */
    public static CrossProcessDataEntity m53715a(Context context, String str, CrossProcessDataEntity crossProcessDataEntity) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("ma_callType", str);
            if (crossProcessDataEntity != null) {
                Bundle a = crossProcessDataEntity.mo234739a();
                for (String str2 : a.keySet()) {
                    jSONObject2.put(str2, a.get(str2));
                }
            }
            if (crossProcessDataEntity != null) {
                jSONObject.put("ma_callData", jSONObject2);
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("LarkSyncCrossProcessBridge", "hostAction", e);
        }
        Uri a2 = LarkCrossProcessHostDataProvider.m53674a(context, jSONObject.toString());
        if (a2 == null) {
            AppBrandLogger.m52829e("LarkSyncCrossProcessBridge", "callHostProcessSync generate uri failed");
            return null;
        }
        Cursor query = context.getContentResolver().query(a2, null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    CrossProcessDataEntity crossProcessDataEntity2 = new CrossProcessDataEntity(query.getExtras());
                    query.close();
                    return crossProcessDataEntity2;
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
            query.close();
        }
        return null;
    }
}
