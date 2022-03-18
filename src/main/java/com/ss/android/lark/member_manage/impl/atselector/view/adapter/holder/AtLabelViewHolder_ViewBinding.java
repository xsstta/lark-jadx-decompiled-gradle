package com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AtLabelViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AtLabelViewHolder f114027a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AtLabelViewHolder atLabelViewHolder = this.f114027a;
        if (atLabelViewHolder != null) {
            this.f114027a = null;
            atLabelViewHolder.mLabelTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AtLabelViewHolder_ViewBinding(AtLabelViewHolder atLabelViewHolder, View view) {
        this.f114027a = atLabelViewHolder;
        atLabelViewHolder.mLabelTV = (TextView) Utils.findRequiredViewAsType(view, R.id.label, "field 'mLabelTV'", TextView.class);
    }
}
