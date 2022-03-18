package com.tt.miniapp.webbridge.sync.p3356b;

import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.video.TTVideoView;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "operateVideoContext")
/* renamed from: com.tt.miniapp.webbridge.sync.b.c */
public class C67342c extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "operateVideoContext";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final JSONObject jSONObject = new JSONObject(this.mArgs);
            int optInt = jSONObject.optInt("videoPlayerId");
            final String optString = jSONObject.optString(ShareHitPoint.f121869d);
            AppBrandLogger.m52830i("WebEventHandler", "operateVideoContext, videoPlayerId: ", Integer.valueOf(optInt), ", operationType: ", optString);
            if (this.mRender == null) {
                AppBrandLogger.m52829e("WebEventHandler", "operateVideoContext, render is null");
                callbackFail("render is null");
                return CharacterUtils.empty();
            }
            final TTVideoView tTVideoView = null;
            View nativeView = this.mRender.getNativeView(optInt);
            if (nativeView instanceof TTVideoView) {
                tTVideoView = (TTVideoView) nativeView;
            }
            if (tTVideoView == null) {
                String str = "VideoView not found: " + optInt;
                AppBrandLogger.m52829e("WebEventHandler", str);
                callbackFail(str);
                return CharacterUtils.empty();
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.p3356b.C67342c.RunnableC673431 */

                public void run() {
                    if ("play".equals(optString)) {
                        tTVideoView.mo233190b();
                    } else if ("pause".equals(optString)) {
                        tTVideoView.mo233193c();
                    } else if ("stop".equals(optString)) {
                        tTVideoView.mo233195d();
                    } else if ("requestFullScreen".equals(optString)) {
                        tTVideoView.mo233196e();
                    } else if ("exitFullScreen".equals(optString)) {
                        tTVideoView.mo233197f();
                    } else if ("seek".equals(optString)) {
                        double optDouble = jSONObject.optDouble(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, -1000.0d);
                        if (optDouble <= -999.0d) {
                            AppBrandLogger.m52829e("WebEventHandler", "operateVideoContext, invalid seekTime: ", Double.valueOf(optDouble));
                            C67342c.this.callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
                            return;
                        }
                        tTVideoView.mo233191b((int) (optDouble * 1000.0d));
                    } else {
                        AppBrandLogger.m52829e("WebEventHandler", "operateVideoContext, unknown operation type: ", optString);
                        C67342c.this.callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo(ShareHitPoint.f121869d));
                        return;
                    }
                    C67342c.this.callbackOk();
                }
            });
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebEventHandler", e);
            callbackFail(e);
        }
    }

    public C67342c(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
