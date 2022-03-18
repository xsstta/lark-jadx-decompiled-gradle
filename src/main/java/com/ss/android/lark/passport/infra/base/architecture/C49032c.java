package com.ss.android.lark.passport.infra.base.architecture;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.AbstractC49137a;
import com.ss.android.lark.passport.infra.util.C49146ab;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.c */
public class C49032c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    private static C49032c f123091c;

    /* renamed from: a */
    private final List<AbstractC49036b> f123092a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private Context f123093b = null;

    /* renamed from: d */
    private final AtomicBoolean f123094d = new AtomicBoolean(false);

    /* renamed from: com.ss.android.lark.passport.infra.base.architecture.c$b */
    public interface AbstractC49036b extends AbstractC49137a {
        /* renamed from: a */
        void mo171206a();

        /* renamed from: b */
        String mo171207b();

        /* renamed from: c */
        JSONObject mo171208c();
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: com.ss.android.lark.passport.infra.base.architecture.c$a */
    public static class C49035a implements AbstractC49036b {

        /* renamed from: a */
        protected Activity f123097a;

        /* renamed from: b */
        private JSONObject f123098b;

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: c */
        public JSONObject mo171208c() {
            return this.f123098b;
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: a */
        public void mo171206a() {
            Activity activity = this.f123097a;
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // com.ss.android.lark.passport.infra.base.architecture.C49032c.AbstractC49036b
        /* renamed from: b */
        public String mo171207b() {
            return C49092f.m193534b(this.f123097a);
        }

        @Override // com.ss.android.lark.passport.infra.statistics.AbstractC49137a
        /* renamed from: k */
        public String mo171139k() {
            Activity activity = this.f123097a;
            if (activity != null) {
                return C49146ab.m193803a(activity.getIntent());
            }
            return "";
        }

        public C49035a(Activity activity) {
            Intent intent;
            Map map;
            this.f123097a = activity;
            if (activity != null) {
                intent = activity.getIntent();
            } else {
                intent = null;
            }
            if (!(intent == null || (map = (Map) intent.getSerializableExtra("step_info")) == null)) {
                this.f123098b = new JSONObject(map);
            }
            if (this.f123098b == null) {
                this.f123098b = new JSONObject();
            }
        }
    }

    private C49032c() {
    }

    /* renamed from: a */
    public static C49032c m193132a() {
        if (f123091c == null) {
            synchronized (C49032c.class) {
                if (f123091c == null) {
                    f123091c = new C49032c();
                }
            }
        }
        return f123091c;
    }

    /* renamed from: b */
    public Activity mo171196b() {
        for (AbstractC49036b bVar : this.f123092a) {
            if (bVar instanceof C49035a) {
                return ((C49035a) bVar).f123097a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo171198c() {
        if (this.f123093b == null) {
            PassportLog.f123351c.mo171474a().mo171471d("SigninActivityLifeCycle", "appContext is null. init error before?");
            return;
        }
        ArrayList<AbstractC49036b> arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(this.f123092a);
            this.f123092a.clear();
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Iterator it = arrayList.iterator();
        while (true) {
            JSONObject jSONObject = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC49036b bVar = (AbstractC49036b) it.next();
            String b = bVar != null ? bVar.mo171207b() : null;
            if (bVar != null) {
                jSONObject = bVar.mo171208c();
            }
            if (!TextUtils.isEmpty(b) && jSONObject != null) {
                linkedList.add(0, b);
                linkedList2.add(0, jSONObject);
            }
        }
        Iterator it2 = linkedList.iterator();
        Iterator it3 = linkedList2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            String str = (String) it2.next();
            JSONObject jSONObject2 = (JSONObject) it3.next();
            jSONObject2.put("start_cause_rebuild", (Object) true);
            C49092f.m193531a(this.f123093b, str, jSONObject2, RouterScene.ALL.value, (PassportLog) null, (AbstractC49336a) null);
        }
        for (AbstractC49036b bVar2 : arrayList) {
            Activity activity = bVar2 instanceof C49035a ? ((C49035a) bVar2).f123097a : null;
            if (activity != null) {
                activity.overridePendingTransition(R.anim.signin_sdk_fade_in, R.anim.signin_sdk_fade_out);
            }
            bVar2.mo171206a();
        }
    }

    /* renamed from: c */
    private boolean m193136c(Activity activity) {
        if ((activity instanceof BaseActivity) || mo171193a(activity)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo171197b(AbstractC49036b bVar) {
        if (bVar != null) {
            synchronized (this) {
                this.f123092a.remove(bVar);
            }
        }
    }

    /* renamed from: b */
    private AbstractC49036b m193134b(Activity activity) {
        for (AbstractC49036b bVar : this.f123092a) {
            if ((bVar instanceof C49035a) && ((C49035a) bVar).f123097a == activity) {
                return bVar;
            }
        }
        return null;
    }

    public void onActivityDestroyed(Activity activity) {
        if (m193136c(activity)) {
            synchronized (this) {
                AbstractC49036b b = m193134b(activity);
                if (b != null) {
                    this.f123092a.remove(b);
                }
            }
        }
    }

    /* renamed from: c */
    private void m193135c(AbstractC49036b bVar) {
        Activity activity;
        String str;
        if (bVar instanceof C49035a) {
            activity = ((C49035a) bVar).f123097a;
        } else {
            activity = null;
        }
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.AbstractC1010b() {
                /* class com.ss.android.lark.passport.infra.base.architecture.C49032c.C490331 */

                @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
                /* renamed from: b */
                public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    PassportLog a = PassportLog.f123351c.mo171474a();
                    a.mo171465b("SigninActivityLifeCycle", "onFragmentCreated " + fragment);
                    super.mo5406b(fragmentManager, fragment, bundle);
                }
            }, true);
            return;
        }
        if (activity != null) {
            str = activity.getClass().getSimpleName();
        } else {
            str = "null";
        }
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("SigninActivityLifeCycle", "statisticsAfterCreate activity not AppCompatActivity: " + str);
    }

    /* renamed from: a */
    public void mo171192a(AbstractC49036b bVar) {
        if (bVar != null) {
            synchronized (this) {
                this.f123092a.add(0, bVar);
            }
            m193135c(bVar);
        }
    }

    /* renamed from: a */
    public boolean mo171193a(Activity activity) {
        if (activity == null || !"H5TranslateProxyActivity".equals(activity.getClass().getSimpleName())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo171194a(Context context) {
        if (!this.f123094d.compareAndSet(false, true) || context == null) {
            return false;
        }
        Application application = null;
        if (context instanceof Application) {
            application = (Application) context;
        } else if (context.getApplicationContext() instanceof Application) {
            application = (Application) context.getApplicationContext();
        }
        if (application == null) {
            return false;
        }
        this.f123093b = application;
        application.registerActivityLifecycleCallbacks(this);
        return true;
    }

    /* renamed from: a */
    public synchronized boolean mo171195a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        LinkedList<AbstractC49036b> linkedList = new LinkedList();
        for (AbstractC49036b bVar : this.f123092a) {
            if (!TextUtils.equals(str, bVar.mo171207b())) {
                linkedList.add(0, bVar);
            } else if (linkedList.isEmpty()) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171471d("SigninActivityLifeCycle", "backTo " + str + ". current activity is " + str);
                return false;
            } else {
                LinkedList linkedList2 = new LinkedList(linkedList);
                linkedList2.remove(0);
                this.f123092a.removeAll(linkedList2);
                for (AbstractC49036b bVar2 : linkedList) {
                    bVar2.mo171206a();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m193133a(Activity activity, AbstractC49137a aVar) {
        String str;
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.AbstractC1010b() {
                /* class com.ss.android.lark.passport.infra.base.architecture.C49032c.C490342 */

                @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
                /* renamed from: b */
                public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    PassportLog a = PassportLog.f123351c.mo171474a();
                    a.mo171465b("SigninActivityLifeCycle", "onFragmentCreated " + fragment);
                    super.mo5406b(fragmentManager, fragment, bundle);
                }
            }, true);
            return;
        }
        if (activity != null) {
            str = activity.getClass().getSimpleName();
        } else {
            str = "null";
        }
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("SigninActivityLifeCycle", "statisticsAfterCreate activity not AppCompatActivity: " + str);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC49137a aVar;
        if (m193136c(activity)) {
            synchronized (this) {
                this.f123092a.add(0, new C49035a(activity));
                if (activity instanceof AbstractC49137a) {
                    aVar = (AbstractC49137a) activity;
                } else {
                    aVar = null;
                }
                m193133a(activity, aVar);
            }
        }
    }
}
