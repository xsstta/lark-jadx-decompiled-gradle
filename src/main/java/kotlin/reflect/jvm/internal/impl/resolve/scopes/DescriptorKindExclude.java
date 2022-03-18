package kotlin.reflect.jvm.internal.impl.resolve.scopes;

public abstract class DescriptorKindExclude {
    public abstract int getFullyExcludedDescriptorKinds();

    public static final class NonExtensions extends DescriptorKindExclude {
        public static final NonExtensions INSTANCE = new NonExtensions();
        private static final int fullyExcludedDescriptorKinds = (DescriptorKindFilter.Companion.getALL_KINDS_MASK() & (~(DescriptorKindFilter.Companion.getFUNCTIONS_MASK() | DescriptorKindFilter.Companion.getVARIABLES_MASK())));

        private NonExtensions() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return fullyExcludedDescriptorKinds;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
