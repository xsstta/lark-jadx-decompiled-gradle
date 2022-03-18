package com.ss.android.lark.watermark.p2928e;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26320t;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.watermark.C58275e;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.watermark.e.c */
public class C58280c {

    /* renamed from: a */
    public static final int f143286a = R.color.lkui_transparent;

    /* renamed from: b */
    private static final Pattern f143287b = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");

    /* renamed from: a */
    private static boolean m226007a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f143287b.matcher(str).matches();
    }

    /* renamed from: a */
    private static String m226006a(String str, String str2) {
        if (m226007a(str)) {
            return str2 + "  " + str.substring(0, str.indexOf(64));
        } else if (str.length() > 4) {
            return str2 + "  " + str.substring(str.length() - 4);
        } else {
            Log.m165383e("WatermarkInfoCreator", "getMarkText failed: login telephone number length < 4");
            return str2 + "      ";
        }
    }

    /* renamed from: a */
    public static WatermarkInfo m226004a(String str, String str2, String str3, String str4, int i, float f) {
        Context a = C58275e.m225982a().mo177764a();
        UIUtils.getColor(a, i);
        return new WatermarkInfo.Builder(m226006a(str4, str2)).tag(m226005a(a, str, str2, str3, str4, i, f)).alpha(0.1f).bgColor(i).build();
    }

    /* renamed from: a */
    private static String m226005a(Context context, String str, String str2, String str3, String str4, int i, float f) {
        String str5;
        StringBuilder sb = new StringBuilder();
        sb.append("waterMark_");
        sb.append(str3);
        sb.append(str);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(f);
        sb.append("_");
        sb.append(str4);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        if (DesktopUtil.m144301a(context)) {
            str5 = "lkp";
        } else {
            str5 = "phone";
        }
        sb.append(str5);
        sb.append("_v2");
        String sb2 = sb.toString();
        return C26320t.m95318a(sb2) + ".png";
    }
}
