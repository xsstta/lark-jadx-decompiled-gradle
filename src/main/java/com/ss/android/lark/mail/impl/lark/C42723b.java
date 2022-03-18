package com.ss.android.lark.mail.impl.lark;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ListView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42096i;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.C42496e;
import com.ss.android.lark.mail.impl.home.C42515f;
import com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView;
import com.ss.android.lark.mail.impl.home.threadlist.MailSmartRefreshLayout;
import com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.MailSplashService;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import com.ss.android.lark.mail.impl.service.p2215a.C43293b;
import com.ss.android.lark.mail.impl.utils.C43767j;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.lark.b */
public class C42723b {

    /* renamed from: a */
    public C42496e f108747a;

    /* renamed from: b */
    public final Map<Class<?>, AbstractC42734c> f108748b;

    /* renamed from: c */
    public String f108749c;

    /* renamed from: d */
    public String f108750d;

    /* renamed from: e */
    public Map<Integer, List<MailLabelEntity>> f108751e;

    /* renamed from: f */
    public C42096i f108752f;

    /* renamed from: g */
    public C42735d f108753g;

    /* renamed from: h */
    private final Class[] f108754h;

    /* renamed from: com.ss.android.lark.mail.impl.lark.b$a */
    public interface AbstractC42731a {

        /* renamed from: com.ss.android.lark.mail.impl.lark.b$a$a */
        public interface AbstractC42732a {
            /* renamed from: a */
            void mo153405a();

            /* renamed from: a */
            void mo153406a(boolean z);
        }

        /* renamed from: a */
        void mo152864a(AbstractC42732a aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.lark.b$b */
    public static class C42733b {

        /* renamed from: a */
        static C42723b f108764a = new C42723b();
    }

    /* renamed from: d */
    public void mo153417d() {
        this.f108747a = null;
    }

    /* renamed from: a */
    public static C42723b m170356a() {
        return C42733b.f108764a;
    }

    /* renamed from: c */
    public C42496e mo153415c() {
        return this.f108747a;
    }

    /* renamed from: com.ss.android.lark.mail.impl.lark.b$c */
    public static abstract class AbstractC42734c {

        /* renamed from: a */
        private final AtomicBoolean f108765a = new AtomicBoolean(false);

        /* renamed from: b */
        private final AtomicBoolean f108766b = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<View> f108767c = new ArrayList(6);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract View mo153429b(Context context);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract int mo153431c();

        /* renamed from: b */
        public boolean mo153430b() {
            return this.f108765a.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo153427a() {
            boolean z = true;
            if (!this.f108765a.compareAndSet(true, false) || !this.f108766b.compareAndSet(false, true)) {
                z = false;
            }
            if (z) {
                this.f108767c.clear();
                this.f108766b.set(false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo153432c(Context context) {
            boolean z;
            if (!mo153430b() || !this.f108766b.compareAndSet(false, true)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || this.f108767c.isEmpty()) {
                return mo153429b(context);
            }
            List<View> list = this.f108767c;
            View remove = list.remove(list.size() - 1);
            this.f108766b.set(false);
            return remove;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo153428a(Context context) {
            boolean z = true;
            if (this.f108765a.compareAndSet(false, true)) {
                int c = mo153431c();
                for (int i = 0; i < c; i++) {
                    View b = mo153429b(context);
                    if (this.f108766b.compareAndSet(false, true)) {
                        this.f108767c.add(b);
                        this.f108766b.set(false);
                    }
                }
                if (mo153430b() || !this.f108766b.compareAndSet(false, true)) {
                    z = false;
                }
                if (z) {
                    this.f108767c.clear();
                    this.f108766b.set(false);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo153419e() {
        for (AbstractC42734c cVar : this.f108748b.values()) {
            cVar.mo153427a();
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.lark.b$e */
    public static final class C42736e extends AbstractC42734c {
        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.lark.C42723b.AbstractC42734c
        /* renamed from: c */
        public int mo153431c() {
            return UIUtils.getScreenHeight(C41816b.m166115a().mo150132b()) / C41816b.m166115a().mo150132b().getResources().getDimensionPixelOffset(R.dimen.mail_item_view_height);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.lark.C42723b.AbstractC42734c
        /* renamed from: b */
        public View mo153429b(Context context) {
            return new MailItemView(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m170358f() {
        for (Class cls : this.f108754h) {
            try {
                Class.forName(cls.getName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        C43779n.m173507a();
        mo153418d(C41816b.m166115a().mo150132b());
    }

    /* renamed from: b */
    public void mo153412b() {
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.mail.impl.lark.$$Lambda$b$iHALZpiuQFs7CH1IJBPs0WubvYw */

            public final void run() {
                C42723b.this.m170358f();
            }
        });
    }

    private C42723b() {
        HashMap hashMap = new HashMap();
        this.f108748b = hashMap;
        this.f108754h = new Class[]{MailSplashService.class, MailSmartRefreshLayout.class, MailFeedRecyclerView.class, OperationTitleBar.class, HeaderFooterRecyclerView.class, ListView.class, LKUIStatus.class, C42515f.class};
        hashMap.put(MailItemView.class, new C42736e());
    }

    /* renamed from: com.ss.android.lark.mail.impl.lark.b$d */
    public class C42735d {
        public C42735d() {
        }

        /* renamed from: a */
        public void mo153433a(Context context) {
            Log.m165389i("MailIdlePreloader", "preloadWhenIdle");
            C42723b.this.mo153410a(context);
        }

        /* renamed from: a */
        public void mo153434a(String str) {
            JSONObject a = C43767j.m173489a().mo155934a();
            try {
                a.put("event", str);
            } catch (JSONException e) {
                Log.m165398w("MailIdlePreloader", "error", e);
            }
            Log.m165389i("MailIdlePreloader", "reportIdlePreload " + str);
            C41816b.m166115a().mo150114D().mo150182b("mail_home_idle_preload_dev", a);
        }
    }

    /* renamed from: b */
    public void mo153413b(final Context context) {
        Log.m165389i("MailTabUIPreLoader", "preloadUIView: start");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.lark.C42723b.RunnableC427262 */

            public void run() {
                C42723b.this.f108747a = new C42496e();
                C42723b.this.f108747a.mo152860a(context);
                if (!CollectionUtils.isEmpty(C42723b.this.f108748b)) {
                    for (final AbstractC42734c cVar : C42723b.this.f108748b.values()) {
                        if (!cVar.mo153430b()) {
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.lark.C42723b.RunnableC427262.RunnableC427271 */

                                public void run() {
                                    cVar.mo153428a(context);
                                }
                            });
                        }
                    }
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.lark.C42723b.RunnableC427262.RunnableC427282 */

                        public void run() {
                            Log.m165389i("MailTabUIPreLoader", "clearCache");
                            C42723b.this.mo153419e();
                        }
                    }, 15000);
                }
                Log.m165389i("MailTabUIPreLoader", "preloadUIView: finish");
            }
        });
    }

    /* renamed from: b */
    private void m170357b(AbsDataManager.AbstractC43360b<C42094f> bVar) {
        C42094f f = C43350d.m172098a().mo155041f();
        if (f != null) {
            bVar.mo152967a(f);
        } else {
            C43350d.m172098a().mo155071b(bVar);
        }
    }

    /* renamed from: a */
    public Map<Integer, List<MailLabelEntity>> mo153409a(String str) {
        if (this.f108751e == null || !C43293b.m171995e()) {
            Map<Integer, List<MailLabelEntity>> map = this.f108751e;
            if (map != null) {
                Log.m165389i("MailTabUIPreLoader", "getAndClearPreloadLabelList");
                this.f108751e = null;
            }
            if (TextUtils.equals(str, this.f108749c)) {
                return map;
            }
            return null;
        }
        Log.m165389i("MailTabUIPreLoader", "getAndClearPreloadLabelList, cache invalid");
        this.f108751e = null;
        return null;
    }

    /* renamed from: d */
    public void mo153418d(Context context) {
        for (AbstractC42734c cVar : this.f108748b.values()) {
            if (!cVar.mo153430b()) {
                cVar.mo153428a(context);
            }
        }
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.lark.C42723b.RunnableC427293 */

            public void run() {
                Log.m165389i("MailTabUIPreLoader", "clearCache");
                C42723b.this.mo153419e();
            }
        }, 15000);
    }

    /* renamed from: b */
    public void mo153414b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C42176e.m168344a().mo152201a(str, C43374f.m172264f().mo155135w(), 0, (long) C42038d.C42039a.m167221a(), new IGetDataCallback<C42096i>() {
                /* class com.ss.android.lark.mail.impl.lark.C42723b.C427304 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("MailTabUIPreLoader", "preloadMainPageData getThreadList onError");
                }

                /* renamed from: a */
                public void onSuccess(C42096i iVar) {
                    Log.m165389i("MailTabUIPreLoader", "preloadMainPageData getThreadList onSuccess");
                    C42723b.this.f108752f = iVar;
                    MailSplashService.m171910d().mo154916a();
                    if (C42723b.this.f108753g != null && iVar != null) {
                        C42723b.this.f108753g.mo153434a("preloaded");
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo153416c(Context context) {
        Log.m165389i("MailTabUIPreLoader", "preloadWhenIdle");
        if (!C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.home.preload_with_unread_mail")) {
            Log.m165389i("MailTabUIPreLoader", "preloadWhenIdle, ignore by fg");
            return;
        }
        C42089c b = C41832a.m166157a().mo150418d().mo5927b();
        if (b == null || b.mo151826a() == 0 || !(b.mo151830b() == BadgeCountState.RED || b.mo151830b() == BadgeCountState.RED_DOT)) {
            Log.m165389i("MailTabUIPreLoader", "preloadWhenIdle, ignore without unread");
        } else if (C43345c.m172076m().mo154997c()) {
            Log.m165389i("MailTabUIPreLoader", "preloadWhenIdle, ignore in mail tab");
        } else {
            C42735d dVar = new C42735d();
            this.f108753g = dVar;
            dVar.mo153433a(context);
        }
    }

    /* renamed from: a */
    public void mo153410a(Context context) {
        Log.m165389i("MailTabUIPreLoader", "preloadMainPageData ");
        Log.m165389i("MailAccountService", "reloadData from preload ");
        C42735d dVar = this.f108753g;
        if (dVar != null) {
            dVar.mo153434a("start");
        }
        m170357b(new AbsDataManager.AbstractC43360b<C42094f>() {
            /* class com.ss.android.lark.mail.impl.lark.C42723b.C427241 */

            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
            /* renamed from: a */
            public void mo152964a() {
            }

            @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
            /* renamed from: a */
            public void mo152965a(ErrorResult errorResult) {
                Log.m165389i("MailTabUIPreLoader", "preloadMainPageData getLabels error");
            }

            /* renamed from: a */
            public void mo152967a(C42094f fVar) {
                C42723b.this.f108749c = C43350d.m172098a().mo155011C();
                C42723b.this.mo153411a(new AbsDataManager.AbstractC43360b<Map<Integer, List<MailLabelEntity>>>() {
                    /* class com.ss.android.lark.mail.impl.lark.C42723b.C427241.C427251 */

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152964a() {
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152965a(ErrorResult errorResult) {
                        Log.m165389i("MailTabUIPreLoader", "preloadMainPageData getLabels error");
                    }

                    /* renamed from: a */
                    public void mo152967a(Map<Integer, List<MailLabelEntity>> map) {
                        Log.m165389i("MailTabUIPreLoader", "preloadMainPageData getLabels success");
                        C42723b.this.f108751e = map;
                        C42723b.this.f108750d = C43374f.m172264f().mo155129q();
                        C42723b.this.mo153414b(C42723b.this.f108750d);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo153411a(AbsDataManager.AbstractC43360b<Map<Integer, List<MailLabelEntity>>> bVar) {
        Map<Integer, List<MailLabelEntity>> map = (Map) C43374f.m172264f().mo155068P().mo5927b();
        if (map != null) {
            bVar.mo152967a(map);
        } else {
            C43374f.m172264f().mo155071b(bVar);
        }
    }

    /* renamed from: a */
    public <T> T mo153408a(Class<?> cls, Context context) {
        AbstractC42734c cVar = this.f108748b.get(cls);
        if (cVar != null) {
            return (T) cVar.mo153432c(context);
        }
        return null;
    }

    /* renamed from: a */
    public Pair<C42096i, Boolean> mo153407a(String str, String str2) {
        boolean z;
        if (this.f108752f == null || !C43293b.m171995e()) {
            C42096i iVar = this.f108752f;
            if (iVar == null) {
                return null;
            }
            Log.m165389i("MailTabUIPreLoader", "getAndClearPreloadThreadList");
            this.f108752f = null;
            if (!TextUtils.equals(str, this.f108749c) || !TextUtils.equals(str2, this.f108750d)) {
                return null;
            }
            C42735d dVar = this.f108753g;
            if (dVar != null) {
                dVar.mo153434a("apply");
            }
            if (this.f108753g != null) {
                z = true;
            } else {
                z = false;
            }
            return new Pair<>(iVar, Boolean.valueOf(z));
        }
        Log.m165389i("MailTabUIPreLoader", "getAndClearPreloadThreadList, cache invalid");
        this.f108752f = null;
        return null;
    }
}
