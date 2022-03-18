package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.m */
public class C43432m extends AbsSettingItemViewModel {

    /* renamed from: p */
    AbsSettingItemViewModel.ActionType f110341p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_THREAD_SWITCH;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: c */
    public AbsSettingItemViewModel.ActionType mo155210c() {
        return this.f110341p;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        if (this.f110341p == AbsSettingItemViewModel.ActionType.Switch) {
            return C43819s.m173684a((int) R.string.Mail_Settings_ChatsModeDescMobile);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: d */
    public String mo155212d() {
        int i;
        if (this.f110341p == AbsSettingItemViewModel.ActionType.Switch) {
            i = R.string.Mail_Settings_ChatsModeMobile;
        } else {
            i = R.string.Mail_Settings_EmailOrganize;
        }
        return C43819s.m173684a(i);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: h */
    public boolean mo155216h() {
        if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode") || C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode_internal")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
    }

    public C43432m(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
        AbsSettingItemViewModel.ActionType actionType;
        if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.conversation_setting")) {
            actionType = AbsSettingItemViewModel.ActionType.Arrow;
        } else {
            actionType = AbsSettingItemViewModel.ActionType.Switch;
        }
        this.f110341p = actionType;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        if (this.f110341p == AbsSettingItemViewModel.ActionType.Switch) {
            this.f110321m.mo155223a(new Setting.C16982a().mo60003l(Boolean.valueOf(z)).build(), mo155208b());
        } else if (this.f110341p == AbsSettingItemViewModel.ActionType.Arrow) {
            C42699a.m170288h(this.f110309a);
        }
    }
}
