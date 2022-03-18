package com.bytedance.ee.larkbrand.p659i;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67628l;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.i.d */
public class C13129d extends AbstractC67628l {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "removeCoverImage";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final int optInt = new JSONObject(this.mArgs).optInt("coverImageId");
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.p659i.C13129d.RunnableC131301 */

                public void run() {
                    C13129d.this.mIBaseRender.removeNativeView(optInt, null);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            new JSONObject().put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(getApiName(), "ok"));
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "RemoveCoverImageViewHandler", e.getStackTrace());
            return CharacterUtils.empty();
        }
    }

    public C13129d(IBaseRender iBaseRender, String str, int i) {
        super(iBaseRender, str, i);
    }
}
