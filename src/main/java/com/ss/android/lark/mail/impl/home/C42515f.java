package com.ss.android.lark.mail.impl.home;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42096i;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.C42515f;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.p2162b.AbstractC41817a;
import com.ss.android.lark.mail.impl.p2162b.C41818b;
import com.ss.android.lark.mail.impl.p2162b.C41822d;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41871c;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42291m;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import com.ss.android.lark.mail.impl.service.data.C43361a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.mail.impl.home.f */
public class C42515f {

    /* renamed from: a */
    final AbstractC42519a f108227a;

    /* renamed from: b */
    C42520b f108228b;

    /* renamed from: c */
    private long f108229c = -1;

    /* renamed from: com.ss.android.lark.mail.impl.home.f$a */
    public interface AbstractC42519a {
        /* renamed from: a */
        Context mo152956a();

        /* renamed from: a */
        void mo152957a(long j, String str, String str2, FilterType filterType, List<MailThread> list, boolean z, boolean z2);

        /* renamed from: a */
        void mo152958a(long j, boolean z);

        /* renamed from: b */
        boolean mo152959b();

        /* renamed from: c */
        boolean mo152960c();
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.f$b */
    public class C42520b {

        /* renamed from: a */
        final String f108242a;

        /* renamed from: b */
        public volatile int f108243b;

        /* renamed from: c */
        public volatile boolean f108244c;

        /* renamed from: d */
        public final AtomicBoolean f108245d;

        /* renamed from: e */
        public String f108246e;

        /* renamed from: f */
        public String f108247f;

        /* renamed from: g */
        public FilterType f108248g;

        /* renamed from: h */
        public C42096i f108249h;

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m169731a() {
            C42515f.this.mo152952a("from_account_change", 3);
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m169741h(final C41822d.AbstractC41826a aVar) {
            Log.m165389i(this.f108242a, "doInitData, start loadAggregationData");
            C43374f.m172264f().mo154933a(new AbsDataManager.AbstractC43359a() {
                /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425233 */

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43359a
                /* renamed from: b */
                public void mo152971b() {
                    if (!C42520b.this.f108245d.get() && C42515f.this.f108227a != null && C42515f.this.f108227a.mo152956a() != null) {
                        ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152391h("key_execute_request");
                    }
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43359a
                /* renamed from: c */
                public void mo152972c() {
                    if (!C42520b.this.f108245d.get() && C42515f.this.f108227a != null && C42515f.this.f108227a.mo152956a() != null) {
                        ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152391h("key_rust_load_success");
                    }
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43359a
                /* renamed from: d */
                public void mo152973d() {
                    if (!C42520b.this.f108245d.get()) {
                        if (!(C42515f.this.f108227a == null || C42515f.this.f108227a.mo152956a() == null)) {
                            ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152391h("key_notify_result");
                        }
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_finish_load_label_list");
                    }
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43359a
                /* renamed from: a */
                public void mo152970a() {
                    if (!C42520b.this.f108245d.get() && C42515f.this.f108227a.mo152956a() != null) {
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_start_load_label_list");
                        if (C42515f.this.f108227a.mo152956a() == null || !C42515f.this.f108227a.mo152960c()) {
                            ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152380b("init");
                            Log.m165389i(C42520b.this.f108242a, "LabelListEventMonitor 11 onStart");
                            return;
                        }
                        ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152380b("reload");
                        Log.m165389i(C42520b.this.f108242a, "LabelListEventMonitor 22 onStart");
                    }
                }
            }, new C43361a(new AbsDataManager.AbstractC43360b<Map<Integer, List<MailLabelEntity>>>() {
                /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425244 */

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                /* renamed from: a */
                public void mo152964a() {
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                public boolean equals(Object obj) {
                    return obj == this;
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                /* renamed from: a */
                public void mo152965a(ErrorResult errorResult) {
                    String str = C42520b.this.f108242a;
                    Log.m165389i(str, "doInitData, loadAggregationData fail: " + errorResult.getDebugMsg() + "; " + errorResult.getDisplayMsg());
                    if (C42515f.this.f108227a.mo152956a() != null) {
                        if (errorResult != null) {
                            ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                        }
                        ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152372a("rust_fail", 0);
                    }
                    aVar.mo150379a();
                }

                /* renamed from: a */
                public void mo152967a(Map<Integer, List<MailLabelEntity>> map) {
                    int i;
                    Log.m165389i(C42520b.this.f108242a, "doInitData, loadAggregationData success");
                    if (C42515f.this.f108227a.mo152956a() == null) {
                        Log.m165383e(C42520b.this.f108242a, "doInitData, loadAggregationData onSuccess but fragment null");
                    } else {
                        int i2 = 0;
                        if (map != null) {
                            int i3 = 0;
                            for (List<MailLabelEntity> list : map.values()) {
                                if (list != null) {
                                    i = list.size();
                                } else {
                                    i = 0;
                                }
                                i3 += i;
                            }
                            i2 = i3;
                        }
                        ((C42291m) C42344d.m169091a(C42291m.class, C42515f.this.f108227a.mo152956a())).mo152372a("success", (long) i2);
                    }
                    aVar.mo150380b();
                }
            }, this.f108245d));
        }

        private C42520b() {
            C42515f.this = r2;
            this.f108242a = "MailHomeDataLoader.InitDataTask." + hashCode();
            this.f108243b = 0;
            this.f108244c = false;
            this.f108245d = new AtomicBoolean();
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m169738e(C41822d.AbstractC41826a aVar) {
            if (this.f108249h == null) {
                C42515f.this.f108227a.mo152957a(0, this.f108246e, this.f108247f, this.f108248g, null, true, true);
            } else {
                C42515f.this.f108227a.mo152957a(0, this.f108246e, this.f108247f, this.f108248g, this.f108249h.mo151944a(), this.f108249h.mo151948b(), false);
            }
            aVar.mo150380b();
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m169740g(final C41822d.AbstractC41826a aVar) {
            final String r = C43277a.m171921a().mo154954r();
            final String y = C43374f.m172264f().mo155137y();
            if (TextUtils.isEmpty(r) || TextUtils.isEmpty(y)) {
                aVar.mo150380b();
                return;
            }
            String str = this.f108242a;
            Log.m165389i(str, "doInitData, preloadThreadListWithFirstLabelCache =" + r + ", " + y);
            C42176e.m168344a().mo152199a(C43374f.m172264f().mo155129q(), 0, (long) C42038d.C42039a.m167221a(), new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425255 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i(C42520b.this.f108242a, "doInitData, ignore preloadThreadListWithFirstLabelCache 1");
                    aVar.mo150380b();
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool != null || bool.booleanValue()) {
                        C42520b.this.f108246e = r;
                        C42520b.this.f108247f = y;
                        C42520b.this.f108248g = FilterType.ALL_MAIL;
                        C42520b.this.mo152962a((IGetDataCallback<C42096i>) new IGetDataCallback<C42096i>() {
                            /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425255.C425261 */

                            public boolean equals(Object obj) {
                                return obj == this;
                            }

                            public int hashCode() {
                                return super.hashCode();
                            }

                            /* renamed from: a */
                            public void onSuccess(C42096i iVar) {
                                Log.m165389i(C42520b.this.f108242a, "doInitData, preloadThreadListWithFirstLabelCache success");
                                C42520b.this.f108249h = iVar;
                                aVar.mo150380b();
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165389i(C42520b.this.f108242a, "doInitData, preloadThreadListWithFirstLabelCache fail");
                                aVar.mo150380b();
                            }
                        }, false);
                        return;
                    }
                    Log.m165389i(C42520b.this.f108242a, "doInitData, ignore preloadThreadListWithFirstLabelCache 2");
                    aVar.mo150380b();
                }
            });
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m169739f(final C41822d.AbstractC41826a aVar) {
            Log.m165389i(this.f108242a, "doInitData, start loadThreadListData");
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_start_load_thread_list");
            C43374f.m172264f().mo155128p();
            if (this.f108249h == null || !TextUtils.equals(this.f108246e, C43277a.m171921a().mo154950n()) || !TextUtils.equals(this.f108247f, C43374f.m172264f().mo155129q()) || this.f108248g != C43374f.m172264f().mo155135w()) {
                this.f108247f = C43374f.m172264f().mo155129q();
                this.f108248g = C43374f.m172264f().mo155135w();
                mo152962a((IGetDataCallback<C42096i>) new IGetDataCallback<C42096i>() {
                    /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425276 */

                    public boolean equals(Object obj) {
                        return obj == this;
                    }

                    public int hashCode() {
                        return super.hashCode();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i(C42520b.this.f108242a, "doInitData, loadThreadListInner fail");
                        C42520b.this.f108249h = null;
                        aVar.mo150380b();
                    }

                    /* renamed from: a */
                    public void onSuccess(C42096i iVar) {
                        Log.m165389i(C42520b.this.f108242a, "doInitData, loadThreadListInner success");
                        C42520b.this.f108249h = iVar;
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152413a(C42520b.this.f108249h.mo151949c());
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_finish_load_thread_list");
                        aVar.mo150380b();
                    }
                }, false);
                return;
            }
            Log.m165389i(this.f108242a, "doInitData, ignore loadThreadListData after preload");
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152414b(true);
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152413a(this.f108249h.mo151949c());
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_finish_load_thread_list");
            aVar.mo150380b();
        }

        /* renamed from: a */
        public void mo152961a(int i) {
            String str = this.f108242a;
            Log.m165389i(str, "doInitData " + i);
            this.f108243b = i;
            this.f108244c = true;
            if (C42515f.this.f108227a.mo152956a() == null) {
                Log.m165389i(this.f108242a, "doInitData but fragment null, ignore");
                this.f108244c = false;
            } else if (i <= 1) {
                C42094f f = C43350d.m172098a().mo155041f();
                MailLabelEntity r = C43374f.m172264f().mo155130r();
                if (f == null || r == null) {
                    mo152961a(2);
                    return;
                }
                if (C42515f.this.f108227a.mo152959b()) {
                    C42515f.this.mo152950a(0, false, null);
                }
                this.f108244c = false;
                Log.m165389i(this.f108242a, "doInitData, do nothing.");
            } else {
                C41822d.C41827b a = new C41822d.C41827b().mo150389a(C43849u.m173828b()).mo150391a(new C41822d.AbstractC41829c() {
                    /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425211 */

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
                    /* renamed from: a */
                    public void mo150394a(AbstractC41817a aVar) {
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
                    /* renamed from: a */
                    public void mo150395a(boolean z) {
                        C42520b.this.mo152963a(z);
                    }
                });
                a.mo150390a(new C41818b.C41820a().mo150381a(new AbstractC41817a(i) {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$BOL2d5EA5jZrvHUVScazfzZc8Kk */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        C42515f.C42520b.lambda$BOL2d5EA5jZrvHUVScazfzZc8Kk(C42515f.C42520b.this, this.f$1, aVar);
                    }
                }).mo150381a(new AbstractC41817a() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$7zLwbBR47WNw_XoIOA8PZtBw0 */

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        C42515f.C42520b.m270760lambda$7zLwbBR47WNw_XoIOA8PZtBw0(C42515f.C42520b.this, aVar);
                    }
                }).mo150381a(new AbstractC41817a() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$0bI98QQyaTgblwBxI73GDGlebjE */

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        C42515f.C42520b.lambda$0bI98QQyaTgblwBxI73GDGlebjE(C42515f.C42520b.this, aVar);
                    }
                }).mo150382a());
                a.mo150390a(new AbstractC41817a() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$p2t3cONOUNkGl0QypzfMFto6oxQ */

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        C42515f.C42520b.lambda$p2t3cONOUNkGl0QypzfMFto6oxQ(C42515f.C42520b.this, aVar);
                    }
                });
                a.mo150390a(new AbstractC41817a() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$sjfC1G2qglaaWFVXvNTfQFTaxZw */

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        C42515f.C42520b.lambda$sjfC1G2qglaaWFVXvNTfQFTaxZw(C42515f.C42520b.this, aVar);
                    }
                });
                a.mo150393a().mo150384a();
            }
        }

        /* renamed from: a */
        public void mo152963a(boolean z) {
            String str = this.f108242a;
            Log.m165389i(str, "doInitData, handleResult error=" + z);
            this.f108244c = false;
            if (!z && !TextUtils.equals(this.f108246e, C43277a.m171921a().mo154950n())) {
                Log.m165389i(this.f108242a, "doInitData, force reload after account changed");
                if (!C43277a.m171921a().mo154960x()) {
                    C43277a.m171921a().mo154932a(true);
                }
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.$$Lambda$f$b$bueQeIf4v5JwGtxbTs9157MPZwY */

                    public final void run() {
                        C42515f.C42520b.lambda$bueQeIf4v5JwGtxbTs9157MPZwY(C42515f.C42520b.this);
                    }
                });
            } else if (!C43277a.m171921a().mo154960x()) {
                Log.m165389i(this.f108242a, "doInitData, reload account from net");
                C43277a.m171921a().mo154932a(true);
                C43277a.m171921a().mo155071b(new AbsDataManager.AbstractC43360b<C42088b>() {
                    /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425309 */

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152964a() {
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152965a(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void mo152967a(C42088b bVar) {
                        if (!TextUtils.equals(C42520b.this.f108247f, C43374f.m172264f().mo155129q())) {
                            Log.m165389i(C42520b.this.f108242a, "doInitData, reload thread list after load setting from net and label changed");
                            C42515f.this.mo152950a(0, false, null);
                        }
                    }
                });
            } else if (!TextUtils.equals(this.f108247f, C43374f.m172264f().mo155129q())) {
                Log.m165389i(this.f108242a, "doInitData, reload thread list after label changed");
                C42515f.this.mo152950a(0, false, null);
            }
        }

        /* renamed from: a */
        public void mo152962a(final IGetDataCallback<C42096i> iGetDataCallback, final boolean z) {
            if (this.f108245d.get()) {
                Log.m165389i(this.f108242a, "doInitData, loadThreadListInner cancel");
                return;
            }
            C42515f.this.mo152951a(0, false, this.f108246e, this.f108247f, this.f108248g, new AbstractC41871c<C42096i>(new IGetDataCallback<C42096i>() {
                /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425287 */

                public boolean equals(Object obj) {
                    return obj == this;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i(C42520b.this.f108242a, "doInitData, loadThreadListInner fail");
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(C42096i iVar) {
                    Log.m165389i(C42520b.this.f108242a, "doInitData, loadThreadListInner success");
                    if ((!TextUtils.equals(C42520b.this.f108246e, C43277a.m171921a().mo154950n()) || !TextUtils.equals(C42520b.this.f108247f, C43374f.m172264f().mo155129q()) || C42520b.this.f108248g != C43374f.m172264f().mo155135w()) && !z) {
                        Log.m165389i(C42520b.this.f108242a, "doInitData, label changed, reload thread list");
                        C42520b.this.mo152962a(iGetDataCallback, true);
                        return;
                    }
                    iGetDataCallback.onSuccess(iVar);
                }
            }, this.f108245d) {
                /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425298 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41871c
                /* renamed from: a */
                public void mo150436a() {
                    Log.m165389i(C42520b.this.f108242a, "doInitData, loadThreadListInner cancel");
                }
            }, this.f108245d);
        }

        /* access modifiers changed from: public */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m169732a(final C41822d.AbstractC41826a aVar, int i) {
            Log.m165389i(this.f108242a, "doInitData, start loadSettingData");
            if (C43350d.m172098a().mo155041f() == null || i != 1) {
                Log.m165389i("MailAccountService", "reloadData from initData");
                C43350d.m172098a().mo155071b(new C43361a(new AbsDataManager.AbstractC43360b<C42094f>() {
                    /* class com.ss.android.lark.mail.impl.home.C42515f.C42520b.C425222 */

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    public boolean equals(Object obj) {
                        return obj == this;
                    }

                    public int hashCode() {
                        return super.hashCode();
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152964a() {
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_start_load_setting");
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152965a(ErrorResult errorResult) {
                        Log.m165389i(C42520b.this.f108242a, "doInitData, loadSettingData fail");
                        aVar.mo150379a();
                    }

                    /* renamed from: a */
                    public void mo152967a(C42094f fVar) {
                        Log.m165389i(C42520b.this.f108242a, "doInitData, loadSettingData success");
                        C42520b.this.f108246e = C43277a.m171921a().mo154950n();
                        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152391h("key_finish_load_setting");
                        aVar.mo150380b();
                    }
                }, this.f108245d));
                return;
            }
            Log.m165389i(this.f108242a, "loadSettingData, ignore");
            this.f108246e = C43277a.m171921a().mo154950n();
            aVar.mo150380b();
        }
    }

    /* renamed from: b */
    private synchronized void m169718b() {
        Log.m165389i("MailHomeDataLoader", "cancelCurrentTask");
        C42520b bVar = this.f108228b;
        if (bVar != null) {
            bVar.f108245d.set(true);
            this.f108228b = null;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo152953a() {
        boolean z;
        C42520b bVar = this.f108228b;
        if (bVar == null || !bVar.f108244c || this.f108228b.f108245d.get()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public C42515f(AbstractC42519a aVar) {
        this.f108227a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo152952a(String str, int i) {
        Log.m165389i("MailHomeDataLoader", "initData : source=" + str + ", level=" + i);
        C42520b bVar = this.f108228b;
        if (bVar != null && bVar.f108244c) {
            if (i <= this.f108228b.f108243b) {
                if (i != 3) {
                    Log.m165389i("MailHomeDataLoader", "initData ignore");
                    return;
                }
            }
            Log.m165389i("MailHomeDataLoader", "initData cancel current");
            m169718b();
        }
        Log.m165389i("MailHomeDataLoader", "initData execute new task");
        C42520b bVar2 = new C42520b();
        this.f108228b = bVar2;
        bVar2.mo152961a(i);
    }

    /* renamed from: a */
    public void mo152950a(final long j, boolean z, final IGetDataCallback<C42096i> iGetDataCallback) {
        final String n = C43277a.m171921a().mo154950n();
        final String q = C43374f.m172264f().mo155129q();
        final FilterType w = C43374f.m172264f().mo155135w();
        mo152951a(j, z, n, q, w, new IGetDataCallback<C42096i>() {
            /* class com.ss.android.lark.mail.impl.home.C42515f.C425161 */

            /* renamed from: a */
            public void onSuccess(C42096i iVar) {
                if (!C42515f.this.mo152953a()) {
                    C42515f.this.f108227a.mo152957a(j, n, q, w, iVar.mo151944a(), iVar.mo151948b(), false);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(iVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!C42515f.this.mo152953a()) {
                    C42515f.this.f108227a.mo152957a(j, n, q, w, null, true, true);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, null);
    }

    /* renamed from: a */
    public void mo152951a(final long j, boolean z, String str, final String str2, final FilterType filterType, final IGetDataCallback<C42096i> iGetDataCallback, AtomicBoolean atomicBoolean) {
        String str3;
        AbstractC42519a aVar = this.f108227a;
        if (!(aVar == null || aVar.mo152956a() == null)) {
            ((C42322x) C42344d.m169091a(C42322x.class, this.f108227a.mo152956a())).mo152391h("key_start_load_task");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("loadThreadList lastMessageTimestamp:");
        sb.append(j);
        sb.append(" isLabelChange:");
        sb.append(z);
        sb.append(", reqAccountID:");
        sb.append(str);
        sb.append(", reqLabelID:");
        sb.append(str2);
        sb.append(", reqFilterType:");
        sb.append(filterType);
        if (this.f108227a.mo152956a() != null) {
            str3 = ", has fragment";
        } else {
            str3 = ", has not fragment";
        }
        sb.append(str3);
        Log.m165389i("MailHomeDataLoader", sb.toString());
        C425183 r15 = new AbstractC41871c(new IGetDataCallback<C42096i>() {
            /* class com.ss.android.lark.mail.impl.home.C42515f.C425172 */

            /* renamed from: a */
            public void onSuccess(C42096i iVar) {
                Log.m165389i("MailHomeDataLoader", "loadThreadList onSuccess:" + str2 + ", " + filterType);
                if (C42515f.this.f108227a.mo152956a() != null) {
                    ((C42322x) C42344d.m169091a(C42322x.class, C42515f.this.f108227a.mo152956a())).mo152446a(iVar.mo151949c());
                    ((C42322x) C42344d.m169091a(C42322x.class, C42515f.this.f108227a.mo152956a())).mo152391h("key_rust_load_success");
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(iVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("MailHomeDataLoader", "loadThreadList onError:" + str2 + ", " + filterType);
                if (j == 0) {
                    C42226b.m168638a().mo152310b("mail_dev_labels_change_cost_time");
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                if (C42515f.this.f108227a.mo152956a() != null) {
                    if (errorResult != null) {
                        ((C42322x) C42344d.m169091a(C42322x.class, C42515f.this.f108227a.mo152956a())).mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                    ((C42322x) C42344d.m169091a(C42322x.class, C42515f.this.f108227a.mo152956a())).mo152372a("rust_fail", (long) C42038d.C42039a.m167221a());
                }
            }
        }, atomicBoolean) {
            /* class com.ss.android.lark.mail.impl.home.C42515f.C425183 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41871c
            /* renamed from: a */
            public void mo150436a() {
                Log.m165389i("MailHomeDataLoader", "loadThreadList onCancel");
            }
        };
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || filterType == null || this.f108227a.mo152956a() == null) {
            r15.onError(new ErrorResult("has not label or fragment"));
            return;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0 && System.currentTimeMillis() - this.f108229c <= 1) {
            Log.m165387e("load thread list too frequent", (Throwable) new RuntimeException("MailCustomException"), true);
        }
        this.f108229c = System.currentTimeMillis();
        if (i == 0) {
            C42226b.m168638a().mo152308a("mail_dev_labels_change_cost_time");
            C42226b.m168638a().mo152308a("mail_dev_thread_list_cost_time");
        } else if (this.f108227a.mo152956a() != null) {
            ((C42322x) C42344d.m169091a(C42322x.class, this.f108227a.mo152956a())).mo152380b("load_more");
            ((C42322x) C42344d.m169091a(C42322x.class, this.f108227a.mo152956a())).mo152447j(str2);
        }
        this.f108227a.mo152958a(j, z);
        Pair<C42096i, Boolean> a = C42723b.m170356a().mo153407a(str, str2);
        if (a == null || a.first == null) {
            Log.m165389i("MailHomeDataLoader", "loadThreadList invoke rust:" + str2 + ", " + filterType);
            C42176e.m168344a().mo152201a(str2, filterType, j, (long) C42038d.C42039a.m167221a(), r15);
            return;
        }
        Log.m165389i("MailHomeDataLoader", "loadThreadList use preload data");
        ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152416m();
        if (((Boolean) a.second).booleanValue()) {
            ((C42286k) C42344d.m169091a(C42286k.class, C41816b.m166115a().mo150132b())).mo152415c(true);
        }
        r15.onSuccess(a.first);
    }
}
