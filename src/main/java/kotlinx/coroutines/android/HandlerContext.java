package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.android.a */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private volatile HandlerContext _immediate;

    /* renamed from: a */
    public final Handler f173412a;

    /* renamed from: d */
    private final HandlerContext f173413d;

    /* renamed from: e */
    private final String f173414e;

    /* renamed from: f */
    private final boolean f173415f;

    /* renamed from: b */
    public HandlerContext mo242660a() {
        return this.f173413d;
    }

    public int hashCode() {
        return System.identityHashCode(this.f173412a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class RunnableC69365a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HandlerContext f173416a;

        /* renamed from: b */
        final /* synthetic */ CancellableContinuation f173417b;

        public RunnableC69365a(HandlerContext aVar, CancellableContinuation kVar) {
            this.f173416a = aVar;
            this.f173417b = kVar;
        }

        public final void run() {
            this.f173417b.mo243065a((CoroutineDispatcher) this.f173416a, (Object) Unit.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.f173414e;
        if (str == null) {
            return this.f173412a.toString();
        }
        if (!this.f173415f) {
            return str;
        }
        return this.f173414e + " [immediate]";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.android.a$b */
    static final class C69366b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ HandlerContext this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69366b(HandlerContext aVar, Runnable runnable) {
            super(1);
            this.this$0 = aVar;
            this.$block = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            this.this$0.f173412a.removeCallbacks(this.$block);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext) || ((HandlerContext) obj).f173412a != this.f173412a) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public boolean mo242639a(CoroutineContext fVar) {
        if (!this.f173415f || (!Intrinsics.areEqual(Looper.myLooper(), this.f173412a.getLooper()))) {
            return true;
        }
        return false;
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: a */
    public void mo6045a(CoroutineContext fVar, Runnable runnable) {
        this.f173412a.post(runnable);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: a */
    public void mo242661a(long j, CancellableContinuation<? super Unit> kVar) {
        RunnableC69365a aVar = new RunnableC69365a(this, kVar);
        this.f173412a.postDelayed(aVar, RangesKt.coerceAtMost(j, 4611686018427387903L));
        kVar.mo243064a((Function1<? super Throwable, Unit>) new C69366b(this, aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        HandlerContext aVar = null;
        this.f173412a = handler;
        this.f173414e = str;
        this.f173415f = z;
        this._immediate = z ? this : aVar;
        HandlerContext aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new HandlerContext(handler, str, true);
            this._immediate = aVar2;
        }
        this.f173413d = aVar2;
    }
}
