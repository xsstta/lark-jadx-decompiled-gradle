package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

public interface Check {
    boolean check(FunctionDescriptor functionDescriptor);

    String getDescription();

    String invoke(FunctionDescriptor functionDescriptor);

    public static final class DefaultImpls {
        public static String invoke(Check check, FunctionDescriptor functionDescriptor) {
            Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
            if (!check.check(functionDescriptor)) {
                return check.getDescription();
            }
            return null;
        }
    }
}
