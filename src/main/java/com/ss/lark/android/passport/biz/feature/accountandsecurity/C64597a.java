package com.ss.lark.android.passport.biz.feature.accountandsecurity;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.a */
public class C64597a extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public final Context f163057a;

    /* renamed from: b */
    private View f163058b;

    /* renamed from: c */
    private View f163059c;

    /* renamed from: d */
    private final View.OnClickListener f163060d = new View.OnClickListener() {
        /* class com.ss.lark.android.passport.biz.feature.accountandsecurity.C64597a.View$OnClickListenerC645981 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a(C64597a.this.f163057a)) {
                C64597a.this.mo185301a(view, true);
            }
            C64606c.m253860a(C64597a.this.f163057a, null);
        }
    };

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public /* synthetic */ void mo132391a() {
        AbstractC54126b.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public /* synthetic */ void aA_() {
        AbstractC54126b.CC.$default$aA_(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public /* synthetic */ boolean mo132398f() {
        return AbstractC54125a.CC.$default$f(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.ACCOUNT.getValue();
    }

    /* renamed from: h */
    private boolean m253829h() {
        return ServiceFinder.m193748c().isFgEnable("lark.account.security.center");
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f163058b == null) {
            String string = UIHelper.getString(R.string.Lark_NewSettings_AccountAndSecurityMobile);
            if (m253829h()) {
                string = UIHelper.getString(R.string.Lark_Passport_AccountSecurityCenter_TitleMobile);
            }
            this.f163058b = new IndicatorItemView.C54112a(this.f163057a).mo185193c(string).mo185191a(this.f163060d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f163058b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f163059c == null) {
            this.f163059c = new IndicatorItemView.C54112a(this.f163057a).mo185193c(UIHelper.getString(R.string.Lark_Passport_AccountSecurityCenter_TitleMobile)).mo185191a(this.f163060d).mo185176a(false).mo185179b(true).mo185177a();
        }
        return this.f163059c;
    }

    public C64597a(Context context) {
        this.f163057a = context;
    }
}
