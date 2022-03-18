package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class AutoTranslateSettingDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AutoTranslateSettingDetailView f134421a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AutoTranslateSettingDetailView autoTranslateSettingDetailView = this.f134421a;
        if (autoTranslateSettingDetailView != null) {
            this.f134421a = null;
            autoTranslateSettingDetailView.mTitleBar = null;
            autoTranslateSettingDetailView.mDetailItemContainer = null;
            autoTranslateSettingDetailView.mDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AutoTranslateSettingDetailView_ViewBinding(AutoTranslateSettingDetailView autoTranslateSettingDetailView, View view) {
        this.f134421a = autoTranslateSettingDetailView;
        autoTranslateSettingDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        autoTranslateSettingDetailView.mDetailItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.detail_item_container, "field 'mDetailItemContainer'", LinearLayout.class);
        autoTranslateSettingDetailView.mDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.description, "field 'mDescription'", TextView.class);
    }
}
