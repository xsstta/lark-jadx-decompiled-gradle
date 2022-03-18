package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

final class JvmBuiltInsSettings$getJdkMethodStatus$1<N> implements DFS.Neighbors<N> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$getJdkMethodStatus$1(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
    }

    public final List<LazyJavaClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        ClassifierDescriptor classifierDescriptor;
        Intrinsics.checkExpressionValueIsNotNull(classDescriptor, "it");
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "it.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkExpressionValueIsNotNull(supertypes, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor declarationDescriptor = it.next().getConstructor().getDeclarationDescriptor();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            if (declarationDescriptor != null) {
                classifierDescriptor = declarationDescriptor.getOriginal();
            } else {
                classifierDescriptor = null;
            }
            if (!(classifierDescriptor instanceof ClassDescriptor)) {
                classifierDescriptor = null;
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
            if (classDescriptor2 != null) {
                lazyJavaClassDescriptor = this.this$0.getJavaAnalogue(classDescriptor2);
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }
}
