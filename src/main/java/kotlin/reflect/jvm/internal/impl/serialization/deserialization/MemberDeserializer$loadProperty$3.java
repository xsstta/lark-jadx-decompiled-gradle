package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* access modifiers changed from: package-private */
public final class MemberDeserializer$loadProperty$3 extends Lambda implements Function0<ConstantValue<?>> {
    final /* synthetic */ DeserializedPropertyDescriptor $property;
    final /* synthetic */ ProtoBuf.Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MemberDeserializer$loadProperty$3(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = property;
        this.$property = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConstantValue<?> invoke() {
        MemberDeserializer memberDeserializer = this.this$0;
        ProtoContainer asProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f173274c.getContainingDeclaration());
        if (asProtoContainer == null) {
            Intrinsics.throwNpe();
        }
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = this.this$0.f173274c.getComponents().getAnnotationAndConstantLoader();
        ProtoBuf.Property property = this.$proto;
        KotlinType returnType = this.$property.getReturnType();
        Intrinsics.checkExpressionValueIsNotNull(returnType, "property.returnType");
        return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property, returnType);
    }
}
