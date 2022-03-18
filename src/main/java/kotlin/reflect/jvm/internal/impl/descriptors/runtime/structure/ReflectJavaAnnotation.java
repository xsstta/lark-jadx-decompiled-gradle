package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.C69113a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {
    private final Annotation annotation;

    public final Annotation getAnnotation() {
        return this.annotation;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return JavaAnnotation.DefaultImpls.isIdeExternalAnnotation(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(C69113a.m265954a(C69113a.m265956a(this.annotation)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(C69113a.m265954a(C69113a.m265956a(this.annotation)));
    }

    public String toString() {
        return getClass().getName() + ": " + this.annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public Collection<JavaAnnotationArgument> getArguments() {
        Method[] declaredMethods = C69113a.m265954a(C69113a.m265956a(this.annotation)).getDeclaredMethods();
        Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.Factory;
            Object invoke = method.invoke(this.annotation, new Object[0]);
            Intrinsics.checkExpressionValueIsNotNull(invoke, "method.invoke(annotation)");
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            arrayList.add(factory.create(invoke, Name.identifier(method.getName())));
        }
        return arrayList;
    }

    public ReflectJavaAnnotation(Annotation annotation2) {
        Intrinsics.checkParameterIsNotNull(annotation2, "annotation");
        this.annotation = annotation2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReflectJavaAnnotation) || !Intrinsics.areEqual(this.annotation, ((ReflectJavaAnnotation) obj).annotation)) {
            return false;
        }
        return true;
    }
}
