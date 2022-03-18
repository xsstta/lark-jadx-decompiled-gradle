package org.koin.core.logger;

import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\n"}, d2 = {"Lorg/koin/core/logger/EmptyLogger;", "Lorg/koin/core/logger/Logger;", "()V", "log", "", "level", "Lorg/koin/core/logger/Level;", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.logger.a */
public final class EmptyLogger extends Logger {
    public EmptyLogger() {
        super(Level.NONE);
    }

    @Override // org.koin.core.logger.Logger
    /* renamed from: a */
    public void mo30738a(Level level, String str) {
        Intrinsics.checkParameterIsNotNull(level, "level");
        Intrinsics.checkParameterIsNotNull(str, "msg");
        PrintStream printStream = System.err;
        printStream.println("should not see this - " + level + " - " + str);
    }
}
