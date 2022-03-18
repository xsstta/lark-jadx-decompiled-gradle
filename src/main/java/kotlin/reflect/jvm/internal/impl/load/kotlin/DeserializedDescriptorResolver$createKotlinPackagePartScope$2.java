package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* access modifiers changed from: package-private */
public final class DeserializedDescriptorResolver$createKotlinPackagePartScope$2 extends Lambda implements Function0<List<? extends Name>> {
    public static final DeserializedDescriptorResolver$createKotlinPackagePartScope$2 INSTANCE = new DeserializedDescriptorResolver$createKotlinPackagePartScope$2();

    DeserializedDescriptorResolver$createKotlinPackagePartScope$2() {
        super(0);
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.impl.name.Name>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Name> invoke() {
        return CollectionsKt.emptyList();
    }
}
