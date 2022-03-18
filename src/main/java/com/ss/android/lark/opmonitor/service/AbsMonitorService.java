package com.ss.android.lark.opmonitor.service;

import android.text.TextUtils;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/opmonitor/service/AbsMonitorService;", "Lcom/ss/android/lark/opmonitor/api/OPMonitorServiceInterface;", "()V", "getEventName", "", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "config", "Lcom/ss/android/lark/opmonitor/model/OPMonitorServiceConfig;", "log", "", "Companion", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.service.a */
public abstract class AbsMonitorService implements AbstractC48908f {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/opmonitor/service/AbsMonitorService$Companion;", "", "()V", "COMMA", "", "KEY_DATA", "KEY_MONITOR_EVENT", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.opmonitor.service.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getEventName(OPMonitor oPMonitor, C48919b bVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        String name = oPMonitor.getName();
        if (TextUtils.isEmpty(name)) {
            OPMonitorCode monitorCode = oPMonitor.getMonitorCode();
            if (monitorCode != null) {
                str = bVar.mo170801a(monitorCode.domain);
            } else {
                str = bVar.mo170801a((String) null);
            }
            name = str;
        }
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        return name;
    }

    public final void log(OPMonitor oPMonitor, C48919b bVar) {
        OPMonitorLogLevel oPMonitorLogLevel;
        String str;
        int i;
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        if (bVar != null) {
            if (oPMonitor.getLevel() == null) {
                oPMonitorLogLevel = OPMonitorLogLevel.INFO;
            } else {
                OPMonitorLevel level = oPMonitor.getLevel();
                if (level != null) {
                    int i2 = C48920b.f122900a[level.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        oPMonitorLogLevel = OPMonitorLogLevel.INFO;
                    } else if (i2 == 3) {
                        oPMonitorLogLevel = OPMonitorLogLevel.WARN;
                    } else if (i2 == 4) {
                        oPMonitorLogLevel = OPMonitorLogLevel.ERROR;
                    } else if (i2 == 5) {
                        oPMonitorLogLevel = OPMonitorLogLevel.FATAL;
                    }
                }
                oPMonitorLogLevel = OPMonitorLogLevel.INFO;
            }
            String eventName = getEventName(oPMonitor, bVar);
            String str2 = null;
            if (oPMonitor.getValue("monitor_file") instanceof String) {
                Object value = oPMonitor.getValue("monitor_file");
                if (value != null) {
                    str = (String) value;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                str = null;
            }
            if (oPMonitor.getValue("monitor_function") instanceof String) {
                Object value2 = oPMonitor.getValue("monitor_function");
                if (value2 != null) {
                    str2 = (String) value2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
            if (oPMonitor.getValue("monitor_line") instanceof Integer) {
                Object value3 = oPMonitor.getValue("monitor_line");
                if (value3 != null) {
                    i = ((Integer) value3).intValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                i = -1;
            }
            bVar.mo170806a(oPMonitorLogLevel, "op_monitor", str, str2, i, "monitor_event:" + eventName + "," + "data:" + new JSONObject(oPMonitor.getData()));
        }
    }
}
