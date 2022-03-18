package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public interface Substitutable<T extends DeclarationDescriptorNonRoot> {
    T substitute(TypeSubstitutor typeSubstitutor);
}
