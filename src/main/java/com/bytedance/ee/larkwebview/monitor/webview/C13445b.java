package com.bytedance.ee.larkwebview.monitor.webview;

import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.webview.b */
public final /* synthetic */ class C13445b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f35436a;

    static {
        int[] iArr = new int[OPMonitorLogLevel.values().length];
        f35436a = iArr;
        iArr[OPMonitorLogLevel.DEBUG.ordinal()] = 1;
        iArr[OPMonitorLogLevel.INFO.ordinal()] = 2;
        iArr[OPMonitorLogLevel.WARN.ordinal()] = 3;
        iArr[OPMonitorLogLevel.ERROR.ordinal()] = 4;
    }
}
