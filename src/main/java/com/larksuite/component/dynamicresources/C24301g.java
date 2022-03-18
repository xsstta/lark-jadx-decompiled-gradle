package com.larksuite.component.dynamicresources;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.dynamicresources.g */
public class C24301g {

    /* renamed from: i */
    private static volatile C24301g f59969i;

    /* renamed from: j */
    private static final Set<Class> f59970j = new HashSet(Arrays.asList(String.class, Integer.class, Long.class, Short.class, Character.class, Byte.class, Float.class, Double.class));

    /* renamed from: a */
    public DynamicResourcesImpl f59971a;

    /* renamed from: b */
    public Map<Activity, Resources> f59972b = new WeakHashMap();

    /* renamed from: c */
    public volatile String f59973c = "";

    /* renamed from: d */
    public volatile String f59974d = "";

    /* renamed from: e */
    private WeakHashMap<View, Set<AbstractC24313l>> f59975e = new WeakHashMap<>();

    /* renamed from: f */
    private WeakHashMap<View, AbstractC24313l> f59976f = new WeakHashMap<>();

    /* renamed from: g */
    private List<AbstractC24313l> f59977g = new ArrayList();

    /* renamed from: h */
    private List<AbstractC24312k> f59978h = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo86997b() {
        return this.f59973c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo86998c() {
        return this.f59974d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<AbstractC24313l> mo87000e() {
        return this.f59977g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T extends View> void mo86994a(Context context, T t, AbstractC24313l<T> lVar) {
        m88709a(t, "addDynamicResourcesSupport view ");
        m88709a(lVar, "addDynamicResourcesSupport dynamicResourcesSupport ");
        m88708a(lVar);
        lVar.mo87006a(t, mo86992a(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo86996a(int i) {
        DynamicResourcesImpl dynamicResourcesImpl = this.f59971a;
        if (dynamicResourcesImpl == null || dynamicResourcesImpl.mo86914a(i) == 0 || this.f59971a.mo86916c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC24311j mo86992a(Context context) {
        Resources resources = context.getResources();
        if (resources instanceof DynamicResourcesImpl) {
            resources = ((DynamicResourcesImpl) resources).mo86915b();
        }
        if (TextUtils.isEmpty(mo86998c())) {
            return new DynamicResourcesImpl(resources, resources, this.f59974d);
        }
        if (context instanceof Activity) {
            return (AbstractC24311j) mo86989a((Activity) context, resources);
        }
        if (context instanceof Application) {
            return (AbstractC24311j) mo86990a((Application) context, resources);
        }
        return new DynamicResourcesImpl(resources, mo86991a(context, resources), this.f59974d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo86999d() {
        return !mo86998c().isEmpty();
    }

    /* renamed from: a */
    static C24301g m88706a() {
        if (f59969i == null) {
            synchronized (C24301g.class) {
                if (f59969i == null) {
                    f59969i = new C24301g();
                }
            }
        }
        return f59969i;
    }

    /* renamed from: f */
    public void mo87001f() {
        C24300f fVar = new C24300f(this.f59973c);
        for (AbstractC24312k kVar : this.f59978h) {
            kVar.mo87008a(fVar);
        }
    }

    private C24301g() {
        Log.m165389i("DynamicResourcesManager", "DynamicResourcesManager <init>");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.dynamicresources.g$a */
    public static class C24304a extends RuntimeException {
        C24304a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public void mo86993a(Activity activity) {
        this.f59972b.remove(activity);
    }

    /* renamed from: a */
    private static boolean m88710a(Class cls) {
        if (cls.isPrimitive()) {
            return true;
        }
        return f59970j.contains(cls);
    }

    /* renamed from: a */
    private static void m88708a(AbstractC24313l lVar) {
        Class<?> componentType;
        if (DynamicResourcesFacade.f59931a && lVar.mo87007a()) {
            for (Constructor<?> constructor : lVar.getClass().getDeclaredConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                for (Class<?> cls : parameterTypes) {
                    Log.m165379d("DynamicResources", "checkRefLeakIfNeed, paramType = " + cls.getName());
                    if (!m88710a(cls) && ((!cls.isArray() || (componentType = cls.getComponentType()) == null || !m88710a(componentType)) && cls != WeakReference.class)) {
                        throw new C24304a("dynamicResourcesSupport : " + lVar + " has refer to " + cls.getName() + " that may be leaked. pls use WeakRefernce,  or it can not leak, you can override IDynamicResourcesSupport.checkRefLeak() and let it return false to skip check.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m88707a(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getApplicationContext().getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.packageName;
        }
        Log.m165383e("DynamicResourcesManager", "pkg info is null !!!");
        return "";
    }

    /* renamed from: a */
    private static void m88709a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str + " must not be null");
        }
    }

    /* renamed from: a */
    public Resources mo86989a(Activity activity, Resources resources) {
        if (TextUtils.isEmpty(mo86997b())) {
            return resources;
        }
        if (!this.f59972b.containsKey(activity)) {
            Log.m165389i("DynamicResourcesManager", "create dynamicResources resources for " + activity);
            DynamicResourcesImpl dynamicResourcesImpl = new DynamicResourcesImpl(resources, mo86991a((Context) activity, resources), this.f59974d);
            dynamicResourcesImpl.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
            this.f59972b.put(activity, dynamicResourcesImpl);
        }
        return this.f59972b.get(activity);
    }

    /* renamed from: a */
    public Resources mo86990a(Application application, Resources resources) {
        if (TextUtils.isEmpty(mo86997b())) {
            return resources;
        }
        DynamicResourcesImpl dynamicResourcesImpl = this.f59971a;
        if (dynamicResourcesImpl == null || dynamicResourcesImpl.mo86915b() != resources) {
            Log.m165389i("DynamicResourcesManager", "create dynamicResources resources for " + application);
            this.f59971a = new DynamicResourcesImpl(resources, mo86991a((Context) application, resources), this.f59974d);
        }
        return this.f59971a;
    }

    /* renamed from: a */
    public Resources mo86991a(Context context, Resources resources) {
        String b = mo86997b();
        if (TextUtils.isEmpty(b)) {
            return resources;
        }
        C24305h.m88729a("DynamicResources_getDynamicResources", "");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(b, 0);
            packageArchiveInfo.applicationInfo.sourceDir = b;
            packageArchiveInfo.applicationInfo.publicSourceDir = b;
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageArchiveInfo.applicationInfo);
            C24305h.m88730b("DynamicResources_getDynamicResources", "");
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m165379d("simple_test_getDynamicResources", (currentTimeMillis2 - currentTimeMillis) + " ms");
            return new Resources(resourcesForApplication.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165383e("DynamicResources_getDynamicResources", e.toString());
            C24305h.m88730b("DynamicResources_getDynamicResources", "");
            return resources;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo86995a(Context context, String str, DynamicResourcesFacade.ChangeResourcesExecutor changeResourcesExecutor) {
        m88711b(context, str, changeResourcesExecutor);
    }

    /* renamed from: b */
    private void m88711b(final Context context, final String str, DynamicResourcesFacade.ChangeResourcesExecutor changeResourcesExecutor) {
        changeResourcesExecutor.execute(new DynamicResourcesFacade.ChangeResourcesExecutor.AbstractC24276b<AbstractC24311j>() {
            /* class com.larksuite.component.dynamicresources.C24301g.C243021 */

            /* renamed from: b */
            public AbstractC24311j mo86913a() {
                C24301g.this.f59973c = str;
                C24301g.this.f59974d = C24301g.m88707a(context, str);
                C24301g.this.f59972b.clear();
                C24301g.this.f59971a = null;
                DynamicResourcesImpl.m88640a();
                return C24301g.this.mo86992a(context);
            }
        }, new DynamicResourcesFacade.ChangeResourcesExecutor.AbstractC24275a<AbstractC24311j>() {
            /* class com.larksuite.component.dynamicresources.C24301g.C243032 */

            /* renamed from: a */
            public void mo86912a(AbstractC24311j jVar) {
                C24301g.this.mo87001f();
            }
        });
    }
}
