package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    private final WildcardType reflectType;

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public WildcardType getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Intrinsics.checkExpressionValueIsNotNull(upperBounds, "reflectType.upperBounds");
        return !Intrinsics.areEqual((Type) C69043h.m265778d(upperBounds), Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
        } else if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            Intrinsics.checkExpressionValueIsNotNull(lowerBounds, "lowerBounds");
            Object f = C69043h.m265781f(lowerBounds);
            Intrinsics.checkExpressionValueIsNotNull(f, "lowerBounds.single()");
            return factory.create((Type) f);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(upperBounds, "upperBounds");
            Type type = (Type) C69043h.m265781f(upperBounds);
            if (!(!Intrinsics.areEqual(type, Object.class))) {
                return null;
            }
            ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
            Intrinsics.checkExpressionValueIsNotNull(type, "ub");
            return factory2.create(type);
        }
    }

    public ReflectJavaWildcardType(WildcardType wildcardType) {
        Intrinsics.checkParameterIsNotNull(wildcardType, "reflectType");
        this.reflectType = wildcardType;
    }
}
