package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class MappingUtilKt {
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(classDescriptor, "from");
        Intrinsics.checkParameterIsNotNull(classDescriptor2, "to");
        if (classDescriptor.getDeclaredTypeParameters().size() == classDescriptor2.getDeclaredTypeParameters().size()) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
            List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "from.declaredTypeParameters");
            List<TypeParameterDescriptor> list = declaredTypeParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTypeConstructor());
            }
            ArrayList arrayList2 = arrayList;
            List<TypeParameterDescriptor> declaredTypeParameters2 = classDescriptor2.getDeclaredTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters2, "to.declaredTypeParameters");
            List<TypeParameterDescriptor> list2 = declaredTypeParameters2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                SimpleType defaultType = t.getDefaultType();
                Intrinsics.checkExpressionValueIsNotNull(defaultType, "it.defaultType");
                arrayList3.add(TypeUtilsKt.asTypeProjection(defaultType));
            }
            return TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, MapsKt.toMap(CollectionsKt.zip(arrayList2, arrayList3)), false, 2, null);
        }
        throw new AssertionError(classDescriptor + " and " + classDescriptor2 + " should have same number of type parameters, " + "but " + classDescriptor.getDeclaredTypeParameters().size() + " / " + classDescriptor2.getDeclaredTypeParameters().size() + " found");
    }
}
