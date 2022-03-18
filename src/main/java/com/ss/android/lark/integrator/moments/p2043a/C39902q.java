package com.ss.android.lark.integrator.moments.p2043a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.integrator.moments.MomentsModuleProvider;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;

/* renamed from: com.ss.android.lark.integrator.moments.a.q */
public class C39902q extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Activity f101586a;

    /* renamed from: b */
    private View f101587b;

    /* renamed from: c */
    private View f101588c;

    /* renamed from: d */
    private View.OnClickListener f101589d = new View.OnClickListener() {
        /* class com.ss.android.lark.integrator.moments.p2043a.C39902q.View$OnClickListenerC399031 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a((Context) C39902q.this.f101586a)) {
                C39902q.this.mo185301a(view, true);
            }
            MomentsModuleProvider.m158362a().mo165887a(C39902q.this.f101586a);
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

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.MOMENTS.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public boolean mo132398f() {
        return MomentsModuleProvider.m158362a().mo165890b();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f101587b == null) {
            this.f101587b = new IndicatorItemView.C54112a(this.f101586a).mo185193c(MomentsAppNameHolder.m188686a()).mo185191a(this.f101589d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101587b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f101588c == null) {
            this.f101588c = new IndicatorItemView.C54112a(this.f101586a).mo185193c(MomentsAppNameHolder.m188686a()).mo185191a(this.f101589d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101588c;
    }

    public C39902q(Activity activity) {
        this.f101586a = activity;
    }
}
