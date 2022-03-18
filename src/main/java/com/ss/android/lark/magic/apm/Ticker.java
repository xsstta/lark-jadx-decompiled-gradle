package com.ss.android.lark.magic.apm;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/magic/apm/Ticker;", "", "()V", "tickMap", "", "", "", "diff", "key1", "key2", "diffNow", "key", "getTickTime", "setTickTime", "", "time", "tick", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.a.b */
public final class Ticker {

    /* renamed from: a */
    private final Map<String, Long> f105929a = new ConcurrentHashMap();

    /* renamed from: c */
    public final long mo149997c(String str) {
        return SystemClock.elapsedRealtime() - mo149996b(str);
    }

    /* renamed from: a */
    public final void mo149994a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f105929a.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: b */
    public final long mo149996b(String str) {
        Long l = this.f105929a.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final long mo149993a(String str, String str2) {
        return mo149996b(str) - mo149996b(str2);
    }

    /* renamed from: a */
    public final void mo149995a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f105929a.put(str, Long.valueOf(j));
    }
}
