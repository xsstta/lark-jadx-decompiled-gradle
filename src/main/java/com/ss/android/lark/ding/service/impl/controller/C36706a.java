package com.ss.android.lark.ding.service.impl.controller;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.C36622b;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.ding.p1803a.AbstractC36619a;
import com.ss.android.lark.ding.service.AbstractC36675c;
import com.ss.android.lark.ding.service.impl.C36690c;
import com.ss.android.lark.ding.service.impl.C36758e;
import com.ss.android.lark.ding.service.impl.controller.C36717b;
import com.ss.android.lark.ding.service.impl.controller.C36744h;
import com.ss.android.lark.ding.service.impl.reminder.C36780a;
import com.ss.android.lark.ding.service.impl.reminder.UrgentReminderData;
import com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.a */
public class C36706a implements AbstractC36675c {

    /* renamed from: a */
    AtomicBoolean f94371a;

    /* renamed from: b */
    IDingModuleDependency.AbstractC36635l f94372b;

    /* renamed from: c */
    public final C36751i f94373c;

    /* renamed from: d */
    C36744h.AbstractC36750a f94374d;

    /* renamed from: e */
    private final C36744h f94375e;

    /* renamed from: f */
    private final C36717b f94376f;

    /* renamed from: g */
    private AbstractC36619a f94377g;

    /* renamed from: h */
    private final Map<String, AbstractC58451a> f94378h;

    /* renamed from: i */
    private final ConcurrentHashMap<AbstractC36675c.AbstractC36676a, Integer> f94379i;

    /* renamed from: com.ss.android.lark.ding.service.impl.controller.a$a */
    private static class C36716a {

        /* renamed from: a */
        public static final C36706a f94392a = new C36706a();
    }

    /* renamed from: g */
    public static C36706a m144854g() {
        return C36716a.f94392a;
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: c */
    public int mo135275c() {
        return this.f94378h.size();
    }

    /* renamed from: i */
    public void mo135363i() {
        this.f94378h.clear();
        m144855k();
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: b */
    public void mo135273b() {
        IDingModuleDependency.AbstractC36635l lVar;
        mo135363i();
        AbstractC36619a aVar = this.f94377g;
        if (!(aVar == null || (lVar = this.f94372b) == null)) {
            lVar.mo135165b(aVar);
        }
        this.f94375e.mo135430a();
        this.f94371a.set(false);
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: d */
    public void mo135276d() {
        Log.m165389i("DingController", "showAllDingDialog");
        C36644b.m144618a().mo135219b(mo135364j());
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: e */
    public void mo135277e() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36706a.RunnableC367113 */

            public void run() {
                if (C36706a.this.f94373c.mo135440c(8)) {
                    Log.m165389i("DingController", "forceReloadDingData checkoutNeedRetry");
                    C36706a.this.mo135278f();
                    C36706a.this.f94373c.mo135439b(8);
                }
            }
        });
    }

    /* renamed from: j */
    public List<AbstractC58451a> mo135364j() {
        ArrayList arrayList = new ArrayList(this.f94378h.values());
        Collections.sort(arrayList, new Comparator() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367124 */

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                if (!(obj instanceof C36780a) || !(obj2 instanceof C36780a)) {
                    return 0;
                }
                C36780a aVar = (C36780a) obj;
                C36780a aVar2 = (C36780a) obj2;
                if (aVar.mo135488f().getSendTime() > aVar2.mo135488f().getSendTime()) {
                    return 1;
                }
                if (aVar.mo135488f().getSendTime() == aVar2.mo135488f().getSendTime()) {
                    return 0;
                }
                return -1;
            }
        });
        return arrayList;
    }

    /* renamed from: k */
    private void m144855k() {
        for (AbstractC36675c.AbstractC36676a aVar : this.f94379i.keySet()) {
            aVar.mo135279a(this.f94378h.size());
        }
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: f */
    public void mo135278f() {
        Log.m165379d("DingController", "forceReloadDingData");
        if (this.f94376f != null && C36618a.m144492a().mo135109n().mo135119a(C36622b.f94235a, true)) {
            this.f94376f.mo135317e();
            this.f94376f.mo135376a(new C36717b.AbstractC36719a() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367146 */

                @Override // com.ss.android.lark.ding.service.impl.controller.C36717b.AbstractC36719a
                /* renamed from: a */
                public void mo135373a(ErrorResult errorResult) {
                    Log.m165389i("DingController", "mUrgentLoader onLoadErr" + errorResult.toString());
                    C36706a.this.f94373c.mo135438a(8);
                }

                @Override // com.ss.android.lark.ding.service.impl.controller.C36717b.AbstractC36719a
                /* renamed from: a */
                public void mo135374a(List<C36758e> list) {
                    Log.m165389i("DingController", "mUrgentLoader onDataLoaded" + list.size());
                    C36706a.this.mo135363i();
                    for (C36758e eVar : list) {
                        C36706a.this.mo135358a(C36706a.this.mo135361b(eVar));
                    }
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367146.RunnableC367151 */

                        public void run() {
                            C36644b.m144618a().mo135216a(C36706a.this.mo135364j());
                            C36706a.this.mo135362h();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: h */
    public void mo135362h() {
        Log.m165389i("DingController", "showDingDialog");
        if (C36644b.m144618a().mo135222e()) {
            C36644b.m144618a().mo135219b(mo135364j());
        } else {
            C36644b.m144618a().mo135218b();
        }
    }

    private C36706a() {
        IDingModuleDependency.AbstractC36635l lVar;
        this.f94371a = new AtomicBoolean(false);
        if (C36618a.m144492a() == null) {
            lVar = null;
        } else {
            lVar = C36618a.m144492a().mo135099d();
        }
        this.f94372b = lVar;
        this.f94375e = new C36744h();
        this.f94376f = new C36717b();
        this.f94373c = new C36751i();
        this.f94378h = new ConcurrentHashMap();
        this.f94379i = new ConcurrentHashMap<>();
        this.f94374d = new C36744h.AbstractC36750a() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367071 */

            @Override // com.ss.android.lark.ding.service.impl.controller.C36744h.AbstractC36750a
            /* renamed from: a */
            public void mo135365a(final C36758e eVar) {
                if (C36618a.m144492a().mo135109n().mo135119a(C36622b.f94235a, true)) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367071.RunnableC367081 */

                        public void run() {
                            C36706a.this.mo135357a(eVar);
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36744h.AbstractC36750a
            /* renamed from: a */
            public void mo135366a(final String str, final String str2) {
                if (C36618a.m144492a().mo135109n().mo135119a(C36622b.f94235a, true)) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367071.RunnableC367092 */

                        public void run() {
                            C36706a.this.mo135359a(str, str2);
                        }
                    });
                }
            }
        };
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: a */
    public void mo135271a() {
        if (this.f94371a.compareAndSet(false, true)) {
            this.f94375e.mo135432a(this.f94374d);
            C367102 r0 = new AbstractC36619a() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367102 */

                @Override // com.ss.android.lark.ding.p1803a.AbstractC36619a
                /* renamed from: a */
                public void mo135093a(boolean z) {
                    if (z) {
                        boolean b = C36618a.m144492a().mo135097b();
                        Log.m165389i("DingController", "onConnectionStateChange : isConnected " + z + "isAppRealForeground" + b);
                        if (b) {
                            Log.m165389i("DingController", "forceReloadDingData onConnStateChanged");
                            C36706a.this.mo135278f();
                            C36706a.this.f94373c.mo135439b(8);
                            return;
                        }
                        C36706a.this.f94373c.mo135438a(8);
                    }
                }
            };
            this.f94377g = r0;
            IDingModuleDependency.AbstractC36635l lVar = this.f94372b;
            if (lVar != null) {
                lVar.mo135164a(r0);
            }
        }
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: b */
    public void mo135274b(AbstractC36675c.AbstractC36676a aVar) {
        this.f94379i.remove(aVar);
    }

    @Override // com.ss.android.lark.ding.service.AbstractC36675c
    /* renamed from: a */
    public void mo135272a(AbstractC36675c.AbstractC36676a aVar) {
        this.f94379i.put(aVar, 0);
    }

    /* renamed from: b */
    public C36780a mo135361b(C36758e eVar) {
        return m144853a(eVar, new UrgentReminderView.AbstractC36779a() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36706a.C367135 */

            @Override // com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.AbstractC36779a
            /* renamed from: a */
            public void mo135371a(String str, String str2) {
                C36706a.this.mo135359a(str, str2);
            }

            @Override // com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView.AbstractC36779a
            /* renamed from: b */
            public void mo135372b(String str, String str2) {
                C36644b.m144618a().mo135220c();
            }
        });
    }

    /* renamed from: a */
    public void mo135357a(C36758e eVar) {
        if (eVar != null) {
            C36780a b = mo135361b(eVar);
            mo135358a(b);
            C36644b.m144618a().mo135214a(b);
        }
    }

    /* renamed from: a */
    public void mo135358a(C36780a aVar) {
        if (aVar != null) {
            this.f94378h.put(aVar.mo117929a(), aVar);
            m144855k();
        }
    }

    /* renamed from: a */
    public void mo135360a(List<String> list) {
        UrgentReminderData f;
        for (Map.Entry<String, AbstractC58451a> entry : this.f94378h.entrySet()) {
            AbstractC58451a value = entry.getValue();
            if ((value instanceof C36780a) && (f = ((C36780a) value).mo135488f()) != null) {
                String id = f.getMessage().getId();
                if (list.contains(id)) {
                    C36690c.m144778a().mo135299a(id, f.getAckId(), null);
                }
            }
        }
    }

    /* renamed from: a */
    private C36780a m144853a(C36758e eVar, UrgentReminderView.AbstractC36779a aVar) {
        UrgentReminderData urgentReminderData = new UrgentReminderData();
        MessageInfo e = eVar.mo135448e();
        urgentReminderData.setMessage(e.getMessage());
        urgentReminderData.setFromChatter(e.getMessageSender());
        urgentReminderData.setAckId(eVar.mo135444b());
        urgentReminderData.setUrgentType(eVar.mo135441a());
        urgentReminderData.setSendTime(eVar.mo135447d());
        urgentReminderData.setChat(eVar.mo135449f());
        C36780a aVar2 = new C36780a(aVar);
        aVar2.mo135487a(urgentReminderData);
        return aVar2;
    }

    /* renamed from: a */
    public void mo135359a(String str, String str2) {
        C36644b.m144618a().mo135215a(str + str2);
        Map<String, AbstractC58451a> map = this.f94378h;
        map.remove(str + str2);
        m144855k();
    }
}
