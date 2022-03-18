package com.ss.android.lark.integrator.mail;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.integrator.mail.b */
public class C39847b extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Activity f101504a;

    /* renamed from: b */
    private View f101505b;

    /* renamed from: c */
    private View f101506c;

    /* renamed from: d */
    private View.OnClickListener f101507d = new View.OnClickListener() {
        /* class com.ss.android.lark.integrator.mail.C39847b.View$OnClickListenerC398481 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a((Context) C39847b.this.f101504a)) {
                C39847b.this.mo185301a(view, true);
            }
            C42699a.m170261b(C39847b.this.f101504a);
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.integrator.mail.C39847b.View$OnClickListenerC398481.RunnableC398491 */

                public void run() {
                    SettingHitPoint.f134851a.mo186405f();
                }
            });
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
        return SystemSettingComponentType.MAIL.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public boolean mo132398f() {
        if (!C54115c.m210080a().mo178311w() || DesktopUtil.m144301a((Context) this.f101504a)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f101505b == null) {
            this.f101505b = new IndicatorItemView.C54112a(this.f101504a).mo185193c(UIHelper.getString(R.string.Mail_Setting_Email)).mo185191a(this.f101507d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101505b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f101506c == null) {
            this.f101506c = new IndicatorItemView.C54112a(this.f101504a).mo185193c(UIHelper.getString(R.string.Mail_Setting_Email)).mo185191a(this.f101507d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f101506c;
    }

    public C39847b(Activity activity) {
        this.f101504a = activity;
    }
}
