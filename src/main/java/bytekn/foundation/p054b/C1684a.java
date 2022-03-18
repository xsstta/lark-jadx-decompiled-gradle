package bytekn.foundation.p054b;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\b\u001a\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"currentThreadId", "", "getCurrentThreadId", "()J", "currentThreadName", "", "getCurrentThreadName", "()Ljava/lang/String;", "isMainThread", "", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.a */
public final class C1684a {
    /* renamed from: a */
    public static final long m7462a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        return currentThread.getId();
    }

    /* renamed from: b */
    public static final boolean m7463b() {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        return Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread());
    }
}
