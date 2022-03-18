package com.ss.android.lark.mine.impl.status;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"getChineseWordCount", "", "charSequence", "", "getLength", "string", "core_mine_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.status.a */
public final class C45801a {
    /* renamed from: a */
    public static final int m181493a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "string");
        return charSequence.length() + m181494b(charSequence);
    }

    /* renamed from: b */
    private static final int m181494b(CharSequence charSequence) {
        Matcher matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(charSequence);
        int i = 0;
        while (matcher.find()) {
            int groupCount = matcher.groupCount();
            if (groupCount >= 0) {
                int i2 = 0;
                while (true) {
                    i++;
                    if (i2 == groupCount) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i;
    }
}
