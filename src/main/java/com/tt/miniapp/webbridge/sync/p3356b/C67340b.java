package com.tt.miniapp.webbridge.sync.p3356b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@ApiHandler(eventName = "insertVideoPlayer")
/* renamed from: com.tt.miniapp.webbridge.sync.b.b */
public class C67340b extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "insertVideoPlayer";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            if (this.mRender == null) {
                AppBrandLogger.m52829e("tma_InsertVideoPlayerHandle", "insertVideoPlayer, render is null");
                return makeFailMsg("render is null");
            }
            final Throwable[] thArr = new Throwable[1];
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final int a = C67302a.m262173a();
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.p3356b.C67340b.RunnableC673411 */

                public void run() {
                    try {
                        AppBrandLogger.m52830i("tma_InsertVideoPlayerHandle", "insertVideo webviewId ", Integer.valueOf(AppbrandApplicationImpl.getInst(C67340b.this.iAppContext).getRenderViewManager().getCurrentIRender().getRenderViewId()));
                        C67340b.this.mRender.addNativeView(a, "video", C67340b.this.mArgs, null);
                    } catch (Exception e) {
                        AppBrandLogger.eWithThrowable("tma_InsertVideoPlayerHandle", "insertVideoPlayer error: " + e.getMessage(), e);
                        thArr[0] = e;
                    }
                    countDownLatch.countDown();
                }
            });
            AppBrandLogger.m52830i("tma_InsertVideoPlayerHandle", "insertVideoPlayer, wait view init");
            countDownLatch.await();
            if (thArr[0] == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoPlayerId", a);
                AppBrandLogger.m52830i("tma_InsertVideoPlayerHandle", "insertVideoPlayer, ok");
                return makeOkMsg(jSONObject);
            }
            AppBrandLogger.m52830i("tma_InsertVideoPlayerHandle", "insertVideoPlayer, view init error");
            return makeFailMsg(thArr[0]);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_InsertVideoPlayerHandle", "insertVideoPlayer error: " + e.getMessage(), e);
            return makeFailMsg(e);
        }
    }

    public C67340b(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
