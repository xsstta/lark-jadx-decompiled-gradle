package kotlinx.coroutines.debug.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010\u001c\u001a\u00020\nH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\n2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0000¢\u0006\u0002\b!J%\u0010\"\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u00110#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HPø\u0001\u0000¢\u0006\u0002\u0010$R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;J)V", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "lastObservedFrame", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState", "()Ljava/lang/String;", "copy", "lastObservedStackTrace", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.debug.internal.a */
public final class DebugCoroutineInfo {

    /* renamed from: a */
    public Thread f173549a;

    /* renamed from: b */
    public CoroutineStackFrame f173550b;

    /* renamed from: c */
    public final long f173551c;

    /* renamed from: d */
    private String f173552d;

    /* renamed from: e */
    private final CoroutineContext f173553e;

    /* renamed from: a */
    public final String mo242880a() {
        return this.f173552d;
    }

    /* renamed from: c */
    public final CoroutineContext mo242882c() {
        return this.f173553e;
    }

    /* renamed from: b */
    public final List<StackTraceElement> mo242881b() {
        CoroutineStackFrame cVar = this.f173550b;
        if (cVar == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (cVar != null) {
            StackTraceElement stackTraceElement = cVar.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            cVar = cVar.getCallerFrame();
        }
        return arrayList;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + mo242880a() + ",context=" + this.f173553e + ')';
    }
}
