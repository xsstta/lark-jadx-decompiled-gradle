package com.ss.android.lark.calendar.impl.features.settings;

import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SettingDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SettingDetailFragment f82989a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SettingDetailFragment settingDetailFragment = this.f82989a;
        if (settingDetailFragment != null) {
            this.f82989a = null;
            settingDetailFragment.mTitleBar = null;
            settingDetailFragment.mLvSettingItems = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SettingDetailFragment_ViewBinding(SettingDetailFragment settingDetailFragment, View view) {
        this.f82989a = settingDetailFragment;
        settingDetailFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        settingDetailFragment.mLvSettingItems = (ListView) Utils.findRequiredViewAsType(view, R.id.lv_setting_items, "field 'mLvSettingItems'", ListView.class);
    }
}
