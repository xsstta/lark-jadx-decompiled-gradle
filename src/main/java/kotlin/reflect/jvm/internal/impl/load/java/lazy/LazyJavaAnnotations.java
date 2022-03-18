package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

public final class LazyJavaAnnotations implements Annotations {
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors;
    private final JavaAnnotationOwner annotationOwner;

    /* renamed from: c */
    public final LazyJavaResolverContext f173264c;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        if (!this.annotationOwner.getAnnotations().isEmpty() || this.annotationOwner.isDeprecatedInJavaDoc()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        Sequence e = C69294l.m266140e(CollectionsKt.asSequence(this.annotationOwner.getAnnotations()), this.annotationDescriptors);
        JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.INSTANCE;
        FqName fqName = KotlinBuiltIns.FQ_NAMES.deprecated;
        Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return C69294l.m266141f(C69294l.m266130a(e, javaAnnotationMapper.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f173264c))).mo4717a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor findAnnotation(FqName fqName) {
        AnnotationDescriptor invoke;
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        JavaAnnotation findAnnotation = this.annotationOwner.findAnnotation(fqName);
        if (findAnnotation == null || (invoke = this.annotationDescriptors.invoke(findAnnotation)) == null) {
            return JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f173264c);
        }
        return invoke;
    }

    public LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(javaAnnotationOwner, "annotationOwner");
        this.f173264c = lazyJavaResolverContext;
        this.annotationOwner = javaAnnotationOwner;
        this.annotationDescriptors = lazyJavaResolverContext.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }
}
