package kotlinx.coroutines.channels;

import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.C69574m;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ak;
import kotlinx.coroutines.al;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0014\u0010\u000b\u001a\u00020\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/SendElement;", "Lkotlinx/coroutines/channels/Send;", "pollResult", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.channels.x */
public final class SendElement extends Send {

    /* renamed from: a */
    public final CancellableContinuation<Unit> f173524a;

    /* renamed from: b */
    private final Object f173525b;

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: a */
    public Object mo242833a() {
        return this.f173525b;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: b */
    public void mo242836b() {
        this.f173524a.mo243063a(C69574m.f173872a);
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return "SendElement@" + al.m266273a(this) + '(' + mo242833a() + ')';
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: a */
    public void mo242835a(Closed<?> lVar) {
        Throwable c = lVar.mo242842c();
        Result.Companion aVar = Result.Companion;
        this.f173524a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a(c)));
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: a */
    public Symbol mo242834a(LockFreeLinkedListNode.PrepareOp cVar) {
        LockFreeLinkedListNode.AbstractAtomicDesc aVar;
        boolean z;
        CancellableContinuation<Unit> kVar = this.f173524a;
        Unit unit = Unit.INSTANCE;
        if (cVar != null) {
            aVar = cVar.f173842c;
        } else {
            aVar = null;
        }
        Object a = kVar.mo243061a(unit, aVar);
        if (a == null) {
            return null;
        }
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
        if (cVar != null) {
            cVar.mo243030a();
        }
        return C69574m.f173872a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.k<? super kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public SendElement(Object obj, CancellableContinuation<? super Unit> kVar) {
        this.f173525b = obj;
        this.f173524a = kVar;
    }
}
