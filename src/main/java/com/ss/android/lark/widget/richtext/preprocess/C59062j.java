package com.ss.android.lark.widget.richtext.preprocess;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext2.widget.C59089a;
import com.ss.android.lark.widget.span.TextStyleInfo;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.j */
public class C59062j {

    /* renamed from: a */
    private int f146405a = -1;

    /* renamed from: b */
    private int f146406b;

    /* renamed from: c */
    private int f146407c;

    /* renamed from: d */
    private boolean f146408d;

    /* renamed from: e */
    private boolean f146409e;

    /* renamed from: f */
    private boolean f146410f;

    /* renamed from: g */
    private boolean f146411g;

    /* renamed from: h */
    private Context f146412h;

    /* renamed from: i */
    private boolean f146413i;

    /* renamed from: a */
    public C59062j mo200653a() {
        this.f146405a = -1;
        this.f146406b = 0;
        this.f146407c = 0;
        this.f146408d = false;
        this.f146409e = false;
        this.f146410f = false;
        this.f146411g = false;
        this.f146413i = false;
        return this;
    }

    public C59062j(Context context) {
        this.f146412h = context;
    }

    /* renamed from: a */
    public C59062j mo200654a(ElementExtra elementExtra) {
        mo200657b(elementExtra.getLocalStyle());
        mo200655a(elementExtra.getRemoteStyle());
        return this;
    }

    /* renamed from: a */
    public TextStyleInfo mo200656a(String str) {
        if (!this.f146413i) {
            return null;
        }
        TextStyleInfo textStyleInfo = new TextStyleInfo();
        textStyleInfo.type = 4;
        textStyleInfo.text = str;
        textStyleInfo.textSize = this.f146405a;
        textStyleInfo.textColor = this.f146406b;
        textStyleInfo.textBgColor = this.f146407c;
        textStyleInfo.isBold = this.f146408d;
        textStyleInfo.isItalic = this.f146409e;
        textStyleInfo.isUnderlineText = this.f146410f;
        textStyleInfo.isStrikeThruText = this.f146411g;
        textStyleInfo.isIndependent = false;
        textStyleInfo.isGlobalSpanInfo = true;
        return textStyleInfo;
    }

    /* renamed from: a */
    public C59062j mo200655a(Map<String, String> map) {
        if (CollectionUtils.isEmpty(map)) {
            return this;
        }
        if (map.containsKey("color")) {
            this.f146406b = C59089a.m229505a(map.get("color"));
            this.f146413i = true;
        }
        if (map.containsKey("backgroundColor")) {
            this.f146407c = C59089a.m229505a(map.get("backgroundColor"));
            this.f146413i = true;
        }
        String str = map.get("fontWeight");
        String string = UIHelper.getString(R.string.remote_font_weight_bold);
        if (!TextUtils.isEmpty(str) && str.trim().equals(string)) {
            this.f146408d = true;
            this.f146413i = true;
        }
        String str2 = map.get("fontStyle");
        String string2 = UIHelper.getString(R.string.remote_font_style_italic);
        if (!TextUtils.isEmpty(str2) && str2.trim().equals(string2)) {
            this.f146409e = true;
            this.f146413i = true;
        }
        if (map.containsKey("-lark-textDecoration")) {
            String str3 = map.get("-lark-textDecoration");
            if (str3.contains(UIHelper.getString(R.string.remote_text_lark_decoration_underline))) {
                this.f146410f = true;
                this.f146413i = true;
            }
            if (str3.contains(UIHelper.getString(R.string.remote_text_lark_decoration_line_through))) {
                this.f146411g = true;
                this.f146413i = true;
            }
        }
        return this;
    }

    /* renamed from: b */
    public void mo200657b(Map<String, Integer> map) {
        if (!CollectionUtils.isEmpty(map)) {
            Integer num = map.get("localFontSize");
            Integer num2 = map.get("localFontColor");
            Integer num3 = map.get("localFontBgColor");
            Integer num4 = map.get("localFontWeight");
            Integer num5 = map.get("localFontStyle");
            Integer num6 = map.get("localTextDecoration");
            if (num != null) {
                this.f146405a = (int) this.f146412h.getResources().getDimension(num.intValue());
                this.f146413i = true;
            }
            if (num2 != null) {
                this.f146406b = this.f146412h.getResources().getColor(num2.intValue());
                this.f146413i = true;
            }
            if (num3 != null) {
                this.f146407c = this.f146412h.getResources().getColor(num3.intValue());
                this.f146413i = true;
            }
            if (num4 != null && num4.intValue() == R.string.local_font_weight_bold) {
                this.f146408d = true;
                this.f146413i = true;
            }
            if (num5 != null && num5.intValue() == R.string.local_font_style_italic) {
                this.f146409e = true;
                this.f146413i = true;
            }
            if (num6 != null && num6.intValue() == R.string.local_text_decoration_underline) {
                this.f146410f = true;
                this.f146413i = true;
            }
        }
    }
}
