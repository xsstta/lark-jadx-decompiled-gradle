package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.e */
public class C43422e extends AbsSettingItemViewModel {

    /* renamed from: p */
    private AbstractC43522a.AbstractC43527d f110334p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: f */
    public boolean mo155214f() {
        return false;
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
        return AbsSettingItemViewModel.ActionType.Checkbox;
    }

    /* renamed from: j */
    public boolean mo155230j() {
        return ((Boolean) this.f110322n.mo5927b()).booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        if (this.f110321m.mo155225c() != null) {
            return this.f110321m.mo155225c().mo151855e();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
        this.f110334p.mo155404b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        this.f110321m.mo155223a(new Setting.C16982a().mo59983a(Boolean.valueOf(z)).build(), mo155208b());
    }

    public C43422e(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel, AbstractC43522a.AbstractC43527d dVar) {
        super(lifecycleOwner, iSettingItemModel);
        this.f110334p = dVar;
    }
}
