package com.ss.android.lark.setting.page.content.general.enterprisetopic;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.settingitem.SettingItemView;

public class EntityWordView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EntityWordView f134660a;

    @Override // butterknife.Unbinder
    public void unbind() {
        EntityWordView entityWordView = this.f134660a;
        if (entityWordView != null) {
            this.f134660a = null;
            entityWordView.mSettingItemMsg = null;
            entityWordView.mSettingItemDoc = null;
            entityWordView.mSettingItemEmail = null;
            entityWordView.mSwitchHeaderAll = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EntityWordView_ViewBinding(EntityWordView entityWordView, View view) {
        this.f134660a = entityWordView;
        entityWordView.mSettingItemMsg = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.setting_message, "field 'mSettingItemMsg'", SettingItemView.class);
        entityWordView.mSettingItemDoc = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.setting_doc, "field 'mSettingItemDoc'", SettingItemView.class);
        entityWordView.mSettingItemEmail = (SettingItemView) Utils.findRequiredViewAsType(view, R.id.setting_email, "field 'mSettingItemEmail'", SettingItemView.class);
        entityWordView.mSwitchHeaderAll = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.right_switch, "field 'mSwitchHeaderAll'", LKUISwitchButton.class);
    }
}
