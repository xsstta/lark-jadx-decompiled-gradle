package com.ss.android.lark.setting.page.content.general;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.setting.page.C54129a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.general.b */
public class C54435b extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Context f134623a;

    /* renamed from: b */
    private View f134624b;

    /* renamed from: c */
    private View f134625c;

    /* renamed from: d */
    private View.OnClickListener f134626d = new View.OnClickListener() {
        /* class com.ss.android.lark.setting.page.content.general.C54435b.View$OnClickListenerC544361 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a(C54435b.this.f134623a)) {
                C54435b.this.mo185301a(view, true);
            }
            C54129a.m210150b(C54435b.this.f134623a);
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
        return SystemSettingComponentType.GENERAL.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f134624b == null) {
            this.f134624b = new IndicatorItemView.C54112a(this.f134623a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_Efficiency)).mo185191a(this.f134626d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f134624b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f134625c == null) {
            this.f134625c = new IndicatorItemView.C54112a(this.f134623a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_Efficiency)).mo185191a(this.f134626d).mo185176a(true).mo185179b(false).mo185177a();
        }
        return this.f134625c;
    }

    public C54435b(Context context) {
        this.f134623a = context;
    }
}
