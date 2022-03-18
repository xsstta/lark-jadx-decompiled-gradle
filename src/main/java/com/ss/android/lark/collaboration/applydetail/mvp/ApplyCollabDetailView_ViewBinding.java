package com.ss.android.lark.collaboration.applydetail.mvp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class ApplyCollabDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ApplyCollabDetailView f91378a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ApplyCollabDetailView applyCollabDetailView = this.f91378a;
        if (applyCollabDetailView != null) {
            this.f91378a = null;
            applyCollabDetailView.mTitleBar = null;
            applyCollabDetailView.mContactListRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ApplyCollabDetailView_ViewBinding(ApplyCollabDetailView applyCollabDetailView, View view) {
        this.f91378a = applyCollabDetailView;
        applyCollabDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        applyCollabDetailView.mContactListRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.contact_list, "field 'mContactListRV'", RecyclerView.class);
    }
}
