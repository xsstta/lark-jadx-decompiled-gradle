package com.ss.android.lark.contact.impl.selected_confirm;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SelectedConfirmView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectedConfirmView f92984a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SelectedConfirmView selectedConfirmView = this.f92984a;
        if (selectedConfirmView != null) {
            this.f92984a = null;
            selectedConfirmView.showSelectedRV = null;
            selectedConfirmView.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SelectedConfirmView_ViewBinding(SelectedConfirmView selectedConfirmView, View view) {
        this.f92984a = selectedConfirmView;
        selectedConfirmView.showSelectedRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.show_selected_RV, "field 'showSelectedRV'", RecyclerView.class);
        selectedConfirmView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
    }
}
