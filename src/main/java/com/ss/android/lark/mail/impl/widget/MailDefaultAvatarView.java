package com.ss.android.lark.mail.impl.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class MailDefaultAvatarView extends RelativeLayout {

    /* renamed from: f */
    private static final List<Integer> f111644f = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView.C439891 */

        {
            add(Integer.valueOf((int) R.color.ud_B400));
            add(Integer.valueOf((int) R.color.ud_W400));
            add(Integer.valueOf((int) R.color.ud_O400));
            add(Integer.valueOf((int) R.color.ud_R400));
            add(Integer.valueOf((int) R.color.ud_V400));
            add(Integer.valueOf((int) R.color.ud_I400));
            add(Integer.valueOf((int) R.color.ud_L400));
        }
    };

    /* renamed from: a */
    LKUIRoundedImageView2 f111645a;

    /* renamed from: b */
    LKUIRoundedImageView2 f111646b;

    /* renamed from: c */
    TextView f111647c;

    /* renamed from: d */
    ImageView f111648d;

    /* renamed from: e */
    int f111649e;

    public MailDefaultAvatarView(Context context) {
        this(context, null);
    }

    public void setAvatar(int i) {
        this.f111645a.setVisibility(0);
        this.f111646b.setVisibility(8);
        this.f111647c.setVisibility(8);
        this.f111645a.setImageResource(i);
        this.f111645a.setBackgroundColor(0);
    }

    public void setWarningFlag(boolean z) {
        if (z) {
            this.f111648d.setVisibility(0);
            this.f111648d.setImageResource(R.drawable.ud_icon_warning_red_colorful);
            return;
        }
        this.f111648d.setVisibility(8);
    }

    public void setDefaultAvatarText(CharSequence charSequence) {
        int i;
        this.f111645a.setVisibility(8);
        this.f111646b.setVisibility(0);
        this.f111647c.setVisibility(0);
        if (!TextUtils.isEmpty(charSequence)) {
            String charSequence2 = charSequence.toString();
            int indexOf = charSequence2.indexOf(64);
            if (indexOf < 1) {
                indexOf = 1;
            }
            int codePointAt = charSequence2.codePointAt(0) + charSequence2.codePointAt((int) Math.floor((double) (indexOf / 2))) + charSequence2.codePointAt(indexOf - 1);
            List<Integer> list = f111644f;
            i = list.get(codePointAt % list.size()).intValue();
            this.f111647c.setText(charSequence2.substring(0, 1).toUpperCase());
        } else {
            i = f111644f.get(0).intValue();
            this.f111647c.setText("");
        }
        this.f111646b.setImageDrawable(new ColorDrawable(UIHelper.getColor(i)));
    }

    /* renamed from: a */
    private void m174216a(int i) {
        float f;
        int i2;
        if (i == 3) {
            f = 20.0f;
        } else {
            f = 16.0f;
        }
        int dp2px = UIHelper.dp2px(f);
        if (i == 0) {
            this.f111649e = (int) UIHelper.getResources().getDimension(R.dimen.mail_setting_account_avatar_big_size);
            i2 = 20;
        } else if (i == 2) {
            this.f111649e = (int) UIHelper.getResources().getDimension(R.dimen.mail_setting_account_avatar_small_size);
            i2 = 12;
        } else if (i != 3) {
            this.f111649e = (int) UIHelper.getResources().getDimension(R.dimen.mail_setting_account_avatar_medium_size);
            i2 = 14;
        } else {
            this.f111649e = UIHelper.dp2px(60.0f);
            i2 = 17;
        }
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(getContext());
        this.f111646b = lKUIRoundedImageView2;
        lKUIRoundedImageView2.setOval(true);
        int i3 = this.f111649e;
        addView(this.f111646b, new RelativeLayout.LayoutParams(i3, i3));
        TextView textView = new TextView(getContext());
        this.f111647c = textView;
        textView.setTextColor(UIHelper.getColor(R.color.lkui_N100));
        this.f111647c.setTextSize((float) i2);
        this.f111647c.setIncludeFontPadding(false);
        this.f111647c.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f111647c, layoutParams);
        LKUIRoundedImageView2 lKUIRoundedImageView22 = new LKUIRoundedImageView2(getContext());
        this.f111645a = lKUIRoundedImageView22;
        lKUIRoundedImageView22.setOval(true);
        int i4 = this.f111649e;
        addView(this.f111645a, new RelativeLayout.LayoutParams(i4, i4));
        View view = new View(getContext());
        view.setBackgroundResource(R.drawable.mail_avatar_dark_mode_mask_background);
        int i5 = this.f111649e;
        addView(view, new RelativeLayout.LayoutParams(i5, i5));
        this.f111648d = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dp2px, dp2px);
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        addView(this.f111648d, layoutParams2);
    }

    public MailDefaultAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MailDefaultAvatarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public void mo156548a(final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str2)) {
            MailAddress e = C42107a.m168074a().mo152038e(str);
            if (e != null) {
                str2 = e.mo151192m();
            } else {
                str2 = null;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView.RunnableC439902 */

                public void run() {
                    final String str;
                    if (str != null) {
                        str = C41816b.m166115a().mo150115E().mo150185a(str, MailDefaultAvatarView.this.f111649e);
                    } else {
                        str = "";
                    }
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView.RunnableC439902.RunnableC439911 */

                        public void run() {
                            if (!TextUtils.isEmpty(str)) {
                                MailDefaultAvatarView.this.f111645a.setVisibility(0);
                                MailDefaultAvatarView.this.f111645a.setBackgroundResource(R.drawable.icon_circle_bg);
                                MailDefaultAvatarView.this.f111646b.setVisibility(8);
                                MailDefaultAvatarView.this.f111647c.setVisibility(8);
                                C41816b.m166115a().mo150155v().mo150205a(MailDefaultAvatarView.this.getContext(), str, MailDefaultAvatarView.this.f111645a, MailDefaultAvatarView.this.f111649e, MailDefaultAvatarView.this.f111649e);
                                return;
                            }
                            MailDefaultAvatarView.this.setDefaultAvatarText(str3);
                        }
                    });
                }
            });
            return;
        }
        this.f111645a.setVisibility(0);
        this.f111645a.setBackgroundResource(R.drawable.icon_circle_bg);
        this.f111646b.setVisibility(8);
        this.f111647c.setVisibility(8);
        AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
        Context context = getContext();
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.f111645a;
        int i = this.f111649e;
        v.mo150205a(context, str2, lKUIRoundedImageView2, i, i);
    }

    public MailDefaultAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m174216a(getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.mda_size}).getInt(0, 1));
    }
}
