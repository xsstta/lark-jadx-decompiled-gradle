package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

public final class JvmBuiltInsSettings$getJdkMethodStatus$2 extends DFS.AbstractNodeHandler<ClassDescriptor, JvmBuiltInsSettings.JDKMemberStatus> {
    final /* synthetic */ String $jvmDescriptor;
    final /* synthetic */ Ref.ObjectRef $result;

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public JvmBuiltInsSettings.JDKMemberStatus result() {
        T t = this.$result.element;
        if (t != null) {
            return t;
        }
        return JvmBuiltInsSettings.JDKMemberStatus.NOT_CONSIDERED;
    }

    public boolean beforeChildren(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "javaClassDescriptor");
        String signature = SignatureBuildingComponents.INSTANCE.signature(classDescriptor, this.$jvmDescriptor);
        if (JvmBuiltInsSettings.Companion.getBLACK_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = (T) JvmBuiltInsSettings.JDKMemberStatus.BLACK_LIST;
        } else if (JvmBuiltInsSettings.Companion.getWHITE_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = (T) JvmBuiltInsSettings.JDKMemberStatus.WHITE_LIST;
        } else if (JvmBuiltInsSettings.Companion.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = (T) JvmBuiltInsSettings.JDKMemberStatus.DROP;
        }
        if (this.$result.element == null) {
            return true;
        }
        return false;
    }

    JvmBuiltInsSettings$getJdkMethodStatus$2(String str, Ref.ObjectRef objectRef) {
        this.$jvmDescriptor = str;
        this.$result = objectRef;
    }
}
