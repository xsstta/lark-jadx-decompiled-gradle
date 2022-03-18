package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

final class LazyJavaScope$allDescriptors$1 extends Lambda implements Function0<List<? extends DeclarationDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.this$0 = lazyJavaScope;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends DeclarationDescriptor> invoke() {
        return this.this$0.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
    }
}
