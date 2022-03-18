package com.bytedance.ee.bear.facade.common.icon.p381a;

import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001f\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"delEm", "", "str", "id", "key", "", "", "([Ljava/lang/Object;)Ljava/lang/String;", "list-export-min_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.icon.a.b */
public final class C7714b {
    /* renamed from: a */
    public static final String m30854a(Object... objArr) {
        Intrinsics.checkParameterIsNotNull(objArr, "key");
        return C69043h.m265740a(objArr, "-", null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static final String m30853a(String str) {
        if (str == null) {
            return "";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "<em>", false, 2, (Object) null)) {
            return StringsKt.replace$default(StringsKt.replace$default(str, "<em>", "", false, 4, (Object) null), "</em>", "", false, 4, (Object) null);
        }
        return str;
    }
}
