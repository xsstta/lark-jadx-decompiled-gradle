package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.collections.am;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* access modifiers changed from: package-private */
public final class DeserializedMemberScope$variableNamesLazy$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeserializedMemberScope$variableNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    /* Return type fixed from 'java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Name> invoke() {
        return am.m265692a((Set) this.this$0.propertyProtosBytes.keySet(), (Iterable) this.this$0.getNonDeclaredVariableNames());
    }
}
