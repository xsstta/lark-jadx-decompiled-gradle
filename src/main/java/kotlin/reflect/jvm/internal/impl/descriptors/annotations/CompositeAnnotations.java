package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.C69294l;

public final class CompositeAnnotations implements Annotations {
    private final List<Annotations> delegates;

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return C69294l.m266138d(CollectionsKt.asSequence(this.delegates), CompositeAnnotations$iterator$1.INSTANCE).mo4717a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends Annotations> list) {
        Intrinsics.checkParameterIsNotNull(list, "delegates");
        this.delegates = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(Annotations... annotationsArr) {
        this(C69043h.m265786k(annotationsArr));
        Intrinsics.checkParameterIsNotNull(annotationsArr, "delegates");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor findAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return (AnnotationDescriptor) C69294l.m266137d(C69294l.m266142f(CollectionsKt.asSequence(this.delegates), new CompositeAnnotations$findAnnotation$1(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        Iterator a = CollectionsKt.asSequence(this.delegates).mo4717a();
        while (a.hasNext()) {
            if (((Annotations) a.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }
}
