package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class FunctionTypesKt {
    public static final FunctionClassDescriptor.Kind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$getFunctionalClassKind");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isBuiltinExtensionFunctionalType");
        if (!isBuiltinFunctionalType(kotlinType) || !isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return false;
        }
        return true;
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        FunctionClassDescriptor.Kind kind;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isFunctionType");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            kind = getFunctionalClassKind(declarationDescriptor);
        } else {
            kind = null;
        }
        if (kind == FunctionClassDescriptor.Kind.Function) {
            return true;
        }
        return false;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        FunctionClassDescriptor.Kind kind;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isSuspendFunctionType");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            kind = getFunctionalClassKind(declarationDescriptor);
        } else {
            kind = null;
        }
        if (kind == FunctionClassDescriptor.Kind.SuspendFunction) {
            return true;
        }
        return false;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
        Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        if (annotations.findAnnotation(fqName) != null) {
            return true;
        }
        return false;
    }

    private static final FunctionClassDescriptor.Kind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        BuiltInFictitiousFunctionClassFactory.Companion companion = BuiltInFictitiousFunctionClassFactory.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkExpressionValueIsNotNull(asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkExpressionValueIsNotNull(parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$getReceiverTypeFromFunctionType");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (_Assertions.f173221a && !isBuiltinFunctionalType) {
            throw new AssertionError("Not a function type: " + kotlinType);
        } else if (isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return ((TypeProjection) CollectionsKt.first((List) kotlinType.getArguments())).getType();
        } else {
            return null;
        }
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$getReturnTypeFromFunctionType");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!_Assertions.f173221a || isBuiltinFunctionalType) {
            KotlinType type = ((TypeProjection) CollectionsKt.last((List) kotlinType.getArguments())).getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "arguments.last().type");
            return type;
        }
        throw new AssertionError("Not a function type: " + kotlinType);
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        FunctionClassDescriptor.Kind kind;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isBuiltinFunctionalType");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            kind = getFunctionalClassKind(declarationDescriptor);
        } else {
            kind = null;
        }
        if (kind == FunctionClassDescriptor.Kind.Function || kind == FunctionClassDescriptor.Kind.SuspendFunction) {
            return true;
        }
        return false;
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        String str;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$extractParameterNameFromFunctionTypeArgument");
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.FQ_NAMES.parameterName;
        Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (findAnnotation != null) {
            Object singleOrNull = CollectionsKt.singleOrNull(findAnnotation.getAllValueArguments().values());
            if (!(singleOrNull instanceof StringValue)) {
                singleOrNull = null;
            }
            StringValue stringValue = (StringValue) singleOrNull;
            if (!(stringValue == null || (str = (String) stringValue.getValue()) == null)) {
                if (!Name.isValidIdentifier(str)) {
                    str = null;
                }
                if (str != null) {
                    return Name.identifier(str);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getValueParameterTypesFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType r5) {
        /*
            java.lang.String r0 = "$this$getValueParameterTypesFromFunctionType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            boolean r0 = isBuiltinFunctionalType(r5)
            boolean r1 = kotlin._Assertions.f173221a
            if (r1 == 0) goto L_0x0029
            if (r0 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a function type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r5)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0029:
            java.util.List r0 = r5.getArguments()
            boolean r1 = isBuiltinExtensionFunctionalType(r5)
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            if (r1 > r2) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            boolean r4 = kotlin._Assertions.f173221a
            if (r4 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x0042
            goto L_0x005b
        L_0x0042:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not an exact function type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r5)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x005b:
            java.util.List r5 = r0.subList(r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType):java.util.List");
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> list, List<Name> list2, KotlinType kotlinType2, KotlinBuiltIns kotlinBuiltIns) {
        int i;
        Name name;
        Intrinsics.checkParameterIsNotNull(list, "parameterTypes");
        Intrinsics.checkParameterIsNotNull(kotlinType2, "returnType");
        Intrinsics.checkParameterIsNotNull(kotlinBuiltIns, "builtIns");
        int size = list.size();
        int i2 = 0;
        if (kotlinType != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(size + i + 1);
        ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (list2 == null || (name = list2.get(i2)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = KotlinBuiltIns.FQ_NAMES.parameterName;
                Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
                Name identifier = Name.identifier("name");
                String asString = name.asString();
                Intrinsics.checkExpressionValueIsNotNull(asString, "name.asString()");
                t2 = TypeUtilsKt.replaceAnnotations(t2, Annotations.Companion.create(CollectionsKt.plus(t2.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(TuplesKt.to(identifier, new StringValue(asString)))))));
            }
            arrayList2.add(TypeUtilsKt.asTypeProjection(t2));
            i2 = i3;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        return arrayList;
    }

    public static final SimpleType createFunctionType(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> list, List<Name> list2, KotlinType kotlinType2, boolean z) {
        ClassDescriptor classDescriptor;
        Intrinsics.checkParameterIsNotNull(kotlinBuiltIns, "builtIns");
        Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        Intrinsics.checkParameterIsNotNull(list, "parameterTypes");
        Intrinsics.checkParameterIsNotNull(kotlinType2, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, kotlinType2, kotlinBuiltIns);
        int size = list.size();
        if (kotlinType != null) {
            size++;
        }
        if (z) {
            classDescriptor = kotlinBuiltIns.getSuspendFunction(size);
        } else {
            classDescriptor = kotlinBuiltIns.getFunction(size);
        }
        Intrinsics.checkExpressionValueIsNotNull(classDescriptor, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (kotlinType != null) {
            FqName fqName = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
            Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (annotations.findAnnotation(fqName) == null) {
                Annotations.Companion companion = Annotations.Companion;
                FqName fqName2 = KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
                Intrinsics.checkExpressionValueIsNotNull(fqName2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                annotations = companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, MapsKt.emptyMap())));
            }
        }
        return KotlinTypeFactory.simpleNotNullType(annotations, classDescriptor, functionTypeArgumentProjections);
    }

    public static /* synthetic */ SimpleType createFunctionType$default(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, List list2, KotlinType kotlinType2, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 64) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        return createFunctionType(kotlinBuiltIns, annotations, kotlinType, list, list2, kotlinType2, z2);
    }
}
