package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> PUBLIC_METHOD_NAMES_IN_OBJECT = am.m265689a((Object[]) new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    public final ClassDescriptor additionalSupertypeClassDescriptor;
    private final Annotations annotations;

    /* renamed from: c */
    public final LazyJavaResolverContext f173269c;
    private final NotNullLazyValue<List<TypeParameterDescriptor>> declaredParameters;
    private final InnerClassesScopeWrapper innerClassesScope;
    private final boolean isInner;
    private final JavaClass jClass;
    private final ClassKind kind;
    private final Modality modality;
    private final LazyJavaResolverContext outerContext;
    private final ScopesHolderForClass<LazyJavaClassMemberScope> scopeHolder;
    private final LazyJavaStaticClassScope staticScope;
    private final LazyJavaClassTypeConstructor typeConstructor;
    public final LazyJavaClassMemberScope unsubstitutedMemberScope;
    private final Visibility visibility;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final JavaClass getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.isInner;
    }

    /* access modifiers changed from: private */
    public final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public ClassDescriptor getDeclarationDescriptor() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return LazyJavaClassDescriptor.this.f173269c.getComponents().getSupertypeLoopChecker();
        }

        public String toString() {
            String asString = LazyJavaClassDescriptor.this.getName().asString();
            Intrinsics.checkExpressionValueIsNotNull(asString, "name.asString()");
            return asString;
        }

        private final FqName getPurelyImplementsFqNameFromAnnotation() {
            String str;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName fqName = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
            if (findAnnotation == null) {
                return null;
            }
            Object singleOrNull = CollectionsKt.singleOrNull(findAnnotation.getAllValueArguments().values());
            if (!(singleOrNull instanceof StringValue)) {
                singleOrNull = null;
            }
            StringValue stringValue = (StringValue) singleOrNull;
            if (stringValue == null || (str = (String) stringValue.getValue()) == null || !FqNamesUtilKt.isValidJavaFqName(str)) {
                return null;
            }
            return new FqName(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r3 != false) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getPurelyImplementedSupertype() {
            /*
            // Method dump skipped, instructions count: 244
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype():kotlin.reflect.jvm.internal.impl.types.KotlinType");
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<KotlinType> computeSupertypes() {
            Object obj;
            List list;
            Collection<JavaClassifierType> supertypes = LazyJavaClassDescriptor.this.getJClass().getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            ArrayList arrayList2 = new ArrayList(0);
            KotlinType purelyImplementedSupertype = getPurelyImplementedSupertype();
            Iterator<JavaClassifierType> it = supertypes.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType transformJavaType = LazyJavaClassDescriptor.this.f173269c.getTypeResolver().transformJavaType(next, JavaTypeResolverKt.toAttributes$default(TypeUsage.SUPERTYPE, false, null, 3, null));
                if (transformJavaType.getConstructor().getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                TypeConstructor constructor = transformJavaType.getConstructor();
                if (purelyImplementedSupertype != null) {
                    obj = purelyImplementedSupertype.getConstructor();
                }
                if (!Intrinsics.areEqual(constructor, obj) && !KotlinBuiltIns.isAnyOrNullableAny(transformJavaType)) {
                    arrayList.add(transformJavaType);
                }
            }
            ArrayList arrayList3 = arrayList;
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.additionalSupertypeClassDescriptor;
            if (classDescriptor != null) {
                obj = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, LazyJavaClassDescriptor.this).buildSubstitutor().substitute(classDescriptor.getDefaultType(), Variance.INVARIANT);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList3, obj);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList3, purelyImplementedSupertype);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = LazyJavaClassDescriptor.this.f173269c.getComponents().getErrorReporter();
                ClassDescriptor declarationDescriptor = getDeclarationDescriptor();
                ArrayList<JavaType> arrayList4 = arrayList2;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                for (JavaType javaType : arrayList4) {
                    if (javaType != null) {
                        arrayList5.add(((JavaClassifierType) javaType).getPresentableText());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    }
                }
                errorReporter.reportIncompleteHierarchy(declarationDescriptor, arrayList5);
            }
            if (!arrayList3.isEmpty()) {
                list = CollectionsKt.toList(arrayList);
            } else {
                list = CollectionsKt.listOf(LazyJavaClassDescriptor.this.f173269c.getModule().getBuiltIns().getAnyType());
            }
            return list;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f173269c.getStorageManager());
            this.parameters = LazyJavaClassDescriptor.this.f173269c.getStorageManager().createLazyValue(new LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(this));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return (List) this.unsubstitutedMemberScope.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return (List) this.declaredParameters.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope2 = super.getUnsubstitutedMemberScope();
        if (unsubstitutedMemberScope2 != null) {
            return (LazyJavaClassMemberScope) unsubstitutedMemberScope2;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Visibility getVisibility() {
        Visibility visibility2;
        if (!Intrinsics.areEqual(this.visibility, Visibilities.PRIVATE) || this.jClass.getOuterClass() != null) {
            visibility2 = this.visibility;
        } else {
            visibility2 = JavaVisibilities.PACKAGE_VISIBILITY;
        }
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "if (visibility == Visibi…ISIBILITY else visibility");
        return visibility2;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.scopeHolder.getScope(kotlinTypeRefiner);
    }

    public final LazyJavaClassDescriptor copy$descriptors_jvm(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f173269c;
        LazyJavaResolverContext replaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "containingDeclaration");
        return new LazyJavaClassDescriptor(replaceComponents, containingDeclaration, this.jClass, classDescriptor);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor) {
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, javaClass.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaClass), false);
        boolean z;
        ClassKind classKind;
        Modality modality2;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "outerContext");
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "containingDeclaration");
        Intrinsics.checkParameterIsNotNull(javaClass, "jClass");
        this.outerContext = lazyJavaResolverContext;
        this.jClass = javaClass;
        this.additionalSupertypeClassDescriptor = classDescriptor;
        LazyJavaResolverContext childForClassOrPackage$default = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, javaClass, 0, 4, null);
        this.f173269c = childForClassOrPackage$default;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this;
        childForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(javaClass, lazyJavaClassDescriptor);
        if (javaClass.getLightClassOriginKind() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            if (javaClass.isAnnotationType()) {
                classKind = ClassKind.ANNOTATION_CLASS;
            } else if (javaClass.isInterface()) {
                classKind = ClassKind.INTERFACE;
            } else if (javaClass.isEnum()) {
                classKind = ClassKind.ENUM_CLASS;
            } else {
                classKind = ClassKind.CLASS;
            }
            this.kind = classKind;
            if (javaClass.isAnnotationType() || javaClass.isEnum()) {
                modality2 = Modality.FINAL;
            } else {
                Modality.Companion companion = Modality.Companion;
                if (javaClass.isAbstract() || javaClass.isInterface()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                modality2 = companion.convertFromFlags(z4, !javaClass.isFinal());
            }
            this.modality = modality2;
            this.visibility = javaClass.getVisibility();
            if (javaClass.getOuterClass() == null || javaClass.isStatic()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.isInner = z2;
            this.typeConstructor = new LazyJavaClassTypeConstructor();
            if (classDescriptor != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(childForClassOrPackage$default, lazyJavaClassDescriptor, javaClass, z3, null, 16, null);
            this.unsubstitutedMemberScope = lazyJavaClassMemberScope;
            this.scopeHolder = ScopesHolderForClass.Companion.create(lazyJavaClassDescriptor, childForClassOrPackage$default.getStorageManager(), childForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new LazyJavaClassDescriptor$scopeHolder$1(this));
            this.innerClassesScope = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
            this.staticScope = new LazyJavaStaticClassScope(childForClassOrPackage$default, javaClass, this);
            this.annotations = LazyJavaAnnotationsKt.resolveAnnotations(childForClassOrPackage$default, javaClass);
            this.declaredParameters = childForClassOrPackage$default.getStorageManager().createLazyValue(new LazyJavaClassDescriptor$declaredParameters$1(this));
            return;
        }
        throw new AssertionError("Creating LazyJavaClassDescriptor for light class " + javaClass);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? null : classDescriptor);
    }
}
