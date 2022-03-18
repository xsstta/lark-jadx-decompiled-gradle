package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.settingitem.SettingItemView;

public class TranslateSettingView2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TranslateSettingView2 f134553a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TranslateSettingView2 translateSettingView2 = this.f134553a;
        if (translateSettingView2 != null) {
            this.f134553a = null;
            translateSettingView2.mTitleBar = null;
            translateSettingView2.mTranslateSetting = null;
            translateSettingView2.mTargetLanguageOption = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TranslateSettingView2_ViewBinding(TranslateSettingView2 translateSettingView2, View view) {
        this.f134553a = translateSettingView2;
        translateSettingView2.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        translateSettingView2.mTranslateSetting = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.translate_setting, "field 'mTranslateSetting'", ConstraintLayout.class);
        translateSettingView2.mTargetLanguageOption = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.translate_target_option, "field 'mTargetLanguageOption'", SettingItemView.class);
    }
}
