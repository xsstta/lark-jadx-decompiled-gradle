package com.ss.android.vc.meeting.module.interpretation.p3128c;

import android.text.TextUtils;
import android.widget.TextView;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.c.a */
public class C61958a {

    /* renamed from: a */
    public static HashMap<String, String> f155610a = new HashMap<>();

    /* renamed from: a */
    public static HashMap<String, String> m242071a() {
        return f155610a;
    }

    /* renamed from: a */
    public static void m242072a(LanguageType languageType, final TextView textView) {
        String str;
        if (languageType != null && textView != null) {
            final String str2 = languageType.despI18nKey;
            textView.setTag(str2);
            String str3 = f155610a.get(languageType.despI18nKey);
            if (!TextUtils.isEmpty(str3)) {
                if (textView.getText() == null) {
                    str = "";
                } else {
                    str = textView.getText().toString();
                }
                if (!str3.equals(str)) {
                    textView.setText(str3);
                    return;
                }
                return;
            }
            VcBizSender.m249235b(str2, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
                /* class com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a.C619591 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    String str2;
                    String str3;
                    C61958a.f155610a.put(str2, str);
                    Object tag = textView.getTag();
                    if (tag != null) {
                        str2 = (String) tag;
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.equals(str2, str2)) {
                        if (textView.getText() == null) {
                            str3 = "";
                        } else {
                            str3 = textView.getText().toString();
                        }
                        if (!TextUtils.isEmpty(str) && !str.equals(str3)) {
                            textView.setText(str);
                        }
                    }
                }
            });
        }
    }
}
