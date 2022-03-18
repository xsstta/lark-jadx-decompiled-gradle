package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class LanguageSettingListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageSettingListView f134412a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LanguageSettingListView languageSettingListView = this.f134412a;
        if (languageSettingListView != null) {
            this.f134412a = null;
            languageSettingListView.mTitleBar = null;
            languageSettingListView.mSearchEt = null;
            languageSettingListView.mRecyclerView = null;
            languageSettingListView.mSearchCleaner = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageSettingListView_ViewBinding(LanguageSettingListView languageSettingListView, View view) {
        this.f134412a = languageSettingListView;
        languageSettingListView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        languageSettingListView.mSearchEt = (EditText) Utils.findRequiredViewAsType(view, R.id.search_et, "field 'mSearchEt'", EditText.class);
        languageSettingListView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.language_effect_setting_rv, "field 'mRecyclerView'", RecyclerView.class);
        languageSettingListView.mSearchCleaner = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_del_iv, "field 'mSearchCleaner'", ImageView.class);
    }
}
