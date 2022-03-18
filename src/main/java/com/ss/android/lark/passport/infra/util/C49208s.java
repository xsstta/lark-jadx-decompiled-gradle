package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.passport.infra.util.s */
public class C49208s {
    /* renamed from: a */
    public static String m193982a(String str, String str2, Context context) {
        return m193983a(str, str2, "style", context);
    }

    /* renamed from: a */
    public static String m193981a(String str, int i, Context context) {
        int i2;
        StringBuilder sb = new StringBuilder();
        try {
            i2 = context.getResources().getColor(i);
        } catch (Resources.NotFoundException e) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171462a("MatchUtil", "token: " + str + " not fount", e);
            i2 = 0;
        }
        sb.append("#");
        sb.append(String.format("%02x", Integer.valueOf(Color.red(i2))));
        sb.append(String.format("%02x", Integer.valueOf(Color.green(i2))));
        sb.append(String.format("%02x", Integer.valueOf(Color.blue(i2))));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m193983a(String str, String str2, String str3, Context context) {
        String str4;
        String str5;
        String str6;
        Matcher matcher = Pattern.compile("<" + str2 + ".*?" + str3 + "=['\"]?(.*?)['\"].*?").matcher(str);
        String str7 = "";
        if (matcher.find()) {
            str4 = matcher.group(1);
        } else {
            str4 = str7;
        }
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        if (str4.contains(";")) {
            str5 = "(?<=color:)(.*?)(?=;)";
        } else {
            str5 = "(?<=color:)(.*)";
        }
        Matcher matcher2 = Pattern.compile(str5).matcher(str4);
        if (matcher2.find()) {
            str6 = matcher2.group(1);
        } else {
            str6 = str7;
        }
        if (TextUtils.isEmpty(str6)) {
            return str;
        }
        Matcher matcher3 = Pattern.compile("(?<=[{])(.+?)(?=[}])").matcher(str6);
        if (matcher3.find()) {
            str7 = matcher3.group(1);
        }
        if (TextUtils.isEmpty(str7)) {
            return str;
        }
        return str.replace(str6, m193981a(str7, UDColorUtils.getColorIdByToken(context, str7), context));
    }
}
