package com.ss.android.lark.main.app.fragment.phone;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.main.app.fragment.phone.e */
public class C44314e {

    /* renamed from: a */
    public volatile Map<String, Integer> f112386a = new ConcurrentHashMap();

    /* renamed from: b */
    public volatile int f112387b = 0;

    /* renamed from: c */
    public AbstractC44320a f112388c;

    /* renamed from: d */
    AbstractC44136a.AbstractC44171x.AbstractC44172a f112389d = new AbstractC44136a.AbstractC44171x.AbstractC44172a() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44314e.C443151 */

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44171x.AbstractC44172a
        /* renamed from: a */
        public void mo157136a(final Map<String, Integer> map) {
            if (C44314e.this.mo157429d()) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.fragment.phone.C44314e.C443151.RunnableC443161 */

                    public void run() {
                        C44314e.this.f112386a.putAll(map);
                        C44314e.this.f112387b = 0;
                        String P = C44134a.m174959a().mo133196P();
                        for (String str : C44314e.this.f112386a.keySet()) {
                            Integer num = C44314e.this.f112386a.get(str);
                            if (!TextUtils.equals(str, P)) {
                                C44314e.this.f112387b += num.intValue();
                            }
                        }
                        C44314e.this.f112388c.mo157420a(C44314e.this.f112387b);
                    }
                });
            }
        }
    };

    /* renamed from: com.ss.android.lark.main.app.fragment.phone.e$a */
    public interface AbstractC44320a {
        /* renamed from: a */
        void mo157420a(int i);
    }

    /* renamed from: a */
    public void mo157426a() {
        C44134a.m174959a().mo133188H().mo133399a(this.f112389d);
    }

    /* renamed from: b */
    public void mo157427b() {
        C44134a.m174959a().mo133188H().mo133407b(this.f112389d);
    }

    /* renamed from: c */
    public void mo157428c() {
        if (mo157429d()) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.main.app.fragment.phone.C44314e.RunnableC443172 */

                public void run() {
                    C44134a.m174959a().mo133188H().mo133398a(new IGetDataCallback<Map<String, Integer>>() {
                        /* class com.ss.android.lark.main.app.fragment.phone.C44314e.RunnableC443172.C443181 */

                        /* renamed from: a */
                        public void onSuccess(final Map<String, Integer> map) {
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.main.app.fragment.phone.C44314e.RunnableC443172.C443181.RunnableC443191 */

                                public void run() {
                                    String P = C44134a.m174959a().mo133196P();
                                    C44314e.this.f112386a.clear();
                                    C44314e.this.f112386a.putAll(map);
                                    C44314e.this.f112387b = 0;
                                    for (String str : C44314e.this.f112386a.keySet()) {
                                        if (!TextUtils.equals(str, P)) {
                                            C44314e.this.f112387b = (int) (((long) C44314e.this.f112387b) + ((long) C44314e.this.f112386a.get(str).intValue()));
                                        }
                                    }
                                    C44314e.this.f112388c.mo157420a(C44314e.this.f112387b);
                                }
                            });
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("MainTenantModel", "pullAccountBadgeCounts err = " + errorResult);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: d */
    public boolean mo157429d() {
        if (C44134a.m174959a().mo133270z().mo133361a("lark.tenant.penetration.enable")) {
            return true;
        }
        this.f112388c.mo157420a(0);
        return false;
    }

    public C44314e(AbstractC44320a aVar) {
        this.f112388c = aVar;
    }
}
