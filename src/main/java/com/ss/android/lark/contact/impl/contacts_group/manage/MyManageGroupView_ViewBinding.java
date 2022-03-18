package com.ss.android.lark.contact.impl.contacts_group.manage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class MyManageGroupView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MyManageGroupView f92123a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MyManageGroupView myManageGroupView = this.f92123a;
        if (myManageGroupView != null) {
            this.f92123a = null;
            myManageGroupView.mPtrFrame = null;
            myManageGroupView.mMyManageGroupRV = null;
            myManageGroupView.mEmptyLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MyManageGroupView_ViewBinding(MyManageGroupView myManageGroupView, View view) {
        this.f92123a = myManageGroupView;
        myManageGroupView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.my_group_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        myManageGroupView.mMyManageGroupRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.my_group_rv, "field 'mMyManageGroupRV'", RecyclerView.class);
        myManageGroupView.mEmptyLayout = Utils.findRequiredView(view, R.id.empty_layout, "field 'mEmptyLayout'");
    }
}
