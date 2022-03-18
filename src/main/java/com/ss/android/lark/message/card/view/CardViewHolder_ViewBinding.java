package com.ss.android.lark.message.card.view;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.suite.R;

public class CardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CardViewHolder f114726a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CardViewHolder cardViewHolder = this.f114726a;
        if (cardViewHolder != null) {
            this.f114726a = null;
            cardViewHolder.mRootLayout = null;
            cardViewHolder.mHeaderContainer = null;
            cardViewHolder.mCardContentLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CardViewHolder_ViewBinding(CardViewHolder cardViewHolder, View view) {
        this.f114726a = cardViewHolder;
        cardViewHolder.mRootLayout = (LKUIRoundLinearLayout) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRootLayout'", LKUIRoundLinearLayout.class);
        cardViewHolder.mHeaderContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.header_container, "field 'mHeaderContainer'", FrameLayout.class);
        cardViewHolder.mCardContentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.card_content_layout, "field 'mCardContentLayout'", FrameLayout.class);
    }
}
