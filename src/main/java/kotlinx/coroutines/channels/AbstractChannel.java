package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.C69078e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.C69575n;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.al;
import kotlinx.coroutines.channels.ValueOrClosed;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69563c;
import kotlinx.coroutines.internal.C69570n;
import kotlinx.coroutines.internal.C69571p;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.p3475a.C69359b;
import kotlinx.coroutines.selects.C69578e;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0006LMNOPQB\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0016\u0010\u0017\u001a\u00020\u001a2\u000e\u0010\u0018\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0004J\u0016\u0010!\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0002J\u0016\u0010$\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0014JR\u0010%\u001a\u00020\u0006\"\u0004\b\u0001\u0010&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0(2$\u0010)\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H&0,\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010-\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0002\u0010/J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0002J\u0010\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0006H\u0014J\b\u00104\u001a\u00020\u001aH\u0014J\b\u00105\u001a\u00020\u001aH\u0014J\r\u00106\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u00107J\n\u00108\u001a\u0004\u0018\u00010+H\u0014J\u0016\u00109\u001a\u0004\u0018\u00010+2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0014J\u0011\u0010\"\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010:J\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010:J\u0013\u0010<\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010=\u001a\u0004\u0018\u00018\u00002\b\u0010>\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0002\u0010?J\u001f\u0010@\u001a\u0002H&\"\u0004\b\u0001\u0010&2\u0006\u0010-\u001a\u00020.H@ø\u0001\u0000¢\u0006\u0002\u0010AJR\u0010B\u001a\u00020\u001a\"\u0004\b\u0001\u0010&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0(2\u0006\u0010-\u001a\u00020.2$\u0010)\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H&0,\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0002ø\u0001\u0000¢\u0006\u0002\u0010CJ \u0010D\u001a\u00020\u001a2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030F2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0010\u0010G\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010HH\u0014JX\u0010I\u001a\u00020\u001a\"\u0004\b\u0001\u0010&* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H&0,\u0012\u0006\u0012\u0004\u0018\u00010+0*2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0(2\u0006\u0010-\u001a\u00020.2\b\u0010J\u001a\u0004\u0018\u00010+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010KR\u0014\u0010\u0005\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u000f8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "()V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrClosed", "Lkotlinx/coroutines/channels/ValueOrClosed;", "getOnReceiveOrClosed", "onReceiveOrNull", "getOnReceiveOrNull", "cancel", "cause", "", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onReceiveDequeued", "onReceiveEnqueued", "poll", "()Ljava/lang/Object;", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrClosed", "receiveOrNull", "receiveOrNullResult", "result", "(Ljava/lang/Object;)Ljava/lang/Object;", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.a */
public abstract class AbstractChannel<E> extends AbstractSendChannel<E> implements Channel<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo242790a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo242793b();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo242801i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo242802j() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000fHBø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0011\u0010\u0012\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0013\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/AbstractChannel;", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$a */
    private static final class Itr<E> implements ChannelIterator<E> {

        /* renamed from: a */
        private Object f173486a = C69377b.f173503c;

        /* renamed from: b */
        private final AbstractChannel<E> f173487b;

        /* renamed from: b */
        public final AbstractChannel<E> mo242807b() {
            return this.f173487b;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        /* renamed from: a */
        public E mo242803a() {
            E e = (E) this.f173486a;
            if (e instanceof Closed) {
                throw C69554aa.m266954a(e.mo242843d());
            } else if (e != C69377b.f173503c) {
                this.f173486a = C69377b.f173503c;
                return e;
            } else {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
        }

        /* renamed from: a */
        public final void mo242805a(Object obj) {
            this.f173486a = obj;
        }

        public Itr(AbstractChannel<E> aVar) {
            this.f173487b = aVar;
        }

        /* renamed from: b */
        private final boolean m266539b(Object obj) {
            if (!(obj instanceof Closed)) {
                return true;
            }
            Closed lVar = (Closed) obj;
            if (lVar.f173519a == null) {
                return false;
            }
            throw C69554aa.m266954a(lVar.mo242843d());
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        /* renamed from: a */
        public Object mo242804a(Continuation<? super Boolean> cVar) {
            if (this.f173486a != C69377b.f173503c) {
                return C69089a.m265837a(m266539b(this.f173486a));
            }
            Object c = this.f173487b.mo242795c();
            this.f173486a = c;
            if (c != C69377b.f173503c) {
                return C69089a.m265837a(m266539b(this.f173486a));
            }
            return mo242806b(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final /* synthetic */ Object mo242806b(Continuation<? super Boolean> cVar) {
            CancellableContinuationImpl a = C69575n.m267177a(C69086a.m265825a(cVar));
            CancellableContinuationImpl lVar = a;
            ReceiveHasNext cVar2 = new ReceiveHasNext(this, lVar);
            while (true) {
                ReceiveHasNext cVar3 = cVar2;
                if (!mo242807b().mo242794b((Receive) cVar3)) {
                    Object c = mo242807b().mo242795c();
                    mo242805a(c);
                    if (!(c instanceof Closed)) {
                        if (c != C69377b.f173503c) {
                            Boolean a2 = C69089a.m265837a(true);
                            Result.Companion aVar = Result.Companion;
                            lVar.resumeWith(Result.m271569constructorimpl(a2));
                            break;
                        }
                    } else {
                        Closed lVar2 = (Closed) c;
                        if (lVar2.f173519a == null) {
                            Boolean a3 = C69089a.m265837a(false);
                            Result.Companion aVar2 = Result.Companion;
                            lVar.resumeWith(Result.m271569constructorimpl(a3));
                        } else {
                            Throwable d = lVar2.mo242843d();
                            Result.Companion aVar3 = Result.Companion;
                            lVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(d)));
                        }
                    }
                } else {
                    mo242807b().mo242787a(lVar, cVar3);
                    break;
                }
            }
            Object g = a.mo243073g();
            if (g == C69086a.m265828a()) {
                C69091e.m265847c(cVar);
            }
            return g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo242792a(Receive<? super E> rVar) {
        int a;
        LockFreeLinkedListNode k;
        if (mo242790a()) {
            LockFreeLinkedListHead k2 = mo242825k();
            do {
                k = k2.mo243018k();
                if (!(!(k instanceof Send))) {
                    return false;
                }
            } while (!k.mo243012a(rVar, k2));
        } else {
            LockFreeLinkedListHead k3 = mo242825k();
            Receive<? super E> rVar2 = rVar;
            C69375g gVar = new C69375g(rVar2, rVar2, this);
            do {
                LockFreeLinkedListNode k4 = k3.mo243018k();
                if (!(!(k4 instanceof Send))) {
                    return false;
                }
                a = k4.mo243009a(rVar2, k3, gVar);
                if (a != 1) {
                }
            } while (a != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo242789a(boolean z) {
        Closed<?> n = mo242828n();
        if (n != null) {
            Object a = InlineList.m267037a(null, 1, null);
            while (true) {
                LockFreeLinkedListNode k = n.mo243018k();
                if (k instanceof LockFreeLinkedListHead) {
                    if (a == null) {
                        return;
                    }
                    if (!(a instanceof ArrayList)) {
                        ((Send) a).mo242835a(n);
                        return;
                    } else if (a != null) {
                        ArrayList arrayList = (ArrayList) a;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((Send) arrayList.get(size)).mo242835a(n);
                        }
                        return;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
                    }
                } else if (ak.m266269a() && !(k instanceof Send)) {
                    throw new AssertionError();
                } else if (!k.cL_()) {
                    k.mo243020m();
                } else if (k != null) {
                    a = InlineList.m267038a(a, (Send) k);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator<E> cI_() {
        return new Itr(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: g */
    public final SelectClause1<E> mo242799g() {
        return new C69376h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final TryPollDesc<E> mo242798f() {
        return new TryPollDesc<>(mo242825k());
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public ReceiveOrClosed<E> mo242800h() {
        ReceiveOrClosed<E> h = super.mo242800h();
        if (h != null && !(h instanceof Closed)) {
            mo242802j();
        }
        return h;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$c */
    public static final class ReceiveHasNext<E> extends Receive<E> {

        /* renamed from: a */
        public final Itr<E> f173490a;

        /* renamed from: b */
        public final CancellableContinuation<Boolean> f173491b;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveHasNext@" + al.m266273a(this);
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: b */
        public void mo242811b(E e) {
            this.f173490a.mo242805a((Object) e);
            this.f173491b.mo243063a(C69574m.f173872a);
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: a */
        public void mo242810a(Closed<?> lVar) {
            Object obj;
            if (lVar.f173519a == null) {
                obj = CancellableContinuation.C69573a.m267142a(this.f173491b, false, null, 2, null);
            } else {
                CancellableContinuation<Boolean> kVar = this.f173491b;
                Throwable d = lVar.mo242843d();
                CancellableContinuation<Boolean> kVar2 = this.f173491b;
                if (ak.m266271c() && (kVar2 instanceof CoroutineStackFrame)) {
                    d = C69554aa.m266956a(d, (CoroutineStackFrame) kVar2);
                }
                obj = kVar.mo243062a(d);
            }
            if (obj != null) {
                this.f173490a.mo242805a(lVar);
                this.f173491b.mo243063a(obj);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.k<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveHasNext(Itr<E> aVar, CancellableContinuation<? super Boolean> kVar) {
            this.f173490a = aVar;
            this.f173491b = kVar;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: a */
        public Symbol mo242809a(E e, LockFreeLinkedListNode.PrepareOp cVar) {
            LockFreeLinkedListNode.AbstractAtomicDesc aVar;
            CancellableContinuation<Boolean> kVar = this.f173491b;
            boolean z = true;
            if (cVar != null) {
                aVar = cVar.f173842c;
            } else {
                aVar = null;
            }
            Object a = kVar.mo243061a((Boolean) true, (Object) aVar);
            if (a == null) {
                return null;
            }
            if (ak.m266269a()) {
                if (a != C69574m.f173872a) {
                    z = false;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.mo243030a();
            }
            return C69574m.f173872a;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0014\u0010\u0016\u001a\u00020\u00122\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J!\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010\u001fR3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$d */
    public static final class ReceiveSelect<R, E> extends Receive<E> implements DisposableHandle {

        /* renamed from: a */
        public final AbstractChannel<E> f173492a;

        /* renamed from: b */
        public final SelectInstance<R> f173493b;

        /* renamed from: c */
        public final Function2<Object, Continuation<? super R>, Object> f173494c;

        /* renamed from: d */
        public final int f173495d;

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: a */
        public void mo242687a() {
            if (cL_()) {
                this.f173492a.mo242802j();
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveSelect@" + al.m266273a(this) + '[' + this.f173493b + ",receiveMode=" + this.f173495d + ']';
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: b */
        public void mo242811b(E e) {
            Function2<Object, Continuation<? super R>, Object> kVar = this.f173494c;
            if (this.f173495d == 2) {
                ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
                e = (E) ValueOrClosed.m266784f(ValueOrClosed.m266783e(e));
            }
            C69078e.m265814a(kVar, e, this.f173493b.mo243116a());
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: a */
        public void mo242810a(Closed<?> lVar) {
            if (this.f173493b.mo243123g()) {
                int i = this.f173495d;
                if (i == 0) {
                    this.f173493b.mo243117a(lVar.mo242843d());
                } else if (i != 1) {
                    if (i == 2) {
                        Function2<Object, Continuation<? super R>, Object> kVar = this.f173494c;
                        ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
                        C69078e.m265814a(kVar, ValueOrClosed.m266784f(ValueOrClosed.m266783e(new ValueOrClosed.Closed(lVar.f173519a))), this.f173493b.mo243116a());
                    }
                } else if (lVar.f173519a == null) {
                    C69078e.m265814a(this.f173494c, null, this.f173493b.mo243116a());
                } else {
                    this.f173493b.mo243117a(lVar.mo242843d());
                }
            }
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: a */
        public Symbol mo242809a(E e, LockFreeLinkedListNode.PrepareOp cVar) {
            return (Symbol) this.f173493b.mo243115a(cVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.selects.d<? super R> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.k<java.lang.Object, ? super kotlin.coroutines.c<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveSelect(AbstractChannel<E> aVar, SelectInstance<? super R> dVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> kVar, int i) {
            this.f173492a = aVar;
            this.f173493b = dVar;
            this.f173494c = kVar;
            this.f173495d = i;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$e */
    public final class RemoveReceiveOnCancel extends CancelHandler {

        /* renamed from: b */
        private final Receive<?> f173497b;

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f173497b + ']';
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            mo242689a(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: a */
        public void mo242689a(Throwable th) {
            if (this.f173497b.cL_()) {
                AbstractChannel.this.mo242802j();
            }
        }

        public RemoveReceiveOnCancel(Receive<?> rVar) {
            this.f173497b = rVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo242797d() {
        if ((mo242825k().mo243017j() instanceof Send) || !mo242793b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$b */
    public static final class ReceiveElement<E> extends Receive<E> {

        /* renamed from: a */
        public final CancellableContinuation<Object> f173488a;

        /* renamed from: b */
        public final int f173489b;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveElement@" + al.m266273a(this) + "[receiveMode=" + this.f173489b + ']';
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: b */
        public void mo242811b(E e) {
            this.f173488a.mo243063a(C69574m.f173872a);
        }

        /* renamed from: a */
        public final Object mo242808a(E e) {
            if (this.f173489b != 2) {
                return e;
            }
            ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
            return ValueOrClosed.m266784f(ValueOrClosed.m266783e(e));
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: a */
        public void mo242810a(Closed<?> lVar) {
            if (this.f173489b == 1 && lVar.f173519a == null) {
                Result.Companion aVar = Result.Companion;
                this.f173488a.resumeWith(Result.m271569constructorimpl(null));
            } else if (this.f173489b == 2) {
                ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
                ValueOrClosed f = ValueOrClosed.m266784f(ValueOrClosed.m266783e(new ValueOrClosed.Closed(lVar.f173519a)));
                Result.Companion aVar2 = Result.Companion;
                this.f173488a.resumeWith(Result.m271569constructorimpl(f));
            } else {
                Throwable d = lVar.mo242843d();
                Result.Companion aVar3 = Result.Companion;
                this.f173488a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(d)));
            }
        }

        public ReceiveElement(CancellableContinuation<Object> kVar, int i) {
            this.f173488a = kVar;
            this.f173489b = i;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: a */
        public Symbol mo242809a(E e, LockFreeLinkedListNode.PrepareOp cVar) {
            LockFreeLinkedListNode.AbstractAtomicDesc aVar;
            boolean z;
            CancellableContinuation<Object> kVar = this.f173488a;
            Object a = mo242808a((Object) e);
            if (cVar != null) {
                aVar = cVar.f173842c;
            } else {
                aVar = null;
            }
            Object a2 = kVar.mo243061a(a, aVar);
            if (a2 == null) {
                return null;
            }
            if (ak.m266269a()) {
                if (a2 == C69574m.f173872a) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.mo243030a();
            }
            return C69574m.f173872a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo242795c() {
        Send o;
        Symbol a;
        boolean z;
        do {
            o = mo242829o();
            if (o == null) {
                return C69377b.f173503c;
            }
            a = o.mo242834a((LockFreeLinkedListNode.PrepareOp) null);
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
        o.mo242836b();
        return o.mo242833a();
    }

    /* access modifiers changed from: protected */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$f */
    public static final class TryPollDesc<E> extends LockFreeLinkedListNode.RemoveFirstDesc<Send> {
        public TryPollDesc(LockFreeLinkedListHead mVar) {
            super(mVar);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public Object mo242814a(LockFreeLinkedListNode oVar) {
            if (oVar instanceof Closed) {
                return oVar;
            }
            if (!(oVar instanceof Send)) {
                return C69377b.f173503c;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: a */
        public Object mo242813a(LockFreeLinkedListNode.PrepareOp cVar) {
            boolean z;
            LockFreeLinkedListNode oVar = cVar.f173840a;
            if (oVar != null) {
                Symbol a = ((Send) oVar).mo242834a(cVar);
                if (a == null) {
                    return C69571p.f173846a;
                }
                if (a == C69563c.f173820b) {
                    return C69563c.f173820b;
                }
                if (!ak.m266269a()) {
                    return null;
                }
                if (a == C69574m.f173872a) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
                throw new AssertionError();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JJ\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0001\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062$\u0010\u0007\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/AbstractChannel$onReceiveOrNull$1", "Lkotlinx/coroutines/selects/SelectClause1;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$h */
    public static final class C69376h implements SelectClause1<E> {

        /* renamed from: a */
        final /* synthetic */ AbstractChannel f173500a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69376h(AbstractChannel aVar) {
            this.f173500a = aVar;
        }

        @Override // kotlinx.coroutines.selects.SelectClause1
        /* renamed from: a */
        public <R> void mo242668a(SelectInstance<? super R> dVar, Function2<? super E, ? super Continuation<? super R>, ? extends Object> kVar) {
            AbstractChannel aVar = this.f173500a;
            if (kVar != null) {
                aVar.mo242788a(dVar, 1, kVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
        }
    }

    /* renamed from: a */
    public final boolean mo242791a(Throwable th) {
        boolean a_ = a_(th);
        mo242789a(a_);
        return a_;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.a$g */
    public static final class C69375g extends LockFreeLinkedListNode.CondAddOp {

        /* renamed from: a */
        final /* synthetic */ LockFreeLinkedListNode f173498a;

        /* renamed from: b */
        final /* synthetic */ AbstractChannel f173499b;

        /* renamed from: a */
        public Object mo242778a(LockFreeLinkedListNode oVar) {
            if (this.f173499b.mo242793b()) {
                return null;
            }
            return C69570n.m267043a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69375g(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2, AbstractChannel aVar) {
            super(oVar2);
            this.f173498a = oVar;
            this.f173499b = aVar;
        }
    }

    /* renamed from: b */
    public final boolean mo242794b(Receive<? super E> rVar) {
        boolean a = mo242792a((Receive) rVar);
        if (a) {
            mo242801i();
        }
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.coroutines.c<? super kotlinx.coroutines.channels.y<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: a */
    public final Object mo242784a(Continuation<? super ValueOrClosed<? extends E>> cVar) {
        Object obj;
        Object c = mo242795c();
        if (c == C69377b.f173503c) {
            return mo242783a(2, cVar);
        }
        if (c instanceof Closed) {
            ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
            obj = ValueOrClosed.m266783e(new ValueOrClosed.Closed(((Closed) c).f173519a));
        } else {
            ValueOrClosed.Companion bVar2 = ValueOrClosed.f173526a;
            obj = ValueOrClosed.m266783e(c);
        }
        return ValueOrClosed.m266784f(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo242785a(SelectInstance<?> dVar) {
        TryPollDesc<E> f = mo242798f();
        Object a = dVar.mo243114a(f);
        if (a != null) {
            return a;
        }
        ((Send) f.mo243032d()).mo242836b();
        return ((Send) f.mo243032d()).mo242833a();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: a */
    public final void mo242786a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException(al.m266275b(this) + " was cancelled");
        }
        mo242791a((Throwable) cancellationException);
    }

    /* renamed from: a */
    public final void mo242787a(CancellableContinuation<?> kVar, Receive<?> rVar) {
        kVar.mo243064a((Function1<? super Throwable, Unit>) new RemoveReceiveOnCancel(rVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.a<E> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.channels.a$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ <R> Object mo242783a(int i, Continuation<? super R> cVar) {
        CancellableContinuationImpl a = C69575n.m267177a(C69086a.m265825a(cVar));
        CancellableContinuationImpl lVar = a;
        if (lVar != null) {
            ReceiveElement bVar = new ReceiveElement(lVar, i);
            while (true) {
                ReceiveElement bVar2 = bVar;
                if (!mo242794b((Receive) bVar2)) {
                    Object c = mo242795c();
                    if (!(c instanceof Closed)) {
                        if (c != C69377b.f173503c) {
                            Object a2 = bVar.mo242808a(c);
                            Result.Companion aVar = Result.Companion;
                            lVar.resumeWith(Result.m271569constructorimpl(a2));
                            break;
                        }
                    } else {
                        bVar.mo242810a((Closed<?>) ((Closed) c));
                        break;
                    }
                } else {
                    mo242787a(lVar, bVar2);
                    break;
                }
            }
            Object g = a.mo243073g();
            if (g == C69086a.m265828a()) {
                C69091e.m265847c(cVar);
            }
            return g;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
    }

    /* renamed from: a */
    private final <R> boolean m266519a(SelectInstance<? super R> dVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> kVar, int i) {
        ReceiveSelect dVar2 = new ReceiveSelect(this, dVar, kVar, i);
        boolean b = mo242794b((Receive) dVar2);
        if (b) {
            dVar.mo243118a(dVar2);
        }
        return b;
    }

    /* renamed from: a */
    public final <R> void mo242788a(SelectInstance<? super R> dVar, int i, Function2<Object, ? super Continuation<? super R>, ? extends Object> kVar) {
        while (!dVar.mo243121e()) {
            if (!mo242797d()) {
                Object a = mo242785a((SelectInstance<?>) dVar);
                if (a != C69578e.m267291b()) {
                    if (!(a == C69377b.f173503c || a == C69563c.f173820b)) {
                        m266518a(kVar, dVar, i, a);
                    }
                } else {
                    return;
                }
            } else if (m266519a(dVar, kVar, i)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private final <R> void m266518a(Function2<Object, ? super Continuation<? super R>, ? extends Object> kVar, SelectInstance<? super R> dVar, int i, Object obj) {
        Object obj2;
        boolean z = obj instanceof Closed;
        if (z) {
            if (i == 0) {
                throw C69554aa.m266954a(((Closed) obj).mo242843d());
            } else if (i == 1) {
                Closed lVar = (Closed) obj;
                if (lVar.f173519a != null) {
                    throw C69554aa.m266954a(lVar.mo242843d());
                } else if (dVar.mo243123g()) {
                    C69359b.m266245a(kVar, (Object) null, dVar.mo243116a());
                }
            } else if (i == 2 && dVar.mo243123g()) {
                ValueOrClosed.Companion bVar = ValueOrClosed.f173526a;
                C69359b.m266245a(kVar, ValueOrClosed.m266784f(ValueOrClosed.m266783e(new ValueOrClosed.Closed(((Closed) obj).f173519a))), dVar.mo243116a());
            }
        } else if (i == 2) {
            ValueOrClosed.Companion bVar2 = ValueOrClosed.f173526a;
            if (z) {
                obj2 = ValueOrClosed.m266783e(new ValueOrClosed.Closed(((Closed) obj).f173519a));
            } else {
                obj2 = ValueOrClosed.m266783e(obj);
            }
            C69359b.m266245a(kVar, ValueOrClosed.m266784f(obj2), dVar.mo243116a());
        } else {
            C69359b.m266245a(kVar, obj, dVar.mo243116a());
        }
    }
}
