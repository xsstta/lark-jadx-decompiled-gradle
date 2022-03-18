package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer;

    /* renamed from: c */
    public final DeserializationContext f173274c;

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f173274c.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final boolean containsSuspendFunctionType(KotlinType kotlinType) {
        return TypeUtilsKt.contains(kotlinType, MemberDeserializer$containsSuspendFunctionType$1.INSTANCE);
    }

    private final void forceUpperBoundsComputation(TypeDeserializer typeDeserializer) {
        Iterator<T> it = typeDeserializer.getOwnTypeParameters().iterator();
        while (it.hasNext()) {
            it.next().getUpperBounds();
        }
    }

    public MemberDeserializer(DeserializationContext deserializationContext) {
        Intrinsics.checkParameterIsNotNull(deserializationContext, C60375c.f150914a);
        this.f173274c = deserializationContext;
        this.annotationDeserializer = new AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f173274c.getNameResolver(), this.f173274c.getTypeTable(), this.f173274c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final boolean versionAndReleaseCoroutinesMismatch(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        boolean z2;
        if (!this.f173274c.getComponents().getConfiguration().getReleaseCoroutines()) {
            return false;
        }
        List<VersionRequirement> versionRequirements = deserializedMemberDescriptor.getVersionRequirements();
        if (!(versionRequirements instanceof Collection) || !versionRequirements.isEmpty()) {
            Iterator<T> it = versionRequirements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!Intrinsics.areEqual(next.getVersion(), new VersionRequirement.Version(1, 3, 0, 4, null)) || next.getKind() != ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias typeAlias) {
        Intrinsics.checkParameterIsNotNull(typeAlias, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        Intrinsics.checkExpressionValueIsNotNull(annotationList, "proto.annotationList");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            AnnotationDeserializer annotationDeserializer2 = this.annotationDeserializer;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(annotationDeserializer2.deserializeAnnotation(t, this.f173274c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f173274c.getStorageManager(), this.f173274c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f173274c.getNameResolver(), typeAlias.getName()), ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.f173274c.getNameResolver(), this.f173274c.getTypeTable(), this.f173274c.getVersionRequirementTable(), this.f173274c.getContainerSource());
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(this.f173274c, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, this.f173274c.getTypeTable())), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, this.f173274c.getTypeTable())), checkExperimentalCoroutine(deserializedTypeAliasDescriptor, childContext$default.getTypeDeserializer()));
        return deserializedTypeAliasDescriptor;
    }

    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function function) {
        int i;
        Annotations annotations;
        VersionRequirementTable versionRequirementTable;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType type;
        Intrinsics.checkParameterIsNotNull(function, "proto");
        if (function.hasFlags()) {
            i = function.getFlags();
        } else {
            i = loadOldFlags(function.getOldFlags());
        }
        ProtoBuf.Function function2 = function;
        Annotations annotations2 = getAnnotations(function2, i, AnnotatedCallableKind.FUNCTION);
        if (ProtoTypeTableUtilKt.hasReceiver(function)) {
            annotations = getReceiverParameterAnnotations(function2, AnnotatedCallableKind.FUNCTION);
        } else {
            annotations = Annotations.Companion.getEMPTY();
        }
        if (Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f173274c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f173274c.getNameResolver(), function.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            versionRequirementTable = VersionRequirementTable.Companion.getEMPTY();
        } else {
            versionRequirementTable = this.f173274c.getVersionRequirementTable();
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f173274c.getContainingDeclaration(), null, annotations2, NameResolverUtilKt.getName(this.f173274c.getNameResolver(), function.getName()), ProtoEnumFlags.INSTANCE.memberKind(Flags.MEMBER_KIND.get(i)), function, this.f173274c.getNameResolver(), this.f173274c.getTypeTable(), versionRequirementTable, this.f173274c.getContainerSource(), null, 1024, null);
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(this.f173274c, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(function, this.f173274c.getTypeTable());
        if (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) {
            receiverParameterDescriptor = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, type, annotations);
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
        List<ValueParameterDescriptor> valueParameters = memberDeserializer.valueParameters(valueParameterList, function2, AnnotatedCallableKind.FUNCTION);
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(function, this.f173274c.getTypeTable()));
        Modality modality = ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(i));
        Visibility visibility = ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(i));
        Map<? extends CallableDescriptor.UserDataKey<?>, ?> emptyMap = MapsKt.emptyMap();
        Boolean bool = Flags.IS_SUSPEND.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_SUSPEND.get(flags)");
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor, dispatchReceiverParameter, ownTypeParameters, valueParameters, type2, modality, visibility, emptyMap, bool.booleanValue());
        Boolean bool2 = Flags.IS_OPERATOR.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool2, "Flags.IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.setOperator(bool2.booleanValue());
        Boolean bool3 = Flags.IS_INFIX.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool3, "Flags.IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.setInfix(bool3.booleanValue());
        Boolean bool4 = Flags.IS_EXTERNAL_FUNCTION.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool4, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExternal(bool4.booleanValue());
        Boolean bool5 = Flags.IS_INLINE.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool5, "Flags.IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.setInline(bool5.booleanValue());
        Boolean bool6 = Flags.IS_TAILREC.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool6, "Flags.IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool6.booleanValue());
        Boolean bool7 = Flags.IS_SUSPEND.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool7, "Flags.IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool7.booleanValue());
        Boolean bool8 = Flags.IS_EXPECT_FUNCTION.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool8, "Flags.IS_EXPECT_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExpect(bool8.booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = this.f173274c.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, this.f173274c.getTypeTable(), this.f173274c.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(deserializeContractFromFunction.getFirst(), deserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final PropertyDescriptor loadProperty(ProtoBuf.Property property) {
        int i;
        ProtoBuf.Property property2;
        Annotations annotations;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        boolean z;
        int i2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3;
        KotlinType type;
        Intrinsics.checkParameterIsNotNull(property, "proto");
        if (property.hasFlags()) {
            i = property.getFlags();
        } else {
            i = loadOldFlags(property.getOldFlags());
        }
        DeclarationDescriptor containingDeclaration = this.f173274c.getContainingDeclaration();
        ProtoBuf.Property property3 = property;
        Annotations annotations2 = getAnnotations(property3, i, AnnotatedCallableKind.PROPERTY);
        Modality modality = ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(i));
        Visibility visibility = ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(i));
        Boolean bool = Flags.IS_VAR.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_VAR.get(flags)");
        boolean booleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(this.f173274c.getNameResolver(), property.getName());
        CallableMemberDescriptor.Kind memberKind = ProtoEnumFlags.INSTANCE.memberKind(Flags.MEMBER_KIND.get(i));
        Boolean bool2 = Flags.IS_LATEINIT.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool2, "Flags.IS_LATEINIT.get(flags)");
        boolean booleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool3, "Flags.IS_CONST.get(flags)");
        boolean booleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool4, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool5, "Flags.IS_DELEGATED.get(flags)");
        boolean booleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool6, "Flags.IS_EXPECT_PROPERTY.get(flags)");
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations2, modality, visibility, booleanValue, name, memberKind, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool6.booleanValue(), property, this.f173274c.getNameResolver(), this.f173274c.getTypeTable(), this.f173274c.getVersionRequirementTable(), this.f173274c.getContainerSource());
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(this.f173274c, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool7, "Flags.HAS_GETTER.get(flags)");
        boolean booleanValue6 = bool7.booleanValue();
        if (!booleanValue6 || !ProtoTypeTableUtilKt.hasReceiver(property)) {
            property2 = property3;
            annotations = Annotations.Companion.getEMPTY();
        } else {
            property2 = property3;
            annotations = getReceiverParameterAnnotations(property2, AnnotatedCallableKind.PROPERTY_GETTER);
        }
        KotlinType type2 = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, this.f173274c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, this.f173274c.getTypeTable());
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
        if (receiverType == null || (type = childContext$default.getTypeDeserializer().type(receiverType)) == null) {
            receiverParameterDescriptor = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, type, annotations);
        }
        deserializedPropertyDescriptor.setType(type2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptor);
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool8, "Flags.HAS_ANNOTATIONS.get(flags)");
        int accessorFlags = Flags.getAccessorFlags(bool8.booleanValue(), Flags.VISIBILITY.get(i), Flags.MODALITY.get(i), false, false, false);
        if (booleanValue6) {
            if (property.hasGetterFlags()) {
                i2 = property.getGetterFlags();
            } else {
                i2 = accessorFlags;
            }
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(bool9, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue7 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(bool10, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue8 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(i2);
            Intrinsics.checkExpressionValueIsNotNull(bool11, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = bool11.booleanValue();
            Annotations annotations3 = getAnnotations(property2, i2, AnnotatedCallableKind.PROPERTY_GETTER);
            if (booleanValue7) {
                propertyGetterDescriptorImpl3 = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(i2)), !booleanValue7, booleanValue8, booleanValue9, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                propertyGetterDescriptorImpl3 = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                Intrinsics.checkExpressionValueIsNotNull(propertyGetterDescriptorImpl3, "DescriptorFactory.create…er(property, annotations)");
            }
            propertyGetterDescriptorImpl3.initialize(deserializedPropertyDescriptor.getReturnType());
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl3;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        Boolean bool12 = Flags.HAS_SETTER.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool12, "Flags.HAS_SETTER.get(flags)");
        if (bool12.booleanValue()) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            Boolean bool13 = Flags.IS_NOT_DEFAULT.get(accessorFlags);
            Intrinsics.checkExpressionValueIsNotNull(bool13, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue10 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_EXTERNAL_ACCESSOR.get(accessorFlags);
            Intrinsics.checkExpressionValueIsNotNull(bool14, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue11 = bool14.booleanValue();
            Boolean bool15 = Flags.IS_INLINE_ACCESSOR.get(accessorFlags);
            Intrinsics.checkExpressionValueIsNotNull(bool15, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = bool15.booleanValue();
            Annotations annotations4 = getAnnotations(property2, accessorFlags, AnnotatedCallableKind.PROPERTY_SETTER);
            if (booleanValue10) {
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(accessorFlags)), ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(accessorFlags)), !booleanValue10, booleanValue11, booleanValue12, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                z = true;
                propertySetterDescriptorImpl2.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(property.getSetterValueParameter()), property2, AnnotatedCallableKind.PROPERTY_SETTER)));
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
                z = true;
                propertySetterDescriptorImpl = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4, Annotations.Companion.getEMPTY());
                Intrinsics.checkExpressionValueIsNotNull(propertySetterDescriptorImpl, "DescriptorFactory.create…ptor */\n                )");
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl;
            z = true;
        }
        Boolean bool16 = Flags.HAS_CONSTANT.get(i);
        Intrinsics.checkExpressionValueIsNotNull(bool16, "Flags.HAS_CONSTANT.get(flags)");
        if (bool16.booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializer(this.f173274c.getStorageManager().createNullableLazyValue(new MemberDeserializer$loadProperty$3(this, property, deserializedPropertyDescriptor)));
        }
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(property, false), deserializedPropertyDescriptor2), new FieldDescriptorImpl(getPropertyFieldAnnotations(property, z), deserializedPropertyDescriptor2), checkExperimentalCoroutine(deserializedPropertyDescriptor, childContext$default.getTypeDeserializer()));
        return deserializedPropertyDescriptor2;
    }

    private final DeserializedMemberDescriptor.CoroutinesCompatibilityMode checkExperimentalCoroutine(DeserializedMemberDescriptor deserializedMemberDescriptor, TypeDeserializer typeDeserializer) {
        if (!versionAndReleaseCoroutinesMismatch(deserializedMemberDescriptor)) {
            return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        }
        forceUpperBoundsComputation(typeDeserializer);
        if (typeDeserializer.getExperimentalSuspendFunctionTypeEncountered()) {
            return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        }
        return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    private final Annotations getReceiverParameterAnnotations(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f173274c.getStorageManager(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    private final Annotations getPropertyFieldAnnotations(ProtoBuf.Property property, boolean z) {
        if (!Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f173274c.getStorageManager(), new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, property));
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor constructor, boolean z) {
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        DeserializationContext c;
        TypeDeserializer typeDeserializer;
        Intrinsics.checkParameterIsNotNull(constructor, "proto");
        DeclarationDescriptor containingDeclaration = this.f173274c.getContainingDeclaration();
        if (containingDeclaration != null) {
            ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
            ProtoBuf.Constructor constructor2 = constructor;
            DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor2 = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(constructor2, constructor.getFlags(), AnnotatedCallableKind.FUNCTION), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.f173274c.getNameResolver(), this.f173274c.getTypeTable(), this.f173274c.getVersionRequirementTable(), this.f173274c.getContainerSource(), null, 1024, null);
            MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f173274c, deserializedClassConstructorDescriptor2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
            deserializedClassConstructorDescriptor2.initialize(memberDeserializer.valueParameters(valueParameterList, constructor2, AnnotatedCallableKind.FUNCTION), ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(constructor.getFlags())));
            deserializedClassConstructorDescriptor2.setReturnType(classDescriptor.getDefaultType());
            DeclarationDescriptor containingDeclaration2 = this.f173274c.getContainingDeclaration();
            if (!(containingDeclaration2 instanceof DeserializedClassDescriptor)) {
                containingDeclaration2 = null;
            }
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) containingDeclaration2;
            boolean z2 = true;
            if (deserializedClassDescriptor == null || (c = deserializedClassDescriptor.getC()) == null || (typeDeserializer = c.getTypeDeserializer()) == null || !typeDeserializer.getExperimentalSuspendFunctionTypeEncountered() || !versionAndReleaseCoroutinesMismatch(deserializedClassConstructorDescriptor2)) {
                z2 = false;
            }
            if (z2) {
                coroutinesCompatibilityMode = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
                deserializedClassConstructorDescriptor = deserializedClassConstructorDescriptor2;
            } else {
                List<ValueParameterDescriptor> valueParameters = deserializedClassConstructorDescriptor2.getValueParameters();
                Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
                List<ValueParameterDescriptor> list = valueParameters;
                List<TypeParameterDescriptor> typeParameters = deserializedClassConstructorDescriptor2.getTypeParameters();
                Intrinsics.checkExpressionValueIsNotNull(typeParameters, "descriptor.typeParameters");
                deserializedClassConstructorDescriptor = deserializedClassConstructorDescriptor2;
                coroutinesCompatibilityMode = computeExperimentalityModeForFunctions(deserializedClassConstructorDescriptor2, null, list, typeParameters, deserializedClassConstructorDescriptor2.getReturnType(), false);
            }
            deserializedClassConstructorDescriptor.setCoroutinesExperimentalCompatibilityMode$deserialization(coroutinesCompatibilityMode);
            return deserializedClassConstructorDescriptor;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final Annotations getAnnotations(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (!Flags.HAS_ANNOTATIONS.get(i).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f173274c.getStorageManager(), new MemberDeserializer$getAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> r27, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r28, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r29) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.valueParameters(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode computeExperimentalityModeForFunctions(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r6, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> r7, kotlin.reflect.jvm.internal.impl.types.KotlinType r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.computeExperimentalityModeForFunctions(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, java.util.Collection, java.util.Collection, kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode");
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<? extends ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality, Visibility visibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map, boolean z) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, visibility, map, computeExperimentalityModeForFunctions(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor, list2, list, kotlinType, z));
    }
}
