package kotlin.reflect;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", ShareHitPoint.f121869d, "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlin.reflect.i */
public final class KTypeProjection {

    /* renamed from: a */
    public static final KTypeProjection f173260a = new KTypeProjection(null, null);

    /* renamed from: b */
    public static final Companion f173261b = new Companion(null);

    /* renamed from: c */
    private final KVariance f173262c;

    /* renamed from: d */
    private final KType f173263d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection iVar = (KTypeProjection) obj;
        return Intrinsics.areEqual(this.f173262c, iVar.f173262c) && Intrinsics.areEqual(this.f173263d, iVar.f173263d);
    }

    public int hashCode() {
        KVariance kVariance = this.f173262c;
        int i = 0;
        int hashCode = (kVariance != null ? kVariance.hashCode() : 0) * 31;
        KType gVar = this.f173263d;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "KTypeProjection(variance=" + this.f173262c + ", type=" + this.f173263d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "contravariant", ShareHitPoint.f121869d, "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.reflect.i$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final KTypeProjection mo239439a() {
            return KTypeProjection.f173260a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final KTypeProjection mo239440a(KType gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, ShareHitPoint.f121869d);
            return new KTypeProjection(KVariance.INVARIANT, gVar);
        }

        /* renamed from: b */
        public final KTypeProjection mo239441b(KType gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, ShareHitPoint.f121869d);
            return new KTypeProjection(KVariance.IN, gVar);
        }

        /* renamed from: c */
        public final KTypeProjection mo239442c(KType gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, ShareHitPoint.f121869d);
            return new KTypeProjection(KVariance.OUT, gVar);
        }
    }

    /* renamed from: a */
    public final KVariance mo239434a() {
        return this.f173262c;
    }

    /* renamed from: b */
    public final KType mo239435b() {
        return this.f173263d;
    }

    public KTypeProjection(KVariance kVariance, KType gVar) {
        this.f173262c = kVariance;
        this.f173263d = gVar;
    }
}
