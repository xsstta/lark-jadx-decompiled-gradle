package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: c */
    public final LazyJavaResolverContext f173266c;
    public final DeclarationDescriptor containingDeclaration;
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> resolve;
    public final Map<JavaTypeParameter, Integer> typeParameters;
    public final int typeParametersIndexOffset;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        Intrinsics.checkParameterIsNotNull(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor invoke = this.resolve.invoke(javaTypeParameter);
        if (invoke != null) {
            return invoke;
        }
        return this.f173266c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        Intrinsics.checkParameterIsNotNull(lazyJavaResolverContext, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "containingDeclaration");
        Intrinsics.checkParameterIsNotNull(javaTypeParameterListOwner, "typeParameterOwner");
        this.f173266c = lazyJavaResolverContext;
        this.containingDeclaration = declarationDescriptor;
        this.typeParametersIndexOffset = i;
        this.typeParameters = CollectionsKt.mapToIndex(javaTypeParameterListOwner.getTypeParameters());
        this.resolve = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaTypeParameterResolver$resolve$1(this));
    }
}
