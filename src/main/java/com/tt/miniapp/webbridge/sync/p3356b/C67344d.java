package com.tt.miniapp.webbridge.sync.p3356b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@ApiHandler(eventName = "removeVideoPlayer")
/* renamed from: com.tt.miniapp.webbridge.sync.b.d */
public class C67344d extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "removeVideoPlayer";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            if (this.mRender == null) {
                AppBrandLogger.m52829e("RemoveVideoPlayerHandler", "removeVideoPlayer, render is null");
                return makeFailMsg("render is null");
            }
            final Throwable[] thArr = new Throwable[1];
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.p3356b.C67344d.RunnableC673451 */

                public void run() {
                    try {
                        AppBrandLogger.m52828d("RemoveVideoPlayerHandler", new Object[0]);
                        C67344d.this.mRender.removeNativeView(new JSONObject(C67344d.this.mArgs).optInt("videoPlayerId"), null);
                    } catch (Exception e) {
                        AppBrandLogger.eWithThrowable("RemoveVideoPlayerHandler", "removeVideoPlayer error: " + e.getMessage(), e);
                        thArr[0] = e;
                    }
                    countDownLatch.countDown();
                }
            });
            AppBrandLogger.m52830i("RemoveVideoPlayerHandler", "removeVideoPlayer, wait...");
            countDownLatch.await();
            if (thArr[0] == null) {
                AppBrandLogger.m52830i("RemoveVideoPlayerHandler", "removeVideoPlayer ok");
                return makeOkMsg();
            }
            AppBrandLogger.m52830i("RemoveVideoPlayerHandler", "removeVideoPlayer error");
            return makeFailMsg(thArr[0]);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("RemoveVideoPlayerHandler", "removeVideoPlayer2 error: " + e.getMessage(), e);
            return makeFailMsg(e);
        }
    }

    public C67344d(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
