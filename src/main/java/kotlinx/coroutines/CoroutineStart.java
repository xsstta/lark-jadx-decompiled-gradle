package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C69078e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.p3475a.C69358a;
import kotlinx.coroutines.p3475a.C69359b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\\\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <T> void invoke(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> cVar) {
        int i = aj.f173403a[ordinal()];
        if (i == 1) {
            C69358a.m266241a(function1, cVar);
        } else if (i == 2) {
            C69078e.m265813a(function1, cVar);
        } else if (i == 3) {
            C69359b.m266244a(function1, cVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final <R, T> void invoke(Function2<? super R, ? super Continuation<? super T>, ? extends Object> kVar, R r, Continuation<? super T> cVar) {
        int i = aj.f173404b[ordinal()];
        if (i == 1) {
            C69358a.m266242a(kVar, r, cVar);
        } else if (i == 2) {
            C69078e.m265814a(kVar, r, cVar);
        } else if (i == 3) {
            C69359b.m266246b(kVar, r, cVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
