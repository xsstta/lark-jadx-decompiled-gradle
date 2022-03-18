package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;

/* access modifiers changed from: package-private */
public final class TypeDeserializer$simpleType$1 extends Lambda implements Function1<ProtoBuf.Type, List<? extends ProtoBuf.Type.Argument>> {
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypeDeserializer$simpleType$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    public final List<ProtoBuf.Type.Argument> invoke(ProtoBuf.Type type) {
        List<ProtoBuf.Type.Argument> list;
        Intrinsics.checkParameterIsNotNull(type, "$this$collectAllArguments");
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkExpressionValueIsNotNull(argumentList, "argumentList");
        List<ProtoBuf.Type.Argument> list2 = argumentList;
        ProtoBuf.Type outerType = ProtoTypeTableUtilKt.outerType(type, this.this$0.f173275c.getTypeTable());
        if (outerType != null) {
            list = invoke(outerType);
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) list);
    }
}
