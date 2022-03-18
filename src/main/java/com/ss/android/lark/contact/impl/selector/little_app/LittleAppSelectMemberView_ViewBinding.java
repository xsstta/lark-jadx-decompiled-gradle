package com.ss.android.lark.contact.impl.selector.little_app;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class LittleAppSelectMemberView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LittleAppSelectMemberView f93010a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LittleAppSelectMemberView littleAppSelectMemberView = this.f93010a;
        if (littleAppSelectMemberView != null) {
            this.f93010a = null;
            littleAppSelectMemberView.mTitleBar = null;
            littleAppSelectMemberView.mChatterPicker = null;
            littleAppSelectMemberView.mSelectCountTV = null;
            littleAppSelectMemberView.mConfirmBT = null;
            littleAppSelectMemberView.mBottomDetailRL = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LittleAppSelectMemberView_ViewBinding(LittleAppSelectMemberView littleAppSelectMemberView, View view) {
        this.f93010a = littleAppSelectMemberView;
        littleAppSelectMemberView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        littleAppSelectMemberView.mChatterPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.gadget_chatter_picker, "field 'mChatterPicker'", ChatterPicker.class);
        littleAppSelectMemberView.mSelectCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        littleAppSelectMemberView.mConfirmBT = (TextView) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBT'", TextView.class);
        littleAppSelectMemberView.mBottomDetailRL = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomDetailRL'", RelativeLayout.class);
    }
}
