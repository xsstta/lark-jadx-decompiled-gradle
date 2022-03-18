package com.larksuite.component.openplatform.core.plugin.device.step;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25907b;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public class GetRunStepCountPlugin extends OPPlugin implements SensorEventListener {
    private AbstractC25897h<GetRunStepCountResponse> invokeCallback;
    private final AtomicBoolean isStarted = new AtomicBoolean(false);
    private Sensor mCountSensor;
    private SensorManager mSensorManager;

    public static class GetRunStepCountResponse extends C25921b {
        @JSONField(name = "stepCount")
        public int mStepCount;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void unregisterListener() {
        Sensor sensor = this.mCountSensor;
        if (sensor != null) {
            this.mSensorManager.unregisterListener(this, sensor);
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        GetRunStepCountResponse getRunStepCountResponse = new GetRunStepCountResponse();
        if (sensorEvent == null || sensorEvent.values == null || sensorEvent.values.length == 0) {
            callbackFail(this.invokeCallback, C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "SensorEvent values error");
        } else {
            getRunStepCountResponse.mStepCount = Float.valueOf(sensorEvent.values[0]).intValue();
            this.invokeCallback.callback(getRunStepCountResponse);
        }
        unregisterListener();
        this.isStarted.set(false);
    }

    public void registerStepListener(AbstractC25897h<GetRunStepCountResponse> hVar) {
        if (this.mCountSensor == null) {
            callbackFail(hVar, C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, C25906a.f64080j.f64117J);
        } else if (this.isStarted.compareAndSet(false, true)) {
            this.invokeCallback = hVar;
            this.mSensorManager.registerListener(this, this.mCountSensor, 0);
        } else {
            callbackFail(hVar, C25907b.f64088G.f64115H, C25907b.f64088G.f64117J, C25907b.f64088G.f64117J);
        }
    }

    public void callbackFail(AbstractC25897h<GetRunStepCountResponse> hVar, int i, String str, String str2) {
        GetRunStepCountResponse getRunStepCountResponse = new GetRunStepCountResponse();
        getRunStepCountResponse.mErrorCode = i;
        getRunStepCountResponse.mErrorMessage = str;
        getRunStepCountResponse.mInnerCode = i;
        getRunStepCountResponse.mInnerMsg = str2;
        if (hVar != null) {
            hVar.callback(getRunStepCountResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"getStepCount"})
    public void getRunStepCount(final AbstractC25897h<GetRunStepCountResponse> hVar, final AbstractC25895f fVar, final AbstractC25905b bVar, LKEvent lKEvent) {
        ILogger b = fVar.mo92190b();
        IAppContext eventContext = getEventContext(lKEvent);
        if (eventContext == null) {
            b.mo92223e("GetRunStepCountPlugin", "appContext is null");
            callbackFail(hVar, C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "appContext is null");
        } else if (!eventContext.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter")) {
            callbackFail(hVar, C25907b.f64087F.f64115H, C25907b.f64087F.f64117J, "step count not available");
        } else {
            if (this.mSensorManager == null) {
                this.mSensorManager = (SensorManager) eventContext.getApplicationContext().getSystemService("sensor");
            }
            if (this.mCountSensor == null) {
                this.mCountSensor = this.mSensorManager.getDefaultSensor(19);
            }
            Context l = lKEvent.mo92145l();
            if (l == null) {
                callbackFail(hVar, C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "context is null");
            } else if (!(l instanceof Activity)) {
                callbackFail(hVar, C25906a.f64080j.f64115H, C25906a.f64080j.f64117J, "activity is null");
            } else {
                ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235103a((Activity) l, lKEvent.mo92146m(), C66578b.C66579a.m260116c(getAppContext()), new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.step.GetRunStepCountPlugin.C248681 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        fVar.mo92190b().mo92224i("GetRunStepCountPlugin", "app permission onGranted");
                        if (Build.VERSION.SDK_INT >= 29) {
                            SystemPermission.Request request = new SystemPermission.Request();
                            request.mPermissions = Collections.singletonList("android.permission.ACTIVITY_RECOGNITION");
                            bVar.mo92209a("requestSystemPermission", request, new AbstractC25897h<SystemPermission.Response>() {
                                /* class com.larksuite.component.openplatform.core.plugin.device.step.GetRunStepCountPlugin.C248681.C248691 */

                                /* renamed from: a */
                                public void callback(SystemPermission.Response response) {
                                    if (response.mDeniedPermissions == null || response.mDeniedPermissions.size() == 0) {
                                        GetRunStepCountPlugin.this.registerStepListener(hVar);
                                        return;
                                    }
                                    fVar.mo92190b().mo92223e("GetRunStepCountPlugin", "system permission onDenied ", response.mDeniedPermissions.toString());
                                    GetRunStepCountResponse getRunStepCountResponse = new GetRunStepCountResponse();
                                    getRunStepCountResponse.mErrorCode = ApiCode.GENERAL_SYSTEM_AUTH_DENY.code;
                                    getRunStepCountResponse.mErrorMessage = ApiCode.GENERAL_SYSTEM_AUTH_DENY.msg;
                                    hVar.callback(getRunStepCountResponse);
                                }
                            }, SystemPermission.Response.class);
                            return;
                        }
                        GetRunStepCountPlugin.this.registerStepListener(hVar);
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        fVar.mo92190b().mo92223e("GetRunStepCountPlugin", "app permission onDenied ", str);
                        GetRunStepCountResponse getRunStepCountResponse = new GetRunStepCountResponse();
                        getRunStepCountResponse.mErrorCode = ApiCode.GENERAL_USER_AUTH_DENIED.code;
                        getRunStepCountResponse.mErrorMessage = ApiCode.GENERAL_USER_AUTH_DENIED.msg;
                        hVar.callback(getRunStepCountResponse);
                    }
                });
            }
        }
    }
}
