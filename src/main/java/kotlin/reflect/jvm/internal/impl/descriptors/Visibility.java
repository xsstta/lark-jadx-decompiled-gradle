package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

public abstract class Visibility {
    private final boolean isPublicAPI;
    private final String name;

    public abstract boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);

    public Visibility normalize() {
        return this;
    }

    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    public final String toString() {
        return getInternalDisplayName();
    }

    /* access modifiers changed from: protected */
    public Integer compareTo(Visibility visibility) {
        Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        return Visibilities.compareLocal(this, visibility);
    }

    protected Visibility(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.name = str;
        this.isPublicAPI = z;
    }
}
