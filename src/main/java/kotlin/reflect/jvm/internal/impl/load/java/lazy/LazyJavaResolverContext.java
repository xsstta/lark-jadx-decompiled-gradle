package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class LazyJavaResolverContext {
    private final JavaResolverComponents components;
    private final Lazy defaultTypeQualifiers$delegate;
    private final Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;
    private final TypeParameterResolver typeParameterResolver;
    private final JavaTypeResolver typeResolver;

    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.defaultTypeQualifiers$delegate.getValue();
    }

    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }

    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }

    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    public LazyJavaResolverContext(JavaResolverComponents javaResolverComponents, TypeParameterResolver typeParameterResolver2, Lazy<JavaTypeQualifiersByElementType> lazy) {
        Intrinsics.checkParameterIsNotNull(javaResolverComponents, "components");
        Intrinsics.checkParameterIsNotNull(typeParameterResolver2, "typeParameterResolver");
        Intrinsics.checkParameterIsNotNull(lazy, "delegateForDefaultTypeQualifiers");
        this.components = javaResolverComponents;
        this.typeParameterResolver = typeParameterResolver2;
        this.delegateForDefaultTypeQualifiers = lazy;
        this.defaultTypeQualifiers$delegate = lazy;
        this.typeResolver = new JavaTypeResolver(this, typeParameterResolver2);
    }
}
