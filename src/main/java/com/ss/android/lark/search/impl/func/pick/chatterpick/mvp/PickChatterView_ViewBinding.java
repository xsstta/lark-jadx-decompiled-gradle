package com.ss.android.lark.search.impl.func.pick.chatterpick.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class PickChatterView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PickChatterView f132462a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PickChatterView pickChatterView = this.f132462a;
        if (pickChatterView != null) {
            this.f132462a = null;
            pickChatterView.mTitleBar = null;
            pickChatterView.mChatterPicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PickChatterView_ViewBinding(PickChatterView pickChatterView, View view) {
        this.f132462a = pickChatterView;
        pickChatterView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        pickChatterView.mChatterPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.chatter_picker, "field 'mChatterPicker'", ChatterPicker.class);
    }
}
