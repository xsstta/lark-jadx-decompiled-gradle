package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.C69113a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public final class ReflectJavaAnnotationOwnerKt {
    public static final List<ReflectJavaAnnotation> getAnnotations(Annotation[] annotationArr) {
        Intrinsics.checkParameterIsNotNull(annotationArr, "$this$getAnnotations");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }

    public static final ReflectJavaAnnotation findAnnotation(Annotation[] annotationArr, FqName fqName) {
        Annotation annotation;
        Intrinsics.checkParameterIsNotNull(annotationArr, "$this$findAnnotation");
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (Intrinsics.areEqual(ReflectClassUtilKt.getClassId(C69113a.m265954a(C69113a.m265956a(annotation))).asSingleFqName(), fqName)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }
}
