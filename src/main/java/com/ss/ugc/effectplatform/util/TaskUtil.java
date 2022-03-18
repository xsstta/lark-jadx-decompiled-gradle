package com.ss.ugc.effectplatform.util;

import bytekn.foundation.concurrent.lock.AtomicLong;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/effectplatform/util/TaskUtil;", "", "()V", "id", "Lbytekn/foundation/concurrent/lock/AtomicLong;", "generateTaskId", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.t */
public final class TaskUtil {

    /* renamed from: a */
    public static final TaskUtil f165133a = new TaskUtil();

    /* renamed from: b */
    private static final AtomicLong f165134b = new AtomicLong(0);

    private TaskUtil() {
    }

    /* renamed from: a */
    public final String mo228356a() {
        return String.valueOf(f165134b.mo8632a());
    }
}
