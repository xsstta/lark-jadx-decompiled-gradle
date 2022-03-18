package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;

public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    AnnotatedElement getElement();

    public static final class DefaultImpls {
        public static boolean isDeprecatedInJavaDoc(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            return false;
        }

        public static List<ReflectJavaAnnotation> getAnnotations(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            Annotation[] declaredAnnotations;
            List<ReflectJavaAnnotation> annotations;
            AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) {
                return CollectionsKt.emptyList();
            }
            return annotations;
        }

        public static ReflectJavaAnnotation findAnnotation(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner, FqName fqName) {
            Annotation[] declaredAnnotations;
            Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
                return null;
            }
            return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
        }
    }
}
