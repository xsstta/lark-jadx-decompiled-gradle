package com.ss.android.lark.setting.page.content.common.impl.translate.v2.mvp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class TargetLanguageSettingView2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TargetLanguageSettingView2 f134529a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TargetLanguageSettingView2 targetLanguageSettingView2 = this.f134529a;
        if (targetLanguageSettingView2 != null) {
            this.f134529a = null;
            targetLanguageSettingView2.mTitleBar = null;
            targetLanguageSettingView2.mLanguageRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TargetLanguageSettingView2_ViewBinding(TargetLanguageSettingView2 targetLanguageSettingView2, View view) {
        this.f134529a = targetLanguageSettingView2;
        targetLanguageSettingView2.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        targetLanguageSettingView2.mLanguageRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.language_list_rv, "field 'mLanguageRV'", RecyclerView.class);
    }
}
