package com.ss.android.lark.widget.richtext2.span.p2975c;

import android.graphics.Paint;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext2.p2972c.AbstractC59066a;
import com.ss.android.lark.widget.span.PrefixSpan;

/* renamed from: com.ss.android.lark.widget.richtext2.span.c.b */
public class C59076b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.richtext2.span.c.b$1 */
    public static /* synthetic */ class C590771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146461a;

        /* renamed from: b */
        static final /* synthetic */ int[] f146462b;

        /* renamed from: c */
        static final /* synthetic */ int[] f146463c;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bc */
        static {
            /*
            // Method dump skipped, instructions count: 199
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext2.span.p2975c.C59076b.C590771.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static float m229453a(int i) {
        return (float) (i * UIHelper.getDimens(R.dimen.li_prefix_floor_left_margin));
    }

    /* renamed from: b */
    public static float m229458b(PrefixSpan.Type type) {
        int i = C590771.f146462b[type.ordinal()];
        if (i == 2 || i == 4) {
            return UIHelper.getContext().getResources().getDimension(R.dimen.li_prefix_mark_border_width);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public static float m229455a(PrefixSpan.Type type) {
        int i;
        int i2 = C590771.f146462b[type.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            i = UIHelper.getDimens(R.dimen.li_prefix_mark_common_width);
        } else if (i2 != 5) {
            i = 0;
        } else {
            i = UIHelper.getDimens(R.dimen.li_prefix_quote_width);
        }
        return (float) i;
    }

    /* renamed from: c */
    public static float m229460c(PrefixSpan.Type type) {
        int i;
        switch (C590771.f146462b[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i = UIHelper.getDimens(R.dimen.li_prefix_circle_right_margin);
                break;
            case 5:
                i = UIHelper.getDimens(R.dimen.li_prefix_quote_right_margin);
                break;
            case 6:
                i = UIHelper.getDimens(R.dimen.li_prefix_num_right_margin);
                break;
            case 7:
                i = UIHelper.getDimens(R.dimen.li_prefix_circle_right_margin);
                break;
            default:
                i = 0;
                break;
        }
        return (float) i;
    }

    /* renamed from: a */
    public static PrefixSpan.Type m229456a(RichTextElement.RichTextProperty richTextProperty) {
        if (richTextProperty instanceof RichTextElement.ULProperty) {
            int i = C590771.f146461a[((RichTextElement.ULProperty) richTextProperty).getType().ordinal()];
            if (i == 1) {
                return PrefixSpan.Type.FILL_CIRCLE;
            }
            if (i == 2) {
                return PrefixSpan.Type.HOLLOW_CIRCLE;
            }
            if (i != 3) {
                return PrefixSpan.Type.NONE;
            }
            return PrefixSpan.Type.FILL_RECT;
        } else if (richTextProperty instanceof RichTextElement.OLProperty) {
            return PrefixSpan.Type.LIST_NUM;
        } else {
            if (richTextProperty instanceof RichTextElement.QuoteProperty) {
                return PrefixSpan.Type.QUOTE;
            }
            return PrefixSpan.Type.NONE;
        }
    }

    /* renamed from: a */
    public static float m229454a(RichTextElement.OLProperty oLProperty, int i) {
        String b = m229459b(oLProperty, i);
        Paint a = AbstractC59066a.m229437a();
        a.setTextSize((float) UIHelper.getDimens(R.dimen.local_font_size_default));
        return a.measureText(b);
    }

    /* renamed from: a */
    private static String m229457a(int i, boolean z) {
        if (i == 0) {
            return "";
        }
        String str = new String[]{"", "M", "MM", "MMM"}[i / 1000] + new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}[(i % 1000) / 100] + new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[(i % 100) / 10] + new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[i % 10];
        if (z) {
            return str.toLowerCase();
        }
        return str;
    }

    /* renamed from: b */
    public static String m229459b(RichTextElement.OLProperty oLProperty, int i) {
        RichTextElement.OLProperty.Type type = oLProperty.getType();
        int start = oLProperty.getStart();
        if (start <= 0) {
            start = 1;
        }
        int i2 = start + i;
        int i3 = C590771.f146463c[type.ordinal()];
        if (i3 == 1) {
            return i2 + ".";
        } else if (i3 == 2) {
            return ((char) (i2 + 96)) + ".";
        } else if (i3 == 3) {
            return ((char) (i2 + 64)) + ".";
        } else if (i3 == 4) {
            return m229457a(i2, true) + ".";
        } else if (i3 != 5) {
            return "";
        } else {
            return m229457a(i2, false) + ".";
        }
    }
}
