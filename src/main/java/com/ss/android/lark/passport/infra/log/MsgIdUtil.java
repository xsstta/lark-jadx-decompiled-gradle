package com.ss.android.lark.passport.infra.log;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/MsgIdUtil;", "", "()V", "msgId", "Ljava/util/concurrent/atomic/AtomicInteger;", "getMsgId", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.log.d */
public final class MsgIdUtil {

    /* renamed from: a */
    public static final MsgIdUtil f123377a = new MsgIdUtil();

    /* renamed from: b */
    private static final AtomicInteger f123378b = new AtomicInteger(0);

    private MsgIdUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m193726a() {
        return f123378b.incrementAndGet();
    }
}
