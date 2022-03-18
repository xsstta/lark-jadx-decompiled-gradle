package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.l */
public class C43431l extends AbsSettingItemViewModel {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_SMART_REPLY_SWITCH;
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
        return C43819s.m173684a((int) R.string.Mail_SmartReply_SmartReplySetting);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return C43819s.m173684a((int) R.string.Mail_SmartReply_SmartReplySettingHelp);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: h */
    public boolean mo155216h() {
        return !C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
    }

    public C43431l(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        this.f110321m.mo155223a(new Setting.C16982a().mo59998g(Boolean.valueOf(z)).build(), mo155208b());
    }
}
