package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.h */
public class C43425h extends AbsSettingItemViewModel {

    /* renamed from: p */
    AbsSettingItemViewModel.ActionType f110336p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public String mo155202a(boolean z) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_NOTIFICATION_SWITCH;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: c */
    public AbsSettingItemViewModel.ActionType mo155210c() {
        return this.f110336p;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        return C43819s.m173684a((int) R.string.Mail_Setting_NewEmailNotification);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return C43819s.m173684a((int) R.string.Mail_Setting_NewEmailNotificationDesc);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        if (mo155210c() == AbsSettingItemViewModel.ActionType.Switch) {
            this.f110321m.mo155223a(new Setting.C16982a().mo59983a(Boolean.valueOf(z)).build(), mo155208b());
        } else if (mo155210c() == AbsSettingItemViewModel.ActionType.Arrow) {
            C42699a.m170282e(this.f110309a);
        }
    }

    public C43425h(LifecycleOwner lifecycleOwner, AbsSettingItemViewModel.ActionType actionType, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
        this.f110336p = actionType;
    }
}
