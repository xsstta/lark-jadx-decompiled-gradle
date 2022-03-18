package com.bytedance.ee.bear.basesdk.services.p254a;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.ee.bear.basesdk.p251b.C4443a;
import com.bytedance.ee.bear.basesdk.services.p254a.C4499c;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.document.offline.p316c.C5914a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.middleground.feed.p453a.C9423f;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.basesdk.services.a.b */
public class C4493b implements AbstractC10740f {

    /* renamed from: a */
    public Application f13165a;

    /* renamed from: b */
    public WeakReference<Activity> f13166b;

    /* renamed from: c */
    private C4499c f13167c;

    /* renamed from: d */
    private Intent f13168d;

    /* renamed from: e */
    private final HashMap<String, AbstractC10740f.AbstractC10742b> f13169e = new HashMap<>();

    /* renamed from: f */
    private AbstractC10740f.AbstractC10741a f13170f;

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: c */
    public Intent mo17297c() {
        return this.f13168d;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.services.a.b$b */
    public class C4496b implements PostCard {

        /* renamed from: b */
        private Intent f13173b;

        /* renamed from: c */
        private int f13174c = -1;

        /* renamed from: d */
        private int f13175d = -1;

        /* renamed from: e */
        private int f13176e = -1;

        /* renamed from: f */
        private boolean f13177f;

        /* renamed from: g */
        private boolean f13178g;

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public void mo17317a() {
            Context context;
            Activity activity = C4493b.this.f13166b != null ? C4493b.this.f13166b.get() : null;
            if (activity == null || activity.isFinishing()) {
                C13479a.m54772d("RouteServiceImp", "Activity is null when navigate.");
                context = C4493b.this.f13165a;
                this.f13173b.setFlags(268435456);
            } else {
                context = activity;
            }
            C4493b.this.mo17289a(this.f13173b);
            int i = this.f13176e;
            if (i != -1 && (context instanceof Activity)) {
                ((Activity) context).startActivityForResult(this.f13173b, i);
            } else if (this.f13178g) {
                try {
                    this.f13173b.addFlags(268435456);
                    PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), this.f13173b, 134217728).send();
                } catch (PendingIntent.CanceledException unused) {
                    context.startActivity(this.f13173b);
                }
            } else {
                context.startActivity(this.f13173b);
            }
            int i2 = this.f13174c;
            if (!(i2 == -1 || activity == null)) {
                activity.overridePendingTransition(i2, R.anim.facade_hold);
            }
            if (this.f13177f && activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17314a(String str, String str2) {
            this.f13173b.putExtra(str, str2);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17316a(String str, boolean z) {
            this.f13173b.putExtra(str, z);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17315a(String str, ArrayList<? extends Parcelable> arrayList) {
            this.f13173b.putExtra(str, arrayList);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: b */
        public PostCard mo17318b(int i) {
            this.f13176e = i;
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17305a(int i) {
            this.f13173b.setFlags(i);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17307a(Bundle bundle) {
            if (bundle != null) {
                this.f13173b.putExtras(bundle);
            }
            return this;
        }

        public C4496b(Intent intent) {
            this.f13173b = intent;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17306a(int i, int i2) {
            this.f13174c = i;
            this.f13175d = i2;
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17308a(String str, int i) {
            this.f13173b.putExtra(str, i);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17309a(String str, long j) {
            this.f13173b.putExtra(str, j);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17310a(String str, Bundle bundle) {
            this.f13173b.putExtra(str, bundle);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17311a(String str, Parcelable parcelable) {
            this.f13173b.putExtra(str, parcelable);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17312a(String str, Serializable serializable) {
            this.f13173b.putExtra(str, serializable);
            return this;
        }

        @Override // com.bytedance.ee.bear.route.PostCard
        /* renamed from: a */
        public PostCard mo17313a(String str, CharSequence charSequence) {
            this.f13173b.putExtra(str, charSequence);
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.services.a.b$d */
    public static class C4498d implements AbstractC10740f.AbstractC10742b {

        /* renamed from: a */
        private Context f13180a;

        /* renamed from: b */
        private Class<? extends Activity> f13181b;

        @Override // com.bytedance.ee.bear.route.AbstractC10740f.AbstractC10742b
        /* renamed from: a */
        public Intent mo17320a() {
            return new Intent(this.f13180a, this.f13181b);
        }

        public C4498d(Context context, Class<? extends Activity> cls) {
            this.f13180a = context;
            this.f13181b = cls;
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17287a() {
        mo17295b("/doc/default/route").mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: b */
    public Activity mo17294b() {
        WeakReference<Activity> weakReference = this.f13166b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo17289a(Intent intent) {
        this.f13168d = intent;
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.services.a.b$a */
    private class C4495a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private C4495a() {
        }

        public void onActivityResumed(Activity activity) {
            C4493b.this.f13166b = new WeakReference<>(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            if (C4493b.this.f13166b != null && activity == C4493b.this.f13166b.get()) {
                C4493b.this.f13166b = new WeakReference<>(null);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.services.a.b$c */
    public static class C4497c implements C4499c.AbstractC4500a {

        /* renamed from: a */
        private C10917c f13179a;

        public C4497c(C10917c cVar) {
            this.f13179a = cVar;
        }

        @Override // com.bytedance.ee.bear.basesdk.services.p254a.C4499c.AbstractC4500a
        /* renamed from: a */
        public void mo17319a(BearUrl bearUrl, RouteBean routeBean) {
            C9423f.m38998a(this.f13179a, bearUrl, routeBean, C5914a.m23807a());
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17290a(AbstractC10738c cVar) {
        this.f13167c.mo17323a(cVar);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: b */
    public void mo17296b(AbstractC10738c cVar) {
        this.f13167c.mo17326b(cVar);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17288a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            this.f13166b = new WeakReference<>(activity);
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17292a(String str) {
        mo17293a(str, null);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: b */
    public PostCard mo17295b(String str) {
        if (this.f13169e.get(str) != null) {
            return new C4496b(this.f13169e.get(str).mo17320a());
        }
        C13479a.m54758a("RouteServiceImp", "build: can't find activity, url = " + C13598b.m55197d(str));
        return null;
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17291a(AbstractC10740f.AbstractC10741a aVar) {
        this.f13170f = aVar;
        Application application = C13615c.f35773a;
        this.f13165a = application;
        application.registerActivityLifecycleCallbacks(new C4495a());
        C10917c a = ar.m20936a();
        this.f13169e.putAll(this.f13170f.mo30547a());
        C4499c cVar = new C4499c(this.f13170f.mo30548b());
        this.f13167c = cVar;
        cVar.mo17324a(a);
        this.f13167c.mo17321a(new C4497c(a));
        C13479a.m54764b("RouteServiceImp", "Init ");
        C4443a.m18373b();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10740f
    /* renamed from: a */
    public void mo17293a(String str, RouteBean routeBean) {
        if (this.f13169e.get(str) != null) {
            Intent a = this.f13169e.get(str).mo17320a();
            a.putExtra("extra_intent_data", routeBean);
            new C4496b(a).mo17317a();
            return;
        }
        this.f13167c.mo17325a(str, routeBean);
    }
}
