package com.ss.android.lark.appstrategy.p1375b;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appstrategy.b.a */
public class C29234a extends OPMonitor {

    /* renamed from: a */
    private static C48919b f73180a;

    /* renamed from: b */
    private static C48924d f73181b;

    static {
        C48919b bVar = new C48919b($$Lambda$a$R0YMIJFlEQXZf59ddJCWro3YrRg.INSTANCE, $$Lambda$a$QmDPfSMkeDrxbiNTJ5a_TFdDc0.INSTANCE);
        f73180a = bVar;
        f73181b = new C48924d(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.appstrategy.b.a$1 */
    public static /* synthetic */ class C292351 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73182a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.appstrategy.p1375b.C29234a.C292351.f73182a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.appstrategy.p1375b.C29234a.C292351.f73182a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.appstrategy.p1375b.C29234a.C292351.f73182a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.appstrategy.p1375b.C29234a.C292351.f73182a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLogLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.appstrategy.p1375b.C29234a.C292351.<clinit>():void");
        }
    }

    public C29234a(OPMonitorCode oPMonitorCode) {
        this(f73181b, "op_terminal_info", oPMonitorCode);
    }

    /* renamed from: a */
    public static OPMonitor m107517a(OPMonitorCode oPMonitorCode) {
        return new C29234a(oPMonitorCode);
    }

    public C29234a(AbstractC48908f fVar, String str, OPMonitorCode oPMonitorCode) {
        super(fVar, str, oPMonitorCode);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m107519a(String str, HashMap hashMap, HashMap hashMap2) {
        MonitorUtils.monitorEvent(str, new JSONObject(hashMap2), new JSONObject(hashMap), null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m107518a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("filePath:");
        sb.append(str2);
        sb.append("\t");
        sb.append("function:");
        sb.append(str3);
        sb.append("\t");
        sb.append("line:");
        sb.append(i);
        sb.append("\t");
        sb.append("content");
        sb.append(str4);
        int i2 = C292351.f73182a[oPMonitorLogLevel.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Log.m165383e(str, sb.toString());
        } else if (i2 == 3) {
            Log.m165397w(str, sb.toString());
        } else if (i2 != 4) {
            Log.m165379d(str, sb.toString());
        } else {
            Log.m165389i(str, sb.toString());
        }
    }

    /* renamed from: a */
    public static OPMonitor m107516a(C29236b bVar, SimpleLocation simpleLocation, WifiInfo wifiInfo, WifiInfo wifiInfo2, List<ScanResult> list, boolean z, boolean z2, boolean z3, String str) {
        boolean z4;
        boolean z5;
        boolean z6;
        OPMonitor addCategoryValue = m107517a(bVar).addCategoryValue("trigger_type", str).addCategoryValue("location_switch", Boolean.valueOf(z3)).addCategoryValue("wifi_switch", Boolean.valueOf(z2));
        boolean z7 = true;
        if (wifiInfo != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        OPMonitor addCategoryValue2 = addCategoryValue.addCategoryValue("has_last_wifi", Boolean.valueOf(z4));
        if (wifiInfo2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        OPMonitor addCategoryValue3 = addCategoryValue2.addCategoryValue("has_wifi", Boolean.valueOf(z5));
        if (simpleLocation != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        OPMonitor addCategoryValue4 = addCategoryValue3.addCategoryValue("has_location", Boolean.valueOf(z6));
        if (list == null || list.size() <= 0) {
            z7 = false;
        }
        return addCategoryValue4.addCategoryValue("has_scan_wifi", Boolean.valueOf(z7)).addCategoryValue("in_scope", Boolean.valueOf(z));
    }
}
