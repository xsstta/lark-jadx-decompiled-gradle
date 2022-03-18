package com.bytedance.applog.p197a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.applog.C3424j;
import com.bytedance.applog.C3426k;
import com.bytedance.applog.collector.C3394a;
import com.bytedance.applog.collector.Collector;
import com.bytedance.applog.manager.C3430b;
import com.bytedance.applog.manager.C3435g;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p198b.AbstractC3384a;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.p200d.C3398b;
import com.bytedance.applog.p201e.AbstractC3402b;
import com.bytedance.applog.p201e.C3408d;
import com.bytedance.applog.p201e.C3413g;
import com.bytedance.applog.p201e.C3415i;
import com.bytedance.applog.p201e.C3416j;
import com.bytedance.applog.util.C3460i;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.bytedance.applog.util.UriConstants;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.a.e */
public class C3373e implements Handler.Callback, Comparator<AbstractC3402b> {

    /* renamed from: b */
    private static C3373e f10677b;

    /* renamed from: a */
    volatile boolean f10678a;

    /* renamed from: c */
    private C3370b f10679c;

    /* renamed from: d */
    private boolean f10680d;

    /* renamed from: e */
    private Application f10681e;

    /* renamed from: f */
    private C3435g f10682f;

    /* renamed from: g */
    private C3372d f10683g;

    /* renamed from: h */
    private final ArrayList<AbstractC3402b> f10684h = new ArrayList<>(32);

    /* renamed from: i */
    private volatile C3408d f10685i;

    /* renamed from: j */
    private C3436h f10686j;

    /* renamed from: k */
    private volatile Handler f10687k;

    /* renamed from: l */
    private volatile C3375f f10688l;

    /* renamed from: m */
    private C3376g f10689m;

    /* renamed from: n */
    private C3377h f10690n;

    /* renamed from: o */
    private volatile C3369a f10691o;

    /* renamed from: p */
    private C3378i f10692p;

    /* renamed from: q */
    private C3426k f10693q;

    /* renamed from: r */
    private Handler f10694r;

    /* renamed from: s */
    private long f10695s;

    /* renamed from: t */
    private volatile boolean f10696t;

    /* renamed from: u */
    private AbstractC3371c f10697u;

    /* renamed from: v */
    private ArrayList<AbstractC3371c> f10698v = new ArrayList<>(4);

    /* renamed from: w */
    private volatile long f10699w;

    /* renamed from: x */
    private final List<AbstractC3374a> f10700x = new ArrayList();

    /* renamed from: y */
    private volatile AbstractC3384a f10701y;

    /* renamed from: z */
    private volatile C3424j.AbstractC3425a f10702z;

    /* renamed from: com.bytedance.applog.a.e$a */
    abstract class AbstractC3374a<T> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13616a();
    }

    /* renamed from: b */
    public static HandlerThread m14089b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13613g() {
    }

    /* renamed from: a */
    public C3378i mo13600a() {
        return this.f10692p;
    }

    /* renamed from: b */
    public Context mo13607b() {
        return this.f10681e;
    }

    /* renamed from: d */
    public C3436h mo13610d() {
        return this.f10686j;
    }

    /* renamed from: h */
    public C3435g mo13614h() {
        return this.f10682f;
    }

    /* renamed from: a */
    public void mo13604a(String str, String str2) {
        if (this.f10686j.mo13863e(str) || this.f10686j.mo13865f(str2)) {
            m14084a(this.f10689m);
            m14084a(this.f10683g);
        }
    }

    /* renamed from: a */
    public boolean mo13606a(boolean z) {
        if ((!this.f10680d || z) && this.f10687k != null) {
            this.f10680d = true;
            this.f10687k.removeMessages(11);
            this.f10687k.sendEmptyMessage(11);
        }
        return this.f10680d;
    }

    /* renamed from: a */
    public void mo13605a(String[] strArr, boolean z) {
        ArrayList<AbstractC3402b> arrayList;
        synchronized (this.f10684h) {
            arrayList = (ArrayList) this.f10684h.clone();
            this.f10684h.clear();
        }
        if (strArr != null) {
            arrayList.ensureCapacity(arrayList.size() + strArr.length);
            for (String str : strArr) {
                arrayList.add(AbstractC3402b.m14197a(str));
            }
        }
        AbstractC3384a aVar = this.f10701y;
        if (mo13614h().mo13816b().mo13734N() && aVar != null) {
            Iterator<AbstractC3402b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3402b next = it.next();
                if (next instanceof C3413g) {
                    C3413g gVar = (C3413g) next;
                    if (!aVar.mo13635a(gVar.mo13711k(), gVar.mo13673i())) {
                        it.remove();
                    }
                }
            }
        }
        boolean b = this.f10682f.mo13819b(arrayList);
        if (arrayList.size() > 0) {
            if (!this.f10682f.mo13843v()) {
                Intent intent = new Intent(this.f10681e, Collector.class);
                int size = arrayList.size();
                String[] strArr2 = new String[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    strArr2[i2] = arrayList.get(i2).mo13669e().toString();
                    i += strArr2[i2].length();
                }
                boolean z2 = true;
                if (i >= 307200 && this.f10702z != null) {
                    try {
                        z2 = this.f10702z.mo13772a(strArr2);
                    } catch (Throwable th) {
                        C3469r.m14668b("check ipc data", th);
                    }
                    C3469r.m14667a((Throwable) null);
                }
                if (z2) {
                    intent.putExtra("K_DATA", strArr2);
                    this.f10681e.sendBroadcast(intent);
                }
            } else if (b || arrayList.size() > 100) {
                m14090b(arrayList);
                if (!this.f10680d && this.f10692p.mo13625c() && this.f10687k != null && this.f10682f.mo13816b().mo13726F()) {
                    mo13606a(false);
                }
            } else {
                Iterator<AbstractC3402b> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m14085a(it2.next());
                }
            }
        }
        if (z && this.f10682f.mo13843v()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f10699w) > 10000) {
                this.f10699w = currentTimeMillis;
                m14084a(this.f10690n);
            }
        }
    }

    /* renamed from: a */
    public void mo13603a(String str) {
        String f = this.f10686j.mo13864f();
        if ((TextUtils.isEmpty(str) && !TextUtils.isEmpty(f)) || (!TextUtils.isEmpty(str) && !TextUtils.equals(str, f))) {
            m14091c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo13611e() {
        if (this.f10688l == null) {
            synchronized (this) {
                C3375f fVar = this.f10688l;
                if (fVar == null) {
                    fVar = new C3375f(this);
                }
                this.f10688l = fVar;
            }
        }
        return this.f10688l.mo13617a();
    }

    /* renamed from: f */
    public C3426k mo13612f() {
        if (this.f10693q == null) {
            C3426k o = mo13614h().mo13816b().mo13760o();
            this.f10693q = o;
            if (o == null) {
                this.f10693q = UriConstants.m14576a(2);
            }
        }
        return this.f10693q;
    }

    /* renamed from: c */
    public C3408d mo13608c() {
        if (this.f10685i == null) {
            synchronized (this) {
                C3408d dVar = this.f10685i;
                if (dVar == null) {
                    dVar = new C3408d(this, mo13614h().mo13816b().mo13731K());
                }
                this.f10685i = dVar;
            }
        }
        return this.f10685i;
    }

    /* renamed from: a */
    public void mo13601a(AbstractC3384a aVar) {
        this.f10701y = aVar;
    }

    /* renamed from: a */
    public static void m14087a(String[] strArr) {
        C3373e eVar = f10677b;
        if (eVar == null) {
            C3430b.m14431a(strArr);
            return;
        }
        eVar.f10694r.removeMessages(4);
        eVar.f10694r.obtainMessage(4, strArr).sendToTarget();
    }

    /* renamed from: c */
    private void m14091c(String str) {
        if (this.f10686j.mo13860c(str)) {
            this.f10678a = true;
            m14084a(this.f10689m);
            mo13606a(true);
            m14084a(this.f10691o);
        }
    }

    /* renamed from: a */
    private void m14084a(AbstractC3371c cVar) {
        if (this.f10687k != null && cVar != null) {
            cVar.mo13598h();
            if (Looper.myLooper() == this.f10687k.getLooper()) {
                cVar.mo13597g();
                return;
            }
            this.f10687k.removeMessages(6);
            this.f10687k.sendEmptyMessage(6);
        }
    }

    /* renamed from: c */
    private void m14092c(ArrayList<AbstractC3402b> arrayList) {
        ArrayList<AbstractC3402b> a;
        String[] d = mo13612f().mo13776d();
        if (d != null && d.length > 0 && System.currentTimeMillis() - this.f10695s > 900000 && (a = this.f10682f.mo13809a(arrayList)) != null && a.size() > 0) {
            this.f10687k.obtainMessage(8, a).sendToTarget();
        }
    }

    /* renamed from: d */
    private void m14093d(ArrayList<AbstractC3402b> arrayList) {
        if (C3460i.m14618a()) {
            Iterator<AbstractC3402b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3402b next = it.next();
                String a = C3460i.m14614a(next);
                if (a != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(next.mo13670f());
                    C3460i.m14616a(a, jSONArray);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14085a(AbstractC3402b bVar) {
        int size;
        long j = 0;
        if (bVar.f10780b == 0) {
            C3469r.m14667a((Throwable) null);
        }
        C3373e eVar = f10677b;
        if (eVar == null) {
            C3430b.m14430a(bVar);
            return;
        }
        synchronized (eVar.f10684h) {
            size = eVar.f10684h.size();
            eVar.f10684h.add(bVar);
        }
        if (size % 10 == 0) {
            eVar.f10694r.removeMessages(4);
            Handler handler = eVar.f10694r;
            if (size == 0) {
                j = 300;
            }
            handler.sendEmptyMessageDelayed(4, j);
        }
    }

    /* renamed from: b */
    private void m14090b(ArrayList<AbstractC3402b> arrayList) {
        m14093d(arrayList);
        Collections.sort(arrayList, this);
        ArrayList<AbstractC3402b> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator<AbstractC3402b> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractC3402b next = it.next();
            z2 |= this.f10692p.mo13622a(next, arrayList2);
            if (next instanceof C3416j) {
                z = true;
                z3 = C3378i.m14124a(next);
            }
        }
        m14092c(arrayList2);
        mo13608c().mo13703a(arrayList2);
        if (z) {
            if (z3) {
                this.f10694r.removeMessages(7);
            } else {
                this.f10694r.sendEmptyMessageDelayed(7, this.f10682f.mo13791C());
            }
        }
        if (z2) {
            m14084a(this.f10690n);
        }
    }

    /* renamed from: a */
    private boolean m14088a(ArrayList<AbstractC3402b> arrayList) {
        JSONObject a = C3470s.m14673a(this.f10686j.mo13857b());
        boolean z = true;
        String[] a2 = C3398b.m14191a(this, a, true);
        if (a2.length > 0) {
            int a3 = C3396a.m14174a(a2, C3415i.m14319a(arrayList, a), this.f10682f);
            if (a3 == 200) {
                this.f10695s = 0;
                C3469r.m14665a("sendRealTime, " + z);
                return z;
            } else if (C3396a.m14183a(a3)) {
                this.f10695s = System.currentTimeMillis();
            }
        }
        z = false;
        C3469r.m14665a("sendRealTime, " + z);
        return z;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C3435g gVar = this.f10682f;
                gVar.mo13814a(gVar.mo13789A());
                if (this.f10686j.mo13862e()) {
                    if (this.f10682f.mo13843v()) {
                        HandlerThread b = m14089b("bd_tracker_n");
                        b.start();
                        this.f10687k = new Handler(b.getLooper(), this);
                        this.f10687k.sendEmptyMessage(2);
                        if (this.f10684h.size() > 0) {
                            this.f10694r.removeMessages(4);
                            this.f10694r.sendEmptyMessageDelayed(4, 1000);
                        }
                        C3469r.m14670d("net|worker start", null);
                        break;
                    }
                } else {
                    this.f10694r.removeMessages(1);
                    this.f10694r.sendEmptyMessageDelayed(1, 1000);
                    break;
                }
                break;
            case 2:
                C3376g gVar2 = new C3376g(this);
                this.f10689m = gVar2;
                this.f10698v.add(gVar2);
                C3426k f = mo13612f();
                if (!TextUtils.isEmpty(f.mo13777e())) {
                    C3372d dVar = new C3372d(this);
                    this.f10683g = dVar;
                    this.f10698v.add(dVar);
                }
                C3377h hVar = new C3377h(this);
                this.f10690n = hVar;
                this.f10698v.add(hVar);
                if (!TextUtils.isEmpty(f.mo13779g())) {
                    this.f10698v.add(new C3381j(this));
                }
                mo13613g();
                if (mo13614h().mo13816b().mo13734N()) {
                    if (this.f10686j.mo13878s() == this.f10686j.mo13859c()) {
                        mo13601a(AbstractC3384a.m14147a(this.f10681e));
                    } else {
                        C3372d dVar2 = this.f10683g;
                        if (dVar2 != null) {
                            dVar2.mo13598h();
                        }
                        mo13601a(AbstractC3384a.m14148a(this.f10681e, (JSONObject) null));
                    }
                }
                this.f10687k.removeMessages(6);
                this.f10687k.sendEmptyMessage(6);
                break;
            case 3:
            case 5:
            default:
                C3469r.m14667a((Throwable) null);
                break;
            case 4:
                mo13605a((String[]) message.obj, false);
                break;
            case 6:
                this.f10687k.removeMessages(6);
                long j = 5000;
                if (!this.f10682f.mo13816b().mo13725E() || this.f10692p.mo13626d()) {
                    long j2 = Long.MAX_VALUE;
                    Iterator<AbstractC3371c> it = this.f10698v.iterator();
                    while (it.hasNext()) {
                        AbstractC3371c next = it.next();
                        if (!next.mo13596f()) {
                            long g = next.mo13597g();
                            if (g < j2) {
                                j2 = g;
                            }
                        }
                    }
                    long currentTimeMillis = j2 - System.currentTimeMillis();
                    if (currentTimeMillis <= 5000) {
                        j = currentTimeMillis;
                    }
                }
                this.f10687k.sendEmptyMessageDelayed(6, j);
                if (this.f10700x.size() > 0) {
                    synchronized (this.f10700x) {
                        for (AbstractC3374a aVar : this.f10700x) {
                            if (aVar != null) {
                                aVar.mo13616a();
                            }
                        }
                        this.f10700x.clear();
                    }
                    break;
                }
                break;
            case 7:
                synchronized (this.f10684h) {
                    this.f10684h.add(C3378i.m14126f());
                }
                mo13605a((String[]) null, false);
                break;
            case 8:
                ArrayList<AbstractC3402b> arrayList = (ArrayList) message.obj;
                if (!m14088a(arrayList)) {
                    mo13608c().mo13703a(arrayList);
                    break;
                }
                break;
            case 9:
                AbstractC3371c cVar = this.f10697u;
                if (!cVar.mo13596f()) {
                    long g2 = cVar.mo13597g();
                    if (!cVar.mo13596f()) {
                        this.f10687k.sendEmptyMessageDelayed(9, g2 - System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 10:
                synchronized (this.f10684h) {
                    C3430b.m14429a(this.f10684h);
                }
                mo13605a(C3430b.m14432a(), false);
                break;
            case 11:
                C3370b bVar = this.f10679c;
                if (bVar == null) {
                    C3370b bVar2 = new C3370b(this);
                    this.f10679c = bVar2;
                    this.f10698v.add(bVar2);
                } else {
                    bVar.mo13595a(false);
                }
                m14084a(this.f10679c);
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                Object[] objArr = (Object[]) message.obj;
                m14086a((String) objArr[0], (C3416j) objArr[1]);
                break;
            case 13:
                if (this.f10682f.mo13847z() && this.f10682f.mo13816b().mo13727G() && !TextUtils.isEmpty(mo13612f().mo13778f())) {
                    if (this.f10691o == null) {
                        this.f10691o = new C3369a(this);
                        this.f10698v.add(this.f10691o);
                        m14084a(this.f10691o);
                        break;
                    }
                } else {
                    if (this.f10691o != null) {
                        this.f10691o.mo13595a(true);
                        this.f10698v.remove(this.f10691o);
                        this.f10691o = null;
                    }
                    this.f10686j.mo13877r();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public void mo13602a(C3426k kVar) {
        this.f10693q = kVar;
        m14084a(this.f10689m);
        if (this.f10682f.mo13816b().mo13726F()) {
            mo13606a(true);
        }
    }

    /* renamed from: a */
    private void m14086a(String str, C3416j jVar) {
        m14084a(this.f10690n);
        if (jVar == null && (jVar = C3394a.m14168a()) != null) {
            jVar = (C3416j) jVar.clone();
        }
        ArrayList<AbstractC3402b> arrayList = new ArrayList<>();
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar != null) {
            long j = currentTimeMillis - jVar.f10780b;
            jVar.mo13660a(currentTimeMillis);
            if (j < 0) {
                j = 0;
            }
            jVar.f10831j = j;
            jVar.f10835n = this.f10692p.mo13623b();
            this.f10692p.mo13624b(jVar);
            arrayList.add(jVar);
        }
        m14091c(str);
        if (jVar != null) {
            C3416j jVar2 = (C3416j) jVar.clone();
            jVar2.mo13660a(currentTimeMillis + 1);
            jVar2.f10831j = -1;
            this.f10692p.mo13620a(jVar2, arrayList, true).f10816m = this.f10692p.mo13623b();
            this.f10692p.mo13624b(jVar2);
            arrayList.add(jVar2);
        }
        if (!arrayList.isEmpty()) {
            mo13608c().mo13703a(arrayList);
        }
        m14084a(this.f10690n);
    }

    /* renamed from: a */
    public int compare(AbstractC3402b bVar, AbstractC3402b bVar2) {
        int i = ((bVar.f10780b - bVar2.f10780b) > 0 ? 1 : ((bVar.f10780b - bVar2.f10780b) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public C3373e(Application application, C3435g gVar, C3436h hVar) {
        this.f10681e = application;
        this.f10682f = gVar;
        this.f10686j = hVar;
        this.f10692p = new C3378i(this);
        HandlerThread b = m14089b("bd_tracker_w");
        b.start();
        this.f10694r = new Handler(b.getLooper(), this);
        this.f10686j.mo13848a().mo13903a(this.f10694r);
        if (this.f10682f.mo13827f()) {
            this.f10686j.mo13851a(this.f10682f.mo13828g());
        }
        if (this.f10682f.mo13816b().mo13735O() != null && !this.f10682f.mo13843v()) {
            this.f10702z = this.f10682f.mo13816b().mo13735O();
        }
        this.f10694r.sendEmptyMessage(10);
        if (this.f10682f.mo13815a()) {
            this.f10696t = true;
            this.f10694r.sendEmptyMessage(1);
        }
        f10677b = this;
    }
}
