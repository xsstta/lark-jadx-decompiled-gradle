package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements Function1<ClassId, SourceElement> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    public final SourceElement invoke(ClassId classId) {
        Intrinsics.checkParameterIsNotNull(classId, "it");
        DeserializedContainerSource deserializedContainerSource = this.this$0.containerSource;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkExpressionValueIsNotNull(sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }
}
