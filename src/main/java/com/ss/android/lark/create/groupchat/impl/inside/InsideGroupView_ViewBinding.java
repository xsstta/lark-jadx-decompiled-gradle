package com.ss.android.lark.create.groupchat.impl.inside;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;

public class InsideGroupView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InsideGroupView f93763a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InsideGroupView insideGroupView = this.f93763a;
        if (insideGroupView != null) {
            this.f93763a = null;
            insideGroupView.mChatterPicker = null;
            insideGroupView.mSelectCountTV = null;
            insideGroupView.mConfirmBT = null;
            insideGroupView.mCancelBT = null;
            insideGroupView.mBottomDetailRL = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InsideGroupView_ViewBinding(InsideGroupView insideGroupView, View view) {
        this.f93763a = insideGroupView;
        insideGroupView.mChatterPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.inside_group_chatter_picker, "field 'mChatterPicker'", ChatterPicker.class);
        insideGroupView.mSelectCountTV = (TextView) Utils.findOptionalViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        insideGroupView.mConfirmBT = (UDButton) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBT'", UDButton.class);
        insideGroupView.mCancelBT = (Button) Utils.findOptionalViewAsType(view, R.id.cancel, "field 'mCancelBT'", Button.class);
        insideGroupView.mBottomDetailRL = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomDetailRL'", ViewGroup.class);
    }
}
