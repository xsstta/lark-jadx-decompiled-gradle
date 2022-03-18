package com.ss.android.lark.chatbase.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.core.view.TextChatView;
import com.ss.android.lark.chat.utils.C34346l;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IIntentionClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class TextChatView2 extends ConstraintLayout {

    /* renamed from: a */
    public LKUILightTextView f88931a;

    /* renamed from: b */
    public View f88932b;

    /* renamed from: c */
    public TextView f88933c;

    /* renamed from: d */
    public EllipsizeFrameLayout f88934d;

    /* renamed from: e */
    public TextChatView.AbstractC33971a f88935e;

    public void setTextColor(int i) {
    }

    public LKUILightTextView getLightTextView() {
        return this.f88931a;
    }

    /* renamed from: a */
    public boolean mo127164a() {
        if (this.f88933c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setOnShoreMoreClickListener(TextChatView.AbstractC33971a aVar) {
        this.f88935e = aVar;
    }

    public TextChatView2(Context context) {
        this(context, null);
    }

    public void setAbbreviationClickListener(IAbbreviationClickListener aVar) {
        this.f88931a.setAbbreviationClickListener(aVar);
    }

    public void setAtSpanClickListener(IAtSpanClickListener bVar) {
        this.f88931a.setAtSpanClickListener(bVar);
    }

    public void setEnableEllipsize(boolean z) {
        this.f88934d.setEnableEllipsize(z);
    }

    public void setIntentionClickListener(IIntentionClickListener dVar) {
        this.f88931a.setIntentionClickListener(dVar);
    }

    public void setMaxHeightFactor(double d) {
        this.f88934d.setMaxHeightFactor(d);
    }

    public void setMentionSpanClickListener(IMentionSpanClickListener fVar) {
        this.f88931a.setMentionSpanClickListener(fVar);
    }

    public void setPhoneSpanClickListener(IPhoneSpanClickListener hVar) {
        this.f88931a.setPhoneSpanClickListener(hVar);
    }

    public void setShowMoreTextSize(float f) {
        this.f88933c.setTextSize(0, f);
    }

    public void setShowMoreViewBg(int i) {
        this.f88932b.setBackgroundResource(i);
    }

    public void setTextSize(float f) {
        this.f88931a.setTextSize((int) f);
    }

    public void setUrlSpanClickListener(IUrlSpanClickListener jVar) {
        this.f88931a.setUrlSpanClickListener(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133600a(final boolean z) {
        this.f88934d.post(new Runnable() {
            /* class com.ss.android.lark.chatbase.view.TextChatView2.RunnableC344422 */

            public void run() {
                int i;
                boolean z = true;
                int i2 = 0;
                if (!z ? TextChatView2.this.f88932b.getVisibility() == 8 && TextChatView2.this.f88933c.getVisibility() == 8 : TextChatView2.this.f88932b.getVisibility() == 0 && TextChatView2.this.f88933c.getVisibility() == 0) {
                    z = false;
                }
                if (z) {
                    C0689b bVar = new C0689b();
                    bVar.mo3901b(TextChatView2.this);
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
                    bVar.mo3905c(TextChatView2.this);
                }
            }
        });
    }

    /* renamed from: a */
    private void m133599a(Context context) {
        EllipsizeFrameLayout ellipsizeFrameLayout = new EllipsizeFrameLayout(context);
        this.f88934d = ellipsizeFrameLayout;
        ellipsizeFrameLayout.setId(R.id.post_content_container);
        this.f88934d.setEnableEllipsize(false);
        ConstraintLayout.LayoutParams a = C34346l.m133187a(-2.0f, -2.0f);
        a.f2825q = 0;
        a.f2827s = 0;
        a.f2816h = 0;
        a.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f88934d, a);
        this.f88931a = new LKUILightTextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.f88931a.setId(R.id.message);
        this.f88934d.addView(this.f88931a, layoutParams);
        View view = new View(context);
        this.f88932b = view;
        view.setId(R.id.post_show_more);
        ConstraintLayout.LayoutParams a2 = C34346l.m133187a(BitmapDescriptorFactory.HUE_RED, 48.0f);
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2819k = R.id.post_content_container;
        this.f88932b.setVisibility(8);
        addView(this.f88932b, a2);
        TextView textView = new TextView(context);
        this.f88933c = textView;
        textView.setId(R.id.post_show_more_text);
        this.f88933c.setBackgroundResource(R.drawable.chat_post_bg_show_more);
        this.f88933c.setGravity(17);
        this.f88933c.setPadding(C57582a.m223601a(context, 15.0f), 0, C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 5.0f));
        this.f88933c.setText(R.string.Lark_Legacy_ChatShowMore);
        this.f88933c.setVisibility(8);
        C25649b.m91856a(this.f88933c, 14);
        this.f88933c.setTextColor(C57582a.m223616d(context, R.color.text_title));
        ConstraintLayout.LayoutParams a3 = C34346l.m133188a(-2.0f, -2.0f, 0, 0, 0, -5);
        a3.f2825q = 0;
        a3.f2827s = 0;
        a3.f2819k = R.id.post_content_container;
        addView(this.f88933c, a3);
    }

    public TextChatView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextChatView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m133599a(context);
    }

    /* renamed from: a */
    public void mo127163a(Layout layout, boolean z, boolean z2, double d) {
        this.f88933c.setText(UIHelper.getString(R.string.Lark_Legacy_ChatShowMore));
        this.f88932b.setBackground(C33360a.m129152a(getContext(), z));
        this.f88933c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatbase.view.TextChatView2.C344411 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (TextChatView2.this.f88935e != null) {
                    TextChatView2.this.f88935e.onClick(view);
                }
            }
        });
        this.f88934d.setMaxHeightFactor(d);
        this.f88934d.setEnableEllipsize(z2);
        this.f88934d.setEllipsizeListener(new EllipsizeFrameLayout.AbstractC58303a() {
            /* class com.ss.android.lark.chatbase.view.$$Lambda$TextChatView2$VoueQUeNJ8ZTlyQCeka3ZofNQk */

            @Override // com.ss.android.lark.widget.EllipsizeFrameLayout.AbstractC58303a
            public final void onEllipsize(boolean z) {
                TextChatView2.this.m133600a((TextChatView2) z);
            }
        });
        if (layout == null) {
            UIUtils.hide(this.f88931a);
            return;
        }
        UIUtils.show(this.f88931a);
        this.f88931a.setContentLayout(layout);
    }
}
