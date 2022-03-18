package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final Companion Companion = Companion.$$INSTANCE;

    KotlinTypeRefiner getKotlinTypeRefiner();

    OverridingUtil getOverridingUtil();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final NewKotlinTypeCheckerImpl Default = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE);

        private Companion() {
        }

        public final NewKotlinTypeCheckerImpl getDefault() {
            return Default;
        }
    }
}
