package com.ss.android.lark.notification.env;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.env.C48475a;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.notification.env.b */
public class C48478b {

    /* renamed from: a */
    public C48475a f121970a;

    /* renamed from: b */
    public ExecutorService f121971b;

    /* renamed from: c */
    private Context f121972c;

    /* renamed from: d */
    private AbstractC48407a.AbstractC48415g f121973d;

    /* renamed from: e */
    private AbstractC48407a.AbstractC48427o f121974e;

    /* renamed from: f */
    private AbstractC48407a.AbstractC48429q f121975f;

    /* renamed from: g */
    private C48475a.AbstractC48477a f121976g;

    /* renamed from: h */
    private AbstractC48407a.AbstractC48415g.AbstractC48418c f121977h;

    /* renamed from: i */
    private AbstractC48407a.AbstractC48415g.AbstractC48417b f121978i;

    /* renamed from: j */
    private AbstractC48407a.AbstractC48429q.AbstractC48431b f121979j;

    /* renamed from: k */
    private AbstractC48407a.AbstractC48429q.AbstractC48430a f121980k;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.notification.env.b$a */
    public static class C48491a {

        /* renamed from: a */
        static C48478b f122001a = new C48478b();
    }

    /* renamed from: a */
    public static C48478b m191179a() {
        return C48491a.f122001a;
    }

    /* renamed from: b */
    public void mo169544b() {
        if (C26252ad.m94993b(this.f121972c)) {
            m191181d();
            this.f121971b.execute(new Runnable() {
                /* class com.ss.android.lark.notification.env.C48478b.RunnableC484791 */

                public void run() {
                    Log.m165389i("EnvController", "[Notification Settings]: init.");
                    C48478b.this.mo169545c();
                }
            });
        }
    }

    private C48478b() {
        this.f121972c = C48398a.m190922a().mo169335a();
        this.f121970a = new C48475a();
        this.f121973d = C48398a.m190922a().mo169350m();
        this.f121974e = C48398a.m190922a().mo169341d();
        this.f121975f = C48398a.m190922a().mo169342e();
        this.f121971b = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("Log_watcher");
    }

    /* renamed from: d */
    private void m191181d() {
        C484802 r0 = new C48475a.AbstractC48477a() {
            /* class com.ss.android.lark.notification.env.C48478b.C484802 */

            @Override // com.ss.android.lark.notification.env.C48475a.AbstractC48477a
            /* renamed from: a */
            public void mo169543a(NotificationEnv notificationEnv) {
                Log.m165389i("EnvController", "[Notification Settings]:  " + notificationEnv.toString());
            }
        };
        this.f121976g = r0;
        this.f121970a.mo169541a(r0);
        C484813 r02 = new AbstractC48407a.AbstractC48415g.AbstractC48418c() {
            /* class com.ss.android.lark.notification.env.C48478b.C484813 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g.AbstractC48418c
            /* renamed from: a */
            public void mo169383a() {
                C48478b.this.f121971b.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.env.C48478b.C484813.RunnableC484821 */

                    public void run() {
                        Log.m165389i("EnvController", "[Notification Settings]: onlineStatusChanged.");
                        C48478b.this.mo169545c();
                    }
                });
            }
        };
        this.f121977h = r02;
        this.f121973d.mo169375a(r02);
        C484834 r03 = new AbstractC48407a.AbstractC48415g.AbstractC48417b() {
            /* class com.ss.android.lark.notification.env.C48478b.C484834 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48415g.AbstractC48417b
            /* renamed from: a */
            public void mo169382a(final boolean z) {
                C48478b.this.f121971b.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.env.C48478b.C484834.RunnableC484841 */

                    public void run() {
                        Log.m165389i("EnvController", "[Notification Settings]: notifyStatusChanged: " + z);
                        C48478b.this.mo169545c();
                    }
                });
            }
        };
        this.f121978i = r03;
        this.f121973d.mo169374a(r03);
        C484855 r04 = new AbstractC48407a.AbstractC48429q.AbstractC48431b() {
            /* class com.ss.android.lark.notification.env.C48478b.C484855 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q.AbstractC48431b
            /* renamed from: a */
            public void mo169436a(final boolean z) {
                C48478b.this.f121971b.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.env.C48478b.C484855.RunnableC484861 */

                    public void run() {
                        if (C48478b.this.f121970a.mo169539a().f121963d != z) {
                            Log.m165389i("EnvController", "[Notification Settings]: is In Zen mode: " + z);
                            C48478b.this.mo169545c();
                        }
                    }
                });
            }
        };
        this.f121979j = r04;
        this.f121975f.mo169433a(r04);
        C484876 r05 = new AbstractC48407a.AbstractC48429q.AbstractC48430a() {
            /* class com.ss.android.lark.notification.env.C48478b.C484876 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48429q.AbstractC48430a
            /* renamed from: a */
            public void mo169435a(final Map<String, Integer> map) {
                C48478b.this.f121971b.execute(new Runnable() {
                    /* class com.ss.android.lark.notification.env.C48478b.C484876.RunnableC484881 */

                    public void run() {
                        Integer num = (Integer) map.get("setting_type");
                        Integer num2 = (Integer) map.get("specific_type");
                        if (num != null && num2 != null && C48478b.this.f121970a.mo169539a().mo169537a() != C48492c.m191191a(num.intValue(), num2.intValue())) {
                            Log.m165389i("EnvController", "[Notification Settings]: setting changed");
                            C48478b.this.mo169545c();
                        }
                    }
                });
            }
        };
        this.f121980k = r05;
        this.f121975f.mo169432a(r05);
    }

    /* renamed from: c */
    public void mo169545c() {
        if (C48398a.m190922a().mo169345h().mo169392b()) {
            final boolean a = C48492c.m191192a(this.f121972c);
            final AbstractC48407a.AbstractC48415g.C48416a a2 = this.f121973d.mo169373a();
            final boolean a3 = this.f121975f.mo169434a();
            final boolean a4 = this.f121974e.mo169410a();
            m191180a(new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.notification.env.C48478b.C484897 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    C48478b.this.f121970a.mo169540a(new NotificationEnv(a, a2.f121884a, a2.f121885b, a3, a4, num.intValue()));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("EnvController", "get app notification error: " + errorResult.getDisplayMsg());
                }
            });
        }
    }

    /* renamed from: a */
    private void m191180a(final IGetDataCallback<Integer> iGetDataCallback) {
        this.f121975f.mo169431a(new IGetDataCallback<Map<String, Integer>>() {
            /* class com.ss.android.lark.notification.env.C48478b.C484908 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("EnvController", errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Integer> map) {
                if (map == null) {
                    iGetDataCallback.onError(new ErrorResult("no data"));
                    return;
                }
                Integer num = map.get("setting_type");
                Integer num2 = map.get("specific_type");
                if (num == null || num2 == null) {
                    iGetDataCallback.onError(new ErrorResult("no data"));
                } else {
                    iGetDataCallback.onSuccess(Integer.valueOf(C48492c.m191191a(num.intValue(), num2.intValue())));
                }
            }
        });
    }
}
