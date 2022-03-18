package kotlin.reflect.jvm;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlin.reflect.jvm.c */
public final class C69131c {
    /* renamed from: a */
    public static final <R> KFunction<R> m266087a(Function<? extends R> cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "$this$reflect");
        Metadata metadata = (Metadata) cVar.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d1 = metadata.d1();
            boolean z2 = true;
            if (d1.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d1 = null;
            }
            if (d1 != null) {
                Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom = JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2());
                JvmNameResolver component1 = readFunctionDataFrom.component1();
                ProtoBuf.Function component2 = readFunctionDataFrom.component2();
                int[] mv = metadata.mv();
                if ((metadata.xi() & 8) == 0) {
                    z2 = false;
                }
                JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(mv, z2);
                ProtoBuf.TypeTable typeTable = component2.getTypeTable();
                Intrinsics.checkExpressionValueIsNotNull(typeTable, "proto.typeTable");
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) UtilKt.deserializeToDescriptor(cVar.getClass(), component2, component1, new TypeTable(typeTable), jvmMetadataVersion, C69132a.INSTANCE);
                if (simpleFunctionDescriptor != null) {
                    return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, simpleFunctionDescriptor);
                }
            }
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/SimpleFunctionDescriptor;", "R", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;", "Lkotlin/ParameterName;", "name", "proto", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.reflect.jvm.c$a */
    static final /* synthetic */ class C69132a extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {
        public static final C69132a INSTANCE = new C69132a();

        C69132a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MemberDeserializer.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        public final SimpleFunctionDescriptor invoke(MemberDeserializer memberDeserializer, ProtoBuf.Function function) {
            Intrinsics.checkParameterIsNotNull(memberDeserializer, "p1");
            Intrinsics.checkParameterIsNotNull(function, "p2");
            return memberDeserializer.loadFunction(function);
        }
    }
}
