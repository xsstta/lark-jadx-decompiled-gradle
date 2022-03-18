package com.ss.android.lark.app.util;

import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.VeSDKTools;
import com.ss.android.lark.utils.ao;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/app/util/VeSDKConfig;", "", "()V", "FEATURE_KEY_VE_GET_FIRST_FRAME", "", "FEATURE_KEY_VE_MONITOR", "FEATURE_KEY_VE_USE_NEW_MUXER", "TAG", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.j */
public final class VeSDKConfig {

    /* renamed from: a */
    public static final VeSDKConfig f72907a = new VeSDKConfig();

    /* renamed from: b */
    private static final AtomicBoolean f72908b = new AtomicBoolean(false);

    private VeSDKConfig() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m106990a() {
        AtomicBoolean atomicBoolean = f72908b;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            Log.m165389i("VeSDKConfig", "init");
            VeSDKTools.m224283a();
            VeSDKTools.m224286a(C37239a.m146648b().mo136951a("im.ve.monitor.enable"));
            ao.m224305a(C37239a.m146648b().mo136951a("im.ve.firstframe"));
            ao.m224313b(C37239a.m146648b().mo136951a("messenger.video.new.muxer"));
            VeSDKTools.f142325a.mo196106b();
            VeSDKTools.f142325a.mo196107c();
        }
    }
}
