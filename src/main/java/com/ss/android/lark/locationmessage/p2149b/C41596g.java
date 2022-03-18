package com.ss.android.lark.locationmessage.p2149b;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.locationmessage.b.g */
public class C41596g {
    /* renamed from: a */
    public static String m165065a() {
        return UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", "");
    }

    /* renamed from: a */
    public static String m165067a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, m165065a())) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public static String m165066a(Context context, int i) {
        String string = context.getString(R.string.Lark_App_Name);
        HashMap hashMap = new HashMap();
        hashMap.put("appName", string);
        hashMap.put("appName", string);
        return UIHelper.mustacheFormat(i, hashMap);
    }
}
