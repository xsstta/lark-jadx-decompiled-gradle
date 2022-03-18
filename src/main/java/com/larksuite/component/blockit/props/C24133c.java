package com.larksuite.component.blockit.props;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.blockit.props.c */
public class C24133c {
    /* renamed from: a */
    public static String m88159a(List<C24136f> list) {
        return m88158a(list, null).toString();
    }

    /* renamed from: a */
    public static CharSequence m88158a(List<C24136f> list, Map<String, Object> map) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                spannableStringBuilder.append(m88157a("#" + list.get(i).f59692a, list.get(i).f59693b, list.get(i).f59694c, map));
                if (i < list.size() - 1) {
                    str = "    ";
                } else {
                    str = " ";
                }
                spannableStringBuilder.append((CharSequence) str);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static CharSequence m88157a(String str, String str2, String str3, Map<String, Object> map) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C24132b(str2, str3, map), 0, str.length(), 33);
        return spannableString;
    }
}
