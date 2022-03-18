package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    private List<TypeParameterDescriptor> declaredTypeParameters;
    private TypeSubstitutor newSubstitutor;
    private final ModuleAwareClassDescriptor original;
    private final TypeSubstitutor originalSubstitutor;
    private TypeConstructor typeConstructor;
    private List<TypeParameterDescriptor> typeConstructorParameters;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r15) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.$$$reportNull$$$0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor getCompanionObjectDescriptor() {
        return this.original.getCompanionObjectDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return this.original.getUnsubstitutedPrimaryConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.original.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.original.isCompanionObject();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.original.isData();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.original.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.original.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.original.isInner();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.original.getAnnotations();
        if (annotations == null) {
            $$$reportNull$$$0(18);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.original.getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(21);
        }
        return containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        getSubstitutor();
        List<TypeParameterDescriptor> list = this.declaredTypeParameters;
        if (list == null) {
            $$$reportNull$$$0(29);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind kind = this.original.getKind();
        if (kind == null) {
            $$$reportNull$$$0(24);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Modality getModality() {
        Modality modality = this.original.getModality();
        if (modality == null) {
            $$$reportNull$$$0(25);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.original.getName();
        if (name == null) {
            $$$reportNull$$$0(19);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor getOriginal() {
        ClassDescriptor original2 = this.original.getOriginal();
        if (original2 == null) {
            $$$reportNull$$$0(20);
        }
        return original2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        Collection<ClassDescriptor> sealedSubclasses = this.original.getSealedSubclasses();
        if (sealedSubclasses == null) {
            $$$reportNull$$$0(30);
        }
        return sealedSubclasses;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            $$$reportNull$$$0(28);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope staticScope = this.original.getStaticScope();
        if (staticScope == null) {
            $$$reportNull$$$0(15);
        }
        return staticScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope unsubstitutedInnerClassesScope = this.original.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            $$$reportNull$$$0(27);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Visibility getVisibility() {
        Visibility visibility = this.original.getVisibility();
        if (visibility == null) {
            $$$reportNull$$$0(26);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.original)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(getAnnotations(), getTypeConstructor(), TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeWithNonTrivialMemberScope == null) {
            $$$reportNull$$$0(16);
        }
        return simpleTypeWithNonTrivialMemberScope;
    }

    private TypeSubstitutor getSubstitutor() {
        if (this.newSubstitutor == null) {
            if (this.originalSubstitutor.isEmpty()) {
                this.newSubstitutor = this.originalSubstitutor;
            } else {
                List<TypeParameterDescriptor> parameters = this.original.getTypeConstructor().getParameters();
                this.typeConstructorParameters = new ArrayList(parameters.size());
                this.newSubstitutor = DescriptorSubstitutor.substituteTypeParameters(parameters, this.originalSubstitutor.getSubstitution(), this, this.typeConstructorParameters);
                this.declaredTypeParameters = CollectionsKt.filter(this.typeConstructorParameters, new Function1<TypeParameterDescriptor, Boolean>() {
                    /* class kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.C691711 */

                    public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
                        return Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
                    }
                });
            }
        }
        return this.newSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.original.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(getSubstitutor()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor2 = this.original.getTypeConstructor();
        if (this.originalSubstitutor.isEmpty()) {
            if (typeConstructor2 == null) {
                $$$reportNull$$$0(0);
            }
            return typeConstructor2;
        }
        if (this.typeConstructor == null) {
            TypeSubstitutor substitutor = getSubstitutor();
            Collection<KotlinType> supertypes = typeConstructor2.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            for (KotlinType kotlinType : supertypes) {
                arrayList.add(substitutor.substitute(kotlinType, Variance.INVARIANT));
            }
            this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeConstructorParameters, arrayList, LockBasedStorageManager.NO_LOCKS);
        }
        TypeConstructor typeConstructor3 = this.typeConstructor;
        if (typeConstructor3 == null) {
            $$$reportNull$$$0(1);
        }
        return typeConstructor3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(10);
        }
        MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(11);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(13);
        }
        MemberScope unsubstitutedMemberScope = this.original.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.originalSubstitutor.isEmpty()) {
            return new SubstitutingScope(unsubstitutedMemberScope, getSubstitutor());
        }
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(14);
        }
        return unsubstitutedMemberScope;
    }

    /* Return type fixed from 'kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor' to match base method */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassifierDescriptorWithTypeParameters substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(22);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), getSubstitutor().getSubstitution()));
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.original = moduleAwareClassDescriptor;
        this.originalSubstitutor = typeSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(5);
        }
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(6);
        }
        MemberScope memberScope = this.original.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.originalSubstitutor.isEmpty()) {
            return new SubstitutingScope(memberScope, getSubstitutor());
        }
        if (memberScope == null) {
            $$$reportNull$$$0(7);
        }
        return memberScope;
    }
}
