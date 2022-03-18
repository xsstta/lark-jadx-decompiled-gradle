package com.bytedance.ee.bear.document.menu;

import androidx.core.util.C0844e;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.menu.b */
public class C5874b {

    /* renamed from: a */
    private static Map<String, C0844e<Integer, Integer>> f16445a = new HashMap();

    /* renamed from: b */
    private static Map<String, String> f16446b = new HashMap();

    /* renamed from: c */
    private static Map<String, Integer> f16447c = new HashMap();

    static {
        Integer valueOf = Integer.valueOf((int) R.drawable.ud_icon_share_label_outlined);
        Integer valueOf2 = Integer.valueOf((int) R.color.facade_selector_icon_n1);
        m23629a("SHARE", valueOf, valueOf2);
        m23629a("MORE_OPERATE", Integer.valueOf((int) R.drawable.ud_icon_more_outlined), valueOf2);
        m23629a("MESSAGE", Integer.valueOf((int) R.drawable.ud_icon_bell_outlined), valueOf2);
        m23629a("UNDO", Integer.valueOf((int) R.drawable.ud_icon_undo_outlined), valueOf2);
        m23629a("REDO", Integer.valueOf((int) R.drawable.ud_icon_redo_outlined), valueOf2);
        m23629a("HISTORY_RECORD", Integer.valueOf((int) R.drawable.ud_icon_history_outlined), valueOf2);
        m23629a("SEARCH", Integer.valueOf((int) R.drawable.icon_tool_findandreplace_nor), valueOf2);
        f16447c.put("PUBLISH_ANNOUNCEMENT", Integer.valueOf((int) R.string.Doc_Lark_PublishChannelAnnouncement));
    }

    /* renamed from: a */
    static C0844e<Integer, Integer> m23627a(String str) {
        return f16445a.get(str);
    }

    /* renamed from: b */
    static Integer m23630b(String str) {
        int i;
        Integer num = f16447c.get(str);
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    static String m23631c(String str) {
        for (Map.Entry<String, String> entry : f16446b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(str)) {
                return value;
            }
            if (value.equals(str)) {
                return key;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m23628a(String str, int i, int i2) {
        m23629a(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    private static void m23629a(String str, Integer num, Integer num2) {
        f16445a.put(str, new C0844e<>(num, num2));
    }
}
