package com.ss.ugc.effectplatform.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/ugc/effectplatform/util/StringUtil;", "", "()V", "substringSafetyCheck", "", "str", "", "start", "", "end", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.r */
public final class StringUtil {

    /* renamed from: a */
    public static final StringUtil f165132a = new StringUtil();

    private StringUtil() {
    }

    /* renamed from: a */
    public final boolean mo228355a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        if (!TextUtils.f165135a.mo228357a(str) && i >= 0 && i2 >= 0 && i < i2 && i < str.length() && i2 <= str.length()) {
            return true;
        }
        return false;
    }
}
