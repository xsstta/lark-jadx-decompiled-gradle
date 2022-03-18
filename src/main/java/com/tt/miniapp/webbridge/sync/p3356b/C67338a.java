package com.tt.miniapp.webbridge.sync.p3356b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.C67268f;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.refer.common.annotation.ApiHandler;
import com.tt.refer.common.util.C67866g;
import org.json.JSONObject;

@ApiHandler(eventName = "videoRequestFullScreen")
/* renamed from: com.tt.miniapp.webbridge.sync.b.a */
public class C67338a extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "videoRequestFullScreen";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("code");
            if (TextUtils.isEmpty(optString)) {
                callbackFail(ApiCallResultHelper.generateIllegalParamExtraInfo("code"));
            } else if (this.mRender instanceof AppbrandFragment) {
                Object realRenderView = this.mRender.getRealRenderView();
                String str = "";
                if (jSONObject.has(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                    i = jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
                    str = jSONObject.optString("id");
                } else {
                    i = 90;
                }
                if (realRenderView instanceof WebView) {
                    m262227a((WebView) realRenderView, optString, i, str);
                } else {
                    callbackFail("render view is not webview " + realRenderView);
                }
            } else {
                callbackFail("render is not AppbrandFragment");
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebEventHandler", e);
            callbackFail(e);
        }
        return CharacterUtils.empty();
    }

    public C67338a(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    private void m262227a(final WebView webView, final String str, final int i, final String str2) {
        if (webView != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.p3356b.C67338a.RunnableC673391 */

                public void run() {
                    WebView webView = webView;
                    if (webView instanceof C67268f) {
                        C67268f fVar = (C67268f) webView;
                        VideoFullScreenHelper videoFullScreenHelper = fVar.getVideoFullScreenHelper();
                        if (videoFullScreenHelper == null) {
                            videoFullScreenHelper = new VideoFullScreenHelper(C67338a.this.iAppContext);
                            fVar.setVideoFullScreenHelper(videoFullScreenHelper);
                        }
                        videoFullScreenHelper.mo233133a(str2);
                        videoFullScreenHelper.mo233132a(videoFullScreenHelper.mo233126a(i));
                    }
                    WebView webView2 = webView;
                    webView2.loadUrl("javascript:" + str);
                    C67338a.this.callbackOk();
                }
            });
        } else {
            callbackFail("WebView is null");
        }
    }
}
