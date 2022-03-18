package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ak;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J$\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\fH\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "forEachReversed", "", "action", "Lkotlin/Function1;", "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hashCode", "", "plus", "element", "plus-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.l */
public final class InlineList<E> {

    /* renamed from: a */
    private final Object f173832a;

    /* renamed from: a */
    public static Object m267036a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static String m267039b(Object obj) {
        return "InlineList(holder=" + obj + ")";
    }

    /* renamed from: b */
    public static boolean m267040b(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && Intrinsics.areEqual(obj, ((InlineList) obj2).mo243003a());
    }

    /* renamed from: c */
    public static int m267041c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo243003a() {
        return this.f173832a;
    }

    public int hashCode() {
        return m267041c(this.f173832a);
    }

    public String toString() {
        return m267039b(this.f173832a);
    }

    public boolean equals(Object obj) {
        return m267040b(this.f173832a, obj);
    }

    /* renamed from: a */
    public static final Object m267038a(Object obj, E e) {
        if (ak.m266269a() && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return m267036a(e);
        } else {
            if (!(obj instanceof ArrayList)) {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(e);
                return m267036a(arrayList);
            } else if (obj != null) {
                ((ArrayList) obj).add(e);
                return m267036a(obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m267037a(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m267036a(obj);
    }
}
