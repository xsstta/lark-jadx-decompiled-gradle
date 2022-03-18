package com.ss.android.lark.rust.track.monitor;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.monitor.app.NativeMonitor;
import com.ss.android.lark.rust.track.C53165b;
import com.ss.android.lark.rust.track.monitor.MonitorConfigParser;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/CPUMonitor;", "", "()V", "cpuConfig", "Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "cpuInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getCpuInit", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setCpuInit", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "cpuUseAge", "", "Ljava/lang/Float;", "listener", "Lcom/ss/android/lark/monitor/MonitorModule$IAppCpuChangeListener;", "getListener", "()Lcom/ss/android/lark/monitor/MonitorModule$IAppCpuChangeListener;", "calculateCPUUsageLevel", "", "start", "", "stop", "Companion", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.rust.track.monitor.a */
public final class CPUMonitor {

    /* renamed from: b */
    public static final Companion f131503b = new Companion(null);

    /* renamed from: a */
    public Float f131504a = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);

    /* renamed from: c */
    private final MonitorConfigParser.GearConfig f131505c = MonitorConfigParser.INSTANCE.getCpuConfig();

    /* renamed from: d */
    private AtomicBoolean f131506d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C48246q.AbstractC48247a f131507e = new C53190b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/CPUMonitor$Companion;", "", "()V", "TAG", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final AtomicBoolean mo181645a() {
        return this.f131506d;
    }

    /* renamed from: c */
    public final void mo181647c() {
        NativeMonitor.removeAppCpuChangeListener(this.f131507e);
    }

    /* renamed from: b */
    public final void mo181646b() {
        if (!this.f131506d.get()) {
            C53165b.m205769a().mo178120a();
        }
        NativeMonitor.getInstance().setEnableAppCpuChangeMonitor(true);
        NativeMonitor.addAppCpuChangeListener(this.f131507e);
    }

    /* renamed from: d */
    public final int mo181648d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f131504a == null) {
            return 0;
        }
        MonitorConfigParser.GearConfig gearConfig = this.f131505c;
        if (gearConfig != null) {
            f = gearConfig.getSlightlyLevel();
        } else {
            f = 0.3f;
        }
        MonitorConfigParser.GearConfig gearConfig2 = this.f131505c;
        if (gearConfig2 != null) {
            f2 = gearConfig2.getModeratelyLevel();
        } else {
            f2 = 0.5f;
        }
        MonitorConfigParser.GearConfig gearConfig3 = this.f131505c;
        if (gearConfig3 != null) {
            f3 = gearConfig3.getSeverelyLevel();
        } else {
            f3 = 0.8f;
        }
        MonitorConfigParser.GearConfig gearConfig4 = this.f131505c;
        if (gearConfig4 != null) {
            f4 = gearConfig4.getFatallyLevel();
        } else {
            f4 = 1.0f;
        }
        Float f5 = this.f131504a;
        if (f5 != null) {
            float floatValue = f5.floatValue();
            Log.m165389i("CPUMonitor", "cpu usage rate: " + this.f131504a);
            if (floatValue < f) {
                return 0;
            }
            if (floatValue >= f && floatValue < f2) {
                return 1;
            }
            if (floatValue >= f2 && floatValue < f3) {
                return 2;
            }
            if (floatValue >= f3 && floatValue < f4) {
                return 3;
            }
            if (floatValue >= f4) {
                return 4;
            }
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onAppCpuChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.rust.track.monitor.a$b */
    static final class C53190b implements C48246q.AbstractC48247a {

        /* renamed from: a */
        final /* synthetic */ CPUMonitor f131508a;

        C53190b(CPUMonitor aVar) {
            this.f131508a = aVar;
        }

        @Override // com.ss.android.lark.monitor.C48246q.AbstractC48247a
        /* renamed from: a */
        public final void mo103071a(float f) {
            this.f131508a.f131504a = Float.valueOf(f / 100.0f);
        }
    }
}
