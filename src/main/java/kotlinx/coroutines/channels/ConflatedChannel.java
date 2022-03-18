package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.C69578e;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0014J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00028\u00002\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0014¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u0014J\n\u0010!\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\"\u001a\u0004\u0018\u00010\u00132\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "()V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "", "wasClosed", "pollInternal", "pollSelectInternal", "Companion", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.m */
public class ConflatedChannel<E> extends AbstractChannel<E> {

    /* renamed from: d */
    private static final Symbol f173520d = new Symbol("EMPTY");

    /* renamed from: e */
    private static final Companion f173521e = new Companion(null);

    /* renamed from: b */
    private final ReentrantLock f173522b = new ReentrantLock();

    /* renamed from: c */
    private Object f173523c = f173520d;

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public final boolean mo242790a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: l */
    public final boolean mo242826l() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    public final boolean mo242827m() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel$Companion;", "", "()V", "EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.m$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: b */
    public final boolean mo242793b() {
        if (this.f173523c == f173520d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: q */
    public String mo242831q() {
        return "(value=" + this.f173523c + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: c */
    public Object mo242795c() {
        ReentrantLock reentrantLock = this.f173522b;
        reentrantLock.lock();
        try {
            Object obj = this.f173523c;
            Symbol abVar = f173520d;
            if (obj == abVar) {
                Object n = mo242828n();
                if (n == null) {
                    n = C69377b.f173503c;
                }
                return n;
            }
            this.f173523c = abVar;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public void mo242789a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f173522b;
            reentrantLock.lock();
            try {
                this.f173523c = f173520d;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.mo242789a(z);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public Object mo242785a(SelectInstance<?> dVar) {
        ReentrantLock reentrantLock = this.f173522b;
        reentrantLock.lock();
        try {
            Object obj = this.f173523c;
            Symbol abVar = f173520d;
            if (obj == abVar) {
                Object n = mo242828n();
                if (n == null) {
                    n = C69377b.f173503c;
                }
                return n;
            } else if (!dVar.mo243123g()) {
                Object b = C69578e.m267291b();
                reentrantLock.unlock();
                return b;
            } else {
                Object obj2 = this.f173523c;
                this.f173523c = abVar;
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: a */
    public Object mo242816a(E e) {
        ReceiveOrClosed<E> h;
        Symbol a;
        boolean z;
        ReentrantLock reentrantLock = this.f173522b;
        reentrantLock.lock();
        try {
            Closed<?> n = mo242828n();
            if (n != null) {
                return n;
            }
            if (this.f173523c == f173520d) {
                do {
                    h = mo242800h();
                    if (h != null) {
                        if (h instanceof Closed) {
                            if (h == null) {
                                Intrinsics.throwNpe();
                            }
                            reentrantLock.unlock();
                            return h;
                        }
                        if (h == null) {
                            Intrinsics.throwNpe();
                        }
                        a = h.mo242809a(e, null);
                    }
                } while (a == null);
                if (ak.m266269a()) {
                    if (a == C69574m.f173872a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                if (h == null) {
                    Intrinsics.throwNpe();
                }
                h.mo242811b(e);
                if (h == null) {
                    Intrinsics.throwNpe();
                }
                return h.mo242845f();
            }
            this.f173523c = e;
            Object obj = C69377b.f173501a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public boolean mo242792a(Receive<? super E> rVar) {
        ReentrantLock reentrantLock = this.f173522b;
        reentrantLock.lock();
        try {
            return super.mo242792a((Receive) rVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
