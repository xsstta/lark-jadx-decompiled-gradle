package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class TypeDeserializer {

    /* renamed from: c */
    public final DeserializationContext f173275c;
    private final Function1<Integer, ClassDescriptor> classDescriptors;
    private final String containerPresentableName;
    private final String debugName;
    private boolean experimentalSuspendFunctionTypeEncountered;
    private final TypeDeserializer parent;
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public final boolean getExperimentalSuspendFunctionTypeEncountered() {
        return this.experimentalSuspendFunctionTypeEncountered;
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb.append(str);
        return sb.toString();
    }

    private final TypeConstructor typeParameterTypeConstructor(int i) {
        TypeConstructor typeConstructor;
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null && (typeConstructor = typeParameterDescriptor.getTypeConstructor()) != null) {
            return typeConstructor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.typeParameterTypeConstructor(i);
        }
        return null;
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        if (NameResolverUtilKt.getClassId(this.f173275c.getNameResolver(), i).isLocal()) {
            return this.f173275c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    public final ClassDescriptor computeClassDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f173275c.getNameResolver(), i);
        if (classId.isLocal()) {
            return this.f173275c.getComponents().deserializeClass(classId);
        }
        return FindClassInModuleKt.findClassAcrossModuleDependencies(this.f173275c.getComponents().getModuleDescriptor(), classId);
    }

    public final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f173275c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f173275c.getComponents().getModuleDescriptor(), classId);
    }

    public final KotlinType type(ProtoBuf.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "proto");
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type);
        }
        String string = this.f173275c.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType = simpleType(type);
        ProtoBuf.Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type, this.f173275c.getTypeTable());
        if (flexibleUpperBound == null) {
            Intrinsics.throwNpe();
        }
        return this.f173275c.getComponents().getFlexibleTypeDeserializer().create(type, string, simpleType, simpleType(flexibleUpperBound));
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        KotlinType type;
        FqName fqName;
        boolean releaseCoroutines = this.f173275c.getComponents().getConfiguration().getReleaseCoroutines();
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        FqName fqName2 = null;
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(type, "funType.getValueParamete…ll()?.type ?: return null");
        ClassifierDescriptor declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            fqName = DescriptorUtilsKt.getFqNameSafe(declarationDescriptor);
        } else {
            fqName = null;
        }
        boolean z = true;
        if (type.getArguments().size() != 1 || (!SuspendFunctionTypesKt.isContinuation(fqName, true) && !SuspendFunctionTypesKt.isContinuation(fqName, false))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
        Intrinsics.checkExpressionValueIsNotNull(type2, "continuationArgumentType.arguments.single().type");
        DeclarationDescriptor containingDeclaration = this.f173275c.getContainingDeclaration();
        if (!(containingDeclaration instanceof CallableDescriptor)) {
            containingDeclaration = null;
        }
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        if (callableDescriptor != null) {
            fqName2 = DescriptorUtilsKt.fqNameOrNull(callableDescriptor);
        }
        if (Intrinsics.areEqual(fqName2, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            return createSimpleSuspendFunctionType(kotlinType, type2);
        }
        if (!this.experimentalSuspendFunctionTypeEncountered && (!releaseCoroutines || !SuspendFunctionTypesKt.isContinuation(fqName, !releaseCoroutines))) {
            z = false;
        }
        this.experimentalSuspendFunctionTypeEncountered = z;
        return createSimpleSuspendFunctionType(kotlinType, type2);
    }

    public final SimpleType simpleType(ProtoBuf.Type type) {
        SimpleType simpleType;
        SimpleType simpleType2;
        Intrinsics.checkParameterIsNotNull(type, "proto");
        if (type.hasClassName()) {
            simpleType = computeLocalClassifierReplacementType(type.getClassName());
        } else if (type.hasTypeAliasName()) {
            simpleType = computeLocalClassifierReplacementType(type.getTypeAliasName());
        } else {
            simpleType = null;
        }
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor = typeConstructor(type);
        if (ErrorUtils.isError(typeConstructor.getDeclarationDescriptor())) {
            SimpleType createErrorTypeWithCustomConstructor = ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructor.toString(), typeConstructor);
            Intrinsics.checkExpressionValueIsNotNull(createErrorTypeWithCustomConstructor, "ErrorUtils.createErrorTy….toString(), constructor)");
            return createErrorTypeWithCustomConstructor;
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f173275c.getStorageManager(), new TypeDeserializer$simpleType$annotations$1(this, type));
        List<ProtoBuf.Type.Argument> invoke = new TypeDeserializer$simpleType$1(this).invoke(type);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke, 10));
        int i = 0;
        for (T t : invoke) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkExpressionValueIsNotNull(parameters, "constructor.parameters");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i), t));
            i = i2;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        Boolean bool = Flags.SUSPEND_TYPE.get(type.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (bool.booleanValue()) {
            simpleType2 = createSuspendFunctionType(deserializedAnnotations, typeConstructor, list, type.getNullable());
        } else {
            simpleType2 = KotlinTypeFactory.simpleType$default(deserializedAnnotations, typeConstructor, list, type.getNullable(), null, 16, null);
        }
        ProtoBuf.Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type, this.f173275c.getTypeTable());
        if (abbreviatedType != null) {
            return SpecialTypesKt.withAbbreviation(simpleType2, simpleType(abbreviatedType));
        }
        return simpleType2;
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        T t;
        TypeConstructor typeConstructor;
        TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1 = new TypeDeserializer$typeConstructor$1(this, type);
        if (type.hasClassName()) {
            ClassDescriptor invoke = this.classDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (invoke == null) {
                invoke = typeDeserializer$typeConstructor$1.invoke(type.getClassName());
            }
            TypeConstructor typeConstructor2 = invoke.getTypeConstructor();
            Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "(classDescriptors(proto.…assName)).typeConstructor");
            return typeConstructor2;
        } else if (type.hasTypeParameter()) {
            TypeConstructor typeParameterTypeConstructor = typeParameterTypeConstructor(type.getTypeParameter());
            if (typeParameterTypeConstructor != null) {
                return typeParameterTypeConstructor;
            }
            TypeConstructor createErrorTypeConstructor = ErrorUtils.createErrorTypeConstructor("Unknown type parameter " + type.getTypeParameter() + ". Please try recompiling module containing \"" + this.containerPresentableName + '\"');
            Intrinsics.checkExpressionValueIsNotNull(createErrorTypeConstructor, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return createErrorTypeConstructor;
        } else if (type.hasTypeParameterName()) {
            DeclarationDescriptor containingDeclaration = this.f173275c.getContainingDeclaration();
            String string = this.f173275c.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.getName().asString(), string)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null && (typeConstructor = t2.getTypeConstructor()) != null) {
                return typeConstructor;
            }
            TypeConstructor createErrorTypeConstructor2 = ErrorUtils.createErrorTypeConstructor("Deserialized type parameter " + string + " in " + containingDeclaration);
            Intrinsics.checkExpressionValueIsNotNull(createErrorTypeConstructor2, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return createErrorTypeConstructor2;
        } else if (type.hasTypeAliasName()) {
            ClassDescriptor invoke2 = this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (invoke2 == null) {
                invoke2 = typeDeserializer$typeConstructor$1.invoke(type.getTypeAliasName());
            }
            TypeConstructor typeConstructor3 = invoke2.getTypeConstructor();
            Intrinsics.checkExpressionValueIsNotNull(typeConstructor3, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return typeConstructor3;
        } else {
            TypeConstructor createErrorTypeConstructor3 = ErrorUtils.createErrorTypeConstructor("Unknown type");
            Intrinsics.checkExpressionValueIsNotNull(createErrorTypeConstructor3, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return createErrorTypeConstructor3;
        }
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<TypeProjection> dropLast = CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dropLast, 10));
        for (TypeProjection typeProjection : dropLast) {
            arrayList.add(typeProjection.getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() != ProtoBuf.Type.Argument.Projection.STAR) {
            ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            Intrinsics.checkExpressionValueIsNotNull(projection, "typeArgumentProto.projection");
            Variance variance = protoEnumFlags.variance(projection);
            ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f173275c.getTypeTable());
            if (type != null) {
                return new TypeProjectionImpl(variance, type(type));
            }
            return new TypeProjectionImpl(ErrorUtils.createErrorType("No type recorded"));
        } else if (typeParameterDescriptor == null) {
            return new StarProjectionForAbsentTypeParameter(this.f173275c.getComponents().getModuleDescriptor().getBuiltIns());
        } else {
            return new StarProjectionImpl(typeParameterDescriptor);
        }
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(annotations, typeConstructor, list, z, null, 16, null);
        if (!FunctionTypesKt.isFunctionType(simpleType$default)) {
            return null;
        }
        return transformRuntimeFunctionTypeToSuspendFunction(simpleType$default);
    }

    private final SimpleType createSuspendFunctionType(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        SimpleType simpleType = null;
        if (size2 == 0) {
            simpleType = createSuspendFunctionTypeForBasicCase(annotations, typeConstructor, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            ClassDescriptor suspendFunction = typeConstructor.getBuiltIns().getSuspendFunction(size);
            Intrinsics.checkExpressionValueIsNotNull(suspendFunction, "functionTypeConstructor.…getSuspendFunction(arity)");
            TypeConstructor typeConstructor2 = suspendFunction.getTypeConstructor();
            Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "functionTypeConstructor.…on(arity).typeConstructor");
            simpleType = KotlinTypeFactory.simpleType$default(annotations, typeConstructor2, list, z, null, 16, null);
        }
        if (simpleType != null) {
            return simpleType;
        }
        SimpleType createErrorTypeWithArguments = ErrorUtils.createErrorTypeWithArguments("Bad suspend function in metadata with constructor: " + typeConstructor, list);
        Intrinsics.checkExpressionValueIsNotNull(createErrorTypeWithArguments, "ErrorUtils.createErrorTy…      arguments\n        )");
        return createErrorTypeWithArguments;
    }

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> list, String str, String str2, boolean z) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkParameterIsNotNull(deserializationContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(list, "typeParameterProtos");
        Intrinsics.checkParameterIsNotNull(str, "debugName");
        Intrinsics.checkParameterIsNotNull(str2, "containerPresentableName");
        this.f173275c = deserializationContext;
        this.parent = typeDeserializer;
        this.debugName = str;
        this.containerPresentableName = str2;
        this.experimentalSuspendFunctionTypeEncountered = z;
        this.classDescriptors = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$classDescriptors$1(this));
        this.typeAliasDescriptors = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i = 0;
            for (T t : list) {
                linkedHashMap2.put(Integer.valueOf(t.getId()), new DeserializedTypeParameterDescriptor(this.f173275c, t, i));
                i++;
            }
            linkedHashMap = linkedHashMap2;
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TypeDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r9, java.util.List r10, java.lang.String r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0007
            r13 = 0
            r6 = 0
            goto L_0x0008
        L_0x0007:
            r6 = r13
        L_0x0008:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer, java.util.List, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
