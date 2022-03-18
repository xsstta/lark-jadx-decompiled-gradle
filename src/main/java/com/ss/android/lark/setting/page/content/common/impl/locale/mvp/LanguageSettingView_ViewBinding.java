package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class LanguageSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageSettingView f134173a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LanguageSettingView languageSettingView = this.f134173a;
        if (languageSettingView != null) {
            this.f134173a = null;
            languageSettingView.mTitleBar = null;
            languageSettingView.mLanguageRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageSettingView_ViewBinding(LanguageSettingView languageSettingView, View view) {
        this.f134173a = languageSettingView;
        languageSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        languageSettingView.mLanguageRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.language_list_rv, "field 'mLanguageRV'", RecyclerView.class);
    }
}
