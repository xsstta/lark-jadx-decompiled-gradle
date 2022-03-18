package com.ss.android.lark.mail.impl.utils;

import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.C69981e;

/* renamed from: com.ss.android.lark.mail.impl.utils.s */
public class C43819s {
    /* renamed from: b */
    public static String m173690b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("APP_DISPLAY_NAME", UIHelper.getAppName());
        return UIHelper.mustacheFormat(i, hashMap);
    }

    /* renamed from: c */
    public static String m173692c(int i) {
        String a = m173684a((int) R.string.Mail_ThreadAction_Multi_selected);
        return a.replace("{{count}}", "" + i);
    }

    /* renamed from: a */
    public static String m173684a(int i) {
        try {
            return C41816b.m166115a().mo150132b().getString(i);
        } catch (Exception e) {
            Log.m165384e("StringUtils", "getString", e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m173691b(String str) {
        try {
            return Uri.encode(C69981e.m268409b(str), ";,/?:@&=+$-_.!~*'()#");
        } catch (Exception e) {
            Log.m165384e("StringUtils", "encodeURIForJS", e);
            return Uri.encode(str, ";,/?:@&=+$-_.!~*'()#");
        }
    }

    /* renamed from: c */
    public static String m173693c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "`" + str + "`";
    }

    /* renamed from: a */
    public static boolean m173689a(String str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static SpannableString m173682a(String str, String str2) {
        return m173683a(str, new ArrayList<String>(str2) {
            /* class com.ss.android.lark.mail.impl.utils.C43819s.C438201 */
            final /* synthetic */ String val$keyword;

            {
                this.val$keyword = r1;
                add(r1);
            }
        });
    }

    /* renamed from: a */
    public static SpannableString m173683a(String str, List<String> list) {
        SpannableString spannableString = new SpannableString(str);
        if (list != null) {
            m173681a(spannableString, list);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m173681a(SpannableString spannableString, List<String> list) {
        try {
            ArrayList<Pair<String, ArrayList<Integer>>> a = m173688a(list, spannableString);
            if (CollectionUtils.isNotEmpty(a)) {
                Iterator<Pair<String, ArrayList<Integer>>> it = a.iterator();
                while (it.hasNext()) {
                    Pair<String, ArrayList<Integer>> next = it.next();
                    String str = (String) next.first;
                    Iterator it2 = ((ArrayList) next.second).iterator();
                    while (it2.hasNext()) {
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C41816b.m166115a().mo150132b().getResources().getColor(R.color.text_link_hover));
                        int intValue = ((Integer) it2.next()).intValue();
                        spannableString.setSpan(foregroundColorSpan, intValue, str.length() + intValue, 33);
                    }
                }
            }
        } catch (Throwable th) {
            Log.m165386e("parseHighLightSpannable error", th);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static String m173685a(int i, int i2) {
        return String.format(C41816b.m166115a().mo150132b().getResources().getQuantityString(i, i2), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static String m173687a(int i, Map<String, String> map) {
        map.put("APP_DISPLAY_NAME", UIHelper.getAppName());
        return UIHelper.mustacheFormat(i, map);
    }

    /* renamed from: a */
    private static ArrayList<Pair<String, ArrayList<Integer>>> m173688a(List<String> list, SpannableString spannableString) {
        if (TextUtils.isEmpty(spannableString)) {
            return null;
        }
        String lowerCase = spannableString.toString().toLowerCase();
        ArrayList<Pair<String, ArrayList<Integer>>> arrayList = new ArrayList<>();
        for (String str : list) {
            String lowerCase2 = str.toLowerCase();
            int indexOf = lowerCase.indexOf(lowerCase2);
            if (indexOf < 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(indexOf));
            while (indexOf < lowerCase.length() - lowerCase2.length() && (indexOf = lowerCase.indexOf(lowerCase2, indexOf + 1)) >= 0) {
                arrayList2.add(Integer.valueOf(indexOf));
            }
            arrayList.add(new Pair<>(str, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m173686a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return UIHelper.mustacheFormat(i, hashMap);
    }
}
