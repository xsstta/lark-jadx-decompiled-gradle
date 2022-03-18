package com.bytedance.sdk.bytebridge.base.utils;

import android.util.Log;
import com.bytedance.sdk.bytebridge.base.ByteBridge;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/utils/Logger;", "", "()V", C63690d.f160779a, "", "className", "", "message", "e", "w", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.e.c */
public final class Logger {

    /* renamed from: a */
    public static final Logger f50602a = new Logger();

    private Logger() {
    }

    /* renamed from: a */
    public final void mo69824a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "className");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        if (ByteBridge.f50573b.mo69803b().mo69827a()) {
            Log.d("bridge", str + " - " + str2);
        }
    }
}
