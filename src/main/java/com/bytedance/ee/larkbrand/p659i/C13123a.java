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

/* renamed from: com.bytedance.ee.larkbrand.i.a */
public class C13123a extends AbstractC67628l {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertCoverImage";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int a = C67302a.m262173a();
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.p659i.C13123a.RunnableC131241 */

                public void run() {
                    AppBrandLogger.m52830i("WebBaseEventHandler", "real add coverImage:" + a);
                    C13123a.this.mIBaseRender.addNativeView(a, "coverImage", C13123a.this.mArgs, null);
                    AppBrandLogger.m52830i("WebBaseEventHandler", "real add coverImage complete" + a);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coverImageId", a);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getApiName(), "ok"));
            AppBrandLogger.m52830i("WebBaseEventHandler", "return callback:" + a);
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "WebBaseEventHandler", e.getStackTrace());
            return CharacterUtils.empty();
        }
    }

    public C13123a(IBaseRender iBaseRender, String str, int i) {
        super(iBaseRender, str, i);
    }
}
