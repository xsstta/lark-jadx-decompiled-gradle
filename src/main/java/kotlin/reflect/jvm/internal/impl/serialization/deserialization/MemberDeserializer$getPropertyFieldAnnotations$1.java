package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* access modifiers changed from: package-private */
public final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ boolean $isDelegate;
    final /* synthetic */ ProtoBuf.Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z, ProtoBuf.Property property) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$isDelegate = z;
        this.$proto = property;
    }

    /* Return type fixed from 'java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AnnotationDescriptor> invoke() {
        List<AnnotationDescriptor> list;
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f173274c.getContainingDeclaration());
        if (asProtoContainer == null) {
            list = null;
        } else if (this.$isDelegate) {
            list = CollectionsKt.toList(this.this$0.f173274c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(asProtoContainer, this.$proto));
        } else {
            list = CollectionsKt.toList(this.this$0.f173274c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(asProtoContainer, this.$proto));
        }
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }
}
