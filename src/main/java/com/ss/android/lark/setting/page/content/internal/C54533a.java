package com.ss.android.lark.setting.page.content.internal;

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

/* renamed from: com.ss.android.lark.setting.page.content.internal.a */
public class C54533a extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Context f134823a;

    /* renamed from: b */
    private View f134824b;

    /* renamed from: c */
    private View f134825c;

    /* renamed from: d */
    private View.OnClickListener f134826d = new View.OnClickListener() {
        /* class com.ss.android.lark.setting.page.content.internal.C54533a.View$OnClickListenerC545341 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a(C54533a.this.f134823a)) {
                C54533a.this.mo185301a(view, true);
            }
            C54129a.m210151c(C54533a.this.f134823a);
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
    public boolean mo132398f() {
        return true;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.INTERNAL.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f134824b == null) {
            this.f134824b = new IndicatorItemView.C54112a(this.f134823a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_InternalSettings)).mo185191a(this.f134826d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f134824b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f134825c == null) {
            this.f134825c = new IndicatorItemView.C54112a(this.f134823a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_InternalSettings)).mo185191a(this.f134826d).mo185176a(false).mo185179b(true).mo185177a();
        }
        return this.f134825c;
    }

    public C54533a(Context context) {
        this.f134823a = context;
    }
}
