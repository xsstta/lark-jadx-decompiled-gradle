package com.ss.android.lark.search.redesign.filter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SearchFilterDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchFilterDialog f132698a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SearchFilterDialog searchFilterDialog = this.f132698a;
        if (searchFilterDialog != null) {
            this.f132698a = null;
            searchFilterDialog.mTitleTV = null;
            searchFilterDialog.mCloseFL = null;
            searchFilterDialog.mContentFL = null;
            searchFilterDialog.mDoneTV = null;
            searchFilterDialog.mDivideView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchFilterDialog_ViewBinding(SearchFilterDialog searchFilterDialog, View view) {
        this.f132698a = searchFilterDialog;
        searchFilterDialog.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_chat_title_tv, "field 'mTitleTV'", TextView.class);
        searchFilterDialog.mCloseFL = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.search_chat_close_fl, "field 'mCloseFL'", FrameLayout.class);
        searchFilterDialog.mContentFL = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.search_chat_content_fl, "field 'mContentFL'", FrameLayout.class);
        searchFilterDialog.mDoneTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_chat_done_tv, "field 'mDoneTV'", TextView.class);
        searchFilterDialog.mDivideView = Utils.findRequiredView(view, R.id.divide, "field 'mDivideView'");
    }
}
