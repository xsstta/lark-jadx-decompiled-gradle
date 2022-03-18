package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;

public class LarkApiOpenLocationCtrlPlugin extends OPPlugin {
    private static long lastClickTime;

    private static class OpenLocationCtrlResponse extends C25921b {
        private OpenLocationCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    /* access modifiers changed from: private */
    public static class OpenLocationCtrlRequest extends C25920a {
        @JSONField(name = "address")
        public String address;
        @JSONField(name = "latitude")
        @LKRequiredParam
        public double latitude = 400.0d;
        @JSONField(name = "longitude")
        @LKRequiredParam
        public double longitude = 400.0d;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "scale")
        public int scale = 18;
        @JSONField(name = ShareHitPoint.f121869d)
        public String type;

        private OpenLocationCtrlRequest() {
        }
    }

    public boolean isDoubleClick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastClickTime < 200) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    @LKPluginFunction(async = true, eventName = {"openLocation"})
    public void LarkApiOpenLocationCtrlAsync(LKEvent lKEvent, OpenLocationCtrlRequest openLocationCtrlRequest, AbstractC25895f fVar, AbstractC25897h<OpenLocationCtrlResponse> hVar) {
        OpenLocationCtrlResponse openLocationCtrlResponse = new OpenLocationCtrlResponse();
        if (isDoubleClick()) {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64072b, "invoke openLocation too fast");
            hVar.callback(openLocationCtrlResponse);
            return;
        }
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64080j, "activity is null");
            hVar.callback(openLocationCtrlResponse);
            fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "activity is null");
            return;
        }
        ILogger b = fVar.mo92190b();
        b.mo92224i("tma_ApiOpenLocationCtrl", "open location params:" + openLocationCtrlRequest.toString());
        if (openLocationCtrlRequest.latitude < -90.0d || openLocationCtrlRequest.latitude > 90.0d) {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64072b, "invalid latitude");
            hVar.callback(openLocationCtrlResponse);
            fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "invalid latitude");
        } else if (openLocationCtrlRequest.longitude < -180.0d || openLocationCtrlRequest.longitude > 180.0d) {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64072b, "invalid longitude");
            hVar.callback(openLocationCtrlResponse);
            fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "invalid longitude");
        } else if (openLocationCtrlRequest.scale < 5 || openLocationCtrlRequest.scale > 18) {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64072b, "invalid scale");
            hVar.callback(openLocationCtrlResponse);
            fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "invalid scale");
        } else if (TextUtils.isEmpty(openLocationCtrlRequest.type) || "gcj02".equals(openLocationCtrlRequest.type) || "wgs84".equals(openLocationCtrlRequest.type)) {
            EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
            if (a != null && a.mo148730a() && openLocationCtrlRequest.name.isEmpty() && openLocationCtrlRequest.address.isEmpty()) {
                openLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_PARAM.code;
                openLocationCtrlResponse.mErrorMessage = "name and address cannot both be empty";
                hVar.callback(openLocationCtrlResponse);
                fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "name and address cannot both be empty");
            } else if (HostDependManager.getInst().createMapInstance() == null) {
                openLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                openLocationCtrlResponse.mErrorMessage = "feature is not supported in app";
                hVar.callback(openLocationCtrlResponse);
                fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "feature is not supported in app");
            } else {
                if (getAppContext() != null && ((AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50474o() && "gcj02".equals(openLocationCtrlRequest.type)) {
                    fillFailedResponse(openLocationCtrlResponse, C25906a.f64080j, "invalid lark type");
                    hVar.callback(openLocationCtrlResponse);
                    ILogger b2 = fVar.mo92190b();
                    b2.mo92223e("tma_ApiOpenLocationCtrl", "invalid lark type:" + openLocationCtrlRequest.type);
                }
                openLocation(currentActivity, fVar, hVar, lKEvent, openLocationCtrlRequest);
            }
        } else {
            fillFailedResponse(openLocationCtrlResponse, C25906a.f64072b, "invalid type");
            hVar.callback(openLocationCtrlResponse);
            ILogger b3 = fVar.mo92190b();
            b3.mo92223e("tma_ApiOpenLocationCtrl", "invalid type " + openLocationCtrlRequest.type);
        }
    }

    private void openLocation(final Activity activity, final AbstractC25895f fVar, final AbstractC25897h<OpenLocationCtrlResponse> hVar, final LKEvent lKEvent, final OpenLocationCtrlRequest openLocationCtrlRequest) {
        ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235103a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.LarkApiOpenLocationCtrlPlugin.C251891 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                fVar.mo92190b().mo92224i("tma_ApiOpenLocationCtrl", "app permission onGranted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                LarkApiOpenLocationCtrlPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.LarkApiOpenLocationCtrlPlugin.C251891.C251901 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        OpenLocationCtrlResponse openLocationCtrlResponse = new OpenLocationCtrlResponse();
                        try {
                            fVar.mo92190b().mo92224i("tma_ApiOpenLocationCtrl", "system permission onGranted");
                            hVar.callback(openLocationCtrlResponse);
                            HostDependManager.getInst().openLocation(activity, openLocationCtrlRequest.name, openLocationCtrlRequest.address, openLocationCtrlRequest.latitude, openLocationCtrlRequest.longitude, openLocationCtrlRequest.scale, openLocationCtrlRequest.type, null);
                        } catch (Exception e) {
                            fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "", e);
                            openLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                            openLocationCtrlResponse.mErrorMessage = e.getMessage();
                            hVar.callback(openLocationCtrlResponse);
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "system permission onDenied ", str);
                        OpenLocationCtrlResponse openLocationCtrlResponse = new OpenLocationCtrlResponse();
                        openLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_SYSTEM_AUTH_DENY.code;
                        openLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_SYSTEM_AUTH_DENY.msg;
                        hVar.callback(openLocationCtrlResponse);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                fVar.mo92190b().mo92223e("tma_ApiOpenLocationCtrl", "app permission onDenied ", str);
                OpenLocationCtrlResponse openLocationCtrlResponse = new OpenLocationCtrlResponse();
                openLocationCtrlResponse.mErrorCode = ApiCode.GENERAL_USER_AUTH_DENIED.code;
                openLocationCtrlResponse.mErrorMessage = ApiCode.GENERAL_USER_AUTH_DENIED.msg;
                hVar.callback(openLocationCtrlResponse);
            }
        });
    }
}
