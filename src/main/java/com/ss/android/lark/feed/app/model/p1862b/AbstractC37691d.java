package com.ss.android.lark.feed.app.model.p1862b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.model.common.C37728b;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.feed.app.model.b.d */
public abstract class AbstractC37691d<T extends C37728b, LD extends DataLoader> {

    /* renamed from: g */
    private static final Object f96605g = new Object();

    /* renamed from: a */
    protected volatile AtomicBoolean f96606a;

    /* renamed from: b */
    protected volatile C37728b f96607b;

    /* renamed from: c */
    LD f96608c;

    /* renamed from: d */
    AbstractC37693b f96609d;

    /* renamed from: e */
    ConcurrentHashMap<T, Object> f96610e = new ConcurrentHashMap<>();

    /* renamed from: f */
    AtomicBoolean f96611f;

    /* renamed from: com.ss.android.lark.feed.app.model.b.d$a */
    public interface AbstractC37692a {
        /* renamed from: a */
        void mo138143a();

        /* renamed from: a */
        void mo138144a(ErrorResult errorResult);

        /* renamed from: a */
        void mo138145a(C37694c cVar);

        /* renamed from: a */
        void mo138146a(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.model.b.d$b */
    public interface AbstractC37693b {
        /* renamed from: a */
        void mo138147a();

        /* renamed from: b */
        void mo138148b();

        /* renamed from: c */
        void mo138149c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo138133a(T t, AbstractC37692a aVar);

    /* renamed from: a */
    public void mo138151a() {
        this.f96608c.mo138355a(DataLoader.LoadStatus.USER_STOP);
        this.f96610e.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo138155b() {
        AbstractC37693b bVar;
        if (this.f96606a.compareAndSet(false, true) && (bVar = this.f96609d) != null) {
            bVar.mo138147a();
        }
    }

    /* renamed from: c */
    private void m148164c() {
        if (this.f96608c.mo138354a() == DataLoader.LoadStatus.USER_STOP) {
            this.f96610e.clear();
        }
        if (!CollectionUtils.isEmpty(this.f96610e)) {
            Iterator<Map.Entry<T, Object>> it = this.f96610e.entrySet().iterator();
            while (it.hasNext()) {
                if (!mo138135a(it.next().getKey())) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: d */
    private T m148165d() {
        if (CollectionUtils.isEmpty(this.f96610e)) {
            return null;
        }
        Iterator<Map.Entry<T, Object>> it = this.f96610e.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        it.remove();
        return it.next().getKey();
    }

    public AbstractC37691d(AbstractC37693b bVar) {
        this.f96609d = bVar;
        this.f96611f = new AtomicBoolean(false);
        this.f96606a = new AtomicBoolean(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo138135a(T t) {
        if (this.f96608c.mo138354a() != DataLoader.LoadStatus.USER_STOP) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138152a(ErrorResult errorResult, AbstractC37692a aVar) {
        if (aVar != null) {
            aVar.mo138144a(errorResult);
        }
        mo138155b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138153a(C37694c cVar, AbstractC37692a aVar) {
        if (aVar != null) {
            aVar.mo138145a(cVar);
        }
        mo138155b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo138156b(T t, AbstractC37692a aVar) {
        this.f96610e.put(t, f96605g);
        if (this.f96608c.mo138356b()) {
            this.f96610e.remove(t);
            this.f96607b = t;
            try {
                mo138133a(t, aVar);
            } catch (Exception e) {
                mo138157b(false, aVar);
                Log.m165384e("FeedModule_LoadStrategy", "LoadStrategy execLoadTask err = ", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138154a(boolean z, AbstractC37692a aVar) {
        AbstractC37693b bVar;
        aVar.mo138143a();
        if (z && this.f96611f.compareAndSet(false, true) && (bVar = this.f96609d) != null) {
            bVar.mo138148b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo138157b(boolean z, AbstractC37692a aVar) {
        AbstractC37693b bVar;
        aVar.mo138146a(z);
        mo138155b();
        m148164c();
        if (this.f96610e.isEmpty() && this.f96611f.compareAndSet(true, false) && (bVar = this.f96609d) != null) {
            bVar.mo138149c();
        }
        if (z) {
            this.f96608c.mo138358d();
        } else {
            this.f96608c.mo138357c();
        }
        T d = m148165d();
        if (d != null) {
            mo138156b(d, aVar);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.model.b.d$c */
    public static class C37694c {

        /* renamed from: a */
        public List<FeedPreviewInfo> f96612a;

        /* renamed from: b */
        public List<C38126b> f96613b;

        /* renamed from: c */
        public C38126b f96614c;

        /* renamed from: d */
        public FeedFilter f96615d;

        public C37694c(List<FeedPreviewInfo> list, List<C38126b> list2, C38126b bVar, FeedFilter feedFilter) {
            this.f96612a = list;
            this.f96613b = list2;
            this.f96614c = bVar;
            this.f96615d = feedFilter;
        }
    }
}
