package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.f */
public class C43423f extends AbsSettingItemViewModel {

    /* renamed from: p */
    protected LiveData<Boolean> f110335p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_NOTIFICATION_ALL_SWITCH;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: c */
    public AbsSettingItemViewModel.ActionType mo155210c() {
        return AbsSettingItemViewModel.ActionType.Arrow;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        return C43819s.m173684a((int) R.string.Mail_Setting_NewEmailNotification);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155204a(Context context) {
        super.mo155204a(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        C42699a.m170279d(this.f110309a);
    }

    public C43423f(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
        if (iSettingItemModel != null) {
            this.f110335p = iSettingItemModel.aP_().mo155047m();
        }
    }
}
