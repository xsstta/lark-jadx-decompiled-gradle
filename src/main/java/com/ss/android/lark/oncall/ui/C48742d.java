package com.ss.android.lark.oncall.ui;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.oncall.OnCallModule;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import com.ss.android.lark.oncall.hitpoint.OnCallHitPoint;
import com.ss.android.lark.oncall.service.AbstractC48711a;
import com.ss.android.lark.oncall.service.OnCallService;
import com.ss.android.lark.oncall.service.dto.PullOnCallsResponse;
import com.ss.android.lark.oncall.ui.AbstractC48732a;
import com.ss.android.lark.oncall.ui.AbstractC48739c;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.ui.d */
public class C48742d extends BaseModel implements AbstractC48732a.AbstractC48733a {

    /* renamed from: a */
    public AbstractC48739c f122494a;

    /* renamed from: b */
    public AbstractC48732a.AbstractC48733a.AbstractC48734a f122495b;

    /* renamed from: c */
    private C48744a f122496c;

    /* renamed from: d */
    private C48748b f122497d;

    /* renamed from: e */
    private C48750c f122498e;

    /* renamed from: f */
    private AbstractC48711a f122499f = OnCallService.f122440a;

    /* renamed from: g */
    private AbstractC48739c.AbstractC48741a f122500g;

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: a */
    public void mo169996a() {
        C48744a aVar = this.f122496c;
        this.f122494a = aVar;
        aVar.mo170019d();
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: b */
    public void mo170001b() {
        this.f122494a.mo170020e();
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: c */
    public boolean mo170003c() {
        return this.f122494a.mo170018c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.oncall.ui.d$b */
    public static class C48748b extends AbstractC48739c {

        /* renamed from: f */
        public String f122508f;

        /* renamed from: g */
        public int f122509g;

        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: h */
        public int mo170023h() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: d */
        public void mo170019d() {
            this.f122509g++;
            super.mo170019d();
        }

        C48748b(AbstractC48739c.AbstractC48741a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo170032a(String str) {
            this.f122508f = str;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: a */
        public void mo170013a(int i, final int i2, final IGetDataCallback<List<OnCall>> iGetDataCallback) {
            final String str = this.f122508f;
            final int i3 = this.f122509g;
            OnCallModule.f122434b.mo169922a().mo143995a(this.f122508f, i, i + i2, mo170022g().wrapAndAddGetDataCallback(new IGetDataCallback<List<OnCall>>() {
                /* class com.ss.android.lark.oncall.ui.C48742d.C48748b.C487491 */

                /* renamed from: a */
                public void onSuccess(List<OnCall> list) {
                    if (TextUtils.equals(str, C48748b.this.f122508f) && C48748b.this.f122509g == i3) {
                        if (list.size() < i2) {
                            C48748b.this.f122490d = false;
                        } else {
                            C48748b.this.f122490d = true;
                        }
                        iGetDataCallback.onSuccess(list);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (TextUtils.equals(str, C48748b.this.f122508f)) {
                        Log.m165383e("OnCallPresenter", "SearchLoadDataHandler error :" + errorResult.toString());
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.oncall.ui.d$c */
    public static class C48750c extends AbstractC48739c {

        /* renamed from: f */
        public String f122515f;

        /* renamed from: g */
        public int f122516g;

        /* renamed from: h */
        private AbstractC48711a f122517h;

        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: h */
        public int mo170023h() {
            return 2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: d */
        public void mo170019d() {
            this.f122516g++;
            super.mo170019d();
        }

        /* renamed from: a */
        public void mo170034a(String str) {
            this.f122515f = str;
        }

        C48750c(AbstractC48739c.AbstractC48741a aVar, AbstractC48711a aVar2) {
            super(aVar);
            this.f122517h = aVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: a */
        public void mo170013a(int i, int i2, final IGetDataCallback<List<OnCall>> iGetDataCallback) {
            final String str = this.f122515f;
            final int i3 = this.f122516g;
            this.f122517h.mo169955a(str, i, i2, mo170022g().wrapAndAddGetDataCallback(new IGetDataCallback<PullOnCallsResponse>() {
                /* class com.ss.android.lark.oncall.ui.C48742d.C48750c.C487511 */

                /* renamed from: a */
                public void onSuccess(PullOnCallsResponse pullOnCallsResponse) {
                    if (TextUtils.equals(C48750c.this.f122515f, str) && C48750c.this.f122516g == i3) {
                        List<OnCall> list = pullOnCallsResponse.onCalls;
                        C48750c.this.f122490d = pullOnCallsResponse.hasMore;
                        iGetDataCallback.onSuccess(list);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (TextUtils.equals(C48750c.this.f122515f, str)) {
                        Log.m165383e("OnCallPresenter", "TagLoadDataHandler error :" + errorResult.toString());
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.oncall.ui.d$a */
    public static class C48744a extends AbstractC48739c {

        /* renamed from: f */
        public AbstractC48711a f122502f;

        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: h */
        public int mo170023h() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: d */
        public void mo170019d() {
            if (mo170012a().size() > 0) {
                this.f122491e.mo170025a(this, true);
            } else {
                super.mo170019d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo170027a(final IGetDataCallback<List<OnCall>> iGetDataCallback) {
            C57865c.m224574a(new C57865c.AbstractC57873d<List<OnCall>>() {
                /* class com.ss.android.lark.oncall.ui.C48742d.C48744a.C487462 */

                /* renamed from: a */
                public List<OnCall> produce() {
                    return C48744a.this.f122502f.mo169952a(0, C48744a.this.f122487a);
                }
            }, new C57865c.AbstractC57871b<List<OnCall>>() {
                /* class com.ss.android.lark.oncall.ui.C48742d.C48744a.C487473 */

                /* renamed from: a */
                public void consume(List<OnCall> list) {
                    C48744a.this.mo170016b(list);
                    if (list.size() > 0) {
                        C48744a.this.f122491e.mo170025a(C48744a.this, true);
                    }
                    C48744a aVar = C48744a.this;
                    aVar.mo170028b(aVar.f122489c, C48744a.this.f122487a, iGetDataCallback);
                }
            });
        }

        C48744a(AbstractC48739c.AbstractC48741a aVar, AbstractC48711a aVar2) {
            super(aVar);
            this.f122502f = aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo170028b(int i, int i2, final IGetDataCallback<List<OnCall>> iGetDataCallback) {
            this.f122502f.mo169953a(i, i2, mo170022g().wrapAndAddGetDataCallback(new IGetDataCallback<PullOnCallsResponse>() {
                /* class com.ss.android.lark.oncall.ui.C48742d.C48744a.C487451 */

                /* renamed from: a */
                public void onSuccess(PullOnCallsResponse pullOnCallsResponse) {
                    List<OnCall> list = pullOnCallsResponse.onCalls;
                    C48744a.this.f122490d = pullOnCallsResponse.hasMore;
                    iGetDataCallback.onSuccess(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("OnCallPresenter", "NormalLoadDataHandler error :" + errorResult.toString());
                    iGetDataCallback.onError(errorResult);
                }
            }));
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.oncall.ui.AbstractC48739c
        /* renamed from: a */
        public void mo170013a(int i, int i2, IGetDataCallback<List<OnCall>> iGetDataCallback) {
            if (i != 0) {
                mo170028b(i, i2, iGetDataCallback);
            } else if (UserSP.getInstance().getBoolean("key_first_load", true)) {
                UserSP.getInstance().putBoolean("key_first_load", false);
                mo170028b(i, i2, iGetDataCallback);
            } else {
                mo170027a(iGetDataCallback);
            }
        }
    }

    public C48742d() {
        C487431 r0 = new AbstractC48739c.AbstractC48741a() {
            /* class com.ss.android.lark.oncall.ui.C48742d.C487431 */

            @Override // com.ss.android.lark.oncall.ui.AbstractC48739c.AbstractC48741a
            /* renamed from: a */
            public void mo170025a(AbstractC48739c cVar, boolean z) {
                if (C48742d.this.f122494a.mo170023h() == cVar.mo170023h()) {
                    C48742d.this.f122495b.mo170005a(cVar.mo170012a(), cVar.mo170023h(), z);
                }
                OnCallHitPoint.f122437a.mo169925a(cVar.mo170012a().size());
            }

            @Override // com.ss.android.lark.oncall.ui.AbstractC48739c.AbstractC48741a
            /* renamed from: b */
            public void mo170026b(AbstractC48739c cVar, boolean z) {
                if (C48742d.this.f122494a.mo170023h() == cVar.mo170023h()) {
                    C48742d.this.f122495b.mo170004a();
                    C48742d.this.f122495b.mo170005a(cVar.mo170012a(), cVar.mo170023h(), z);
                }
                OnCallHitPoint.f122437a.mo169926b(cVar.mo170012a().size());
            }
        };
        this.f122500g = r0;
        this.f122496c = new C48744a(r0, this.f122499f);
        this.f122498e = new C48750c(this.f122500g, this.f122499f);
        this.f122497d = new C48748b(this.f122500g);
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: a */
    public void mo169998a(AbstractC48732a.AbstractC48733a.AbstractC48734a aVar) {
        this.f122495b = aVar;
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: a */
    public void mo169997a(IGetDataCallback<List<OnCallTag>> iGetDataCallback) {
        this.f122499f.mo169954a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: b */
    public void mo170002b(String str) {
        C48750c cVar = this.f122498e;
        this.f122494a = cVar;
        cVar.mo170034a(str);
        this.f122498e.mo170019d();
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: a */
    public void mo169999a(String str) {
        C48748b bVar = this.f122497d;
        this.f122494a = bVar;
        bVar.mo170032a(str);
        this.f122497d.mo170019d();
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a
    /* renamed from: a */
    public void mo170000a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
        this.f122499f.mo169956a(str, str2, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
