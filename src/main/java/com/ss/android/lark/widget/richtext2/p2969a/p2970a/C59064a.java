package com.ss.android.lark.widget.richtext2.p2969a.p2970a;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;
import com.ss.android.lark.widget.richtext2.entity.DetailCodeBlockParseResult;
import com.ss.android.lark.widget.richtext2.p2971b.C59065a;
import com.ss.android.lark.widget.richtext2.p2972c.AbstractC59066a;
import com.ss.android.lark.widget.richtext2.span.C59068a;
import com.ss.android.lark.widget.richtext2.span.p2975c.C59072a;
import com.ss.android.lark.widget.richtext2.span.p2976d.C59081b;
import com.ss.android.lark.widget.richtext2.widget.C59089a;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.richtext2.a.a.a */
public class C59064a {

    /* renamed from: a */
    private Context f146414a;

    /* renamed from: a */
    public DetailCodeBlockParseResult mo200658a(RichTextElement.CodeBlockProperty codeBlockProperty) {
        C59068a a = m229431a(codeBlockProperty, false);
        if (a == null) {
            return null;
        }
        DetailCodeBlockParseResult detailCodeBlockParseResult = new DetailCodeBlockParseResult();
        detailCodeBlockParseResult.setSpanBuilder(a);
        return detailCodeBlockParseResult;
    }

    public C59064a(Context context) {
        this.f146414a = context;
    }

    /* renamed from: a */
    private int m229429a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '\n') {
                i++;
            }
        }
        return i + 1;
    }

    /* renamed from: a */
    private int m229428a(int i) {
        if (i <= 0) {
            return 0;
        }
        int dimens = UIHelper.getDimens(R.dimen.code_block_font_size_default);
        Paint a = AbstractC59066a.m229437a();
        a.setTextSize((float) dimens);
        return (int) (((double) a.measureText(i + "")) + 0.5d);
    }

    /* renamed from: a */
    private void m229435a(C59068a aVar) {
        aVar.setSpan(new C59081b.C59083a().mo200715a((float) UIHelper.getDimens(R.dimen.line_spacing_extra_code_block)).mo200716a(), 0, aVar.length(), 33);
    }

    /* renamed from: a */
    private C59068a m229431a(RichTextElement.CodeBlockProperty codeBlockProperty, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        String content = codeBlockProperty.getContent();
        int a = m229429a(content);
        if (a <= 0) {
            return null;
        }
        if (z && a > 10) {
            content = m229432a(content, 10);
            a = 10;
        }
        C59068a aVar = new C59068a(this.f146414a, content);
        m229433a(a, aVar);
        m229434a(codeBlockProperty, aVar);
        m229435a(aVar);
        Log.m165383e("CodeBlockParser", "Code block parse total time: " + (System.currentTimeMillis() - currentTimeMillis));
        return aVar;
    }

    /* renamed from: a */
    private C59065a m229430a(List<Integer> list, List<RichTextElement.CodeBlockProperty.Style> list2) {
        RichTextElement.CodeBlockProperty.Style style;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (Integer num : list) {
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < list2.size() && (style = list2.get(intValue)) != null) {
                String str = style.name;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1550943582:
                        if (str.equals("fontStyle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1050679889:
                        if (str.equals("-lark-textDecoration")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -734428249:
                        if (str.equals("fontWeight")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 94842723:
                        if (str.equals("color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1287124693:
                        if (str.equals("backgroundColor")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        z2 = UIHelper.getString(R.string.remote_font_style_italic).equals(style.value);
                        continue;
                    case 1:
                        String string = UIHelper.getString(R.string.remote_text_lark_decoration_underline);
                        String string2 = UIHelper.getString(R.string.remote_text_lark_decoration_line_through);
                        boolean equals = string.equals(style.value);
                        z4 = string2.equals(style.value);
                        z3 = equals;
                        continue;
                    case 2:
                        z = UIHelper.getString(R.string.remote_font_weight_bold).equals(style.value);
                        continue;
                    case 3:
                        i = C59089a.m229505a(style.value);
                        continue;
                    case 4:
                        i2 = C59089a.m229505a(style.value);
                        continue;
                }
            }
        }
        return new C59065a(-1, i, i2, z, z2, z3, z4);
    }

    /* renamed from: a */
    private String m229432a(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            return "";
        }
        int min = Math.min(i, m229429a(str));
        if (!str.endsWith("\n")) {
            str = str + "\n";
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '\n') {
                min--;
            }
            if (min == 0) {
                return str.substring(0, i2);
            }
        }
        return "";
    }

    /* renamed from: a */
    private void m229433a(int i, C59068a aVar) {
        int i2;
        C59072a.C59074a a = new C59072a.C59074a().mo200706a((float) m229428a(i)).mo200710b((float) UIHelper.getDimens(R.dimen.code_block_line_num_right_margin)).mo200707a(UIHelper.getColor(R.color.lkui_N600));
        if (C59042d.m229248a((CharSequence) aVar)) {
            aVar.append(" ");
        }
        String aVar2 = aVar.toString();
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i) {
            C59072a a2 = a.mo200708a(i3 + "").mo200709a();
            int indexOf = aVar2.indexOf("\n", i4);
            if (indexOf == -1) {
                i2 = aVar.length();
            } else {
                i2 = indexOf + 1;
            }
            int min = Math.min(i2, aVar.length());
            aVar.setSpan(a2, i4, min, 33);
            i3++;
            i4 = min;
        }
    }

    /* renamed from: a */
    private void m229434a(RichTextElement.CodeBlockProperty codeBlockProperty, C59068a aVar) {
        List<RichTextElement.CodeBlockProperty.StyleRef> styleRefList = codeBlockProperty.getStyleRefList();
        List<RichTextElement.CodeBlockProperty.Style> styleList = codeBlockProperty.getStyleList();
        if (!(CollectionUtils.isEmpty(styleRefList) || CollectionUtils.isEmpty(styleList))) {
            int length = aVar.length();
            for (RichTextElement.CodeBlockProperty.StyleRef styleRef : styleRefList) {
                if (styleRef != null && styleRef.length > 0) {
                    int i = styleRef.location;
                    int i2 = styleRef.length + i;
                    List<Integer> list = styleRef.styleIds;
                    if (length > i && length >= i2 && !CollectionUtils.isEmpty(list)) {
                        aVar.setSpan(m229430a(list, styleList), i, i2, 33);
                    }
                }
            }
        }
    }
}
