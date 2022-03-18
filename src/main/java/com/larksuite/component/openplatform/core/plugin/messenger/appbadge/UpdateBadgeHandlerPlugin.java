package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25909d;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import org.json.JSONException;
import org.json.JSONObject;

public class UpdateBadgeHandlerPlugin extends OPPlugin {
    private IAppContext mAppContext;
    public ILogger mILogger;
    public IMonitorCreator monitorCreator;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    private static class UpdateBadgeHandlerRequest extends C25920a {
        @JSONField(name = "badgeNum")
        @LKRequiredParam
        public int badgeNum;

        private UpdateBadgeHandlerRequest() {
        }
    }

    private static class UpdateBadgeHandlerResponse extends C25921b {
        private UpdateBadgeHandlerResponse() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin$2 */
    public static /* synthetic */ class C251022 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61349a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode[] r0 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin.C251022.f61349a = r0
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r1 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.UNKNOWN_BADGE_CODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin.C251022.f61349a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r1 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.CODE_INVALID_PARAMS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin.C251022.f61349a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r1 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.CODE_NONEXISTENT_NODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin.C251022.<clinit>():void");
        }
    }

    public UpdateBadgeHandlerResponse convertResponse(int i, UpdateBadgeHandlerResponse updateBadgeHandlerResponse) {
        BadgeNodeActionCode fromValue = BadgeNodeActionCode.fromValue(i);
        if (fromValue == null) {
            return updateBadgeHandlerResponse;
        }
        int i2 = C251022.f61349a[fromValue.ordinal()];
        if (i2 == 1) {
            fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64080j, "unknown badge code");
        } else if (i2 == 2) {
            fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64072b, C25906a.f64072b.f64117J);
        } else if (i2 == 3) {
            fillFailedResponse(updateBadgeHandlerResponse, C25909d.f64118a, C25909d.f64118a.f64117J);
        }
        return updateBadgeHandlerResponse;
    }

    private void updateLocalBage(String str, Integer num, CommonEnum.OpenAppFeatureType openAppFeatureType, final AbstractC25897h<UpdateBadgeHandlerResponse> hVar) {
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("badge_num", (Object) num).mo234760a("feature_type", (Object) Integer.valueOf(openAppFeatureType.getValue())).mo234763b();
        final String a = C25105b.m90439a(str, null, num, openAppFeatureType);
        ((AbstractC67724a) this.mAppContext.findServiceByInterface(AbstractC67724a.class)).mo50446a("update_badge", b, new AbstractC67727a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.appbadge.UpdateBadgeHandlerPlugin.C251011 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                UpdateBadgeHandlerPlugin.this.mILogger.mo92224i("UpdateBadgeHandlerPlugin", "onIpcCallback updateLocalBage");
                UpdateBadgeHandlerResponse updateBadgeHandlerResponse = new UpdateBadgeHandlerResponse();
                if (crossProcessDataEntity != null) {
                    String b = crossProcessDataEntity.mo234744b("update_badge_response");
                    if (b != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(b);
                            int i = jSONObject.getInt("code");
                            String string = jSONObject.getString("event");
                            int i2 = jSONObject.getInt("scene");
                            boolean z = jSONObject.getBoolean("fromPull");
                            ApiCode a = C25105b.m90436a(i);
                            if (a == ApiCode.GENERAL_OK) {
                                LarkInnerEventHelper.mpBadgeLocalOperation(UpdateBadgeHandlerPlugin.this.monitorCreator, string, Integer.valueOf(i2), a, true, null, null);
                            } else {
                                LarkInnerEventHelper.mpBadgeLocalOperation(UpdateBadgeHandlerPlugin.this.monitorCreator, string, Integer.valueOf(i2), a, false, String.valueOf(a.code), a.msg);
                            }
                            if (!z) {
                                hVar.callback(UpdateBadgeHandlerPlugin.this.convertResponse(i, updateBadgeHandlerResponse));
                            }
                        } catch (JSONException e) {
                            ILogger aVar = UpdateBadgeHandlerPlugin.this.mILogger;
                            aVar.mo92224i("UpdateBadgeHandlerPlugin", "onIpcCallback updateLocalBage exception " + e.getMessage());
                            UpdateBadgeHandlerPlugin.this.fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64081k, e.getMessage());
                            hVar.callback(updateBadgeHandlerResponse);
                        }
                    }
                } else {
                    UpdateBadgeHandlerPlugin.this.fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64080j, C25906a.f64080j.f64117J);
                    hVar.callback(updateBadgeHandlerResponse);
                }
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"updateBadge"})
    public void UpdateBadgeHandlerAsync(LKEvent lKEvent, UpdateBadgeHandlerRequest updateBadgeHandlerRequest, AbstractC25895f fVar, AbstractC25897h<UpdateBadgeHandlerResponse> hVar) {
        this.mILogger = fVar.mo92190b();
        this.mAppContext = getEventContext(lKEvent);
        UpdateBadgeHandlerResponse updateBadgeHandlerResponse = new UpdateBadgeHandlerResponse();
        if (this.mAppContext == null) {
            this.mILogger.mo92223e("UpdateBadgeHandlerPlugin", "app context is null");
            fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64080j, "app context is null");
            hVar.callback(updateBadgeHandlerResponse);
        } else if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
            fillFailedResponse(updateBadgeHandlerResponse, C25906a.f64078h, C25906a.f64078h.f64117J);
            hVar.callback(updateBadgeHandlerResponse);
        } else {
            String appId = this.mAppContext.getAppId();
            ILogger aVar = this.mILogger;
            aVar.mo92224i("UpdateBadgeHandlerPlugin", "AppContextKey:" + appId);
            CommonEnum.OpenAppFeatureType a = C25105b.m90435a(this.mAppContext.getAppType());
            if (a == null) {
                this.mILogger.mo92224i("UpdateBadgeHandlerPlugin", "invalid appType, can not update local bage");
                fillFailedResponse(updateBadgeHandlerResponse, C25909d.f64118a, "invalid appType");
                hVar.callback(updateBadgeHandlerResponse);
                return;
            }
            Integer valueOf = Integer.valueOf(updateBadgeHandlerRequest.badgeNum);
            C25103a.m90430a(appId, AppbrandApplicationImpl.getInst(this.mAppContext).getAppInfo().appName, this.mAppContext.getAppType(), valueOf.intValue());
            if (a == CommonEnum.OpenAppFeatureType.MiniApp) {
                this.monitorCreator = new GadgetMonitorCreator(this.mAppContext);
            } else {
                this.monitorCreator = new C13757d(this.mAppContext);
            }
            updateLocalBage(appId, valueOf, a, hVar);
        }
    }
}
