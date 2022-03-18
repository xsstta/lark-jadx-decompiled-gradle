package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;

public interface DeserializedContainerSource extends SourceElement {
    String getPresentableString();
}
