package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
public final class CombinedContext implements Serializable, CoroutineContext {
    private final CoroutineContext.Element element;
    private final CoroutineContext left;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.CombinedContext$a */
    private static final class Serialized implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: kotlin.coroutines.CombinedContext$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final CoroutineContext[] getElements() {
            return this.elements;
        }

        private final Object readResolve() {
            CoroutineContext[] fVarArr = this.elements;
            CoroutineContext fVar = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext fVar2 : fVarArr) {
                fVar = fVar.plus(fVar2);
            }
            return fVar;
        }

        public Serialized(CoroutineContext[] fVarArr) {
            Intrinsics.checkParameterIsNotNull(fVarArr, "elements");
            this.elements = fVarArr;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    private final int size() {
        CombinedContext combinedContext = this;
        int i = 2;
        while (true) {
            CoroutineContext fVar = combinedContext.left;
            if (!(fVar instanceof CombinedContext)) {
                fVar = null;
            }
            combinedContext = (CombinedContext) fVar;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int size = size();
        CoroutineContext[] fVarArr = new CoroutineContext[size];
        Ref.IntRef intRef = new Ref.IntRef();
        boolean z = false;
        intRef.element = 0;
        fold(Unit.INSTANCE, new C69076c(fVarArr, intRef));
        if (intRef.element == size) {
            z = true;
        }
        if (z) {
            return new Serialized(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        return "[" + ((String) fold("", C69075b.INSTANCE)) + "]";
    }

    private final boolean contains(CoroutineContext.Element bVar) {
        return Intrinsics.areEqual(get(bVar.getKey()), bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "context");
        return CoroutineContext.C69083a.m265819a(this, fVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.size() != size() || !combinedContext.containsAll(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        CoroutineContext fVar = this;
        while (true) {
            CombinedContext combinedContext = (CombinedContext) fVar;
            E e = (E) combinedContext.element.get(cVar);
            if (e != null) {
                return e;
            }
            fVar = combinedContext.left;
            if (!(fVar instanceof CombinedContext)) {
                return (E) fVar.get(cVar);
            }
        }
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            CoroutineContext fVar = combinedContext.left;
            if (fVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) fVar;
            } else if (fVar != null) {
                return contains((CoroutineContext.Element) fVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return this.element;
        }
        return new CombinedContext(minusKey, this.element);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.CombinedContext$c */
    static final class C69076c extends Lambda implements Function2<Unit, CoroutineContext.Element, Unit> {
        final /* synthetic */ CoroutineContext[] $elements;
        final /* synthetic */ Ref.IntRef $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69076c(CoroutineContext[] fVarArr, Ref.IntRef intRef) {
            super(2);
            this.$elements = fVarArr;
            this.$index = intRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element bVar) {
            invoke(unit, bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Unit unit, CoroutineContext.Element bVar) {
            Intrinsics.checkParameterIsNotNull(unit, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            CoroutineContext[] fVarArr = this.$elements;
            Ref.IntRef intRef = this.$index;
            int i = intRef.element;
            intRef.element = i + 1;
            fVarArr[i] = bVar;
        }
    }

    public CombinedContext(CoroutineContext fVar, CoroutineContext.Element bVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "left");
        Intrinsics.checkParameterIsNotNull(bVar, "element");
        this.left = fVar;
        this.element = bVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        return (R) kVar.invoke((Object) this.left.fold(r, kVar), this.element);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.coroutines.CombinedContext$b */
    static final class C69075b extends Lambda implements Function2<String, CoroutineContext.Element, String> {
        public static final C69075b INSTANCE = new C69075b();

        C69075b() {
            super(2);
        }

        public final String invoke(String str, CoroutineContext.Element bVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "acc");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }
}
