package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.d */
public class C43421d extends AbsSettingItemViewModel {

    /* renamed from: p */
    private final AbstractC43522a.AbstractC43527d f110333p;

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
        return ISettingItemModel.Function.FUNC_NOTIFICATION_ALL_SWITCH;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: c */
    public AbsSettingItemViewModel.ActionType mo155210c() {
        return AbsSettingItemViewModel.ActionType.Switch;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        return C43819s.m173684a((int) R.string.Mail_Settings_EnableNotification);
    }

    /* renamed from: j */
    public boolean mo155230j() {
        return ((Boolean) this.f110322n.mo5927b()).booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
        this.f110333p.mo155404b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        String str;
        this.f110321m.mo155223a(new Setting.C16982a().mo60004m(Boolean.valueOf(z)).build(), mo155208b());
        String str2 = C42330c.C42334c.f107674a;
        if (z) {
            str = C42330c.C42339h.f107748A;
        } else {
            str = C42330c.C42339h.f107749B;
        }
        C42330c.m169065b(str2, str);
    }

    public C43421d(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel, AbstractC43522a.AbstractC43527d dVar) {
        super(lifecycleOwner, iSettingItemModel);
        this.f110333p = dVar;
    }
}
