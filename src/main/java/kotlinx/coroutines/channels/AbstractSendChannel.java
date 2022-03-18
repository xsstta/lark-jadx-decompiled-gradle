package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69387db;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.C69575n;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.al;
import kotlinx.coroutines.internal.C69570n;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000004:\u0004abcdB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010#\u001a\u00020\u001b2\u0018\u0010\"\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u001b0 j\u0002`!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u00002\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101JX\u00107\u001a\u00020\u001b\"\u0004\b\u0001\u001022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\f\u001a\u00028\u00002(\u00106\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000105\u0012\u0006\u0012\u0004\u0018\u00010\u001603H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u00109J\u001d\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010:2\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b=\u00109J\u001b\u0010?\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b?\u00109J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010:H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0014H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ#\u0010G\u001a\u00020\u001b*\u0006\u0012\u0002\b\u0003052\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020D8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\bI\u0010FR\u001c\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010O\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0016\u0010P\u001a\u00020\u00068$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00068$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bR\u0010QR\u0013\u0010S\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0016\u0010T\u001a\u00020\u00068V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bT\u0010QR\u0016\u0010U\u001a\u00020\u00068D@\u0004X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR%\u0010Y\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000040V8F@\u0006¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001c\u0010[\u001a\u00020Z8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020D8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b_\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "<init>", "()V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendFair$kotlinx_coroutines_core", "sendFair", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFull", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.c */
public abstract class AbstractSendChannel<E> implements SendChannel<E> {

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f173506c = AtomicReferenceFieldUpdater.newUpdater(AbstractSendChannel.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    private final LockFreeLinkedListHead f173507b = new LockFreeLinkedListHead();
    private volatile Object onCloseHandler = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo242820a(LockFreeLinkedListNode oVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo242826l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo242827m();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo242831q() {
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.c$a */
    public static final class SendBuffered<E> extends Send {

        /* renamed from: a */
        public final E f173508a;

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: a */
        public void mo242835a(Closed<?> lVar) {
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: b */
        public void mo242836b() {
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: a */
        public Object mo242833a() {
            return this.f173508a;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "SendBuffered@" + al.m266273a(this) + '(' + ((Object) this.f173508a) + ')';
        }

        public SendBuffered(E e) {
            this.f173508a = e;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: a */
        public Symbol mo242834a(LockFreeLinkedListNode.PrepareOp cVar) {
            Symbol abVar = C69574m.f173872a;
            if (cVar != null) {
                cVar.mo243030a();
            }
            return abVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final LockFreeLinkedListHead mo242825k() {
        return this.f173507b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Closed<?> mo242828n() {
        LockFreeLinkedListNode k = this.f173507b.mo243018k();
        if (!(k instanceof Closed)) {
            k = null;
        }
        Closed<?> lVar = (Closed) k;
        if (lVar == null) {
            return null;
        }
        m266564a(lVar);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo242830p() {
        if ((this.f173507b.mo243017j() instanceof ReceiveOrClosed) || !mo242827m()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final int mo242793b() {
        LockFreeLinkedListHead mVar = this.f173507b;
        Object i = mVar.mo243016i();
        if (i != null) {
            int i2 = 0;
            for (LockFreeLinkedListNode oVar = (LockFreeLinkedListNode) i; !Intrinsics.areEqual(oVar, mVar); oVar = oVar.mo243017j()) {
                if (oVar instanceof LockFreeLinkedListNode) {
                    i2++;
                }
            }
            return i2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ReceiveOrClosed<E> mo242800h() {
        LockFreeLinkedListNode oVar;
        LockFreeLinkedListNode l;
        LockFreeLinkedListHead mVar = this.f173507b;
        while (true) {
            Object i = mVar.mo243016i();
            if (i != null) {
                oVar = (LockFreeLinkedListNode) i;
                if (oVar != mVar && (oVar instanceof ReceiveOrClosed)) {
                    if (((((ReceiveOrClosed) oVar) instanceof Closed) && !oVar.cK_()) || (l = oVar.mo243019l()) == null) {
                        break;
                    }
                    l.mo243021n();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        oVar = null;
        return (ReceiveOrClosed) oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Send mo242829o() {
        LockFreeLinkedListNode oVar;
        LockFreeLinkedListNode l;
        LockFreeLinkedListHead mVar = this.f173507b;
        while (true) {
            Object i = mVar.mo243016i();
            if (i != null) {
                oVar = (LockFreeLinkedListNode) i;
                if (oVar != mVar && (oVar instanceof Send)) {
                    if (((((Send) oVar) instanceof Closed) && !oVar.cK_()) || (l = oVar.mo243019l()) == null) {
                        break;
                    }
                    l.mo243021n();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        oVar = null;
        return (Send) oVar;
    }

    public String toString() {
        return al.m266275b(this) + '@' + al.m266273a(this) + '{' + mo242790a() + '}' + mo242831q();
    }

    /* renamed from: a */
    private final String mo242790a() {
        String str;
        LockFreeLinkedListNode j = this.f173507b.mo243017j();
        if (j == this.f173507b) {
            return "EmptyQueue";
        }
        if (j instanceof Closed) {
            str = j.toString();
        } else if (j instanceof Receive) {
            str = "ReceiveQueued";
        } else if (j instanceof Send) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + j;
        }
        LockFreeLinkedListNode k = this.f173507b.mo243018k();
        if (k == j) {
            return str;
        }
        String str2 = str + ",queueSize=" + mo242793b();
        if (!(k instanceof Closed)) {
            return str2;
        }
        return str2 + ",closedForSend=" + k;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.channels.c$b */
    public static final class C69378b extends LockFreeLinkedListNode.CondAddOp {

        /* renamed from: a */
        final /* synthetic */ LockFreeLinkedListNode f173509a;

        /* renamed from: b */
        final /* synthetic */ AbstractSendChannel f173510b;

        /* renamed from: a */
        public Object mo242778a(LockFreeLinkedListNode oVar) {
            if (this.f173510b.mo242827m()) {
                return null;
            }
            return C69570n.m267043a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69378b(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2, AbstractSendChannel cVar) {
            super(oVar2);
            this.f173509a = oVar;
            this.f173510b = cVar;
        }
    }

    /* renamed from: a */
    private final void mo242791a(Throwable th) {
        Object obj = this.onCloseHandler;
        if (obj != null && obj != C69377b.f173505e && f173506c.compareAndSet(this, obj, C69377b.f173505e)) {
            ((Function1) C69121n.m265985b(obj, 1)).invoke(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ReceiveOrClosed<?> mo242823b(E e) {
        LockFreeLinkedListNode k;
        LockFreeLinkedListHead mVar = this.f173507b;
        SendBuffered aVar = new SendBuffered(e);
        do {
            k = mVar.mo243018k();
            if (k instanceof ReceiveOrClosed) {
                return (ReceiveOrClosed) k;
            }
        } while (!k.mo243012a(aVar, mVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo242816a(E e) {
        ReceiveOrClosed<E> h;
        Symbol a;
        boolean z;
        do {
            h = mo242800h();
            if (h == null) {
                return C69377b.f173502b;
            }
            a = h.mo242809a(e, null);
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
        h.mo242811b(e);
        return h.mo242845f();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean a_(Throwable th) {
        boolean z;
        Closed<?> lVar = new Closed<>(th);
        LockFreeLinkedListHead mVar = this.f173507b;
        while (true) {
            LockFreeLinkedListNode k = mVar.mo243018k();
            z = true;
            if (!(k instanceof Closed)) {
                if (k.mo243012a(lVar, mVar)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            LockFreeLinkedListNode k2 = this.f173507b.mo243018k();
            if (k2 != null) {
                lVar = (Closed) k2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            }
        }
        m266564a(lVar);
        if (z) {
            mo242791a(th);
        }
        return z;
    }

    /* renamed from: a */
    private final void m266564a(Closed<?> lVar) {
        Object a = InlineList.m267037a(null, 1, null);
        while (true) {
            LockFreeLinkedListNode k = lVar.mo243018k();
            if (!(k instanceof Receive)) {
                k = null;
            }
            Receive rVar = (Receive) k;
            if (rVar == null) {
                break;
            } else if (!rVar.cL_()) {
                rVar.mo243020m();
            } else {
                a = InlineList.m267038a(a, rVar);
            }
        }
        if (a != null) {
            if (!(a instanceof ArrayList)) {
                ((Receive) a).mo242810a(lVar);
            } else if (a != null) {
                ArrayList arrayList = (ArrayList) a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Receive) arrayList.get(size)).mo242810a(lVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
        mo242820a((LockFreeLinkedListNode) lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo242818a(Send vVar) {
        boolean z;
        LockFreeLinkedListNode k;
        if (mo242826l()) {
            LockFreeLinkedListHead mVar = this.f173507b;
            do {
                k = mVar.mo243018k();
                if (k instanceof ReceiveOrClosed) {
                    return k;
                }
            } while (!k.mo243012a(vVar, mVar));
            return null;
        }
        LockFreeLinkedListHead mVar2 = this.f173507b;
        Send vVar2 = vVar;
        C69378b bVar = new C69378b(vVar2, vVar2, this);
        while (true) {
            LockFreeLinkedListNode k2 = mVar2.mo243018k();
            if (!(k2 instanceof ReceiveOrClosed)) {
                int a = k2.mo243009a(vVar2, mVar2, bVar);
                z = true;
                if (a != 1) {
                    if (a == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return k2;
            }
        }
        if (!z) {
            return C69377b.f173504d;
        }
        return null;
    }

    /* renamed from: b */
    public final Object mo242822b(E e, Continuation<? super Unit> cVar) {
        if (mo242816a((Object) e) == C69377b.f173501a) {
            Object a = C69387db.m266822a(cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
        Object c = mo242824c(e, cVar);
        if (c == C69086a.m265828a()) {
            return c;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo242824c(E e, Continuation<? super Unit> cVar) {
        CancellableContinuationImpl a = C69575n.m267177a(C69086a.m265825a(cVar));
        CancellableContinuationImpl lVar = a;
        while (true) {
            if (mo242830p()) {
                SendElement xVar = new SendElement(e, lVar);
                Object a2 = mo242818a((Send) xVar);
                if (a2 == null) {
                    C69575n.m267179a(lVar, xVar);
                    break;
                } else if (a2 instanceof Closed) {
                    mo242819a(lVar, (Closed) a2);
                    break;
                } else if (a2 != C69377b.f173504d && !(a2 instanceof Receive)) {
                    throw new IllegalStateException(("enqueueSend returned " + a2).toString());
                }
            }
            Object a3 = mo242816a((Object) e);
            if (a3 == C69377b.f173501a) {
                Unit unit = Unit.INSTANCE;
                Result.Companion aVar = Result.Companion;
                lVar.resumeWith(Result.m271569constructorimpl(unit));
                break;
            } else if (a3 != C69377b.f173502b) {
                if (a3 instanceof Closed) {
                    mo242819a(lVar, (Closed) a3);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + a3).toString());
                }
            }
        }
        Object g = a.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: a */
    public final Object mo242817a(E e, Continuation<? super Unit> cVar) {
        if (mo242816a((Object) e) == C69377b.f173501a) {
            return Unit.INSTANCE;
        }
        Object c = mo242824c(e, cVar);
        if (c == C69086a.m265828a()) {
            return c;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo242819a(Continuation<?> cVar, Closed<?> lVar) {
        m266564a(lVar);
        Throwable c = lVar.mo242842c();
        Result.Companion aVar = Result.Companion;
        cVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(c)));
    }
}
