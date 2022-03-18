package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Activity;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.f */
public class C24832f extends ApiHandler {

    /* renamed from: a */
    private String f60971a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f60971a;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            AppBrandLogger.m52830i("tma_ApiScreenCtrl", this.f60971a, ContainerUtils.KEY_VALUE_DELIMITER, this.mArgs);
            if (TextUtils.equals(this.f60971a, "getScreenBrightness")) {
                float f = currentActivity.getWindow().getAttributes().screenBrightness;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    try {
                        f = (float) (((double) Settings.System.getInt(currentActivity.getContentResolver(), "screen_brightness")) / 255.0d);
                    } catch (Settings.SettingNotFoundException e) {
                        callbackFail(e);
                        return;
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("value", Float.valueOf(f));
                callbackOk(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
            } else if (TextUtils.equals(this.f60971a, "setKeepScreenOn")) {
                try {
                    final boolean optBoolean = new JSONObject(this.mArgs).optBoolean("keepScreenOn", false);
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.device.C24832f.RunnableC248331 */

                        public void run() {
                            if (optBoolean) {
                                currentActivity.getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
                            } else {
                                currentActivity.getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
                            }
                        }
                    });
                    callbackOk();
                } catch (Exception e2) {
                    callbackFail(e2);
                }
            } else if (TextUtils.equals(this.f60971a, "setScreenBrightness")) {
                try {
                    final WindowManager.LayoutParams attributes = currentActivity.getWindow().getAttributes();
                    attributes.screenBrightness = (float) new JSONObject(this.mArgs).optDouble("value");
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.device.C24832f.RunnableC248342 */

                        public void run() {
                            currentActivity.getWindow().setAttributes(attributes);
                        }
                    });
                    callbackOk();
                } catch (Exception e3) {
                    callbackFail(e3);
                }
            }
        }
    }

    public C24832f(String str, String str2, int i, AbstractC67619e eVar) {
        super(str2, i, eVar);
        this.f60971a = str;
    }
}
