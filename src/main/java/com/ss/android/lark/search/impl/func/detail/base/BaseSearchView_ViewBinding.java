package com.ss.android.lark.search.impl.func.detail.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class BaseSearchView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseSearchView f132311a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseSearchView baseSearchView = this.f132311a;
        if (baseSearchView != null) {
            this.f132311a = null;
            baseSearchView.mSearchET = null;
            baseSearchView.mSearchEditHintTV = null;
            baseSearchView.mSearchBarRootLL = null;
            baseSearchView.mSearchBgTV = null;
            baseSearchView.mSearchBackBtnIV = null;
            baseSearchView.mSearchCancelBtnTV = null;
            baseSearchView.mSearchBarFL = null;
            baseSearchView.mSearchDeleteBtnIV = null;
            baseSearchView.mSearchDetailRV = null;
            baseSearchView.mSearchDetailPtrFL = null;
            baseSearchView.mSearchDetailEmptyLayout = null;
            baseSearchView.mSearchDetailEmptyIV = null;
            baseSearchView.mSearchDetailEmptyTV = null;
            baseSearchView.mTitleView = null;
            baseSearchView.mSearchDetailRootLL = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseSearchView_ViewBinding(BaseSearchView baseSearchView, View view) {
        this.f132311a = baseSearchView;
        baseSearchView.mSearchET = (EditText) Utils.findRequiredViewAsType(view, R.id.search_edit_et, "field 'mSearchET'", EditText.class);
        baseSearchView.mSearchEditHintTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_edit_hint_tv, "field 'mSearchEditHintTV'", TextView.class);
        baseSearchView.mSearchBarRootLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_bar_root_ll, "field 'mSearchBarRootLL'", LinearLayout.class);
        baseSearchView.mSearchBgTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_bg_tv, "field 'mSearchBgTV'", TextView.class);
        baseSearchView.mSearchBackBtnIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_title_bar_back_iv, "field 'mSearchBackBtnIV'", ImageView.class);
        baseSearchView.mSearchCancelBtnTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_cancel, "field 'mSearchCancelBtnTV'", TextView.class);
        baseSearchView.mSearchBarFL = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.search_bar_fl, "field 'mSearchBarFL'", FrameLayout.class);
        baseSearchView.mSearchDeleteBtnIV = Utils.findRequiredView(view, R.id.search_delete_iv, "field 'mSearchDeleteBtnIV'");
        baseSearchView.mSearchDetailRV = (CommonRecyclerView) Utils.findRequiredViewAsType(view, R.id.search_detail_rv, "field 'mSearchDetailRV'", CommonRecyclerView.class);
        baseSearchView.mSearchDetailPtrFL = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.search_detail_ptr_fl, "field 'mSearchDetailPtrFL'", LKUIPtrClassicFrameLayout.class);
        baseSearchView.mSearchDetailEmptyLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.search_result_empty, "field 'mSearchDetailEmptyLayout'", ViewGroup.class);
        baseSearchView.mSearchDetailEmptyIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_empty_iv, "field 'mSearchDetailEmptyIV'", ImageView.class);
        baseSearchView.mSearchDetailEmptyTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_empty_hint, "field 'mSearchDetailEmptyTV'", TextView.class);
        baseSearchView.mTitleView = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_detail_title_iv, "field 'mTitleView'", ImageView.class);
        baseSearchView.mSearchDetailRootLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.search_detail_root_ll, "field 'mSearchDetailRootLL'", LinearLayout.class);
    }
}
