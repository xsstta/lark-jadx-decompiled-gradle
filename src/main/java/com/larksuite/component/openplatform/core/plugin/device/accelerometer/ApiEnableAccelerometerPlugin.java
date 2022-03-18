package com.larksuite.component.openplatform.core.plugin.device.accelerometer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.refer.abs.container.background.DefaultForeBackgroundListener;
import com.tt.refer.abs.container.background.IForeBackgroundService;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0007¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "enableAccelerometerAsync", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "apiRequest", "Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$ApiAccelerometerRequest;", "lkBridgeContext", "Lcom/larksuite/framework/apiplugin/LKBridgeContext;", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$ApiAccelerometerResponse;", "AccelerometerManager", "ApiAccelerometerRequest", "ApiAccelerometerResponse", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApiEnableAccelerometerPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$ApiAccelerometerResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ApiAccelerometerResponse extends C25921b {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$ApiAccelerometerRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "interval", "", "getInterval", "()Ljava/lang/String;", "setInterval", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ApiAccelerometerRequest extends C25920a {
        @JSONField(name = "enable")
        private boolean enable;
        @JSONField(name = "interval")
        private String interval;

        public final boolean getEnable() {
            return this.enable;
        }

        public final String getInterval() {
            return this.interval;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setInterval(String str) {
            this.interval = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$Companion;", "", "()V", "G", "", "INTERVAL_GAME", "", "INTERVAL_NORMAL", "INTERVAL_UI", "TAG", "", "UI_REF_KEY", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$AccelerometerManager;", "Landroid/hardware/SensorEventListener;", "Lcom/tt/miniapphost/appcontainer/api/UIModuleService;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "currentOpen", "", "enable", "foreBackgroundListener", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "hasInit", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "lastUpdateTime", "sensorManager", "Landroid/hardware/SensorManager;", "stopListenWhenBackground", "close", "getForeGroundService", "Lcom/tt/refer/abs/container/IContainerModuleService;", "kotlin.jvm.PlatformType", "init", "", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "open", "startListen", "stopListen", "unregister", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin$a */
    private static final class AccelerometerManager implements SensorEventListener, AbstractC67439g {

        /* renamed from: a */
        public boolean f60824a;

        /* renamed from: b */
        public volatile boolean f60825b;

        /* renamed from: c */
        private final SensorManager f60826c;

        /* renamed from: d */
        private IForeBackgroundService.ForeBackgroundListener f60827d;

        /* renamed from: e */
        private boolean f60828e;

        /* renamed from: f */
        private boolean f60829f;

        /* renamed from: g */
        private long f60830g;

        /* renamed from: h */
        private long f60831h;

        /* renamed from: i */
        private final IAppContext f60832i;

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* renamed from: f */
        private final AbstractC67720a m89759f() {
            return (AbstractC67720a) this.f60832i.findServiceByInterface(AbstractC67720a.class);
        }

        @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
        /* renamed from: b */
        public void mo50164b() {
            IForeBackgroundService.ForeBackgroundListener aVar = this.f60827d;
            if (aVar != null) {
                m89759f().mo235072b(aVar);
            }
        }

        /* renamed from: e */
        public final void mo87714e() {
            this.f60826c.unregisterListener(this);
        }

        /* renamed from: g */
        private final void m89760g() {
            if (!this.f60828e) {
                C24731a aVar = new C24731a(this);
                m89759f().mo235071a(aVar);
                this.f60828e = true;
                this.f60827d = aVar;
            }
        }

        /* renamed from: c */
        public final boolean mo87712c() {
            this.f60829f = false;
            if (!this.f60828e) {
                return true;
            }
            synchronized (this) {
                mo87714e();
                this.f60825b = false;
                Unit unit = Unit.INSTANCE;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo87713d() {
            Sensor defaultSensor = this.f60826c.getDefaultSensor(1);
            if (defaultSensor != null) {
                return this.f60826c.registerListener(this, defaultSensor, 1);
            }
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/openplatform/core/plugin/device/accelerometer/ApiEnableAccelerometerPlugin$AccelerometerManager$init$1", "Lcom/tt/refer/abs/container/background/DefaultForeBackgroundListener;", "onBackGround", "", "stayBackgroundTimeMillis", "", "onForeGround", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin$a$a */
        public static final class C24731a extends DefaultForeBackgroundListener {

            /* renamed from: a */
            final /* synthetic */ AccelerometerManager f60833a;

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87717a() {
                if (this.f60833a.f60824a) {
                    synchronized (this.f60833a) {
                        if (this.f60833a.f60825b) {
                            this.f60833a.mo87713d();
                        }
                        this.f60833a.f60824a = false;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C24731a(AccelerometerManager aVar) {
                this.f60833a = aVar;
            }

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87718a(long j) {
                if (!this.f60833a.f60824a) {
                    synchronized (this.f60833a) {
                        if (this.f60833a.f60825b) {
                            this.f60833a.mo87714e();
                            this.f60833a.f60824a = true;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo87711a() {
            this.f60829f = true;
            if (this.f60825b) {
                return true;
            }
            m89760g();
            if (m89759f().mo235074d()) {
                return true;
            }
            synchronized (this) {
                this.f60825b = mo87713d();
                Unit unit = Unit.INSTANCE;
            }
            return this.f60825b;
        }

        /* renamed from: a */
        public final void mo87710a(long j) {
            this.f60831h = j;
        }

        public AccelerometerManager(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            this.f60832i = iAppContext;
            Object systemService = iAppContext.getApplicationContext().getSystemService("sensor");
            if (systemService != null) {
                this.f60826c = (SensorManager) systemService;
                this.f60830g = -1;
                this.f60831h = 200;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            Intrinsics.checkParameterIsNotNull(sensorEvent, "event");
            if (this.f60829f) {
                Sensor sensor = sensorEvent.sensor;
                Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
                if (sensor.getType() == 1) {
                    float f = (-sensorEvent.values[0]) / 9.8f;
                    float f2 = (-sensorEvent.values[1]) / 9.8f;
                    float f3 = (-sensorEvent.values[2]) / 9.8f;
                    if (f > 1.0f) {
                        f = 1.0f;
                    } else if (f < -1.0f) {
                        f = -1.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    } else if (f2 < -1.0f) {
                        f2 = -1.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    } else if (f3 < -1.0f) {
                        f3 = -1.0f;
                    }
                    if (System.currentTimeMillis() - this.f60830g >= this.f60831h) {
                        this.f60830g = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("x", Float.valueOf(f));
                            jSONObject.put("y", Float.valueOf(f2));
                            jSONObject.put("z", Float.valueOf(f3));
                            ((AbstractC67709b) this.f60832i.findServiceByInterface(AbstractC67709b.class)).mo235012a(C67706e.C67708a.m263377a("onAccelerometerChange", jSONObject).mo235009a());
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("ApiEnableAccelerometerPlugin", e);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r7 != null) goto L_0x006b;
     */
    @com.larksuite.framework.apiplugin.annotation.LKPluginFunction(async = true, eventName = {"enableAccelerometer"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void enableAccelerometerAsync(com.larksuite.framework.apiplugin.LKEvent r7, com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin.ApiAccelerometerRequest r8, com.larksuite.framework.apiplugin.AbstractC25905b r9, com.larksuite.framework.apiplugin.p1175a.AbstractC25897h<com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin.ApiAccelerometerResponse> r10) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin.enableAccelerometerAsync(com.larksuite.framework.apiplugin.LKEvent, com.larksuite.component.openplatform.core.plugin.device.accelerometer.ApiEnableAccelerometerPlugin$ApiAccelerometerRequest, com.larksuite.framework.apiplugin.b, com.larksuite.framework.apiplugin.a.h):void");
    }
}
