package com.larksuite.component.openplatform.plugins.device;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class ScreenPlugin extends AbstractC25889a {

    public static class KeepScreenRequest extends C25920a {
        @JSONField(name = "keepScreenOn")
        public boolean keepScreenOn;
    }

    public static class ScreenResponse extends C25921b {
        @JSONField
        public float value;
    }

    public static class SetScreenRequest extends C25920a {
        @JSONField(name = "value")
        @LKRequiredParam
        public double value;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private ScreenResponse makeSuccessResponse(float f) {
        ScreenResponse screenResponse = new ScreenResponse();
        screenResponse.value = f;
        return screenResponse;
    }

    @LKPluginFunction(async = true, eventName = {"getScreenBrightness"})
    public void getScreenBrightness(AbstractC25897h<ScreenResponse> hVar, AbstractC25905b bVar) {
        ScreenResponse screenResponse = new ScreenResponse();
        try {
            Context a = bVar.mo92207a();
            if (a instanceof Activity) {
                float f = ((Activity) a).getWindow().getAttributes().screenBrightness;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    try {
                        f = (float) (((double) Settings.System.getInt(a.getContentResolver(), "screen_brightness")) / 255.0d);
                    } catch (Settings.SettingNotFoundException e) {
                        fillFailedResponse(screenResponse, C25906a.f64080j, C25611a.m91379a(e));
                        hVar.callback(screenResponse);
                        return;
                    }
                }
                hVar.callback(makeSuccessResponse(f));
                return;
            }
            fillFailedResponse(screenResponse, C25906a.f64080j, "context is null or context is not activity");
            hVar.callback(screenResponse);
        } catch (Exception e2) {
            fillFailedResponse(screenResponse, C25906a.f64080j, C25611a.m91379a(e2));
            hVar.callback(screenResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"setKeepScreenOn"})
    public void keepScreenOn(AbstractC25897h<ScreenResponse> hVar, AbstractC25905b bVar, KeepScreenRequest keepScreenRequest) {
        try {
            final Context a = bVar.mo92207a();
            final boolean z = keepScreenRequest.keepScreenOn;
            if (a instanceof Activity) {
                new Handler(a.getMainLooper()).post(new Runnable() {
                    /* class com.larksuite.component.openplatform.plugins.device.ScreenPlugin.RunnableC255801 */

                    public void run() {
                        if (z) {
                            ((Activity) a).getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
                        } else {
                            ((Activity) a).getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
                        }
                    }
                });
                hVar.callback(new ScreenResponse());
                return;
            }
            ScreenResponse screenResponse = new ScreenResponse();
            fillFailedResponse(screenResponse, C25906a.f64080j, "context is null or context is not activity");
            hVar.callback(screenResponse);
        } catch (Exception e) {
            ScreenResponse screenResponse2 = new ScreenResponse();
            fillFailedResponse(screenResponse2, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(screenResponse2);
        }
    }

    @LKPluginFunction(async = true, eventName = {"setScreenBrightness"})
    public void setScreenBrightness(AbstractC25897h<ScreenResponse> hVar, AbstractC25905b bVar, final SetScreenRequest setScreenRequest) {
        ScreenResponse screenResponse = new ScreenResponse();
        try {
            final Context a = bVar.mo92207a();
            if (a instanceof Activity) {
                if (setScreenRequest.value >= 0.0d) {
                    if (setScreenRequest.value <= 1.0d) {
                        new Handler(a.getMainLooper()).post(new Runnable() {
                            /* class com.larksuite.component.openplatform.plugins.device.ScreenPlugin.RunnableC255812 */

                            public void run() {
                                WindowManager.LayoutParams attributes = ((Activity) a).getWindow().getAttributes();
                                attributes.screenBrightness = (float) setScreenRequest.value;
                                ((Activity) a).getWindow().setAttributes(attributes);
                                Log.e("ScreenPlugin", "setScreenBrightness.." + attributes);
                            }
                        });
                        hVar.callback(screenResponse);
                        return;
                    }
                }
                fillFailedResponse(screenResponse, C25906a.f64072b, "value is invalid");
                hVar.callback(screenResponse);
                return;
            }
            fillFailedResponse(screenResponse, C25906a.f64080j, "context is null or context is not activity");
            hVar.callback(screenResponse);
        } catch (Exception e) {
            fillFailedResponse(screenResponse, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(screenResponse);
        }
    }
}
