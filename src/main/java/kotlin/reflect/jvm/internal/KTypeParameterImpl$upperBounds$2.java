package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ KTypeParameterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.this$0 = kTypeParameterImpl;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.KTypeImpl>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KTypeImpl> invoke() {
        List<KotlinType> upperBounds = this.this$0.getDescriptor().getUpperBounds();
        Intrinsics.checkExpressionValueIsNotNull(upperBounds, "descriptor.upperBounds");
        List<KotlinType> list = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            Intrinsics.checkExpressionValueIsNotNull(t, "kotlinType");
            arrayList.add(new KTypeImpl(t, new KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(this)));
        }
        return arrayList;
    }
}
