package com.ss.android.lark.calendar.impl.features.settings;

import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class LocalCalAccountFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocalCalAccountFragment f82977a;

    @Override // butterknife.Unbinder
    public void unbind() {
        LocalCalAccountFragment localCalAccountFragment = this.f82977a;
        if (localCalAccountFragment != null) {
            this.f82977a = null;
            localCalAccountFragment.mTitleBar = null;
            localCalAccountFragment.mLvSettingItems = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocalCalAccountFragment_ViewBinding(LocalCalAccountFragment localCalAccountFragment, View view) {
        this.f82977a = localCalAccountFragment;
        localCalAccountFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        localCalAccountFragment.mLvSettingItems = (ListView) Utils.findRequiredViewAsType(view, R.id.lv_local_setting_items, "field 'mLvSettingItems'", ListView.class);
    }
}
