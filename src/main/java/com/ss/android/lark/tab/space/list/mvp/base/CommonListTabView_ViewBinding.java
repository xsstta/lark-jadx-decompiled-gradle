package com.ss.android.lark.tab.space.list.mvp.base;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class CommonListTabView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommonListTabView f136468a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CommonListTabView commonListTabView = this.f136468a;
        if (commonListTabView != null) {
            this.f136468a = null;
            commonListTabView.mPtrFrame = null;
            commonListTabView.mContentRV = null;
            commonListTabView.mLoadingView = null;
            commonListTabView.mEmptyHolder = null;
            commonListTabView.mEmptyMarkIV = null;
            commonListTabView.mEmptyMarkTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommonListTabView_ViewBinding(CommonListTabView commonListTabView, View view) {
        this.f136468a = commonListTabView;
        commonListTabView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_frame, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        commonListTabView.mContentRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.content_rv, "field 'mContentRV'", CommonRecyclerView.class);
        commonListTabView.mLoadingView = Utils.findRequiredView(view, R.id.loading, "field 'mLoadingView'");
        commonListTabView.mEmptyHolder = Utils.findRequiredView(view, R.id.empty_layout, "field 'mEmptyHolder'");
        commonListTabView.mEmptyMarkIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.empty_icon, "field 'mEmptyMarkIV'", ImageView.class);
        commonListTabView.mEmptyMarkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.empty_hint, "field 'mEmptyMarkTV'", TextView.class);
    }
}
