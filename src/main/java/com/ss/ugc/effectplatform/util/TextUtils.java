package com.ss.ugc.effectplatform.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/ugc/effectplatform/util/TextUtils;", "", "()V", "equals", "", "str1", "", "str2", "isEmpty", "text", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.u */
public final class TextUtils {

    /* renamed from: a */
    public static final TextUtils f165135a = new TextUtils();

    private TextUtils() {
    }

    /* renamed from: a */
    public final boolean mo228357a(String str) {
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo228358a(String str, String str2) {
        if (!mo228357a(str) || !mo228357a(str2)) {
            return Intrinsics.areEqual(str, str2);
        }
        return true;
    }
}
