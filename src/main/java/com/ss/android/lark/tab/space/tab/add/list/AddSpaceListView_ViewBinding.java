package com.ss.android.lark.tab.space.tab.add.list;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public final class AddSpaceListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddSpaceListView f136561a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AddSpaceListView addSpaceListView = this.f136561a;
        if (addSpaceListView != null) {
            this.f136561a = null;
            addSpaceListView.mTitleBar = null;
            addSpaceListView.mSearchBar = null;
            addSpaceListView.mSearchEt = null;
            addSpaceListView.mPtrFrame = null;
            addSpaceListView.mSearchResultRv = null;
            addSpaceListView.mLoadEmptyView = null;
            addSpaceListView.mSearchEmptyTip = null;
            addSpaceListView.mLoadFailedView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddSpaceListView_ViewBinding(AddSpaceListView addSpaceListView, View view) {
        this.f136561a = addSpaceListView;
        addSpaceListView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        addSpaceListView.mSearchBar = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.search_bar, "field 'mSearchBar'", ConstraintLayout.class);
        addSpaceListView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", EditText.class);
        addSpaceListView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_frame, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        addSpaceListView.mSearchResultRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.result_rv, "field 'mSearchResultRv'", RecyclerView.class);
        addSpaceListView.mLoadEmptyView = Utils.findRequiredView(view, R.id.load_empty, "field 'mLoadEmptyView'");
        addSpaceListView.mSearchEmptyTip = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_tip, "field 'mSearchEmptyTip'", TextView.class);
        addSpaceListView.mLoadFailedView = Utils.findRequiredView(view, R.id.load_fail, "field 'mLoadFailedView'");
    }
}
