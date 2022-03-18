package com.ss.android.lark.larkconfig.larksetting.handler.log;

import com.ss.android.lark.log.alog.ReportConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/log/LogDynamicConfig;", "", "processConfig", "Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessConfig;", "reportConfig", "Lcom/ss/android/lark/log/alog/ReportConfig;", "(Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessConfig;Lcom/ss/android/lark/log/alog/ReportConfig;)V", "getProcessConfig", "()Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessConfig;", "setProcessConfig", "(Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessConfig;)V", "getReportConfig", "()Lcom/ss/android/lark/log/alog/ReportConfig;", "setReportConfig", "(Lcom/ss/android/lark/log/alog/ReportConfig;)V", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LogDynamicConfig {
    private ProcessConfig processConfig;
    private ReportConfig reportConfig;

    public LogDynamicConfig() {
        this(null, null, 3, null);
    }

    public final ProcessConfig getProcessConfig() {
        return this.processConfig;
    }

    public final ReportConfig getReportConfig() {
        return this.reportConfig;
    }

    public final void setProcessConfig(ProcessConfig processConfig2) {
        Intrinsics.checkParameterIsNotNull(processConfig2, "<set-?>");
        this.processConfig = processConfig2;
    }

    public final void setReportConfig(ReportConfig reportConfig2) {
        Intrinsics.checkParameterIsNotNull(reportConfig2, "<set-?>");
        this.reportConfig = reportConfig2;
    }

    public LogDynamicConfig(ProcessConfig processConfig2, ReportConfig reportConfig2) {
        Intrinsics.checkParameterIsNotNull(processConfig2, "processConfig");
        Intrinsics.checkParameterIsNotNull(reportConfig2, "reportConfig");
        this.processConfig = processConfig2;
        this.reportConfig = reportConfig2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LogDynamicConfig(com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessConfig r14, com.ss.android.lark.log.alog.ReportConfig r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r13 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x0017
            com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessConfig r0 = new com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessConfig
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r12 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0018
        L_0x0017:
            r0 = r14
        L_0x0018:
            r1 = r16 & 2
            if (r1 == 0) goto L_0x002c
            com.ss.android.lark.log.alog.ReportConfig r1 = new com.ss.android.lark.log.alog.ReportConfig
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r2 = r1
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r2 = r13
            goto L_0x002e
        L_0x002c:
            r2 = r13
            r1 = r15
        L_0x002e:
            r13.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.larkconfig.larksetting.handler.log.LogDynamicConfig.<init>(com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessConfig, com.ss.android.lark.log.alog.ReportConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
