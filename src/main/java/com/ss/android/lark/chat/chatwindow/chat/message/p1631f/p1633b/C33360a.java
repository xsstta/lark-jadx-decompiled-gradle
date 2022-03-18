package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.p1593a.C32807a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.b.a */
public class C33360a extends C32807a {
    /* renamed from: u */
    public static int m129177u(boolean z) {
        return z ? R.raw.anim_translating_for_me : R.raw.anim_translating_for_others;
    }

    /* renamed from: a */
    public static Drawable m129151a() {
        Drawable drawable = UIHelper.getDrawable(R.drawable.old_bubble_alpha_black_bg);
        ((GradientDrawable) drawable).setColor(f84189G);
        return drawable;
    }

    /* renamed from: b */
    public static Drawable m129154b() {
        return m129151a();
    }

    /* renamed from: c */
    public static Drawable m129157c() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(f84187E);
        ColorDrawable colorDrawable2 = new ColorDrawable();
        colorDrawable2.setColor(UIHelper.getColor(R.color.lkui_transparent));
        stateListDrawable.addState(new int[]{16842913}, colorDrawable);
        stateListDrawable.addState(new int[]{-16842913}, colorDrawable2);
        return stateListDrawable;
    }

    /* renamed from: a */
    public static int m129150a(boolean z) {
        if (z) {
            return f84209a;
        }
        return f84189G;
    }

    /* renamed from: b */
    public static int m129153b(boolean z) {
        if (z) {
            return f84212d;
        }
        return f84192J;
    }

    /* renamed from: c */
    public static int m129156c(boolean z) {
        if (z) {
            return f84213e;
        }
        return f84193K;
    }

    /* renamed from: d */
    public static int m129159d(boolean z) {
        if (z) {
            return f84215g;
        }
        return f84195M;
    }

    /* renamed from: e */
    public static int m129161e(boolean z) {
        if (z) {
            return f84216h;
        }
        return f84196N;
    }

    /* renamed from: f */
    public static int m129162f(boolean z) {
        return C32807a.m125901y(z);
    }

    /* renamed from: g */
    public static int m129163g(boolean z) {
        if (z) {
            return f84216h;
        }
        return f84196N;
    }

    /* renamed from: h */
    public static int m129164h(boolean z) {
        if (z) {
            return f84218j;
        }
        return f84198P;
    }

    /* renamed from: i */
    public static int m129165i(boolean z) {
        if (z) {
            return f84216h;
        }
        return f84196N;
    }

    /* renamed from: j */
    public static Drawable m129166j(boolean z) {
        return C32807a.m125900x(z);
    }

    /* renamed from: k */
    public static int m129167k(boolean z) {
        if (z) {
            return f84226r;
        }
        return f84206X;
    }

    /* renamed from: l */
    public static int m129168l(boolean z) {
        if (z) {
            return f84229u;
        }
        return aa;
    }

    /* renamed from: m */
    public static int m129169m(boolean z) {
        if (z) {
            return f84230v;
        }
        return ab;
    }

    /* renamed from: o */
    public static int m129171o(boolean z) {
        if (z) {
            return f84232x;
        }
        return ad;
    }

    /* renamed from: p */
    public static int m129172p(boolean z) {
        if (z) {
            return f84185C;
        }
        return f175446ai;
    }

    /* renamed from: q */
    public static int m129173q(boolean z) {
        if (z) {
            return f84188F;
        }
        return ak;
    }

    /* renamed from: r */
    public static int m129174r(boolean z) {
        if (z) {
            return f84186D;
        }
        return aj;
    }

    /* renamed from: s */
    public static int m129175s(boolean z) {
        if (z) {
            return f84216h;
        }
        return f84196N;
    }

    /* renamed from: t */
    public static int m129176t(boolean z) {
        if (z) {
            return f84216h;
        }
        return f84196N;
    }

    /* renamed from: v */
    public static int m129178v(boolean z) {
        return m129164h(z);
    }

    /* renamed from: w */
    public static int m129179w(boolean z) {
        if (z) {
            return f84218j;
        }
        return f84198P;
    }

    /* renamed from: n */
    public static Drawable m129170n(boolean z) {
        int i;
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable();
        if (z) {
            i = f84231w;
        } else {
            i = ac;
        }
        colorDrawable.setColor(i);
        ColorDrawable colorDrawable2 = new ColorDrawable();
        colorDrawable2.setColor(UIHelper.getColor(R.color.lkui_transparent));
        stateListDrawable.addState(new int[]{16842919}, colorDrawable);
        stateListDrawable.addState(new int[]{-16842919}, colorDrawable2);
        return stateListDrawable;
    }

    /* renamed from: c */
    public static Drawable m129158c(Context context, boolean z) {
        int i;
        if (z) {
            i = R.drawable.ic_svg_chat_audio_message_text_flag_gray_n600;
        } else {
            i = R.drawable.ic_svg_chat_audio_message_text_flag_gray_n500;
        }
        return UIUtils.getDrawable(context, i);
    }

    /* renamed from: b */
    public static Drawable m129155b(Context context, boolean z) {
        int i;
        Drawable drawable = UIUtils.getDrawable(context, R.drawable.chat_bubble_reaction_bg);
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        if (z) {
            i = f84214f;
        } else {
            i = f84194L;
        }
        gradientDrawable.setColor(i);
        return drawable;
    }

    /* renamed from: d */
    public static Drawable m129160d(Context context, boolean z) {
        int c = LKUIDisplayManager.m91881c(context, 16);
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, UIUtils.getColor(context, R.color.primary_pri_600));
        iconDrawable.setBounds(0, 0, c, c);
        return iconDrawable;
    }

    /* renamed from: a */
    public static Drawable m129152a(Context context, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = R.drawable.post_show_more_bg_blue;
        } else {
            i = R.drawable.post_show_more_bg_gray;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) UIUtils.getDrawable(context, i);
        int[] iArr = new int[2];
        if (z) {
            i2 = f84211c;
        } else {
            i2 = f84191I;
        }
        iArr[0] = i2;
        if (z) {
            i3 = f84210b;
        } else {
            i3 = f84190H;
        }
        iArr[1] = i3;
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }
}
