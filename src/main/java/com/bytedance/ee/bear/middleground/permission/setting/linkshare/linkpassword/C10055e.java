package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.LinkSharePasswordHelper;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.e */
public class C10055e implements C10045a.AbstractC10046a {

    /* renamed from: a */
    private LinkSharePasswordHelper f27151a = new LinkSharePasswordHelper();

    /* renamed from: b */
    private String f27152b;

    /* renamed from: c */
    private int f27153c;

    /* renamed from: d */
    private boolean f27154d;

    /* renamed from: e */
    private String f27155e;

    /* renamed from: f */
    private IUpdatePasswordStateToPermSetInfo f27156f;

    /* renamed from: g */
    private boolean f27157g;

    /* renamed from: h */
    private C68289a f27158h = new C68289a();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: a */
    public String mo38380a() {
        return this.f27155e;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: b */
    public boolean mo38384b() {
        return this.f27154d;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C68289a aVar = this.f27158h;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: a */
    public void mo38381a(C10045a.AbstractC10046a.AbstractC10047a aVar) {
        this.f27158h.mo237937a(this.f27151a.mo38363a(this.f27152b, this.f27153c, this.f27157g).mo238001b(new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$zbaTsUSnUXgQSpkG4E_HGjH0hRI */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.this.m41833c((C10055e) this.f$1, (C10045a.AbstractC10046a.AbstractC10047a) ((NetService.Result) obj));
            }
        }, new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$NKTKl54Q5ulngw2mBfZ2sMFV6Nw */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.this.m41834c((C10055e) this.f$1, (C10045a.AbstractC10046a.AbstractC10047a) ((Throwable) obj));
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: b */
    public void mo38383b(C10045a.AbstractC10046a.AbstractC10047a aVar) {
        this.f27158h.mo237937a(this.f27151a.mo38364b(this.f27152b, this.f27153c, this.f27157g).mo238001b(new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$m9A9UAN4jHPTA0gJiwHq1RpIHzk */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.this.m41831b((C10055e) this.f$1, (C10045a.AbstractC10046a.AbstractC10047a) ((NetService.Result) obj));
            }
        }, new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$IavDyyMjxAHR5bnhb3L17eIkDgA */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.lambda$IavDyyMjxAHR5bnhb3L17eIkDgA(C10055e.this, this.f$1, (Throwable) obj);
            }
        }));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: c */
    public void mo38385c(C10045a.AbstractC10046a.AbstractC10047a aVar) {
        this.f27158h.mo237937a(this.f27151a.mo38365c(this.f27152b, this.f27153c, this.f27157g).mo238001b(new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$70_kPSJVH6EJ16n7Ss2sfBUA0bY */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.lambda$70_kPSJVH6EJ16n7Ss2sfBUA0bY(C10055e.this, this.f$1, (NetService.Result) obj);
            }
        }, new Consumer(aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$e$uKFmxrTktNYZUaubmqBJnt7oU58 */
            public final /* synthetic */ C10045a.AbstractC10046a.AbstractC10047a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C10055e.this.m41830a((C10055e) this.f$1, (C10045a.AbstractC10046a.AbstractC10047a) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    private /* synthetic */ void m41830a(C10045a.AbstractC10046a.AbstractC10047a aVar, Throwable th) {
        C13479a.m54759a("LinkSharePasswordViewModel", "resetPassword failed", th);
        aVar.mo38386a(th, this.f27154d, this.f27155e);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m41832b(C10045a.AbstractC10046a.AbstractC10047a aVar, Throwable th) {
        C13479a.m54759a("LinkSharePasswordViewModel", "deletePassword failed", th);
        aVar.mo38386a(th, this.f27154d, this.f27155e);
    }

    /* renamed from: c */
    private /* synthetic */ void m41834c(C10045a.AbstractC10046a.AbstractC10047a aVar, Throwable th) {
        C13479a.m54759a("LinkSharePasswordViewModel", "createPassword failed", th);
        aVar.mo38386a(th, this.f27154d, this.f27155e);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10046a
    /* renamed from: a */
    public void mo38382a(boolean z, String str) {
        this.f27154d = z;
        this.f27155e = str;
        IUpdatePasswordStateToPermSetInfo cVar = this.f27156f;
        if (cVar != null) {
            if (str == null) {
                str = "";
            }
            cVar.onPasswordStateUpdate(z, str);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m41829a(C10045a.AbstractC10046a.AbstractC10047a aVar, NetService.Result result) {
        if (result.getCode() != 0 || TextUtils.isEmpty(((LinkSharePasswordHelper.Data) result.getData()).getPassword())) {
            C13479a.m54758a("LinkSharePasswordViewModel", "resetPassword failed code: " + result.getCode());
            aVar.mo38386a(new Throwable("code = " + result.getCode()), this.f27154d, this.f27155e);
            return;
        }
        mo38382a(true, ((LinkSharePasswordHelper.Data) result.getData()).getPassword());
        aVar.mo38387a(this.f27154d, this.f27155e);
    }

    /* renamed from: b */
    private /* synthetic */ void m41831b(C10045a.AbstractC10046a.AbstractC10047a aVar, NetService.Result result) {
        if (result.getCode() == 0) {
            mo38382a(false, "");
            aVar.mo38387a(this.f27154d, this.f27155e);
            return;
        }
        C13479a.m54758a("LinkSharePasswordViewModel", "deletePassword failed code: " + result.getCode());
        aVar.mo38386a(new Throwable("code = " + result.getCode()), this.f27154d, this.f27155e);
    }

    /* renamed from: c */
    private /* synthetic */ void m41833c(C10045a.AbstractC10046a.AbstractC10047a aVar, NetService.Result result) {
        if (result.getCode() != 0 || TextUtils.isEmpty(((LinkSharePasswordHelper.Data) result.getData()).getPassword())) {
            C13479a.m54758a("LinkSharePasswordViewModel", "createPassword failed code: " + result.getCode());
            aVar.mo38386a(new Throwable("code = " + result.getCode()), this.f27154d, this.f27155e);
            return;
        }
        mo38382a(true, ((LinkSharePasswordHelper.Data) result.getData()).getPassword());
        aVar.mo38387a(this.f27154d, this.f27155e);
    }

    public C10055e(String str, int i, boolean z, String str2, IUpdatePasswordStateToPermSetInfo cVar, boolean z2) {
        this.f27152b = str;
        this.f27153c = i;
        this.f27154d = z;
        this.f27155e = str2;
        this.f27157g = z2;
        this.f27156f = cVar;
    }
}
