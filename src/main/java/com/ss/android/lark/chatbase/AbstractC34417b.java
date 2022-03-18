package com.ss.android.lark.chatbase;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.C32805a;
import com.ss.android.lark.chat.base.model.p1602a.AbstractC32919a;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.model.p1602a.C32922c;
import com.ss.android.lark.chat.base.model.p1602a.C32923d;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.ObservableMappedArrayList;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.chatbase.b */
public abstract class AbstractC34417b<T extends AbstractC34006a, PageData extends C33952a<T>> extends AbstractC34432b<String, T, PageData, AbstractC33964i<T>> implements C32920b.AbstractC32921a {

    /* renamed from: a */
    private final List<Integer> f88881a = new ArrayList();

    /* renamed from: b */
    protected ObservableMappedArrayList<String, T> f88882b;

    /* renamed from: c */
    protected volatile int f88883c = Integer.MAX_VALUE;

    /* renamed from: d */
    protected volatile int f88884d = Integer.MIN_VALUE;

    /* renamed from: e */
    protected volatile AtomicInteger f88885e = new AtomicInteger(-1);

    /* renamed from: f */
    protected AbstractC34423e<T> f88886f;

    /* renamed from: g */
    protected AbstractC34420b f88887g;

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.chatbase.b$b */
    public interface AbstractC34420b<T, PageData> {
        /* renamed from: a */
        void mo122953a(T t);

        /* renamed from: a */
        void mo122955a(List<T> list, PageData pagedata);
    }

    /* renamed from: com.ss.android.lark.chatbase.b$c */
    public interface AbstractC34421c<K> {
        /* renamed from: c */
        K mo122976c();

        /* renamed from: d */
        K mo122977d();
    }

    /* renamed from: com.ss.android.lark.chatbase.b$e */
    public interface AbstractC34423e<T> {
        /* renamed from: a */
        void mo123490a();

        /* renamed from: a */
        void mo123491a(List<T> list);
    }

    /* renamed from: com.ss.android.lark.chatbase.b$h */
    public interface AbstractC34426h<K, T> {
        /* renamed from: a */
        AbstractC34421c<K> mo122918a();

        /* renamed from: b */
        AbstractC34432b.AbstractC34434b<T> mo122919b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.chat.entity.message.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    private T m133480i(AbstractC34006a aVar) {
        if (aVar == 0) {
            return null;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo122932a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo122933a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo122939b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo122942c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo122944c(T t);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo122949f(T t) {
    }

    /* renamed from: com.ss.android.lark.chatbase.b$d */
    private static class C34422d<T extends AbstractC34006a> implements ObservableMappedArrayList.AbstractC33947b<String, T> {
        private C34422d() {
        }

        /* renamed from: a */
        public String mo124044a(T t) {
            return t.getId();
        }
    }

    /* renamed from: com.ss.android.lark.chatbase.b$g */
    public static class C34425g implements AbstractC34421c<String> {

        /* renamed from: a */
        private final String f88889a;

        /* renamed from: b */
        public String mo122976c() {
            return null;
        }

        /* renamed from: a */
        public String mo122977d() {
            return this.f88889a;
        }

        public C34425g(String str) {
            this.f88889a = str;
        }
    }

    /* renamed from: e */
    public final int mo127115e() {
        return this.f88883c;
    }

    /* renamed from: f */
    public final int mo127117f() {
        return this.f88884d;
    }

    /* renamed from: j */
    public List<Integer> mo127123j() {
        return this.f88881a;
    }

    /* renamed from: a */
    public void mo127105a(String str, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        mo127102a(new C34425g(str), bVar);
    }

    /* renamed from: a */
    public void mo127102a(AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        this.f88909h.execute(new Runnable(cVar, bVar) {
            /* class com.ss.android.lark.chatbase.$$Lambda$b$m3GdoHUwItW7m2_4Zp7pMCRgCe8 */
            public final /* synthetic */ AbstractC34417b.AbstractC34421c f$1;
            public final /* synthetic */ AbstractC34432b.AbstractC34434b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AbstractC34417b.this.m133474b((AbstractC34417b) this.f$1, (AbstractC34417b.AbstractC34421c) this.f$2);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo127106a(T t, T t2) {
        if (t2.isPreMessage() && !t.isPreMessage()) {
            return false;
        }
        if (!t2.isPreMessage() && t.isPreMessage()) {
            return true;
        }
        if (t2.getUpdateTime() < t.getUpdateTime() || t2.isIntermediateMessage()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.ss.android.lark.chatbase.b<T extends com.ss.android.lark.chat.entity.message.a, PageData extends com.ss.android.lark.chat.core.model.a<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo127104a(String str, C33952a<T> aVar) {
        int size = this.f88882b.size();
        int i = 0;
        int a = size > 0 ? mo122932a((AbstractC34006a) this.f88882b.get(0)) : 0;
        if (size > 0) {
            i = mo122932a((AbstractC34006a) this.f88882b.get(size - 1));
        }
        String c = mo122942c();
        Log.m165389i(c, "DataStore " + str + ", size is:" + aVar.mo124058b().size() + "， current position range:[" + this.f88883c + ", " + this.f88884d + "], current badge range:[" + a + ", " + i + "]");
    }

    /* renamed from: a */
    public void mo122936a(PageData pagedata) {
        this.f88909h.execute(new Runnable(pagedata) {
            /* class com.ss.android.lark.chatbase.$$Lambda$b$k0F82OUFMpryVi3M4jzahbNBpY */
            public final /* synthetic */ C33952a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC34417b.this.mo191042f((AbstractC34417b) this.f$1);
            }
        });
    }

    /* renamed from: d */
    public final AbstractC33964i<T> mo127125l() {
        return this.f88882b;
    }

    /* renamed from: k */
    public Stream<AbstractC34006a> mo127124k() {
        return new PageStoreStream(this, this.f88909h);
    }

    /* renamed from: h */
    public boolean mo127120h() {
        mo127141m();
        if (this.f88882b.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void mo122940b() {
        this.f88882b.clear();
        this.f88881a.clear();
        this.f88883c = Integer.MAX_VALUE;
        this.f88884d = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    public final List<T> mo127118g() {
        this.f88882b.acquireReadAccess();
        ArrayList arrayList = new ArrayList(this.f88882b);
        this.f88882b.releaseReadAccess();
        return arrayList;
    }

    /* renamed from: i */
    public boolean mo127122i() {
        if (this.f88884d == Integer.MIN_VALUE || this.f88883c == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.chatbase.b$a */
    public static class C34419a<T extends AbstractC34006a> implements AbstractC34432b.AbstractC34434b<T> {

        /* renamed from: a */
        T f88888a;

        /* renamed from: a */
        public T doUpdate(T t) {
            return this.f88888a;
        }

        public C34419a(T t) {
            this.f88888a = t;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m133478d(List list) {
        mo122938a((List<AbstractC34426h<String, AbstractC34006a>>) list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133469a(C32923d dVar) {
        mo122938a(dVar.mo121562a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m133477c(Collection collection) {
        mo122938a(C33386b.m129359a(collection));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo122948e(T t) {
        this.f88882b.add(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo127121h(T t) {
        return t.canShow();
    }

    /* renamed from: com.ss.android.lark.chatbase.b$f */
    public static abstract class AbstractC34424f<T extends AbstractC34006a> implements AbstractC34432b.AbstractC34434b<T> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo122923a(T t);

        /* renamed from: b */
        public final T doUpdate(T t) {
            if (t != null) {
                return mo122923a(t);
            }
            return null;
        }
    }

    /* renamed from: g */
    public void mo127119g(AbstractC34006a aVar) {
        this.f88909h.execute(new Runnable(aVar) {
            /* class com.ss.android.lark.chatbase.$$Lambda$b$uPLnvpP_G5EbmlR8kZbuDeFM */
            public final /* synthetic */ AbstractC34006a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC34417b.this.m133482k(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m133482k(AbstractC34006a aVar) {
        mo122938a(C33386b.m129358a(new C33410f(aVar.getMessage()), new C34419a(aVar)));
    }

    /* renamed from: a */
    public T mo127099a(String str) {
        return this.f88882b.getItemByKey(str);
    }

    /* renamed from: j */
    private String m133481j(T t) {
        String str;
        AbstractC34423e<T> eVar;
        List<T> c = m133476c((List) Collections.singletonList(t));
        if (!mo122946d(t)) {
            str = "can not append, skip update ";
        } else if (t.isNoTraceDelete()) {
            str = "noTraceDelete";
        } else {
            str = "add";
            if (CollectionUtils.isNotEmpty(c)) {
                mo122948e(t);
            }
            m133472a(Collections.singletonList(t), (C33952a) null);
            m133470a(str, t);
        }
        if (mo122939b((AbstractC34006a) t) > this.f88883c && (eVar = this.f88886f) != null) {
            eVar.mo123491a(c);
        }
        return str;
    }

    /* renamed from: a */
    public List<T> mo127100a(Collection<String> collection) {
        return this.f88882b.getItemsByKey(collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: PageData extends com.ss.android.lark.chat.core.model.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo127112c(PageData pagedata) {
        mo127141m();
        this.f88882b.beginUpdate();
        mo122940b();
        List<T> c = m133476c((List) pagedata.mo124058b());
        this.f88882b.addAll(c);
        this.f88881a.addAll(pagedata.mo124062d());
        m133472a(c, pagedata);
        m133475b("init", pagedata);
        this.f88882b.finishUpdate();
        mo127104a("init", pagedata);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: PageData extends com.ss.android.lark.chat.core.model.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void mo127108b(PageData pagedata) {
        mo127141m();
        this.f88882b.beginUpdate();
        List<T> c = m133476c((List) pagedata.mo124058b());
        this.f88882b.addAll(c);
        m133472a(c, pagedata);
        m133475b("appendPage", pagedata);
        this.f88882b.finishUpdate();
        mo127104a("appendPage", pagedata);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: PageData extends com.ss.android.lark.chat.core.model.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void mo127103a(PageData pagedata) {
        mo127141m();
        this.f88882b.beginUpdate();
        List<T> c = m133476c((List) pagedata.mo124058b());
        this.f88882b.addAll(0, c);
        m133472a(c, pagedata);
        m133475b("prependPage", pagedata);
        this.f88882b.finishUpdate();
        mo127104a("prependPage", pagedata);
    }

    @Override // com.ss.android.lark.chat.base.model.p1602a.C32920b.AbstractC32921a
    public boolean onAction(AbstractC32919a aVar) {
        if (aVar instanceof C32922c) {
            C32922c cVar = (C32922c) aVar;
            AbstractC34421c<String> a = cVar.mo121561a();
            cVar.mo121563a(this.f88882b.getItemByKey(a.mo122977d(), a.mo122976c()));
            return true;
        } else if (!(aVar instanceof C32923d)) {
            return false;
        } else {
            this.f88909h.execute(new Runnable((C32923d) aVar) {
                /* class com.ss.android.lark.chatbase.$$Lambda$b$J56sIWKrqQnstcyxfdTRsaoGZig */
                public final /* synthetic */ C32923d f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AbstractC34417b.this.m133469a((AbstractC34417b) this.f$1);
                }
            });
            return true;
        }
    }

    /* renamed from: b */
    public void mo127109b(Collection<AbstractC34006a> collection) {
        this.f88909h.execute(new Runnable(collection) {
            /* class com.ss.android.lark.chatbase.$$Lambda$b$og3emg_NzTjOwUfWwxFSUqSHAjQ */
            public final /* synthetic */ Collection f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC34417b.this.m133477c((AbstractC34417b) this.f$1);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo122946d(T t) {
        if (t.isPreMessage()) {
            return true;
        }
        int b = mo122939b((AbstractC34006a) t);
        if (this.f88883c == Integer.MAX_VALUE && this.f88884d == Integer.MIN_VALUE) {
            if (this.f88885e.get() < b) {
                return true;
            }
            return false;
        } else if (b >= this.f88883c && this.f88885e.get() <= this.f88884d) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    private List<T> m133476c(List<T> list) {
        mo127141m();
        if (CollectionUtils.isEmpty(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String id = t.getId();
            if (!mo127121h(t)) {
                String c = mo122942c();
                Log.m165383e(c, "filter invisible item:" + id);
            } else if (t.isNoTraceDelete()) {
                String c2 = mo122942c();
                Log.m165383e(c2, "filter noTraceDelete item:" + id);
            } else {
                if (this.f88882b.containsKey(id, t.getcId())) {
                    String c3 = mo122942c();
                    Log.m165383e(c3, "filter duplicate item:" + id);
                } else {
                    arrayList.add(t);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo127116e(C33952a<T> aVar) {
        if (aVar != null && !CollectionUtils.isEmpty(aVar.mo124058b())) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (T t : aVar.mo124058b()) {
                int b = mo122939b((AbstractC34006a) t);
                i = Math.min(i, b);
                i2 = Math.max(i2, b);
            }
            if (CollectionUtils.isNotEmpty(aVar.mo124060c())) {
                for (Integer num : aVar.mo124060c()) {
                    i = Math.min(i, num.intValue());
                    i2 = Math.max(i2, num.intValue());
                }
            }
            if (i2 >= this.f88883c - 1 && i <= this.f88884d + 1) {
                return true;
            }
            String c = mo122942c();
            Log.m165389i(c, "cur pos range:[" + this.f88883c + ", " + this.f88884d + "], missing msg pos:[" + i + ", " + i2 + "]，abandon result");
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.chatbase.b<T extends com.ss.android.lark.chat.entity.message.a, PageData extends com.ss.android.lark.chat.core.model.a<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void mo122938a(List<AbstractC34426h<String, AbstractC34006a>> list) {
        AbstractC34006a aVar;
        boolean z;
        String str;
        if (!list.isEmpty()) {
            mo127141m();
            Log.m165389i(mo122942c(), "batch update start");
            this.f88882b.beginUpdate();
            for (AbstractC34426h<String, AbstractC34006a> hVar : list) {
                AbstractC34421c<String> a = hVar.mo122918a();
                AbstractC34432b.AbstractC34434b<AbstractC34006a> b = hVar.mo122919b();
                int itemPosByKey = this.f88882b.getItemPosByKey(a.mo122977d(), a.mo122976c());
                if (itemPosByKey > -1) {
                    aVar = (AbstractC34006a) this.f88882b.get(itemPosByKey);
                } else {
                    aVar = null;
                }
                AbstractC34006a i = m133480i(b.doUpdate(aVar));
                if (i != null) {
                    if (aVar != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = m133468a(itemPosByKey, aVar, i);
                    } else {
                        str = m133481j(i);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Log.m165389i(mo122942c(), String.format("%s message： %s", str, i));
                    }
                    AbstractC34420b bVar = this.f88887g;
                    if (bVar != null) {
                        bVar.mo122953a(i);
                    }
                }
            }
            this.f88882b.finishUpdate();
            Log.m165389i(mo122942c(), "batch update end");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.ss.android.lark.chatbase.b<T extends com.ss.android.lark.chat.entity.message.a, PageData extends com.ss.android.lark.chat.core.model.a<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void mo191042f(C33952a aVar) {
        if (mo127116e(aVar)) {
            this.f88882b.beginUpdate();
            int i = 0;
            for (T t : aVar.mo124058b()) {
                int b = mo122939b((AbstractC34006a) t);
                String id = t.getId();
                boolean z = true;
                if (this.f88882b.containsKey(id)) {
                    String c = mo122942c();
                    Log.m165389i(c, "contains missing pos:" + b);
                } else {
                    this.f88883c = Math.min(b, this.f88883c);
                    this.f88884d = Math.max(b, this.f88884d);
                    int i2 = i;
                    while (true) {
                        if (i2 >= this.f88882b.size()) {
                            z = false;
                            break;
                        } else if (mo122939b((AbstractC34006a) this.f88882b.get(i2)) > b) {
                            this.f88882b.add(i2, t);
                            String c2 = mo122942c();
                            Log.m165389i(c2, "insert into:" + i2);
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        this.f88882b.add(t);
                        Log.m165389i(mo122942c(), "insert into last pos");
                        i = this.f88882b.size();
                    }
                }
            }
            for (Integer num : aVar.mo124060c()) {
                this.f88883c = Math.min(num.intValue(), this.f88883c);
                this.f88884d = Math.max(num.intValue(), this.f88884d);
            }
            String c3 = mo122942c();
            Log.m165389i(c3, "Merge Missing Message, cur pos range：[" + this.f88883c + ", " + this.f88884d + "]");
            this.f88882b.finishUpdate();
        }
    }

    /* renamed from: b */
    public void mo127110b(List<AbstractC34426h<String, AbstractC34006a>> list) {
        this.f88909h.execute(new Runnable(list) {
            /* class com.ss.android.lark.chatbase.$$Lambda$b$dTVyslvf054tDmf_JJfXsWaQ1N0 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC34417b.this.m133478d((AbstractC34417b) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo127101a(int i) {
        if (this.f88885e.get() < i) {
            this.f88885e.set(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m133474b(AbstractC34421c cVar, AbstractC34432b.AbstractC34434b bVar) {
        mo122938a(C33386b.m129358a(cVar, bVar));
    }

    /* renamed from: a */
    private void m133472a(List<T> list, PageData pagedata) {
        AbstractC34420b bVar = this.f88887g;
        if (bVar != null) {
            bVar.mo122955a(list, pagedata);
        }
    }

    public AbstractC34417b(AbstractExecutorC33962g gVar, AbstractC34423e eVar) {
        super(gVar);
        this.f88886f = eVar;
        this.f88882b = new ObservableMappedArrayList<String, T>(new C34422d(), true, C26284k.m95185a(C29990c.m110930b().mo134528a())) {
            /* class com.ss.android.lark.chatbase.AbstractC34417b.C344181 */

            public boolean add(T t) {
                AbstractC34417b.this.mo122949f(t);
                return super.add((Object) t);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.chatbase.b */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, com.ss.android.lark.chat.core.model.ObservableMappedArrayList, java.util.ArrayList
            public boolean addAll(Collection<? extends T> collection) {
                Iterator<? extends T> it = collection.iterator();
                while (it.hasNext()) {
                    AbstractC34417b.this.mo122949f((AbstractC34006a) it.next());
                }
                return super.addAll(collection);
            }

            public void add(int i, T t) {
                AbstractC34417b.this.mo122949f(t);
                super.add(i, (Object) t);
            }

            public T set(int i, T t) {
                AbstractC34417b.this.mo122949f(t);
                return (T) ((AbstractC34006a) super.set(i, (Object) t));
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.chatbase.b */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List, java.util.AbstractList, com.ss.android.lark.chat.core.model.ObservableMappedArrayList, java.util.ArrayList
            public boolean addAll(int i, Collection<? extends T> collection) {
                Iterator<? extends T> it = collection.iterator();
                while (it.hasNext()) {
                    AbstractC34417b.this.mo122949f((AbstractC34006a) it.next());
                }
                return super.addAll(i, collection);
            }
        };
        mo122933a();
    }

    /* renamed from: a */
    private void m133470a(String str, T t) {
        if (!t.isPreMessage()) {
            int i = this.f88883c;
            int i2 = this.f88884d;
            int b = mo122939b((AbstractC34006a) t);
            if (this.f88884d == Integer.MIN_VALUE && this.f88883c == Integer.MAX_VALUE) {
                this.f88884d = b;
                this.f88883c = b;
                AbstractC34423e<T> eVar = this.f88886f;
                if (eVar != null) {
                    eVar.mo123490a();
                }
            } else {
                this.f88884d = Math.max(this.f88884d, b);
            }
            Log.m165389i(mo122942c(), String.format("%s [%d-%d] -> [%d-%d]", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f88883c), Integer.valueOf(this.f88884d)));
        }
    }

    /* renamed from: b */
    private void m133475b(String str, C33952a<T> aVar) {
        int i = this.f88883c;
        int i2 = this.f88884d;
        List<T> b = aVar.mo124058b();
        List<Integer> c = aVar.mo124060c();
        for (T t : b) {
            if (!t.isPreMessage()) {
                int b2 = mo122939b((AbstractC34006a) t);
                this.f88884d = Math.max(this.f88884d, b2);
                this.f88883c = Math.min(this.f88883c, b2);
            }
        }
        for (Integer num : c) {
            this.f88884d = Math.max(this.f88884d, num.intValue());
            this.f88883c = Math.min(this.f88883c, num.intValue());
        }
        Log.m165389i(mo122942c(), String.format("%s [%d-%d] -> [%d-%d]", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f88883c), Integer.valueOf(this.f88884d)));
    }

    /* renamed from: a */
    private String m133468a(int i, T t, T t2) {
        boolean z;
        boolean isNoTraceDelete = t2.isNoTraceDelete();
        if (!mo127121h(t2) || C34438a.m133579a(t2.getMessage())) {
            z = false;
        } else {
            z = true;
        }
        if (isNoTraceDelete) {
            if (mo122944c((AbstractC34006a) t2)) {
                this.f88882b.remove(i);
            } else {
                t.setNoTraceDelete(true);
                this.f88882b.set(i, t);
            }
            return "noTraceDelete";
        } else if (!z) {
            this.f88882b.remove(i);
            C32805a.m125891a().mo120930a(t2.getMessage());
            return "remove";
        } else if (mo127106a(t, t2)) {
            this.f88882b.set(i, t2);
            m133472a(Collections.singletonList(t2), (C33952a) null);
            m133470a("update", t2);
            return "update";
        } else {
            return String.format("can not replace, skip update。(%s, %s) - (%s, %s)", Long.valueOf(t.getUpdateTime()), Boolean.valueOf(t.isPreMessage()), Long.valueOf(t2.getUpdateTime()), Boolean.valueOf(t2.isPreMessage()));
        }
    }
}
