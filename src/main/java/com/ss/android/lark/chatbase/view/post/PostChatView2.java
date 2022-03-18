package com.ss.android.lark.chatbase.view.post;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.core.view.PostChatView;
import com.ss.android.lark.chat.utils.C34346l;
import com.ss.android.lark.chatthread.C35121d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.announce_opendoc.AnnounceOpenDocHitPoint;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IImageSpanClickListener;
import com.ss.android.lark.widget.light.listener.IIntentionClickListener;
import com.ss.android.lark.widget.light.listener.IMediaSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class PostChatView2 extends ConstraintLayout {

    /* renamed from: a */
    public TextView f88958a;

    /* renamed from: b */
    public View f88959b;

    /* renamed from: c */
    public LKUILightTextView f88960c;

    /* renamed from: d */
    public View f88961d;

    /* renamed from: e */
    public TextView f88962e;

    /* renamed from: f */
    public EllipsizeFrameLayout f88963f;

    /* renamed from: g */
    public View.OnLongClickListener f88964g;

    /* renamed from: h */
    public View.OnClickListener f88965h;

    /* renamed from: i */
    public PostChatView.AbstractC33970a f88966i;

    /* renamed from: j */
    public String f88967j;

    /* renamed from: k */
    public boolean f88968k;

    /* renamed from: l */
    public String f88969l;

    /* renamed from: m */
    public boolean f88970m;

    /* renamed from: n */
    public String f88971n;

    /* renamed from: o */
    public String f88972o;

    /* renamed from: p */
    public String f88973p;

    /* renamed from: q */
    public boolean f88974q;

    /* renamed from: r */
    private View.OnClickListener f88975r;

    /* renamed from: s */
    private boolean f88976s;

    /* renamed from: t */
    private double f88977t;

    public LKUILightTextView getContentView() {
        return this.f88960c;
    }

    public View getTitleDivisionView() {
        return this.f88959b;
    }

    public TextView getTitleView() {
        return this.f88958a;
    }

    /* renamed from: b */
    private void m133636b() {
        setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatbase.view.post.PostChatView2.C344534 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                String str;
                if (!PostChatView2.this.f88970m) {
                    if (!TextUtils.isEmpty(PostChatView2.this.f88971n)) {
                        String str2 = PostChatView2.this.f88972o;
                    }
                    if (!TextUtils.isEmpty(PostChatView2.this.f88971n)) {
                        str = PostChatView2.this.f88971n;
                    } else {
                        str = PostChatView2.this.f88972o;
                    }
                    if (!PostChatView2.this.f88968k) {
                        C35121d.m137110a(PostChatView2.this.getContext(), PostChatView2.this.f88973p, PostChatView2.this.f88967j, str);
                        ChatHitPoint.f135648a.mo187355a("postMessage", PostChatView2.this.f88974q);
                    } else if (!TextUtils.isEmpty(PostChatView2.this.f88969l)) {
                        C29990c.m110930b().mo134593u().mo134330a(PostChatView2.this.getContext(), PostChatView2.this.f88969l);
                        AnnounceOpenDocHitPoint.f135643a.mo187338a("message", PostChatView2.this.f88973p);
                    }
                } else if (PostChatView2.this.f88965h != null) {
                    PostChatView2.this.f88965h.onClick(view);
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo127191a() {
        if (this.f88962e.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setEnableEllipsize(boolean z) {
        this.f88976s = z;
    }

    public void setMaxHeightFactor(double d) {
        this.f88977t = d;
    }

    public void setOnLongTextClickListener(PostChatView.AbstractC33970a aVar) {
        this.f88966i = aVar;
    }

    public void setPreMessageOnClickListener(View.OnClickListener onClickListener) {
        this.f88965h = onClickListener;
    }

    public PostChatView2(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133633a(View view) {
        View.OnClickListener onClickListener = this.f88975r;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void setAbbreviationsClickListener(IAbbreviationClickListener aVar) {
        this.f88960c.setAbbreviationClickListener(aVar);
    }

    public void setAtSpanClickListener(IAtSpanClickListener bVar) {
        this.f88960c.setAtSpanClickListener(bVar);
    }

    public void setImageClickListener(IImageSpanClickListener cVar) {
        this.f88960c.setImageSpanClickListener(cVar);
    }

    public void setIntentionClickListener(IIntentionClickListener dVar) {
        this.f88960c.setIntentionClickListener(dVar);
    }

    public void setMentionSpanClickListener(IMentionSpanClickListener fVar) {
        this.f88960c.setMentionSpanClickListener(fVar);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f88975r = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f88964g = onLongClickListener;
    }

    public void setPhoneSpanClickListener(IPhoneSpanClickListener hVar) {
        this.f88960c.setPhoneSpanClickListener(hVar);
    }

    public void setShowMoreTextSize(float f) {
        this.f88962e.setTextSize(0, f);
    }

    public void setShowMoreViewBg(int i) {
        this.f88961d.setBackgroundResource(i);
    }

    public void setTextSize(int i) {
        this.f88960c.setTextSize(i);
    }

    public void setTitleTextColor(int i) {
        this.f88958a.setTextColor(i);
    }

    public void setUrlSpanClickListener(IUrlSpanClickListener jVar) {
        this.f88960c.setUrlSpanClickListener(jVar);
    }

    public void setVideoClickListener(IMediaSpanClickListener eVar) {
        this.f88960c.setMediaSpanClickListener(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133635a(final boolean z) {
        this.f88963f.post(new Runnable() {
            /* class com.ss.android.lark.chatbase.view.post.PostChatView2.RunnableC344512 */

            public void run() {
                int i;
                boolean z = true;
                int i2 = 0;
                if (!z ? PostChatView2.this.f88961d.getVisibility() == 8 && PostChatView2.this.f88962e.getVisibility() == 8 : PostChatView2.this.f88961d.getVisibility() == 0 && PostChatView2.this.f88962e.getVisibility() == 0) {
                    z = false;
                }
                if (z) {
                    C0689b bVar = new C0689b();
                    bVar.mo3901b(PostChatView2.this);
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    bVar.mo3899b(R.id.post_show_more, i);
                    if (!z) {
                        i2 = 8;
                    }
                    bVar.mo3899b(R.id.post_show_more_text, i2);
                    bVar.mo3905c(PostChatView2.this);
                }
            }
        });
    }

    public void setShowMoreViewBg(Drawable drawable) {
        this.f88961d.setBackground(drawable);
    }

    public void setTitleDivisionViewVisible(int i) {
        boolean z;
        if (this.f88959b.getVisibility() != i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0689b bVar = new C0689b();
            bVar.mo3901b(this);
            bVar.mo3899b(R.id.title_division, i);
            bVar.mo3905c(this);
        }
    }

    public void setTitleDrawableStart(Drawable drawable) {
        this.f88958a.setCompoundDrawablesRelative(drawable, null, null, null);
        this.f88958a.setCompoundDrawablePadding(UIHelper.dp2px(8.0f));
    }

    public void setTitleTextSize(float f) {
        if (DesktopUtil.m144301a(getContext())) {
            this.f88958a.setTextSize(14.0f);
        } else {
            this.f88958a.setTextSize(0, f);
        }
    }

    public void setTitleLayoutVisible(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = 0;
        if (!z ? this.f88959b.getVisibility() == 8 && this.f88958a.getVisibility() == 8 : this.f88959b.getVisibility() == 0 && this.f88958a.getVisibility() == 0) {
            z2 = false;
        }
        if (z2) {
            C0689b bVar = new C0689b();
            bVar.mo3901b(this);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            bVar.mo3899b(R.id.title_division, i);
            if (!z) {
                i2 = 8;
            }
            bVar.mo3899b(R.id.title, i2);
            bVar.mo3905c(this);
        }
    }

    /* renamed from: a */
    private void m133631a(Context context) {
        TextView textView = new TextView(context);
        this.f88958a = textView;
        textView.setId(R.id.title);
        C25649b.m91856a(this.f88958a, 17);
        this.f88958a.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView2 = this.f88958a;
        textView2.setTypeface(textView2.getTypeface(), 1);
        ConstraintLayout.LayoutParams a = C34346l.m133187a(-2.0f, -2.0f);
        a.f2825q = 0;
        a.f2827s = 0;
        a.f2816h = 0;
        a.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f88958a, a);
        View view = new View(context);
        this.f88959b = view;
        view.setId(R.id.title_division);
        this.f88959b.setBackgroundColor(UDColorUtils.getColor(context, R.color.line_divider_default));
        ConstraintLayout.LayoutParams a2 = C34346l.m133188a(BitmapDescriptorFactory.HUE_RED, 0.5f, 0, 8, 0, 0);
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2817i = R.id.title;
        a2.f2834z = BitmapDescriptorFactory.HUE_RED;
        a2.f2829u = 0;
        addView(this.f88959b, a2);
        EllipsizeFrameLayout ellipsizeFrameLayout = new EllipsizeFrameLayout(context);
        this.f88963f = ellipsizeFrameLayout;
        ellipsizeFrameLayout.setId(R.id.post_content_container);
        this.f88963f.setEnableEllipsize(false);
        ConstraintLayout.LayoutParams a3 = C34346l.m133188a(-2.0f, -2.0f, 0, 8, 0, 0);
        a3.f2825q = 0;
        a3.f2827s = 0;
        a3.f2817i = R.id.title_division;
        a3.f2829u = 0;
        a3.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f88963f, a3);
        LKUILightTextView lKUILightTextView = new LKUILightTextView(context);
        this.f88960c = lKUILightTextView;
        lKUILightTextView.setId(R.id.post_content);
        this.f88963f.addView(this.f88960c);
        View view2 = new View(context);
        this.f88961d = view2;
        view2.setId(R.id.post_show_more);
        ConstraintLayout.LayoutParams a4 = C34346l.m133187a(BitmapDescriptorFactory.HUE_RED, 48.0f);
        a4.f2825q = 0;
        a4.f2827s = 0;
        a4.f2819k = 0;
        this.f88961d.setVisibility(8);
        addView(this.f88961d, a4);
        TextView textView3 = new TextView(context);
        this.f88962e = textView3;
        textView3.setId(R.id.post_show_more_text);
        this.f88962e.setBackgroundResource(R.drawable.chat_post_bg_show_more);
        this.f88962e.setGravity(17);
        this.f88962e.setPadding(C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 2.0f), C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 6.0f));
        this.f88962e.setText(R.string.Lark_Legacy_ChatShowMore);
        this.f88962e.setVisibility(8);
        C25649b.m91856a(this.f88962e, 14);
        this.f88962e.setTextColor(C57582a.m223616d(context, R.color.text_title));
        this.f88962e.setVisibility(8);
        ConstraintLayout.LayoutParams a5 = C34346l.m133188a(-2.0f, -2.0f, 0, 0, 0, 3);
        a5.f2825q = 0;
        a5.f2827s = 0;
        a5.f2819k = 0;
        addView(this.f88962e, a5);
    }

    public PostChatView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m133632a(Layout layout, boolean z) {
        this.f88962e.setText(UIHelper.getString(R.string.Lark_Legacy_ChatShowMore));
        this.f88962e.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatbase.view.post.PostChatView2.C344501 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (PostChatView2.this.f88966i != null) {
                    PostChatView2.this.f88966i.onClick(view);
                }
            }
        });
        this.f88963f.setMaxHeightFactor(this.f88977t);
        this.f88963f.setEllipsizeListener(new EllipsizeFrameLayout.AbstractC58303a() {
            /* class com.ss.android.lark.chatbase.view.post.$$Lambda$PostChatView2$qygUNDWs97fucxh3y5Yn5qWU4Nw */

            @Override // com.ss.android.lark.widget.EllipsizeFrameLayout.AbstractC58303a
            public final void onEllipsize(boolean z) {
                PostChatView2.this.m133635a((PostChatView2) z);
            }
        });
        if (!z) {
            this.f88963f.setEnableEllipsize(this.f88976s);
        } else {
            this.f88963f.setEnableEllipsize(false);
        }
        this.f88960c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chatbase.view.post.$$Lambda$PostChatView2$z8PgYGmn8FPr9uB_c1rHIhjNgd0 */

            public final void onClick(View view) {
                PostChatView2.this.m133633a((PostChatView2) view);
            }
        });
        this.f88960c.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.chatbase.view.post.PostChatView2.View$OnLongClickListenerC344523 */

            public boolean onLongClick(View view) {
                if (PostChatView2.this.f88964g == null) {
                    return true;
                }
                PostChatView2.this.f88964g.onLongClick(view);
                return true;
            }
        });
        if (layout == null) {
            UIUtils.hide(this.f88960c);
            return;
        }
        UIUtils.show(this.f88960c);
        this.f88960c.setContentLayout(layout);
    }

    /* renamed from: a */
    private void m133634a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            setTitleLayoutVisible(false);
            return;
        }
        setTitleLayoutVisible(true);
        if (z) {
            this.f88958a.setMaxLines(1000);
        } else {
            this.f88958a.setMaxLines(2);
        }
        this.f88958a.setText(str);
        if (!this.f88968k) {
            this.f88958a.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_title));
            return;
        }
        this.f88958a.setPadding(UIHelper.dp2px(1.0f), UIHelper.dp2px(3.0f), UIHelper.dp2px(1.0f), UIHelper.dp2px(3.0f));
        this.f88958a.requestLayout();
        this.f88958a.setTextColor(UDColorUtils.getColor(getContext(), R.color.udtoken_message_card_text_orange));
        setTitleDrawableStart(UDIconUtils.getIconDrawable(getContext(), R.drawable.ud_icon_announce_filled, UDColorUtils.getColor(getContext(), R.color.udtoken_message_card_text_orange), new UDDimension.Dp(LKUIDisplayManager.m91861a(16.0f))));
        C25649b.m91857a(this.f88958a, LarkFont.HEADLINE);
    }

    public PostChatView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m133631a(context);
    }

    /* renamed from: a */
    public void mo127190a(String str, Layout layout, boolean z, String str2, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4) {
        this.f88967j = str;
        this.f88968k = z2;
        this.f88969l = str5;
        this.f88970m = z;
        this.f88973p = str2;
        this.f88972o = str3;
        this.f88971n = str4;
        this.f88974q = z4;
        m133634a(str, z3);
        m133632a(layout, z3);
        m133636b();
    }
}
