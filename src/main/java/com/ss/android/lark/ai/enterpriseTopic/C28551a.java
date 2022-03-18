package com.ss.android.lark.ai.enterpriseTopic;

import ai.v1.GetEnterpriseTopicRequest;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.a */
public class C28551a {
    /* renamed from: a */
    public static boolean m104696a(Activity activity) {
        if (activity == null || !m104699b(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m104699b(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m104697a(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104698a(Uri uri, String str) {
        if (uri == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (uri.getQueryParameter(str) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m104695a(List<String> list, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.Lark_Encyclopedia_AlsoNamedAs) + context.getString(R.string.Lark_Legacy_Colon));
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append("/");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m104694a(Context context, String str, String str2) {
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (str2 != null && !m104698a(parse, "locale")) {
            buildUpon.appendQueryParameter("locale", str2);
        }
        if (!m104698a(parse, "scene")) {
            buildUpon.appendQueryParameter("scene", String.valueOf(GetEnterpriseTopicRequest.Scene.MESSENGER.getValue()));
        }
        if (context != null && m104697a(context)) {
            buildUpon.appendQueryParameter("theme", "darkmode");
        }
        return buildUpon.build().toString();
    }
}
