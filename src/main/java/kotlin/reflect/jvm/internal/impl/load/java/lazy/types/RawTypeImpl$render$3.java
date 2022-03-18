package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

final class RawTypeImpl$render$3 extends Lambda implements Function2<String, String, String> {
    public static final RawTypeImpl$render$3 INSTANCE = new RawTypeImpl$render$3();

    RawTypeImpl$render$3() {
        super(2);
    }

    public final String invoke(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceArgs");
        Intrinsics.checkParameterIsNotNull(str2, "newArgs");
        if (!StringsKt.contains$default((CharSequence) str, '<', false, 2, (Object) null)) {
            return str;
        }
        return StringsKt.substringBefore$default(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + StringsKt.substringAfterLast$default(str, '>', (String) null, 2, (Object) null);
    }
}
