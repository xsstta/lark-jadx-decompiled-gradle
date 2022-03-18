package com.ss.android.lark.location.p2146b;

import android.content.Context;
import android.location.Location;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.AbstractC41582a;
import com.ss.android.lark.location.listener.AbstractC41583b;
import com.ss.android.lark.location.listener.AbstractC41584c;
import com.ss.android.lark.location.listener.C41585d;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.listener.LocationRequestOption;
import com.ss.android.lark.log.Log;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.location.b.a */
public abstract class AbstractC41556a implements AbstractC41583b {

    /* renamed from: a */
    protected Context f105630a;

    /* renamed from: b */
    protected int f105631b = CalendarSearchResultRv.f82652c;

    /* renamed from: c */
    protected List<AbstractC41584c> f105632c = new CopyOnWriteArrayList();

    /* renamed from: d */
    protected List<AbstractC41584c> f105633d = new CopyOnWriteArrayList();

    /* renamed from: e */
    protected List<C41585d> f105634e = new CopyOnWriteArrayList();

    /* renamed from: f */
    protected List<C41585d> f105635f = new CopyOnWriteArrayList();

    /* renamed from: g */
    protected AbstractC41582a f105636g = new AbstractC41582a() {
        /* class com.ss.android.lark.location.p2146b.AbstractC41556a.C415571 */

        @Override // com.ss.android.lark.location.listener.AbstractC41582a
        /* renamed from: a */
        public void mo149537a(boolean z) {
            Log.m165389i("AbsLocationService", "onAppStateChange called. isAppFronted:" + z);
            if (z) {
                AbstractC41556a.this.mo149529b();
            } else {
                AbstractC41556a.this.mo149533c();
            }
        }
    };

    /* renamed from: h */
    private boolean f105637h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo149524a(AbstractC41582a aVar);

    /* renamed from: a */
    public abstract boolean mo149525a(LocationRequestOption locationRequestOption);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo149529b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo149530b(AbstractC41582a aVar);

    /* renamed from: b */
    public abstract boolean mo149531b(LocationRequestOption locationRequestOption);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo149533c();

    /* renamed from: d */
    public abstract void mo149534d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo149535e();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo149522a() {
        Log.m165389i("AbsLocationService", "unRegisterAppState called. unregister appstate.");
        this.f105637h = false;
        mo149530b(this.f105636g);
    }

    /* renamed from: g */
    private void m164890g() {
        if (this.f105637h) {
            Log.m165389i("AbsLocationService", "registerAppStateIfNeed called. already register appstate.");
            return;
        }
        Log.m165389i("AbsLocationService", "registerAppStateIfNeed called. register appstate.");
        this.f105637h = true;
        mo149524a(this.f105636g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo149536f() {
        if (!this.f105632c.isEmpty() || !this.f105633d.isEmpty() || !this.f105634e.isEmpty() || !this.f105635f.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.location.listener.AbstractC41583b
    /* renamed from: a */
    public synchronized boolean mo149526a(AbstractC41584c cVar) {
        Log.m165389i("AbsLocationService", "getLocation called.");
        m164890g();
        if (cVar == null) {
            Log.m165383e("AbsLocationService", "failed to getLocation, locationCallBack is null.");
            return false;
        }
        if (!this.f105632c.contains(cVar)) {
            this.f105632c.add(cVar);
        }
        return mo149525a((LocationRequestOption) null);
    }

    @Override // com.ss.android.lark.location.listener.AbstractC41583b
    /* renamed from: b */
    public synchronized boolean mo149532b(AbstractC41584c cVar) {
        Log.m165389i("AbsLocationService", "stopLocation called.");
        if (this.f105633d.contains(cVar)) {
            this.f105633d.remove(cVar);
        }
        int i = 0;
        while (true) {
            if (i >= this.f105635f.size()) {
                break;
            }
            C41585d dVar = this.f105635f.get(i);
            if (dVar.mo149701a() == cVar) {
                this.f105635f.remove(dVar);
                break;
            }
            i++;
        }
        mo149534d();
        return true;
    }

    /* renamed from: a */
    public synchronized void mo149523a(LarkLocation larkLocation, List<Location> list) {
        Log.m165389i("AbsLocationService", "notifyLocationChanged called.");
        m164886b(larkLocation, list);
        m164888d(larkLocation, list);
        m164887c(larkLocation, list);
        m164889e(larkLocation, list);
        mo149534d();
    }

    /* renamed from: b */
    private void m164886b(LarkLocation larkLocation, List<Location> list) {
        Log.m165389i("AbsLocationService", "notifyOnceLocationCallback called.");
        if (this.f105632c.isEmpty()) {
            Log.m165389i("AbsLocationService", "notifyOnceLocationCallback called. mOnceLocationCallbacks is empty");
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < this.f105632c.size(); i++) {
            AbstractC41584c cVar = this.f105632c.get(i);
            cVar.onLocationChange(larkLocation, list);
            linkedList.add(cVar);
        }
        this.f105632c.removeAll(linkedList);
    }

    /* renamed from: e */
    private void m164889e(LarkLocation larkLocation, List<Location> list) {
        if (this.f105635f.isEmpty()) {
            Log.m165389i("AbsLocationService", "notifyContinuousLocationCallbackWithOption called. mContinuousLocationCallbacksWithOption is empty");
            return;
        }
        Log.m165389i("AbsLocationService", "notifyContinuousLocationCallbackWithOption called.");
        for (int i = 0; i < this.f105635f.size(); i++) {
            C41585d dVar = this.f105635f.get(i);
            dVar.mo149701a().onLocationChange(C41586e.m165036a(larkLocation, dVar.mo149702b()), list);
        }
    }

    /* renamed from: c */
    private void m164887c(LarkLocation larkLocation, List<Location> list) {
        Log.m165389i("AbsLocationService", "notifyOnceLocationCallbackWithOption called.");
        if (this.f105634e.isEmpty()) {
            Log.m165389i("AbsLocationService", "notifyOnceLocationCallbackWithOption called. mOnceLocationCallbacksWithOption is empty.");
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < this.f105634e.size(); i++) {
            C41585d dVar = this.f105634e.get(i);
            dVar.mo149701a().onLocationChange(C41586e.m165036a(larkLocation, dVar.mo149702b()), list);
            linkedList.add(dVar);
        }
        this.f105634e.removeAll(linkedList);
    }

    /* renamed from: d */
    private void m164888d(LarkLocation larkLocation, List<Location> list) {
        String str;
        if (this.f105633d.isEmpty()) {
            Log.m165389i("AbsLocationService", "notifyContinuousLocationCallback called. mContinuousLocationCallBacks is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyContinuousLocationCallback called. continuous location result: ");
        if (larkLocation == null) {
            str = "";
        } else {
            str = larkLocation.toString();
        }
        sb.append(str);
        Log.m165389i("AbsLocationService", sb.toString());
        for (int i = 0; i < this.f105633d.size(); i++) {
            this.f105633d.get(i).onLocationChange(larkLocation, list);
        }
    }

    @Override // com.ss.android.lark.location.listener.AbstractC41583b
    /* renamed from: a */
    public synchronized boolean mo149527a(AbstractC41584c cVar, int i) {
        Log.m165389i("AbsLocationService", "requestLocation called.");
        m164890g();
        if (cVar == null) {
            Log.m165383e("AbsLocationService", "failed to requestLocation, locationCallBack is null.");
            return false;
        }
        if (i < this.f105631b) {
            this.f105631b = i;
        }
        if (!this.f105633d.contains(cVar)) {
            this.f105633d.add(cVar);
        }
        return mo149531b((LocationRequestOption) null);
    }

    @Override // com.ss.android.lark.location.listener.AbstractC41583b
    /* renamed from: a */
    public synchronized boolean mo149528a(AbstractC41584c cVar, int i, LocationRequestOption locationRequestOption) {
        Log.m165389i("AbsLocationService", "requestLocationWithOption called.");
        m164890g();
        if (cVar == null) {
            Log.m165383e("AbsLocationService", "failed to requestLocationWithOption, locationCallBack is null.");
            return false;
        }
        if (i < this.f105631b) {
            this.f105631b = i;
        }
        this.f105635f.add(new C41585d(cVar, locationRequestOption));
        return mo149531b(locationRequestOption);
    }
}
