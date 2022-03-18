package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

public interface ThisClassReceiver extends ReceiverValue {
    ClassDescriptor getClassDescriptor();
}
