package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.integrator.calendar.CalendarModuleProvider;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;

public class aj extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Activity f100482a;

    /* renamed from: b */
    public ICoreApi f100483b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: c */
    private View f100484c;

    /* renamed from: d */
    private View f100485d;

    /* renamed from: e */
    private View.OnClickListener f100486e = new View.OnClickListener() {
        /* class com.ss.android.lark.integrator.calendar.dependency.aj.View$OnClickListenerC391991 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a((Context) aj.this.f100482a)) {
                aj.this.mo185301a(view, true);
            }
            CalendarModuleProvider.m154500a().mo108108a(aj.this.f100482a);
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.integrator.calendar.dependency.aj.View$OnClickListenerC391991.RunnableC392001 */

                public void run() {
                    aj.this.f100483b.sendCalendarSettingClick();
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
        return SystemSettingComponentType.CALENDAR.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f100484c == null) {
            this.f100484c = new IndicatorItemView.C54112a(this.f100482a).mo185193c(UIHelper.getString(R.string.Calendar_NewSettings_Calendar)).mo185191a(this.f100486e).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f100484c;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f100485d == null) {
            this.f100485d = new IndicatorItemView.C54112a(this.f100482a).mo185193c(UIHelper.getString(R.string.Calendar_NewSettings_Calendar)).mo185191a(this.f100486e).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f100485d;
    }

    public aj(Activity activity) {
        this.f100482a = activity;
    }
}
