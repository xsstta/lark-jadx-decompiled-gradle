package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

public final class LazyJavaClassMemberScope extends LazyJavaScope {
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> constructors;
    public final NotNullLazyValue<Map<Name, JavaField>> enumEntryIndex;
    public final JavaClass jClass;
    public final NotNullLazyValue<Set<Name>> nestedClassIndex;
    private final MemoizedFunctionToNullable<Name, ClassDescriptorBase> nestedClasses;
    private final ClassDescriptor ownerDescriptor;
    private final boolean skipRefinement;

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaClassMemberScope$computeMemberIndex$1.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.jClass.getFqName();
    }

    private final Collection<KotlinType> computeSupertypes() {
        if (!this.skipRefinement) {
            return getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
        }
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkExpressionValueIsNotNull(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        return supertypes;
    }

    public final ClassConstructorDescriptor createDefaultConstructor() {
        List<ValueParameterDescriptor> list;
        boolean isAnnotationType = this.jClass.isAnnotationType();
        if ((this.jClass.isInterface() || !this.jClass.hasDefaultConstructor()) && !isAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor2 = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor2, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        Intrinsics.checkExpressionValueIsNotNull(createJavaConstructor, "JavaClassConstructorDesc….source(jClass)\n        )");
        if (isAnnotationType) {
            list = createAnnotationConstructorParameters(createJavaConstructor);
        } else {
            list = Collections.emptyList();
        }
        createJavaConstructor.setHasSynthesizedParameterNames(false);
        createJavaConstructor.initialize(list, getConstructorVisibility(ownerDescriptor2));
        createJavaConstructor.setHasStableParameterNames(true);
        createJavaConstructor.setReturnType(ownerDescriptor2.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, createJavaConstructor);
        return createJavaConstructor;
    }

    private final Visibility getConstructorVisibility(ClassDescriptor classDescriptor) {
        Visibility visibility = classDescriptor.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "classDescriptor.visibility");
        if (!Intrinsics.areEqual(visibility, JavaVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        Visibility visibility2 = JavaVisibilities.PROTECTED_AND_PACKAGE;
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "JavaVisibilities.PROTECTED_AND_PACKAGE");
        return visibility2;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkParameterIsNotNull(javaMethodDescriptor, "$this$isVisibleAsFunction");
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(javaMethodDescriptor);
    }

    private final Set<SimpleFunctionDescriptor> getFunctionsFromSupertypes(Name name) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = computeSupertypes().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, it.next().getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Collection<SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic(Name name) {
        Collection<JavaMethod> findMethodsByName = ((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(findMethodsByName, 10));
        Iterator<T> it = findMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor(it.next()));
        }
        return arrayList;
    }

    public final Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic(Name name) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (T t : getFunctionsFromSupertypes(name)) {
            T t2 = t;
            if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(t2) || BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(t2) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private final boolean doesOverrideSuspendFunction(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        SimpleFunctionDescriptor createSuspendView = createSuspendView(simpleFunctionDescriptor);
        if (createSuspendView == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if ((functionsFromSupertypes instanceof Collection) && functionsFromSupertypes.isEmpty()) {
            return false;
        }
        for (T t : functionsFromSupertypes) {
            if (!t.isSuspend() || !doesOverride(createSuspendView, t)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final Set<PropertyDescriptor> getPropertiesFromSupertypes(Name name) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = computeSupertypes().iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = it.next().getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return CollectionsKt.toSet(arrayList);
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "name");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getFunctionsFromSupertypes(name2).iterator();
        while (it.hasNext()) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        ArrayList<FunctionDescriptor> arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return false;
        }
        for (FunctionDescriptor functionDescriptor : arrayList2) {
            if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, functionDescriptor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.createSuspendView(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    private final boolean doesOverrideRenamedBuiltins(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        List<Name> builtinFunctionNamesByJvmName = builtinMethodsWithDifferentJvmName.getBuiltinFunctionNamesByJvmName(name);
        if (!(builtinFunctionNamesByJvmName instanceof Collection) || !builtinFunctionNamesByJvmName.isEmpty()) {
            for (T t : builtinFunctionNamesByJvmName) {
                ArrayList arrayList = new ArrayList();
                for (T t2 : getFunctionsFromSupertypes(t)) {
                    if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(t2)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(simpleFunctionDescriptor, t);
                    ArrayList arrayList3 = arrayList2;
                    if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (doesOverrideRenamedDescriptor((SimpleFunctionDescriptor) it.next(), createRenamedCopy)) {
                                    z = true;
                                    continue;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                z = false;
                continue;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isVisibleAsFunctionInCurrentClass(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r7) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):boolean");
    }

    public final JavaClassConstructorDescriptor resolveConstructor(JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor2 = getOwnerDescriptor();
        JavaConstructor javaConstructor2 = javaConstructor;
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor2, LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaConstructor2));
        Intrinsics.checkExpressionValueIsNotNull(createJavaConstructor, "JavaClassConstructorDesc…ce(constructor)\n        )");
        LazyJavaResolverContext childForMethod = ContextKt.childForMethod(getC(), createJavaConstructor, javaConstructor, ownerDescriptor2.getDeclaredTypeParameters().size());
        LazyJavaScope.ResolvedValueParameters resolveValueParameters = resolveValueParameters(childForMethod, createJavaConstructor, javaConstructor.getValueParameters());
        List<TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor2.getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "classDescriptor.declaredTypeParameters");
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor resolveTypeParameter = childForMethod.getTypeParameterResolver().resolveTypeParameter(it.next());
            if (resolveTypeParameter == null) {
                Intrinsics.throwNpe();
            }
            arrayList.add(resolveTypeParameter);
        }
        createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), javaConstructor.getVisibility(), CollectionsKt.plus((Collection) list, (Iterable) arrayList));
        createJavaConstructor.setHasStableParameterNames(false);
        createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
        createJavaConstructor.setReturnType(ownerDescriptor2.getDefaultType());
        childForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor2, createJavaConstructor);
        return createJavaConstructor;
    }

    private final List<ValueParameterDescriptor> createAnnotationConstructorParameters(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        boolean z;
        int i;
        Pair pair;
        Collection<JavaMethod> methods = this.jClass.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (T t : methods) {
            if (Intrinsics.areEqual(t.getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(t);
            } else {
                arrayList3.add(t);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<JavaMethod> list2 = (List) pair2.component2();
        int i2 = 0;
        if (list.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            JavaMethod javaMethod = (JavaMethod) CollectionsKt.firstOrNull(list);
            if (javaMethod != null) {
                JavaType returnType = javaMethod.getReturnType();
                if (returnType instanceof JavaArrayType) {
                    JavaArrayType javaArrayType = (JavaArrayType) returnType;
                    pair = new Pair(getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
                } else {
                    pair = new Pair(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
                }
                addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (KotlinType) pair.component1(), (KotlinType) pair.component2());
            }
            if (javaMethod != null) {
                i = 1;
            } else {
                i = 0;
            }
            for (JavaMethod javaMethod2 : list2) {
                addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, i2 + i, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
                i2++;
            }
            return arrayList;
        }
        throw new AssertionError("There can't be more than one method named 'value' in annotation class: " + this.jClass);
    }

    private final SimpleFunctionDescriptor createRenamedCopy(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setName(name);
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        FunctionDescriptor build = newCopyBuilder.build();
        if (build == null) {
            Intrinsics.throwNpe();
        }
        return (SimpleFunctionDescriptor) build;
    }

    private final boolean doesOverrideRenamedDescriptor(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        Intrinsics.checkExpressionValueIsNotNull(functionDescriptor, "if (superDescriptor.isRe…iginal else subDescriptor");
        return doesOverride(functionDescriptor, simpleFunctionDescriptor);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        return am.m265692a((Set) this.nestedClassIndex.invoke(), (Iterable) ((Map) this.enumEntryIndex.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return super.getContributedFunctions(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
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
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getOwnerDescriptor(), name);
    }

    private final void computeAnnotationProperties(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name));
        if (javaMethod != null) {
            collection.add(createPropertyDescriptorWithDefaultGetter$default(this, javaMethod, null, Modality.FINAL, 2, null));
        }
    }

    private final boolean doesClassOverridesProperty(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        SimpleFunctionDescriptor findSetterOverride = findSetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            return false;
        }
        if (!propertyDescriptor.isVar()) {
            return true;
        }
        if (findSetterOverride == null || findSetterOverride.getModality() != findGetterOverride.getModality()) {
            return false;
        }
        return true;
    }

    private final boolean doesOverride(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true);
        Intrinsics.checkExpressionValueIsNotNull(isOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = isOverridableByWithoutExternalConditions.getResult();
        Intrinsics.checkExpressionValueIsNotNull(result, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
        if (result != OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE || JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor)) {
            return false;
        }
        return true;
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        Intrinsics.checkExpressionValueIsNotNull(original, "builtinWithErasedParameters.original");
        if (!Intrinsics.areEqual(computeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) || doesOverride(simpleFunctionDescriptor, functionDescriptor)) {
            return false;
        }
        return true;
    }

    private final SimpleFunctionDescriptor obtainOverrideForSuspend(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : (Iterable) function1.invoke(name)) {
            SimpleFunctionDescriptor createSuspendView = createSuspendView(simpleFunctionDescriptor2);
            if (createSuspendView == null || !doesOverride(createSuspendView, simpleFunctionDescriptor)) {
                createSuspendView = null;
                continue;
            }
            if (createSuspendView != null) {
                return createSuspendView;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        MemoizedFunctionToNullable<Name, ClassDescriptorBase> memoizedFunctionToNullable;
        ClassDescriptorBase invoke;
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) getMainScope();
        if (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.nestedClasses) == null || (invoke = memoizedFunctionToNullable.invoke(name)) == null) {
            return this.nestedClasses.invoke(name);
        }
        return invoke;
    }

    private final SimpleFunctionDescriptor findGetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor propertyGetterDescriptor;
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        String str = null;
        if (getter != null) {
            propertyGetterDescriptor = (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter);
        } else {
            propertyGetterDescriptor = null;
        }
        if (propertyGetterDescriptor != null) {
            str = BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor);
        }
        if (str != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return findGetterByName(propertyDescriptor, str, function1);
        }
        String str2 = JvmAbi.getterName(propertyDescriptor.getName().asString());
        Intrinsics.checkExpressionValueIsNotNull(str2, "JvmAbi.getterName(name.asString())");
        return findGetterByName(propertyDescriptor, str2, function1);
    }

    private final SimpleFunctionDescriptor findSetterOverride(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        Name identifier = Name.identifier(JvmAbi.setterName(propertyDescriptor.getName().asString()));
        Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
                Object single = CollectionsKt.single((List) valueParameters);
                Intrinsics.checkExpressionValueIsNotNull(single, "descriptor.valueParameters.single()");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) single).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public HashSet<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkExpressionValueIsNotNull(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        HashSet<Name> hashSet = new HashSet<>();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(hashSet, it.next().getMemberScope().getFunctionNames());
        }
        HashSet<Name> hashSet2 = hashSet;
        hashSet2.addAll(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        hashSet2.addAll(computeClassNames(descriptorKindFilter, function1));
        return hashSet2;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(collection, "result");
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(name, collection);
        }
        Set<PropertyDescriptor> propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (!propertiesFromSupertypes.isEmpty()) {
            SmartSet create = SmartSet.Companion.create();
            addPropertyOverrideByMethod(propertiesFromSupertypes, collection, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            addPropertyOverrideByMethod(propertiesFromSupertypes, create, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            Collection<? extends PropertyDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, am.m265692a((Set) propertiesFromSupertypes, (Iterable) create), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            Intrinsics.checkExpressionValueIsNotNull(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt…rridingUtil\n            )");
            collection.addAll(resolveOverridesForNonStaticMembers);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkExpressionValueIsNotNull(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(linkedHashSet, it.next().getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    private final SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object obj;
        Name name = functionDescriptor.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "overridden.name");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hasSameJvmDescriptorButDoesNotOverride((SimpleFunctionDescriptor) obj, functionDescriptor)) {
                break;
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "overridden.valueParameters");
        List<ValueParameterDescriptor> list = valueParameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            KotlinType type = t.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            arrayList.add(new ValueParameterData(type, t.declaresDefaultValue()));
        }
        List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "override.valueParameters");
        newCopyBuilder.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        newCopyBuilder.setSignatureChange();
        newCopyBuilder.setPreserveSourceElement();
        return (SimpleFunctionDescriptor) newCopyBuilder.build();
    }

    private final JavaPropertyDescriptor createPropertyDescriptorByMethods(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
        Modality modality = null;
        if (!doesClassOverridesProperty(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            Intrinsics.throwNpe();
        }
        if (propertyDescriptor.isVar()) {
            simpleFunctionDescriptor = findSetterOverride(propertyDescriptor, function1);
            if (simpleFunctionDescriptor == null) {
                Intrinsics.throwNpe();
            }
        } else {
            simpleFunctionDescriptor = null;
        }
        boolean z = true;
        if (!(simpleFunctionDescriptor == null || simpleFunctionDescriptor.getModality() == findGetterOverride.getModality())) {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), findGetterOverride, simpleFunctionDescriptor, propertyDescriptor);
            KotlinType returnType = findGetterOverride.getReturnType();
            if (returnType == null) {
                Intrinsics.throwNpe();
            }
            javaForKotlinOverridePropertyDescriptor.setType(returnType, CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = javaForKotlinOverridePropertyDescriptor;
            PropertyGetterDescriptorImpl createGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor2, findGetterOverride.getAnnotations(), false, false, false, findGetterOverride.getSource());
            createGetter.setInitialSignatureDescriptor(findGetterOverride);
            createGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
            Intrinsics.checkExpressionValueIsNotNull(createGetter, "DescriptorFactory.create…escriptor.type)\n        }");
            if (simpleFunctionDescriptor != null) {
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
                Intrinsics.checkExpressionValueIsNotNull(valueParameters, "setterMethod.valueParameters");
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) valueParameters);
                if (valueParameterDescriptor != null) {
                    propertySetterDescriptorImpl = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptor.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor.getSource());
                    propertySetterDescriptorImpl.setInitialSignatureDescriptor(simpleFunctionDescriptor);
                } else {
                    throw new AssertionError("No parameter found for " + simpleFunctionDescriptor);
                }
            }
            javaForKotlinOverridePropertyDescriptor.initialize(createGetter, propertySetterDescriptorImpl);
            return javaForKotlinOverridePropertyDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Different accessors modalities when creating overrides for ");
        sb.append(propertyDescriptor);
        sb.append(" in ");
        sb.append(getOwnerDescriptor());
        sb.append("for getter is ");
        sb.append(findGetterOverride.getModality());
        sb.append(", but for setter is ");
        if (simpleFunctionDescriptor != null) {
            modality = simpleFunctionDescriptor.getModality();
        }
        sb.append(modality);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(collection, "result");
        Intrinsics.checkParameterIsNotNull(name, "name");
        Set<SimpleFunctionDescriptor> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (!BuiltinMethodsWithDifferentJvmName.INSTANCE.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            Set<SimpleFunctionDescriptor> set = functionsFromSupertypes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (T t : set) {
                    if (isVisibleAsFunctionInCurrentClass(t)) {
                        arrayList.add(t);
                    }
                }
                addFunctionFromSupertypes(collection, name, arrayList, false);
                return;
            }
        }
        SmartSet create = SmartSet.Companion.create();
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, CollectionsKt.emptyList(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkExpressionValueIsNotNull(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt….overridingUtil\n        )");
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this;
        addOverriddenSpecialMethods(name, collection, resolveOverridesForNonStaticMembers, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(lazyJavaClassMemberScope));
        addOverriddenSpecialMethods(name, collection, resolveOverridesForNonStaticMembers, create, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(lazyJavaClassMemberScope));
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass(t2)) {
                arrayList2.add(t2);
            }
        }
        addFunctionFromSupertypes(collection, name, CollectionsKt.plus((Collection) arrayList2, (Iterable) create), true);
    }

    private final void addPropertyOverrideByMethod(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor createPropertyDescriptorByMethods = createPropertyDescriptorByMethods(propertyDescriptor, function1);
            if (createPropertyDescriptorByMethods != null) {
                collection.add(createPropertyDescriptorByMethods);
                return;
            }
        }
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltInWithErasedValueParametersInJava(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded;
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null || (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overriddenBuiltinFunctionWithErasedValueParametersInJava, function1)) == null) {
            return null;
        }
        if (!isVisibleAsFunctionInCurrentClass(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
            createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = null;
        }
        if (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded != null) {
            return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
        }
        return null;
    }

    private final SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        boolean z;
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        boolean z2 = false;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(!Intrinsics.areEqual(simpleFunctionDescriptor, next)) || next.getInitialSignatureDescriptor() != null || !doesOverride(next, callableDescriptor)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return simpleFunctionDescriptor;
        }
        FunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
        if (build == null) {
            Intrinsics.throwNpe();
        }
        return (SimpleFunctionDescriptor) build;
    }

    private final JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        JavaPropertyDescriptor create = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), modality, javaMethod.getVisibility(), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
        Intrinsics.checkExpressionValueIsNotNull(create, "JavaPropertyDescriptor.c…inal = */ false\n        )");
        PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(create, Annotations.Companion.getEMPTY());
        Intrinsics.checkExpressionValueIsNotNull(createDefaultGetter, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
        create.initialize(createDefaultGetter, null);
        if (kotlinType == null) {
            kotlinType = computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(getC(), create, javaMethod, 0, 4, null));
        }
        create.setType(kotlinType, CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        createDefaultGetter.initialize(kotlinType);
        return create;
    }

    private final SimpleFunctionDescriptor findGetterByName(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        boolean z;
        Name identifier = Name.identifier(str);
        Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(getterName)");
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null) {
                    z = kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType());
                } else {
                    z = false;
                }
                if (z) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final void addFunctionFromSupertypes(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<? extends SimpleFunctionDescriptor> resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkExpressionValueIsNotNull(resolveOverridesForNonStaticMembers, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(resolveOverridesForNonStaticMembers);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = resolveOverridesForNonStaticMembers;
        List plus = CollectionsKt.plus((Collection) collection, (Iterable) collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
        for (T t : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(t);
            if (simpleFunctionDescriptor != null) {
                Intrinsics.checkExpressionValueIsNotNull(t, "resolvedOverride");
                t = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(t, simpleFunctionDescriptor, plus);
            }
            arrayList.add(t);
        }
        collection.addAll(arrayList);
    }

    private final SimpleFunctionDescriptor obtainOverrideForBuiltinWithDifferentJvmName(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 != null) {
            String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
            if (jvmMethodNameIfSpecial == null) {
                Intrinsics.throwNpe();
            }
            Name identifier = Name.identifier(jvmMethodNameIfSpecial);
            Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(nameInJava)");
            for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : (Collection) function1.invoke(identifier)) {
                SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(simpleFunctionDescriptor3, name);
                if (doesOverrideRenamedDescriptor(simpleFunctionDescriptor2, createRenamedCopy)) {
                    return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createRenamedCopy, simpleFunctionDescriptor2, collection);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaScope.MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2) {
        Intrinsics.checkParameterIsNotNull(javaMethod, "method");
        Intrinsics.checkParameterIsNotNull(list, "methodTypeParameters");
        Intrinsics.checkParameterIsNotNull(kotlinType, "returnType");
        Intrinsics.checkParameterIsNotNull(list2, "valueParameters");
        SignaturePropagator.PropagatedSignature resolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, getOwnerDescriptor(), kotlinType, null, list2, list);
        Intrinsics.checkExpressionValueIsNotNull(resolvePropagatedSignature, "c.components.signaturePr…dTypeParameters\n        )");
        KotlinType returnType = resolvePropagatedSignature.getReturnType();
        Intrinsics.checkExpressionValueIsNotNull(returnType, "propagated.returnType");
        KotlinType receiverType = resolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters = resolvePropagatedSignature.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "propagated.valueParameters");
        List<TypeParameterDescriptor> typeParameters = resolvePropagatedSignature.getTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(typeParameters, "propagated.typeParameters");
        boolean hasStableParameterNames = resolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = resolvePropagatedSignature.getErrors();
        Intrinsics.checkExpressionValueIsNotNull(errors, "propagated.errors");
        return new LazyJavaScope.MethodSignatureData(returnType, receiverType, valueParameters, typeParameters, hasStableParameterNames, errors);
    }

    private final void addOverriddenSpecialMethods(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltinWithDifferentJvmName(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForBuiltInWithErasedValueParametersInJava(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, obtainOverrideForSuspend(simpleFunctionDescriptor, function1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(classDescriptor, "ownerDescriptor");
        Intrinsics.checkParameterIsNotNull(javaClass, "jClass");
        this.ownerDescriptor = classDescriptor;
        this.jClass = javaClass;
        this.skipRefinement = z;
        this.constructors = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$constructors$1(this, lazyJavaResolverContext));
        this.nestedClassIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.enumEntryIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.nestedClasses = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaClassMemberScope$nestedClasses$1(this, lazyJavaResolverContext));
    }

    static /* synthetic */ JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter$default(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter(javaMethod, kotlinType, modality);
    }

    private final void addAnnotationValueParameter(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinType3;
        ConstructorDescriptor constructorDescriptor2 = constructorDescriptor;
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkExpressionValueIsNotNull(makeNotNullable, "TypeUtils.makeNotNullable(returnType)");
        boolean hasAnnotationParameterDefaultValue = javaMethod.getHasAnnotationParameterDefaultValue();
        if (kotlinType2 != null) {
            kotlinType3 = TypeUtils.makeNotNullable(kotlinType2);
        } else {
            kotlinType3 = null;
        }
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor2, null, i, empty, name, makeNotNullable, hasAnnotationParameterDefaultValue, false, false, kotlinType3, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }
}
