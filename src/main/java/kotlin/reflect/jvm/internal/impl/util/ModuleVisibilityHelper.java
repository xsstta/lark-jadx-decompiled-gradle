package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public interface ModuleVisibilityHelper {
    boolean isInFriendModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2);

    public static final class EMPTY implements ModuleVisibilityHelper {
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Intrinsics.checkParameterIsNotNull(declarationDescriptor, "what");
            Intrinsics.checkParameterIsNotNull(declarationDescriptor2, "from");
            return true;
        }

        private EMPTY() {
        }
    }
}
