package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import com.bytedance.framwork.core.sdklib.p753d.C14141a;
import com.huawei.hms.location.LocationRequest;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.b */
public class C14171b {

    /* renamed from: a */
    public final LinkedList<C14179i> f37257a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C14173c> f37258b = new LinkedList<>();

    /* renamed from: c */
    public final LinkedList<C14170a> f37259c = new LinkedList<>();

    /* renamed from: d */
    private int f37260d = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: e */
    private boolean f37261e;

    /* renamed from: a */
    public void mo52020a(final SDKMonitor sDKMonitor) {
        if (!this.f37261e) {
            this.f37261e = true;
            C14141a.m57218a().mo51941a(new Runnable() {
                /* class com.bytedance.framwork.core.sdkmonitor.C14171b.RunnableC141721 */

                public void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    LinkedList linkedList3;
                    try {
                        synchronized (C14171b.this.f37257a) {
                            linkedList = new LinkedList(C14171b.this.f37257a);
                            C14171b.this.f37257a.clear();
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C14171b.this.mo52023a(sDKMonitor, (C14179i) it.next());
                        }
                        synchronized (C14171b.this.f37258b) {
                            linkedList2 = new LinkedList(C14171b.this.f37258b);
                            C14171b.this.f37258b.clear();
                        }
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C14171b.this.mo52022a(sDKMonitor, (C14173c) it2.next());
                        }
                        synchronized (C14171b.this.f37259c) {
                            linkedList3 = new LinkedList(C14171b.this.f37259c);
                            C14171b.this.f37259c.clear();
                        }
                        Iterator it3 = linkedList3.iterator();
                        while (it3.hasNext()) {
                            C14171b.this.mo52021a(sDKMonitor, (C14170a) it3.next());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo52024a(C14170a aVar) {
        if (aVar != null) {
            synchronized (this.f37259c) {
                if (this.f37259c.size() > this.f37260d) {
                    this.f37259c.poll();
                }
                this.f37259c.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo52025a(C14173c cVar) {
        if (cVar != null) {
            synchronized (this.f37258b) {
                if (this.f37258b.size() > this.f37260d) {
                    this.f37258b.poll();
                }
                this.f37258b.add(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo52026a(C14179i iVar) {
        if (iVar != null) {
            synchronized (this.f37257a) {
                if (this.f37257a.size() > this.f37260d) {
                    this.f37257a.poll();
                }
                this.f37257a.add(iVar);
            }
        }
    }

    /* renamed from: a */
    public void mo52022a(SDKMonitor sDKMonitor, C14173c cVar) {
        if (cVar != null) {
            sDKMonitor.monitorCommonLogInternal(cVar.f37264a, cVar.f37265b, cVar.f37266c);
        }
    }

    /* renamed from: a */
    public void mo52023a(SDKMonitor sDKMonitor, C14179i iVar) {
        if (iVar != null && !TextUtils.isEmpty(iVar.f37282a)) {
            sDKMonitor.monitorService(iVar.f37282a, iVar.f37283b, iVar.f37284c, iVar.f37285d, iVar.f37286e, iVar.f37287f, iVar.f37288g);
        }
    }

    /* renamed from: a */
    public void mo52021a(SDKMonitor sDKMonitor, C14170a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f37249a)) {
            if (aVar.f37249a.equals("api_error")) {
                sDKMonitor.monitorApiError(aVar.f37250b, aVar.f37251c, aVar.f37252d, aVar.f37253e, aVar.f37254f, aVar.f37255g, aVar.f37256h);
            } else if (aVar.f37249a.equals("api_all")) {
                sDKMonitor.monitorSLA(aVar.f37250b, aVar.f37251c, aVar.f37252d, aVar.f37253e, aVar.f37254f, aVar.f37255g, aVar.f37256h);
            }
        }
    }
}
