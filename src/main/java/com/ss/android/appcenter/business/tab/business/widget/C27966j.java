package com.ss.android.appcenter.business.tab.business.widget;

import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.gson.Gson;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.net.p1270a.AbstractC27713a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.business.tab.business.widget.C27962h;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.j */
public class C27966j {

    /* renamed from: a */
    public ConcurrentHashMap<String, WidgetData> f69968a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f69969b;

    /* renamed from: c */
    private Map<String, C27965i> f69970c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<String, C1174u<WidgetData>> f69971d = new ConcurrentHashMap();

    /* renamed from: a */
    public static Thread m102109a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: b */
    private void m102111b() {
        if (this.f69969b) {
            C27962h.m102102a(this.f69968a);
        }
    }

    /* renamed from: a */
    private void m102110a() {
        if (this.f69969b) {
            m102109a(new Thread(new Runnable() {
                /* class com.ss.android.appcenter.business.tab.business.widget.C27966j.RunnableC279671 */

                public void run() {
                    C27962h.m102101a(new C27962h.AbstractC27964a() {
                        /* class com.ss.android.appcenter.business.tab.business.widget.C27966j.RunnableC279671.C279681 */

                        @Override // com.ss.android.appcenter.business.tab.business.widget.C27962h.AbstractC27964a
                        /* renamed from: a */
                        public void mo99682a(ConcurrentHashMap<String, WidgetData> concurrentHashMap) {
                            if (concurrentHashMap != null) {
                                C27966j.this.f69968a = concurrentHashMap;
                            }
                        }
                    });
                }
            })).start();
        }
    }

    /* renamed from: a */
    public void mo99690a(WidgetData widgetData) {
        mo99694b(widgetData);
    }

    /* renamed from: a */
    public void mo99691a(boolean z) {
        this.f69969b = z;
        if (z) {
            m102110a();
        }
    }

    /* renamed from: a */
    public C1174u<WidgetData> mo99689a(String str) {
        return this.f69971d.get(str);
    }

    /* renamed from: d */
    private void m102113d(WidgetData widgetData) {
        C1174u<WidgetData> a = mo99689a(widgetData.getCardId());
        if (a != null) {
            a.mo5926a(widgetData);
            return;
        }
        C28184h.m103250d("WidgetDataSource", "dispatchData Widget unregister. cardId:" + widgetData.getCardId());
    }

    /* renamed from: b */
    public void mo99694b(WidgetData widgetData) {
        boolean c = m102112c(widgetData);
        C28184h.m103250d("WidgetDataSource", "handleRemoteData" + widgetData + " is valid:" + c);
        if (c) {
            m102113d(widgetData);
            m102111b();
        }
    }

    /* renamed from: c */
    private boolean m102112c(WidgetData widgetData) {
        C27965i iVar = this.f69970c.get(widgetData.getCardId());
        if (iVar == null || !widgetData.isValidRemoteData(iVar.mo99683a(), iVar.mo99685b(), iVar.mo99686c())) {
            C28184h.m103250d("WidgetDataSource", "widgetdata is invalid. widgetData:" + widgetData + " require:" + iVar);
            return false;
        }
        this.f69968a.put(widgetData.getCardId(), widgetData);
        iVar.mo99684a(widgetData.getCreateTime());
        return true;
    }

    /* renamed from: a */
    public LiveData<WidgetData> mo99688a(C27965i iVar) {
        C28184h.m103250d("WidgetDataSource", "register Widget:" + iVar);
        String a = iVar.mo99683a();
        C1174u<WidgetData> uVar = new C1174u<>();
        this.f69971d.put(a, uVar);
        this.f69970c.put(a, iVar);
        WidgetData widgetData = this.f69968a.get(a);
        if (widgetData == null || !widgetData.isValidCacheData(iVar.mo99683a(), iVar.mo99685b())) {
            C28184h.m103250d("WidgetDataSource", "this widget doesn't have cache, cardId:" + a);
        } else {
            C28184h.m103250d("WidgetDataSource", "get widget cache success, cardId:" + a);
            m102113d(widgetData);
        }
        return uVar;
    }

    /* renamed from: a */
    public void mo99692a(boolean z, C27965i iVar) {
        mo99693a(z, Arrays.asList(iVar));
    }

    /* renamed from: a */
    public void mo99693a(boolean z, final List<C27965i> list) {
        C27970k.m102125a(z, list, new AbstractC27713a() {
            /* class com.ss.android.appcenter.business.tab.business.widget.C27966j.C279692 */

            /* renamed from: a */
            private void m102122a() {
                for (C27965i iVar : list) {
                    C1174u<WidgetData> a = C27966j.this.mo99689a(iVar.mo99683a());
                    if (a != null) {
                        a.mo5926a((WidgetData) null);
                    } else {
                        C28184h.m103250d("WidgetDataSource", "handleError. livedata is null. cardId:" + iVar.mo99683a());
                    }
                }
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                m102122a();
                C28184h.m103247a("GetWidgetContent", C27580h.m100661a(bVar.f69282a, errorResult), errorResult);
            }

            @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
            /* renamed from: a */
            public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                String str = sendHttpResponse.json_body;
                try {
                    WidgetContentResponse widgetContentResponse = (WidgetContentResponse) new Gson().fromJson(str, WidgetContentResponse.class);
                    if (!(widgetContentResponse == null || widgetContentResponse.getCode() != 0 || widgetContentResponse.getData() == null)) {
                        if (!C28182f.m103238c(widgetContentResponse.getData().getWidgetDataList())) {
                            C28184h.m103250d("GetWidgetContent", C27580h.m100660a());
                            for (WidgetData widgetData : widgetContentResponse.getData().getWidgetDataList()) {
                                C27966j.this.mo99694b(widgetData);
                            }
                            return;
                        }
                    }
                    C28184h.m103248b("GetWidgetContent", C27580h.m100663a(bVar.f69282a, bVar.f69283b, str));
                    m102122a();
                } catch (Exception e) {
                    m102122a();
                    C28184h.m103247a("GetWidgetContent", C27580h.m100667b(bVar.f69282a, bVar.f69283b, str), e);
                }
            }
        });
    }
}
