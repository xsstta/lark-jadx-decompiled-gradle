package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public class JavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaAnnotationDescriptor.class), ShareHitPoint.f121869d, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    private final JavaAnnotationArgument firstArgument;
    private final FqName fqName;
    private final boolean isIdeExternalAnnotation;
    private final SourceElement source;
    private final NotNullLazyValue type$delegate;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    public final JavaAnnotationArgument getFirstArgument() {
        return this.firstArgument;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        return this.source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return MapsKt.emptyMap();
    }

    public JavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, FqName fqName2) {
        JavaSourceElement javaSourceElement;
        JavaAnnotationArgument javaAnnotationArgument;
        Collection<JavaAnnotationArgument> arguments;
        JavaSourceElement source2;
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(fqName2, "fqName");
        this.fqName = fqName2;
        if (javaAnnotation == null || (source2 = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            javaSourceElement = SourceElement.NO_SOURCE;
            Intrinsics.checkExpressionValueIsNotNull(javaSourceElement, "SourceElement.NO_SOURCE");
        } else {
            javaSourceElement = source2;
        }
        this.source = javaSourceElement;
        this.type$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new JavaAnnotationDescriptor$type$2(this, lazyJavaResolverContext));
        if (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) {
            javaAnnotationArgument = null;
        } else {
            javaAnnotationArgument = (JavaAnnotationArgument) CollectionsKt.firstOrNull(arguments);
        }
        this.firstArgument = javaAnnotationArgument;
        boolean z = true;
        this.isIdeExternalAnnotation = (javaAnnotation == null || !javaAnnotation.isIdeExternalAnnotation()) ? false : z;
    }
}
