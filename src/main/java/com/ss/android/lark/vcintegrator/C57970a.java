package com.ss.android.lark.vcintegrator;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.IndicatorItemView;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.C54127c;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.vcintegrator.a */
public class C57970a extends C54127c implements AbstractC54125a {

    /* renamed from: a */
    public Activity f142656a;

    /* renamed from: b */
    private View f142657b;

    /* renamed from: c */
    private View f142658c;

    /* renamed from: d */
    private View.OnClickListener f142659d = new View.OnClickListener() {
        /* class com.ss.android.lark.vcintegrator.C57970a.View$OnClickListenerC579711 */

        public void onClick(View view) {
            if (DesktopUtil.m144301a((Context) C57970a.this.f142656a)) {
                C57970a.this.mo185301a(view, true);
            }
            VideoChatModuleProvider.m224872a().mo208135a(C57970a.this.f142656a);
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.vcintegrator.C57970a.View$OnClickListenerC579711.RunnableC579721 */

                public void run() {
                    SettingHitPoint.f134851a.mo186403e();
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
        return SystemSettingComponentType.VIDEO_CHAT.getValue();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public boolean mo132398f() {
        return VideoChatModuleProvider.m224872a().mo208171p();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        if (this.f142657b == null) {
            this.f142657b = new IndicatorItemView.C54112a(this.f142656a).mo185193c(UIHelper.getString(R.string.View_G_CallsAndMeetings)).mo185191a(this.f142659d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f142657b;
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        if (this.f142658c == null) {
            this.f142658c = new IndicatorItemView.C54112a(this.f142656a).mo185193c(UIHelper.getString(R.string.View_G_CallsAndMeetings)).mo185191a(this.f142659d).mo185176a(true).mo185179b(true).mo185177a();
        }
        return this.f142658c;
    }

    public C57970a(Activity activity) {
        this.f142656a = activity;
    }
}
