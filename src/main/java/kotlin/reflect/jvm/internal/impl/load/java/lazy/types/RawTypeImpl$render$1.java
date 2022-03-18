package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

final class RawTypeImpl$render$1 extends Lambda implements Function2<String, String, Boolean> {
    public static final RawTypeImpl$render$1 INSTANCE = new RawTypeImpl$render$1();

    RawTypeImpl$render$1() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Boolean invoke(String str, String str2) {
        return Boolean.valueOf(invoke(str, str2));
    }

    public final boolean invoke(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "first");
        Intrinsics.checkParameterIsNotNull(str2, "second");
        if (Intrinsics.areEqual(str, StringsKt.removePrefix(str2, (CharSequence) "out ")) || Intrinsics.areEqual(str2, "*")) {
            return true;
        }
        return false;
    }
}
