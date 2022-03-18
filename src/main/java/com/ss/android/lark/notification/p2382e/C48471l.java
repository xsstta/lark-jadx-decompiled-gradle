package com.ss.android.lark.notification.p2382e;

import android.util.SparseArray;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2382e.C48445a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.ss.android.lark.notification.e.l */
public class C48471l {

    /* renamed from: a */
    public C48445a<C48499a> f121954a;

    /* renamed from: b */
    private final ScheduledExecutorService f121955b = CoreThreadPool.getDefault().getScheduleThreadPool();

    /* renamed from: c */
    private final AbstractC48407a.AbstractC48408a f121956c = C48398a.m190922a().mo169339b();

    /* renamed from: com.ss.android.lark.notification.e.l$a */
    private static class C48474a {

        /* renamed from: a */
        public static final C48471l f121959a = new C48471l();
    }

    /* renamed from: a */
    public int mo169532a(boolean z) {
        if (z) {
            return LocationRequest.PRIORITY_HD_ACCURACY;
        }
        return 2000;
    }

    /* renamed from: a */
    public static C48471l m191163a() {
        return C48474a.f121959a;
    }

    public C48471l() {
        m191164b();
    }

    /* renamed from: b */
    private void m191164b() {
        C48445a<C48499a> aVar = new C48445a<>((long) mo169532a(this.f121956c.mo169358a()), this.f121955b);
        this.f121954a = aVar;
        aVar.mo169505a(new C48445a.AbstractC48448a<C48499a>() {
            /* class com.ss.android.lark.notification.p2382e.C48471l.C484721 */

            @Override // com.ss.android.lark.notification.p2382e.C48445a.AbstractC48448a
            /* renamed from: a */
            public void mo169510a(List<C48499a> list) {
                C48471l.this.mo169536b(C48471l.this.mo169533a(list));
            }
        });
        this.f121956c.mo169357a(new AbstractC48407a.AbstractC48408a.AbstractC48409a() {
            /* class com.ss.android.lark.notification.p2382e.C48471l.C484732 */

            @Override // com.ss.android.lark.notification.p2378b.AbstractC48407a.AbstractC48408a.AbstractC48409a
            /* renamed from: a */
            public void mo169359a(boolean z) {
                if (C48471l.this.f121954a != null) {
                    C48471l.this.f121954a.mo169503a();
                    C48471l.this.f121954a.mo169504a((long) C48471l.this.mo169532a(z));
                }
            }
        });
    }

    /* renamed from: a */
    public <T extends C48499a> void mo169534a(T t) {
        C48445a<C48499a> aVar = this.f121954a;
        if (aVar != null) {
            aVar.mo169506a(t);
        }
    }

    /* renamed from: b */
    public <T extends C48499a> void mo169535b(T t) {
        C48445a<C48499a> aVar = this.f121954a;
        if (aVar != null) {
            aVar.mo169506a(t);
            this.f121954a.mo169503a();
        }
    }

    /* renamed from: a */
    public List<C48499a> mo169533a(List<C48499a> list) {
        SparseArray sparseArray = new SparseArray(list.size());
        for (C48499a aVar : list) {
            sparseArray.put(aVar.f122060c, aVar);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo169536b(List<C48499a> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (C48499a aVar : list) {
                if (aVar != null) {
                    C48460g.m191134a().mo169529a(aVar);
                }
            }
        }
    }
}
