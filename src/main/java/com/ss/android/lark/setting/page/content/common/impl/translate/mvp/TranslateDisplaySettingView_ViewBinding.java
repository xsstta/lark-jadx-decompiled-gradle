package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class TranslateDisplaySettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TranslateDisplaySettingView f134341a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TranslateDisplaySettingView translateDisplaySettingView = this.f134341a;
        if (translateDisplaySettingView != null) {
            this.f134341a = null;
            translateDisplaySettingView.mTitlebar = null;
            translateDisplaySettingView.mOptionListRV = null;
            translateDisplaySettingView.mSpecificLanguageSettingView = null;
            translateDisplaySettingView.mSpecificLanguageSettingDescView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TranslateDisplaySettingView_ViewBinding(TranslateDisplaySettingView translateDisplaySettingView, View view) {
        this.f134341a = translateDisplaySettingView;
        translateDisplaySettingView.mTitlebar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitlebar'", CommonTitleBar.class);
        translateDisplaySettingView.mOptionListRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.option_list_rv, "field 'mOptionListRV'", RecyclerView.class);
        translateDisplaySettingView.mSpecificLanguageSettingView = Utils.findRequiredView(view, R.id.specific_language_setting, "field 'mSpecificLanguageSettingView'");
        translateDisplaySettingView.mSpecificLanguageSettingDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.specific_language_setting_desc, "field 'mSpecificLanguageSettingDescView'", TextView.class);
    }
}
