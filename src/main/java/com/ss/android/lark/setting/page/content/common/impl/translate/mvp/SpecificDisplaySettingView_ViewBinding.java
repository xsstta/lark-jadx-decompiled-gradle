package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SpecificDisplaySettingView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SpecificDisplaySettingView f134339a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SpecificDisplaySettingView specificDisplaySettingView = this.f134339a;
        if (specificDisplaySettingView != null) {
            this.f134339a = null;
            specificDisplaySettingView.mTitleBar = null;
            specificDisplaySettingView.mDisplayRuleDescTV = null;
            specificDisplaySettingView.mSpecificDisplayLayout = null;
            specificDisplaySettingView.mLanguageListRV = null;
            specificDisplaySettingView.mSpecificDisplayRuleRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SpecificDisplaySettingView_ViewBinding(SpecificDisplaySettingView specificDisplaySettingView, View view) {
        this.f134339a = specificDisplaySettingView;
        specificDisplaySettingView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        specificDisplaySettingView.mDisplayRuleDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.specific_display_rule_desc, "field 'mDisplayRuleDescTV'", TextView.class);
        specificDisplaySettingView.mSpecificDisplayLayout = Utils.findRequiredView(view, R.id.specific_display_rule_layout, "field 'mSpecificDisplayLayout'");
        specificDisplaySettingView.mLanguageListRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.specific_language_rv, "field 'mLanguageListRV'", RecyclerView.class);
        specificDisplaySettingView.mSpecificDisplayRuleRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.specific_display_rule_list, "field 'mSpecificDisplayRuleRV'", RecyclerView.class);
    }
}
