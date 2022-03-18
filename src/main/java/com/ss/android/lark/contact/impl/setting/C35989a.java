package com.ss.android.lark.contact.impl.setting;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.contact.impl.setting.a */
public class C35989a extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public final Context f93042a;

    /* renamed from: b */
    private View f93043b;

    /* renamed from: c */
    private View f93044c;

    /* renamed from: d */
    private final View.OnClickListener f93045d = new View.OnClickListener() {
        /* class com.ss.android.lark.contact.impl.setting.C35989a.View$OnClickListenerC359901 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a(C35989a.this.f93042a)) {
                C35989a.this.mo185301a(view, true);
            }
            ContactHitPoint.m140807i();
            ContactHitPoint.m140809j();
            C35883b.m140625a().mo130272c(C35989a.this.f93042a);
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
        return SystemSettingComponentType.PRIVACY.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f93043b == null) {
            this.f93043b = new IndicatorItemView.C54112a(this.f93042a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_Privacy)).mo185191a(this.f93045d).mo185176a(false).mo185179b(true).mo185177a();
        }
        return this.f93043b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f93044c == null) {
            this.f93044c = new IndicatorItemView.C54112a(this.f93042a).mo185193c(UIHelper.getString(R.string.Lark_NewSettings_Privacy)).mo185191a(this.f93045d).mo185176a(false).mo185179b(true).mo185177a();
        }
        return this.f93044c;
    }

    public C35989a(Context context) {
        this.f93042a = context;
    }
}
