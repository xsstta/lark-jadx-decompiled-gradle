package com.ss.android.lark.widget.richtext;

import android.text.Spannable;
import android.text.TextUtils;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.C59063k;
import com.ss.android.lark.widget.span.AtInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.lark.widget.richtext.c */
public class C59029c {
    /* renamed from: a */
    public static RichText m229155a() {
        RichText richText = new RichText();
        RichText.RichTextElements richTextElements = new RichText.RichTextElements();
        richTextElements.setDictionary(new HashMap());
        richText.setElementIds(new ArrayList());
        richText.setImageIds(new ArrayList());
        richText.setAtIds(new ArrayList());
        richText.setAnchorIds(new ArrayList());
        richText.setMediaIds(new ArrayList());
        richText.setElements(richTextElements);
        richText.setInnerText("");
        richText.setRichTextVersion(0);
        return richText;
    }

    /* renamed from: b */
    public static RichText m229161b(String str) {
        return m229156a(str, false);
    }

    /* renamed from: a */
    public static List<RichTextElement> m229158a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || !(charSequence instanceof Spannable)) {
            return m229159a(charSequence.toString());
        }
        Spannable spannable = (Spannable) charSequence;
        C58514h[] hVarArr = (C58514h[]) spannable.getSpans(0, charSequence.length(), C58514h.class);
        if (hVarArr == null || hVarArr.length == 0) {
            return m229159a(charSequence.toString());
        }
        return C59063k.m229419a(spannable);
    }

    /* renamed from: c */
    private static List<AtInfo> m229162c(String str) {
        Matcher matcher = C57814c.f142386a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            AtInfo atInfo = new AtInfo();
            atInfo.start = matcher.start();
            atInfo.end = matcher.end();
            atInfo.userId = matcher.group(1);
            atInfo.text = matcher.group(2);
            arrayList.add(atInfo);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.lark.widget.richtext.RichText m229157a(java.util.List<com.ss.android.lark.widget.richtext.RichTextElement> r17) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.C59029c.m229157a(java.util.List):com.ss.android.lark.widget.richtext.RichText");
    }

    /* renamed from: a */
    public static List<RichTextElement> m229159a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '\n') {
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    arrayList.add(C59030d.m229164a(sb2));
                    sb = new StringBuilder();
                }
                arrayList.add(C59030d.m229171a(true));
            } else {
                sb.append(charArray[i]);
            }
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            arrayList.add(C59030d.m229164a(sb.toString()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m229160a(RichTextElement richTextElement) {
        if (richTextElement.getTag() == RichTextElement.RichTextTag.TEXT || richTextElement.getTag() == RichTextElement.RichTextTag.AT || richTextElement.getTag() == RichTextElement.RichTextTag.EMOTION || richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR || richTextElement.getTag() == RichTextElement.RichTextTag.MENTION) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static RichText m229156a(String str, boolean z) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return m229155a();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List<AtInfo> c = m229162c(str);
        if (c.isEmpty()) {
            arrayList.addAll(m229159a(str));
            sb.append(str);
        } else {
            for (int i2 = 0; i2 < c.size(); i2++) {
                AtInfo atInfo = c.get(i2);
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = c.get(i2 - 1).end;
                }
                String substring = str.substring(i, atInfo.start);
                if (!TextUtils.isEmpty(substring)) {
                    arrayList.addAll(m229159a(substring));
                    sb.append(substring);
                }
                arrayList.add(C59030d.m229170a(atInfo.userId, atInfo.text.substring(1), false, z));
                sb.append(atInfo.text);
                sb.append(" ");
            }
            String substring2 = str.substring(c.get(c.size() - 1).end);
            if (!TextUtils.isEmpty(substring2)) {
                arrayList.addAll(m229159a(substring2));
                sb.append(substring2);
            }
        }
        RichText a = m229157a(arrayList);
        a.setInnerText(sb.toString());
        return a;
    }
}
