package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KTypeImpl$arguments$2(KTypeImpl kTypeImpl) {
        super(0);
        this.this$0 = kTypeImpl;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.i>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KTypeProjection> invoke() {
        KTypeProjection iVar;
        List<TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this));
        List<TypeProjection> list = arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (t2.isStarProjection()) {
                iVar = KTypeProjection.f173261b.mo239439a();
            } else {
                KotlinType type = t2.getType();
                Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
                KTypeImpl kTypeImpl = new KTypeImpl(type, new KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(i, this, lazy, null));
                int i3 = KTypeImpl.WhenMappings.$EnumSwitchMapping$0[t2.getProjectionKind().ordinal()];
                if (i3 == 1) {
                    iVar = KTypeProjection.f173261b.mo239440a(kTypeImpl);
                } else if (i3 == 2) {
                    iVar = KTypeProjection.f173261b.mo239441b(kTypeImpl);
                } else if (i3 == 3) {
                    iVar = KTypeProjection.f173261b.mo239442c(kTypeImpl);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(iVar);
            i = i2;
        }
        return arrayList;
    }
}
