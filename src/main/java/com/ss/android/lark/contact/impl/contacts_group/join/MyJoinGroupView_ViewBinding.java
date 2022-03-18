package com.ss.android.lark.contact.impl.contacts_group.join;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class MyJoinGroupView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MyJoinGroupView f92095a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MyJoinGroupView myJoinGroupView = this.f92095a;
        if (myJoinGroupView != null) {
            this.f92095a = null;
            myJoinGroupView.mPtrFrame = null;
            myJoinGroupView.mMyJoinGroupRV = null;
            myJoinGroupView.mEmptyLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MyJoinGroupView_ViewBinding(MyJoinGroupView myJoinGroupView, View view) {
        this.f92095a = myJoinGroupView;
        myJoinGroupView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.my_group_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        myJoinGroupView.mMyJoinGroupRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.my_group_rv, "field 'mMyJoinGroupRV'", RecyclerView.class);
        myJoinGroupView.mEmptyLayout = Utils.findRequiredView(view, R.id.empty_layout, "field 'mEmptyLayout'");
    }
}
