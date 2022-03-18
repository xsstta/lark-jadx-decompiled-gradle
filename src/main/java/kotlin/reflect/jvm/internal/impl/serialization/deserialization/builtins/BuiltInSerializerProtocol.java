package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.StringsKt;

public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private BuiltInSerializerProtocol() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.<init>():void");
    }

    private final String shortName(FqName fqName) {
        if (fqName.isRoot()) {
            return "default-package";
        }
        String asString = fqName.shortName().asString();
        Intrinsics.checkExpressionValueIsNotNull(asString, "fqName.shortName().asString()");
        return asString;
    }

    public final String getBuiltInsFileName(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return shortName(fqName) + "." + "kotlin_builtins";
    }

    public final String getBuiltInsFilePath(FqName fqName) {
        Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        String asString = fqName.asString();
        Intrinsics.checkExpressionValueIsNotNull(asString, "fqName.asString()");
        sb.append(StringsKt.replace$default(asString, '.', '/', false, 4, (Object) null));
        sb.append("/");
        sb.append(getBuiltInsFileName(fqName));
        return sb.toString();
    }
}
