package com.ss.android.lark.feed.app.model.p1862b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.model.C37784j;
import com.ss.android.lark.feed.app.model.cache.C37716b;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.p1861a.C37673a;
import com.ss.android.lark.feed.app.model.p1861a.C37674b;
import com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d;
import com.ss.android.lark.feed.app.model.p1862b.C37682a;
import com.ss.android.lark.feed.app.model.p1862b.C37695e;
import com.ss.android.lark.feed.app.model.p1862b.C37702h;
import com.ss.android.lark.feed.app.model.p1864d.C37746f;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.sdk.C53234a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.model.b.c */
public class C37687c {

    /* renamed from: a */
    public static final Object f96590a = new Object();

    /* renamed from: b */
    public FeedCard.FeedType f96591b;

    /* renamed from: c */
    public volatile ICache f96592c;

    /* renamed from: d */
    public C37746f f96593d;

    /* renamed from: e */
    public C37784j f96594e;

    /* renamed from: f */
    private FeedFilter f96595f;

    /* renamed from: g */
    private int f96596g;

    /* renamed from: h */
    private int f96597h;

    /* renamed from: i */
    private int f96598i;

    /* renamed from: j */
    private volatile boolean f96599j;

    /* renamed from: k */
    private Map<Class<?>, AbstractC37691d> f96600k;

    /* renamed from: l */
    private AbstractC37691d.AbstractC37692a f96601l = new AbstractC37691d.AbstractC37692a() {
        /* class com.ss.android.lark.feed.app.model.p1862b.C37687c.C376881 */

        @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37692a
        /* renamed from: a */
        public void mo138143a() {
        }

        @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37692a
        /* renamed from: a */
        public void mo138144a(ErrorResult errorResult) {
        }

        @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37692a
        /* renamed from: a */
        public void mo138146a(boolean z) {
        }

        @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37692a
        /* renamed from: a */
        public void mo138145a(AbstractC37691d.C37694c cVar) {
            List<UIFeedCard> a = C37687c.this.f96593d.mo138449a(cVar.f96612a, true);
            ICache iCache = C37687c.this.f96592c;
            if (iCache != null) {
                iCache.mo138239a(a, cVar.f96615d);
                iCache.mo138247c(a);
                iCache.mo138233a(C37687c.this.f96591b, cVar.f96615d, cVar.f96614c);
                iCache.mo138234a(C37687c.this.f96591b, cVar.f96615d, cVar.f96613b);
            }
        }
    };

    /* renamed from: b */
    public void mo138141b() {
        if (this.f96591b == FeedCard.FeedType.INBOX) {
            this.f96594e.mo138510b();
        }
        this.f96592c = null;
        for (AbstractC37691d dVar : this.f96600k.values()) {
            dVar.mo138151a();
        }
        this.f96600k.clear();
    }

    /* renamed from: a */
    public void mo138138a() {
        C37673a b = C37674b.m148126a().mo138116b();
        this.f96596g = b.mo138110a();
        this.f96597h = b.mo138112b();
        this.f96598i = b.mo138114c();
        if (this.f96591b == FeedCard.FeedType.INBOX) {
            this.f96594e.mo138507a();
        }
    }

    /* renamed from: c */
    public void mo138142c() {
        this.f96599j = true;
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.feed.app.model.p1862b.C37687c.RunnableC376903 */

            public void run() {
                C37268c.m146766b().mo139195n().mo139355a("local_cache_preload", null);
                C37687c.this.f96594e.mo138511c();
                C37268c.m146766b().mo139195n().mo139354a();
            }
        });
        String a = C53234a.m205877a();
        C37268c.m146766b().mo139195n().mo139357c("load_feed", a);
        if (!C37262a.m146726a().mo139198q().mo139256a("lark.sdk.sync_data.ignore_invoke_sync")) {
            C38146f.m149976a().mo139503b();
        } else if (this.f96592c != null) {
            this.f96592c.mo138236a(this.f96591b, LoadState.LoadType.NET, false);
        }
        m148151a(((C37702h.C37703a) new C37702h.C37703a().mo138201a(0).mo138206b(this.f96596g).mo138210c(10).mo138388a(a)).mo138209b());
        if (this.f96591b == FeedCard.FeedType.DONE) {
            m148151a(new C37702h.C37703a().mo138201a(0).mo138206b(50).mo138210c(Integer.MAX_VALUE).mo138209b());
        }
    }

    /* renamed from: a */
    private void m148151a(C37728b bVar) {
        AbstractC37691d dVar = this.f96600k.get(bVar.getClass());
        if (TextUtils.isEmpty(bVar.mo138385a())) {
            bVar.mo138386a(C53234a.m205877a());
        }
        if (dVar != null) {
            dVar.mo138156b(bVar, this.f96601l);
        }
    }

    /* renamed from: a */
    public void mo138139a(int i, FeedPreview feedPreview) {
        if (this.f96599j || this.f96595f == C37548b.m147657a().mo137792b()) {
            if (feedPreview != null) {
                m148151a(new C37695e.C37696a().mo138168a(feedPreview).mo138166a(10).mo138167a(this.f96595f).mo138170b());
            }
            C37702h b = new C37702h.C37703a().mo138201a(i).mo138206b(this.f96597h).mo138210c(this.f96598i).mo138203a(this.f96595f).mo138209b();
            synchronized (f96590a) {
                m148151a(b);
            }
        }
    }

    /* renamed from: a */
    public void mo138140a(C38126b bVar, int i) {
        if (this.f96599j && i != 0) {
            m148151a(new C37682a.C37683a().mo138129a(bVar).mo138126a(bVar.f97759a).mo138125a(i).mo138128a(PullType.BETWEEN_CURSOR).mo138127a(this.f96595f).mo138131b());
        }
    }

    public C37687c(FeedFilter feedFilter, FeedCard.FeedType feedType, C37716b bVar) {
        this.f96595f = feedFilter;
        this.f96591b = feedType;
        this.f96592c = bVar;
        this.f96593d = new C37746f();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f96600k = concurrentHashMap;
        concurrentHashMap.put(C37702h.class, new C37704i(this.f96591b, this.f96595f, bVar, new AbstractC37691d.AbstractC37693b() {
            /* class com.ss.android.lark.feed.app.model.p1862b.C37687c.C376892 */

            @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37693b
            /* renamed from: a */
            public void mo138147a() {
                if (C37687c.this.f96592c != null) {
                    C37687c.this.f96592c.mo138235a(C37687c.this.f96591b, LoadState.LoadType.LOCAL);
                    C37687c.this.f96592c.mo138252h();
                }
            }

            @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37693b
            /* renamed from: b */
            public void mo138148b() {
                if (C37687c.this.f96592c != null) {
                    C37687c.this.f96592c.mo138236a(C37687c.this.f96591b, LoadState.LoadType.LOCAL, true);
                }
            }

            @Override // com.ss.android.lark.feed.app.model.p1862b.AbstractC37691d.AbstractC37693b
            /* renamed from: c */
            public void mo138149c() {
                if (C37687c.this.f96592c != null) {
                    C37687c.this.f96592c.mo138236a(C37687c.this.f96591b, LoadState.LoadType.LOCAL, false);
                }
            }
        }));
        this.f96600k.put(C37695e.class, new C37697f(this.f96591b, this.f96595f, bVar, null));
        this.f96600k.put(C37682a.class, new C37684b(this.f96591b, this.f96595f, bVar, null));
        if (this.f96591b == FeedCard.FeedType.INBOX) {
            this.f96599j = true;
        }
        this.f96594e = new C37784j(this.f96592c);
    }
}
