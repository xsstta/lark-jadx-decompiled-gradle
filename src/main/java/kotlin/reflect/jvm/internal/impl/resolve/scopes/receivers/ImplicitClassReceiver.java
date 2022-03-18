package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    private final ClassDescriptor classDescriptor;
    private final ClassDescriptor declarationDescriptor;
    private final ImplicitClassReceiver original;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        Intrinsics.checkExpressionValueIsNotNull(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    public boolean equals(Object obj) {
        ClassDescriptor classDescriptor2 = this.classDescriptor;
        ClassDescriptor classDescriptor3 = null;
        if (!(obj instanceof ImplicitClassReceiver)) {
            obj = null;
        }
        ImplicitClassReceiver implicitClassReceiver = (ImplicitClassReceiver) obj;
        if (implicitClassReceiver != null) {
            classDescriptor3 = implicitClassReceiver.classDescriptor;
        }
        return Intrinsics.areEqual(classDescriptor2, classDescriptor3);
    }

    public ImplicitClassReceiver(ClassDescriptor classDescriptor2, ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkParameterIsNotNull(classDescriptor2, "classDescriptor");
        this.classDescriptor = classDescriptor2;
        this.original = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.declarationDescriptor = classDescriptor2;
    }
}
