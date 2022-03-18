package com.ss.android.lark.app.task;

import com.bytedance.apm.ApmAgent;
import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.ALogConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
final class InitPrivacyTask$execute$1$uploadALog$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f72623a;

    /* renamed from: b */
    final /* synthetic */ long f72624b;

    /* renamed from: c */
    final /* synthetic */ long f72625c;

    /* renamed from: d */
    final /* synthetic */ String f72626d;

    InitPrivacyTask$execute$1$uploadALog$1(long j, long j2, long j3, String str) {
        this.f72623a = j;
        this.f72624b = j2;
        this.f72625c = j3;
        this.f72626d = str;
    }

    public final void run() {
        Thread.sleep(this.f72623a);
        ALogConfig aLogConfig = ALog.sConfig;
        Intrinsics.checkExpressionValueIsNotNull(aLogConfig, "ALog.sConfig");
        ApmAgent.activeUploadAlog(aLogConfig.getLogDirPath(), this.f72624b, this.f72625c, this.f72626d, C289691.f72627a);
    }
}
