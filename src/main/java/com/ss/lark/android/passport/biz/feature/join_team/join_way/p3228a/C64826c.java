package com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.p2069j.p2070a.C40653t;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.JoinTeamStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a.c */
public class C64826c extends AbstractC49021b<C64821a.AbstractC64822a, C64821a.AbstractC64823b, C64821a.AbstractC64823b.AbstractC64824a> {

    /* renamed from: d */
    protected Activity f163424d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223721h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64821a.AbstractC64823b.AbstractC64824a mo171180c() {
        return new C64827a();
    }

    /* renamed from: h */
    public void mo223721h() {
        C64821a.AbstractC64822a aVar = (C64821a.AbstractC64822a) mo171182e();
        if (aVar != null && mo171181d() != null) {
            ((C64821a.AbstractC64823b) mo171181d()).mo223716a(aVar.co_());
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a.c$a */
    public class C64827a implements C64821a.AbstractC64823b.AbstractC64824a {
        public C64827a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a.AbstractC64823b.AbstractC64824a
        /* renamed from: a */
        public void mo223717a(MenuInfo menuInfo) {
            C64826c.this.mo223718a(menuInfo);
        }
    }

    /* renamed from: a */
    public void mo223718a(MenuInfo menuInfo) {
        if (menuInfo == null) {
            this.f123081c.mo171471d("n_page_tenant_join_way", "current item is null");
        } else if (menuInfo.next == null) {
            this.f123081c.mo171471d("n_page_tenant_join_way", "current item.next is null");
        } else {
            if (ButtonType.JOIN_CODE == menuInfo.getButtonType()) {
                JoinTeamStatisticsHelper.m254570a(((C64821a.AbstractC64822a) mo171182e()).co_().flowType);
                PassportLog passportLog = this.f123081c;
                passportLog.mo171465b("n_action_click_input_team_code", "nextStep:" + menuInfo.next.nextStep);
                WatcherHelper.m193664a(this.f123080b, C40653t.f103171g);
            } else if (ButtonType.JOIN_SCAN == menuInfo.getButtonType()) {
                JoinTeamStatisticsHelper.m254571b(((C64821a.AbstractC64822a) mo171182e()).co_().flowType);
                PassportLog passportLog2 = this.f123081c;
                passportLog2.mo171465b("n_action_click_scan_qrcode", "nextStep:" + menuInfo.next.nextStep);
                WatcherHelper.m193664a(this.f123080b, C40653t.f103165a);
            }
            mo223719a(menuInfo.next.nextStep, menuInfo.next.stepInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo223719a(String str, JSONObject jSONObject) {
        C49092f.m193532a(this.f163424d, str, jSONObject, RouterScene.ALL.value, this.f123080b, this.f123081c, (AbstractC49336a) null);
    }

    public C64826c(Activity activity, C64821a.AbstractC64822a aVar, C64821a.AbstractC64823b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163424d = activity;
    }
}
