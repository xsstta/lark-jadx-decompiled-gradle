package com.bytedance.ee.larkwebview.pool.p680a;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebSettings;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.pool.AbstractC13447a;
import com.bytedance.ee.larkwebview.pool.AbstractC13454b;
import com.bytedance.ee.larkwebview.pool.BizTagNotFoundException;
import com.bytedance.ee.larkwebview.pool.C13455c;
import com.bytedance.ee.larkwebview.pool.DuplicateRegisterException;
import com.bytedance.ee.larkwebview.pool.p680a.C13450c;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.larkwebview.pool.a.c */
public class C13450c implements AbstractC13454b {

    /* renamed from: a */
    private ConcurrentHashMap<String, C13451a> f35489a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private volatile boolean f35490b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkwebview.pool.a.c$b */
    public static class C13452b extends MutableContextWrapper {
        public Resources getResources() {
            if (getBaseContext() == null) {
                return super.getResources();
            }
            return getBaseContext().getApplicationContext().getResources();
        }

        public C13452b(Context context) {
            super(context);
        }
    }

    public C13450c(Context context) {
        m54681b(context);
    }

    /* renamed from: c */
    private void m54683c(Context context) {
        if (!this.f35490b) {
            this.f35490b = true;
            try {
                WebSettings.getDefaultUserAgent(context);
            } catch (Exception e) {
                Log.m165398w("WebViewPoolImpl", "warmUpWebCore", e);
            }
        }
    }

    /* renamed from: d */
    private C13452b m54684d(Context context) {
        if (context != null) {
            return new C13452b(context.getApplicationContext());
        }
        Log.m165383e("WebViewPoolImpl", "context can not be null");
        throw new RuntimeException("context can not be null");
    }

    /* renamed from: e */
    private boolean m54685e(Context context) {
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m54681b(Context context) {
        try {
            mo49899a(context, "Default", new C13449b());
        } catch (DuplicateRegisterException e) {
            Log.m165386e("WebViewPoolImpl", e);
            C13455c.m54691a("Default");
        }
    }

    @Override // com.bytedance.ee.larkwebview.pool.AbstractC13454b
    /* renamed from: a */
    public LarkWebView mo49897a(Context context) {
        try {
            return mo49898a(context, "Default");
        } catch (BizTagNotFoundException e) {
            Log.m165384e("WebViewPoolImpl", "fetchWebViewInstance default tag failed", e);
            m54681b(context);
            C13455c.m54692b("Default");
            return mo49897a(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkwebview.pool.a.c$a */
    public static class C13451a {

        /* renamed from: a */
        final String f35491a;

        /* renamed from: b */
        final AbstractC13447a f35492b;

        /* renamed from: c */
        final C13453d f35493c;

        C13451a(String str, AbstractC13447a aVar) {
            this.f35491a = str;
            this.f35492b = aVar;
            this.f35493c = new C13453d(str, aVar.mo49889b());
        }
    }

    /* renamed from: b */
    private LarkWebView m54680b(Context context, C13451a aVar) {
        LarkWebView a = aVar.f35492b.mo49888a(m54684d(context));
        a.setTag(R.id.biz_tag, aVar.f35491a);
        return a;
    }

    /* renamed from: a */
    private void m54676a(Context context, C13451a aVar) {
        int a = aVar.f35492b.mo49887a();
        if (a <= 0) {
            Log.m165389i("WebViewPoolImpl", "biz : " + aVar.f35491a + " , no need for pre create instance.");
            return;
        }
        $$Lambda$c$1lBUEYWnA9B3jtO58KkPdbLtSk r1 = new Runnable(context, aVar, a) {
            /* class com.bytedance.ee.larkwebview.pool.p680a.$$Lambda$c$1lBUEYWnA9B3jtO58KkPdbLtSk */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ C13450c.C13451a f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C13450c.m270138lambda$1lBUEYWnA9B3jtO58KkPdbLtSk(C13450c.this, this.f$1, this.f$2, this.f$3);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(r1) {
                /* class com.bytedance.ee.larkwebview.pool.p680a.$$Lambda$c$8dCPlgMrOSpjxni3nsKqTyUVLc4 */
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C13450c.lambda$8dCPlgMrOSpjxni3nsKqTyUVLc4(this.f$0);
                }
            });
        } else {
            r1.run();
        }
    }

    /* renamed from: a */
    public LarkWebView mo49898a(Context context, String str) throws BizTagNotFoundException {
        C13451a aVar = this.f35489a.get(str);
        if (aVar == null) {
            Log.m165383e("WebViewPoolImpl", "fetchWebViewInstance failed, biz : " + str + " , has not register yet.");
            if (!m54685e(context)) {
                C13455c.m54692b(str);
                return mo49897a(context);
            }
            throw new BizTagNotFoundException(str);
        }
        LarkWebView larkWebView = (LarkWebView) aVar.f35493c.poll();
        if (larkWebView == null) {
            Log.m165389i("WebViewPoolImpl", "fetchWebViewInstance not hit cache, biz : " + str);
            larkWebView = m54680b(context, aVar);
        } else if (aVar.f35492b.mo49890c()) {
            m54677a(context, aVar, 1);
        }
        if (!(context instanceof Activity)) {
            Log.m165397w("WebViewPoolImpl", "fetchWebViewInstance warning, is better to fetch instance with activity context");
        }
        if (larkWebView.getContext() instanceof C13452b) {
            ((C13452b) larkWebView.getContext()).setBaseContext(context);
        }
        TTWebSdk.resetWebViewContext(larkWebView.getContext());
        return larkWebView;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m54682b(Context context, C13451a aVar, int i) {
        m54683c(context);
        m54677a(context, aVar, i);
    }

    /* renamed from: a */
    private void m54677a(Context context, C13451a aVar, int i) {
        try {
            Looper.getMainLooper();
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(i, aVar, context) {
                /* class com.bytedance.ee.larkwebview.pool.p680a.$$Lambda$c$Y1zMjpbXeVt6m6DFRiWVHNvEPo */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ C13450c.C13451a f$2;
                public final /* synthetic */ Context f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final boolean queueIdle() {
                    return C13450c.m270139lambda$Y1zMjpbXeVt6m6DFRiWVHNvEPo(C13450c.this, this.f$1, this.f$2, this.f$3);
                }
            });
        } catch (Exception e) {
            Log.m165398w("WebViewPoolImpl", "createCacheWebViewInstance", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m54679a(int i, C13451a aVar, Context context) {
        for (int i2 = 0; i2 < i; i2++) {
            aVar.f35493c.add(m54680b(context, aVar));
        }
        return false;
    }

    /* renamed from: a */
    public void mo49899a(Context context, String str, AbstractC13447a aVar) throws DuplicateRegisterException {
        if (this.f35489a.containsKey(str)) {
            C13455c.m54691a(str);
            if (!m54685e(context)) {
                Log.m165383e("WebViewPoolImpl", "registerPoolStrategy failed duplicate biz register, biz : " + str);
                return;
            }
            throw new DuplicateRegisterException(str);
        }
        if (aVar == null) {
            aVar = new C13449b();
        }
        if (!aVar.mo49890c() || aVar.mo49889b() > 0) {
            C13451a aVar2 = new C13451a(str, aVar);
            this.f35489a.put(str, aVar2);
            m54676a(context, aVar2);
            return;
        }
        throw new RuntimeException("must have a specific max pool size , when auto fill-up is on.");
    }
}
