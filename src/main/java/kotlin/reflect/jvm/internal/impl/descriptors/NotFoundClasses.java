package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.am;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class NotFoundClasses {
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes;
    public final ModuleDescriptor module;
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments;
    public final StorageManager storageManager;

    public static final class MockClassDescriptor extends ClassDescriptorBase {
        private final boolean isInner;
        private final ClassTypeConstructorImpl typeConstructor;
        private final List<TypeParameterDescriptor> typeParameters;

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

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.typeParameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public boolean isInner() {
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return am.m265687a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassDescriptor> getSealedSubclasses() {
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Visibility getVisibility() {
            Visibility visibility = Visibilities.PUBLIC;
            Intrinsics.checkExpressionValueIsNotNull(visibility, "Visibilities.PUBLIC");
            return visibility;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public MemberScope.Empty getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.NO_SOURCE, false);
            Intrinsics.checkParameterIsNotNull(storageManager, "storageManager");
            Intrinsics.checkParameterIsNotNull(declarationDescriptor, "container");
            Intrinsics.checkParameterIsNotNull(name, "name");
            this.isInner = z;
            IntRange until = RangesKt.until(0, i);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int b = ((IntIterator) it).mo238946b();
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(b);
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, Name.identifier(sb.toString()), b, storageManager));
            }
            ArrayList arrayList2 = arrayList;
            this.typeParameters = arrayList2;
            this.typeConstructor = new ClassTypeConstructorImpl(this, arrayList2, am.m265686a(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }
    }

    /* access modifiers changed from: private */
    public static final class ClassRequest {
        private final ClassId classId;
        private final List<Integer> typeParametersCount;

        public final ClassId component1() {
            return this.classId;
        }

        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.areEqual(this.classId, classRequest.classId) && Intrinsics.areEqual(this.typeParametersCount, classRequest.typeParametersCount);
        }

        public int hashCode() {
            ClassId classId2 = this.classId;
            int i = 0;
            int hashCode = (classId2 != null ? classId2.hashCode() : 0) * 31;
            List<Integer> list = this.typeParametersCount;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ")";
        }

        public ClassRequest(ClassId classId2, List<Integer> list) {
            Intrinsics.checkParameterIsNotNull(classId2, "classId");
            Intrinsics.checkParameterIsNotNull(list, "typeParametersCount");
            this.classId = classId2;
            this.typeParametersCount = list;
        }
    }

    public final ClassDescriptor getClass(ClassId classId, List<Integer> list) {
        Intrinsics.checkParameterIsNotNull(classId, "classId");
        Intrinsics.checkParameterIsNotNull(list, "typeParametersCount");
        return this.classes.invoke(new ClassRequest(classId, list));
    }

    public NotFoundClasses(StorageManager storageManager2, ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(storageManager2, "storageManager");
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        this.storageManager = storageManager2;
        this.module = moduleDescriptor;
        this.packageFragments = storageManager2.createMemoizedFunction(new NotFoundClasses$packageFragments$1(this));
        this.classes = storageManager2.createMemoizedFunction(new NotFoundClasses$classes$1(this));
    }
}
