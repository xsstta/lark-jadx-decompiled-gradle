package com.ss.android.lark.chat.p1593a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.a.a */
public class C32807a {

    /* renamed from: A */
    protected static int f84183A = 0;

    /* renamed from: B */
    protected static int f84184B = 0;

    /* renamed from: C */
    protected static int f84185C = 0;

    /* renamed from: D */
    protected static int f84186D = 0;

    /* renamed from: E */
    protected static int f84187E = 0;

    /* renamed from: F */
    protected static int f84188F = 0;

    /* renamed from: G */
    protected static int f84189G = 0;

    /* renamed from: H */
    protected static int f84190H = 0;

    /* renamed from: I */
    protected static int f84191I = 0;

    /* renamed from: J */
    protected static int f84192J = 0;

    /* renamed from: K */
    protected static int f84193K = 0;

    /* renamed from: L */
    protected static int f84194L = 0;

    /* renamed from: M */
    protected static int f84195M = 0;

    /* renamed from: N */
    protected static int f84196N = 0;

    /* renamed from: O */
    protected static int f84197O = 0;

    /* renamed from: P */
    protected static int f84198P = 0;

    /* renamed from: Q */
    protected static int f84199Q = 0;

    /* renamed from: R */
    protected static int f84200R = 0;

    /* renamed from: S */
    protected static int f84201S = 0;

    /* renamed from: T */
    protected static int f84202T = 0;

    /* renamed from: U */
    protected static int f84203U = 0;

    /* renamed from: V */
    protected static int f84204V = 0;

    /* renamed from: W */
    protected static int f84205W = 0;

    /* renamed from: X */
    protected static int f84206X = 0;

    /* renamed from: Y */
    protected static int f84207Y = 0;

    /* renamed from: Z */
    protected static int f84208Z = 0;

    /* renamed from: a */
    protected static int f84209a = 0;
    protected static int aa = 0;
    protected static int ab = 0;
    protected static int ac = 0;
    protected static int ad = 0;
    protected static int ae = 0;
    protected static int af = 0;
    protected static int ag = 0;
    protected static int ah = 0;

    /* renamed from: ai  reason: collision with root package name */
    protected static int f175446ai = 0;
    protected static int aj = 0;
    protected static int ak = 0;
    private static int al = -1;
    private static Boolean am;

    /* renamed from: b */
    protected static int f84210b;

    /* renamed from: c */
    protected static int f84211c;

    /* renamed from: d */
    protected static int f84212d;

    /* renamed from: e */
    protected static int f84213e;

    /* renamed from: f */
    protected static int f84214f;

    /* renamed from: g */
    protected static int f84215g;

    /* renamed from: h */
    protected static int f84216h;

    /* renamed from: i */
    protected static int f84217i;

    /* renamed from: j */
    protected static int f84218j;

    /* renamed from: k */
    protected static int f84219k;

    /* renamed from: l */
    protected static int f84220l;

    /* renamed from: m */
    protected static int f84221m;

    /* renamed from: n */
    protected static int f84222n;

    /* renamed from: o */
    protected static int f84223o;

    /* renamed from: p */
    protected static int f84224p;

    /* renamed from: q */
    protected static int f84225q;

    /* renamed from: r */
    protected static int f84226r;

    /* renamed from: s */
    protected static int f84227s;

    /* renamed from: t */
    protected static int f84228t;

    /* renamed from: u */
    protected static int f84229u;

    /* renamed from: v */
    protected static int f84230v;

    /* renamed from: w */
    protected static int f84231w;

    /* renamed from: x */
    protected static int f84232x;

    /* renamed from: y */
    protected static int f84233y;

    /* renamed from: z */
    protected static int f84234z;

    static {
        m125899a(LarkContext.getApplication().getApplicationContext());
    }

    /* renamed from: A */
    public static int m125895A(boolean z) {
        if (z) {
            return f84183A;
        }
        return ag;
    }

    /* renamed from: B */
    public static int m125896B(boolean z) {
        if (z) {
            return f84234z;
        }
        return af;
    }

    /* renamed from: C */
    public static int m125897C(boolean z) {
        if (z) {
            return f84184B;
        }
        return ah;
    }

    /* renamed from: y */
    public static int m125901y(boolean z) {
        if (z) {
            return f84217i;
        }
        return f84197O;
    }

    /* renamed from: z */
    public static int m125902z(boolean z) {
        if (z) {
            return f84233y;
        }
        return ae;
    }

    /* renamed from: a */
    public static Drawable m125898a(Drawable drawable) {
        ((GradientDrawable) drawable).setColor(f84189G);
        return drawable;
    }

    /* renamed from: x */
    public static Drawable m125900x(boolean z) {
        int i;
        Drawable drawable = UIHelper.getDrawable(R.drawable.chat_chat_bubble_reply_mark_bg);
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        if (z) {
            i = f84216h;
        } else {
            i = f84196N;
        }
        gradientDrawable.setColor(i);
        return drawable;
    }

    /* renamed from: a */
    public static void m125899a(Context context) {
        boolean z;
        if (am == null) {
            Log.m165389i("BubbleConfigExport", "isNightMode null");
        } else {
            Log.m165389i("BubbleConfigExport", "isNightMode " + am);
        }
        Boolean bool = am;
        if (bool == null || bool.booleanValue() != UDUiModeUtils.m93319a(context)) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("BubbleConfigExport", "needAssignColor " + z);
        if (z) {
            am = Boolean.valueOf(UDUiModeUtils.m93319a(context));
            Log.m165389i("BubbleConfigExport", "new isNightMode " + am);
            f84209a = UDColorUtils.getColor(context, R.color.imtoken_message_bg_bubbles_blue);
            f84210b = C25653b.m91893a(C57582a.m223616d(context, R.color.imtoken_message_bg_show_more_blue), (float) BitmapDescriptorFactory.HUE_RED);
            f84211c = UDColorUtils.getColor(context, R.color.imtoken_message_bg_bubbles_blue);
            f84212d = C57582a.m223616d(context, R.color.ud_B500_15);
            f84213e = C57582a.m223616d(context, R.color.text_caption);
            f84214f = C57582a.m223616d(context, R.color.imtoken_message_bg_reaction_blue);
            f84215g = R.color.text_caption;
            f84216h = C57582a.m223616d(context, R.color.line_divider_default);
            f84217i = C25653b.m91893a(C57582a.m223616d(context, R.color.text_caption), 1.0f);
            f84218j = C25653b.m91893a(C57582a.m223616d(context, R.color.text_link_normal), 1.0f);
            f84219k = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_B500), 1.0f);
            int i = al;
            f84220l = i;
            f84221m = i;
            f84222n = i;
            f84223o = i;
            f84224p = C25653b.m91893a(C57582a.m223616d(context, R.color.static_white), 1.0f);
            f84225q = C25653b.m91893a(C57582a.m223616d(context, R.color.primary_pri_700), 1.0f);
            f84226r = R.color.text_caption;
            f84227s = C25653b.m91893a(C57582a.m223616d(context, R.color.primary_pri_700), 1.0f);
            f84228t = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N900), 1.0f);
            f84229u = R.color.imtoken_message_icon_read_dot;
            f84230v = R.color.imtoken_message_icon_unread_dot;
            f84231w = C25653b.m91893a(C57582a.m223616d(context, R.color.ud_N900), 0.16f);
            f84232x = R.color.text_placeholder;
            f84233y = C57582a.m223616d(context, R.color.ud_N600);
            f84234z = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N00), 0.8f);
            f84183A = C25653b.m91893a(C57582a.m223616d(context, R.color.ud_N500), 0.5f);
            f84184B = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N00), 0.5f);
            f84185C = R.color.text_link_normal;
            f84186D = C57582a.m223616d(context, R.color.text_title);
            f84187E = C57582a.m223616d(context, R.color.imtoken_message_selected_bg);
            f84188F = C57582a.m223616d(context, R.color.text_caption);
            f84189G = UDColorUtils.getColor(context, R.color.imtoken_message_bg_bubbles_grey);
            f84190H = C25653b.m91893a(C57582a.m223616d(context, R.color.imtoken_message_bg_show_more_grey), (float) BitmapDescriptorFactory.HUE_RED);
            f84191I = UDColorUtils.getColor(context, R.color.imtoken_message_bg_bubbles_grey);
            f84192J = C57582a.m223616d(context, R.color.ud_N900_05);
            f84193K = C57582a.m223616d(context, R.color.text_caption);
            f84194L = C57582a.m223616d(context, R.color.imtoken_message_bg_reaction_grey);
            f84195M = R.color.text_caption;
            f84196N = C57582a.m223616d(context, R.color.line_divider_default);
            f84197O = C25653b.m91893a(C57582a.m223616d(context, R.color.text_caption), 1.0f);
            f84198P = C25653b.m91893a(C57582a.m223616d(context, R.color.text_link_normal), 1.0f);
            f84199Q = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_B500), 1.0f);
            int i2 = al;
            f84200R = i2;
            f84201S = i2;
            f84202T = i2;
            f84203U = i2;
            f84204V = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N00), 1.0f);
            f84205W = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_B700), 1.0f);
            f84206X = R.color.text_caption;
            f84207Y = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_B700), 1.0f);
            f84208Z = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N900), 1.0f);
            aa = R.color.imtoken_message_icon_read_dot;
            ab = R.color.imtoken_message_icon_unread_dot;
            ac = C25653b.m91893a(C57582a.m223616d(context, R.color.ud_N900), 0.16f);
            ad = R.color.text_placeholder;
            ae = C57582a.m223616d(context, R.color.ud_N600);
            af = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N00), 0.8f);
            ag = C25653b.m91893a(C57582a.m223616d(context, R.color.ud_N500), 0.5f);
            ah = C25653b.m91893a(C57582a.m223616d(context, R.color.lkui_N00), 0.5f);
            f175446ai = R.color.text_link_normal;
            aj = C57582a.m223616d(context, R.color.text_title);
            ak = C57582a.m223616d(context, R.color.text_caption);
        }
    }
}
