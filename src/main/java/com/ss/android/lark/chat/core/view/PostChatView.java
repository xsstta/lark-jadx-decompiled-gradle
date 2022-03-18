package com.ss.android.lark.chat.core.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import java.util.List;

public class PostChatView extends ConstraintLayout {

    /* renamed from: a */
    public EllipsizedEmojiconTextView f87564a;

    /* renamed from: b */
    public View f87565b;

    /* renamed from: c */
    public RichTextView f87566c;

    /* renamed from: d */
    public View f87567d;

    /* renamed from: e */
    public TextView f87568e;

    /* renamed from: f */
    public EllipsizeFrameLayout f87569f;

    /* renamed from: g */
    public View.OnLongClickListener f87570g;

    /* renamed from: h */
    public View.OnClickListener f87571h;

    /* renamed from: i */
    public AbstractC33970a f87572i;

    /* renamed from: j */
    private RichTextView.AbstractC59024b f87573j;

    /* renamed from: k */
    private RichTextView.AbstractC59026d f87574k;

    /* renamed from: l */
    private boolean f87575l;

    /* renamed from: m */
    private double f87576m;

    /* renamed from: com.ss.android.lark.chat.core.view.PostChatView$a */
    public interface AbstractC33970a {
        void onClick(View view);
    }

    public RichTextView getContentView() {
        return this.f87566c;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f87571h;
    }

    public View getTitleDivisionView() {
        return this.f87565b;
    }

    public TextView getTitleView() {
        return this.f87564a;
    }

    public void setEnableEllipsize(boolean z) {
        this.f87575l = z;
    }

    public void setMaxHeightFactor(double d) {
        this.f87576m = d;
    }

    public void setOnLongTextClickListener(AbstractC33970a aVar) {
        this.f87572i = aVar;
    }

    public PostChatView(Context context) {
        this(context, null);
    }

    public void setAbbreviationsClockListener(LinkEmojiTextView.AbstractC58520e eVar) {
        this.f87566c.setAbbreviationListener(eVar);
    }

    public void setAtStringClickListener(LinkEmojiTextView.AbstractC58521f fVar) {
        this.f87566c.setAtStringClickListner(fVar);
    }

    public void setIntentionClickListener(LinkEmojiTextView.AbstractC58523h hVar) {
        this.f87566c.setIntentionClickListener(hVar);
    }

    public void setMentionStringClickListener(IMentionSpanClickListener fVar) {
        this.f87566c.setMentionListener(fVar);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f87571h = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f87570g = onLongClickListener;
    }

    public void setPhoneStringClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f87566c.setPhoneStringClickListener(iVar);
    }

    public void setPostImageListener(RichTextView.AbstractC59024b bVar) {
        if (bVar != null) {
            this.f87573j = bVar;
        }
    }

    public void setPostVideoListener(RichTextView.AbstractC59026d dVar) {
        if (dVar != null) {
            this.f87574k = dVar;
        }
    }

    public void setShowMoreTextSize(int i) {
        this.f87568e.setTextSize(0, (float) i);
    }

    public void setShowMoreViewBg(int i) {
        this.f87567d.setBackgroundResource(i);
    }

    public void setTextColor(int i) {
        this.f87564a.setTextColor(i);
    }

    public void setTextEmojiSize(int i) {
        this.f87566c.setEmojIconSize(i);
    }

    public void setTitleTextColor(int i) {
        this.f87564a.setTextColor(i);
    }

    public void setTitleTextSize(int i) {
        this.f87564a.setTextSize(0, (float) i);
    }

    public void setUrlStringClickListener(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f87566c.setUrlStringClickListner(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m131451a(final boolean z) {
        this.f87569f.post(new Runnable() {
            /* class com.ss.android.lark.chat.core.view.PostChatView.RunnableC339682 */

            public void run() {
                int i;
                boolean z = true;
                int i2 = 0;
                if (!z ? PostChatView.this.f87567d.getVisibility() == 8 && PostChatView.this.f87568e.getVisibility() == 8 : PostChatView.this.f87567d.getVisibility() == 0 && PostChatView.this.f87568e.getVisibility() == 0) {
                    z = false;
                }
                if (z) {
                    C0689b bVar = new C0689b();
                    bVar.mo3901b(PostChatView.this);
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
                    bVar.mo3905c(PostChatView.this);
                }
            }
        });
    }

    public void setShowMoreViewBg(Drawable drawable) {
        this.f87567d.setBackground(drawable);
    }

    public void setTitleDivisionViewVisible(int i) {
        boolean z;
        if (this.f87565b.getVisibility() != i) {
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

    public void setTextSize(float f) {
        if (DesktopUtil.m144301a(getContext())) {
            float sp2px = UIUtils.sp2px(getContext(), 14.0f);
            this.f87564a.setTextSize(0, f);
            this.f87564a.setEmojiconSize((int) f);
            this.f87566c.setTextSize(sp2px);
            this.f87566c.setImageMode(4);
            return;
        }
        this.f87564a.setTextSize(0, f);
        this.f87566c.setTextSize(f);
    }

    public void setTitleLayoutVisible(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = 0;
        if (!z ? this.f87565b.getVisibility() == 8 && this.f87564a.getVisibility() == 8 : this.f87565b.getVisibility() == 0 && this.f87564a.getVisibility() == 0) {
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
    private void m131448a(Context context) {
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = new EllipsizedEmojiconTextView(context);
        this.f87564a = ellipsizedEmojiconTextView;
        ellipsizedEmojiconTextView.setId(R.id.title);
        C25649b.m91856a((TextView) this.f87564a, 17);
        this.f87564a.setEmojiconSize(LKUIDisplayManager.m91881c(context, 20));
        this.f87564a.setEllipsize(TextUtils.TruncateAt.END);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f87564a;
        ellipsizedEmojiconTextView2.setTypeface(ellipsizedEmojiconTextView2.getTypeface(), 1);
        ConstraintLayout.LayoutParams a = C33972a.m131457a(context, -2.0f, -2.0f);
        a.f2825q = 0;
        a.f2827s = 0;
        a.f2816h = 0;
        a.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f87564a, a);
        View view = new View(context);
        this.f87565b = view;
        view.setId(R.id.title_division);
        this.f87565b.setBackgroundColor(C25653b.m91894a(context, R.color.line_border_component, 0.5f));
        ConstraintLayout.LayoutParams a2 = C33972a.m131458a(context, BitmapDescriptorFactory.HUE_RED, 1.0f, 0, 8, 0, 0);
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2817i = R.id.title;
        a2.f2834z = BitmapDescriptorFactory.HUE_RED;
        a2.f2829u = 0;
        addView(this.f87565b, a2);
        EllipsizeFrameLayout ellipsizeFrameLayout = new EllipsizeFrameLayout(context);
        this.f87569f = ellipsizeFrameLayout;
        ellipsizeFrameLayout.setId(R.id.post_content_container);
        this.f87569f.setEnableEllipsize(false);
        ConstraintLayout.LayoutParams a3 = C33972a.m131458a(context, -2.0f, -2.0f, 0, 8, 0, 0);
        a3.f2825q = 0;
        a3.f2827s = 0;
        a3.f2817i = R.id.title_division;
        a3.f2829u = 0;
        a3.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f87569f, a3);
        RichTextView richTextView = new RichTextView(context);
        this.f87566c = richTextView;
        richTextView.setId(R.id.post_content);
        this.f87569f.addView(this.f87566c);
        if (DesktopUtil.m144301a(getContext())) {
            float sp2px = UIUtils.sp2px(getContext(), 14.0f);
            this.f87564a.setTextSize(0, sp2px);
            this.f87564a.setEmojiconSize((int) sp2px);
            this.f87566c.setTextSize(sp2px);
        }
        View view2 = new View(context);
        this.f87567d = view2;
        view2.setId(R.id.post_show_more);
        ConstraintLayout.LayoutParams a4 = C33972a.m131457a(context, BitmapDescriptorFactory.HUE_RED, 48.0f);
        a4.f2825q = 0;
        a4.f2827s = 0;
        a4.f2819k = 0;
        this.f87567d.setVisibility(8);
        addView(this.f87567d, a4);
        TextView textView = new TextView(context);
        this.f87568e = textView;
        textView.setId(R.id.post_show_more_text);
        this.f87568e.setBackgroundResource(R.drawable.chat_post_bg_show_more);
        this.f87568e.setGravity(17);
        this.f87568e.setPadding(C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 2.0f), C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 6.0f));
        this.f87568e.setText(R.string.Lark_Legacy_ChatShowMore);
        this.f87568e.setVisibility(8);
        C25649b.m91856a(this.f87568e, 14);
        this.f87568e.setTextColor(C57582a.m223616d(context, R.color.text_title));
        ConstraintLayout.LayoutParams a5 = C33972a.m131458a(context, -2.0f, -2.0f, 0, 0, 0, 3);
        a5.f2825q = 0;
        a5.f2827s = 0;
        a5.f2819k = 0;
        addView(this.f87568e, a5);
    }

    public PostChatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PostChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m131448a(context);
    }

    /* renamed from: a */
    private void m131450a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            setTitleLayoutVisible(false);
            return;
        }
        setTitleLayoutVisible(true);
        if (z) {
            this.f87564a.setMaxLines(1000);
        } else {
            this.f87564a.setMaxLines(2);
        }
        this.f87564a.setTranslateEmojiCode(false);
        this.f87564a.setTextColor(UIHelper.getColor(R.color.text_title));
        this.f87564a.setText(str);
    }

    /* renamed from: a */
    private void m131449a(RichText richText, String str, List<String> list, List<String> list2, final boolean z, boolean z2, boolean z3) {
        this.f87568e.setText(UIHelper.getString(R.string.Lark_Legacy_ChatShowMore));
        this.f87568e.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.core.view.PostChatView.C339671 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (PostChatView.this.f87572i != null) {
                    PostChatView.this.f87572i.onClick(view);
                }
            }
        });
        this.f87569f.setMaxHeightFactor(this.f87576m);
        this.f87569f.setEllipsizeListener(new EllipsizeFrameLayout.AbstractC58303a() {
            /* class com.ss.android.lark.chat.core.view.$$Lambda$PostChatView$4yPlXGZMpLah352T1Q4iMXwyXjE */

            @Override // com.ss.android.lark.widget.EllipsizeFrameLayout.AbstractC58303a
            public final void onEllipsize(boolean z) {
                PostChatView.this.m131451a((PostChatView) z);
            }
        });
        if (!z) {
            this.f87569f.setEnableEllipsize(this.f87575l);
        } else {
            this.f87569f.setEnableEllipsize(false);
        }
        this.f87566c.setRichTextImageListener(this.f87573j);
        this.f87566c.setRichTextVideoListener(this.f87574k);
        this.f87566c.setNeedShowAtDot(z3);
        this.f87566c.setAtReadUserIdList(list2);
        this.f87566c.setBotIdList(list);
        if (C59035h.m229210a(richText)) {
            UIUtils.hide(this.f87566c);
        } else {
            UIUtils.show(this.f87566c);
        }
        this.f87566c.setRichTextListener(new RichTextView.AbstractC59025c() {
            /* class com.ss.android.lark.chat.core.view.PostChatView.C339693 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124117a(TextView textView) {
                if (PostChatView.this.f87571h != null && !z) {
                    PostChatView.this.f87571h.onClick(textView);
                }
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124118a(String str, TextView textView) {
                if (PostChatView.this.f87570g != null) {
                    PostChatView.this.f87570g.onLongClick(textView);
                }
            }
        });
        this.f87566c.mo200509a(richText, str, z2);
    }

    /* renamed from: a */
    public void mo124088a(String str, RichText richText, String str2, String str3, List<String> list, List<String> list2, boolean z, boolean z2, boolean z3) {
        m131450a(str, str3, z);
        m131449a(richText, str2, list, list2, z, z2, z3);
    }
}
