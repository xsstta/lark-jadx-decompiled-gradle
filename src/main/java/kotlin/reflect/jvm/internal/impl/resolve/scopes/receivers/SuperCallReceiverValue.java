package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public interface SuperCallReceiverValue extends ReceiverValue {
    KotlinType getThisType();
}
