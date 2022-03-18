package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class UtilKt {
    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "$this$getParentJavaStaticClassScope");
        ClassDescriptor superClassNotAny = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        LazyJavaStaticClassScope lazyJavaStaticClassScope = null;
        if (superClassNotAny == null) {
            return null;
        }
        MemberScope staticScope = superClassNotAny.getStaticScope();
        if (staticScope instanceof LazyJavaStaticClassScope) {
            lazyJavaStaticClassScope = staticScope;
        }
        LazyJavaStaticClassScope lazyJavaStaticClassScope2 = lazyJavaStaticClassScope;
        if (lazyJavaStaticClassScope2 != null) {
            return lazyJavaStaticClassScope2;
        }
        return getParentJavaStaticClassScope(superClassNotAny);
    }

    public static final AnnotationDefaultValue getDefaultValueFromAnnotation(ValueParameterDescriptor valueParameterDescriptor) {
        ConstantValue<?> firstArgument;
        String str;
        Intrinsics.checkParameterIsNotNull(valueParameterDescriptor, "$this$getDefaultValueFromAnnotation");
        Annotations annotations = valueParameterDescriptor.getAnnotations();
        FqName fqName = JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME;
        Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (!(findAnnotation == null || (firstArgument = DescriptorUtilsKt.firstArgument(findAnnotation)) == null)) {
            if (!(firstArgument instanceof StringValue)) {
                firstArgument = null;
            }
            StringValue stringValue = (StringValue) firstArgument;
            if (!(stringValue == null || (str = (String) stringValue.getValue()) == null)) {
                return new StringDefaultValue(str);
            }
        }
        Annotations annotations2 = valueParameterDescriptor.getAnnotations();
        FqName fqName2 = JvmAnnotationNames.DEFAULT_NULL_FQ_NAME;
        Intrinsics.checkExpressionValueIsNotNull(fqName2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (annotations2.hasAnnotation(fqName2)) {
            return NullDefaultValue.INSTANCE;
        }
        return null;
    }

    public static final List<ValueParameterDescriptor> copyValueParameters(Collection<ValueParameterData> collection, Collection<? extends ValueParameterDescriptor> collection2, CallableDescriptor callableDescriptor) {
        boolean z;
        KotlinType kotlinType;
        Intrinsics.checkParameterIsNotNull(collection, "newValueParametersTypes");
        Intrinsics.checkParameterIsNotNull(collection2, "oldValueParameters");
        Intrinsics.checkParameterIsNotNull(callableDescriptor, "newOwner");
        if (collection.size() == collection2.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            List<Pair> zip = CollectionsKt.zip(collection, collection2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(zip, 10));
            for (Pair pair : zip) {
                ValueParameterData valueParameterData = (ValueParameterData) pair.component1();
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component2();
                int index = valueParameterDescriptor.getIndex();
                Annotations annotations = valueParameterDescriptor.getAnnotations();
                Name name = valueParameterDescriptor.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "oldParameter.name");
                KotlinType type = valueParameterData.getType();
                boolean hasDefaultValue = valueParameterData.getHasDefaultValue();
                boolean isCrossinline = valueParameterDescriptor.isCrossinline();
                boolean isNoinline = valueParameterDescriptor.isNoinline();
                if (valueParameterDescriptor.getVarargElementType() != null) {
                    kotlinType = DescriptorUtilsKt.getModule(callableDescriptor).getBuiltIns().getArrayElementType(valueParameterData.getType());
                } else {
                    kotlinType = null;
                }
                SourceElement source = valueParameterDescriptor.getSource();
                Intrinsics.checkExpressionValueIsNotNull(source, "oldParameter.source");
                arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name, type, hasDefaultValue, isCrossinline, isNoinline, kotlinType, source));
            }
            return arrayList;
        }
        throw new AssertionError("Different value parameters sizes: Enhanced = " + collection.size() + ", Old = " + collection2.size());
    }
}
