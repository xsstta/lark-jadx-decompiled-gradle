package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.C43391a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.k */
public class C43430k extends AbsSettingItemViewModel {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public ISettingItemModel.Function mo155208b() {
        return ISettingItemModel.Function.FUNC_SMART_INBOX_SWITCH;
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
        return C43819s.m173684a((int) R.string.Mail_Setting_SmartSortEmails);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: e */
    public String mo155213e() {
        return C43819s.m173684a((int) R.string.Mail_Setting_SmartSortEmailsDescription);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: h */
    public boolean mo155216h() {
        boolean z;
        if (this.f110321m.mo155226d() == null || !this.f110321m.mo155226d().mo151882d().mo155170a() || C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: b */
    public void mo155209b(boolean z) {
        super.mo155209b(z);
    }

    public C43430k(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        super(lifecycleOwner, iSettingItemModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel
    /* renamed from: a */
    public void mo155205a(View view, boolean z) {
        C43391a aVar;
        String str;
        if (this.f110321m == null || this.f110321m.mo155226d() == null) {
            aVar = null;
        } else {
            aVar = this.f110321m.mo155226d().mo151882d();
        }
        if (aVar == null) {
            Log.m165384e("SmartInboxViewModel", "NullPointer at SmartInbox", new RuntimeException("EmailSettingError"));
            return;
        }
        this.f110321m.mo155223a(new Setting.C16982a().mo59989b(Boolean.valueOf(z)).mo59996e(Boolean.valueOf(aVar.mo155170a())).build(), mo155208b());
        if (z) {
            str = C42187a.C42191c.f107448Y;
        } else {
            str = C42187a.C42191c.f107449Z;
        }
        C42187a.m168560o(str);
    }
}
