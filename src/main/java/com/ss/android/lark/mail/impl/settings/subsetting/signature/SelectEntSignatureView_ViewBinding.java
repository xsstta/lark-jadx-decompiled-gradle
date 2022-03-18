package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class SelectEntSignatureView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectEntSignatureView f110580a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SelectEntSignatureView selectEntSignatureView = this.f110580a;
        if (selectEntSignatureView != null) {
            this.f110580a = null;
            selectEntSignatureView.mTitleBar = null;
            selectEntSignatureView.mSelectRv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SelectEntSignatureView_ViewBinding(SelectEntSignatureView selectEntSignatureView, View view) {
        this.f110580a = selectEntSignatureView;
        selectEntSignatureView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.ent_signature_select_title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        selectEntSignatureView.mSelectRv = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.ent_signature_select_rv, "field 'mSelectRv'", CommonRecyclerView.class);
    }
}
