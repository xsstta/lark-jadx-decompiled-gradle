package com.tt.miniapp.webbridge.sync.p3356b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@ApiHandler(eventName = "updateVideoPlayer")
/* renamed from: com.tt.miniapp.webbridge.sync.b.e */
public class C67346e extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateVideoPlayer";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            if (this.mRender == null) {
                AppBrandLogger.m52829e("UpdateVideoPlayerHandler", "updateVideoPlayer, render is null");
                return makeFailMsg("render is null");
            }
            final Throwable[] thArr = new Throwable[1];
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.p3356b.C67346e.RunnableC673471 */

                public void run() {
                    try {
                        C67346e.this.mRender.updateNativeView(new JSONObject(C67346e.this.mArgs).optInt("videoPlayerId"), C67346e.this.mArgs, null);
                    } catch (Exception e) {
                        AppBrandLogger.eWithThrowable("UpdateVideoPlayerHandler", "updateVideoPlayer error: " + e.getMessage(), e);
                        thArr[0] = e;
                    }
                    countDownLatch.countDown();
                }
            });
            AppBrandLogger.m52830i("UpdateVideoPlayerHandler", "updateVideoPlayer, waiting update view");
            countDownLatch.await();
            if (thArr[0] == null) {
                AppBrandLogger.m52830i("UpdateVideoPlayerHandler", "updateVideoPlayer, update view ok");
                return makeOkMsg();
            }
            AppBrandLogger.m52830i("UpdateVideoPlayerHandler", "updateVideoPlayer, update view error");
            return makeFailMsg(thArr[0]);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("UpdateVideoPlayerHandler", "updateVideoPlayer2 error: " + e.getMessage(), e);
            return makeFailMsg(e);
        }
    }

    public C67346e(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
