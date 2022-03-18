package com.bytedance.android.monitor.lynx;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.entity.PvData;
import com.bytedance.android.monitor.executor.MonitorExecutor;
import com.bytedance.android.monitor.lynx.config.LynxMonitorConfig;
import com.bytedance.android.monitor.lynx.data.entity.LynxCommonData;
import com.bytedance.android.monitor.lynx.data.entity.LynxLifecycleData;
import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.lynx.data.entity.LynxPerfData;
import com.bytedance.android.monitor.p111h.AbstractC2650b;
import com.bytedance.android.monitor.p111h.C2651c;
import com.bytedance.android.monitor.p112i.C2654b;
import com.bytedance.android.monitor.p112i.C2660i;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bytedance/android/monitor/lynx/LynxViewLifeCycleDelegate;", "Lcom/bytedance/android/monitor/lynx/ILynxViewLifeCycleDelegate;", "()V", "checkInitClickStart", "", "view", "Lcom/lynx/tasm/LynxView;", "getLifeCycleData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "getLynxSettingConfig", "Lcom/bytedance/android/monitor/setting/LynxSettingConfig;", "isEnable", "", "onDestroy", "onFirstLoadPerfReady", "lynxPerfData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxPerfData;", "onFirstScreen", "onLoadSuccess", "onPageStart", "url", "", "onPageUpdate", "onReceivedError", "lynxNativeErrorData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "onRuntimeReady", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.c */
public final class LynxViewLifeCycleDelegate implements ILynxViewLifeCycleDelegate {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.c$a */
    public static final class C2668a extends Lambda implements Function0<Unit> {
        final /* synthetic */ LynxView $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2668a(LynxView lynxView) {
            super(0);
            this.$view = lynxView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            HybridMonitor.getInstance().wrapTouchTraceCallback(C2654b.m11158a(this.$view));
        }
    }

    /* renamed from: a */
    private final C2651c m11287a() {
        HybridMonitor instance = HybridMonitor.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "HybridMonitor.getInstance()");
        AbstractC2650b settingManager = instance.getSettingManager();
        Intrinsics.checkExpressionValueIsNotNull(settingManager, "HybridMonitor.getInstance().settingManager");
        C2651c c = settingManager.mo11467c();
        Intrinsics.checkExpressionValueIsNotNull(c, "HybridMonitor.getInstanc…settingManager.lynxConfig");
        return c;
    }

    /* renamed from: f */
    private final void m11288f(LynxView lynxView) {
        MonitorExecutor.f8417a.mo11453a(new C2668a(lynxView));
    }

    /* renamed from: h */
    private final boolean m11290h(LynxView lynxView) {
        return LynxMonitor.f8455b.mo11508a().mo11502a(lynxView);
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: d */
    public void mo11477d(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (!m11290h(lynxView)) {
        }
    }

    /* renamed from: g */
    private final LynxLifecycleData m11289g(LynxView lynxView) {
        return (LynxLifecycleData) LynxMonitor.f8455b.mo11508a().mo11507c().mo11535b(lynxView);
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: c */
    public void mo11476c(LynxView lynxView) {
        LynxLifecycleData g;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView) && (g = m11289g(lynxView)) != null) {
            g.mo11513c(System.currentTimeMillis());
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: e */
    public void mo11478e(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView) && !LynxMonitor.f8455b.mo11508a().mo11503a(lynxView, "perf")) {
            LynxPerfData eVar = new LynxPerfData();
            eVar.mo11521a(2);
            LynxMonitor.f8455b.mo11508a().mo11499a(lynxView, eVar);
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: b */
    public void mo11475b(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView)) {
            LynxLifecycleData g = m11289g(lynxView);
            if (g != null) {
                g.mo11512b(System.currentTimeMillis());
            }
            LynxMonitorConfig a = LynxMonitor.f8455b.mo11508a().mo11492a().mo11479a(lynxView);
            if (a == null || !a.mo11486d() || !m11287a().f8432b || (!Intrinsics.areEqual(a.mo11487e(), "detect_when_load_success")) || LynxMonitor.f8455b.mo11508a().mo11503a(lynxView, "blank")) {
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: a */
    public void mo11473a(LynxView lynxView) {
        LynxLifecycleData bVar;
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView) && (bVar = (LynxLifecycleData) LynxMonitor.f8455b.mo11508a().mo11507c().mo11535b(lynxView)) != null) {
            bVar.mo11514d(System.currentTimeMillis());
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: a */
    public void mo11471a(LynxNativeErrorData dVar, LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(dVar, "lynxNativeErrorData");
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView)) {
            LynxMonitor.f8455b.mo11508a().mo11498a(lynxView, dVar);
            int b = dVar.mo11518b();
            if (b == 100 || b == 103) {
                LynxPerfData eVar = new LynxPerfData();
                eVar.mo11521a(1);
                LynxMonitor.f8455b.mo11508a().mo11499a(lynxView, eVar);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: a */
    public void mo11472a(LynxPerfData eVar, LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(eVar, "lynxPerfData");
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView)) {
            eVar.mo11521a(0);
            LynxMonitor.f8455b.mo11508a().mo11499a(lynxView, eVar);
            LynxMonitor.f8455b.mo11508a().mo11505b(lynxView, eVar);
        }
    }

    @Override // com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate
    /* renamed from: a */
    public void mo11474a(String str, LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "view");
        if (m11290h(lynxView)) {
            LynxCommonData d = LynxMonitor.f8455b.mo11508a().mo11504b().mo11535b(lynxView);
            if (d == null) {
                d = LynxMonitor.f8455b.mo11508a().mo11504b().mo11534a(lynxView);
            }
            if (d != null) {
                d.f8406a = str;
                d.f8410e = C2660i.m11188a();
            }
            ((LynxLifecycleData) LynxMonitor.f8455b.mo11508a().mo11507c().mo11534a(lynxView)).mo11511a(System.currentTimeMillis());
            LynxMonitor.f8455b.mo11508a().mo11496a(lynxView, new PvData());
            m11288f(lynxView);
        }
    }
}
