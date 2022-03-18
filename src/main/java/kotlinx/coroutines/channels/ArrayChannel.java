package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010,\u001a\u00020\b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0016\u00100\u001a\u00020\b8D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0016\u00101\u001a\u00020\b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0016\u00102\u001a\u00020\b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010-R\u0016\u00103\u001a\u00020\b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-R\u001a\u00106\u001a\u000604j\u0002`58\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "", "capacity", "<init>", "(I)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "currentSize", "", "ensureCapacity", "element", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "getCapacity", "()I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "isFull", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.d */
public class ArrayChannel<E> extends AbstractChannel<E> {

    /* renamed from: b */
    private final ReentrantLock f173511b;

    /* renamed from: c */
    private Object[] f173512c;

    /* renamed from: d */
    private int f173513d;

    /* renamed from: e */
    private final int f173514e;
    private volatile int size;

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
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: b */
    public final boolean mo242793b() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    public final boolean mo242827m() {
        if (this.size == this.f173514e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: q */
    public String mo242831q() {
        return "(buffer:capacity=" + this.f173514e + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: c */
    public Object mo242795c() {
        Send vVar = null;
        ReentrantLock reentrantLock = this.f173511b;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object n = mo242828n();
                if (n == null) {
                    n = C69377b.f173503c;
                }
                return n;
            }
            Object[] objArr = this.f173512c;
            int i2 = this.f173513d;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C69377b.f173503c;
            boolean z = false;
            if (i == this.f173514e) {
                while (true) {
                    Send o = mo242829o();
                    if (o == null) {
                        break;
                    }
                    if (o == null) {
                        Intrinsics.throwNpe();
                    }
                    Symbol a = o.mo242834a((LockFreeLinkedListNode.PrepareOp) null);
                    if (a != null) {
                        if (ak.m266269a()) {
                            if (a == C69574m.f173872a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        if (o == null) {
                            Intrinsics.throwNpe();
                        }
                        obj2 = o.mo242833a();
                        vVar = o;
                        z = true;
                    } else {
                        vVar = o;
                    }
                }
            }
            if (obj2 != C69377b.f173503c && !(obj2 instanceof Closed)) {
                this.size = i;
                Object[] objArr2 = this.f173512c;
                objArr2[(this.f173513d + i) % objArr2.length] = obj2;
            }
            this.f173513d = (this.f173513d + 1) % this.f173512c.length;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (z) {
                if (vVar == null) {
                    Intrinsics.throwNpe();
                }
                vVar.mo242836b();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: a */
    public Object mo242818a(Send vVar) {
        ReentrantLock reentrantLock = this.f173511b;
        reentrantLock.lock();
        try {
            return super.mo242818a(vVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private final void m266588a(int i) {
        Object[] objArr = this.f173512c;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[Math.min(objArr.length * 2, this.f173514e)];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f173512c;
                objArr2[i2] = objArr3[(this.f173513d + i2) % objArr3.length];
            }
            this.f173512c = objArr2;
            this.f173513d = 0;
        }
    }

    public ArrayChannel(int i) {
        this.f173514e = i;
        if (i < 1 ? false : true) {
            this.f173511b = new ReentrantLock();
            this.f173512c = new Object[Math.min(i, 8)];
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public void mo242789a(boolean z) {
        if (z) {
            ReentrantLock reentrantLock = this.f173511b;
            reentrantLock.lock();
            try {
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    this.f173512c[this.f173513d] = 0;
                    this.f173513d = (this.f173513d + 1) % this.f173512c.length;
                }
                this.size = 0;
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
        super.mo242789a(z);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: a */
    public Object mo242816a(E e) {
        ReceiveOrClosed<E> h;
        Symbol a;
        boolean z;
        ReentrantLock reentrantLock = this.f173511b;
        reentrantLock.lock();
        try {
            int i = this.size;
            Closed<?> n = mo242828n();
            if (n != null) {
                return n;
            }
            if (i < this.f173514e) {
                this.size = i + 1;
                if (i == 0) {
                    do {
                        h = mo242800h();
                        if (h != null) {
                            if (h instanceof Closed) {
                                this.size = i;
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
                    this.size = i;
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
                m266588a(i);
                Object[] objArr = this.f173512c;
                objArr[(this.f173513d + i) % objArr.length] = e;
                Object obj = C69377b.f173501a;
                reentrantLock.unlock();
                return obj;
            }
            Object obj2 = C69377b.f173502b;
            reentrantLock.unlock();
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo242785a(kotlinx.coroutines.selects.SelectInstance<?> r9) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ArrayChannel.mo242785a(kotlinx.coroutines.selects.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: a */
    public boolean mo242792a(Receive<? super E> rVar) {
        ReentrantLock reentrantLock = this.f173511b;
        reentrantLock.lock();
        try {
            return super.mo242792a((Receive) rVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
