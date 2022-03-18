package com.ss.android.lark.opmonitor.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/opmonitor/config/TraceFilter;", "Lcom/ss/android/lark/opmonitor/config/IMonitorFilter;", "()V", "eventName", "", "", "monitorDomain", "monitorDomainPrefix", "monitorId", "filter", "", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "OPMonitor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.config.h */
public final class TraceFilter {
    @SerializedName("monitor_domain")
    @Expose

    /* renamed from: a */
    private final List<String> f122881a;
    @SerializedName("monitor_domain_prefix")
    @Expose

    /* renamed from: b */
    private final List<String> f122882b;
    @SerializedName("monitor_id")
    @Expose

    /* renamed from: c */
    private final List<String> f122883c;
    @SerializedName("event_name")
    @Expose

    /* renamed from: d */
    private final List<String> f122884d;

    /* renamed from: a */
    public boolean mo170780a(OPMonitor oPMonitor) {
        Intrinsics.checkParameterIsNotNull(oPMonitor, "monitor");
        OPMonitorCode monitorCode = oPMonitor.getMonitorCode();
        if (monitorCode != null) {
            Iterator<T> it = this.f122881a.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(monitorCode.domain, it.next())) {
                    return true;
                }
            }
            Iterator<T> it2 = this.f122882b.iterator();
            while (it2.hasNext()) {
                String str = monitorCode.domain;
                Intrinsics.checkExpressionValueIsNotNull(str, "this.domain");
                if (StringsKt.startsWith$default(str, (String) it2.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            Iterator<T> it3 = this.f122883c.iterator();
            while (it3.hasNext()) {
                String str2 = monitorCode.ID;
                Intrinsics.checkExpressionValueIsNotNull(str2, "this.ID");
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) it3.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        String name = oPMonitor.getName();
        if (name != null) {
            Iterator<T> it4 = this.f122884d.iterator();
            while (it4.hasNext()) {
                if (Intrinsics.areEqual(name, it4.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
