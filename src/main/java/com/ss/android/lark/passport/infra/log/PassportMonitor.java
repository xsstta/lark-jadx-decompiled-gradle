package com.ss.android.lark.passport.infra.log;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/PassportMonitor;", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "(Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;)V", "name", "", "(Ljava/lang/String;)V", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.log.e */
public final class PassportMonitor extends OPMonitor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassportMonitor(OPMonitorCode oPMonitorCode) {
        super(oPMonitorCode);
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "code");
    }
}
