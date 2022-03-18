package com.ss.android.lark.mail.impl.service;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService;
import com.ss.android.lark.mail.impl.utils.C43849u;
import ee.android.framework.manis.C68183b;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.mail.impl.service.c */
public class C43345c {

    /* renamed from: a */
    public boolean f110160a;

    /* renamed from: b */
    private AbstractC41849c.AbstractC41852c f110161b;

    /* renamed from: c */
    private AbstractC41849c.AbstractC41862m f110162c;

    /* renamed from: d */
    private boolean f110163d;

    /* renamed from: e */
    private boolean f110164e;

    /* renamed from: f */
    private int f110165f;

    /* renamed from: g */
    private boolean f110166g;

    /* renamed from: h */
    private int f110167h;

    /* renamed from: i */
    private List<AbstractC43349b> f110168i;

    /* renamed from: j */
    private List<AbstractC41849c.AbstractC41862m> f110169j;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.c$a */
    public static class C43348a {

        /* renamed from: a */
        public static C43345c f110173a = new C43345c();
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.c$b */
    public interface AbstractC43349b {
        /* renamed from: a */
        void mo152845a(boolean z);

        /* renamed from: b */
        void mo152846b(boolean z);
    }

    /* renamed from: m */
    public static C43345c m172076m() {
        return C43348a.f110173a;
    }

    /* renamed from: b */
    public boolean mo154996b() {
        return this.f110160a;
    }

    /* renamed from: c */
    public boolean mo154997c() {
        return this.f110163d;
    }

    /* renamed from: d */
    public boolean mo154998d() {
        return this.f110164e;
    }

    /* renamed from: e */
    public boolean mo154999e() {
        return this.f110166g;
    }

    /* renamed from: a */
    public void mo154989a() {
        C41816b.m166115a().mo150117G().mo150193a(this.f110161b);
        C41816b.m166115a().mo150117G().mo150194a(this.f110162c);
    }

    private C43345c() {
        this.f110161b = new AbstractC41849c.AbstractC41852c() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$c$PEhq7XVu8siSKb7CAtA0J8VR7hM */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41852c
            public final void updateLifecycleState(boolean z) {
                C43345c.this.m172075b((C43345c) z);
            }
        };
        this.f110162c = new AbstractC41849c.AbstractC41862m() {
            /* class com.ss.android.lark.mail.impl.service.$$Lambda$D2VwbJmFhB4EwikAQDVit6LyvPo */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41862m
            public final void onLanguageChangeListener(Locale locale) {
                C43345c.this.mo154992a(locale);
            }
        };
        this.f110160a = false;
        this.f110163d = false;
        this.f110164e = false;
        this.f110165f = 0;
        this.f110166g = false;
        this.f110167h = 0;
        this.f110168i = new CopyOnWriteArrayList();
        this.f110169j = new CopyOnWriteArrayList();
    }

    /* renamed from: n */
    private void m172077n() {
        boolean z;
        if (this.f110167h > 0 || this.f110163d) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f110166g) {
            Log.m165389i("AppLifecycleService", "notifyMailPageActiveChange pageActive=" + z);
            for (AbstractC43349b bVar : this.f110168i) {
                bVar.mo152846b(z);
            }
            this.f110166g = z;
        }
    }

    /* renamed from: f */
    public void mo155000f() {
        boolean z;
        if (!this.f110160a || !this.f110163d) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f110164e) {
            for (AbstractC43349b bVar : this.f110168i) {
                bVar.mo152845a(z);
            }
            this.f110164e = z;
        }
    }

    /* renamed from: g */
    public void mo155001g() {
        if (!mo155004j()) {
            C41988g.m166975f();
        }
        for (AbstractC41849c.AbstractC41862m mVar : this.f110169j) {
            mVar.onLanguageChangeListener(C41816b.m166115a().mo150146m());
        }
    }

    /* renamed from: h */
    public void mo155002h() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            this.f110165f++;
        } else {
            ((IAppLifecycleService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAppLifecycleService.class)).entranceCompose();
        }
    }

    /* renamed from: i */
    public void mo155003i() {
        if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
            this.f110165f--;
        } else {
            ((IAppLifecycleService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAppLifecycleService.class)).exitCompose();
        }
    }

    /* renamed from: j */
    public boolean mo155004j() {
        if (C41816b.m166115a().mo150120a() != C43213b.f109974a) {
            return ((IAppLifecycleService) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IAppLifecycleService.class)).isComposeRunning();
        }
        if (this.f110165f > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo155005k() {
        if (this.f110167h < 0) {
            this.f110167h = 0;
        }
        this.f110167h++;
        Log.m165389i("AppLifecycleService", "update activity count: " + this.f110167h);
        m172077n();
    }

    /* renamed from: l */
    public void mo155006l() {
        this.f110167h--;
        Log.m165389i("AppLifecycleService", "update activity count: " + this.f110167h);
        m172077n();
    }

    /* renamed from: b */
    public void mo154994b(AbstractC41849c.AbstractC41862m mVar) {
        if (mVar != null) {
            this.f110169j.remove(mVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m172075b(final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43345c.RunnableC433461 */

            public void run() {
                Log.m165389i("AppLifecycleService", "onLifeCycleChange: " + z);
                C43345c.this.f110160a = z;
                C43345c.this.mo155000f();
            }
        });
    }

    /* renamed from: a */
    public void mo154990a(AbstractC41849c.AbstractC41862m mVar) {
        if (mVar != null && !this.f110169j.contains(mVar)) {
            this.f110169j.add(mVar);
        }
    }

    /* renamed from: b */
    public void mo154995b(AbstractC43349b bVar) {
        if (bVar != null) {
            this.f110168i.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo154991a(AbstractC43349b bVar) {
        if (bVar != null && !this.f110168i.contains(bVar)) {
            this.f110168i.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo154992a(Locale locale) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43345c.RunnableC433472 */

            public void run() {
                C43345c.this.mo155001g();
            }
        });
    }

    /* renamed from: a */
    public void mo154993a(boolean z) {
        Log.m165389i("AppLifecycleService", "updateMailTabSelected: " + z);
        if (this.f110163d == z) {
            Log.m165389i("AppLifecycleService", "updateMailTabSelected, ignore");
            return;
        }
        this.f110163d = z;
        if (!z && this.f110167h > 0) {
            Log.m165389i("AppLifecycleService", "fix the activity count to 0 after leave mail tab");
            this.f110167h = 0;
        }
        mo155000f();
        m172077n();
    }
}
