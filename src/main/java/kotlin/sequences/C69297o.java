package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.sequences.o */
class C69297o extends C69296n {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.o$c */
    public static final class C69300c extends Lambda implements Function1<T, T> {
        public static final C69300c INSTANCE = new C69300c();

        C69300c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.o$a */
    public static final class C69298a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f173316a;

        @Override // kotlin.sequences.Sequence
        /* renamed from: a */
        public Iterator<T> mo4717a() {
            return this.f173316a;
        }

        public C69298a(Iterator it) {
            this.f173316a = it;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.o$e */
    static final class C69302e extends Lambda implements Function0<T> {
        final /* synthetic */ Object $seed;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69302e(Object obj) {
            super(0);
            this.$seed = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.$seed;
        }
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266114a() {
        return EmptySequence.f173287a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.o$b */
    static final class C69299b extends Lambda implements Function1<Sequence<? extends T>, Iterator<? extends T>> {
        public static final C69299b INSTANCE = new C69299b();

        C69299b() {
            super(1);
        }

        /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Iterator<? extends T>, java.util.Iterator<T> */
        public final Iterator<T> invoke(Sequence<? extends T> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "it");
            return (Iterator<? extends T>) iVar.mo4717a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.sequences.o$d */
    static final class C69301d extends Lambda implements Function1<T, T> {
        final /* synthetic */ Function0 $nextFunction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69301d(Function0 function0) {
            super(1);
            this.$nextFunction = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            Intrinsics.checkParameterIsNotNull(t, "it");
            return (T) this.$nextFunction.invoke();
        }
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266119a(Sequence<? extends Sequence<? extends T>> iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$flatten");
        return m266120a((Sequence) iVar, (Function1) C69299b.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.sequences.i<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> Sequence<T> m266122b(Sequence<? extends T> iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$constrainOnce");
        if (iVar instanceof ConstrainedOnceSequence) {
            return iVar;
        }
        return new ConstrainedOnceSequence(iVar);
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266116a(Iterator<? extends T> it) {
        Intrinsics.checkParameterIsNotNull(it, "$this$asSequence");
        return C69294l.m266122b(new C69298a(it));
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266117a(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "nextFunction");
        return C69294l.m266122b(new GeneratorSequence(function0, new C69301d(function0)));
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266121a(T... tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C69294l.m266114a();
        }
        return C69043h.m265792q(tArr);
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266115a(T t, Function1<? super T, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        if (t == null) {
            return EmptySequence.f173287a;
        }
        return new GeneratorSequence(new C69302e(t), function1);
    }

    /* renamed from: a */
    public static final <T> Sequence<T> m266118a(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "seedFunction");
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        return new GeneratorSequence(function0, function1);
    }

    /* renamed from: a */
    private static final <T, R> Sequence<R> m266120a(Sequence<? extends T> iVar, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (iVar instanceof TransformingSequence) {
            return ((TransformingSequence) iVar).mo242539a(function1);
        }
        return new FlatteningSequence(iVar, C69300c.INSTANCE, function1);
    }
}
