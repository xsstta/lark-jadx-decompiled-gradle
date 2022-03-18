package com.ss.android.lark.platform.location;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.p2145a.AbstractC41551a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.location.LocationDependencyImpl;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ClaymoreImpl(AbstractC41551a.class)
public class LocationDependencyImpl implements AbstractC41551a {
    public static final Map<AbstractC41582a, AbstractC29586u> mListenerMap = new ConcurrentHashMap();

    @Override // com.ss.android.lark.location.p2145a.AbstractC41551a
    public AbstractC41551a.AbstractC41552a getAppStateDependency() {
        return new AbstractC41551a.AbstractC41552a() {
            /* class com.ss.android.lark.platform.location.LocationDependencyImpl.C518371 */

            @Override // com.ss.android.lark.location.p2145a.AbstractC41551a.AbstractC41552a
            /* renamed from: a */
            public boolean mo149511a() {
                return AppLifecycle.m200904a().mo177975e();
            }

            @Override // com.ss.android.lark.location.p2145a.AbstractC41551a.AbstractC41552a
            /* renamed from: b */
            public void mo149512b(AbstractC41582a aVar) {
                AbstractC29586u uVar = LocationDependencyImpl.mListenerMap.get(aVar);
                if (uVar == null) {
                    Log.m165389i("LocationDependencyImpl", "removeAppStateChangeListener called. but already removed.");
                    return;
                }
                AppLifecycle.m200904a().mo177972b(uVar);
                LocationDependencyImpl.mListenerMap.remove(aVar);
            }

            @Override // com.ss.android.lark.location.p2145a.AbstractC41551a.AbstractC41552a
            /* renamed from: a */
            public void mo149510a(AbstractC41582a aVar) {
                if (LocationDependencyImpl.mListenerMap.containsKey(aVar)) {
                    Log.m165389i("LocationDependencyImpl", "addAppStateChangeListener called. but already added.");
                    return;
                }
                $$Lambda$LocationDependencyImpl$1$eGmu4fVwZMLgZgHu9TBTocgzF0 r0 = new AbstractC29586u() {
                    /* class com.ss.android.lark.platform.location.$$Lambda$LocationDependencyImpl$1$eGmu4fVwZMLgZgHu9TBTocgzF0 */

                    @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                    public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                        LocationDependencyImpl.C518371.m200988a(AbstractC41582a.this, aVar, aVar2);
                    }
                };
                LocationDependencyImpl.mListenerMap.put(aVar, r0);
                AppLifecycle.m200904a().mo177967a(r0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m200988a(AbstractC41582a aVar, AbstractC29586u.C29587a aVar2, AbstractC29586u.C29587a aVar3) {
                boolean c;
                if (aVar2 != null && aVar3 != null && aVar2.mo105887c() != (c = aVar3.mo105887c()) && aVar != null) {
                    aVar.mo149537a(c);
                }
            }
        };
    }

    public Context getContext() {
        return LarkContext.getApplication();
    }
}
