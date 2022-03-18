package com.ss.android.lark.app.util;

import com.bytedance.crash.Npth;
import com.bytedance.crash.p217a.AbstractC3689c;
import com.bytedance.crash.p217a.C3688b;
import com.ss.android.agilelogger.ALog;
import com.ss.android.agilelogger.ALogConfig;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/app/util/ALogUploader;", "", "()V", "TAG", "", "init", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.a */
public final class ALogUploader {

    /* renamed from: a */
    public static final ALogUploader f72887a = new ALogUploader();

    private ALogUploader() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "flushAlogDataToFile"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.a$a */
    public static final class C29081a implements AbstractC3689c {

        /* renamed from: a */
        public static final C29081a f72888a = new C29081a();

        C29081a() {
        }

        @Override // com.bytedance.crash.p217a.AbstractC3689c
        /* renamed from: a */
        public final void mo15102a() {
            Log.m165383e("ALogUploader", "happen crash, upload alog");
            ALog.asyncFlush();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m106936a() {
        if (ALog.isInitSuccess()) {
            Log.m165389i("ALogUploader", "ALogUploader init success");
            ALogConfig aLogConfig = ALog.sConfig;
            Intrinsics.checkExpressionValueIsNotNull(aLogConfig, "ALog.sConfig");
            Npth.enableALogCollector(aLogConfig.getLogDirPath(), C29081a.f72888a, new C3688b());
        }
    }
}
