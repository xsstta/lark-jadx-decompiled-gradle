package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {
    public static final Companion Companion = Companion.$$INSTANCE;

    AnnotationDescriptor findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Annotations EMPTY = new Annotations$Companion$EMPTY$1();

        private Companion() {
        }

        public final Annotations getEMPTY() {
            return EMPTY;
        }

        public final Annotations create(List<? extends AnnotationDescriptor> list) {
            Intrinsics.checkParameterIsNotNull(list, "annotations");
            if (list.isEmpty()) {
                return EMPTY;
            }
            return new AnnotationsImpl(list);
        }
    }

    public static final class DefaultImpls {
        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            if (annotations.findAnnotation(fqName) != null) {
                return true;
            }
            return false;
        }

        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            Iterator it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((AnnotationDescriptor) obj).getFqName(), fqName)) {
                    break;
                }
            }
            return (AnnotationDescriptor) obj;
        }
    }
}
