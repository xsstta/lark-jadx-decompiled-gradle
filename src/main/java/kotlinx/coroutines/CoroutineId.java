package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.af */
public final class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    /* renamed from: a */
    public static final Key f173399a = new Key(null);

    /* renamed from: b */
    private final long f173400b;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CoroutineId) && this.f173400b == ((CoroutineId) obj).f173400b;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f173400b;
        return (int) (j ^ (j >>> 32));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.af$a */
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
        private Key() {
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo242643a() {
        return this.f173400b;
    }

    public String toString() {
        return "CoroutineId(" + this.f173400b + ')';
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext, kotlin.coroutines.AbstractCoroutineContextElement
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> cVar) {
        return (E) ThreadContextElement.C69385a.m266799a(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext, kotlin.coroutines.AbstractCoroutineContextElement
    public CoroutineContext minusKey(CoroutineContext.Key<?> cVar) {
        return ThreadContextElement.C69385a.m266801b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext, kotlin.coroutines.AbstractCoroutineContextElement
    public CoroutineContext plus(CoroutineContext fVar) {
        return ThreadContextElement.C69385a.m266800a(this, fVar);
    }

    public CoroutineId(long j) {
        super(f173399a);
        this.f173400b = j;
    }

    /* renamed from: a */
    public String mo242647b(CoroutineContext fVar) {
        String str;
        CoroutineName agVar = (CoroutineName) fVar.get(CoroutineName.f173401a);
        if (agVar == null || (str = agVar.mo242651a()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) name, " @", 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0) {
            lastIndexOf$default = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + lastIndexOf$default + 10);
        if (name != null) {
            String substring = name.substring(0, lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(this.f173400b);
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // kotlin.coroutines.CoroutineContext, kotlin.coroutines.AbstractCoroutineContextElement
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
        return (R) ThreadContextElement.C69385a.m266798a(this, r, kVar);
    }

    /* renamed from: a */
    public void mo242645a(CoroutineContext fVar, String str) {
        Thread.currentThread().setName(str);
    }
}
