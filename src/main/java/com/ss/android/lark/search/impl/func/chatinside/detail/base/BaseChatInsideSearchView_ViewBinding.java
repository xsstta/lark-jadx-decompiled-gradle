package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.searchcommon.view.SearchResultView;

public class BaseChatInsideSearchView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseChatInsideSearchView f132055a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseChatInsideSearchView baseChatInsideSearchView = this.f132055a;
        if (baseChatInsideSearchView != null) {
            this.f132055a = null;
            baseChatInsideSearchView.mSearchInput = null;
            baseChatInsideSearchView.mFilterFL = null;
            baseChatInsideSearchView.mSearchResultView = null;
            baseChatInsideSearchView.mDefaultView = null;
            baseChatInsideSearchView.mDefaultIV = null;
            baseChatInsideSearchView.mDefaultTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseChatInsideSearchView_ViewBinding(BaseChatInsideSearchView baseChatInsideSearchView, View view) {
        this.f132055a = baseChatInsideSearchView;
        baseChatInsideSearchView.mSearchInput = (SearchInputView) Utils.findRequiredViewAsType(view, R.id.chat_inside_search_input, "field 'mSearchInput'", SearchInputView.class);
        baseChatInsideSearchView.mFilterFL = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.chat_inside_search_filter_fl, "field 'mFilterFL'", FrameLayout.class);
        baseChatInsideSearchView.mSearchResultView = (SearchResultView) Utils.findRequiredViewAsType(view, R.id.chat_inside_search_result_view, "field 'mSearchResultView'", SearchResultView.class);
        baseChatInsideSearchView.mDefaultView = Utils.findRequiredView(view, R.id.chat_inside_search_default_view, "field 'mDefaultView'");
        baseChatInsideSearchView.mDefaultIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_default_iv, "field 'mDefaultIV'", ImageView.class);
        baseChatInsideSearchView.mDefaultTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_default_hint, "field 'mDefaultTV'", TextView.class);
    }
}
