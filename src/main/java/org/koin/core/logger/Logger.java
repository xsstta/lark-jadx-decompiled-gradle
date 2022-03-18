package org.koin.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eJ\u001c\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eJ\u0012\u0010\u0011\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003J\u001c\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\f\u001a\u00060\rj\u0002`\u000eH&R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0015"}, d2 = {"Lorg/koin/core/logger/Logger;", "", "level", "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "getLevel", "()Lorg/koin/core/logger/Level;", "setLevel", "canLog", "", "debug", "", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "doLog", "error", "info", "isAt", "lvl", "log", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.logger.b */
public abstract class Logger {

    /* renamed from: a */
    private Level f175056a;

    public Logger() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public abstract void mo30738a(Level level, String str);

    public Logger(Level level) {
        Intrinsics.checkParameterIsNotNull(level, "level");
        this.f175056a = level;
    }

    /* renamed from: a */
    public final void mo246689a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        m268709b(Level.DEBUG, str);
    }

    /* renamed from: c */
    public final void mo246692c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        m268709b(Level.ERROR, str);
    }

    /* renamed from: b */
    private final boolean m268710b(Level level) {
        if (this.f175056a.compareTo((Enum) level) <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo246690a(Level level) {
        Intrinsics.checkParameterIsNotNull(level, "lvl");
        if (this.f175056a.compareTo((Enum) level) <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo246691b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        m268709b(Level.INFO, str);
    }

    /* renamed from: b */
    private final void m268709b(Level level, String str) {
        if (m268710b(level)) {
            mo30738a(level, str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Logger(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }
}
