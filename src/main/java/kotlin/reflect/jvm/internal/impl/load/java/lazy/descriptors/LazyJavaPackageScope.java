package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    private final MemoizedFunctionToNullable<FindClassRequest, ClassDescriptor> classes;
    private final JavaPackage jPackage;
    private final NullableLazyValue<Set<String>> knownClassNamesInPackage;
    private final LazyJavaPackageFragment ownerDescriptor;

    /* access modifiers changed from: private */
    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {
            private final ClassDescriptor descriptor;

            public final ClassDescriptor getDescriptor() {
                return this.descriptor;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Found(ClassDescriptor classDescriptor) {
                super(null);
                Intrinsics.checkParameterIsNotNull(classDescriptor, "descriptor");
                this.descriptor = classDescriptor;
            }
        }

        private KotlinClassLookupResult() {
        }

        public static final class NotFound extends KotlinClassLookupResult {
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name) {
        Intrinsics.checkParameterIsNotNull(collection, "result");
        Intrinsics.checkParameterIsNotNull(name, "name");
    }

    /* access modifiers changed from: private */
    public static final class FindClassRequest {
        private final JavaClass javaClass;
        private final Name name;

        public final JavaClass getJavaClass() {
            return this.javaClass;
        }

        public final Name getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FindClassRequest) || !Intrinsics.areEqual(this.name, ((FindClassRequest) obj).name)) {
                return false;
            }
            return true;
        }

        public FindClassRequest(Name name2, JavaClass javaClass2) {
            Intrinsics.checkParameterIsNotNull(name2, "name");
            this.name = name2;
            this.javaClass = javaClass2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
        return findClassifier(javaClass.getName(), javaClass);
    }

    public final KotlinClassLookupResult resolveKotlinBinaryClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor resolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        if (resolveClass != null) {
            return new KotlinClassLookupResult.Found(resolveClass);
        }
        return KotlinClassLookupResult.NotFound.INSTANCE;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        return am.m265687a();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        return am.m265687a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return findClassifier(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        return CollectionsKt.emptyList();
    }

    private final ClassDescriptor findClassifier(Name name, JavaClass javaClass) {
        if (!SpecialNames.isSafeIdentifier(name)) {
            return null;
        }
        Set set = (Set) this.knownClassNamesInPackage.invoke();
        if (javaClass != null || set == null || set.contains(name.asString())) {
            return this.classes.invoke(new FindClassRequest(name, javaClass));
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter r5, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> r6) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Name name;
        Intrinsics.checkParameterIsNotNull(descriptorKindFilter, "kindFilter");
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return am.m265687a();
        }
        Set<String> set = (Set) this.knownClassNamesInPackage.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String str : set) {
                hashSet.add(Name.identifier(str));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.jPackage;
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : javaPackage.getClasses(function1)) {
            if (t.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
                name = null;
            } else {
                name = t.getName();
            }
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(javaPackage, "jPackage");
        Intrinsics.checkParameterIsNotNull(lazyJavaPackageFragment, "ownerDescriptor");
        this.jPackage = javaPackage;
        this.ownerDescriptor = lazyJavaPackageFragment;
        this.knownClassNamesInPackage = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new LazyJavaPackageScope$knownClassNamesInPackage$1(this, lazyJavaResolverContext));
        this.classes = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaPackageScope$classes$1(this, lazyJavaResolverContext));
    }
}
