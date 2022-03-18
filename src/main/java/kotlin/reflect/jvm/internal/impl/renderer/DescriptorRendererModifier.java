package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);
    
    public static final Set<DescriptorRendererModifier> ALL = C69043h.m265788m(values());
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final Companion Companion = new Companion(null);
    private final boolean includeByDefault;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : values) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = CollectionsKt.toSet(arrayList);
    }

    private DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }
}
