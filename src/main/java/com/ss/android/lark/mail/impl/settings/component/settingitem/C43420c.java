package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.c */
public class C43420c extends AbsSettingItemViewModel {
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
        return ISettingItemModel.Function.FUNC_ENT_SIGNATURE_SWITCH;
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
        return C43819s.m173684a((int) R.string.Mail_BusinessSignature_EmailSignature);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return C43819s.m173684a((int) R.string.Mail_Setting_MobileSignatureguide);
    }

    public C43420c(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        C42699a.m170285f(this.f110309a, mo155217i());
        C42330c.m169065b(C42330c.C42334c.f107679f, "");
    }
}
