package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor implements TypeConstructor {
    private int hashCode;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r9) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.$$$reportNull$$$0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public abstract ClassDescriptor getDeclarationDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(getDeclarationDescriptor());
        if (builtIns == null) {
            $$$reportNull$$$0(1);
        }
        return builtIns;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public KotlinType defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        ClassDescriptor declarationDescriptor = getDeclarationDescriptor();
        if (hasMeaningfulFqName(declarationDescriptor)) {
            i = DescriptorUtils.getFqName(declarationDescriptor).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.hashCode = i;
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        this.hashCode = 0;
    }

    private static boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        DeclarationDescriptor containingDeclaration = getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(3);
            }
            return emptyList;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor companionObjectDescriptor = classDescriptor.getCompanionObjectDescriptor();
        if (z && companionObjectDescriptor != null) {
            smartList.add(companionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassDescriptor declarationDescriptor = getDeclarationDescriptor();
        ClassifierDescriptor declarationDescriptor2 = typeConstructor.getDeclarationDescriptor();
        if (!hasMeaningfulFqName(declarationDescriptor) || ((declarationDescriptor2 != null && !hasMeaningfulFqName(declarationDescriptor2)) || !(declarationDescriptor2 instanceof ClassDescriptor))) {
            return false;
        }
        return areFqNamesEqual(declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
    }

    private static boolean areFqNamesEqual(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (!classDescriptor.getName().equals(classDescriptor2.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = classDescriptor2.getContainingDeclaration();
        while (containingDeclaration != null && containingDeclaration2 != null) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                if (!(containingDeclaration2 instanceof PackageFragmentDescriptor) || !((PackageFragmentDescriptor) containingDeclaration).getFqName().equals(((PackageFragmentDescriptor) containingDeclaration2).getFqName())) {
                    return false;
                }
                return true;
            } else if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !containingDeclaration.getName().equals(containingDeclaration2.getName())) {
                return false;
            } else {
                containingDeclaration = containingDeclaration.getContainingDeclaration();
                containingDeclaration2 = containingDeclaration2.getContainingDeclaration();
            }
        }
        return true;
    }
}
