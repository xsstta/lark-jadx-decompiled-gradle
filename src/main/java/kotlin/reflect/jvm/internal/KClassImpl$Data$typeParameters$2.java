package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "T", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class KClassImpl$Data$typeParameters$2 extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {
    final /* synthetic */ KClassImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$typeParameters$2(KClassImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KTypeParameterImpl> invoke() {
        List<TypeParameterDescriptor> declaredTypeParameters = this.this$0.getDescriptor().getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "descriptor.declaredTypeParameters");
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeParameterImpl(it.next()));
        }
        return arrayList;
    }
}
