package com.ss.android.lark.contact.impl.contacts_email.edit.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public final class CardEditView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CardEditView f91940a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CardEditView cardEditView = this.f91940a;
        if (cardEditView != null) {
            this.f91940a = null;
            cardEditView.titleBar = null;
            cardEditView.cardEditRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CardEditView_ViewBinding(CardEditView cardEditView, View view) {
        this.f91940a = cardEditView;
        cardEditView.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.edit_title_bar, "field 'titleBar'", CommonTitleBar.class);
        cardEditView.cardEditRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.card_edit_rv, "field 'cardEditRV'", CommonRecyclerView.class);
    }
}
