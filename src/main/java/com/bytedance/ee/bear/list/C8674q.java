package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.util.share_preference.C57744a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.list.q */
public class C8674q implements AbstractC8651p {

    /* renamed from: a */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8660i>> f23474a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8652a>> f23475b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8657f>> f23476c;

    /* renamed from: d */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8659h>> f23477d;

    /* renamed from: e */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8653b>> f23478e;

    /* renamed from: f */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8654c>> f23479f;

    /* renamed from: g */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8661j>> f23480g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8656e>> f23481h;

    /* renamed from: i */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8655d>> f23482i;

    /* renamed from: j */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8662k>> f23483j;

    /* renamed from: k */
    private final CopyOnWriteArrayList<WeakReference<AbstractC8651p.AbstractC8658g>> f23484k;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.q$a */
    public static final class C8676a {

        /* renamed from: a */
        static C8674q f23485a = new C8674q();
    }

    /* renamed from: f */
    public static AbstractC8651p m36243f() {
        return C8676a.f23485a;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33645a(String str, String str2) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8653b>> it = this.f23478e.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8653b> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo32652a(str, str2);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33646a(String str, String str2, String str3) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8654c>> it = this.f23479f.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8654c> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo32653a(str, str2, str3);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33647a(String str, boolean z) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8658g>> it = this.f23484k.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8658g> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().a_(str, z);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: b */
    public void mo33648b() {
        Iterator<WeakReference<AbstractC8651p.AbstractC8657f>> it = this.f23476c.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8657f> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo32604a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: c */
    public void mo33650c() {
        Iterator<WeakReference<AbstractC8651p.AbstractC8659h>> it = this.f23477d.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8659h> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().F_();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: d */
    public void mo33651d() {
        Iterator<WeakReference<AbstractC8651p.AbstractC8661j>> it = this.f23480g.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8661j> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo33101b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: e */
    public void mo33652e() {
        this.f23474a.clear();
        this.f23475b.clear();
        this.f23476c.clear();
        this.f23477d.clear();
        this.f23478e.clear();
        this.f23479f.clear();
        this.f23480g.clear();
        this.f23481h.clear();
        this.f23482i.clear();
        this.f23483j.clear();
        this.f23484k.clear();
    }

    private C8674q() {
        this.f23474a = new CopyOnWriteArrayList<>();
        this.f23475b = new CopyOnWriteArrayList<>();
        this.f23476c = new CopyOnWriteArrayList<>();
        this.f23477d = new CopyOnWriteArrayList<>();
        this.f23478e = new CopyOnWriteArrayList<>();
        this.f23479f = new CopyOnWriteArrayList<>();
        this.f23480g = new CopyOnWriteArrayList<>();
        this.f23481h = new CopyOnWriteArrayList<>();
        this.f23482i = new CopyOnWriteArrayList<>();
        this.f23483j = new CopyOnWriteArrayList<>();
        this.f23484k = new CopyOnWriteArrayList<>();
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33639a() {
        Iterator<WeakReference<AbstractC8651p.AbstractC8652a>> it = this.f23475b.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8652a> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo32604a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33640a(OfflineDoc offlineDoc) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8656e>> it = this.f23481h.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8656e> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo33299a(offlineDoc);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ee.bear.list.q */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: b */
    public <T> void mo33649b(T t) {
        if (t instanceof AbstractC8651p.AbstractC8660i) {
            m36242a(this.f23474a, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8652a) {
            m36242a(this.f23475b, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8657f) {
            m36242a(this.f23476c, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8659h) {
            m36242a(this.f23477d, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8653b) {
            m36242a(this.f23478e, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8654c) {
            m36242a(this.f23479f, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8661j) {
            m36242a(this.f23480g, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8656e) {
            m36242a(this.f23481h, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8655d) {
            m36242a(this.f23482i, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8662k) {
            m36242a(this.f23483j, t);
        }
        if (t instanceof AbstractC8651p.AbstractC8658g) {
            m36242a(this.f23484k, t);
        }
        C13479a.m54764b("SpaceNotificationServiceImp", "removeListener()...listener" + ((Object) t));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public <T> void mo33642a(T t) {
        if (t instanceof AbstractC8651p.AbstractC8660i) {
            this.f23474a.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8652a) {
            this.f23475b.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8657f) {
            this.f23476c.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8659h) {
            this.f23477d.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8653b) {
            this.f23478e.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8654c) {
            this.f23479f.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8661j) {
            this.f23480g.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8656e) {
            this.f23481h.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8655d) {
            this.f23482i.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8662k) {
            this.f23483j.add(new WeakReference<>(t));
        }
        if (t instanceof AbstractC8651p.AbstractC8658g) {
            this.f23484k.add(new WeakReference<>(t));
        }
        C13479a.m54764b("SpaceNotificationServiceImp", "addListener()...listener = " + ((Object) t));
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33643a(String str) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8662k>> it = this.f23483j.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8662k> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo32651a(str);
            }
        }
    }

    /* renamed from: a */
    private synchronized <T> void m36242a(CopyOnWriteArrayList<WeakReference<T>> copyOnWriteArrayList, T t) {
        int i = -1;
        for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
            if (copyOnWriteArrayList.get(i2).get() == t) {
                i = i2;
            }
        }
        if (i != -1) {
            copyOnWriteArrayList.remove(i);
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33644a(String str, int i) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8655d>> it = this.f23482i.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8655d> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo33300a(str, i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p
    /* renamed from: a */
    public void mo33641a(AbstractC5233x xVar, boolean z, String str) {
        Iterator<WeakReference<AbstractC8651p.AbstractC8660i>> it = this.f23474a.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC8651p.AbstractC8660i> next = it.next();
            if (!(next == null || next.get() == null)) {
                next.get().mo30963a(z);
            }
        }
        C57744a.m224104a().putBoolean("is_grid", z);
        ListAnalysis.m32506a(xVar, str, z);
    }
}
