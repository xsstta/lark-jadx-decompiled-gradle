package com.ss.android.lark.feed.app;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.AbstractC29617j;
import com.ss.android.lark.biz.im.api.AbstractC29618k;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.guide.FeedTipGuideHelper;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.p1849b.C37306c;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.interfaces.AbstractC38085a;
import com.ss.android.lark.feed.interfaces.AbstractC38098i;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.d */
public class C37480d implements AbstractC38098i {

    /* renamed from: a */
    public final C37731d f96140a;

    /* renamed from: b */
    public final AbstractC38037a.AbstractC38050j f96141b;

    /* renamed from: c */
    public final ConcurrentHashMap<AbstractC38098i.AbstractC38099a, Integer> f96142c;

    /* renamed from: d */
    private final AtomicBoolean f96143d;

    /* renamed from: e */
    private final FeedFgUtils.OnInitReadyCallback f96144e;

    /* renamed from: f */
    private final FeedFgUtils.OnInitReadyCallback f96145f;

    /* renamed from: g */
    private final AbstractC38085a f96146g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.d$a */
    public static class C37486a {

        /* renamed from: a */
        static C37480d f96152a = new C37480d();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: h */
    public String mo137459h() {
        return "conversation";
    }

    /* renamed from: a */
    public static C37480d m147447a() {
        return C37486a.f96152a;
    }

    /* renamed from: d */
    public void mo137455d() {
        Log.m165389i("FeedModule_FeedImpl", "onAccountChanged");
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: g */
    public boolean mo137458g() {
        return FeedFgSyncUtil.m146722b();
    }

    /* renamed from: k */
    public void mo137462k() {
        this.f96140a.mo138427r();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: l */
    public String mo137463l() {
        return C37427c.m147290a().mo137333b();
    }

    /* renamed from: e */
    public void mo137456e() {
        Log.m165389i("FeedModule_FeedImpl", "handleAccountChange");
        C37268c.m146766b().mo139191j();
        FeedFgUtils.m146772b(this.f96145f);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: f */
    public void mo137457f() {
        Log.m165389i("FeedModule_FeedImpl", "resetCache");
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.C37480d.RunnableC374854 */

            public void run() {
                C37480d.this.f96140a.mo138416g();
                if (C37480d.this.f96140a.mo138410b()) {
                    C37480d.this.f96140a.mo138414e();
                    C38146f.m149976a().mo139505c();
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: j */
    public int mo137461j() {
        List<UIFeedCard> c;
        UpdateRecord h = this.f96140a.mo138417h();
        if (h == null || (c = h.mo138376c()) == null) {
            return 0;
        }
        return c.size();
    }

    private C37480d() {
        this.f96142c = new ConcurrentHashMap<>();
        this.f96143d = new AtomicBoolean(false);
        this.f96144e = new FeedFgUtils.OnInitReadyCallback() {
            /* class com.ss.android.lark.feed.app.C37480d.C374811 */

            @Override // com.ss.android.lark.feed.common.FeedFgUtils.OnInitReadyCallback
            /* renamed from: a */
            public void mo136996a(boolean z) {
                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37480d.C374811.RunnableC374821 */

                    public void run() {
                        if (C37480d.this.f96140a.mo138410b()) {
                            C37480d.this.f96140a.mo138414e();
                        }
                        FeedTipGuideHelper.m147851a().mo137988d();
                        C37480d.this.f96141b.mo139247a();
                    }
                });
            }
        };
        this.f96145f = new FeedFgUtils.OnInitReadyCallback() {
            /* class com.ss.android.lark.feed.app.C37480d.C374832 */

            @Override // com.ss.android.lark.feed.common.FeedFgUtils.OnInitReadyCallback
            /* renamed from: a */
            public void mo136996a(boolean z) {
                C37480d.this.mo137457f();
                for (AbstractC38098i.AbstractC38099a aVar : C37480d.this.f96142c.keySet()) {
                    if (aVar != null) {
                        aVar.mo139422a();
                    }
                }
            }
        };
        this.f96146g = new AbstractC38085a() {
            /* class com.ss.android.lark.feed.app.C37480d.C374843 */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38085a
            /* renamed from: a */
            public void mo137465a() {
                Log.m165389i("FeedModule_FeedImpl", "IAccountChangeListener onAccountChange");
                C37480d.this.mo137456e();
            }
        };
        this.f96140a = C37731d.m148488a();
        this.f96141b = C37268c.m146766b().mo139204w();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: b */
    public void mo137450b() {
        if (this.f96143d.compareAndSet(false, true)) {
            Log.m165389i("FeedModule_FeedImpl", "init");
            FeedFgUtils.m146770a(this.f96144e);
            C37262a.m146726a().mo139161H().mo139329a(this.f96146g);
        }
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: c */
    public void mo137454c() {
        if (this.f96143d.compareAndSet(true, false)) {
            Log.m165389i("FeedModule_FeedImpl", "unInit");
            FeedFgUtils.m146769a();
            this.f96141b.mo139248b();
            this.f96140a.mo138416g();
            C37262a.m146726a().mo139161H().mo139342b(this.f96146g);
        }
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: i */
    public int mo137460i() {
        Integer num;
        Map<Integer, Integer> p = this.f96140a.mo138425p();
        if (p != null) {
            num = p.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber()));
        } else {
            num = null;
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: b */
    public void mo137451b(AbstractC29617j jVar) {
        this.f96140a.mo138405b(jVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: b */
    public void mo137452b(AbstractC29618k kVar) {
        this.f96140a.mo138406b(kVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public void mo137444a(Context context) {
        C37306c.m146953a().mo137138a(context);
        C37306c.m146953a().mo137141b(context);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: b */
    public void mo137453b(AbstractC38098i.AbstractC38100b bVar) {
        this.f96140a.mo138409b(bVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public void mo137445a(AbstractC29617j jVar) {
        this.f96140a.mo138397a(jVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public void mo137446a(AbstractC29618k kVar) {
        this.f96140a.mo138398a(kVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public void mo137447a(AbstractC38098i.AbstractC38100b bVar) {
        this.f96140a.mo138403a(bVar);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public boolean mo137448a(Fragment fragment) {
        return fragment instanceof C37539f;
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public boolean mo137449a(FeedCard.FeedType feedType) {
        return this.f96140a.mo138411b(feedType);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public AbstractC29619l mo137442a(FeedCard.FeedType feedType, FeedCard.Type type) {
        return new C37611h(feedType, type);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i
    /* renamed from: a */
    public AbstractC44552i mo137443a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new C37613i(eVar, iTitleController);
    }
}
