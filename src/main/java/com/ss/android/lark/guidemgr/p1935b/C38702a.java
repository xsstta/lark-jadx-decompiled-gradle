package com.ss.android.lark.guidemgr.p1935b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.C0844e;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.guidemgr.C38700a;
import com.ss.android.lark.guidemgr.lock.GuideLock;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;
import com.ss.android.lark.guidemgr.p1934a.AbstractC38701a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38709b;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38711a;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import com.ss.android.lark.guidemgr.p1935b.p1939d.C38713a;
import com.ss.android.lark.guidemgr.p1935b.p1940e.C38716a;
import com.ss.android.lark.guidemgr.p1935b.p1941f.C38720a;
import com.ss.android.lark.guidemgr.p1945e.C38725a;
import com.ss.android.lark.guidemgr.p1946f.C38729c;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.guidemgr.b.a */
public class C38702a {

    /* renamed from: a */
    public final Map<String, C38712b> f99565a;

    /* renamed from: b */
    public final AtomicInteger f99566b;

    /* renamed from: c */
    IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>> f99567c;

    /* renamed from: d */
    private final Map<String, C38708a> f99568d;

    /* renamed from: e */
    private final GuideLock f99569e;

    /* renamed from: f */
    private Gson f99570f;

    /* renamed from: g */
    private long f99571g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guidemgr.b.a$a */
    public static class C38706a {

        /* renamed from: a */
        public static final C38702a f99576a = new C38702a();
    }

    /* renamed from: lambda$8KTJkOncz5JfnqC_HfAdnC-uVrE  reason: not valid java name */
    public static /* synthetic */ void m270568lambda$8KTJkOncz5JfnqC_HfAdnCuVrE(C38702a aVar) {
        aVar.m152867g();
    }

    public static /* synthetic */ void lambda$AhhEhbuaMd4UHj4CK4DEgfHxjbg(C38702a aVar) {
        aVar.m152874l();
    }

    public static /* synthetic */ void lambda$K0Aw2g05aNc4hXDwBOKFgmapbNI(C38702a aVar, String str, Context context) {
        aVar.m152858b(str, context);
    }

    public static /* synthetic */ void lambda$SzhT_FeJ8VLW3MldMvXyRP9Kt0g(C38702a aVar, Context context, String str) {
        aVar.m152854a(context, str);
    }

    public static /* synthetic */ void lambda$ZqCuCxUfWt4JEEEU3iEfSJBPzf8(C38702a aVar, Map map) {
        aVar.m152863d(map);
    }

    /* renamed from: f */
    public static C38702a m152865f() {
        return C38706a.f99576a;
    }

    /* renamed from: a */
    public boolean mo141846a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f99569e.mo141899c(str)) {
            Log.m165389i("GuideManager", "checkToShow: " + str + " isLocked");
            return false;
        }
        C38712b bVar = this.f99565a.get(str);
        if (bVar == null) {
            return false;
        }
        return !bVar.mo141875d();
    }

    /* renamed from: a */
    public boolean mo141848a(List<String> list, C38708a aVar) {
        m152872j();
        ArrayList arrayList = new ArrayList();
        C38711a aVar2 = null;
        for (String str : list) {
            C38712b bVar = this.f99565a.get(str);
            if (bVar != null && !bVar.mo141875d()) {
                aVar2 = bVar.mo141874c();
                arrayList.add(bVar);
            } else if (bVar == null) {
                Log.m165397w("GuideManager", "there is no guideKey:" + str);
            }
        }
        if (aVar2 == null || arrayList.isEmpty()) {
            return false;
        }
        C38720a.m152926c().mo141889a(aVar2, arrayList);
        return m152861b(list, aVar);
    }

    /* renamed from: a */
    public boolean mo141847a(String str, C38708a aVar) {
        Log.m165389i("GuideManager", "startGuide:" + str);
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (this.f99569e.mo141899c(str)) {
                Log.m165389i("GuideManager", "checkToShow: " + str + " isLocked");
                return false;
            }
            m152872j();
            C38712b bVar = this.f99565a.get(str);
            if (bVar != null && !bVar.mo141875d()) {
                C38720a.m152926c().mo141890a(bVar);
                return m152860b(str, aVar);
            } else if (bVar == null) {
                Log.m165397w("GuideManager", "there is no guideKey:" + str);
            }
        }
        return false;
    }

    /* renamed from: l */
    private /* synthetic */ void m152874l() {
        m152862c(this.f99565a);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void m152873k() {
        C38725a.m152943b().mo141901a(this.f99565a);
    }

    /* renamed from: h */
    private void m152868h() {
        this.f99566b.set(0);
        C38713a.m152914a().mo141879a(this.f99567c);
        C38713a.m152914a().mo141881b();
        m152871i();
    }

    private C38702a() {
        this.f99565a = new ConcurrentHashMap();
        this.f99568d = new ConcurrentHashMap();
        this.f99566b = new AtomicInteger(-1);
        this.f99569e = new GuideLock();
        this.f99570f = new Gson();
        this.f99571g = 0;
        this.f99567c = new IGetDataCallback<List<C0844e<C38711a, List<C38712b>>>>() {
            /* class com.ss.android.lark.guidemgr.p1935b.C38702a.C387031 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<C0844e<C38711a, List<C38712b>>> list) {
                HashMap hashMap;
                C38712b bVar;
                C38702a.this.f99566b.set(3);
                if (list != null) {
                    HashMap hashMap2 = new HashMap(C38702a.this.f99565a);
                    HashMap hashMap3 = new HashMap();
                    boolean isEmpty = hashMap2.isEmpty();
                    for (C0844e<C38711a, List<C38712b>> eVar : list) {
                        if (!(eVar.f3317a == null || eVar.f3318b == null || eVar.f3318b.isEmpty())) {
                            for (C38712b bVar2 : eVar.f3318b) {
                                if (bVar2 == null || TextUtils.isEmpty(bVar2.mo141871a())) {
                                    hashMap = hashMap2;
                                } else {
                                    boolean z = false;
                                    if (isEmpty || (bVar = (C38712b) hashMap2.get(bVar2.mo141871a())) == null) {
                                        hashMap = hashMap2;
                                    } else {
                                        hashMap = hashMap2;
                                        hashMap3.put(bVar2.mo141871a(), new C38712b(bVar2.mo141871a(), bVar2.mo141873b(), eVar.f3317a, bVar.mo141875d()));
                                        z = true;
                                    }
                                    if (!z) {
                                        hashMap3.put(bVar2.mo141871a(), new C38712b(bVar2.mo141871a(), bVar2.mo141873b(), eVar.f3317a, false));
                                    }
                                }
                                hashMap2 = hashMap;
                            }
                        }
                        hashMap2 = hashMap2;
                    }
                    C38702a.this.mo141845a(hashMap3);
                }
            }
        };
    }

    /* renamed from: j */
    private void m152872j() {
        if (this.f99565a.isEmpty() && this.f99566b.get() < 2) {
            Log.m165397w("GuideManager", "GuideConfig is empty, and checkStatus is:" + this.f99566b.get());
        }
    }

    /* renamed from: e */
    public void mo141855e() {
        this.f99566b.set(-1);
        C38720a.m152926c().mo141891b();
        this.f99565a.clear();
        this.f99568d.clear();
        C38713a.m152914a().mo141882b(this.f99567c);
        this.f99569e.mo141897b();
    }

    /* renamed from: g */
    private void m152867g() {
        AbstractC38701a a = C38700a.m152832a();
        if (a != null && a.mo141834a() != null) {
            Context a2 = a.mo141834a();
            Log.m165389i("GuideManager", "init in process: " + C26252ad.m94992a(a2));
            IGuideMgrProxy iGuideMgrProxy = (IGuideMgrProxy) C68183b.m264839a().mo237086a(a2, IGuideMgrProxy.class);
            if (iGuideMgrProxy != null) {
                iGuideMgrProxy.registerOnGuideChangeListener(new IGuideMgrProxy.OnGuideChangeListener(a2) {
                    /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$SzhT_FeJ8VLW3MldMvXyRP9Kt0g */
                    public final /* synthetic */ Context f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy.OnGuideChangeListener
                    public final void onGuideChanged(String str) {
                        C38702a.lambda$SzhT_FeJ8VLW3MldMvXyRP9Kt0g(C38702a.this, this.f$1, str);
                    }
                });
                iGuideMgrProxy.fetchFromMainProcess();
            }
        }
    }

    /* renamed from: i */
    private void m152871i() {
        Map<String, C38712b> a;
        if (this.f99565a.isEmpty() && (a = C38725a.m152943b().mo141900a()) != null && !a.isEmpty() && this.f99565a.isEmpty()) {
            this.f99565a.putAll(a);
            this.f99566b.set(2);
        }
    }

    /* renamed from: c */
    public void mo141851c() {
        AbstractC38701a a = C38700a.m152832a();
        if (a != null && a.mo141834a() != null && C26252ad.m94993b(a.mo141834a())) {
            Log.m165389i("GuideManager", "fetchFromMainProcess");
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$AhhEhbuaMd4UHj4CK4DEgfHxjbg */

                public final void run() {
                    C38702a.lambda$AhhEhbuaMd4UHj4CK4DEgfHxjbg(C38702a.this);
                }
            });
        }
    }

    /* renamed from: d */
    public void mo141853d() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f99571g;
        if (elapsedRealtime <= 3000) {
            Log.m165379d("GuideManager", "reloadIfNeed gap " + elapsedRealtime + " less than " + 3000L);
            return;
        }
        this.f99565a.clear();
        C38716a.m152920a().mo141883a(this.f99567c);
        this.f99571g = SystemClock.elapsedRealtime();
        this.f99569e.mo141897b();
    }

    /* renamed from: b */
    public void mo141849b() {
        if (this.f99566b.get() == 0 || this.f99566b.get() == 2) {
            this.f99566b.set(1);
            C38716a.m152920a().mo141883a(this.f99567c);
            this.f99571g = SystemClock.elapsedRealtime();
            return;
        }
        Log.m165397w("GuideManager", "delayInit return， current status is " + this.f99566b.get());
    }

    /* renamed from: a */
    public void mo141843a() {
        Log.m165389i("GuideManager", "init");
        AbstractC38701a a = C38700a.m152832a();
        if (a != null && a.mo141834a() != null) {
            if (C26252ad.m94993b(a.mo141834a())) {
                m152868h();
            } else {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$8KTJkOncz5JfnqC_HfAdnCuVrE */

                    public final void run() {
                        C38702a.m270568lambda$8KTJkOncz5JfnqC_HfAdnCuVrE(C38702a.this);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m152864e(Map map) {
        m152859b(map);
        m152862c(map);
    }

    /* renamed from: g */
    private C38712b m152866g(String str) {
        return m152853a(str, false);
    }

    /* renamed from: d */
    private /* synthetic */ void m152863d(Map map) {
        this.f99565a.clear();
        this.f99565a.putAll(map);
    }

    /* renamed from: e */
    public boolean mo141856e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f99569e.mo141896a(str);
    }

    /* renamed from: f */
    public void mo141857f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f99569e.mo141898b(str);
        }
    }

    /* renamed from: b */
    private C38712b m152857b(List<String> list) {
        C38712b a = C38720a.m152926c().mo141887a(false);
        if (a == null || !list.contains(a.mo141871a())) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    private void m152859b(Map<String, ? extends C38712b> map) {
        if (map != null) {
            Log.m165379d("GuideManager", "onGuideChange：" + map);
            this.f99565a.clear();
            this.f99565a.putAll(map);
            C38725a.m152943b().mo141901a(this.f99565a);
        }
    }

    /* renamed from: c */
    private void m152862c(Map<String, ? extends C38712b> map) {
        IGuideMgrProxy iGuideMgrProxy;
        AbstractC38701a a = C38700a.m152832a();
        if (a != null && a.mo141834a() != null) {
            Context a2 = a.mo141834a();
            if (C26252ad.m94993b(a2) && (iGuideMgrProxy = (IGuideMgrProxy) C68183b.m264839a().mo237086a(a2, IGuideMgrProxy.class)) != null) {
                try {
                    iGuideMgrProxy.onGuideChanged(this.f99570f.toJson(map));
                } catch (NullPointerException e) {
                    Log.m165398w("GuideManager", "Exception in notifyOtherProcess() when calling Gson.toJson()", e);
                }
            }
        }
    }

    /* renamed from: i */
    private C38712b m152870i(String str) {
        C38712b bVar = this.f99565a.get(str);
        if (bVar != null) {
            return bVar;
        }
        C38712b a = C38720a.m152926c().mo141886a();
        if (a == null || !a.mo141871a().equals(str)) {
            return null;
        }
        return a;
    }

    /* renamed from: h */
    private boolean m152869h(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C38712b bVar = this.f99565a.get(str);
        if (bVar == null) {
            Log.m165389i("GuideManager", "consumeGuide: but the guideKey[" + str + "] is not in guide");
            return false;
        }
        bVar.mo141872a(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C38716a.m152920a().mo141884a(arrayList, new IGetDataCallback<Object>() {
            /* class com.ss.android.lark.guidemgr.p1935b.C38702a.C387053 */

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                Log.m165389i("GuideManager", "consumeGuide success:" + str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("GuideManager", "consumeGuide error:" + str);
                C38729c.m152954a().mo141911a(str, errorResult);
            }
        });
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$noJEPsqD_7hodcW2KL_WizcoCXw */

            public final void run() {
                C38702a.this.m152873k();
            }
        });
        return true;
    }

    /* renamed from: a */
    private boolean m152856a(C38712b bVar) {
        if (bVar == null) {
            return false;
        }
        C38708a aVar = this.f99568d.get(bVar.mo141871a());
        if (aVar != null) {
            C38709b.m152904a(aVar, bVar.mo141871a());
            return true;
        }
        Log.m165397w("GuideManager", "pollTaskAndCallback, but GuideConfig is null");
        return true;
    }

    /* renamed from: c */
    public boolean mo141852c(String str) {
        Log.m165389i("GuideManager", "didShowGuide: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        mo141850b(str);
        C38712b i = m152870i(str);
        if (i == null) {
            Log.m165397w("GuideManager", "didShowGuide but the guideKey[" + str + "] is not in guide");
            return false;
        }
        C38720a.m152926c().mo141892b(i);
        this.f99568d.remove(str);
        return m152856a(m152853a(str, true));
    }

    /* renamed from: d */
    public boolean mo141854d(String str) {
        Log.m165389i("GuideManager", "ignoreShowGuide: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f99569e.mo141899c(str)) {
            Log.m165389i("GuideManager", "checkToShow: " + str + " isLocked");
            return false;
        }
        C38712b i = m152870i(str);
        if (i == null) {
            Log.m165397w("GuideManager", "ignoreShowGuide but the guideKey is not in guide");
            return false;
        }
        C38720a.m152926c().mo141892b(i);
        this.f99568d.remove(str);
        return m152856a(m152853a(str, true));
    }

    /* renamed from: b */
    public boolean mo141850b(String str) {
        AbstractC38701a a = C38700a.m152832a();
        if (a == null || a.mo141834a() == null) {
            return false;
        }
        Context a2 = a.mo141834a();
        if (C26252ad.m94993b(a2)) {
            Log.m165389i("GuideManager", "consumeGuide: " + str + " in main process.");
            return m152869h(str);
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, a2) {
            /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$K0Aw2g05aNc4hXDwBOKFgmapbNI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C38702a.lambda$K0Aw2g05aNc4hXDwBOKFgmapbNI(C38702a.this, this.f$1, this.f$2);
            }
        });
        return true;
    }

    /* renamed from: a */
    public void mo141844a(List<String> list) {
        String a = C38720a.m152926c().mo141888a(list);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        if (C38709b.m152907a(a, this.f99568d.get(a))) {
            mo141852c(a);
        } else {
            mo141854d(a);
        }
    }

    /* renamed from: a */
    public void mo141845a(Map<String, C38712b> map) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(map) {
            /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$bw6PBh_JO9wITGXuDkSixJHGtJQ */
            public final /* synthetic */ Map f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38702a.this.m152864e((C38702a) this.f$1);
            }
        });
    }

    /* renamed from: b */
    private boolean m152860b(String str, C38708a aVar) {
        this.f99568d.put(str, aVar);
        return m152856a(m152866g(str));
    }

    /* renamed from: a */
    private C38712b m152853a(String str, boolean z) {
        C38712b a = C38720a.m152926c().mo141887a(z);
        if (a == null || (!z && !TextUtils.equals(str, a.mo141871a()))) {
            return null;
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m152858b(String str, Context context) {
        IGuideMgrProxy iGuideMgrProxy = (IGuideMgrProxy) C68183b.m264839a().mo237086a(context, IGuideMgrProxy.class);
        if (iGuideMgrProxy != null) {
            Log.m165389i("GuideManager", "consumeGuide: " + str + " in sub process.");
            iGuideMgrProxy.report(str);
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m152854a(Context context, String str) {
        Log.m165389i("GuideManager", "onGuideChanged in process: " + C26252ad.m94992a(context));
        try {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable((Map) this.f99570f.fromJson(str, new TypeToken<Map<String, C38712b>>() {
                /* class com.ss.android.lark.guidemgr.p1935b.C38702a.C387042 */
            }.getType())) {
                /* class com.ss.android.lark.guidemgr.p1935b.$$Lambda$a$ZqCuCxUfWt4JEEEU3iEfSJBPzf8 */
                public final /* synthetic */ Map f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C38702a.lambda$ZqCuCxUfWt4JEEEU3iEfSJBPzf8(C38702a.this, this.f$1);
                }
            });
        } catch (NullPointerException e) {
            Log.m165398w("GuideManager", "Exception in onGuideChanged() when calling Gson.fromJson()", e);
        }
    }

    /* renamed from: b */
    private boolean m152861b(List<String> list, C38708a aVar) {
        for (String str : list) {
            this.f99568d.put(str, aVar);
        }
        return m152856a(m152857b(list));
    }
}
