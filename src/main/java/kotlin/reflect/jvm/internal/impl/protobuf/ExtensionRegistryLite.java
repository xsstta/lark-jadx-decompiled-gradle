package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

public class ExtensionRegistryLite {
    private static final ExtensionRegistryLite EMPTY = new ExtensionRegistryLite(true);
    private static volatile boolean eagerlyParseMessageSets;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public static ExtensionRegistryLite getEmptyRegistry() {
        return EMPTY;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }

    /* access modifiers changed from: private */
    public static final class ObjectIntPair {
        private final int number;
        private final Object object;

        public int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            if (this.object == objectIntPair.object && this.number == objectIntPair.number) {
                return true;
            }
            return false;
        }

        ObjectIntPair(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    private ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension<ContainingType, ?>) this.extensionsByNumber.get(new ObjectIntPair(containingtype, i));
    }
}
