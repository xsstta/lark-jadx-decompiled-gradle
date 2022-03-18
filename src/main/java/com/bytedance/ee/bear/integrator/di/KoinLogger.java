package com.bytedance.ee.bear.integrator.di;

import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/integrator/di/KoinLogger;", "Lorg/koin/core/logger/Logger;", "()V", "log", "", "level", "Lorg/koin/core/logger/Level;", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "Companion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.e */
public final class KoinLogger extends Logger {

    /* renamed from: a */
    public static final Companion f21298a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/integrator/di/KoinLogger$Companion;", "", "()V", "TAG", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KoinLogger() {
        super(Level.INFO);
    }

    @Override // org.koin.core.logger.Logger
    /* renamed from: a */
    public void mo30738a(Level level, String str) {
        Intrinsics.checkParameterIsNotNull(level, "level");
        Intrinsics.checkParameterIsNotNull(str, "msg");
        int i = C7911f.f21299a[level.ordinal()];
        if (i == 1) {
            C13479a.m54772d("Koin", str);
        } else if (i == 2) {
            C13479a.m54764b("Koin", str);
        } else if (i == 3) {
            C13479a.m54758a("Koin", str);
        } else if (i == 4) {
            C13479a.m54772d("Koin", str);
        }
    }
}
