package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class AutoTranslateSettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AutoTranslateSettingView f134332a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AutoTranslateSettingView autoTranslateSettingView = this.f134332a;
        if (autoTranslateSettingView != null) {
            this.f134332a = null;
            autoTranslateSettingView.mTitleBar = null;
            autoTranslateSettingView.mLanguageRV = null;
            autoTranslateSettingView.mDisAutoLanguageLayout = null;
            autoTranslateSettingView.mDisAutoLanguageRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AutoTranslateSettingView_ViewBinding(AutoTranslateSettingView autoTranslateSettingView, View view) {
        this.f134332a = autoTranslateSettingView;
        autoTranslateSettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        autoTranslateSettingView.mLanguageRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.language_list_rv, "field 'mLanguageRV'", RecyclerView.class);
        autoTranslateSettingView.mDisAutoLanguageLayout = Utils.findRequiredView(view, R.id.disable_auto_translate_layout, "field 'mDisAutoLanguageLayout'");
        autoTranslateSettingView.mDisAutoLanguageRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.disable_auto_translate_list, "field 'mDisAutoLanguageRV'", RecyclerView.class);
    }
}
