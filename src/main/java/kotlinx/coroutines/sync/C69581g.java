package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C69557ae;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: kotlinx.coroutines.sync.g */
public final class C69581g {

    /* renamed from: a */
    public static final int f173958a = C69557ae.m266974a("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final Symbol f173959b = new Symbol("PERMIT");

    /* renamed from: c */
    public static final Symbol f173960c = new Symbol("TAKEN");

    /* renamed from: d */
    public static final Symbol f173961d = new Symbol("BROKEN");

    /* renamed from: e */
    public static final Symbol f173962e = new Symbol("CANCELLED");

    /* renamed from: f */
    public static final int f173963f = C69557ae.m266974a("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* renamed from: a */
    public static final boolean m267309a(CancellableContinuation<? super Unit> kVar) {
        Object a = CancellableContinuation.C69573a.m267142a(kVar, Unit.INSTANCE, null, 2, null);
        if (a == null) {
            return false;
        }
        kVar.mo243063a(a);
        return true;
    }

    /* renamed from: a */
    public static final Semaphore m267306a(int i, int i2) {
        return new SemaphoreImpl(i, i2);
    }

    /* renamed from: a */
    public static final SemaphoreSegment m267308a(long j, SemaphoreSegment hVar) {
        return new SemaphoreSegment(j, hVar, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m267305a(kotlinx.coroutines.sync.Semaphore r4, kotlin.jvm.functions.Function0<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.L$1
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.e r4 = (kotlinx.coroutines.sync.Semaphore) r4
            kotlin.C69097g.m265891a(r6)
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            kotlin.C69097g.m265891a(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.mo243129a(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.C69117h.m265971b(r3)
            r4.mo243130a()
            kotlin.jvm.internal.C69117h.m265972c(r3)
            return r5
        L_0x0059:
            r5 = move-exception
            kotlin.jvm.internal.C69117h.m265971b(r3)
            r4.mo243130a()
            kotlin.jvm.internal.C69117h.m265972c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C69581g.m267305a(kotlinx.coroutines.sync.e, kotlin.jvm.functions.Function0, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ Semaphore m267307a(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m267306a(i, i2);
    }
}
