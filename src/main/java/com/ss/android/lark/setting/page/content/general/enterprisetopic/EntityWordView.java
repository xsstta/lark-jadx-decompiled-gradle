package com.ss.android.lark.setting.page.content.general.enterprisetopic;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.ss.android.lark.pb.ai.FeatureSetting;
import com.ss.android.lark.widget.settingitem.SettingItemView;
import com.ss.android.lark.widget.settingitem.ThrottleCheckBox;

public class EntityWordView {

    /* renamed from: a */
    public EntityWordScope f134650a = new EntityWordScope();
    @BindView(7691)
    SettingItemView mSettingItemDoc;
    @BindView(7692)
    SettingItemView mSettingItemEmail;
    @BindView(7706)
    SettingItemView mSettingItemMsg;
    @BindView(7578)
    LKUISwitchButton mSwitchHeaderAll;

    /* renamed from: a */
    public void mo186127a() {
        boolean isAllDisable = this.f134650a.isAllDisable();
        mo186128a(this.mSwitchHeaderAll, !isAllDisable);
        mo186130a(isAllDisable);
    }

    /* renamed from: b */
    public void mo186131b(boolean z) {
        mo186128a(this.mSettingItemMsg.getLeftCheckBox(), z);
        mo186128a(this.mSettingItemDoc.getLeftCheckBox(), z);
        mo186128a(this.mSettingItemEmail.getLeftCheckBox(), z);
    }

    /* renamed from: a */
    public void mo186130a(boolean z) {
        int i;
        int i2;
        SettingItemView settingItemView = this.mSettingItemMsg;
        int i3 = 0;
        if (z || !EntityWordScope.isMsgFgEnable()) {
            i = 8;
        } else {
            i = 0;
        }
        settingItemView.setVisibility(i);
        SettingItemView settingItemView2 = this.mSettingItemDoc;
        if (z || !EntityWordScope.isDocFgEnable()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        settingItemView2.setVisibility(i2);
        SettingItemView settingItemView3 = this.mSettingItemEmail;
        if (z || !EntityWordScope.isMailFgEnable()) {
            i3 = 8;
        }
        settingItemView3.setVisibility(i3);
    }

    /* renamed from: a */
    private void m211313a(final C54452b bVar, LifecycleOwner lifecycleOwner) {
        bVar.featureSetting.mo5923a(lifecycleOwner, new AbstractC1178x<FeatureSetting>() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.EntityWordView.C544461 */

            /* renamed from: a */
            public void onChanged(FeatureSetting featureSetting) {
                EntityWordScope fromFeatureSetting = EntityWordScope.fromFeatureSetting(featureSetting);
                EntityWordView.this.f134650a = fromFeatureSetting;
                EntityWordView entityWordView = EntityWordView.this;
                entityWordView.mo186128a(entityWordView.mSettingItemMsg.getLeftCheckBox(), fromFeatureSetting.mMsgSettingEnable);
                EntityWordView entityWordView2 = EntityWordView.this;
                entityWordView2.mo186128a(entityWordView2.mSettingItemDoc.getLeftCheckBox(), fromFeatureSetting.mDocSettingEnable);
                EntityWordView entityWordView3 = EntityWordView.this;
                entityWordView3.mo186128a(entityWordView3.mSettingItemEmail.getLeftCheckBox(), fromFeatureSetting.mMailSettingEnable);
                boolean isAllDisable = fromFeatureSetting.isAllDisable();
                EntityWordView entityWordView4 = EntityWordView.this;
                entityWordView4.mo186128a(entityWordView4.mSwitchHeaderAll, !isAllDisable);
                EntityWordView.this.mo186130a(isAllDisable);
            }
        });
        this.mSettingItemMsg.getLeftCheckBox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.EntityWordView.C544472 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bVar.setEntityWordSetting(2, z);
                EntityWordView.this.f134650a.mMsgSettingEnable = z;
                EntityWordView.this.mo186127a();
            }
        });
        this.mSettingItemDoc.getLeftCheckBox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.EntityWordView.C544483 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bVar.setEntityWordSetting(3, z);
                EntityWordView.this.f134650a.mDocSettingEnable = z;
                EntityWordView.this.mo186127a();
            }
        });
        this.mSettingItemEmail.getLeftCheckBox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.EntityWordView.C544494 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bVar.setEntityWordSetting(4, z);
                EntityWordView.this.f134650a.mMailSettingEnable = z;
                EntityWordView.this.mo186127a();
            }
        });
        this.mSwitchHeaderAll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.enterprisetopic.EntityWordView.C544505 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bVar.setEntityWordSetting(1, z);
                EntityWordView.this.mo186130a(!z);
                EntityWordView.this.mo186131b(z);
            }
        });
    }

    /* renamed from: a */
    public void mo186128a(CompoundButton compoundButton, boolean z) {
        if (compoundButton == null) {
            return;
        }
        if (compoundButton instanceof LKUISwitchButton) {
            ((LKUISwitchButton) compoundButton).setCheckedImmediatelyNoEvent(z);
        } else if (compoundButton instanceof ThrottleCheckBox) {
            ((ThrottleCheckBox) compoundButton).setCheckedImmediatelyNoEvent(z);
        }
    }

    /* renamed from: a */
    public void mo186129a(C54452b bVar, ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        ButterKnife.bind(this, viewGroup);
        m211313a(bVar, lifecycleOwner);
    }
}
