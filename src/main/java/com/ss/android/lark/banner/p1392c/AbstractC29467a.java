package com.ss.android.lark.banner.p1392c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.banner.common.BannerPriorityDecision;
import com.ss.android.lark.banner.common.DecisionResult;
import com.ss.android.lark.banner.entity.p1395a.C29474b;
import com.ss.android.lark.banner.entity.p1395a.C29475c;
import com.ss.android.lark.banner.export.AbstractC29478a;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.banner.export.AbstractC29482c;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.banner.export.AbstractC29491f;
import com.ss.android.lark.banner.export.entity.C29489b;
import com.ss.android.lark.banner.export.entity.C29490c;
import com.ss.android.lark.banner.export.entity.p1396a.C29486a;
import com.ss.android.lark.banner.p1390a.C29453a;
import com.ss.android.lark.banner.p1391b.AbstractC29458a;
import com.ss.android.lark.banner.p1391b.C29466d;
import com.ss.android.lark.banner.p1394e.C29472a;
import com.ss.android.lark.banner.p1397f.C29492a;
import com.ss.android.lark.banner.p1398g.AbstractC29499a;
import com.ss.android.lark.banner.statistics.BannerApm;
import com.ss.android.lark.banner.statistics.BannerAppreciable;
import com.ss.android.lark.banner.statistics.UGAppreciable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.banner.c.a */
public abstract class AbstractC29467a implements AbstractC29458a, DecisionResult<AbstractC29478a>, AbstractC29479b, AbstractC29482c {

    /* renamed from: a */
    public final List<C29489b> f73590a = new ArrayList();

    /* renamed from: b */
    public AbstractC29478a f73591b;

    /* renamed from: c */
    private final C29466d<String, AbstractC29478a> f73592c = new C29466d<>();

    /* renamed from: d */
    private final C29466d<String, AbstractC29483d> f73593d = new C29466d<>();

    /* renamed from: e */
    private AbstractC29479b.AbstractC29480a f73594e;

    /* renamed from: f */
    private long f73595f;

    /* renamed from: g */
    private C29492a.AbstractC29498b f73596g = new C29492a.AbstractC29498b() {
        /* class com.ss.android.lark.banner.p1392c.AbstractC29467a.C294692 */

        @Override // com.ss.android.lark.banner.p1397f.C29492a.AbstractC29498b
        /* renamed from: a */
        public void mo104359a(String str) {
            if (TextUtils.equals(str, AbstractC29467a.this.mo104354b())) {
                AbstractC29467a.this.mo104345a();
            }
        }
    };

    /* renamed from: h */
    private C29453a.AbstractC29457b f73597h = new C29453a.AbstractC29457b() {
        /* class com.ss.android.lark.banner.p1392c.AbstractC29467a.C294703 */

        @Override // com.ss.android.lark.banner.p1390a.C29453a.AbstractC29457b
        /* renamed from: a */
        public void mo104327a(String str) {
            if (AbstractC29467a.this.f73591b != null && (AbstractC29467a.this.f73591b instanceof AbstractC29491f)) {
                AbstractC29491f fVar = (AbstractC29491f) AbstractC29467a.this.f73591b;
                if (TextUtils.equals(str, fVar.mo104447d())) {
                    AbstractC29467a.this.mo104355c();
                    if (fVar instanceof C29472a) {
                        boolean z = false;
                        if (CollectionUtils.isNotEmpty(AbstractC29467a.this.f73590a)) {
                            ArrayList arrayList = new ArrayList(AbstractC29467a.this.f73590a);
                            int i = 0;
                            while (true) {
                                if (i < arrayList.size()) {
                                    C29489b bVar = (C29489b) arrayList.get(i);
                                    if (bVar != null && TextUtils.equals(bVar.mo104443a(), str)) {
                                        z = true;
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            AbstractC29499a.CC.m108592a().mo104455a(new C29475c(str));
                        }
                    }
                }
            }
        }
    };

    @Override // com.ss.android.lark.banner.export.AbstractC29482c
    /* renamed from: b */
    public abstract String mo104354b();

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104345a() {
        m108435b((Map<String, String>) null);
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29482c
    /* renamed from: c */
    public void mo104355c() {
        AbstractC29479b.AbstractC29480a aVar = this.f73594e;
        if (aVar != null) {
            aVar.mo16922a();
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: d */
    public void mo104356d() {
        C29492a.m108585a().mo104450a(this.f73596g);
        C29453a.m108411a().mo104322a(this.f73597h);
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: e */
    public void mo104357e() {
        C29492a.m108585a().mo104452b(this.f73596g);
        C29453a.m108411a().mo104323b(this.f73597h);
        AbstractC29478a aVar = this.f73591b;
        if (aVar != null) {
            aVar.mo104441c();
        }
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104347a(AbstractC29479b.AbstractC29480a aVar) {
        this.f73594e = aVar;
    }

    @Override // com.ss.android.lark.banner.p1391b.AbstractC29458a
    /* renamed from: a */
    public AbstractC29478a mo104328a(String str) {
        AbstractC29478a a = this.f73592c.mo104342a(str);
        if (a != null) {
            a.mo104440a(this);
        }
        return a;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29482c
    /* renamed from: b */
    public AbstractC29483d mo104353b(String str) {
        return this.f73593d.mo104342a(str);
    }

    /* renamed from: a */
    public void mo104344a(AbstractC29478a aVar) {
        BannerApm.f73689a.mo104461b(SystemClock.uptimeMillis() - this.f73595f);
        AbstractC29478a aVar2 = this.f73591b;
        if (aVar2 != null) {
            aVar2.mo104441c();
        }
        this.f73591b = aVar;
        AbstractC29479b.AbstractC29480a aVar3 = this.f73594e;
        if (aVar3 != null) {
            aVar3.mo16923a(aVar);
        }
    }

    /* renamed from: b */
    private void m108435b(Map<String, String> map) {
        this.f73595f = SystemClock.uptimeMillis();
        C29474b bVar = new C29474b(mo104354b());
        if (map != null) {
            bVar.mo104436a(new HashMap(map));
        }
        AbstractC29499a.CC.m108592a().mo104454a(bVar, new IGetDataCallback<List<C29489b>>() {
            /* class com.ss.android.lark.banner.p1392c.AbstractC29467a.C294681 */

            /* renamed from: a */
            long f73598a = SystemClock.uptimeMillis();

            /* renamed from: b */
            final UGAppreciable.NetPoint f73599b;

            {
                UGAppreciable.NetPoint c = BannerAppreciable.f73690a.mo104467c();
                this.f73599b = c;
                c.mo104478a();
            }

            /* renamed from: a */
            public void onSuccess(List<C29489b> list) {
                BannerApm.f73689a.mo104458a(SystemClock.uptimeMillis() - this.f73598a);
                this.f73599b.mo104480b();
                m108451b(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                BannerApm.f73689a.mo104459a(errorResult.toString());
                this.f73599b.mo104479a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                m108451b(null);
            }

            /* renamed from: b */
            private void m108451b(List<C29489b> list) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    arrayList.addAll(list);
                }
                arrayList.addAll(AbstractC29467a.this.f73590a);
                if (arrayList.size() == 0) {
                    AbstractC29467a.this.mo104344a((AbstractC29478a) null);
                } else {
                    AbstractC29467a.this.mo104351a((List<C29489b>) arrayList);
                }
            }
        });
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104348a(C29486a aVar) {
        C29489b a = C29490c.m108575a(aVar);
        if (a != null && !this.f73590a.contains(a)) {
            this.f73590a.add(a);
        }
    }

    /* renamed from: a */
    public void mo104351a(List<C29489b> list) {
        new BannerPriorityDecision(this).mo104330a(list, this);
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104352a(Map<String, String> map) {
        m108435b(map);
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104349a(String str, AbstractC29478a aVar) {
        this.f73592c.mo104343a(str, aVar);
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29479b
    /* renamed from: a */
    public void mo104350a(String str, AbstractC29483d dVar) {
        this.f73593d.mo104343a(str, dVar);
    }
}
