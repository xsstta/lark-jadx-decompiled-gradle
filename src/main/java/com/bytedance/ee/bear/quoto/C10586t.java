package com.bytedance.ee.bear.quoto;

import com.bytedance.ee.bear.quoto.AbstractC10577m;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p714p.C13719a;
import com.larksuite.framework.mvp.BasePresenter;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.quoto.t */
public class C10586t extends BasePresenter<AbstractC10576l, AbstractC10577m, AbstractC10577m.AbstractC10578a> {

    /* renamed from: a */
    private final C68289a f28383a = new C68289a();

    /* renamed from: b */
    private Long f28384b;

    /* renamed from: c */
    private String f28385c;

    /* renamed from: d */
    private Boolean f28386d;

    /* renamed from: e */
    private String f28387e;

    /* renamed from: a */
    public AbstractC10577m.AbstractC10578a createViewDelegate() {
        return null;
    }

    /* renamed from: b */
    public Boolean mo40042b() {
        return this.f28386d;
    }

    /* renamed from: c */
    public String mo40043c() {
        return this.f28387e;
    }

    /* renamed from: d */
    public String mo40044d() {
        return this.f28385c;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C13479a.m54764b("SingleFileExceedQuotaPr", "destroy()...");
        this.f28383a.mo237935a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("SingleFileExceedQuotaPr", "create()...");
        this.f28383a.mo237937a(((AbstractC10576l) getModel()).mo40027a().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$t$dkSrSpo0jfSlFOfyNJvNheIOjc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10586t.m269899lambda$dkSrSpo0jfSlFOfyNJvNheIOjc(C10586t.this, (BusinessInfoRequester.BusinessInfoResult) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$t$CNmfRx4u2nIvpBxtjiHc9Q_dEA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10586t.m269898lambda$CNmfRx4u2nIvpBxtjiHc9Q_dEA(C10586t.this, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43836a(Throwable th) {
        C13479a.m54764b("SingleFileExceedQuotaPr", "pullBusinessInfo()...error = " + th);
        ((AbstractC10577m) getView()).mo40028a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43835a(BusinessInfoRequester.BusinessInfoResult businessInfoResult) {
        boolean z;
        C13479a.m54764b("SingleFileExceedQuotaPr", "pullBusinessInfo()...success, InfoResult = " + businessInfoResult);
        Map<String, Long> suiteToFileSizeLimitMap = businessInfoResult.getSuiteToFileSizeLimitMap();
        this.f28385c = businessInfoResult.suiteType;
        List<BusinessInfoRequester.BusinessAdminInfo> list = businessInfoResult.admins;
        if (suiteToFileSizeLimitMap.isEmpty()) {
            C13479a.m54764b("SingleFileExceedQuotaPr", "pullBusinessInfo()...map parse fail");
            ((AbstractC10577m) getView()).mo40028a();
            return;
        }
        this.f28387e = C13719a.m55622b(suiteToFileSizeLimitMap.get(this.f28385c));
        if (Boolean.TRUE == businessInfoResult.isAdmin) {
            z = true;
        } else {
            z = false;
        }
        this.f28386d = Boolean.valueOf(z);
        Long l = suiteToFileSizeLimitMap.get("6");
        Long l2 = this.f28384b;
        if (l2 != null && l != null && l2.longValue() > l.longValue()) {
            C13479a.m54764b("SingleFileExceedQuotaPr", "pullBusinessInfo()...over max size# maxSize=" + l + ", mFileSize=" + this.f28384b);
            ((AbstractC10577m) getView()).mo40030a(suiteToFileSizeLimitMap, this.f28385c, this.f28386d.booleanValue(), l);
        } else if (SuiteTypeVersion.m43880a(businessInfoResult.suiteType)) {
            C13479a.m54764b("SingleFileExceedQuotaPr", "pullBusinessInfo()...unCertStandard");
            ((AbstractC10577m) getView()).mo40029a(suiteToFileSizeLimitMap, this.f28385c, this.f28386d.booleanValue());
        } else if (this.f28386d.booleanValue()) {
            ((AbstractC10577m) getView()).mo40031a(suiteToFileSizeLimitMap, this.f28385c, this.f28386d.booleanValue(), list);
        } else {
            ((AbstractC10577m) getView()).mo40032b(suiteToFileSizeLimitMap, this.f28385c, this.f28386d.booleanValue(), list);
        }
    }

    public C10586t(AbstractC10576l lVar, AbstractC10577m mVar, Long l) {
        super(lVar, mVar);
        this.f28384b = l;
    }
}
