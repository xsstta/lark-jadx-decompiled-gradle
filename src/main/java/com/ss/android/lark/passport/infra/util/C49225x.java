package com.ss.android.lark.passport.infra.util;

import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"letterOrDigitPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "isOnlyLetterOrDigit", "", "input", "", "isValidEmail", "email", "", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.x */
public final class C49225x {

    /* renamed from: a */
    private static final Pattern f123552a = Pattern.compile("[a-zA-Z\\d]++");

    /* renamed from: a */
    public static final boolean m194057a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        return f123552a.matcher(charSequence).matches();
    }

    /* renamed from: a */
    public static final boolean m194058a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "email");
        GetPassportConfigData.ConfigBean d = PassportConfigCenter.f123034a.mo171113d();
        String str2 = d.emailRegex;
        Intrinsics.checkExpressionValueIsNotNull(str2, "configData.emailRegex");
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        String str3 = d.emailRegex;
        Intrinsics.checkExpressionValueIsNotNull(str3, "configData.emailRegex");
        return new Regex(str3).matches(str);
    }
}
