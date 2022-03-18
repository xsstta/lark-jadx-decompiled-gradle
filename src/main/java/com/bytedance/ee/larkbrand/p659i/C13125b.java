package com.bytedance.ee.larkbrand.p659i;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67628l;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.i.b */
public class C13125b extends AbstractC67628l {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertMap";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int a = C67302a.m262173a();
        AppBrandLogger.m52830i("InsertMapViewHandler", "insertMapViewHandler start, viewId:" + a + "args:" + this.mArgs);
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.p659i.C13125b.RunnableC131261 */

                public void run() {
                    C13125b.this.mIBaseRender.addNativeView(a, "map", C13125b.this.mArgs, null);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mapId", a);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getApiName(), "ok"));
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "InsertMapViewHandler", e.getStackTrace());
            return CharacterUtils.empty();
        }
    }

    public C13125b(IBaseRender iBaseRender, String str, int i) {
        super(iBaseRender, str, i);
    }
}
