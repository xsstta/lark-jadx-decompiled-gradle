package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    private final DeserializedAnnotations annotations;

    /* renamed from: c */
    public final DeserializationContext f173278c;
    private final ProtoBuf.TypeParameter proto;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl
    public DeserializedAnnotations getAnnotations() {
        return this.annotations;
    }

    public final ProtoBuf.TypeParameter getProto() {
        return this.proto;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public List<KotlinType> resolveUpperBounds() {
        List<ProtoBuf.Type> upperBounds = ProtoTypeTableUtilKt.upperBounds(this.proto, this.f173278c.getTypeTable());
        if (upperBounds.isEmpty()) {
            return CollectionsKt.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        List<ProtoBuf.Type> list = upperBounds;
        TypeDeserializer typeDeserializer = this.f173278c.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type(it.next()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public Void reportSupertypeLoopError(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r2 = r11.getStorageManager()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r11.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r0 = r11.getNameResolver()
            int r1 = r12.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r1 = r12.getVariance()
            java.lang.String r5 = "proto.variance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r0.variance(r1)
            boolean r6 = r12.getReified()
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r8 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker$EMPTY r0 = kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE
            r9 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker r9 = (kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker) r9
            r1 = r10
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f173278c = r11
            r10.proto = r12
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations r12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r11 = r11.getStorageManager()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1 r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            r13.<init>(r10)
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r12.<init>(r11, r13)
            r10.annotations = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }
}
