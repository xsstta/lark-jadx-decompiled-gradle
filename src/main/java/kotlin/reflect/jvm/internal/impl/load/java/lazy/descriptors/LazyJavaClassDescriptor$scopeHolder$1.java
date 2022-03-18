package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* access modifiers changed from: package-private */
public final class LazyJavaClassDescriptor$scopeHolder$1 extends Lambda implements Function1<KotlinTypeRefiner, LazyJavaClassMemberScope> {
    final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final LazyJavaClassMemberScope invoke(KotlinTypeRefiner kotlinTypeRefiner) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(kotlinTypeRefiner, "kotlinTypeRefiner");
        LazyJavaResolverContext lazyJavaResolverContext = this.this$0.f173269c;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        LazyJavaClassDescriptor lazyJavaClassDescriptor2 = lazyJavaClassDescriptor;
        JavaClass jClass = lazyJavaClassDescriptor.getJClass();
        if (this.this$0.additionalSupertypeClassDescriptor != null) {
            z = true;
        } else {
            z = false;
        }
        return new LazyJavaClassMemberScope(lazyJavaResolverContext, lazyJavaClassDescriptor2, jClass, z, this.this$0.unsubstitutedMemberScope);
    }
}
