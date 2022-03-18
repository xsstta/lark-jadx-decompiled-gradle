package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

public final class ContextKt {
    public static final LazyJavaResolverContext replaceComponents(LazyJavaResolverContext lazyJavaResolverContext, JavaResolverComponents javaResolverComponents) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$replaceComponents");
        Intrinsics.checkParameterIsNotNull(javaResolverComponents, "components");
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$child");
        Intrinsics.checkParameterIsNotNull(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$copyWithNewDefaultTypeQualifiers");
        Intrinsics.checkParameterIsNotNull(annotations, "additionalAnnotations");
        if (annotations.isEmpty()) {
            return lazyJavaResolverContext;
        }
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ContextKt$copyWithNewDefaultTypeQualifiers$1(lazyJavaResolverContext, annotations)));
    }

    private static final NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier(LazyJavaResolverContext lazyJavaResolverContext, AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus extractNullability;
        NullabilityQualifierWithMigrationStatus copy$default;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver();
        NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation = annotationTypeQualifierResolver.resolveQualifierBuiltInDefaultAnnotation(annotationDescriptor);
        if (resolveQualifierBuiltInDefaultAnnotation != null) {
            return resolveQualifierBuiltInDefaultAnnotation;
        }
        AnnotationTypeQualifierResolver.TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation = annotationTypeQualifierResolver.resolveTypeQualifierDefaultAnnotation(annotationDescriptor);
        if (resolveTypeQualifierDefaultAnnotation != null) {
            AnnotationDescriptor component1 = resolveTypeQualifierDefaultAnnotation.component1();
            List<AnnotationTypeQualifierResolver.QualifierApplicabilityType> component2 = resolveTypeQualifierDefaultAnnotation.component2();
            ReportLevel resolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305CustomState(annotationDescriptor);
            if (resolveJsr305CustomState == null) {
                resolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305AnnotationState(component1);
            }
            if (!(resolveJsr305CustomState.isIgnore() || (extractNullability = lazyJavaResolverContext.getComponents().getSignatureEnhancement().extractNullability(component1)) == null || (copy$default = NullabilityQualifierWithMigrationStatus.copy$default(extractNullability, null, resolveJsr305CustomState.isWarning(), 1, null)) == null)) {
                return new NullabilityQualifierWithApplicability(copy$default, component2);
            }
        }
        return null;
    }

    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        EnumMap enumMap;
        EnumMap<AnnotationTypeQualifierResolver.QualifierApplicabilityType, NullabilityQualifierWithMigrationStatus> nullabilityQualifiers;
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$computeNewDefaultTypeQualifiers");
        Intrinsics.checkParameterIsNotNull(annotations, "additionalAnnotations");
        if (lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().getDisabled()) {
            return lazyJavaResolverContext.getDefaultTypeQualifiers();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier = extractDefaultNullabilityQualifier(lazyJavaResolverContext, (AnnotationDescriptor) it.next());
            if (extractDefaultNullabilityQualifier != null) {
                arrayList.add(extractDefaultNullabilityQualifier);
            }
        }
        ArrayList<NullabilityQualifierWithApplicability> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return lazyJavaResolverContext.getDefaultTypeQualifiers();
        }
        JavaTypeQualifiersByElementType defaultTypeQualifiers = lazyJavaResolverContext.getDefaultTypeQualifiers();
        if (defaultTypeQualifiers == null || (nullabilityQualifiers = defaultTypeQualifiers.getNullabilityQualifiers()) == null) {
            enumMap = new EnumMap(AnnotationTypeQualifierResolver.QualifierApplicabilityType.class);
        } else {
            enumMap = new EnumMap((EnumMap) nullabilityQualifiers);
        }
        boolean z = false;
        for (NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability : arrayList2) {
            NullabilityQualifierWithMigrationStatus component1 = nullabilityQualifierWithApplicability.component1();
            for (AnnotationTypeQualifierResolver.QualifierApplicabilityType qualifierApplicabilityType : nullabilityQualifierWithApplicability.component2()) {
                enumMap.put((Object) qualifierApplicabilityType, (Object) component1);
                z = true;
            }
        }
        if (!z) {
            return lazyJavaResolverContext.getDefaultTypeQualifiers();
        }
        return new JavaTypeQualifiersByElementType(enumMap);
    }

    public static final LazyJavaResolverContext childForClassOrPackage(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$childForClassOrPackage");
        Intrinsics.checkParameterIsNotNull(classOrPackageFragmentDescriptor, "containingDeclaration");
        return child(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ContextKt$childForClassOrPackage$1(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    public static final LazyJavaResolverContext childForMethod(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, "$this$childForMethod");
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "containingDeclaration");
        Intrinsics.checkParameterIsNotNull(javaTypeParameterListOwner, "typeParameterOwner");
        return child(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver;
        JavaResolverComponents components = lazyJavaResolverContext.getComponents();
        if (javaTypeParameterListOwner != null) {
            lazyJavaTypeParameterResolver = new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            lazyJavaTypeParameterResolver = lazyJavaResolverContext.getTypeParameterResolver();
        }
        return new LazyJavaResolverContext(components, lazyJavaTypeParameterResolver, lazy);
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }
}
