package com.larksuite.component.openplatform.core.plugin.device.accelerometer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.refer.abs.container.background.DefaultForeBackgroundListener;
import com.tt.refer.abs.container.background.IForeBackgroundService;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/AccelerometerAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "handleAPI", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "AccelerometerManager", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "use plugin")
@ApiSupportType(apiName = {"enableAccelerometer"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.a */
public final class AccelerometerAsyncHandler extends AbstractC65797c {

    /* renamed from: a */
    public static final Companion f60834a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/AccelerometerAsyncHandler$Companion;", "", "()V", "G", "", "INTERVAL_GAME", "", "INTERVAL_NORMAL", "INTERVAL_UI", "TAG", "", "UI_REF_KEY", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AccelerometerAsyncHandler() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/accelerometer/AccelerometerAsyncHandler$AccelerometerManager;", "Landroid/hardware/SensorEventListener;", "Lcom/tt/miniapphost/appcontainer/api/UIModuleService;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "currentOpen", "", "enable", "foreBackgroundListener", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "hasInit", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "lastUpdateTime", "sensorManager", "Landroid/hardware/SensorManager;", "stopListenWhenBackground", "close", "getForeGroundService", "Lcom/tt/refer/abs/container/IContainerModuleService;", "kotlin.jvm.PlatformType", "init", "", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "open", "startListen", "stopListen", "unregister", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.a$a */
    private static final class AccelerometerManager implements SensorEventListener, AbstractC67439g {

        /* renamed from: a */
        public boolean f60835a;

        /* renamed from: b */
        public volatile boolean f60836b;

        /* renamed from: c */
        private final SensorManager f60837c;

        /* renamed from: d */
        private IForeBackgroundService.ForeBackgroundListener f60838d;

        /* renamed from: e */
        private boolean f60839e;

        /* renamed from: f */
        private boolean f60840f;

        /* renamed from: g */
        private long f60841g;

        /* renamed from: h */
        private long f60842h;

        /* renamed from: i */
        private final IAppContext f60843i;

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* renamed from: f */
        private final AbstractC67720a m89771f() {
            return (AbstractC67720a) this.f60843i.findServiceByInterface(AbstractC67720a.class);
        }

        @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
        /* renamed from: b */
        public void mo50164b() {
            IForeBackgroundService.ForeBackgroundListener aVar = this.f60838d;
            if (aVar != null) {
                m89771f().mo235072b(aVar);
            }
        }

        /* renamed from: e */
        public final void mo87723e() {
            this.f60837c.unregisterListener(this);
        }

        /* renamed from: g */
        private final void m89772g() {
            if (!this.f60839e) {
                C24732a aVar = new C24732a(this);
                m89771f().mo235071a(aVar);
                this.f60839e = true;
                this.f60838d = aVar;
            }
        }

        /* renamed from: c */
        public final boolean mo87721c() {
            this.f60840f = false;
            if (!this.f60839e) {
                return true;
            }
            synchronized (this) {
                mo87723e();
                this.f60836b = false;
                Unit unit = Unit.INSTANCE;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo87722d() {
            Sensor defaultSensor = this.f60837c.getDefaultSensor(1);
            if (defaultSensor != null) {
                return this.f60837c.registerListener(this, defaultSensor, 1);
            }
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/openplatform/core/plugin/device/accelerometer/AccelerometerAsyncHandler$AccelerometerManager$init$1", "Lcom/tt/refer/abs/container/background/DefaultForeBackgroundListener;", "onBackGround", "", "stayBackgroundTimeMillis", "", "onForeGround", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.device.accelerometer.a$a$a */
        public static final class C24732a extends DefaultForeBackgroundListener {

            /* renamed from: a */
            final /* synthetic */ AccelerometerManager f60844a;

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87717a() {
                if (this.f60844a.f60835a) {
                    synchronized (this.f60844a) {
                        if (this.f60844a.f60836b) {
                            this.f60844a.mo87722d();
                        }
                        this.f60844a.f60835a = false;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C24732a(AccelerometerManager aVar) {
                this.f60844a = aVar;
            }

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87718a(long j) {
                if (!this.f60844a.f60835a) {
                    synchronized (this.f60844a) {
                        if (this.f60844a.f60836b) {
                            this.f60844a.mo87723e();
                            this.f60844a.f60835a = true;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo87720a() {
            this.f60840f = true;
            if (this.f60836b) {
                return true;
            }
            m89772g();
            if (m89771f().mo235074d()) {
                return true;
            }
            synchronized (this) {
                this.f60836b = mo87722d();
                Unit unit = Unit.INSTANCE;
            }
            return this.f60836b;
        }

        /* renamed from: a */
        public final void mo87719a(long j) {
            this.f60842h = j;
        }

        public AccelerometerManager(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            this.f60843i = iAppContext;
            Object systemService = iAppContext.getApplicationContext().getSystemService("sensor");
            if (systemService != null) {
                this.f60837c = (SensorManager) systemService;
                this.f60841g = -1;
                this.f60842h = 200;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            Intrinsics.checkParameterIsNotNull(sensorEvent, "event");
            if (this.f60840f) {
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
                    if (System.currentTimeMillis() - this.f60841g >= this.f60842h) {
                        this.f60841g = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("x", Float.valueOf(f));
                            jSONObject.put("y", Float.valueOf(f2));
                            jSONObject.put("z", Float.valueOf(f3));
                            ((AbstractC67709b) this.f60843i.findServiceByInterface(AbstractC67709b.class)).mo235012a(C67706e.C67708a.m263377a("onAccelerometerChange", jSONObject).mo235009a());
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("AccelerometerAsyncHandler", e);
                        }
                    }
                }
            }
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("enableAccelerometer");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…API_ENABLE_ACCELEROMETER)");
        return singletonList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        if (r0 != null) goto L_0x005a;
     */
    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87216a(com.tt.refer.p3400a.p3401a.p3402a.C67701b r7) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.device.accelerometer.AccelerometerAsyncHandler.mo87216a(com.tt.refer.a.a.a.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccelerometerAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }
}
