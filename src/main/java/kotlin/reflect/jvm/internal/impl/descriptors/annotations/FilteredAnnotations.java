package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class FilteredAnnotations implements Annotations {
    private final Annotations delegate;
    private final Function1<FqName, Boolean> fqNameFilter;
    private final boolean isDefinitelyNewInference;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z;
        Annotations annotations = this.delegate;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (shouldBeReturned((AnnotationDescriptor) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!this.isDefinitelyNewInference) {
            return z;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.delegate) {
            if (shouldBeReturned((AnnotationDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    private final boolean shouldBeReturned(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null || !this.fqNameFilter.invoke(fqName).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor findAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        if (this.fqNameFilter.invoke(fqName).booleanValue()) {
            return this.delegate.findAnnotation(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        if (this.fqNameFilter.invoke(fqName).booleanValue()) {
            return this.delegate.hasAnnotation(fqName);
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(Annotations annotations, Function1<? super FqName, Boolean> function1) {
        this(annotations, false, function1);
        Intrinsics.checkParameterIsNotNull(annotations, "delegate");
        Intrinsics.checkParameterIsNotNull(function1, "fqNameFilter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(Annotations annotations, boolean z, Function1<? super FqName, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(annotations, "delegate");
        Intrinsics.checkParameterIsNotNull(function1, "fqNameFilter");
        this.delegate = annotations;
        this.isDefinitelyNewInference = z;
        this.fqNameFilter = function1;
    }
}
