package com.ss.android.lark.widget.richtext.preprocess;

import android.text.Spannable;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59030d;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.C59152b;
import com.ss.android.lark.widget.span.C59156f;
import com.ss.android.lark.widget.span.C59179o;
import com.ss.android.lark.widget.span.C59181q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.k */
public class C59063k {
    /* renamed from: b */
    private static boolean m229424b(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: c */
    private static boolean m229425c(int i) {
        return (i & 2) == 2;
    }

    /* renamed from: d */
    private static boolean m229426d(int i) {
        return (i & 4) == 4;
    }

    /* renamed from: e */
    private static boolean m229427e(int i) {
        return (i & 8) == 8;
    }

    /* renamed from: a */
    private static boolean m229423a(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Map<String, String> m229420a(int i) {
        HashMap hashMap = new HashMap();
        if (m229424b(i)) {
            hashMap.put("fontWeight", UIHelper.getString(R.string.remote_font_weight_bold));
        }
        if (m229425c(i)) {
            hashMap.put("fontStyle", UIHelper.getString(R.string.remote_font_style_italic));
        }
        if (m229426d(i)) {
            hashMap.put("-lark-textDecoration", UIHelper.getString(R.string.remote_text_lark_decoration_underline));
        }
        if (m229427e(i)) {
            String str = (String) hashMap.get("-lark-textDecoration");
            String string = UIHelper.getString(R.string.remote_text_lark_decoration_line_through);
            if (TextUtils.isEmpty(str)) {
                hashMap.put("-lark-textDecoration", string);
            } else {
                hashMap.put("-lark-textDecoration", str + " " + string);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<RichTextElement> m229419a(Spannable spannable) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(spannable)) {
            return arrayList;
        }
        int length = spannable.length();
        int[] iArr = new int[length];
        m229422a((C59152b[]) spannable.getSpans(0, spannable.length(), C59152b.class), spannable, iArr, 1);
        m229422a((C59156f[]) spannable.getSpans(0, spannable.length(), C59156f.class), spannable, iArr, 2);
        m229422a((C59181q[]) spannable.getSpans(0, spannable.length(), C59181q.class), spannable, iArr, 4);
        m229422a((C59179o[]) spannable.getSpans(0, spannable.length(), C59179o.class), spannable, iArr, 8);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = length - 1;
            if (i3 == i4 || iArr[i2] != iArr[i3]) {
                if (i3 == i4) {
                    i = i3 + 1;
                } else {
                    i = i3;
                }
                RichTextElement a = C59030d.m229164a(spannable.subSequence(i2, i).toString());
                a.setStyle(m229420a(iArr[i2]));
                arrayList.add(a);
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m229421a(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (!(charSequence instanceof Spannable)) {
            return hashMap;
        }
        Spannable spannable = (Spannable) charSequence;
        int i = 0;
        C59156f[] fVarArr = (C59156f[]) spannable.getSpans(0, charSequence.length(), C59156f.class);
        C59181q[] qVarArr = (C59181q[]) spannable.getSpans(0, charSequence.length(), C59181q.class);
        C59179o[] oVarArr = (C59179o[]) spannable.getSpans(0, charSequence.length(), C59179o.class);
        if (m229423a((C59152b[]) spannable.getSpans(0, charSequence.length(), C59152b.class))) {
            i = 1;
        }
        if (m229423a(fVarArr)) {
            i |= 2;
        }
        if (m229423a(qVarArr)) {
            i |= 4;
        }
        if (m229423a(oVarArr)) {
            i |= 8;
        }
        return m229420a(i);
    }

    /* renamed from: a */
    private static void m229422a(Object[] objArr, Spannable spannable, int[] iArr, int i) {
        for (Object obj : objArr) {
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            if (!(spanStart == -1 || spanEnd == -1)) {
                while (spanStart < spanEnd) {
                    iArr[spanStart] = iArr[spanStart] | i;
                    spanStart++;
                }
            }
        }
    }
}
