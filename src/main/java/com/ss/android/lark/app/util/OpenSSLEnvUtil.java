package com.ss.android.lark.app.util;

import android.os.Build;
import com.C1711a;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/app/util/OpenSSLEnvUtil;", "", "()V", "Companion", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.app.util.h */
public final class OpenSSLEnvUtil {

    /* renamed from: a */
    public static final AtomicBoolean f72904a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final Companion f72905b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/app/util/OpenSSLEnvUtil$Companion;", "", "()V", "TAG", "", "mOpenSSLEnvLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "fixOpenSSLEnv", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.app.util.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo103200a() {
            if (Build.VERSION.SDK_INT > 28 && OpenSSLEnvUtil.f72904a.compareAndSet(false, true)) {
                try {
                    C1711a.m7628a("openssl_armcap");
                } catch (Throwable th) {
                    Log.m165384e("OpenSSLEnvUtil", "set env error", th);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
