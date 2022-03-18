package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class CheckResult {
    private final boolean isSuccess;

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public static final class IllegalFunctionName extends CheckResult {
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    public static final class SuccessCheck extends CheckResult {
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    private CheckResult(boolean z) {
        this.isSuccess = z;
    }

    public static final class IllegalSignature extends CheckResult {
        private final String error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IllegalSignature(String str) {
            super(false, null);
            Intrinsics.checkParameterIsNotNull(str, "error");
            this.error = str;
        }
    }

    public /* synthetic */ CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
