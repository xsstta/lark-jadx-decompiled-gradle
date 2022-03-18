package com.ss.android.lark.chat.core.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextChatView extends ConstraintLayout {

    /* renamed from: a */
    public RichTextView f87582a;

    /* renamed from: b */
    public View f87583b;

    /* renamed from: c */
    public TextView f87584c;

    /* renamed from: d */
    public EllipsizeFrameLayout f87585d;

    /* renamed from: e */
    public AbstractC33971a f87586e;

    /* renamed from: com.ss.android.lark.chat.core.view.TextChatView$a */
    public interface AbstractC33971a {
        void onClick(View view);
    }

    public RichTextView getRichTextView() {
        return this.f87582a;
    }

    public void setOnShoreMoreClickListener(AbstractC33971a aVar) {
        this.f87586e = aVar;
    }

    public TextChatView(Context context) {
        this(context, null);
    }

    public void setAbbreviationClickListener(LinkEmojiTextView.AbstractC58520e eVar) {
        this.f87582a.setAbbreviationListener(eVar);
    }

    public void setAtStringClickListener(LinkEmojiTextView.AbstractC58521f fVar) {
        this.f87582a.setAtStringClickListner(fVar);
    }

    public void setEnableEllipsize(boolean z) {
        this.f87585d.setEnableEllipsize(z);
    }

    public void setMaxHeightFactor(double d) {
        this.f87585d.setMaxHeightFactor(d);
    }

    public void setMentionStringClickListener(IMentionSpanClickListener fVar) {
        this.f87582a.setMentionListener(fVar);
    }

    public void setPhoneStringClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f87582a.setPhoneStringClickListener(iVar);
    }

    public void setRichTextClickListener(RichTextView.AbstractC59025c cVar) {
        this.f87582a.setRichTextListener(cVar);
    }

    public void setShowMoreViewBg(Drawable drawable) {
        this.f87583b.setBackground(drawable);
    }

    public void setTextColor(int i) {
        this.f87582a.setTextColor(i);
    }

    public void setUrlStringClickListener(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f87582a.setUrlStringClickListner(jVar);
    }

    public void setUseNewAtStyle(boolean z) {
        this.f87582a.setUseNewAtStyle(z);
    }

    public void setEmojiSize(int i) {
        if (!DesktopUtil.m144307b()) {
            this.f87582a.setEmojIconSize(i);
        }
    }

    public void setTextSize(float f) {
        if (DesktopUtil.m144301a(getContext())) {
            this.f87582a.setTextSize(UIUtils.sp2px(getContext(), 14.0f));
            return;
        }
        this.f87582a.setTextSize(f);
    }

    public void setShowMoreTextSize(float f) {
        if (DesktopUtil.m144301a(getContext())) {
            this.f87584c.setTextSize(UIUtils.sp2px(getContext(), 14.0f));
            return;
        }
        this.f87584c.setTextSize(0, f);
    }

    /* renamed from: a */
    private void m131455a(Context context) {
        EllipsizeFrameLayout ellipsizeFrameLayout = new EllipsizeFrameLayout(context);
        this.f87585d = ellipsizeFrameLayout;
        ellipsizeFrameLayout.setId(R.id.post_content_container);
        this.f87585d.setEnableEllipsize(false);
        ConstraintLayout.LayoutParams a = C33972a.m131457a(context, -2.0f, -2.0f);
        a.f2825q = 0;
        a.f2827s = 0;
        a.f2816h = 0;
        a.f2834z = BitmapDescriptorFactory.HUE_RED;
        addView(this.f87585d, a);
        RichTextView richTextView = new RichTextView(context);
        this.f87582a = richTextView;
        richTextView.setId(R.id.message);
        if (DesktopUtil.m144301a(getContext())) {
            this.f87582a.setTextSize(UIUtils.sp2px(getContext(), 14.0f));
        } else {
            this.f87582a.setTextSize(LKUIDisplayManager.m91864a(getContext(), 17));
            this.f87582a.setEmojIconSize(LKUIDisplayManager.m91881c(context, 20));
        }
        this.f87585d.addView(this.f87582a);
        View view = new View(context);
        this.f87583b = view;
        view.setId(R.id.post_show_more);
        this.f87583b.setVisibility(8);
        ConstraintLayout.LayoutParams a2 = C33972a.m131457a(context, BitmapDescriptorFactory.HUE_RED, 48.0f);
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2819k = R.id.post_content_container;
        addView(this.f87583b, a2);
        TextView textView = new TextView(context);
        this.f87584c = textView;
        textView.setId(R.id.post_show_more_text);
        this.f87584c.setBackgroundResource(R.drawable.chat_post_bg_show_more);
        this.f87584c.setGravity(17);
        this.f87584c.setPadding(C57582a.m223601a(context, 15.0f), 0, C57582a.m223601a(context, 15.0f), C57582a.m223601a(context, 5.0f));
        this.f87584c.setText(R.string.Lark_Legacy_ChatShowMore);
        C25649b.m91856a(this.f87584c, 14);
        this.f87584c.setTextColor(C57582a.m223616d(context, R.color.text_title));
        this.f87584c.setVisibility(8);
        ConstraintLayout.LayoutParams a3 = C33972a.m131458a(context, -2.0f, -2.0f, 0, 0, 0, -5);
        a3.f2825q = 0;
        a3.f2827s = 0;
        a3.f2819k = R.id.post_content_container;
        addView(this.f87584c, a3);
    }

    public TextChatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m131455a(context);
    }
}
