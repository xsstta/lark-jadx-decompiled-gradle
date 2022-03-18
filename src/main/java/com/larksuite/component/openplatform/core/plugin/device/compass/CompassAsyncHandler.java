package com.larksuite.component.openplatform.core.plugin.device.compass;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/compass/CompassAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "handleAPI", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "Companion", "CompassManager", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "use compass plugin")
@ApiSupportType(apiName = {"startCompass", "stopCompass"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.b.b */
public final class CompassAsyncHandler extends AbstractC65797c {

    /* renamed from: a */
    public static final Companion f60846a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/compass/CompassAsyncHandler$Companion;", "", "()V", "TAG", "", "UI_REF_KEY", "UPDATE_INTERVAL", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CompassAsyncHandler() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020\u0007J\b\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/device/compass/CompassAsyncHandler$CompassManager;", "Lcom/tt/miniapphost/appcontainer/api/UIModuleService;", "Landroid/hardware/SensorEventListener;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "currentOpen", "", "enable", "foreBackgroundListener", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "geomagnetic", "", "gravity", "hasInit", "lastUpdateTime", "", "sensorManager", "Landroid/hardware/SensorManager;", "stopListenWhenBackground", "calculateOrientation", "", "close", "getForeGroundService", "Lcom/tt/refer/abs/container/IContainerModuleService;", "kotlin.jvm.PlatformType", "init", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "open", "startListen", "stopListen", "unregister", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.b.b$b */
    private static final class CompassManager implements SensorEventListener, AbstractC67439g {

        /* renamed from: a */
        public boolean f60847a;

        /* renamed from: b */
        public volatile boolean f60848b;

        /* renamed from: c */
        private final SensorManager f60849c;

        /* renamed from: d */
        private IForeBackgroundService.ForeBackgroundListener f60850d;

        /* renamed from: e */
        private boolean f60851e;

        /* renamed from: f */
        private boolean f60852f;

        /* renamed from: g */
        private long f60853g;

        /* renamed from: h */
        private float[] f60854h;

        /* renamed from: i */
        private float[] f60855i;

        /* renamed from: j */
        private final IAppContext f60856j;

        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkParameterIsNotNull(sensor, "sensor");
        }

        /* renamed from: f */
        private final AbstractC67720a m89785f() {
            return (AbstractC67720a) this.f60856j.findServiceByInterface(AbstractC67720a.class);
        }

        @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
        /* renamed from: b */
        public void mo50164b() {
            IForeBackgroundService.ForeBackgroundListener aVar = this.f60850d;
            if (aVar != null) {
                m89785f().mo235072b(aVar);
            }
        }

        /* renamed from: e */
        public final void mo87729e() {
            this.f60849c.unregisterListener(this);
        }

        /* renamed from: g */
        private final void m89786g() {
            if (!this.f60851e) {
                C24736a aVar = new C24736a(this);
                m89785f().mo235071a(aVar);
                this.f60851e = true;
                this.f60850d = aVar;
            }
        }

        /* renamed from: c */
        public final boolean mo87727c() {
            this.f60852f = false;
            if (!this.f60851e) {
                return true;
            }
            synchronized (this) {
                mo87729e();
                this.f60848b = false;
                Unit unit = Unit.INSTANCE;
            }
            return true;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/openplatform/core/plugin/device/compass/CompassAsyncHandler$CompassManager$init$1", "Lcom/tt/refer/abs/container/background/DefaultForeBackgroundListener;", "onBackGround", "", "stayBackgroundTimeMillis", "", "onForeGround", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.device.b.b$b$a */
        public static final class C24736a extends DefaultForeBackgroundListener {

            /* renamed from: a */
            final /* synthetic */ CompassManager f60857a;

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87717a() {
                if (this.f60857a.f60847a) {
                    synchronized (this.f60857a) {
                        if (this.f60857a.f60848b) {
                            this.f60857a.mo87728d();
                        }
                        this.f60857a.f60847a = false;
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C24736a(CompassManager bVar) {
                this.f60857a = bVar;
            }

            @Override // com.tt.refer.abs.container.background.DefaultForeBackgroundListener, com.tt.refer.abs.container.background.IForeBackgroundService.ForeBackgroundListener
            /* renamed from: a */
            public void mo87718a(long j) {
                if (!this.f60857a.f60847a) {
                    synchronized (this.f60857a) {
                        if (this.f60857a.f60848b) {
                            this.f60857a.mo87729e();
                            this.f60857a.f60847a = true;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo87726a() {
            this.f60852f = true;
            if (this.f60848b) {
                return true;
            }
            m89786g();
            if (m89785f().mo235074d()) {
                this.f60847a = true;
                return true;
            }
            synchronized (this) {
                this.f60848b = mo87728d();
                Unit unit = Unit.INSTANCE;
            }
            return this.f60848b;
        }

        /* renamed from: d */
        public final boolean mo87728d() {
            SensorManager sensorManager = this.f60849c;
            CompassManager bVar = this;
            if (sensorManager.registerListener(bVar, sensorManager.getDefaultSensor(2), 3)) {
                SensorManager sensorManager2 = this.f60849c;
                if (sensorManager2.registerListener(bVar, sensorManager2.getDefaultSensor(1), 3)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        private final void m89787h() {
            float[] fArr;
            float[] fArr2 = this.f60854h;
            if (fArr2 != null && (fArr = this.f60855i) != null) {
                float[] fArr3 = new float[3];
                float[] fArr4 = new float[9];
                if (SensorManager.getRotationMatrix(fArr4, null, fArr2, fArr)) {
                    SensorManager.getOrientation(fArr4, fArr3);
                    float degrees = (float) Math.toDegrees((double) fArr3[0]);
                    if (System.currentTimeMillis() - this.f60853g >= 200) {
                        this.f60853g = System.currentTimeMillis();
                        if (degrees < ((float) 0)) {
                            degrees += (float) 360;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, Float.valueOf(degrees));
                            ((AbstractC67709b) this.f60856j.findServiceByInterface(AbstractC67709b.class)).mo235012a(C67706e.C67708a.m263377a("onCompassChange", jSONObject).mo235009a());
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("CompassAsyncHandler", e);
                        }
                    }
                }
            }
        }

        public CompassManager(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            this.f60856j = iAppContext;
            Object systemService = iAppContext.getApplicationContext().getSystemService("sensor");
            if (systemService != null) {
                this.f60849c = (SensorManager) systemService;
                this.f60853g = -1;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            Intrinsics.checkParameterIsNotNull(sensorEvent, "event");
            if (this.f60852f) {
                Sensor sensor = sensorEvent.sensor;
                Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
                if (sensor.getType() == 2) {
                    this.f60855i = sensorEvent.values;
                } else {
                    Sensor sensor2 = sensorEvent.sensor;
                    Intrinsics.checkExpressionValueIsNotNull(sensor2, "event.sensor");
                    if (sensor2.getType() == 1) {
                        this.f60854h = sensorEvent.values;
                    }
                }
                m89787h();
            }
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return CollectionsKt.listOf((Object[]) new String[]{"startCompass", "stopCompass"});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r5 != null) goto L_0x003c;
     */
    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87216a(com.tt.refer.p3400a.p3401a.p3402a.C67701b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "apiInvokeData"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            com.tt.refer.a.a.b r5 = r4.mo230474g()
            java.lang.String r0 = "CompassAsyncHandler"
            com.tt.miniapphost.a.a.g r5 = r5.mo235010a(r0)
            if (r5 == 0) goto L_0x0020
            if (r5 == 0) goto L_0x0018
            com.larksuite.component.openplatform.core.plugin.device.b.b$b r5 = (com.larksuite.component.openplatform.core.plugin.device.compass.CompassAsyncHandler.CompassManager) r5
            if (r5 == 0) goto L_0x0020
            goto L_0x003c
        L_0x0018:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.larksuite.component.openplatform.core.plugin.device.compass.CompassAsyncHandler.CompassManager"
            r5.<init>(r0)
            throw r5
        L_0x0020:
            r5 = r4
            com.larksuite.component.openplatform.core.plugin.device.b.b r5 = (com.larksuite.component.openplatform.core.plugin.device.compass.CompassAsyncHandler) r5
            com.larksuite.component.openplatform.core.plugin.device.b.b$b r1 = new com.larksuite.component.openplatform.core.plugin.device.b.b$b
            com.bytedance.ee.lark.infra.sandbox.context.IAppContext r2 = r5.mo230473f()
            java.lang.String r3 = "appContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.<init>(r2)
            com.tt.refer.a.a.b r5 = r5.mo230474g()
            r2 = r1
            com.tt.miniapphost.a.a.g r2 = (com.tt.miniapphost.p3362a.p3363a.AbstractC67439g) r2
            r5.mo235013a(r0, r2)
            r5 = r1
        L_0x003c:
            java.lang.String r0 = r4.mo230472e()
            java.lang.String r1 = "startCompass"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L_0x004d
            boolean r5 = r5.mo87726a()
            goto L_0x0051
        L_0x004d:
            boolean r5 = r5.mo87727c()
        L_0x0051:
            if (r5 == 0) goto L_0x0057
            r4.mo230494j()
            goto L_0x005c
        L_0x0057:
            com.tt.miniapp.errorcode.ApiCode r5 = com.tt.miniapp.errorcode.ApiCode.OPERATECOMPASS_COMPASS_NOT_SUPPORT
            r4.mo230481a(r5)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.device.compass.CompassAsyncHandler.mo87216a(com.tt.refer.a.a.a.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompassAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }
}
