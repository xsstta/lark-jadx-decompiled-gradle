package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.jvm.internal.o */
public final class TypeReference implements KType {

    /* renamed from: a */
    private final KClassifier f173216a;

    /* renamed from: b */
    private final List<KTypeProjection> f173217b;

    /* renamed from: c */
    private final boolean f173218c;

    /* renamed from: a */
    public List<KTypeProjection> mo239356a() {
        return this.f173217b;
    }

    /* renamed from: b */
    public boolean mo239357b() {
        return this.f173218c;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f173216a;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public String toString() {
        return m265997c() + " (Kotlin reflection is not available)";
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + mo239356a().hashCode()) * 31) + Boolean.valueOf(mo239357b()).hashCode();
    }

    /* renamed from: c */
    private final String m265997c() {
        String str;
        String str2;
        KClassifier classifier = getClassifier();
        Class<?> cls = null;
        if (!(classifier instanceof KClass)) {
            classifier = null;
        }
        KClass kClass = (KClass) classifier;
        if (kClass != null) {
            cls = C69113a.m265954a(kClass);
        }
        if (cls == null) {
            str = getClassifier().toString();
        } else if (cls.isArray()) {
            str = m265996a(cls);
        } else {
            str = cls.getName();
        }
        String str3 = "";
        if (mo239356a().isEmpty()) {
            str2 = str3;
        } else {
            str2 = CollectionsKt.joinToString$default(mo239356a(), ", ", "<", ">", 0, null, new C69122a(this), 24, null);
        }
        if (mo239357b()) {
            str3 = "?";
        }
        return str + str2 + str3;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KTypeProjection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.jvm.internal.o$a */
    public static final class C69122a extends Lambda implements Function1<KTypeProjection, String> {
        final /* synthetic */ TypeReference this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69122a(TypeReference oVar) {
            super(1);
            this.this$0 = oVar;
        }

        public final String invoke(KTypeProjection iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "it");
            return this.this$0.mo239355a(iVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference oVar = (TypeReference) obj;
            if (!Intrinsics.areEqual(getClassifier(), oVar.getClassifier()) || !Intrinsics.areEqual(mo239356a(), oVar.mo239356a()) || mo239357b() != oVar.mo239357b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String m265996a(Class<?> cls) {
        if (Intrinsics.areEqual(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.areEqual(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.areEqual(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.areEqual(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.areEqual(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.areEqual(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.areEqual(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        if (Intrinsics.areEqual(cls, double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    /* renamed from: a */
    public final String mo239355a(KTypeProjection iVar) {
        String str;
        if (iVar.mo239434a() == null) {
            return "*";
        }
        KType b = iVar.mo239435b();
        if (!(b instanceof TypeReference)) {
            b = null;
        }
        TypeReference oVar = (TypeReference) b;
        if (oVar == null || (str = oVar.m265997c()) == null) {
            str = String.valueOf(iVar.mo239435b());
        }
        KVariance a = iVar.mo239434a();
        if (a != null) {
            int i = C69123p.f173219a[a.ordinal()];
            if (i == 1) {
                return str;
            }
            if (i == 2) {
                return "in " + str;
            } else if (i == 3) {
                return "out " + str;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public TypeReference(KClassifier aVar, List<KTypeProjection> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "classifier");
        Intrinsics.checkParameterIsNotNull(list, "arguments");
        this.f173216a = aVar;
        this.f173217b = list;
        this.f173218c = z;
    }
}
