package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u001aB\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018*\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001cHHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u00078\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"EMPTY_LOCKED", "Lkotlinx/coroutines/sync/Empty;", "EMPTY_LOCKED$annotations", "()V", "EMPTY_UNLOCKED", "EMPTY_UNLOCKED$annotations", "ENQUEUE_FAIL", "Lkotlinx/coroutines/internal/Symbol;", "ENQUEUE_FAIL$annotations", "LOCKED", "LOCKED$annotations", "LOCK_FAIL", "LOCK_FAIL$annotations", "SELECT_SUCCESS", "SELECT_SUCCESS$annotations", "UNLOCKED", "UNLOCKED$annotations", "UNLOCK_FAIL", "UNLOCK_FAIL$annotations", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.sync.d */
public final class C69580d {

    /* renamed from: a */
    public static final Symbol f173944a = new Symbol("LOCK_FAIL");

    /* renamed from: b */
    public static final Symbol f173945b = new Symbol("UNLOCK_FAIL");

    /* renamed from: c */
    public static final Symbol f173946c = new Symbol("SELECT_SUCCESS");

    /* renamed from: d */
    public static final Symbol f173947d;

    /* renamed from: e */
    public static final Symbol f173948e;

    /* renamed from: f */
    public static final Empty f173949f;

    /* renamed from: g */
    public static final Empty f173950g;

    /* renamed from: h */
    private static final Symbol f173951h = new Symbol("ENQUEUE_FAIL");

    static {
        Symbol abVar = new Symbol("LOCKED");
        f173947d = abVar;
        Symbol abVar2 = new Symbol("UNLOCKED");
        f173948e = abVar2;
        f173949f = new Empty(abVar);
        f173950g = new Empty(abVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m267297a(kotlinx.coroutines.sync.Mutex r4, java.lang.Object r5, kotlin.jvm.functions.Function0<? extends T> r6, kotlin.coroutines.Continuation<? super T> r7) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C69580d.m267297a(kotlinx.coroutines.sync.c, java.lang.Object, kotlin.jvm.functions.Function0, kotlin.coroutines.c):java.lang.Object");
    }
}
