package com.bytedance.ee.bear.slide.common.font;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.slide.common.font.C11426f;
import com.bytedance.ee.bear.slide.common.font.C11428g;
import com.bytedance.ee.bear.slide.common.font.SlideDownloadFontInfoData;
import com.bytedance.ee.bear.thread.C11678b;
import com.larksuite.framework.utils.C26317s;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.slide.common.font.g */
public class C11428g implements C11426f.AbstractC11427a {

    /* renamed from: a */
    private ConnectionService f30728a;

    /* renamed from: b */
    private AbstractC11424d f30729b;

    /* renamed from: c */
    private Boolean f30730c;

    /* renamed from: d */
    private Handler f30731d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private AbstractC11429a f30732e;

    /* renamed from: f */
    private boolean f30733f;

    /* renamed from: g */
    private ArrayList<C11419a> f30734g = new ArrayList<>();

    /* renamed from: h */
    private long f30735h = 0;

    /* renamed from: i */
    private long f30736i = 0;

    /* renamed from: j */
    private boolean f30737j = false;

    /* renamed from: com.bytedance.ee.bear.slide.common.font.g$a */
    public interface AbstractC11429a {
        void downloadSuccess(String str);
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11426f.AbstractC11427a
    /* renamed from: a */
    public void mo43788a(C11419a aVar) {
        AbstractC11429a aVar2 = this.f30732e;
        if (aVar2 != null) {
            aVar2.downloadSuccess(aVar.mo43748e());
        }
        if (this.f30734g.remove(aVar)) {
            this.f30736i += Long.valueOf(aVar.mo43743c()).longValue();
        }
        if (!this.f30733f) {
            long j = this.f30736i;
            long j2 = this.f30735h;
            if (j >= j2 && j2 > 0) {
                this.f30731d.post(new Runnable() {
                    /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$bwWRiNdLa6G2Wl5MLdFtUAZFyYw */

                    public final void run() {
                        C11428g.this.m47534d();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11426f.AbstractC11427a
    /* renamed from: a */
    public void mo43790a(List<C11419a> list) {
        ArrayList arrayList = new ArrayList();
        for (C11419a aVar : list) {
            if (this.f30734g.contains(aVar)) {
                arrayList.add(aVar);
            }
        }
        if (list.containsAll(this.f30734g)) {
            this.f30731d.post(new Runnable(arrayList) {
                /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$XuNRc5_S7T1rxVswbLHyiU5gB1c */
                public final /* synthetic */ ArrayList f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C11428g.this.m47532a((C11428g) this.f$1);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11426f.AbstractC11427a
    /* renamed from: a */
    public void mo43789a(String str) {
        if (!this.f30737j) {
            this.f30737j = true;
            Toast.showText(this.f30729b.getContext(), this.f30729b.getContext().getText(R.string.Slide_Slide_FontZipError), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m47534d() {
        this.f30729b.mo43522q();
    }

    /* renamed from: c */
    public void mo43795c() {
        C11426f.m47502c().mo43778a(this);
    }

    /* renamed from: b */
    public void mo43793b() {
        if (this.f30728a.mo20038b().mo20041b()) {
            this.f30733f = false;
            C11426f.m47502c().mo43781a(this.f30734g, this);
        }
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11426f.AbstractC11427a
    /* renamed from: a */
    public void mo43786a() {
        if (!this.f30733f) {
            this.f30729b.mo43514a(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47530a(long j) {
        if (j >= 0 && j < 100) {
            this.f30729b.mo43514a((int) j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m47536e(List list) {
        if (this.f30728a.mo20038b().mo20041b()) {
            this.f30729b.mo43515a(this.f30735h, list);
        }
    }

    /* renamed from: a */
    public static C11419a m47528a(SlideDownloadFontInfoData.Config config) {
        if (config == null) {
            return null;
        }
        C11419a aVar = new C11419a();
        aVar.mo43747d(config.getKey());
        aVar.mo43749e(config.getMd5());
        aVar.mo43742b(config.getSize());
        aVar.mo43744c(config.getType());
        aVar.mo43740a(config.getUrl());
        aVar.mo43739a(config.getPriority());
        return aVar;
    }

    /* renamed from: c */
    public static List<C11419a> m47533c(List<SlideDownloadFontInfoData.Config> list) {
        if (C26317s.m95316a(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (SlideDownloadFontInfoData.Config config : list) {
            arrayList.add(m47528a(config));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public void mo43794b(List<C11419a> list) {
        if (this.f30728a.mo20038b().mo20041b()) {
            this.f30734g.addAll(list);
            this.f30733f = false;
            C11426f.m47502c().mo43781a(this.f30734g, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47532a(ArrayList arrayList) {
        if (this.f30728a.mo20038b().mo20041b()) {
            this.f30734g = arrayList;
            if (!this.f30733f) {
                this.f30729b.mo43520o();
            }
        } else if (!this.f30733f) {
            this.f30729b.mo43521p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m47535d(List list) throws Exception {
        if (!C26317s.m95316a(list)) {
            List<C11419a> c = m47533c(list);
            this.f30735h = C11420b.m47453d(c);
            if (this.f30728a.mo20038b().mo20042c() && !this.f30730c.booleanValue()) {
                this.f30734g.addAll(c);
                this.f30733f = true;
                C11426f.m47502c().mo43782a(this.f30734g, this, true);
            } else if (this.f30735h < 1024) {
                this.f30734g.addAll(c);
                this.f30733f = true;
                C11426f.m47502c().mo43781a(this.f30734g, this);
            } else if (!C11426f.m47502c().mo43783a(c)) {
                this.f30731d.post(new Runnable(c) {
                    /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$ft_ctXXrBruUJWsvA7QhbdbthUk */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C11428g.this.m47536e(this.f$1);
                    }
                });
            } else {
                this.f30734g.addAll(c);
                this.f30733f = false;
                C11426f.m47502c().mo43781a(this.f30734g, this);
            }
        }
    }

    public C11428g(ConnectionService connectionService, AbstractC11424d dVar) {
        this.f30728a = connectionService;
        this.f30729b = dVar;
        this.f30730c = (Boolean) new PersistenceSharedPreference("debug_config").mo34038b("font_download_hint_enable", Boolean.FALSE);
    }

    /* renamed from: a */
    public List<SlideDownloadFontInfoData.Config> m47529a(List<SlideDownloadFontInfoData.Config> list, AbstractC11429a aVar) {
        if (C26317s.m95316a(list)) {
            return list;
        }
        Iterator<SlideDownloadFontInfoData.Config> it = list.iterator();
        while (it.hasNext()) {
            SlideDownloadFontInfoData.Config next = it.next();
            if (TextUtils.isEmpty(next.getType())) {
                next.setType("1");
            }
            int b = C11426f.m47502c().mo43784b(m47528a(next));
            if (b != 0) {
                if (b == 2) {
                    aVar.downloadSuccess(next.getKey());
                    it.remove();
                }
            } else if (!this.f30728a.mo20038b().mo20041b()) {
                it.remove();
            } else if ((this.f30728a.mo20038b().mo20043d() || this.f30730c.booleanValue()) && !next.isCurrentSlide()) {
                it.remove();
            }
        }
        return list;
    }

    @Override // com.bytedance.ee.bear.slide.common.font.C11426f.AbstractC11427a
    /* renamed from: a */
    public void mo43787a(long j, C11419a aVar) {
        if (this.f30734g.contains(aVar) && !this.f30733f) {
            this.f30731d.post(new Runnable((((j / 1024) + this.f30736i) * 100) / this.f30735h) {
                /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$oURmvcR05PwQB_eufdoIkeDauQ */
                public final /* synthetic */ long f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C11428g.this.m47530a((C11428g) this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo43792a(SlideDownloadFontInfoData slideDownloadFontInfoData, AbstractC11429a aVar) {
        List<SlideDownloadFontInfoData.Config> config = slideDownloadFontInfoData.getConfig();
        this.f30732e = aVar;
        AbstractC68307f.m265083a((Object) config).mo238020d(new Function(aVar) {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$zbDc4tjli6PEHxuPmRLOwD8HknU */
            public final /* synthetic */ C11428g.AbstractC11429a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11428g.this.m47529a(this.f$1, (List) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.slide.common.font.$$Lambda$g$A520xVIJaIqQeOOhfbVAbO8Q7Dg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C11428g.this.m47535d((List) obj);
            }
        }, $$Lambda$g$b09YTPoC9mOKSPAfN4zrfpgnU3U.INSTANCE);
    }
}
