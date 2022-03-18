package bytekn.foundation.p054b.p058d;

import bytekn.foundation.concurrent.lock.AtomicReference;
import bytekn.foundation.p054b.p057c.C1688f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\"\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\"\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0003\"\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00058\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"ioScheduler", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "getIoScheduler", "()Lbytekn/foundation/concurrent/scheduler/Scheduler;", "ioSchedulerFactory", "Lbytekn/foundation/concurrent/lock/AtomicReference;", "Lkotlin/Lazy;", "ioSchedulerFactory$annotations", "()V", "mainScheduler", "getMainScheduler", "mainSchedulerFactory", "mainSchedulerFactory$annotations", "overrideSchedulers", "", "main", "Lkotlin/Function0;", "io", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.k */
public final class C1696k {

    /* renamed from: a */
    private static final AtomicReference<Lazy<Scheduler>> f5755a = new AtomicReference<>(LazyKt.lazy(C1698b.INSTANCE));

    /* renamed from: b */
    private static final AtomicReference<Lazy<Scheduler>> f5756b = new AtomicReference<>(LazyKt.lazy(C1697a.INSTANCE));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.k$a */
    static final /* synthetic */ class C1697a extends FunctionReference implements Function0<Scheduler> {
        public static final C1697a INSTANCE = new C1697a();

        C1697a() {
            super(0);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "createIoScheduler";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(C1691b.class, "kn_common_release");
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scheduler invoke() {
            return C1691b.m7484a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lbytekn/foundation/concurrent/scheduler/Scheduler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.k$b */
    static final /* synthetic */ class C1698b extends FunctionReference implements Function0<Scheduler> {
        public static final C1698b INSTANCE = new C1698b();

        C1698b() {
            super(0);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "createMainScheduler";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(C1692c.class, "kn_common_release");
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scheduler invoke() {
            return C1692c.m7485a();
        }
    }

    /* renamed from: a */
    public static final Scheduler m7500a() {
        return (Scheduler) ((Lazy) C1688f.m7479a(f5755a)).getValue();
    }

    /* renamed from: b */
    public static final Scheduler m7501b() {
        return (Scheduler) ((Lazy) C1688f.m7479a(f5756b)).getValue();
    }
}
