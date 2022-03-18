package com.ss.android.lark.chat.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.yoga.android.YogaLayout;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.message.card.view.AbstractC45339h;

public class CardChatView extends FrameLayout implements AbstractC45339h {

    /* renamed from: a */
    public LKUIRoundLinearLayout f87560a;

    /* renamed from: b */
    public FrameLayout f87561b;

    /* renamed from: c */
    public FrameLayout f87562c;

    /* renamed from: d */
    public YogaLayout f87563d;

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public FrameLayout getContentLayout() {
        return this.f87562c;
    }

    public FrameLayout getHeaderContainer() {
        return this.f87561b;
    }

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public LKUIRoundLinearLayout getRootLayout() {
        return this.f87560a;
    }

    @Override // com.ss.android.lark.message.card.view.AbstractC45339h
    public YogaLayout getYogaLayout() {
        return this.f87563d;
    }

    public CardChatView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m131447a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.chat_core_card_content_item, (ViewGroup) this, true);
        this.f87560a = (LKUIRoundLinearLayout) findViewById(R.id.root);
        this.f87561b = (FrameLayout) findViewById(R.id.header_container);
        this.f87562c = (FrameLayout) findViewById(R.id.card_content_layout);
        this.f87563d = new YogaLayout(context);
    }

    public CardChatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m131447a(context);
    }
}
