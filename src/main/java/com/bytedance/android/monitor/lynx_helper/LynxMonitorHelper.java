package com.bytedance.android.monitor.lynx_helper;

import com.bytedance.android.monitor.lynx.LynxMonitor;
import com.bytedance.android.monitor.lynx.config.LynxMonitorConfig;
import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.lynx.data.entity.LynxPerfData;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u001d\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u000eJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lcom/bytedance/android/monitor/lynx_helper/LynxMonitorHelper;", "", "()V", "lynxErrorToMonitorErrorData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "lynxError", "Lcom/lynx/tasm/LynxError;", "lynxErrorToMonitorErrorData$lynx_helper_release", "", "lynxNativeErrorData", "perfMetricToMonitorPerfData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxPerfData;", "perfMetric", "Lcom/lynx/tasm/LynxPerfMetric;", "perfMetricToMonitorPerfData$lynx_helper_release", "perfData", "registerLynxMonitor", "lynxView", "Lcom/lynx/tasm/LynxView;", "lynxMonitorConfig", "Lcom/bytedance/android/monitor/lynx/config/LynxMonitorConfig;", "lynx-helper_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.g.a */
public final class LynxMonitorHelper {

    /* renamed from: a */
    public static final LynxMonitorHelper f8425a = new LynxMonitorHelper();

    private LynxMonitorHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final LynxNativeErrorData m11134a(C26906i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "lynxError");
        LynxNativeErrorData dVar = new LynxNativeErrorData();
        m11138a(iVar, dVar);
        return dVar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final LynxPerfData m11135a(LynxPerfMetric lynxPerfMetric) {
        Intrinsics.checkParameterIsNotNull(lynxPerfMetric, "perfMetric");
        LynxPerfData eVar = new LynxPerfData();
        m11136a(lynxPerfMetric, eVar);
        return eVar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m11137a(LynxView lynxView, LynxMonitorConfig bVar) {
        Intrinsics.checkParameterIsNotNull(lynxView, "lynxView");
        Intrinsics.checkParameterIsNotNull(bVar, "lynxMonitorConfig");
        if (bVar.mo11484b()) {
            LynxMonitor.f8455b.mo11508a().mo11497a(lynxView, bVar);
            lynxView.addLynxViewClient(new MonitorPerfClient(lynxView));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m11136a(LynxPerfMetric lynxPerfMetric, LynxPerfData eVar) {
        Intrinsics.checkParameterIsNotNull(lynxPerfMetric, "perfMetric");
        Intrinsics.checkParameterIsNotNull(eVar, "perfData");
        eVar.mo11520a(lynxPerfMetric.getFirsPageLayout());
        eVar.mo11524b(lynxPerfMetric.getFirsPageLayout());
        eVar.mo11526c(lynxPerfMetric.getTti());
        eVar.mo11527d(lynxPerfMetric.getLayout());
        eVar.mo11528e(lynxPerfMetric.getDiffRootCreate());
        eVar.mo11529f(lynxPerfMetric.getDiffSameRoot());
        eVar.mo11530g(lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate());
        eVar.mo11531h(lynxPerfMetric.getTasmBinaryDecode());
        eVar.mo11532i(lynxPerfMetric.getTasmFinishLoadTemplate());
        eVar.mo11533j(lynxPerfMetric.getRenderPage());
        eVar.mo11525b(lynxPerfMetric.toJSONObject());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m11138a(C26906i iVar, LynxNativeErrorData dVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "lynxError");
        Intrinsics.checkParameterIsNotNull(dVar, "lynxNativeErrorData");
        dVar.mo11517a("lynx_error");
        dVar.mo11516a(iVar.mo95711a());
        dVar.mo11519b(iVar.mo95712b());
    }
}
