package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class DeserializedClassDescriptor extends AbstractClassDescriptor {
    private final Annotations annotations;

    /* renamed from: c */
    private final DeserializationContext f173276c;
    public final ClassId classId;
    private final ProtoBuf.Class classProto;
    private final NullableLazyValue<ClassDescriptor> companionObjectDescriptor;
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> constructors;
    private final DeclarationDescriptor containingDeclaration;
    public final EnumEntryClassDescriptors enumEntries;
    private final ClassKind kind;
    private final ScopesHolderForClass<DeserializedClassMemberScope> memberScopeHolder;
    private final BinaryVersion metadataVersion;
    private final Modality modality;
    private final NullableLazyValue<ClassConstructorDescriptor> primaryConstructor;
    private final NotNullLazyValue<Collection<ClassDescriptor>> sealedSubclasses;
    private final SourceElement sourceElement;
    private final MemberScopeImpl staticScope;
    private final ProtoContainer.Class thisAsProtoContainer;
    public final DeserializedClassTypeConstructor typeConstructor;
    private final Visibility visibility;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    /* access modifiers changed from: private */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;
        public final KotlinTypeRefiner kotlinTypeRefiner;
        private final NotNullLazyValue<Collection<KotlinType>> refinedSupertypes;
        final /* synthetic */ DeserializedClassDescriptor this$0;

        public final DeserializedClassDescriptor getClassDescriptor() {
            return this.this$0;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<Name> getNonDeclaredVariableNames() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (KotlinType kotlinType : getClassDescriptor().typeConstructor.getSupertypes()) {
                CollectionsKt.addAll(linkedHashSet, kotlinType.getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<Name> getNonDeclaredFunctionNames() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (KotlinType kotlinType : getClassDescriptor().typeConstructor.getSupertypes()) {
                CollectionsKt.addAll(linkedHashSet, kotlinType.getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.this$0));
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public ClassId createClassId(Name name) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            ClassId createNestedClassId = this.this$0.classId.createNestedClassId(name);
            Intrinsics.checkExpressionValueIsNotNull(createNestedClassId, "classId.createNestedClassId(name)");
            return createNestedClassId;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
            Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
            return (Collection) this.allDescriptors.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        public void recordLookup(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getClassDescriptor(), name);
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1) {
            List list;
            Intrinsics.checkParameterIsNotNull(collection, "result");
            Intrinsics.checkParameterIsNotNull(function1, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            if (enumEntryClassDescriptors != null) {
                list = enumEntryClassDescriptors.all();
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            collection.addAll(list);
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(collection, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (KotlinType kotlinType : (Collection) this.refinedSupertypes.invoke()) {
                arrayList.addAll(kotlinType.getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, collection);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
            ClassDescriptor findEnumEntry;
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            if (enumEntryClassDescriptors == null || (findEnumEntry = enumEntryClassDescriptors.findEnumEntry(name)) == null) {
                return super.getContributedClassifier(name, lookupLocation);
            }
            return findEnumEntry;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredFunctions(Name name, Collection<SimpleFunctionDescriptor> collection) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            Intrinsics.checkParameterIsNotNull(collection, "functions");
            ArrayList arrayList = new ArrayList();
            for (KotlinType kotlinType : (Collection) this.refinedSupertypes.invoke()) {
                arrayList.addAll(kotlinType.getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            CollectionsKt.retainAll(collection, new DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1(this));
            collection.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.this$0));
            generateFakeOverrides(name, arrayList, collection);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner r9) {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner):void");
        }

        private final <D extends CallableMemberDescriptor> void generateFakeOverrides(Name name, Collection<? extends D> collection, Collection<D> collection2) {
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, collection, new ArrayList(collection2), getClassDescriptor(), new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(collection2));
        }
    }

    /* access modifiers changed from: private */
    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public DeserializedClassDescriptor getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        public String toString() {
            String name = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.checkExpressionValueIsNotNull(name, "name.toString()");
            return name;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<KotlinType> computeSupertypes() {
            String str;
            FqName asSingleFqName;
            List<ProtoBuf.Type> supertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supertypes, 10));
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(DeserializedClassDescriptor.this.getC().getTypeDeserializer().type(it.next()));
            }
            List<KotlinType> plus = CollectionsKt.plus((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            ArrayList arrayList2 = new ArrayList();
            for (KotlinType kotlinType : plus) {
                ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof NotFoundClasses.MockClassDescriptor)) {
                    declarationDescriptor = null;
                }
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = (NotFoundClasses.MockClassDescriptor) declarationDescriptor;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                ArrayList<NotFoundClasses.MockClassDescriptor> arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList4) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (asSingleFqName = classId.asSingleFqName()) == null || (str = asSingleFqName.asString()) == null) {
                        str = mockClassDescriptor2.getName().asString();
                    }
                    arrayList5.add(str);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList5);
            }
            return CollectionsKt.toList(plus);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(this));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final DeserializationContext getC() {
        return this.f173276c;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.classProto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.kind;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return this.sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Visibility getVisibility() {
        return this.visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.companionObjectDescriptor.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.constructors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f173276c.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return (Collection) this.sealedSubclasses.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.primaryConstructor.invoke();
    }

    private final DeserializedClassMemberScope getMemberScope() {
        return this.memberScopeHolder.getScope(this.f173276c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        if (Flags.CLASS_KIND.get(this.classProto.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.classProto.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_DATA.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        Boolean bool = Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
        Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_INNER.get(classProto.flags)");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public final class EnumEntryClassDescriptors {
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> enumEntryByName;
        public final Map<Name, ProtoBuf.EnumEntry> enumEntryProtos;
        public final NotNullLazyValue<Set<Name>> enumMemberNames;

        public final Collection<ClassDescriptor> all() {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.enumEntryProtos.keySet().iterator();
            while (it.hasNext()) {
                ClassDescriptor findEnumEntry = findEnumEntry(it.next());
                if (findEnumEntry != null) {
                    arrayList.add(findEnumEntry);
                }
            }
            return arrayList;
        }

        public final Set<Name> computeEnumMemberNames() {
            HashSet hashSet = new HashSet();
            for (KotlinType kotlinType : DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(kotlinType.getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            Intrinsics.checkExpressionValueIsNotNull(functionList, "classProto.functionList");
            for (T t : functionList) {
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                hashSet.add(NameResolverUtilKt.getName(nameResolver, t.getName()));
            }
            HashSet hashSet2 = hashSet;
            HashSet hashSet3 = hashSet2;
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            Intrinsics.checkExpressionValueIsNotNull(propertyList, "classProto.propertyList");
            for (T t2 : propertyList) {
                NameResolver nameResolver2 = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                hashSet2.add(NameResolverUtilKt.getName(nameResolver2, t2.getName()));
            }
            return am.m265692a((Set) hashSet3, (Iterable) hashSet2);
        }

        public final ClassDescriptor findEnumEntry(Name name) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            return this.enumEntryByName.invoke(name);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EnumEntryClassDescriptors() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            Intrinsics.checkExpressionValueIsNotNull(enumEntryList, "classProto.enumEntryList");
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (T t : list) {
                T t2 = t;
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                linkedHashMap.put(NameResolverUtilKt.getName(nameResolver, t2.getName()), t);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this));
            this.enumMemberNames = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(this));
        }
    }

    public final ClassDescriptor computeCompanionObjectDescriptor() {
        ClassDescriptor classDescriptor = null;
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor contributedClassifier = getMemberScope().getContributedClassifier(NameResolverUtilKt.getName(this.f173276c.getNameResolver(), this.classProto.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier instanceof ClassDescriptor) {
            classDescriptor = contributedClassifier;
        }
        return classDescriptor;
    }

    public final Collection<ClassConstructorDescriptor> computeConstructors() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) computeSecondaryConstructors(), (Iterable) CollectionsKt.listOfNotNull(getUnsubstitutedPrimaryConstructor())), (Iterable) this.f173276c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        if (isExpect()) {
            str = "expect";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" class ");
        sb.append(getName());
        return sb.toString();
    }

    private final List<ClassConstructorDescriptor> computeSecondaryConstructors() {
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkExpressionValueIsNotNull(constructorList, "classProto.constructorList");
        ArrayList arrayList = new ArrayList();
        for (T t : constructorList) {
            T t2 = t;
            Flags.BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            Boolean bool = booleanFlagField.get(t2.getFlags());
            Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.IS_SECONDARY.get(it.flags)");
            if (bool.booleanValue()) {
                arrayList.add(t);
            }
        }
        ArrayList<ProtoBuf.Constructor> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (ProtoBuf.Constructor constructor : arrayList2) {
            MemberDeserializer memberDeserializer = this.f173276c.getMemberDeserializer();
            Intrinsics.checkExpressionValueIsNotNull(constructor, "it");
            arrayList3.add(memberDeserializer.loadConstructor(constructor, false));
        }
        return arrayList3;
    }

    public final ClassConstructorDescriptor computePrimaryConstructor() {
        T t;
        if (this.kind.isSingleton()) {
            ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(getDefaultType());
            return createPrimaryConstructorForObject;
        }
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkExpressionValueIsNotNull(constructorList, "classProto.constructorList");
        Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            Flags.BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (!booleanFlagField.get(t2.getFlags()).booleanValue()) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            return this.f173276c.getMemberDeserializer().loadConstructor(t3, true);
        }
        return null;
    }

    public final Collection<ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        Intrinsics.checkExpressionValueIsNotNull(sealedSubclassFqNameList, "fqNames");
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return DescriptorUtilsKt.computeSealedSubclasses(this);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : sealedSubclassFqNameList) {
            DeserializationComponents components = this.f173276c.getComponents();
            NameResolver nameResolver = this.f173276c.getNameResolver();
            Intrinsics.checkExpressionValueIsNotNull(t, "index");
            ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, t.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScopeHolder.getScope(kotlinTypeRefiner);
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        return getMemberScope().getClassNames$deserialization().contains(name);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext deserializationContext, ProtoBuf.Class r10, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement2) {
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, r10.getFqName()).getShortClassName());
        MemberScopeImpl memberScopeImpl;
        EnumEntryClassDescriptors enumEntryClassDescriptors;
        NonEmptyDeserializedAnnotations nonEmptyDeserializedAnnotations;
        Intrinsics.checkParameterIsNotNull(deserializationContext, "outerContext");
        Intrinsics.checkParameterIsNotNull(r10, "classProto");
        Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        Intrinsics.checkParameterIsNotNull(binaryVersion, "metadataVersion");
        Intrinsics.checkParameterIsNotNull(sourceElement2, "sourceElement");
        this.classProto = r10;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement2;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, r10.getFqName());
        this.modality = ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(r10.getFlags()));
        this.visibility = ProtoEnumFlags.INSTANCE.visibility(Flags.VISIBILITY.get(r10.getFlags()));
        ClassKind classKind = ProtoEnumFlags.INSTANCE.classKind(Flags.CLASS_KIND.get(r10.getFlags()));
        this.kind = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = r10.getTypeParameterList();
        Intrinsics.checkExpressionValueIsNotNull(typeParameterList, "classProto.typeParameterList");
        ProtoBuf.TypeTable typeTable = r10.getTypeTable();
        Intrinsics.checkExpressionValueIsNotNull(typeTable, "classProto.typeTable");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r10.getVersionRequirementTable();
        Intrinsics.checkExpressionValueIsNotNull(versionRequirementTable, "classProto.versionRequirementTable");
        DeserializationContext childContext = deserializationContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion);
        this.f173276c = childContext;
        if (classKind == ClassKind.ENUM_CLASS) {
            memberScopeImpl = new StaticScopeForKotlinEnum(childContext.getStorageManager(), this);
        } else {
            memberScopeImpl = MemberScope.Empty.INSTANCE;
        }
        this.staticScope = memberScopeImpl;
        this.typeConstructor = new DeserializedClassTypeConstructor();
        this.memberScopeHolder = ScopesHolderForClass.Companion.create(this, childContext.getStorageManager(), childContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        ProtoContainer.Class r1 = null;
        if (classKind == ClassKind.ENUM_CLASS) {
            enumEntryClassDescriptors = new EnumEntryClassDescriptors();
        } else {
            enumEntryClassDescriptors = null;
        }
        this.enumEntries = enumEntryClassDescriptors;
        DeclarationDescriptor containingDeclaration2 = deserializationContext.getContainingDeclaration();
        this.containingDeclaration = containingDeclaration2;
        this.primaryConstructor = childContext.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.constructors = childContext.getStorageManager().createLazyValue(new DeserializedClassDescriptor$constructors$1(this));
        this.companionObjectDescriptor = childContext.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.sealedSubclasses = childContext.getStorageManager().createLazyValue(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        NameResolver nameResolver2 = childContext.getNameResolver();
        TypeTable typeTable3 = childContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) (!(containingDeclaration2 instanceof DeserializedClassDescriptor) ? null : containingDeclaration2);
        this.thisAsProtoContainer = new ProtoContainer.Class(r10, nameResolver2, typeTable3, sourceElement2, deserializedClassDescriptor != null ? deserializedClassDescriptor.thisAsProtoContainer : r1);
        if (!Flags.HAS_ANNOTATIONS.get(r10.getFlags()).booleanValue()) {
            nonEmptyDeserializedAnnotations = Annotations.Companion.getEMPTY();
        } else {
            nonEmptyDeserializedAnnotations = new NonEmptyDeserializedAnnotations(childContext.getStorageManager(), new DeserializedClassDescriptor$annotations$1(this));
        }
        this.annotations = nonEmptyDeserializedAnnotations;
    }
}
