package com.ss.android.lark.oncall.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.ui.flowlayout.TagFlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class OnCallView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OnCallView f122482a;

    @Override // butterknife.Unbinder
    public void unbind() {
        OnCallView onCallView = this.f122482a;
        if (onCallView != null) {
            this.f122482a = null;
            onCallView.mTitleBar = null;
            onCallView.mDesktopTitleBar = null;
            onCallView.mOnCallPtrLayout = null;
            onCallView.mRecyclerView = null;
            onCallView.mLoadFailView = null;
            onCallView.mSearchBar = null;
            onCallView.mSearchET = null;
            onCallView.mTagFlowLayout = null;
            onCallView.mSearchClear = null;
            onCallView.mRoot = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OnCallView_ViewBinding(OnCallView onCallView, View view) {
        this.f122482a = onCallView;
        onCallView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        onCallView.mDesktopTitleBar = (TextView) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitleBar'", TextView.class);
        onCallView.mOnCallPtrLayout = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.oncall_ptr_layout, "field 'mOnCallPtrLayout'", LKUIPtrClassicFrameLayout.class);
        onCallView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.group_oncall_recylerview, "field 'mRecyclerView'", RecyclerView.class);
        onCallView.mLoadFailView = Utils.findRequiredView(view, R.id.oncall_empty, "field 'mLoadFailView'");
        onCallView.mSearchBar = Utils.findRequiredView(view, R.id.search_bar, "field 'mSearchBar'");
        onCallView.mSearchET = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchET'", EditText.class);
        onCallView.mTagFlowLayout = (TagFlowLayout) Utils.findRequiredViewAsType(view, R.id.tag_flowlayout, "field 'mTagFlowLayout'", TagFlowLayout.class);
        onCallView.mSearchClear = Utils.findRequiredView(view, R.id.iv_clear, "field 'mSearchClear'");
        onCallView.mRoot = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRoot'", ViewGroup.class);
    }
}
