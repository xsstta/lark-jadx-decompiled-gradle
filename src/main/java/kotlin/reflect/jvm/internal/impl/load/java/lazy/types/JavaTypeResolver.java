package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class JavaTypeResolver {

    /* renamed from: c */
    private final LazyJavaResolverContext f173273c;
    private final TypeParameterResolver typeParameterResolver;

    private final boolean isNullable(JavaTypeAttributes javaTypeAttributes) {
        if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
            return false;
        }
        return true;
    }

    private final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        ClassId classId = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        TypeConstructor typeConstructor = this.f173273c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, CollectionsKt.listOf((Object) 0)).getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "c.components.deserialize…istOf(0)).typeConstructor");
        return typeConstructor;
    }

    public JavaTypeResolver(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver2) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(typeParameterResolver2, "typeParameterResolver");
        this.f173273c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver2;
    }

    private final boolean isConflictingArgumentFor(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) {
            return false;
        }
        return true;
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        Variance variance;
        if (!JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1.INSTANCE.invoke((JavaType) CollectionsKt.lastOrNull((List) javaClassifierType.getTypeArguments()))) {
            return false;
        }
        TypeConstructor typeConstructor = JavaToKotlinClassMap.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "JavaToKotlinClassMap.con…         .typeConstructor");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkExpressionValueIsNotNull(parameters, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(variance, "JavaToKotlinClassMap.con….variance ?: return false");
        if (variance != Variance.OUT_VARIANCE) {
            return true;
        }
        return false;
    }

    private final KotlinType transformJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z;
        JavaTypeResolver$transformJavaClassifierType$1 javaTypeResolver$transformJavaClassifierType$1 = new JavaTypeResolver$transformJavaClassifierType$1(javaClassifierType);
        if (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
            z = false;
        } else {
            z = true;
        }
        boolean isRaw = javaClassifierType.isRaw();
        if (isRaw || z) {
            SimpleType computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (computeSimpleJavaClassifierType == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            SimpleType computeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType);
            if (computeSimpleJavaClassifierType2 == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            if (isRaw) {
                return new RawTypeImpl(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
            }
            return KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
        }
        SimpleType computeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
        if (computeSimpleJavaClassifierType3 == null) {
            computeSimpleJavaClassifierType3 = javaTypeResolver$transformJavaClassifierType$1.invoke();
        }
        return computeSimpleJavaClassifierType3;
    }

    private final TypeConstructor computeTypeConstructor(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructor;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javaClassifierType);
        }
        if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName != null) {
                ClassDescriptor mapKotlinClass = mapKotlinClass(javaClassifierType, javaTypeAttributes, fqName);
                if (mapKotlinClass == null) {
                    mapKotlinClass = this.f173273c.getComponents().getModuleClassResolver().resolveClass(javaClass);
                }
                if (mapKotlinClass == null || (typeConstructor = mapKotlinClass.getTypeConstructor()) == null) {
                    return createNotFoundClass(javaClassifierType);
                }
                return typeConstructor;
            }
            throw new AssertionError("Class type should have a FQ name: " + classifier);
        } else if (classifier instanceof JavaTypeParameter) {
            TypeParameterDescriptor resolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            if (resolveTypeParameter != null) {
                return resolveTypeParameter.getTypeConstructor();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + classifier);
        }
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        KotlinType transformJavaType;
        SimpleType simpleType;
        Intrinsics.checkParameterIsNotNull(javaTypeAttributes, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            if (type != null) {
                simpleType = this.f173273c.getModule().getBuiltIns().getPrimitiveKotlinType(type);
            } else {
                simpleType = this.f173273c.getModule().getBuiltIns().getUnitType();
            }
            Intrinsics.checkExpressionValueIsNotNull(simpleType, "if (primitiveType != nul….module.builtIns.unitType");
            return simpleType;
        } else if (javaType instanceof JavaClassifierType) {
            return transformJavaClassifierType((JavaClassifierType) javaType, javaTypeAttributes);
        } else {
            if (javaType instanceof JavaArrayType) {
                return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
            }
            if (javaType instanceof JavaWildcardType) {
                JavaType bound = ((JavaWildcardType) javaType).getBound();
                if (bound != null && (transformJavaType = transformJavaType(bound, javaTypeAttributes)) != null) {
                    return transformJavaType;
                }
                SimpleType defaultBound = this.f173273c.getModule().getBuiltIns().getDefaultBound();
                Intrinsics.checkExpressionValueIsNotNull(defaultBound, "c.module.builtIns.defaultBound");
                return defaultBound;
            } else if (javaType == null) {
                SimpleType defaultBound2 = this.f173273c.getModule().getBuiltIns().getDefaultBound();
                Intrinsics.checkExpressionValueIsNotNull(defaultBound2, "c.module.builtIns.defaultBound");
                return defaultBound2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + javaType);
            }
        }
    }

    private final SimpleType computeSimpleJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        LazyJavaAnnotations lazyJavaAnnotations;
        if (simpleType == null || (lazyJavaAnnotations = simpleType.getAnnotations()) == null) {
            lazyJavaAnnotations = new LazyJavaAnnotations(this.f173273c, javaClassifierType);
        }
        TypeConstructor computeTypeConstructor = computeTypeConstructor(javaClassifierType, javaTypeAttributes);
        TypeConstructor typeConstructor = null;
        if (computeTypeConstructor == null) {
            return null;
        }
        boolean isNullable = isNullable(javaTypeAttributes);
        if (simpleType != null) {
            typeConstructor = simpleType.getConstructor();
        }
        if (!Intrinsics.areEqual(typeConstructor, computeTypeConstructor) || javaClassifierType.isRaw() || !isNullable) {
            return KotlinTypeFactory.simpleType$default(lazyJavaAnnotations, computeTypeConstructor, computeArguments(javaClassifierType, javaTypeAttributes, computeTypeConstructor), isNullable, null, 16, null);
        }
        return simpleType.makeNullableAsSpecified(true);
    }

    private final ClassDescriptor mapKotlinClass(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && Intrinsics.areEqual(fqName, JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.f173273c.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMap.mapJavaToKotlin$default(javaToKotlinClassMap, fqName, this.f173273c.getModule().getBuiltIns(), null, 4, null);
        if (mapJavaToKotlin$default == null) {
            return null;
        }
        if (!javaToKotlinClassMap.isReadOnly(mapJavaToKotlin$default) || (javaTypeAttributes.getFlexibility() != JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE && !argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, mapJavaToKotlin$default))) {
            return mapJavaToKotlin$default;
        }
        return javaToKotlinClassMap.convertReadOnlyToMutable(mapJavaToKotlin$default);
    }

    private final TypeProjection transformToTypeProjection(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        Variance variance;
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        if (javaWildcardType.isExtends()) {
            variance = Variance.OUT_VARIANCE;
        } else {
            variance = Variance.IN_VARIANCE;
        }
        if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
            return JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        }
        return TypeUtilsKt.createProjection(transformJavaType(bound, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)), variance, typeParameterDescriptor);
    }

    public final KotlinType transformArrayType(JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z) {
        JavaType javaType;
        PrimitiveType primitiveType;
        Variance variance;
        Intrinsics.checkParameterIsNotNull(javaArrayType, "arrayType");
        Intrinsics.checkParameterIsNotNull(javaTypeAttributes, "attr");
        JavaType componentType = javaArrayType.getComponentType();
        if (!(componentType instanceof JavaPrimitiveType)) {
            javaType = null;
        } else {
            javaType = componentType;
        }
        JavaPrimitiveType javaPrimitiveType = (JavaPrimitiveType) javaType;
        if (javaPrimitiveType != null) {
            primitiveType = javaPrimitiveType.getType();
        } else {
            primitiveType = null;
        }
        if (primitiveType != null) {
            SimpleType primitiveArrayKotlinType = this.f173273c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
            Intrinsics.checkExpressionValueIsNotNull(primitiveArrayKotlinType, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            if (javaTypeAttributes.isForAnnotationParameter()) {
                return primitiveArrayKotlinType;
            }
            return KotlinTypeFactory.flexibleType(primitiveArrayKotlinType, primitiveArrayKotlinType.makeNullableAsSpecified(true));
        }
        KotlinType transformJavaType = transformJavaType(componentType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), null, 2, null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            if (z) {
                variance = Variance.OUT_VARIANCE;
            } else {
                variance = Variance.INVARIANT;
            }
            SimpleType arrayType = this.f173273c.getModule().getBuiltIns().getArrayType(variance, transformJavaType);
            Intrinsics.checkExpressionValueIsNotNull(arrayType, "c.module.builtIns.getArr…ctionKind, componentType)");
            return arrayType;
        }
        SimpleType arrayType2 = this.f173273c.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, transformJavaType);
        Intrinsics.checkExpressionValueIsNotNull(arrayType2, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return KotlinTypeFactory.flexibleType(arrayType2, this.f173273c.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, transformJavaType).makeNullableAsSpecified(true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if ((!r3.isEmpty()) != false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r16, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r17, kotlin.reflect.jvm.internal.impl.types.TypeConstructor r18) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor):java.util.List");
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }
}
