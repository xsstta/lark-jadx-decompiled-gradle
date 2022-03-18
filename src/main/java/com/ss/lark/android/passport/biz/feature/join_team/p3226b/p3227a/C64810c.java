package com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.p2069j.p2070a.C40653t;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.b.a.c */
public class C64810c extends AbstractC49021b<C64805a.AbstractC64806a, C64805a.AbstractC64807b, C64805a.AbstractC64807b.AbstractC64808a> implements C64805a.AbstractC64807b.AbstractC64808a {

    /* renamed from: d */
    protected AbstractC49407b f163400d;

    /* renamed from: e */
    protected Context f163401e;

    /* renamed from: f */
    protected String f163402f;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64805a.AbstractC64807b.AbstractC64808a mo171180c() {
        return this;
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64807b.AbstractC64808a
    /* renamed from: b */
    public void mo223686b() {
        C64805a.AbstractC64806a aVar = (C64805a.AbstractC64806a) mo171182e();
        if (aVar instanceof C49020a) {
            ((C49020a) aVar).mo171177f();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64805a.AbstractC64807b) mo171181d()).mo171188a(mo171180c());
        mo223689a(this.f163402f);
    }

    /* renamed from: a */
    public void mo223688a(NetworkErrorResult networkErrorResult) {
        this.f163400d.mo145305a(networkErrorResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m254499a(Activity activity) {
        C64805a.AbstractC64806a aVar = (C64805a.AbstractC64806a) mo171182e();
        if (aVar != null) {
            aVar.cn_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo223687a(final BaseStepData baseStepData) {
        final C64805a.AbstractC64807b bVar = (C64805a.AbstractC64807b) mo171181d();
        C49092f.m193529a(this.f163401e, baseStepData, RouterScene.ALL.value, this.f123080b, this.f123081c, new AbstractC49336a() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64810c.C648122 */

            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
            public void onRouterResult(int i, Object obj) {
                if (i == -106) {
                    C64810c.this.f123081c.mo171465b("n_page_scan_qrcode", "enterApp success");
                    bVar.mo223683e();
                    if (C64810c.this.f163401e instanceof Activity) {
                        ((Activity) C64810c.this.f163401e).finish();
                    }
                    WatcherHelper.m193664a(C64810c.this.f123080b, C40653t.f103170f);
                } else if (i == -100) {
                    PassportLog passportLog = C64810c.this.f123081c;
                    passportLog.mo171465b("n_page_scan_qrcode", "open page " + baseStepData.nextStep);
                    bVar.mo223683e();
                    WatcherHelper.m193664a(C64810c.this.f123080b, C40653t.f103170f);
                } else {
                    PassportLog passportLog2 = C64810c.this.f123081c;
                    passportLog2.mo171465b("n_page_scan_qrcode", "router error=" + i);
                    bVar.mo223683e();
                    C64810c cVar = C64810c.this;
                    cVar.mo223688a(new NetworkErrorResult(-1, "router error=" + i));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo223689a(String str) {
        final C64805a.AbstractC64807b bVar = (C64805a.AbstractC64807b) mo171181d();
        bVar.mo223682d();
        this.f123081c.mo171460a("n_action_join_team_by_scan_req");
        WatcherHelper.m193664a(this.f123080b, C40653t.f103166b);
        ((C64805a.AbstractC64806a) mo171182e()).mo223684a(this.f123080b, str, new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64810c.C648111 */

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                C64810c.this.f123081c.mo171460a("n_action_join_team_by_scan_succ");
                C64810c.this.mo223687a(baseStepData);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64810c.this.f123081c;
                passportLog.mo171465b("n_action_join_team_by_scan_error", "error=" + networkErrorResult.toString());
                UnknownCodeHandler.f123256a.mo171331c(C64810c.this.f163401e, networkErrorResult);
                bVar.mo223683e();
                C64810c.this.mo223688a((NetworkErrorResult) null);
            }
        });
    }

    public C64810c(AbstractC49407b bVar, C64805a.AbstractC64806a aVar, C64805a.AbstractC64807b bVar2, String str, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar2, uniContext, passportLog);
        this.f163400d = bVar;
        this.f163401e = bVar.mo145304a();
        this.f163402f = str;
        this.f163400d.mo145306a(new AbstractC49407b.AbstractC49408a() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.$$Lambda$c$GYxmxushWH0jILanI4ki7xUcw */

            @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b.AbstractC49408a
            public final void onActivityDestory(Activity activity) {
                C64810c.this.m254499a((C64810c) activity);
            }
        });
    }
}
