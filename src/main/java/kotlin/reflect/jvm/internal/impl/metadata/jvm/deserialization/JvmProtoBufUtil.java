package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

public final class JvmProtoBufUtil {
    private static final ExtensionRegistryLite EXTENSION_REGISTRY;
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    private JvmProtoBufUtil() {
    }

    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(newInstance);
        Intrinsics.checkExpressionValueIsNotNull(newInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        EXTENSION_REGISTRY = newInstance;
    }

    @JvmStatic
    public static final boolean isMovedFromInterfaceCompanion(ProtoBuf.Property property) {
        Intrinsics.checkParameterIsNotNull(property, "proto");
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = property.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkExpressionValueIsNotNull(extension, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        Intrinsics.checkExpressionValueIsNotNull(bool, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return bool.booleanValue();
    }

    private final String mapTypeDefault(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(String[] strArr, String[] strArr2) {
        Intrinsics.checkParameterIsNotNull(strArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(strArr2, "strings");
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        Intrinsics.checkExpressionValueIsNotNull(decodeBytes, "BitEncoding.decodeBytes(data)");
        return readClassDataFrom(decodeBytes, strArr2);
    }

    private final JvmNameResolver readNameResolver(InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        Intrinsics.checkExpressionValueIsNotNull(parseDelimitedFrom, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new JvmNameResolver(parseDelimitedFrom, strArr);
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(String[] strArr, String[] strArr2) {
        Intrinsics.checkParameterIsNotNull(strArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(strArr2, "strings");
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        Intrinsics.checkExpressionValueIsNotNull(decodeBytes, "BitEncoding.decodeBytes(data)");
        return readPackageDataFrom(decodeBytes, strArr2);
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(byte[] bArr, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        Intrinsics.checkParameterIsNotNull(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ProtoBuf.Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom(String[] strArr, String[] strArr2) {
        Intrinsics.checkParameterIsNotNull(strArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(strArr));
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr2), ProtoBuf.Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(byte[] bArr, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        Intrinsics.checkParameterIsNotNull(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ProtoBuf.Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    public final JvmMemberSignature.Method getJvmConstructorSignature(ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(constructor, "proto");
        Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.constructorSignature;
        Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(constructor, generatedExtension);
        if (jvmMethodSignature == null || !jvmMethodSignature.hasName()) {
            str = "<init>";
        } else {
            str = nameResolver.getString(jvmMethodSignature.getName());
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                String mapTypeDefault = jvmProtoBufUtil.mapTypeDefault(ProtoTypeTableUtilKt.type((ProtoBuf.ValueParameter) t, typeTable), nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList.add(mapTypeDefault);
            }
            str2 = CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            str2 = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(str, str2);
    }

    public final JvmMemberSignature.Method getJvmMethodSignature(ProtoBuf.Function function, NameResolver nameResolver, TypeTable typeTable) {
        int i;
        String str;
        Intrinsics.checkParameterIsNotNull(function, "proto");
        Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.methodSignature;
        Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(function, generatedExtension);
        if (jvmMethodSignature == null || !jvmMethodSignature.hasName()) {
            i = function.getName();
        } else {
            i = jvmMethodSignature.getName();
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listOfNotNull = CollectionsKt.listOfNotNull(ProtoTypeTableUtilKt.receiverType(function, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                arrayList.add(ProtoTypeTableUtilKt.type((ProtoBuf.ValueParameter) t, typeTable));
            }
            List<ProtoBuf.Type> plus = CollectionsKt.plus((Collection) listOfNotNull, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
            for (ProtoBuf.Type type : plus) {
                String mapTypeDefault = INSTANCE.mapTypeDefault(type, nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(mapTypeDefault);
            }
            ArrayList arrayList3 = arrayList2;
            String mapTypeDefault2 = mapTypeDefault(ProtoTypeTableUtilKt.returnType(function, typeTable), nameResolver);
            if (mapTypeDefault2 == null) {
                return null;
            }
            str = CollectionsKt.joinToString$default(arrayList3, "", "(", ")", 0, null, null, 56, null) + mapTypeDefault2;
        } else {
            str = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(i), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }
}
