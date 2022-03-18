package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class Annotations$Companion$EMPTY$1 implements Annotations {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public Void findAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "EMPTY";
    }

    Annotations$Companion$EMPTY$1() {
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return CollectionsKt.emptyList().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }
}
