package com.ss.android.lark.littleapp.plugin;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13317i;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class OfflineFacePreparePlugin extends OfflineFaceBasePlugin {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    /* renamed from: com.ss.android.lark.littleapp.plugin.OfflineFacePreparePlugin$a */
    private static class C41401a<T> {

        /* renamed from: a */
        private T f105265a;

        /* renamed from: a */
        public T mo149081a() {
            return this.f105265a;
        }

        /* renamed from: a */
        public void mo149082a(T t) {
            this.f105265a = t;
        }
    }

    private static class PrepareVerifyRequest extends OfflineFaceBasePlugin.FaceCheckRequest {
        @JSONField(name = "timeout")
        public long mTimeOut = -1;

        private PrepareVerifyRequest() {
        }
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportSuccess(AbstractC25905b bVar) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.ba);
        bVar.mo92212a(request);
    }

    @LKPluginFunction(async = true, eventName = {"prepareLocalFaceVerify"})
    public void faceOfflinePrepareVerify(final PrepareVerifyRequest prepareVerifyRequest, final AbstractC25905b bVar, final AbstractC25897h<OfflineFaceBasePlugin.FaceCheckResponse> hVar) {
        AppBrandLogger.m52830i("OfflineFaceCheckPlugin", "handle api prepare verify");
        if (prepareVerifyRequest.mTimeOut == -1) {
            prepareVerifyRequest.mTimeOut = 30;
        } else if (prepareVerifyRequest.mTimeOut > 60) {
            prepareVerifyRequest.mTimeOut = 60;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C41401a aVar = new C41401a();
        LarkExtensionManager.getInstance().getExtension().mo49589a(prepareVerifyRequest.mAppIdentify, new AbstractC13317i.AbstractC13318a() {
            /* class com.ss.android.lark.littleapp.plugin.OfflineFacePreparePlugin.C413991 */

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13317i.AbstractC13318a
            public void onResult(JSONObject jSONObject) {
                Log.m165389i("OfflineFaceCheckPlugin", "OfflineFaceVerifyPrepare");
                aVar.mo149082a(jSONObject);
                countDownLatch.countDown();
            }
        });
        Observable.create(new Action() {
            /* class com.ss.android.lark.littleapp.plugin.OfflineFacePreparePlugin.C414002 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    countDownLatch.await(prepareVerifyRequest.mTimeOut, TimeUnit.SECONDS);
                    JSONObject jSONObject = (JSONObject) aVar.mo149081a();
                    if (jSONObject == null) {
                        AppBrandLogger.m52829e("OfflineFaceCheckPlugin", "OfflineFaceVerifyPrepare timeout , timeout =  " + prepareVerifyRequest.mTimeOut);
                        OfflineFaceBasePlugin.FaceCheckResponse faceCheckResponse = new OfflineFaceBasePlugin.FaceCheckResponse();
                        faceCheckResponse.mErrorMessage = "offline_prepare_timeout";
                        faceCheckResponse.mErrorCode = C25913h.am.f64115H;
                        faceCheckResponse.mInnerCode = C25913h.am.f64116I;
                        faceCheckResponse.mInnerMsg = C25913h.am.f64117J + "timeout:" + prepareVerifyRequest.mTimeOut;
                        hVar.callback(faceCheckResponse);
                        return;
                    }
                    OfflineFacePreparePlugin.this.commResultCallback(jSONObject, hVar, bVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin
    public void reportOtherFailed(AbstractC25905b bVar, int i, String str, JSONObject jSONObject) {
        OPMonitorReportModel.Request request = new OPMonitorReportModel.Request();
        request.mMonitorCode = new OPMonitorReportModel.Request.OPInnerMonitorCode().adapter(C67501b.bb);
        request.mErrorCode = String.valueOf(i);
        request.mErrorMessage = str;
        bVar.mo92212a(request);
    }
}
