package com.ss.android.lark.setting.page.content.common;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.setting.page.content.common.b */
public class C54154b extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public final Context f134048a;

    /* renamed from: b */
    private View f134049b;

    /* renamed from: c */
    private View f134050c;

    /* renamed from: d */
    private final View.OnClickListener f134051d = new View.OnClickListener() {
        /* class com.ss.android.lark.setting.page.content.common.C54154b.View$OnClickListenerC541551 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a(C54154b.this.f134048a)) {
                C54154b.this.mo185301a(view, true);
            }
            C54150a.m210222a(C54154b.this.f134048a);
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
        return SystemSettingComponentType.LANGUAGE.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f134049b == null) {
            this.f134049b = new IndicatorItemView.C54112a(this.f134048a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_GeneralMobile)).mo185191a(this.f134051d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f134049b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f134050c == null) {
            this.f134050c = new IndicatorItemView.C54112a(this.f134048a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_GeneralMobile)).mo185191a(this.f134051d).mo185176a(true).mo185179b(false).mo185177a();
        }
        return this.f134050c;
    }

    public C54154b(Context context) {
        this.f134048a = context;
    }
}
