package com.bytedance.ee.util.string;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/util/string/StringHelper;", "", "()V", "trimLineBreak", "", "content", "", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.util.r.b */
public final class StringHelper {

    /* renamed from: a */
    public static final StringHelper f35919a = new StringHelper();

    private StringHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m55640a(CharSequence charSequence) {
        CharSequence trim;
        String obj;
        if (charSequence == null || (trim = StringsKt.trim(charSequence, '\n')) == null || (obj = trim.toString()) == null) {
            return "";
        }
        return obj;
    }
}
