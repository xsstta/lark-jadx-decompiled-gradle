package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

final class JvmPackageScope$kotlinScopes$2 extends Lambda implements Function0<List<? extends MemberScope>> {
    final /* synthetic */ JvmPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.this$0 = jvmPackageScope;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends MemberScope> invoke() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.this$0.packageFragment.getBinaryClasses$descriptors_jvm().values().iterator();
        while (it.hasNext()) {
            MemberScope createKotlinPackagePartScope = this.this$0.f173267c.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(this.this$0.packageFragment, it.next());
            if (createKotlinPackagePartScope != null) {
                arrayList.add(createKotlinPackagePartScope);
            }
        }
        return CollectionsKt.toList(arrayList);
    }
}
