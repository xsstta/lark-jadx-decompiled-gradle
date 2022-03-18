package bytekn.foundation.concurrent.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ThreadFactoryImpl;", "Ljava/util/concurrent/ThreadFactory;", "namePrefix", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.b.d.l */
public final class ThreadFactoryImpl implements ThreadFactory {

    /* renamed from: a */
    public static final Lazy f5757a = LazyKt.lazy(C1699b.INSTANCE);

    /* renamed from: b */
    public static final Companion f5758b = new Companion(null);

    /* renamed from: c */
    private final String f5759c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lbytekn/foundation/concurrent/scheduler/ThreadFactoryImpl$Companion;", "", "()V", "factory", "Ljava/util/concurrent/ThreadFactory;", "kotlin.jvm.PlatformType", "getFactory", "()Ljava/util/concurrent/ThreadFactory;", "factory$delegate", "Lkotlin/Lazy;", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.l$a */
    private static final class Companion {
        /* renamed from: a */
        public final ThreadFactory mo8656a() {
            Lazy lazy = ThreadFactoryImpl.f5757a;
            Companion aVar = ThreadFactoryImpl.f5758b;
            return (ThreadFactory) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadFactory;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.b.d.l$b */
    static final class C1699b extends Lambda implements Function0<ThreadFactory> {
        public static final C1699b INSTANCE = new C1699b();

        C1699b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ThreadFactory invoke() {
            return Executors.defaultThreadFactory();
        }
    }

    public ThreadFactoryImpl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "namePrefix");
        this.f5759c = str;
    }

    public Thread newThread(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        Thread newThread = f5758b.mo8656a().newThread(runnable);
        newThread.setName(this.f5759c + ", " + newThread.getName());
        newThread.setDaemon(true);
        Intrinsics.checkExpressionValueIsNotNull(newThread, "factory\n            .new…emon = true\n            }");
        return newThread;
    }
}
