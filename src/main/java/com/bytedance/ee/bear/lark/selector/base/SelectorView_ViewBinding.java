package com.bytedance.ee.bear.lark.selector.base;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class SelectorView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SelectorView f21666a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SelectorView selectorView = this.f21666a;
        if (selectorView != null) {
            this.f21666a = null;
            selectorView.mSearchBar = null;
            selectorView.mSearchEt = null;
            selectorView.mPtrFrame = null;
            selectorView.mSearchResultRV = null;
            selectorView.mLoadEmptyView = null;
            selectorView.mSearchEmptyHintTV = null;
            selectorView.mLoadFailView = null;
            selectorView.mTitleBar = null;
            selectorView.mSelectCountTV = null;
            selectorView.mBottomSelectActionRL = null;
            selectorView.mConfirmBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SelectorView_ViewBinding(SelectorView selectorView, View view) {
        this.f21666a = selectorView;
        selectorView.mSearchBar = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_bar, "field 'mSearchBar'", LinearLayout.class);
        selectorView.mSearchEt = (SpaceEditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", SpaceEditText.class);
        selectorView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        selectorView.mSearchResultRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.search_result_rv, "field 'mSearchResultRV'", RecyclerView.class);
        selectorView.mLoadEmptyView = Utils.findRequiredView(view, R.id.load_empty, "field 'mLoadEmptyView'");
        selectorView.mSearchEmptyHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.text_empty_tip, "field 'mSearchEmptyHintTV'", TextView.class);
        selectorView.mLoadFailView = Utils.findRequiredView(view, R.id.load_fail, "field 'mLoadFailView'");
        selectorView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        selectorView.mSelectCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        selectorView.mBottomSelectActionRL = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomSelectActionRL'", RelativeLayout.class);
        selectorView.mConfirmBtn = (Button) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBtn'", Button.class);
    }
}
