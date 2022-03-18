package com.bytedance.ee.util.regex;

import android.text.TextUtils;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/util/regex/RegexUtils;", "", "()V", "COUNTRY_CODE_CHINA", "", "REGEX_MOBILE_CHINA", "REGEX_MOBILE_GLOBAL", "isMatch", "", "regex", "input", "", "isMobileChina", "isMobileGlobal", "isMobilePhone", "countryCode", "mobilePhone", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.util.n.a */
public final class RegexUtils {

    /* renamed from: a */
    public static final RegexUtils f35905a = new RegexUtils();

    private RegexUtils() {
    }

    /* renamed from: a */
    public final boolean mo50675a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        return m55605a("^\\d{1,14}$", charSequence);
    }

    /* renamed from: b */
    public final boolean mo50677b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        return m55605a("^[1]\\d{10}$", charSequence);
    }

    /* renamed from: a */
    private final boolean m55605a(String str, CharSequence charSequence) {
        boolean z;
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !Pattern.matches(str, charSequence)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo50676a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "countryCode");
        Intrinsics.checkParameterIsNotNull(str2, "mobilePhone");
        if (TextUtils.equals("+86", str)) {
            return mo50677b(str2);
        }
        return mo50675a(str2);
    }
}
