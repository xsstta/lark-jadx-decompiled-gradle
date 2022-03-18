package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;

public final class TypeSignatureMappingKt {
    public static final boolean hasVoidReturnType(CallableDescriptor callableDescriptor) {
        Intrinsics.checkParameterIsNotNull(callableDescriptor, "descriptor");
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        if (returnType == null) {
            Intrinsics.throwNpe();
        }
        if (KotlinBuiltIns.isUnit(returnType)) {
            KotlinType returnType2 = callableDescriptor.getReturnType();
            if (returnType2 == null) {
                Intrinsics.throwNpe();
            }
            if (TypeUtils.isNullableType(returnType2) || (callableDescriptor instanceof PropertyGetterDescriptor)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final String computeInternalName(ClassDescriptor classDescriptor, TypeMappingConfiguration<?> typeMappingConfiguration) {
        DeclarationDescriptor declarationDescriptor;
        Intrinsics.checkParameterIsNotNull(classDescriptor, "klass");
        Intrinsics.checkParameterIsNotNull(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(classDescriptor);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "klass.containingDeclaration");
        Name safeIdentifier = SpecialNames.safeIdentifier(classDescriptor.getName());
        Intrinsics.checkExpressionValueIsNotNull(safeIdentifier, "SpecialNames.safeIdentifier(klass.name)");
        String identifier = safeIdentifier.getIdentifier();
        Intrinsics.checkExpressionValueIsNotNull(identifier, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            StringBuilder sb = new StringBuilder();
            String asString = fqName.asString();
            Intrinsics.checkExpressionValueIsNotNull(asString, "fqName.asString()");
            sb.append(StringsKt.replace$default(asString, '.', '/', false, 4, (Object) null));
            sb.append('/');
            sb.append(identifier);
            return sb.toString();
        }
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        } else {
            declarationDescriptor = containingDeclaration;
        }
        ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor2 != null) {
            String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
            if (predefinedInternalNameForClass == null) {
                predefinedInternalNameForClass = computeInternalName(classDescriptor2, typeMappingConfiguration);
            }
            return predefinedInternalNameForClass + '$' + identifier;
        }
        throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + classDescriptor);
    }

    private static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        if (z) {
            return jvmTypeFactory.boxType(t);
        }
        return t;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final <T> T mapBuiltInType(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode) {
        ClassId classId;
        Intrinsics.checkParameterIsNotNull(typeSystemCommonBackendContext, "$this$mapBuiltInType");
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(jvmTypeFactory, "typeFactory");
        Intrinsics.checkParameterIsNotNull(typeMappingMode, "mode");
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            return null;
        }
        PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
        boolean z = true;
        if (primitiveType != null) {
            JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.get(primitiveType);
            Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType, "JvmPrimitiveType.get(primitiveType)");
            String desc = jvmPrimitiveType.getDesc();
            Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.get(primitiveType).desc");
            T createFromString = jvmTypeFactory.createFromString(desc);
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && !TypeEnhancementKt.hasEnhancedNullability(typeSystemCommonBackendContext, kotlinTypeMarker)) {
                z = false;
            }
            return (T) boxTypeIfNeeded(jvmTypeFactory, createFromString, z);
        }
        PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor);
        if (primitiveArrayType != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.get(primitiveArrayType);
            Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType2, "JvmPrimitiveType.get(arrayElementType)");
            sb.append(jvmPrimitiveType2.getDesc());
            return jvmTypeFactory.createFromString(sb.toString());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
            FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
            if (classFqNameUnsafe != null) {
                classId = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe);
            } else {
                classId = null;
            }
            if (classId != null) {
                if (!typeMappingMode.getKotlinCollectionsToJavaCollections()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                        Iterator<T> it = mutabilityMappings.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual(it.next().getJavaClass(), classId)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                JvmClassName byClassId = JvmClassName.byClassId(classId);
                Intrinsics.checkExpressionValueIsNotNull(byClassId, "JvmClassName.byClassId(classId)");
                String internalName = byClassId.getInternalName();
                Intrinsics.checkExpressionValueIsNotNull(internalName, "JvmClassName.byClassId(classId).internalName");
                return jvmTypeFactory.createObjectType(internalName);
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T mapType(kotlin.reflect.jvm.internal.impl.types.KotlinType r10, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> r11, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r12, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> r13, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> r14, kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.Unit> r15) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.mapType(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter, kotlin.jvm.functions.o):java.lang.Object");
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 oVar, int i, Object obj) {
        if ((i & 32) != 0) {
            oVar = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, oVar);
    }
}
